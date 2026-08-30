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

/*
 * Renamed from litebans.fT
 */
public static final class ft_0
extends fS {
    private static /* synthetic */ String[] m;

    public ft_0(@NotNull di_0 di_02) {
        super(di_02, m[0], m[1], 0, 0L, 24, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(@NotNull String string) {
        if (super.c(string)) return true;
        Object object = new String[]{m[2], m[3], m[4]};
        if (!lo_0.b((Object[])object, ((String)(object = string)).toLowerCase(Locale.ENGLISH))) return false;
        return true;
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        boolean bl2 = bz.b((CharSequence)string, '7', false, 2, null);
        this.a(m[5], a_.h, connection, ch2, bl, bl2);
        this.a(m[6], a_.j, connection, ch2, bl, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(String string, a_ a_2, Connection connection, ch ch2, boolean bl, boolean bl2) {
        PreparedStatement preparedStatement = connection.prepareStatement(m[7] + this.i() + m[8] + string + m[9] + this.i() + m[10] + this.i() + m[11] + string + m[12] + this.i() + m[13]);
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
                        object4 = autoCloseable3.getString(m[14]);
                        object3 = i0.a(autoCloseable3.getBytes(m[15]));
                        object2 = autoCloseable3.getString(m[16]);
                        object = i0.a(autoCloseable3.getBytes(m[17]));
                        long l3 = autoCloseable3.getLong(m[18]) * 1000L;
                        long l5 = autoCloseable3.getLong(m[19]) * 1000L;
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
                            this.m().warning(m[20] + string2);
                        }
                        di_0 di_02 = this.h();
                        ew.a(object4);
                        new gf_0(di_02, (String)object4, string2, m[21]).run();
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
                this.m().info(m[22]);
                autoCloseable3 = connection.prepareStatement(m[23] + this.i() + m[24]);
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
                                    object7 = object4.getBytes(m[25]);
                                    boolean bl6 = false;
                                    string4 = InetAddress.getByAddress((byte[])object7).getHostAddress().toString();
                                } else {
                                    object8 = this;
                                    long l7 = object4.getLong(m[26]);
                                    boolean bl7 = false;
                                    string4 = "" + (l7 >> 24 & 0xFFL) + '.' + (l7 >> 16 & 0xFFL) + '.' + (l7 >> 8 & 0xFFL) + '.' + (l7 & 0xFFL);
                                }
                                String string5 = string4;
                                object8 = object4.getString(m[27]);
                                object7 = i0.a(object4.getBytes(m[28]));
                                fS fS2 = this;
                                long l8 = object4.getLong(m[29]);
                                boolean bl8 = false;
                                long l9 = l8 * 1000L;
                                Object object9 = this;
                                long l10 = object4.getLong(m[30]);
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
        m = new String[]{hl.a("\u8523\u8500\u850f\u852c\u8500\u850f\u8500\u8506\u8504\u8513\u8537\u8554", 10454369), hl.a("\u208e\u2081\u20b3", -9756436), hl.a("\uae8f\uae8c\uae83\uae80\uae8c\uae83\uae8c\uae8a\uae88\uae9f\uaed8", 892907245), hl.a("\u8844\u8847\u8848\u884b\u8847\u8848\u8847\u8841\u8843\u8854\u8811", 684886054), hl.a("\u1ae9\u1aea\u1ae5\u1ae6\u1aea\u1ae5\u1aea\u1aec\u1aee\u1af9\u1afd\u1abc", 546183819), hl.a("\u055e\u055d\u0552\u054f", -2125134532), hl.a("\ud662\ud67a\ud67b\ud66a\ud67c", 423679503), hl.a("\u66af\u66b9\u66b0\u66b9\u66bf\u66a8\u66dc\u66d6\u66dc\u66ba\u66ae\u66b3\u66b1\u66dc", -1644271876), hl.a("\ud55d\ud541\ud54c\ud554\ud548\ud55f\ud572", 638637357), hl.a("\u20e8\u2081\u2086\u2086\u208d\u209a\u20e8\u2082\u2087\u2081\u2086\u20e8", 1249190088), hl.a("\u1b2b\u1b37\u1b3a\u1b22\u1b3e\u1b29\u1b28\u1b7b\u1b14\u1b15\u1b7b", 2127502171), hl.a("\u8026\u803a\u8037\u802f\u8033\u8024\u8009", -1127645098), hl.a("\u5447\u5419\u5405\u5408\u5410\u540c\u541b\u5436\u5400\u540d\u5454", -1708960663), hl.a("\u2d07\u2d1b\u2d16\u2d0e\u2d12\u2d05\u2d04\u2d59\u2d1e\u2d13", -859296393), hl.a("\ub0e7\ub0e8\ub0e4\ub0ec", -1008422775), hl.a("\ucb46\ucb5a\ucb57\ucb4f\ucb53\ucb44\ucb69\ucb5f\ucb52", 1028442934), hl.a("\u9c53\u9c44\u9c40\u9c52\u9c4e\u9c4f", -691364831), hl.a("\ue176\ue174\ue163\ue178\ue165\ue148\ue17e\ue173", -1269374697), hl.a("\ud1fc\ud1ed\ud1fa\ud1fe\ud1eb\ud1fa\ud1fb", 554029471), hl.a("\ue255\ue248\ue240\ue259\ue242\ue255\ue243", 918741552), hl.a("\u8390\u83be\u83b7\u83b6\u83ab\u83b0\u83b7\u83be\u83f9\u83bd\u83ac\u83a9\u83b5\u83b0\u83ba\u83b8\u83ad\u83bc\u83f9\u83bb\u83b8\u83b7\u83f9\u83bf\u83b6\u83ab\u83f9", 176849881), hl.a("\uf6c8", -495585557), hl.a("\u8e08\u8e2c\u8e31\u8e2e\u8e33\u8e35\u8e28\u8e2f\u8e26\u8e61\u8e08\u8e11\u8e6c\u8e23\u8e20\u8e2f\u8e32\u8e6f\u8e6f\u8e6f", -1595240895), hl.a("\u0b91\u0b87\u0b8e\u0b87\u0b81\u0b96\u0be2\u0be8\u0be2\u0b84\u0b90\u0b8d\u0b8f\u0be2", -896922686), hl.a("\u17d3\u17ca\u17e5\u17d8\u17db\u17d4\u17c9", 1630672826), hl.a("\ue5b8\ue5a1", 447407569), hl.a("\u1f71\u1f68", 803413784), hl.a("\ub08e\ub099\ub09d\ub08f\ub093\ub092", -1282690820), hl.a("\u0898\u089a\u088d\u0896\u088b\u08a6\u0890\u089d", 319162617), hl.a("\u062d\u063c\u062b\u062f\u063a\u062b\u062a", 310773326), hl.a("\u6af1\u6aec\u6ae4\u6afd\u6ae6\u6af1\u6ae7", -1305318764)};
    }

    static {
        ft_0.a();
    }
}

