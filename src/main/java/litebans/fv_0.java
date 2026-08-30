package litebans;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.ak_0;
import litebans.bz;
import litebans.di_0;
import litebans.eE;
import litebans.eG;
import litebans.ew;
import litebans.hl;
import litebans.lp_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.fv
 */
public static final class fv_0 {
    public static final ak_0 h;
    private final di_0 e;
    private Object d;
    private Method a;
    private Method g;
    private Method b;
    public static final String f;
    public static final String i;
    private static /* synthetic */ String[] c;

    public fv_0(@NotNull di_0 di_02, @NotNull File file, @NotNull File file2) {
        this.e = di_02;
        try {
            Method method;
            File[] fileArray = file.listFiles(fv_0::a);
            ew.a(fileArray);
            File[] fileArray2 = fileArray;
            Object object = fileArray2;
            boolean bl = false;
            Object object2 = object;
            Collection collection = new ArrayList(((File[])object).length);
            boolean bl2 = false;
            int n = ((File[])object2).length;
            for (int i = 0; i < n; ++i) {
                File file3;
                File file4 = file3 = object2[i];
                Collection collection2 = collection;
                boolean bl3 = false;
                collection2.add(file4.toURI().toURL());
            }
            object = (List)collection;
            bl = false;
            object2 = object;
            URL[] uRLArray = object2.toArray(new URL[0]);
            Object object3 = new Class[]{File.class};
            Constructor<?> constructor = new URLClassLoader(uRLArray, Driver.class.getClassLoader()).loadClass(c[0]).getConstructor((Class<?>)object3);
            object3 = new Object[]{file2};
            object = constructor.newInstance((Object[])object3);
            Object object4 = this.d = object.getClass().getMethod(c[1], new Class[0]).invoke(object, new Object[0]);
            ew.a(object4);
            object3 = new Class[]{InetAddress.class};
            this.a = object4.getClass().getMethod(c[2], (Class<?>)object3);
            Method method2 = this.a;
            if (method2 == null) {
                ew.e(c[3]);
                method2 = null;
            }
            if ((method = (this.g = ((Class)(object3 = method2.getReturnType())).getMethod(c[4], new Class[0]))) == null) {
                ew.e(c[5]);
                method = null;
            }
            this.b = method.getReturnType().getMethod(c[6], new Class[0]);
            this.e.getLogger().info(c[7]);
            object2 = this.b(c[8]);
            if (!ew.a(object2, (Object)c[9])) {
                this.e.getLogger().warning(c[10] + (String)object2 + ')');
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public final String b(@Nullable String string) {
        if (string == null) {
            return c[11];
        }
        Object object = this.d;
        if (object == null) {
            return c[12];
        }
        Object object2 = object;
        try {
            Object object3;
            String string2;
            InetAddress inetAddress = InetAddress.getByName(string);
            Method method = this.a;
            if (method == null) {
                ew.e(c[13]);
                method = null;
            }
            Object object4 = new Object[]{inetAddress};
            Object object5 = method.invoke(object2, object4);
            Method method2 = this.g;
            if (method2 == null) {
                ew.e(c[14]);
                method2 = null;
            }
            object4 = method2.invoke(object5, new Object[0]);
            Method method3 = this.b;
            if (method3 == null) {
                ew.e(c[15]);
                method3 = null;
            }
            if ((string2 = (object3 = method3.invoke(object4, new Object[0])) instanceof String ? (String)object3 : null) == null) {
                string2 = c[16];
            }
            return string2;
        }
        catch (Exception exception) {
            q_0 q_02 = (q_0)this.e.a(q_0.class);
            q_0.a(q_02, exception, 0, 2, null);
            return c[17];
        }
    }

    public final String a(@Nullable String string) {
        if (string == null) {
            return null;
        }
        q_0 q_02 = (q_0)this.e.a(q_0.class);
        eG eG2 = q_02.f();
        boolean bl = false;
        if (eG2.W()) {
            boolean bl2;
            String string2;
            String string3;
            int n;
            int n2;
            boolean bl3;
            String[] stringArray;
            eE eE2 = lp_0.a(() -> fv_0.a(this, string));
            if (!(eG2.at().length == 0)) {
                boolean bl4;
                block8: {
                    stringArray = eG2.at();
                    bl3 = false;
                    n2 = stringArray.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = stringArray[n];
                        bl2 = false;
                        if (!bz.a(string2, fv_0.a(eE2), true)) continue;
                        bl4 = true;
                        break block8;
                    }
                    bl4 = false;
                }
                if (bl4) {
                    return fv_0.a(eE2);
                }
            }
            if (!(eG2.S().length == 0)) {
                boolean bl5;
                block9: {
                    stringArray = eG2.S();
                    bl3 = false;
                    n2 = stringArray.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = stringArray[n];
                        bl2 = false;
                        if (!bz.a(string2, fv_0.a(eE2), true)) continue;
                        bl5 = false;
                        break block9;
                    }
                    bl5 = true;
                }
                if (bl5) {
                    return fv_0.a(eE2);
                }
            }
        }
        return null;
    }

    private static final boolean a(File file, String string) {
        ew.a((Object)string);
        return bz.a(string, c[18], false, 2, null);
    }

    private static final String a(fv_0 fv_02, String string) {
        return fv_02.b(string);
    }

    private static final String a(eE eE2) {
        eE eE3 = eE2;
        return (String)eE3.a();
    }

    static {
        i = "geoip.error";
        f = "geoip.unavailable";
        fv_0.a();
        h = new ak_0(null);
    }

    private static final void a() {
        c = new String[]{hl.a("\u6a49\u6a45\u6a47\u6a04\u6a47\u6a4b\u6a52\u6a47\u6a43\u6a44\u6a4e\u6a04\u6a4d\u6a4f\u6a45\u6a43\u6a5a\u6a18\u6a04\u6a6e\u6a4b\u6a5e\u6a4b\u6a48\u6a4b\u6a59\u6a4f\u6a78\u6a4f\u6a4b\u6a4e\u6a4f\u6a58\u6a0e\u6a68\u6a5f\u6a43\u6a46\u6a4e\u6a4f\u6a58", 256338474), hl.a("\u0f15\u0f02\u0f1e\u0f1b\u0f13", 1512968055), hl.a("\u5ba8\u5ba4\u5bbe\u5ba5\u5bbf\u5bb9\u5bb2", -1228317749), hl.a("", -475529403), hl.a("\u69fe\u69fc\u69ed\u69da\u69f6\u69ec\u69f7\u69ed\u69eb\u69e0", -1870239335), hl.a("", -290641585), hl.a("\ua6c7\ua6c5\ua6d4\ua6ee\ua6c1\ua6cd\ua6c5", -774723936), hl.a("\u1822\u1800\u180a\u182c\u1835\u1845\u1816\u1810\u1815\u1815\u180a\u1817\u1811\u1845\u180c\u180b\u180c\u1811\u180c\u1804\u1809\u180c\u181f\u1800\u1801\u184b", 361633893), hl.a("\u59a7\u59b1\u59a7\u59b1\u59a7\u59b1\u59a7", 1465997727), hl.a("\u2d83\u2db8\u2dbf\u2da2\u2db3\u2db2\u2df6\u2d85\u2da2\u2db7\u2da2\u2db3\u2da5", -67097130), hl.a("\u6cd1\u6cf3\u6cf9\u6cdf\u6cc6\u6cb6\u6cf2\u6cf7\u6ce2\u6cf7\u6cf4\u6cf7\u6ce5\u6cf3\u6cb6\u6ce2\u6cf3\u6ce5\u6ce2\u6cb6\u6cf0\u6cf7\u6cff\u6cfa\u6cf3\u6cf2\u6cb8\u6cb6\u6cbe", -31036266), hl.a("\uf021\uf023\uf029\uf02f\uf036\uf068\uf033\uf028\uf027\uf030\uf027\uf02f\uf02a\uf027\uf024\uf02a\uf023", -865865658), hl.a("\ub704\ub706\ub70c\ub70a\ub713\ub74d\ub716\ub70d\ub702\ub715\ub702\ub70a\ub70f\ub702\ub701\ub70f\ub706", 882620259), hl.a("", -1560201848), hl.a("", -252850224), hl.a("", -1871898312), hl.a("\u0497\u0495\u049f\u0499\u0480\u04de\u0495\u0482\u0482\u049f\u0482", -606272272), hl.a("\u89fc\u89fe\u89f4\u89f2\u89eb\u89b5\u89fe\u89e9\u89e9\u89f4\u89e9", 289048987), hl.a("\u2a4b\u2a0f\u2a04\u2a17", -1662965147)};
    }
}

