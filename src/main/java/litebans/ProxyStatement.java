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
        if (this.c(string) || !HexEncodingHelper.BaseCoreGenericHandler(string) || ObjectUtilities.BaseCoreGenericHandler(string, LiteBansModule_91.BaseCoreGenericHandler())) {
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
                Object targetObj = (BufferedReader)closeable;
                Object contextObj = LiteBansModule_50.BaseCoreGenericHandler().LiteBansModule_31targetObj;
                ObjectUtilities.LiteBansModule_31(contextObj, "");
                NullHandler_3 gr_02 = (NullHandler_3)contextObj;
                Object v2 = gr_02.get("name");
                String string4 = string3 = v2 instanceof String ? (String)v2 : null;
                if (string3 != null) {
                    LiteBansModule_50.c.BaseCoreGenericHandler(gr_02);
                    String string5 = string3;
                    return string5;
                }
                targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
            configService.BaseCoreGenericHandler(1, exception);
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
        Object targetObj = string.toLowerCase(Locale.ROOT);
        if (!LiteBansModule_50.c().BaseCoreGenericHandler(targetObj)) {
            configService.BaseCoreGenericHandler(1, (Object)("Username \"" + string + "\" invalid"));
            return LiteBansModule_91.LiteBansModule_31();
        }
        try {
            URLConnection uRLConnection = new URL("https://api.mojang.com/users/profiles/minecraft/" + string).openConnection();
            ObjectUtilities.LiteBansModule_31(uRLConnection, "");
            targetObj = (HttpsURLConnection)uRLConnection;
            int n = 10000;
            targetObj.setConnectTimeout(n);
            targetObj.setReadTimeout(n);
            Closeable closeable = targetObj.getInputStream();
            Charset charset = LiteBansModule_344.LiteBansModule_31;
            closeable = new InputStreamReader((InputStream)closeable, charset);
            int n2 = 512;
            closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n2);
            Throwable throwable = null;
            try {
                Object contextObj = (BufferedReader)closeable;
                Object resultObj = LiteBansModule_50.BaseCoreGenericHandler().LiteBansModule_31((Reader)contextObj);
                ObjectUtilities.LiteBansModule_31(resultObj, "");
                NullHandler_3 gr_02 = (NullHandler_3)resultObj;
                Object helperObj = gr_02.get("name");
                String string2 = helperObj instanceof String ? (String)helperObj : null;
                Object v2 = gr_02.get("SQLiteDriverHandler_4");
                String string3 = helperObj = v2 instanceof String ? (String)v2 : null;
                if (string2 != null && helperObj != null) {
                    LiteBansModule_50.c.BaseCoreGenericHandler(gr_02);
                    LiteBansModule_89 cM2 = new LiteBansModule_89(string2, UUID.fromString(LiteBansModule_50.c.e((String)helperObj)));
                    return cM2;
                }
                contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
        catch (Exception exception) {
            configService.BaseCoreGenericHandler(1, exception);
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
        Object targetObj = gr_02.get("cause");
        String string = targetObj instanceof String ? (String)targetObj : null;
        Object v2 = gr_02.get("errorMessage");
        targetObj = v2 instanceof String ? (String)v2 : null;
        String string2 = string;
        boolean flag = string2 != null ? !((string2).length() == 0) : false;
        if (flag) {
            throw new RuntimeExceptiontargetObj;
}

    public /* synthetic */ ProxyStatement(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"https://sessionserver.mojang.com/session/minecraft/profile/", "", "", "name", "Username \"", "\" invalid", "https://api.mojang.com/users/profiles/minecraft/", "", "", "name", "SQLiteDriverHandler_4", "-", "", "cause", "errorMessage"};
}

