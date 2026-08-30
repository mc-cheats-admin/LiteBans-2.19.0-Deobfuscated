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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GeoIPLookupService_2 {
    public static final LiteBansModule_16 LiteBansModule_241;
    private final PlatformPlugin e;
    private Object AsyncBackgroundTask_5;
    private Method BaseCoreGenericHandler;
    private Method g;
    private Method LiteBansModule_31;
    public static final String LiteBansModule_195;
    public static final String i;
        public GeoIPLookupService_2(@NotNull PlatformPlugin plugin, @NotNull File file, @NotNull File file2) {
        this.e = plugin;
        try {
            Method method;
            File[] fileArray = file.listFiles(GeoIPLookupService_2::BaseCoreGenericHandler);
            ObjectUtilities.BaseCoreGenericHandler(fileArray);
            File[] fileArray2 = fileArray;
            Object targetObj = fileArray2;
            Object contextObj = targetObj;
            Collection collection = new ArrayList(((File[])targetObj).length);
            int n = ((File[])contextObj).length;
            for (int i = 0; i < n; ++i) {
                File file3;
                File file4 = file3 = contextObj[i];
                Collection collection2 = collection;
                collection2.add(file4.toURI().toURL());
            }
            targetObj = (List)collection;
            flag = false;
            contextObj = targetObj;
            URL[] uRLArray = contextObj.toArray(new URL[0]);
            Object resultObj = new Class[]{File.class};
            Constructor<?> constructor = new URLClassLoader(uRLArray, Driver.class.getClassLoader()).loadClass("com.maxmind.geoip2.DatabaseReader$Builder").getConstructor((Class<?>)resultObj);
            resultObj = new Object[]{file2};
            targetObj = constructor.newInstance((Object[])resultObj);
            Object helperObj = this.AsyncBackgroundTask_5 = targetObj.getClass().getMethod("build", new Class[0]).invoke(targetObj, new Object[0]);
            ObjectUtilities.BaseCoreGenericHandler(helperObj);
            resultObj = new Class[]{InetAddress.class};
            this.plugin = helperObj.getClass().getMethod("country", (Class<?>)resultObj);
            Method method2 = this.plugin;
            if (method2 == null) {
                ObjectUtilities.e("");
                method2 = null;
            }
            if ((method = (this.g = ((Class)(resultObj = method2.getReturnType())).getMethod("getCountry", new Class[0]))) == null) {
                ObjectUtilities.e("");
                method = null;
            }
            this.LiteBansModule_31 = method.getReturnType().getMethod("getName", new Class[0]);
            this.e.getLogger().info("GeoIP support ");
            contextObj = this.LiteBansModule_31("8.8.8.8");
            if (!ObjectUtilities.BaseCoreGenericHandler(contextObj, (Object)"United States")) {
                this.e.getLogger().warning("GeoIP database test failed. (" + (String)contextObj + ')');
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public final String LiteBansModule_31(@Nullable String string) {
        if (string == null) {
            return "geoip.unavailable";
        }
        Object targetObj = this.AsyncBackgroundTask_5;
        if (targetObj == null) {
            return "geoip.unavailable";
        }
        Object contextObj = targetObj;
        try {
            String string2;
            InetAddress inetAddress = InetAddress.getByName(string);
            Method method = this.plugin;
            if (method == null) {
                ObjectUtilities.e("");
                method = null;
            }
            Object helperObj = new Object[]{inetAddress};
            Object tempObj = method.invoke(contextObj, helperObj);
            Method method2 = this.g;
            if (method2 == null) {
                ObjectUtilities.e("");
                method2 = null;
            }
            helperObj = method2.invoke(tempObj, new Object[0]);
            Method method3 = this.LiteBansModule_31;
            if (method3 == null) {
                ObjectUtilities.e("");
                method3 = null;
            }
            if ((string2 = (resultObj = method3.invoke(helperObj, new Object[0])) instanceof String ? (String)resultObj : null) == null) {
                string2 = "geoip.error";
            }
            return string2;
        }
        catch (Exception exception) {
            ConfigService configService = (ConfigService)this.e.BaseCoreGenericHandler(ConfigService.class);
            ConfigService.BaseCoreGenericHandler(configService, exception, 0, 2, null);
            return "geoip.error";
        }
    }

    public final String BaseCoreGenericHandler(@Nullable String string) {
        if (string == null) {
            return null;
        }
        ConfigService configService = (ConfigService)this.e.BaseCoreGenericHandler(ConfigService.class);
        DiscordWebhookClient eG2 = configService.LiteBansModule_195();
        if (eG2.W()) {
            boolean flag2;
            String string2;
            String string3;
            int n;
            int n2;
            boolean flag3;
            String[] args;
            LiteBansModule_162 eE2 = LiteBansModule_422.BaseCoreGenericHandler(() -> GeoIPLookupService_2.BaseCoreGenericHandler(this, string));
            if (!(eG2.LiteBansModule_21().length == 0)) {
                boolean flag4;
                block8: {
                    args = eG2.LiteBansModule_21();
                    flag3 = false;
                    n2 = args.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = args[n];
                        flag2 = false;
                        if (!StringUtilities.BaseCoreGenericHandler(string2, GeoIPLookupService_2.BaseCoreGenericHandler(eE2), true)) continue;
                        flag4 = true;
                        break block8;
                    }
                    flag4 = false;
                }
                if (flag4) {
                    return GeoIPLookupService_2.BaseCoreGenericHandler(eE2);
                }
            }
            if (!(eG2.S().length == 0)) {
                boolean flag5;
                block9: {
                    args = eG2.S();
                    flag3 = false;
                    n2 = args.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = args[n];
                        flag2 = false;
                        if (!StringUtilities.BaseCoreGenericHandler(string2, GeoIPLookupService_2.BaseCoreGenericHandler(eE2), true)) continue;
                        flag5 = false;
                        break block9;
                    }
                    flag5 = true;
                }
                if (flag5) {
                    return GeoIPLookupService_2.BaseCoreGenericHandler(eE2);
                }
            }
        }
        return null;
    }

    private static final boolean BaseCoreGenericHandler(File file, String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        return StringUtilities.BaseCoreGenericHandler(string, ".jar", false, 2, null);
    }

    private static final String BaseCoreGenericHandler(GeoIPLookupService_2 fv_02, String string) {
        return fv_02.LiteBansModule_31(string);
    }

    private static final String BaseCoreGenericHandler(LiteBansModule_162 eE2) {
        LiteBansModule_162 eE3 = eE2;
        return (String)eE3.BaseCoreGenericHandler();
    }

    static {
        i = "geoip.error";
        LiteBansModule_195 = "geoip.unavailable";
        GeoIPLookupService_2.BaseCoreGenericHandler();
        LiteBansModule_241 = new LiteBansModule_16(null);
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"com.maxmind.geoip2.DatabaseReader$Builder", "build", "country", "", "getCountry", "", "getName", "GeoIP support ", "8.8.8.8", "United States", "GeoIP database test failed. (", "geoip.unavailable", "geoip.unavailable", "", "", "", "geoip.error", "geoip.error", ".jar"};
    }
}

