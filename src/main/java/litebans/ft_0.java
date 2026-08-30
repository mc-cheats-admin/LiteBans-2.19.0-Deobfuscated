package litebans;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.UUID;
import litebans.a_;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.gf_0;
import litebans.hl;
import litebans.i0;
import litebans.iv_0;
import litebans.kR;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

public final class ft_0
extends fS {
    private static /* synthetic */ String[] m;

    public ft_0(@NotNull di_0 di_02) {
        super(di_02, "BanManagerV5", "bm_", 0, 0L, 24, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(@NotNull String string) {
        if (super.c(string)) return true;
        Object object = new String[]{"banmanager5", "banmanager7", "banmanagerv7"};
        if (!lo_0.b((Object[])object, ((String)(object = string)).toLowerCase(Locale.ENGLISH))) return false;
        return true;
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        boolean bl2 = bz.b((CharSequence)string, '7', false, 2, null);
        this.a("bans", a_.h, connection, ch2, bl, bl2);
        this.a("mutes", a_.j, connection, ch2, bl, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(String string, a_ a_2, Connection connection, ch ch2, boolean bl, boolean bl2) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "player_" + string + " INNER JOIN " + this.i() + "players ON " + this.i() + "player_" + string + ".player_id=" + this.i() + "players.id");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            boolean bl3;
            Object object5;
            Throwable throwable2;
            AutoCloseable autoCloseable2;
            AutoCloseable autoCloseable3;
            Object object6 = (PreparedStatement)autoCloseable;
            boolean bl4 = false;
            if (preparedStatement.execute()) {
                autoCloseable3 = preparedStatement.getResultSet();
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    object5 = (ResultSet)autoCloseable2;
                    bl3 = false;
                    while (autoCloseable3.next()) {
                        object4 = autoCloseable3.getString("name");
                        object3 = i0.a(autoCloseable3.getBytes("player_id"));
                        object2 = autoCloseable3.getString("reason");
                        object = i0.a(autoCloseable3.getBytes("actor_id"));
                        long l3 = autoCloseable3.getLong("created") * 1000L;
                        long l5 = autoCloseable3.getLong("expires") * 1000L;
                        String string2 = ((UUID)object3).toString();
                        String string3 = this.a((UUID)object);
                        ew.a(object2);
                        dZ dZ2 = new dZ(a_2, string2, null, (CharSequence)object2, ((UUID)object).toString(), string3, eq_0.f.b(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (kR.a(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c(dZ2);
                            if (a_2 == a_.h) {
                                this.g().incrementAndGet();
                            }
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + string2);
                        }
                        di_0 di_02 = this.h();
                        ew.a(object4);
                        new gf_0(di_02, (String)object4, string2, "#").run();
                    }
                    object5 = iv_0.a;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
            }
            if (bl) {
                this.m().info("Importing IP-bans.. + ");
                autoCloseable3 = connection.prepareStatement("SELECT * FROM " + this.i() + "ip_bans");
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    object5 = (PreparedStatement)autoCloseable2;
                    bl3 = false;
                    if (autoCloseable3.execute()) {
                        object4 = autoCloseable3.getResultSet();
                        object3 = (AutoCloseable)object4;
                        object2 = null;
                        try {
                            object = (ResultSet)object3;
                            boolean bl5 = false;
                            while (object4.next()) {
                                String string4;
                                Object object7;
                                Object object8;
                                if (bl2) {
                                    object8 = this;
                                    object7 = object4.getBytes("ip");
                                    boolean bl6 = false;
                                    string4 = InetAddress.getByAddress((byte[])object7).getHostAddress().toString();
                                } else {
                                    object8 = this;
                                    long l7 = object4.getLong("ip");
                                    boolean bl7 = false;
                                    string4 = "" + (l7 >> 24 & 0xFFL) + '.' + (l7 >> 16 & 0xFFL) + '.' + (l7 >> 8 & 0xFFL) + '.' + (l7 & 0xFFL);
                                }
                                String string5 = string4;
                                object8 = object4.getString("reason");
                                object7 = i0.a(object4.getBytes("actor_id"));
                                fS fS2 = this;
                                long l8 = object4.getLong("created");
                                boolean bl8 = false;
                                long l9 = l8 * 1000L;
                                Object object9 = this;
                                long l10 = object4.getLong("expires");
                                boolean bl9 = false;
                                long l11 = l10 * 1000L;
                                object9 = this.a((UUID)object7);
                                ew.a(object8);
                                dZ dZ3 = new dZ(a_2, null, string5, (CharSequence)object8, ((UUID)object7).toString(), (String)object9, eq_0.f.b(), null, l9, l11, 0, false, true, false, 0L, 27648, null);
                                this.a(ch2, dZ3, this.g(), this.f());
                            }
                            object = iv_0.a;
                        }
                        catch (Throwable throwable4) {
                            object2 = throwable4;
                            throw throwable4;
                        }
                        finally {
                            f_.a((AutoCloseable)object3, (Throwable)object2);
                        }
                    }
                    object5 = iv_0.a;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
            }
            object6 = iv_0.a;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    private static final void a() {
        m = new String[]{"BanManagerV5", "bm_", "banmanager5", "banmanager7", "banmanagerv7", "bans", "mutes", "SELECT * FROM ", "player_", " INNER JOIN ", "players ON ", "player_", ".player_id=", "players.id", "name", "player_id", "reason", "actor_id", "created", "expires", "Ignoring duplicate ban for ", "#", "Importing IP-bans.. + ", "SELECT * FROM ", "ip_bans", "ip", "ip", "reason", "actor_id", "created", "expires"};
    }

    static {
        ft_0.a();
    }
}

