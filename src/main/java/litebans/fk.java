package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import litebans.iv_0;
import litebans.kR;
import org.jetbrains.annotations.NotNull;

public final class fk
extends fS {
    private static /* synthetic */ String[] m;

    public fk(@NotNull di_0 di_02) {
        super(di_02, "BanManagerV4", "bm_", 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a(string, "banmanager4", true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "bans");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object;
            String string2;
            Object object2;
            Object object3;
            Object object4;
            boolean bl2;
            Object object5;
            Throwable throwable2;
            AutoCloseable autoCloseable2;
            AutoCloseable autoCloseable3;
            Object object6 = (PreparedStatement)autoCloseable;
            boolean bl3 = false;
            if (preparedStatement.execute()) {
                autoCloseable3 = preparedStatement.getResultSet();
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    object5 = (ResultSet)autoCloseable2;
                    bl2 = false;
                    while (autoCloseable3.next()) {
                        object4 = autoCloseable3.getString("banned");
                        object3 = autoCloseable3.getString("banned_by");
                        object2 = autoCloseable3.getString("ban_reason");
                        long l3 = autoCloseable3.getLong("ban_time") * 1000L;
                        long l5 = autoCloseable3.getLong("ban_expires_on") * 1000L;
                        string2 = this.b((String)object4);
                        ew.a(object2);
                        object = new dZ(a_.h, string2, null, (CharSequence)object2, this.b((String)object3), (String)object3, eq_0.f.b(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (kR.a(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c((dZ)object);
                            this.g().incrementAndGet();
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + (String)object4);
                        }
                        if (string2 == null) continue;
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
                    bl2 = false;
                    if (autoCloseable3.execute()) {
                        object4 = autoCloseable3.getResultSet();
                        object3 = (AutoCloseable)object4;
                        object2 = null;
                        try {
                            Object object7 = (ResultSet)object3;
                            boolean bl4 = false;
                            while (object4.next()) {
                                String string3 = object4.getString("banned");
                                String string4 = object4.getString("banned_by");
                                string2 = object4.getString("ban_reason");
                                object = this;
                                long l7 = object4.getLong("ban_time");
                                boolean bl5 = false;
                                long l8 = l7 * 1000L;
                                Object object8 = this;
                                long l9 = object4.getLong("ban_expires_on");
                                boolean bl6 = false;
                                long l10 = l9 * 1000L;
                                ew.a((Object)string2);
                                object8 = new dZ(a_.h, null, string3, string2, this.b(string4), string4, eq_0.f.b(), null, l8, l10, 0, false, true, false, 0L, 27648, null);
                                this.a(ch2, (dZ)object8, this.g(), this.f());
                            }
                            object7 = iv_0.a;
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
        m = new String[]{"BanManagerV4", "bm_", "banmanager4", "SELECT * FROM ", "bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on", "Ignoring duplicate ban for ", "#", "Importing IP-bans.. + ", "SELECT * FROM ", "ip_bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on"};
    }

    static {
        fk.a();
    }
}

