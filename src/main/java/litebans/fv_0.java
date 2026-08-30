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

public final class fv_0 {
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
            Constructor<?> constructor = new URLClassLoader(uRLArray, Driver.class.getClassLoader()).loadClass("com.maxmind.geoip2.DatabaseReader$Builder").getConstructor((Class<?>)object3);
            object3 = new Object[]{file2};
            object = constructor.newInstance((Object[])object3);
            Object object4 = this.d = object.getClass().getMethod("build", new Class[0]).invoke(object, new Object[0]);
            ew.a(object4);
            object3 = new Class[]{InetAddress.class};
            this.a = object4.getClass().getMethod("country", (Class<?>)object3);
            Method method2 = this.a;
            if (method2 == null) {
                ew.e("");
                method2 = null;
            }
            if ((method = (this.g = ((Class)(object3 = method2.getReturnType())).getMethod("getCountry", new Class[0]))) == null) {
                ew.e("");
                method = null;
            }
            this.b = method.getReturnType().getMethod("getName", new Class[0]);
            this.e.getLogger().info("GeoIP support ");
            object2 = this.b("8.8.8.8");
            if (!ew.a(object2, (Object)"United States")) {
                this.e.getLogger().warning("GeoIP database test failed. (" + (String)object2 + ')');
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public final String b(@Nullable String string) {
        if (string == null) {
            return "geoip.unavailable";
        }
        Object object = this.d;
        if (object == null) {
            return "geoip.unavailable";
        }
        Object object2 = object;
        try {
            Object object3;
            String string2;
            InetAddress inetAddress = InetAddress.getByName(string);
            Method method = this.a;
            if (method == null) {
                ew.e("");
                method = null;
            }
            Object object4 = new Object[]{inetAddress};
            Object object5 = method.invoke(object2, object4);
            Method method2 = this.g;
            if (method2 == null) {
                ew.e("");
                method2 = null;
            }
            object4 = method2.invoke(object5, new Object[0]);
            Method method3 = this.b;
            if (method3 == null) {
                ew.e("");
                method3 = null;
            }
            if ((string2 = (object3 = method3.invoke(object4, new Object[0])) instanceof String ? (String)object3 : null) == null) {
                string2 = "geoip.error";
            }
            return string2;
        }
        catch (Exception exception) {
            q_0 q_02 = (q_0)this.e.a(q_0.class);
            q_0.a(q_02, exception, 0, 2, null);
            return "geoip.error";
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
        return bz.a(string, ".jar", false, 2, null);
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
        c = new String[]{"com.maxmind.geoip2.DatabaseReader$Builder", "build", "country", "", "getCountry", "", "getName", "GeoIP support ", "8.8.8.8", "United States", "GeoIP database test failed. (", "geoip.unavailable", "geoip.unavailable", "", "", "", "geoip.error", "geoip.error", ".jar"};
    }
}

