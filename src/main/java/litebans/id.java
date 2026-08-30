package litebans;

import java.io.Closeable;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import litebans.aJ;
import litebans.am;
import litebans.bt_0;
import litebans.bz;
import litebans.ch;
import litebans.eG;
import litebans.ew;
import litebans.f_;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kL;
import litebans.m_0;
import litebans.n_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class id {
    private static /* synthetic */ String[] a;

    private id() {
    }

    public final ThreadLocal a() {
        return m_0.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(@NotNull w w2) {
        File file;
        boolean bl;
        Object object;
        Object object2;
        boolean bl2;
        eG eG2 = w2.p().f();
        String string = eG2.q();
        boolean bl3 = bl2 = bz.c((CharSequence)string, ':', false, 2, null) || ew.a((Object)string, (Object)a[0]) || ew.a((Object)string, (Object)a[1]);
        if (bl2) {
            object2 = w2.a.getDataFolder();
            object = a[2];
            bl = false;
            string = new File((File)object2, (String)object).getPath();
        }
        if ((file = new File(string)).exists()) {
            block21: {
                object2 = w2;
                object = a[3];
                bl = false;
                ((n_0)object2).a.getLogger().info((String)object);
                object2 = new w(w2.a);
                ((w)object2).a(false);
                ((w)object2).e();
                eG2.c(a[4]);
                w2.k().b(a[5]);
                w2.a(w2.p());
                w.a(w2, 0L, false, false, false, 15, null);
                object = w2;
                bl = false;
                try {
                    ch ch2 = ((w)object).f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (ch)closeable;
                        boolean bl4 = false;
                        ch ch3 = ch2;
                        boolean bl5 = false;
                        AutoCloseable autoCloseable = ((w)object2).c();
                        Throwable throwable2 = null;
                        try {
                            Object object4 = (Connection)autoCloseable;
                            boolean bl6 = false;
                            if (object4 == null) {
                            } else {
                                kL[] kLArray = kL.values();
                                boolean bl7 = false;
                                int n = kLArray.length;
                                for (int i = 0; i < n; ++i) {
                                    kL kL2;
                                    kL kL3 = kL2 = kLArray[i];
                                    boolean bl8 = false;
                                    ch3.a((Connection)object4, kL3, true);
                                }
                                long l3 = ch3.c();
                                Object object5 = ch3.e().y();
                                Object object6 = am.cL.a(a[6], (Object)l3);
                                boolean bl9 = false;
                                fo_0.a(fg_0.a, (jv_0)object5, (CharSequence)object6, null, 4, null);
                                object4.close();
                                ((w)object2).c();
                                if (file.exists()) {
                                    object6 = file.getParentFile();
                                    String string2 = file.getName() + a[7];
                                    boolean bl10 = false;
                                    object5 = new File((File)object6, string2);
                                    if (file.renameTo((File)object5)) {
                                        object6 = w2;
                                        string2 = a[8] + file.getName() + a[9] + ((File)object5).getName();
                                        bl10 = false;
                                        ((n_0)object6).a.getLogger().info(string2);
                                    }
                                }
                                object5 = w2;
                                object6 = a[10];
                                boolean bl11 = false;
                                ((n_0)object5).a.getLogger().info((String)object6);
                                object4 = iv_0.a;
                            }
                        }
                        catch (Throwable throwable3) {
                            throwable2 = throwable3;
                            throw throwable3;
                        }
                        finally {
                            f_.a(autoCloseable, throwable2);
                        }
                        object3 = iv_0.a;
                    }
                    catch (Throwable throwable4) {
                        throwable = throwable4;
                        throw throwable4;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (((w)object).b(sQLException)) break block21;
                    throw sQLException;
                }
            }
            return true;
        }
        eG2.c(a[11]);
        w2.k().b(a[12]);
        return false;
    }

    public /* synthetic */ id(aJ aJ2) {
        this();
    }

    private static final void b() {
        a = new String[]{hl.a("\u536b\u5368\u5364\u5366\u536b\u536f\u5368\u5374\u5373", -1270852857), hl.a("\ucd98\ucd9b\ucd9e\ucd87\ucd99\ucd87\ucd99\ucd87\ucd98", -1588736599), hl.a("\u0a3d\u0a38\u0a25\u0a34\u0a33\u0a30\u0a3f\u0a22\u0a7f\u0a22\u0a20\u0a3d\u0a38\u0a25\u0a34", 1613826641), hl.a("\u170c\u1720\u1721\u1739\u172a\u173d\u173b\u1726\u1721\u1728\u176f\u171c\u171e\u1703\u1726\u173b\u172a\u176f\u172b\u172e\u173b\u172e\u172d\u172e\u173c\u172a\u176f\u173b\u1720\u176f\u1707\u177d\u176f\u172b\u172e\u173b\u172e\u172d\u172e\u173c\u172a\u1761\u1761\u1761", 1582634831), hl.a("\u57c6\u579c", 1549948846), hl.a("\u61ce\u6194", 1257726374), hl.a("\u2f04\u2f08\u2f0a\u2f10\u2f0b\u2f11", 1633103717), hl.a("\u5692\u56de\u56dd\u56df\u56d7\u56c9\u56cc", -57780548), hl.a("\u6ebc\u6e8b\u6e80\u6e8f\u6e83\u6e8b\u6e8a\u6ece\u6ebd\u6ebf\u6ea2\u6e87\u6e9a\u6e8b\u6ece\u6e8a\u6e8f\u6e9a\u6e8f\u6e8c\u6e8f\u6e9d\u6e8b\u6ed4\u6ece", 780496622), hl.a("\ue3f3\ue3ee\ue3ed\ue3f3", 93774803), hl.a("\udbde\udbdc\udbc1\udbe4\udbf9\udbe8\udbad\udba0\udbb3\udbad\udbc5\udbbf\udbad\udbee\udbe2\udbe3\udbfb\udbe8\udbff\udbfe\udbe4\udbe2\udbe3\udbad\udbee\udbe2\udbe0\udbfd\udbe1\udbe8\udbf9\udbe8\udbe9\udbad\udbfe\udbf8\udbee\udbee\udbe8\udbfe\udbfe\udbeb\udbf8\udbe1\udbe1\udbf4\udba3", -422126707), hl.a("\u8c91\u8ccb", -620262151), hl.a("\ua7c1\ua79b", -878925911)};
    }

    static {
        id.b();
    }
}

