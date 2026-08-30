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

/*
 * Renamed from litebans.fC
 */
public static final class fc_0
extends fS {
    private static /* synthetic */ String[] m;

    public fc_0(@NotNull di_0 di_02) {
        super(di_02, m[0], null, 0, 0L, 28, null);
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
        AutoCloseable autoCloseable2 = connection.prepareStatement(m[1]);
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
                        object = object2.getString(m[2]);
                        String string3 = object2.getString(m[3]);
                        string2 = object2.getString(m[4]);
                        long l3 = object2.getLong(m[5]) * 1000L;
                        long l5 = object2.getLong(m[6]) * 1000L;
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
            object5 = connection.prepareStatement(m[7]);
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
                            string2 = object.getString(m[8]);
                            String string4 = object.getString(m[9]);
                            long l8 = -1L;
                            String string5 = m[10];
                            String string6 = this.b(string2);
                            dZ dZ2 = new dZ(a_.h, string6, string4, m[11], this.b(string5), string5, eq_0.f.b(), null, l7, l8, 0, false, true, false, 0L, 27648, null);
                            this.a(ch2, dZ2, this.g(), this.f());
                            if (string6 == null) continue;
                            di_0 di_02 = this.h();
                            ew.a((Object)string2);
                            new gf_0(di_02, string2, string6, m[12]).run();
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
        m = new String[]{hl.a("\uc009\uc030\uc028\uc02e\uc03d\uc03e\uc03d\uc032\uc02f", -38682532), hl.a("\u3780\u3796\u379f\u3796\u3790\u3787\u37f3\u37f9\u37f3\u3795\u3781\u379c\u379e\u37f3\u37b1\u37b2\u37bd\u37bf\u37ba\u37a0\u37a7\u37f3\u3784\u379b\u3796\u3781\u3796\u37f3\u37a7\u37aa\u37a3\u37b6\u37ee\u37e3", 1649031123), hl.a("\u2f5a\u2f55\u2f59\u2f51", -975753420), hl.a("\u81fb\u81ec\u81e8\u81fa\u81e6\u81e7", -1735491191), hl.a("\u28b0\u28b5\u28bc\u28b8\u28bf", 206317777), hl.a("\u3090\u308d\u3089\u3081", 378679524), hl.a("\u39d6\u39c7\u39cf\u39d2\u39d6\u39cb\u39cf\u39c7", -1315948126), hl.a("\u135e\u1348\u1341\u1348\u134e\u1359\u132d\u1327\u132d\u134b\u135f\u1342\u1340\u132d\u136f\u136c\u1363\u1361\u1364\u137e\u1379\u1364\u137d", -342158579), hl.a("\uccdf\uccd0\uccdc\uccd4", -248001359), hl.a("\u621f\u6212\u6200\u6207\u621a\u6203", -1419287949), hl.a("\udf7e\udf34\udf30\udf2d\udf32\udf2f\udf29\udf38\udf39\udf7e", 1030348637), hl.a("\u8263", -150109632), hl.a("\u1901", -1345316574)};
    }

    static {
        fc_0.a();
    }
}

