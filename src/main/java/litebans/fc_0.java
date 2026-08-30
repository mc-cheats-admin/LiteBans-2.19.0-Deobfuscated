package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import litebans.a_;
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
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fc_0
extends fS {
    private static /* synthetic */ String[] m;

    public fc_0(@NotNull di_0 di_02) {
        super(di_02, "Ultrabans", null, 0, 0L, 28, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        String string2;
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        AutoCloseable autoCloseable;
        boolean bl3;
        Object object4;
        boolean bl4;
        Object object5;
        AutoCloseable autoCloseable2 = connection.prepareStatement("SELECT * FROM banlist WHERE type=0");
        Throwable throwable = null;
        try {
            object5 = (PreparedStatement)autoCloseable2;
            bl4 = false;
            if (object5.execute()) {
                object4 = object5.getResultSet();
                bl3 = false;
                autoCloseable = (AutoCloseable)object4;
                Throwable throwable2 = null;
                try {
                    object3 = (ResultSet)autoCloseable;
                    boolean bl5 = false;
                    while (object4.next()) {
                        object2 = object4;
                        bl2 = false;
                        object = object2.getString("name");
                        String string3 = object2.getString("reason");
                        string2 = object2.getString("admin");
                        long l3 = object2.getLong("time") * 1000L;
                        long l5 = object2.getLong("temptime") * 1000L;
                        fS fS2 = this;
                        ew.a((Object)string3);
                        fS.a(fS2, ch2, (String)object, string3, l3, l5, string2, null, null, null, null, null, 1984, null);
                    }
                    object3 = iv_0.a;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    f_.a(autoCloseable, throwable2);
                }
            }
            object5 = iv_0.a;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            f_.a(autoCloseable2, throwable);
        }
        if (bl) {
            object5 = this;
            bl4 = false;
            long l7 = w.a((w)((fg_0)object5).h().a(w.class), false, 1, null);
            object5 = connection.prepareStatement("SELECT * FROM banlistip");
            Throwable throwable5 = null;
            try {
                object4 = (PreparedStatement)object5;
                bl3 = false;
                if (object4.execute()) {
                    autoCloseable = object4.getResultSet();
                    boolean bl6 = false;
                    object3 = autoCloseable;
                    Throwable throwable6 = null;
                    try {
                        object2 = (ResultSet)object3;
                        bl2 = false;
                        while (autoCloseable.next()) {
                            object = autoCloseable;
                            boolean bl7 = false;
                            string2 = object.getString("name");
                            String string4 = object.getString("lastip");
                            long l8 = -1L;
                            String string5 = "#imported#";
                            String string6 = this.b(string2);
                            dZ dZ2 = new dZ(a_.h, string6, string4, "#", this.b(string5), string5, eq_0.f.b(), null, l7, l8, 0, false, true, false, 0L, 27648, null);
                            this.a(ch2, dZ2, this.g(), this.f());
                            if (string6 == null) continue;
                            di_0 di_02 = this.h();
                            ew.a((Object)string2);
                            new gf_0(di_02, string2, string6, "#").run();
                        }
                        object2 = iv_0.a;
                    }
                    catch (Throwable throwable7) {
                        throwable6 = throwable7;
                        throw throwable7;
                    }
                    finally {
                        f_.a((AutoCloseable)object3, throwable6);
                    }
                }
                object4 = iv_0.a;
            }
            catch (Throwable throwable8) {
                throwable5 = throwable8;
                throw throwable8;
            }
            finally {
                f_.a((AutoCloseable)object5, throwable5);
            }
        }
    }

    private static final void a() {
        m = new String[]{"Ultrabans", "SELECT * FROM banlist WHERE type=0", "name", "reason", "admin", "time", "temptime", "SELECT * FROM banlistip", "name", "lastip", "#imported#", "#", "#"};
    }

    static {
        fc_0.a();
    }
}

