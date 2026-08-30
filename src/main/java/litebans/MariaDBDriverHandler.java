package litebans;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.LambdaMetafactory;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarInputStream;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MariaDBDriverHandler {
    private MariaDBDriverHandler() {
    }

    public final int LiteBansModule_31() {
        return ConfigService.n();
    }

    public final void BaseCoreGenericHandler(int n) {
        ConfigService.c(n);
    }

    private final long BaseCoreGenericHandler(String string) {
        return (long)Double.parseDouble(string.substring(2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void BaseCoreGenericHandler(@NotNull String v1, @NotNull String v2, @NotNull String v3, @NotNull Object[] arg1) {
{
                arg2 = new LiteBansModule_124();
                arg3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                arg4 = KeyStore.getInstance(KeyStore.getDefaultType());
                if (arg1.length != 1) break;
                try {
{
                                    arg5 = new LiteBansException_2();
                                    arg6 = System.currentTimeMillis();
                                    arg7 = 0L;
                                    arg8 = (ConfigService)LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
                                    v0 = LiteBansModule_228.BaseCoreGenericHandler("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K");
                                    if (v0 == null) {
                                        throw arg5;
                                    }
                                    arg9 = v0;
                                    LiteBansCommand.i = "";
                                    arg10 = new BufferedInputStream(new ByteArrayInputStream(arg9));
                                    arg11 = CertificateFactory.getInstance("X.509").generateCertificate((InputStream)arg10);
                                    arg4.load(null, null);
                                    arg4.setCertificateEntry("1", arg11);
                                    arg3.init(arg4);
                                    arg12 = SSLContext.getInstance("TLS");
                                    v1 = arg1[0];
                                    ObjectUtilities.LiteBansModule_31(v1, "");
                                    arg13 = (PlatformPlugin)v1;
                                    arg12.init(null, arg3.getTrustManagers(), null);
                                    arg14 = arg8;
                                    arg15 = arg16;
                                    if (arg14.g()) {
                                        arg14.BaseCoreGenericHandler(arg15);
                                    }
                                    arg17 = Math.min(65535, arg8.m());
                                    arg18 = arg8.LiteBansModule_433() != false ? 1 : 0;
                                    arg19 = arg13.AsyncBackgroundTask_22();
                                    arg20 = -1L;
                                    arg21 = LiteBansModule_27.BaseCoreGenericHandler;
                                    arg22 = arg13.getDataFolder();
                                    arg23 = "update.json";
                                    arg24 = new File((File)arg22, arg23).exists();
                                    arg22 = "";
                                    arg23 = "";
                                    arg25 = "";
                                    arg26 = "";
                                    try {
                                        arg23 = LiteBansModule_376.BaseCoreGenericHandler;
                                        arg25 = LiteBansModule_237.BaseCoreGenericHandler;
                                        arg26 = LiteBansModule_75.BaseCoreGenericHandler;
                                        arg27 = "-21191458502013";
                                        if (arg8.g() && Long.parseLong((String)arg27) == (long)arg17) {
                                            arg28 = AbstractCommand.AsyncBackgroundTask_5;
                                            if (ObjectUtilities.BaseCoreGenericHandler(arg27, (Object)"sort")) {
                                                arg29 = new String[]{"00"};
                                                v2 = arg29;
                                            } else {
                                                arg29 = new String[]{"01:" + (String)arg27};
                                                v2 = arg29;
                                            }
                                            arg30 = v2;
                                            new LiteBansModule_403((ConfigService)arg8, Arrays.copyOf(arg30, arg30.length)).LiteBansModule_31();
                                        }
                                        arg30 = "-1791906487";
                                        if (!StringUtilities.LiteBansModule_31(arg23, (String)arg27, false, 2, null) || !StringUtilities.BaseCoreGenericHandler(arg23, (String)arg30, false, 2, null)) {
                                            throw arg5;
                                        }
                                        arg28 = "8789648393";
                                        if (!StringUtilities.BaseCoreGenericHandler(arg25, (String)arg28, false, 2, null)) {
                                            throw arg5;
                                        }
                                        arg31 = "876388351072311993428968062";
                                        if (!StringUtilities.LiteBansModule_31(arg26, arg31, false, 2, null)) {
                                            throw arg5;
                                        }
                                        arg23 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(arg23, (String)arg27, "", false, 4, null), (String)arg30, "", false, 4, null);
                                        arg25 = StringUtilities.BaseCoreGenericHandler(arg25, (String)arg28, "", false, 4, null);
                                        arg26 = StringUtilities.BaseCoreGenericHandler(arg26, arg31, "", false, 4, null);
                                        arg22 = StringUtilities.BaseCoreGenericHandler(arg23 + arg25 + arg26, "-", "", false, 4, null);
                                        if (!arg24) {
{
                                                if (arg22.length() <= 2) {
                                                    throw arg5;
                                                }
                                                arg29 = arg22;
                                                for (arg32 = 0; arg32 < arg29.length(); ++arg32) {
                                                    arg33 = arg34 = arg29.charAt(arg32);
                                                    if (!(Character.isDigit(arg33) == false)) continue;
                                                    break;
}
                                            if (v3) {
                                                throw arg5;
}
                                        ((BroadcastService)arg13.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(1);
                                    }
                                    catch (Throwable arg35) {
                                        arg16 += 50000;
                                        arg7 |= 8L;
                                        ConfigService.BaseCoreGenericHandler((ConfigService)arg8, arg35, 0, 2, null);
                                    }
                                    arg30 = "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781";
                                    ObjectUtilities.BaseCoreGenericHandler(arg21);
                                    if (!StringUtilities.LiteBansModule_31(arg21, (String)arg30, false, 2, null)) {
                                        arg16 += 500;
                                    }
                                    if (!StringUtilities.BaseCoreGenericHandler(arg21, (String)(arg28 = "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473"), false, 2, null)) {
                                        arg16 += 1000;
                                    }
                                    if (ObjectUtilities.BaseCoreGenericHandler((Object)(arg31 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(arg21, (String)arg30, "", false, 4, null), (String)arg28, "", false, 4, null)), (Object)"%%__USER__%%") && !arg24) {
                                        arg16 += 2000;
                                        arg29 = arg8;
                                        if (arg29.g()) {
                                            arg36 = arg29;
                                            arg36.BaseCoreGenericHandler((Object)"No updates found + ");
}
                                    arg29 = arg8.LiteBansModule_194().ElementsHandler();
                                    switch (arg29.hashCode()) {
                                        case 839186932: {
                                            if (!arg29.equals("mariadb")) {
                                                break;
                                            }
                                            break;
                                        }
                                        case 104382626: {
                                            if (arg29.equals("mysql")) break;
                                            break;
                                        }
                                        case 3274: {
                                            if (!arg29.equals("LiteBansModule_243")) {
                                                break;
                                            }
                                            break;
                                        }
                                        case 106616951: {
                                            if (!arg29.equals("pgsql")) {
                                                break;
                                            }
                                            break;
}
                                    v4 = 7;
                                    break;
                                }
                                v4 = 4;
                                break;
                            }
                            v4 = 5;
                            break;
                        }
                        v4 = 6;
                        break;
                                                v4 = 9;
                    }
                    arg37 = v4;
                    arg29 = v2;
                    arg38 = (int)(System.currentTimeMillis() % (long)64);
                    switch (arg38) {
                        case 32: {
                            arg29 = StringUtilities.BaseCoreGenericHandler((String)arg29, LiteBansModule_242.BaseCoreGenericHandler('/', LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_242.BaseCoreGenericHandler('/', LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()) + '0', false, 4, null);
                            break;
                        }
                        case 4: {
                            arg29 = StringUtilities.BaseCoreGenericHandler((String)arg29, LiteBansModule_242.BaseCoreGenericHandler('/', LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_242.BaseCoreGenericHandler('/', LitebansHandler.LiteBansModule_31.e()), false, 4, null);
}
                    if (arg18 == 0) {
                        Thread.sleep(10000 + new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler(900) * 1000);
                    }
                    arg39 = (DatabaseMonitorService)arg13.BaseCoreGenericHandler(DatabaseMonitorService.class);
                    try {
                        arg40 = LiteBansModule_326.BaseCoreGenericHandler;
                        arg33 = '\u0000';
                        arg41 = 0L;
                        arg41 = -1L;
                        arg42 = StackTraceAnalyzer.BaseCoreGenericHandler(RemoteUpdateService.class);
                        arg43 = new File((String)arg42);
                        arg44 = new JarInputStream(new FileInputStream(arg43));
                        arg45 = arg44;
                        try {
                            arg46 = (JarInputStream)arg45;
                            while ((v5 = (arg47 = arg44.getNextJarEntry())) != null && (v5 = v5.getName()) != null) {
                                arg48 = v5;
                                if (arg48.length() > 6) {
                                    arg48 = StringUtilities.BaseCoreGenericHandler((String)arg48, '/', '.', false, 4, null).substring(0, arg48.length() - 6);
                                }
                                arg49 = arg47.getTime();
                                if (!ObjectUtilities.BaseCoreGenericHandler(arg48, RemoteUpdateService.class.getName())) continue;
                                arg41 = arg49;
                            }
                            arg46 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable arg50) {
                            arg51 = arg50;
                            throw arg50;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler(arg45, arg51);
                        }
                        arg20 = arg41 / 1000L;
                    }
                    catch (Throwable arg52) {
                        arg7 |= 4L;
                        ConfigService.BaseCoreGenericHandler((ConfigService)arg8, arg52, 0, 2, null);
                    }
                    try {
                        arg53 = arg53 != false || arg2.verify(null, null) == false;
                    }
                    catch (Throwable arg54) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)arg8, arg54, 0, 2, null);
                        arg8.c((byte)2);
                    }
                    arg55 = arg53 != false ? 1 : 0;
                    arg56 = LiteBansModule_336.LiteBansModule_31();
                    arg42 = new StringBuilder();
                    v6 = arg42.append((String)arg29).append("&LiteBansModule_433=").append(arg16).append("&i=");
                    arg57 = this.LiteBansModule_31();
                    this.plugin(arg57 + 1);
                    v6.append(arg57).append("&Utf8Handler_2=").append(arg37).append("&q=").append(arg17).append("&LiteBansModule_194=").append(arg18).append("&DatabaseMonitorService=").append(arg19).append("&AsyncBackgroundTask_5=").append(arg20).append("&r=").append(arg31).append("&BroadcastService=").append((String)arg22).append("&GnuSparseMapHandler=").append(arg55).append("&AsyncBackgroundTask_21=").append(arg7);
                    arg42.append("&LiteBansModule_31=").append(arg56);
                    arg58 = arg42.toString();
                    v7 = arg27 = new URL(null, arg58, null).openConnection();
                    ObjectUtilities.LiteBansModule_31(v7, "");
                    arg42 = (HttpsURLConnection)v7;
                    arg42.setSSLSocketFactory(arg12.getSocketFactory());
                    arg42.setHostnameVerifier(arg2);
                    try {
                        ((HttpsURLConnection)arg27).setReadTimeout(40000);
                        ((HttpsURLConnection)arg27).setConnectTimeout(40000);
                    }
                    catch (Throwable arg59) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)arg8, arg59, 0, 2, null);
                    }
                    arg60 = ((HttpsURLConnection)arg27).getInputStream();
                    arg44 = new BufferedReader(new InputStreamReader(arg60, StandardCharsets.UTF_8));
                    arg61 = 210;
                    arg62 = 1000;
                    arg46 = arg44.readLine();
                    if (arg46 == null || !((arg46).length() > 0)) break;
                    arg63 = arg44.readLine();
                    arg53 = arg53 != false || StringUtilities.BaseCoreGenericHandler(arg46, (CharSequence)"\u0006p\ufffd", false, 2, null) != false;
                    arg64 = (long)(arg61 * arg62) + arg6 % (long)(arg62 * arg62) + (long)(arg61 * arg62);
                    arg49 = 700L;
                    arg65 = (long)40000 + System.currentTimeMillis() % (long)30000;
                    arg66 = "";
                    while (arg63 != null && (arg63).length() > 0) {
                        if (StringUtilities.LiteBansModule_31(arg63, "BaseCoreGenericHandler:", false, 2, null)) {
                            arg64 = this.plugin(arg63);
                        } else if (StringUtilities.LiteBansModule_31(arg63, "c:", false, 2, null)) {
                            arg66 = arg67 = MessageKey.BaseCoreGenericHandler(arg63.substring(2), false);
                        } else if (StringUtilities.LiteBansModule_31(arg63, "AsyncBackgroundTask_5:", false, 2, null)) {
                            arg8.c(MessageKey.BaseCoreGenericHandler(arg63.substring(2), false));
                        } else if (StringUtilities.LiteBansModule_31(arg63, "e:", false, 2, null)) {
                            arg49 = this.plugin(arg63);
                        } else if (StringUtilities.LiteBansModule_31(arg63, "LiteBansModule_194:", false, 2, null)) {
                            arg8.BaseCoreGenericHandler(this.plugin(arg63));
                        } else if (StringUtilities.LiteBansModule_31(arg63, "g:", false, 2, null)) {
                            arg8.c(this.plugin(arg63));
                        }
                        arg63 = arg44.readLine();
                    }
                    if (arg53) {
                        if (arg8.g()) {
                            arg8.BaseCoreGenericHandler((Object)"[!!\ufeff!] 0\ufeffx02");
                        }
                        try {
                            Thread.sleep(arg64);
                        }
                        catch (Throwable arg68) {
                            // empty catch block
                        }
                        ObjectUtilities.LiteBansModule_31(arg39, "");
                        arg39.c(true);
                        arg67 = ConfigService.e();
                        if (arg67.compareAndSet(false, true)) {
                            arg13.LiteBansModule_31(new UpdateCheckTask(arg13), arg49, arg65);
                        }
                        ((PluginModule)arg39).c();
                    } else {
                        ((BroadcastService)arg13.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(2);
                    }
                    if (StringUtilities.LiteBansModule_31(arg66) == false) {
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, arg13.HoverTextFormatter(), arg66, null, 4, null);
                    }
                    if (arg46.charAt(0) == '1') {
                        arg69   = new char[]{':'};
                        v8 = (String)CollectionUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(arg46, arg69  , false, 2, 2, null), 1);
                        if (v8 == null) {
                            v8 = arg67 = "undefined";
                        }
                        if (!ObjectUtilities.BaseCoreGenericHandler((Object)(arg70 = LiteBansModule_336.c()), arg67) && arg8.LiteBansModule_194().U()) {
                            arg69   = (char[])ConfigService.A();
                            if (arg69  .compareAndSet(false, true)) {
                                arg71 = TimeUnit.HOURS.toSeconds(4L) * (long)20;
                                arg72 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin java.lang.String java.lang.String ), ()V)((PlatformPlugin)arg13, (String)arg70, (String)arg67);
                                arg13.LiteBansModule_31(arg72, 1L, arg71);
}
                catch (Throwable arg73) {
                    v9 = arg1[0];
                    ObjectUtilities.LiteBansModule_31(v9, "");
                    ((ConfigService)((PlatformPlugin)v9).BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(arg73, 1);
}
            if (StringUtilities.LiteBansModule_31(v2) == false) {
                return;
}
        if ((arg5 = new File(v1)).exists()) {
            return;
        }
        arg74 = new URL(v2).openConnection();
        if (!arg2.verify(v2, null) || LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().PunishmentTableService() == PlatformPlugin.BaseCoreGenericHandler) {
            ObjectUtilities.LiteBansModule_31(arg74, "");
            ((HttpsURLConnection)arg74).setHostnameVerifier(arg2);
        }
        arg75   = arg74.getInputStream();
        arg76 = 8192;
        v10 = arg77   = arg75   instanceof BufferedInputStream != false ? (BufferedInputStream)arg75   : new BufferedInputStream(arg75  , arg76);
        if (StringUtilities.BaseCoreGenericHandler(v2, ".gz", false, 2, null)) {
            arg77   = new GZIPInputStream(arg77  );
        }
        if (StringUtilities.BaseCoreGenericHandler(v2, "tar.gz", false, 2, null)) {
            v11 = new ArjHandler("UTF-8").BaseCoreGenericHandler("tar", arg77  );
            ObjectUtilities.LiteBansModule_31(v11, "");
            arg77   = (GnuSparseMapHandler)v11;
            this.plugin((GnuSparseMapHandler)arg77  , v3);
        }
        arg75   = arg77  ;
        try {
            arg8 = arg75  ;
            try {
                LiteBansModule_373.BaseCoreGenericHandler((File)arg5, OutHandler.BaseCoreGenericHandler(arg77  ));
                arg10 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (IOException arg78) {
                arg10 = ConfigService.GnuSparseMapHandler.BaseCoreGenericHandler((File)arg5, arg78);
            }
            arg8 = arg10;
        }
        catch (Throwable arg79) {
            arg80 = arg79;
            throw arg79;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(arg75  , arg80);
}

    public static /* synthetic */ void BaseCoreGenericHandler(MariaDBDriverHandler ig_02, String string, String string2, String string3, Object[] objectArray, int n, Object targetObj) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        if ((n & 8) != 0) {
            objectArray = new Object[]{ }
        }
        ig_02.BaseCoreGenericHandler(string, string2, string3, objectArray);
    }

    public final String LiteBansModule_31(@NotNull byte[] byArray) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        if (messageDigest != null) {
            messageDigest.reset();
            byte[] byArray2 = messageDigest.digest(byArray);
            messageDigest.reset();
            return this.plugin(byArray2);
        }
        return "";
    }

    public final String BaseCoreGenericHandler(@Nullable byte[] byArray) {
        BigInteger bigInteger = new BigInteger(1, byArray);
        StringBuilder stringBuilder = new StringBuilder(bigInteger.toString(16));
        while (stringBuilder.length() < 64) {
            stringBuilder.insert(0, '0');
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final boolean BaseCoreGenericHandler(File file, IOException iOException) {
        try {
            file.delete();
        }
        finally {
            throw iOException;
}

    private final void BaseCoreGenericHandler(GnuSparseMapHandler j10, String string) {
        boolean flag;
{
            UserNameHandler bv_02;
            UserNameHandler bv_03;
            flag = false;
            do {
                LiteBansModule_235 gu_02;
                bv_02 = (gu_02 = j10.BaseCoreGenericHandler()) instanceof UserNameHandler ? (UserNameHandler)gu_02 : null;
                if (bv_02 == null) break;
            } while (!ObjectUtilities.BaseCoreGenericHandler((Object)(bv_03 = bv_02).getName(), string) && !StringUtilities.BaseCoreGenericHandler(bv_03.getName(), '/' + string, false, 2, null) || bv_03.isDirectory());
            flag = true;
        }
        if (!flag) {
            throw new IOException("Could not find \"" + string + "\" InitializerHandler_3 archive");
}

    private static final void BaseCoreGenericHandler(PlatformPlugin plugin, String string, String string2) {
        CommandSenderWrapper sender = plugin.HoverTextFormatter();
        sender.BaseCoreGenericHandler("[LiteBans] A plugin update is available! Your version: " + string + ", latest version: " + string2);
        sender.BaseCoreGenericHandler("[LiteBans] Updates can be downloaded from here:");
        sender.BaseCoreGenericHandler("[LiteBans] https://www.spigotmc.org/resources/litebans.3715/");
    }

    public /* synthetic */ MariaDBDriverHandler(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K", "", "X.509", "1", "TLS", "", "update.json", "", "", "", "", "-21191458502013", "sort", "00", "01:", "-1791906487", "8789648393", "876388351072311993428968062", "", "", "", "", "-", "", "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781", "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473", "", "", "%%__USER__%%", "No updates ", "mariadb", "mysql", "LiteBansModule_243", "pgsql", "&LiteBansModule_433=", "&i=", "&Utf8Handler_2=", "&q=", "&LiteBansModule_194=", "&DatabaseMonitorService=", "&AsyncBackgroundTask_5=", "&r=", "&BroadcastService=", "&GnuSparseMapHandler=", "&AsyncBackgroundTask_21=", "&LiteBansModule_31=", "", "\u0006p\ufffd", "", "BaseCoreGenericHandler:", "c:", "AsyncBackgroundTask_5:", "e:", "LiteBansModule_194:", "g:", "[!!\ufeff!] 0\ufeffx02", "", "undefined", "", "", ".gz", "tar.gz", "UTF-8", "tar", "", "SHA-256", "", "Could not find \"", "\" InitializerHandler_3 archive", "[LiteBans] A plugin update is available! Your version: ", ", latest version: ", "[LiteBans] Updates can be downloaded from here:", "[LiteBans] https://www.spigotmc.org/resources/litebans.3715/"};
}

