package litebans;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.UUID;
import litebans.a_;
import litebans.ch;
import litebans.cn;
import litebans.di_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.hl;
import litebans.i0;
import litebans.iv_0;
import litebans.jv_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public static final class fm
extends fS {
    private final byte[] m = i0.a(jv_0.b);
    private static /* synthetic */ String[] n;

    public fm(@NotNull di_0 di_02) {
        super(di_02, n[0], n[1], 0, 0L, 24, null);
    }

    public final byte[] a() {
        return this.m;
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        fm.a(this, connection, bl, ch2, a_.h, null, 16, null);
        fm.a(this, connection, bl, ch2, a_.j, null, 16, null);
        this.a(connection, bl, ch2, a_.c, n[2]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Connection connection, boolean bl, ch ch2, a_ a_2, String string) {
        String string2 = n[3] + this.i() + n[4] + string;
        Object object = this;
        boolean bl2 = false;
        object = (q_0)((fg_0)object).h().a(q_0.class);
        bl2 = false;
        if (((q_0)object).g()) {
            Object object2 = object;
            boolean bl3 = false;
            ((q_0)object2).a((Object)string2);
        }
        object = connection.prepareStatement(string2);
        AutoCloseable autoCloseable = (AutoCloseable)object;
        Throwable throwable = null;
        try {
            Object object3 = (PreparedStatement)autoCloseable;
            boolean bl4 = false;
            if (object.execute()) {
                ResultSet resultSet = object.getResultSet();
                AutoCloseable autoCloseable2 = resultSet;
                Throwable throwable2 = null;
                try {
                    Object object4 = (ResultSet)autoCloseable2;
                    boolean bl5 = false;
                    while (resultSet.next()) {
                        Object object5;
                        String string3;
                        Object object6;
                        long l3;
                        long l5;
                        Object object7;
                        UUID uUID;
                        Object object8;
                        Object object9;
                        Object object10;
                        block29: {
                            boolean bl6;
                            boolean bl7;
                            int n = resultSet.getInt(fm.n[5]);
                            object10 = this;
                            ew.a(resultSet);
                            object9 = resultSet;
                            boolean bl8 = false;
                            byte[] byArray = object9.getBytes(fm.n[6]);
                            Object object11 = null;
                            Object object12 = byArray;
                            boolean bl9 = false;
                            if (object12 != null && ((byte[])object12).length == 16) {
                                object12 = byArray;
                                ew.a(object12);
                                object11 = i0.a((byte[])object12);
                            }
                            if (object11 == null || ew.a(object11, cn.c())) {
                                byArray = object9.getBytes(fm.n[7]);
                                object12 = byArray;
                                bl9 = false;
                                if (object12 != null && ((Object)object12).length == 16) {
                                    object12 = byArray;
                                    ew.a(object12);
                                    object11 = i0.a((byte[])object12);
                                }
                            }
                            object12 = (fg_0)object10;
                            bl9 = false;
                            object12 = (q_0)((fg_0)object12).h().a(q_0.class);
                            bl9 = false;
                            if (((q_0)object12).g()) {
                                object8 = object12;
                                bl7 = false;
                                ((q_0)object8).a((Object)(fm.n[8] + object11));
                            }
                            uUID = object11;
                            object9 = this;
                            object7 = resultSet;
                            boolean bl10 = false;
                            object12 = object11 = (Object)object7.getBytes(fm.n[9]);
                            bl9 = false;
                            object8 = object12;
                            bl7 = false;
                            if (!(object8 != null && ((Object)object8).length == 16)) {
                                object11 = ((fm)object9).a();
                            }
                            object12 = object11;
                            ew.a(object12);
                            object10 = i0.a((byte[])object12);
                            object9 = null;
                            if (bl) {
                                byte[] byArray2;
                                object7 = this;
                                ResultSet resultSet2 = resultSet;
                                boolean bl11 = false;
                                object12 = null;
                                if (n != 0 && (byArray2 = resultSet2.getBytes(fm.n[10])).length >= 4) {
                                    object8 = (fS)object7;
                                    ew.a(byArray2);
                                    byte[] byArray3 = byArray2;
                                    bl6 = false;
                                    object12 = InetAddress.getByAddress(byArray3).getHostAddress().toString();
                                }
                                object9 = object12;
                            }
                            object7 = resultSet.getString(fm.n[11]);
                            l5 = resultSet.getLong(fm.n[12]) * (long)1000;
                            l3 = resultSet.getLong(fm.n[13]) * (long)1000;
                            object6 = this;
                            bl6 = false;
                            if (uUID == null) {
                                string3 = null;
                            } else {
                                object5 = connection.prepareStatement(fm.n[14] + ((fS)object6).i() + fm.n[15]);
                                AutoCloseable autoCloseable3 = (AutoCloseable)object5;
                                Throwable throwable3 = null;
                                try {
                                    Object object13 = (PreparedStatement)autoCloseable3;
                                    boolean bl12 = false;
                                    object5.setBytes(1, i0.a(uUID));
                                    object5.execute();
                                    ResultSet resultSet3 = object5.getResultSet();
                                    if (resultSet3 != null && resultSet3.next()) {
                                        String string4 = resultSet3.getString(1);
                                        string3 = string4;
                                        break block29;
                                    }
                                    object13 = iv_0.a;
                                }
                                catch (Throwable throwable4) {
                                    throwable3 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    f_.a(autoCloseable3, throwable3);
                                }
                                string3 = null;
                            }
                        }
                        object8 = string3;
                        ew.a(object7);
                        object6 = object7;
                        String string5 = this.a((UUID)object10);
                        object5 = object9;
                        fS.a(this, ch2, (String)object8, (String)object6, l5, l3, string5, uUID, (UUID)object10, (String)object5, null, a_2, 512, null);
                    }
                    object4 = iv_0.a;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
            }
            object3 = iv_0.a;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    static /* synthetic */ void a(fm fm2, Connection connection, boolean bl, ch ch2, a_ a_2, String string, int n, Object object) {
        if ((n & 0x10) != 0) {
            String string2 = a_2.a().name();
            string = string2.toLowerCase(Locale.ENGLISH);
        }
        fm2.a(connection, bl, ch2, a_2, string);
    }

    private static final void c() {
        n = new String[]{hl.a("\uca84\ucaa1\ucaaa\ucaad\ucaba\ucabc\ucab1\uca8a\ucaa9\ucaa6\ucabb", 304466632), hl.a("\ucb1d\ucb18\ucb13\ucb14\ucb03\ucb05\ucb08\ucb13\ucb10\ucb1f\ucb02\ucb2e", -693384335), hl.a("\u1b06\u1b10\u1b03\u1b1f\u1b02", 331422577), hl.a("!7>71&RXR4 =?R", 27000946), hl.a("\ufaf4\ufae5\ufae5\ufaf9\ufafc\ufaf6\ufaf4\ufaf7\ufaf9\ufaf0\ufaca", -383583595), hl.a("\u895a\u8945\u894f\u8958\u8945\u8941\u8973\u8958\u8955\u895c\u8949", 1624803628), hl.a("\ufb78\ufb67\ufb6d\ufb7a\ufb67\ufb63\ufb51\ufb7b\ufb7b\ufb67\ufb6a", -408683762), hl.a("\u2d46\u2d46\u2d5a\u2d57", -1371394765), hl.a("\u8dea\u8df5\u8dff\u8de8\u8df5\u8df1\u8da6\u8dbc", -1449357924), hl.a("\u656e\u6571\u6564\u6573\u6560\u6575\u656e\u6573", -1966512895), hl.a("\u0584\u0581\u0581\u0597\u0580\u0596\u0596", 670893541), hl.a("\u6722\u6735\u6731\u6723\u673f\u673e", 1604544336), hl.a("\ue468\ue46f\ue47a\ue469\ue46f", 1378870299), hl.a("\u5620\u562b\u5621", 365778501), hl.a("\u6fe2\u6ff4\u6ffd\u6ff4\u6ff2\u6fe5\u6f91\u6fdf\u6fd0\u6fdc\u6fd4\u6f91\u6ff7\u6fe3\u6ffe\u6ffc\u6f91", 569667505), hl.a("\u56ea\u56e7\u56f2\u56e3\u56f5\u56f2\u56d9\u56e8\u56e7\u56eb\u56e3\u56f5\u56a6\u56d1\u56ce\u56c3\u56d4\u56c3\u56a6\u56f3\u56f3\u56ef\u56e2\u56bb\u56b9", -277850490), hl.a("\uaa25\uaa20\uaa20\uaa36\uaa21\uaa37\uaa37", 1348512324), hl.a("\ua53b\ua524\ua52e\ua539\ua524\ua520\ua512\ua538\ua538\ua524\ua529", -1903385267), hl.a("\ud7f1\ud7f1\ud7ed\ud7e0", 1298585476), hl.a("\u743b\u7424\u742e\u7439\u7424\u7420\u7477\u746d", 331314253), hl.a("\u85c9\u85d6\u85c3\u85d4\u85c7\u85d2\u85c9\u85d4", 1569162662), hl.a("\u9a62\u9a74\u9a7d\u9a74\u9a72\u9a65\u9a11\u9a5f\u9a50\u9a5c\u9a54\u9a11\u9a77\u9a63\u9a7e\u9a7c\u9a11", -800875983), hl.a("\u9d70\u9d7d\u9d68\u9d79\u9d6f\u9d68\u9d43\u9d72\u9d7d\u9d71\u9d79\u9d6f\u9d3c\u9d4b\u9d54\u9d59\u9d4e\u9d59\u9d3c\u9d69\u9d69\u9d75\u9d78\u9d21\u9d23", -200106724)};
    }

    static {
        fm.c();
    }
}

