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
    public static final LiteBansModule_16 LiteBansModule_240;
    private final PlatformPlugin e;
    private Object AsyncBackgroundTask_5;
    private Method BaseCoreGenericHandler;
    private Method g;
    private Method LiteBansModule_31;
    public static final String LiteBansModule_194;
    public static final String i;
    public GeoIPLookupService_2(@NotNull PlatformPlugin plugin, @NotNull File file, @NotNull File file2) {
        this.e = plugin;
        try {
            Method method;
            File[] fileArray = file.listFiles(GeoIPLookupService_2::BaseCoreGenericHandler);
            ObjectUtilities.BaseCoreGenericHandler(fileArray);
            File[] fileArray2 = fileArray;
            Object object = fileArray2;
            Object object2 = object;
            Collection collection = new ArrayList(((File[])object).length);
            int n = ((File[])object2).length;
            for (int i = 0; i < n; ++i) {
                File file3;
                File file4 = file3 = object2[i];
                Collection collection2 = collection;
                collection2.add(file4.toURI().toURL());
            }
            object = (List)collection;
            flag = false;
            object2 = object;
            URL[] uRLArray = object2.toArray(new URL[0]);
            Object object3 = new Class[]{File.class};
            Constructor<?> constructor = new URLClassLoader(uRLArray, Driver.class.getClassLoader()).loadClass("com.maxmind.geoip2.DatabaseReader$Builder").getConstructor((Class<?>)object3);
            object3 = new Object[]{file2};
            object = constructor.newInstance((Object[])object3);
            Object object4 = this.AsyncBackgroundTask_5 = object.getClass().getMethod("build", new Class[0]).invoke(object, new Object[0]);
            ObjectUtilities.BaseCoreGenericHandler(object4);
            object3 = new Class[]{InetAddress.class};
            this.plugin = object4.getClass().getMethod("country", (Class<?>)object3);
            Method method2 = this.plugin;
            if (method2 == null) {
                ObjectUtilities.e("");
                method2 = null;
            }
            if ((method = (this.g = ((Class)(object3 = method2.getReturnType())).getMethod("getCountry", new Class[0]))) == null) {
                ObjectUtilities.e("");
                method = null;
            }
            this.LiteBansModule_31 = method.getReturnType().getMethod("getName", new Class[0]);
            this.e.getLogger().info("GeoIP support ");
            object2 = this.LiteBansModule_31("8.8.8.8");
            if (!ObjectUtilities.BaseCoreGenericHandler(object2, (Object)"United States")) {
                this.e.getLogger().warning("GeoIP database test failed. (" + (String)object2 + ')');
}
        catch (Throwable throwable) {
            throwable.printStackTrace();
}

    public final String LiteBansModule_31(@Nullable String string) {
        if (string == null) {
            return "geoip.unavailable";
        }
        Object object = this.AsyncBackgroundTask_5;
        if (object == null) {
            return "geoip.unavailable";
        }
        Object object2 = object;
        try {
            Object object3;
            String string2;
            InetAddress inetAddress = InetAddress.getByName(string);
            Method method = this.plugin;
            if (method == null) {
                ObjectUtilities.e("");
                method = null;
            }
            Object object4 = new Object[]{inetAddress};
            Object object5 = method.invoke(object2, object4);
            Method method2 = this.g;
            if (method2 == null) {
                ObjectUtilities.e("");
                method2 = null;
            }
            object4 = method2.invoke(object5, new Object[0]);
            Method method3 = this.LiteBansModule_31;
            if (method3 == null) {
                ObjectUtilities.e("");
                method3 = null;
            }
            if ((string2 = (object3 = method3.invoke(object4, new Object[0])) instanceof String ? (String)object3 : null) == null) {
                string2 = "geoip.error";
            }
            return string2;
        }
        catch (Exception exception) {
            ConfigService configService = (ConfigService)this.e.BaseCoreGenericHandler(ConfigService.class);
            ConfigService.BaseCoreGenericHandler(configService, exception, 0, 2, null);
            return "geoip.error";
}

    public final String BaseCoreGenericHandler(@Nullable String string) {
        if (string == null) {
            return null;
        }
        ConfigService configService = (ConfigService)this.e.BaseCoreGenericHandler(ConfigService.class);
        DiscordWebhookClient eG2 = configService.LiteBansModule_194();
        if (eG2.W()) {
            boolean flag2;
            String string2;
            String string3;
            int n;
            int n2;
            boolean flag3;
            String[] args;
            LiteBansModule_161 eE2 = LiteBansModule_420.BaseCoreGenericHandler(() -> GeoIPLookupService_2.BaseCoreGenericHandler(this, string));
            if (!(eG2.LiteBansModule_21().length == 0)) {
                boolean flag4;
{
                    args = eG2.LiteBansModule_21();
                    flag3 = false;
                    n2 = args.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = args[n];
                        flag2 = false;
                        if (!StringUtilities.BaseCoreGenericHandler(string2, GeoIPLookupService_2.BaseCoreGenericHandler(eE2), true)) continue;
                        flag4 = true;
                        break;
                    }
                    flag4 = false;
                }
                if (flag4) {
                    return GeoIPLookupService_2.BaseCoreGenericHandler(eE2);
}
            if (!(eG2.S().length == 0)) {
                boolean flag5;
{
                    args = eG2.S();
                    flag3 = false;
                    n2 = args.length;
                    for (n = 0; n < n2; ++n) {
                        string2 = string3 = args[n];
                        flag2 = false;
                        if (!StringUtilities.BaseCoreGenericHandler(string2, GeoIPLookupService_2.BaseCoreGenericHandler(eE2), true)) continue;
                        flag5 = false;
                        break;
                    }
                    flag5 = true;
                }
                if (flag5) {
                    return GeoIPLookupService_2.BaseCoreGenericHandler(eE2);
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

    private static final String BaseCoreGenericHandler(LiteBansModule_161 eE2) {
        LiteBansModule_161 eE3 = eE2;
        return (String)eE3.BaseCoreGenericHandler();
    }

    static {
        i = "geoip.error";
        LiteBansModule_194 = "geoip.unavailable";
        GeoIPLookupService_2.BaseCoreGenericHandler();
        LiteBansModule_240 = new LiteBansModule_16(null);
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"com.maxmind.geoip2.DatabaseReader$Builder", "build", "country", "", "getCountry", "", "getName", "GeoIP support ", "8.8.8.8", "United States", "GeoIP database test failed. (", "geoip.unavailable", "geoip.unavailable", "", "", "", "geoip.error", "geoip.error", ".jar"};
}

