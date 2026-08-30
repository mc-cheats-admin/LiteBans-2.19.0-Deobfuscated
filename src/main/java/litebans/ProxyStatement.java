package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import org.jetbrains.annotations.NotNull;

public final class ProxyStatement {
    private ProxyStatement() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final String LiteBansModule_194(@NotNull String string) {
        if (this.c(string) || !HexEncodingHelper.BaseCoreGenericHandler(string) || ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)LiteBansModule_91.BaseCoreGenericHandler())) {
            return null;
        }
        String string2 = this.AsyncBackgroundTask_5(string);
        try {
            URLConnection uRLConnection = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + string2).openConnection();
            ObjectUtilities.LiteBansModule_31(uRLConnection, "");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)uRLConnection;
            int n = 10000;
            httpsURLConnection.setConnectTimeout(n);
            httpsURLConnection.setReadTimeout(n);
            Closeable closeable = httpsURLConnection.getInputStream();
            Charset charset = LiteBansModule_344.LiteBansModule_31;
            closeable = new InputStreamReader((InputStream)closeable, charset);
            int n2 = 512;
            closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n2);
            Throwable throwable = null;
            try {
                String string3;
                Object object = (BufferedReader)closeable;
                Object object2 = LiteBansModule_50.BaseCoreGenericHandler().LiteBansModule_31((Reader)object);
                ObjectUtilities.LiteBansModule_31(object2, "");
                NullHandler_3 gr_02 = (NullHandler_3)object2;
                Object v2 = gr_02.get("name");
                String string4 = string3 = v2 instanceof String ? (String)v2 : null;
                if (string3 != null) {
                    LiteBansModule_50.c.BaseCoreGenericHandler(gr_02);
                    String string5 = string3;
                    return string5;
                }
                object = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
        catch (Exception exception) {
            ConfigService configService = (ConfigService)LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
            configService.BaseCoreGenericHandler(1, (Object)exception);
        }
        return null;
    }

    public final LiteBansModule_89 BaseCoreGenericHandler(@NotNull String string) {
        LiteBansModule_89 cM2 = this.LiteBansModule_31(string);
        return !cM2.c() ? cM2 : null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final LiteBansModule_89 LiteBansModule_31(@NotNull String string) {
        ConfigService configService = (ConfigService)LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
        Object object = string.toLowerCase(Locale.ROOT);
        if (!LiteBansModule_50.c().BaseCoreGenericHandler((CharSequence)object)) {
            configService.BaseCoreGenericHandler(1, (Object)("Username \"" + string + "\" invalid"));
            return LiteBansModule_91.LiteBansModule_31();
        }
        try {
            URLConnection uRLConnection = new URL("https://api.mojang.com/users/profiles/minecraft/" + string).openConnection();
            ObjectUtilities.LiteBansModule_31(uRLConnection, "");
            object = (HttpsURLConnection)uRLConnection;
            int n = 10000;
            ((URLConnection)object).setConnectTimeout(n);
            ((URLConnection)object).setReadTimeout(n);
            Closeable closeable = ((URLConnection)object).getInputStream();
            Charset charset = LiteBansModule_344.LiteBansModule_31;
            closeable = new InputStreamReader((InputStream)closeable, charset);
            int n2 = 512;
            closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n2);
            Throwable throwable = null;
            try {
                Object object2 = (BufferedReader)closeable;
                Object object3 = LiteBansModule_50.BaseCoreGenericHandler().LiteBansModule_31((Reader)object2);
                ObjectUtilities.LiteBansModule_31(object3, "");
                NullHandler_3 gr_02 = (NullHandler_3)object3;
                Object object4 = gr_02.get("name");
                String string2 = object4 instanceof String ? (String)object4 : null;
                Object v2 = gr_02.get("SQLiteDriverHandler_4");
                String string3 = object4 = v2 instanceof String ? (String)v2 : null;
                if (string2 != null && object4 != null) {
                    LiteBansModule_50.c.BaseCoreGenericHandler(gr_02);
                    LiteBansModule_89 cM2 = new LiteBansModule_89(string2, UUID.fromString(LiteBansModule_50.c.e((String)object4)));
                    return cM2;
                }
                object2 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
        catch (Exception exception) {
            configService.BaseCoreGenericHandler(1, (Object)exception);
        }
        return LiteBansModule_91.LiteBansModule_31();
    }

    public final boolean c(@NotNull String string) {
        String string2 = this.e(string);
        return string2.length() == 36 && string2.charAt(14) == '3';
    }

    public final String BaseCoreGenericHandler(@NotNull UUID uUID) {
        return this.AsyncBackgroundTask_5(uUID.toString());
    }

    public final String AsyncBackgroundTask_5(@NotNull String string) {
        return string.length() != 36 ? string : LiteBansModule_433.LiteBansModule_31.BaseCoreGenericHandler(string, "-", (Object)"");
    }

    public final String e(@NotNull String string) {
        if (string.length() != 32) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        int n4 = 8;
        int n5 = string.length();
        for (int i = 0; i < n5; ++i) {
            char c = string.charAt(i);
            ++n;
            stringBuilder.append(c);
            if (++n2 < n4) continue;
            n2 = 0;
            if (n < 32) {
                stringBuilder.append('-');
            }
            if (++n3 == 1) {
                n4 = 4;
                continue;
            }
            if (n3 < 4) continue;
            n4 = 12;
        }
        return stringBuilder.toString();
    }

    private final void BaseCoreGenericHandler(NullHandler_3 gr_02) {
        Object object = gr_02.get("cause");
        String string = object instanceof String ? (String)object : null;
        Object v2 = gr_02.get("errorMessage");
        object = v2 instanceof String ? (String)v2 : null;
        String string2 = string;
        boolean flag = string2 != null ? !(((CharSequence)string2).length() == 0) : false;
        if (flag) {
            throw new RuntimeException((String)object);
}

    public /* synthetic */ ProxyStatement(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"https://sessionserver.mojang.com/session/minecraft/profile/", "", "", "name", "Username \"", "\" invalid", "https://api.mojang.com/users/profiles/minecraft/", "", "", "name", "SQLiteDriverHandler_4", "-", "", "cause", "errorMessage"};
}

