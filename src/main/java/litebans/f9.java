package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.UUID;
import litebans.a_;
import litebans.bK;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.gf_0;
import litebans.hl;
import litebans.iv_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class f9
extends fS {
    private static /* synthetic */ String[] m;

    public f9(@NotNull di_0 di_02) {
        super(di_02, "BungeeAdminTools", "BAT_", 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a(string, "BAT", true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "ban WHERE ban_state=1");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl2 = false;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean bl3 = false;
                while (resultSet.next()) {
                    Object object3;
                    try {
                        Object object4;
                        String string2;
                        Object object5;
                        Object object6;
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        Object object11;
                        boolean bl4;
                        String string3 = resultSet.getString("UUID");
                        object3 = null;
                        String string4 = null;
                        String string5 = null;
                        string5 = resultSet.getString("ban_ip");
                        boolean bl5 = string5 != null && ((CharSequence)string5).length() > 0 ? true : (bl4 = false);
                        if (string3 != null) {
                            object3 = bK.c.e(string3);
                            try {
                                object11 = connection.prepareStatement("SELECT " + this.i() + "player,lastip FROM " + this.i() + "players WHERE UUID=? ORDER BY lastlogin DESC LIMIT 1");
                                object10 = (AutoCloseable)object11;
                                object9 = null;
                                try {
                                    object8 = (PreparedStatement)object10;
                                    boolean bl6 = false;
                                    object11.setString(1, string3);
                                    ResultSet resultSet2 = object11.executeQuery();
                                    object7 = resultSet2;
                                    object6 = null;
                                    try {
                                        object5 = (ResultSet)object7;
                                        boolean bl7 = false;
                                        if (resultSet2.next()) {
                                            string4 = resultSet2.getString(this.i() + "player");
                                            string5 = resultSet2.getString("lastip");
                                        }
                                        object5 = iv_0.a;
                                    }
                                    catch (Throwable throwable3) {
                                        object6 = throwable3;
                                        throw throwable3;
                                    }
                                    finally {
                                        f_.a((AutoCloseable)object7, (Throwable)object6);
                                    }
                                    object8 = iv_0.a;
                                }
                                catch (Throwable throwable4) {
                                    object9 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    f_.a((AutoCloseable)object10, (Throwable)object9);
                                }
                            }
                            catch (Exception exception) {
                                object10 = this;
                                boolean bl8 = false;
                                ((w)((fg_0)object10).h().a(w.class)).a(exception);
                            }
                        }
                        if (string4 == null && object3 != null) {
                            string4 = this.a(UUID.fromString((String)object3));
                        }
                        object11 = resultSet.getString("ban_staff");
                        object10 = null;
                        if (object11 != null) {
                            try {
                                PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT UUID FROM " + this.i() + "players WHERE " + this.i() + "player=? ORDER BY lastlogin DESC LIMIT 1");
                                object8 = preparedStatement2;
                                Throwable throwable5 = null;
                                try {
                                    Object object12 = (PreparedStatement)object8;
                                    boolean bl9 = false;
                                    preparedStatement2.setString(1, (String)object11);
                                    object6 = preparedStatement2.executeQuery();
                                    object5 = (AutoCloseable)object6;
                                    Throwable throwable6 = null;
                                    try {
                                        Object object13 = object5;
                                        boolean bl10 = false;
                                        if (object6.next()) {
                                            object10 = bK.c.e(object6.getString("UUID"));
                                        }
                                        object13 = iv_0.a;
                                    }
                                    catch (Throwable throwable7) {
                                        throwable6 = throwable7;
                                        throw throwable7;
                                    }
                                    finally {
                                        f_.a((AutoCloseable)object5, throwable6);
                                    }
                                    object12 = iv_0.a;
                                }
                                catch (Throwable throwable8) {
                                    throwable5 = throwable8;
                                    throw throwable8;
                                }
                                finally {
                                    f_.a((AutoCloseable)object8, throwable5);
                                }
                            }
                            catch (Exception exception) {
                                object8 = this;
                                boolean bl11 = false;
                                ((w)((fg_0)object8).h().a(w.class)).a(exception);
                            }
                        }
                        if ((string2 = resultSet.getString("ban_reason")) == null) {
                            string2 = "";
                        }
                        object9 = string2;
                        fg_0 fg_02 = this;
                        boolean bl12 = false;
                        o o2 = (o)fg_02.h().a(o.class);
                        ew.a(resultSet);
                        fg_02 = this;
                        bl12 = false;
                        object8 = o2.a(resultSet, "ban_begin", false, ((q_0)fg_02.h().a(q_0.class)).f().aF());
                        long l3 = ((Date)object8).getTime();
                        object6 = this;
                        boolean bl13 = false;
                        o o3 = (o)((fg_0)object6).h().a(o.class);
                        object6 = this;
                        bl13 = false;
                        object7 = o3.a(resultSet, "ban_end", false, ((q_0)((fg_0)object6).h().a(q_0.class)).f().aF());
                        long l5 = ((Date)object7).getTime();
                        if (resultSet.getTimestamp("ban_end") == null) {
                            l5 = -1L;
                        }
                        if (bl4 || kR.a(ch2, (String)object3, null, null, false, false, 30, null) == null) {
                            CharSequence charSequence = (CharSequence)object9;
                            Object object14 = object10;
                            if (object14 == null) {
                                object14 = "#";
                            }
                            dZ dZ2 = new dZ(a_.h, (String)object3, string5, charSequence, (String)object14, (String)object11, eq_0.f.b(), null, l3, l5, 0, false, bl4, false, 0L, 27648, null);
                            ch2.c(dZ2);
                            object4 = bl4 ? this.f().incrementAndGet() : this.g().incrementAndGet();
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + (String)object3);
                            object4 = iv_0.a;
                        }
                        if (string4 == null || object3 == null) continue;
                        new gf_0(this.h(), string4, (String)object3, "#").run();
                    }
                    catch (Exception exception) {
                        object3 = this;
                        boolean bl14 = false;
                        ((w)((fg_0)object3).h().a(w.class)).a(exception);
                    }
                }
                object2 = iv_0.a;
            }
            catch (Throwable throwable9) {
                throwable2 = throwable9;
                throw throwable9;
            }
            finally {
                f_.a(autoCloseable2, throwable2);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable10) {
            throwable = throwable10;
            throw throwable10;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    private static final void a() {
        m = new String[]{"BungeeAdminTools", "BAT_", "BAT", "SELECT * FROM ", "ban WHERE ban_state=1", "UUID", "ban_ip", "SELECT ", "player,lastip FROM ", "players WHERE UUID=? ORDER BY lastlogin DESC LIMIT 1", "player", "lastip", "ban_staff", "SELECT UUID FROM ", "players WHERE ", "player=? ORDER BY lastlogin DESC LIMIT 1", "UUID", "ban_reason", "", "ban_begin", "ban_end", "ban_end", "#", "Ignoring duplicate ban for ", "#"};
    }

    static {
        f9.a();
    }
}

