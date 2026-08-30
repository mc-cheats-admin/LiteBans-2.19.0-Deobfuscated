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

public static final class fk
extends fS {
    private static /* synthetic */ String[] m;

    public fk(@NotNull di_0 di_02) {
        super(di_02, m[0], m[1], 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a(string, m[2], true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement(m[3] + this.i() + m[4]);
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
                        object4 = autoCloseable3.getString(m[5]);
                        object3 = autoCloseable3.getString(m[6]);
                        object2 = autoCloseable3.getString(m[7]);
                        long l3 = autoCloseable3.getLong(m[8]) * 1000L;
                        long l5 = autoCloseable3.getLong(m[9]) * 1000L;
                        string2 = this.b((String)object4);
                        ew.a(object2);
                        object = new dZ(a_.h, string2, null, (CharSequence)object2, this.b((String)object3), (String)object3, eq_0.f.b(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (kR.a(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c((dZ)object);
                            this.g().incrementAndGet();
                        } else {
                            this.m().warning(m[10] + (String)object4);
                        }
                        if (string2 == null) continue;
                        di_0 di_02 = this.h();
                        ew.a(object4);
                        new gf_0(di_02, (String)object4, string2, m[11]).run();
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
                this.m().info(m[12]);
                autoCloseable3 = connection.prepareStatement(m[13] + this.i() + m[14]);
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
                                String string3 = object4.getString(m[15]);
                                String string4 = object4.getString(m[16]);
                                string2 = object4.getString(m[17]);
                                object = this;
                                long l7 = object4.getLong(m[18]);
                                boolean bl5 = false;
                                long l8 = l7 * 1000L;
                                Object object8 = this;
                                long l9 = object4.getLong(m[19]);
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
        m = new String[]{hl.a("\u70f2\u70d1\u70de\u70fd\u70d1\u70de\u70d1\u70d7\u70d5\u70c2\u70e6\u7084", 711946416), hl.a("\u8770\u877f\u874d", 1763346194), hl.a("\uf8d9\uf8da\uf8d5\uf8d6\uf8da\uf8d5\uf8da\uf8dc\uf8de\uf8c9\uf88f", -1757939525), hl.a("\u67bc\u67aa\u67a3\u67aa\u67ac\u67bb\u67cf\u67c5\u67cf\u67a9\u67bd\u67a0\u67a2\u67cf", 551380975), hl.a("\u91ca\u91c9\u91c6\u91db", -1448439384), hl.a("\u7ffc\u7fff\u7ff0\u7ff0\u7ffb\u7ffa", 2032762782), hl.a("\u8337\u8334\u833b\u833b\u8330\u8331\u830a\u8337\u832c", 1804370773), hl.a("\u3fd4\u3fd7\u3fd8\u3fe9\u3fc4\u3fd3\u3fd7\u3fc5\u3fd9\u3fd8", -2086977610), hl.a("\u7063\u7060\u706f\u705e\u7075\u7068\u706c\u7064", -888573951), hl.a("\u6426\u6425\u642a\u641b\u6421\u643c\u6434\u642d\u6436\u6421\u6437\u641b\u642b\u642a", 57107524), hl.a("\u0f6a\u0f44\u0f4d\u0f4c\u0f51\u0f4a\u0f4d\u0f44\u0f03\u0f47\u0f56\u0f53\u0f4f\u0f4a\u0f40\u0f42\u0f57\u0f46\u0f03\u0f41\u0f42\u0f4d\u0f03\u0f45\u0f4c\u0f51\u0f03", 410849059), hl.a("\u9ea2", 229744257), hl.a("\ub272\ub256\ub24b\ub254\ub249\ub24f\ub252\ub255\ub25c\ub21b\ub272\ub26b\ub216\ub259\ub25a\ub255\ub248\ub215\ub215\ub215", 825864763), hl.a("\u1003\u1015\u101c\u1015\u1013\u1004\u1070\u107a\u1070\u1016\u1002\u101f\u101d\u1070", -760606640), hl.a("\u1c2b\u1c32\u1c1d\u1c20\u1c23\u1c2c\u1c31", 1482955842), hl.a("\u8351\u8352\u835d\u835d\u8356\u8357", -1385725133), hl.a("\ub4b4\ub4b7\ub4b8\ub4b8\ub4b3\ub4b2\ub489\ub4b4\ub4af", -1559579434), hl.a("\ucb13\ucb10\ucb1f\ucb2e\ucb03\ucb14\ucb10\ucb02\ucb1e\ucb1f", 1469500273), hl.a("\u5ef0\u5ef3\u5efc\u5ecd\u5ee6\u5efb\u5eff\u5ef7", -1940824430), hl.a("\u413d\u413e\u4131\u4100\u413a\u4127\u412f\u4136\u412d\u413a\u412c\u4100\u4130\u4131", -83738273)};
    }

    static {
        fk.a();
    }
}

