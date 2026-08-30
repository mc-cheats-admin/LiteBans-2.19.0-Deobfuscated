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
    public final void BaseCoreGenericHandler(@NotNull String v1, @NotNull String v2, @NotNull String v3, @NotNull Object[] v4) {
        block86: {
            block84: {
                v5 = new LiteBansModule_125();
                v6 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                v7 = KeyStore.getInstance(KeyStore.getDefaultType());
                if (v4.length != 1) break block86;
                try {
                    block90: {
                        block88: {
                            block89: {
                                block87: {
                                    v8 = new LiteBansException_2();
                                    v9 = System.currentTimeMillis();
                                    v10 = 0L;
                                    v11 = (ConfigService)LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
                                    v0 = LiteBansModule_229.BaseCoreGenericHandler("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K");
                                    if (v0 == null) {
                                        throw v8;
                                    }
                                    v12 = v0;
                                    LiteBansCommand.i = "";
                                    v13 = new BufferedInputStream(new ByteArrayInputStream(v12));
                                    v14 = CertificateFactory.getInstance("X.509").generateCertificate((InputStream)v13);
                                    v7.load(null, null);
                                    v7.setCertificateEntry("1", v14);
                                    v6.init(v7);
                                    v15 = SSLContext.getInstance("TLS");
                                    v1 = v4[0];
                                    ObjectUtilities.LiteBansModule_31(v1, "");
                                    v16 = (PlatformPlugin)v1;
                                    v15.init(null, v6.getTrustManagers(), null);
                                    v17 = v11;
                                    v18 = v19;
                                    if (v17.g()) {
                                        v17.BaseCoreGenericHandler(v18);
                                    }
                                    v20 = Math.min(65535, v11.m());
                                    v21 = v11.LiteBansModule_435() != false ? 1 : 0;
                                    v22 = v16.AsyncBackgroundTask_22();
                                    v23 = -1L;
                                    v24 = LiteBansModule_27.BaseCoreGenericHandler;
                                    v25 = v16.getDataFolder();
                                    v26 = "update.json";
                                    v27 = new File((File)v25, v26).exists();
                                    v25 = "";
                                    v26 = "";
                                    v28 = "";
                                    v29 = "";
                                    try {
                                        v26 = LiteBansModule_378.BaseCoreGenericHandler;
                                        v28 = LiteBansModule_238.BaseCoreGenericHandler;
                                        v29 = LiteBansModule_76.BaseCoreGenericHandler;
                                        v30 = "-21191458502013";
                                        if (v11.g() && Long.parseLong((String)v30) == (long)v20) {
                                            v31 = AbstractCommand.AsyncBackgroundTask_5;
                                            if (ObjectUtilities.BaseCoreGenericHandler(v30, (Object)"sort")) {
                                                v32 = new String[]{"00"};
                                                v2 = v32;
                                            } else {
                                                v32 = new String[]{"01:" + (String)v30};
                                                v2 = v32;
                                            }
                                            v33 = v2;
                                            new LiteBansModule_405((ConfigService)v11, Arrays.copyOf(v33, v33.length)).LiteBansModule_31();
                                        }
                                        v33 = "-1791906487";
                                        if (!StringUtilities.LiteBansModule_31(v26, (String)v30, false, 2, null) || !StringUtilities.BaseCoreGenericHandler(v26, (String)v33, false, 2, null)) {
                                            throw v8;
                                        }
                                        v31 = "8789648393";
                                        if (!StringUtilities.BaseCoreGenericHandler(v28, (String)v31, false, 2, null)) {
                                            throw v8;
                                        }
                                        v34 = "876388351072311993428968062";
                                        if (!StringUtilities.LiteBansModule_31(v29, v34, false, 2, null)) {
                                            throw v8;
                                        }
                                        v26 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(v26, (String)v30, "", false, 4, null), (String)v33, "", false, 4, null);
                                        v28 = StringUtilities.BaseCoreGenericHandler(v28, (String)v31, "", false, 4, null);
                                        v29 = StringUtilities.BaseCoreGenericHandler(v29, v34, "", false, 4, null);
                                        v25 = StringUtilities.BaseCoreGenericHandler(v26 + v28 + v29, "-", "", false, 4, null);
                                        if (!v27) {
                                            block82: {
                                                if (v25.length() <= 2) {
                                                    throw v8;
                                                }
                                                v32 = (CharSequence)v25;
                                                for (v35 = 0; v35 < v32.length(); ++v35) {
                                                    v36 = v37 = v32.charAt(v35);
                                                    if (!(Character.isDigit(v36) == false)) continue;
                                                    v3 = true;
                                                    break block82;
                                                }
                                                v3 = false;
                                            }
                                            if (v3) {
                                                throw v8;
                                            }
                                        }
                                        ((BroadcastService)v16.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(1);
                                    }
                                    catch (Throwable v38) {
                                        v19 += 50000;
                                        v10 |= 8L;
                                        ConfigService.BaseCoreGenericHandler((ConfigService)v11, v38, 0, 2, null);
                                    }
                                    v33 = "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781";
                                    ObjectUtilities.BaseCoreGenericHandler((Object)v24);
                                    if (!StringUtilities.LiteBansModule_31(v24, (String)v33, false, 2, null)) {
                                        v19 += 500;
                                    }
                                    if (!StringUtilities.BaseCoreGenericHandler(v24, (String)(v31 = "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473"), false, 2, null)) {
                                        v19 += 1000;
                                    }
                                    if (ObjectUtilities.BaseCoreGenericHandler((Object)(v34 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(v24, (String)v33, "", false, 4, null), (String)v31, "", false, 4, null)), (Object)"%%__USER__%%") && !v27) {
                                        v19 += 2000;
                                        v32 = v11;
                                        if (v32.g()) {
                                            v39 = v32;
                                            v39.BaseCoreGenericHandler((Object)"No updates found + ");
                                        }
                                    }
                                    v32 = v11.LiteBansModule_195().ElementsHandler();
                                    switch (v32.hashCode()) {
                                        case 839186932: {
                                            if (!v32.equals("mariadb")) {
                                                break;
                                            }
                                            break block87;
                                        }
                                        case 104382626: {
                                            if (v32.equals("mysql")) break;
                                            break;
                                        }
                                        case 3274: {
                                            if (!v32.equals("LiteBansModule_244")) {
                                                break;
                                            }
                                            break block88;
                                        }
                                        case 106616951: {
                                            if (!v32.equals("pgsql")) {
                                                break;
                                            }
                                            break block89;
                                        }
                                    }
                                    v4 = 7;
                                    break block90;
                                }
                                v4 = 4;
                                break block90;
                            }
                            v4 = 5;
                            break block90;
                        }
                        v4 = 6;
                        break block90;
                                                v4 = 9;
                    }
                    v40 = v4;
                    v32 = v2;
                    v41 = (int)(System.currentTimeMillis() % (long)64);
                    switch (v41) {
                        case 32: {
                            v32 = StringUtilities.BaseCoreGenericHandler((String)v32, LiteBansModule_243.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_243.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()) + '0', false, 4, null);
                            break;
                        }
                        case 4: {
                            v32 = StringUtilities.BaseCoreGenericHandler((String)v32, LiteBansModule_243.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_243.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.e()), false, 4, null);
                        }
                    }
                    if (v21 == 0) {
                        Thread.sleep(10000 + new LiteBansModule_325(0L, 1, null).BaseCoreGenericHandler(900) * 1000);
                    }
                    v42 = (DatabaseMonitorService)v16.BaseCoreGenericHandler(DatabaseMonitorService.class);
                    try {
                        v43 = LiteBansModule_327.BaseCoreGenericHandler;
                        v36 = '\u0000';
                        v44 = 0L;
                        v44 = -1L;
                        v45 = StackTraceAnalyzer.BaseCoreGenericHandler(RemoteUpdateService.class);
                        v46 = new File((String)v45);
                        v47 = new JarInputStream(new FileInputStream(v46));
                        v48 = v47;
                        try {
                            v49 = (JarInputStream)v48;
                            while ((v5 = (v50 = v47.getNextJarEntry())) != null && (v5 = v5.getName()) != null) {
                                v51 = v5;
                                if (v51.length() > 6) {
                                    v51 = StringUtilities.BaseCoreGenericHandler((String)v51, '/', '.', false, 4, null).substring(0, v51.length() - 6);
                                }
                                v52 = v50.getTime();
                                if (!ObjectUtilities.BaseCoreGenericHandler(v51, (Object)RemoteUpdateService.class.getName())) continue;
                                v44 = v52;
                            }
                            v49 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable v53) {
                            v54 = v53;
                            throw v53;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler(v48, v54);
                        }
                        v23 = v44 / 1000L;
                    }
                    catch (Throwable v55) {
                        v10 |= 4L;
                        ConfigService.BaseCoreGenericHandler((ConfigService)v11, v55, 0, 2, null);
                    }
                    try {
                        v56 = v56 != false || v5.verify(null, null) == false;
                    }
                    catch (Throwable v57) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)v11, v57, 0, 2, null);
                        v11.c((byte)2);
                    }
                    v58 = v56 != false ? 1 : 0;
                    v59 = LiteBansModule_337.LiteBansModule_31();
                    v45 = new StringBuilder();
                    v6 = v45.append((String)v32).append("&LiteBansModule_435=").append(v19).append("&i=");
                    v60 = this.LiteBansModule_31();
                    this.plugin(v60 + 1);
                    v6.append(v60).append("&Utf8Handler_2=").append(v40).append("&q=").append(v20).append("&LiteBansModule_195=").append(v21).append("&DatabaseMonitorService=").append(v22).append("&AsyncBackgroundTask_5=").append(v23).append("&r=").append(v34).append("&BroadcastService=").append((String)v25).append("&GnuSparseMapHandler=").append(v58).append("&AsyncBackgroundTask_21=").append(v10);
                    v45.append("&LiteBansModule_31=").append(v59);
                    v61 = v45.toString();
                    v7 = v30 = new URL(null, v61, null).openConnection();
                    ObjectUtilities.LiteBansModule_31(v7, "");
                    v45 = (HttpsURLConnection)v7;
                    v45.setSSLSocketFactory(v15.getSocketFactory());
                    v45.setHostnameVerifier(v5);
                    try {
                        ((HttpsURLConnection)v30).setReadTimeout(40000);
                        ((HttpsURLConnection)v30).setConnectTimeout(40000);
                    }
                    catch (Throwable v62) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)v11, v62, 0, 2, null);
                    }
                    v63 = ((HttpsURLConnection)v30).getInputStream();
                    v47 = new BufferedReader(new InputStreamReader(v63, StandardCharsets.UTF_8));
                    v64 = 210;
                    v65 = 1000;
                    v49 = v47.readLine();
                    if (v49 == null || !(((CharSequence)v49).length() > 0)) break block84;
                    v66 = v47.readLine();
                    v56 = v56 != false || StringUtilities.BaseCoreGenericHandler((CharSequence)v49, (CharSequence)"\u0006p\ufffd", false, 2, null) != false;
                    v67 = (long)(v64 * v65) + v9 % (long)(v65 * v65) + (long)(v64 * v65);
                    v52 = 700L;
                    v68 = (long)40000 + System.currentTimeMillis() % (long)30000;
                    v69 = "";
                    while (v66 != null && ((CharSequence)v66).length() > 0) {
                        if (StringUtilities.LiteBansModule_31(v66, "BaseCoreGenericHandler:", false, 2, null)) {
                            v67 = this.plugin(v66);
                        } else if (StringUtilities.LiteBansModule_31(v66, "c:", false, 2, null)) {
                            v69 = v70 = MessageKey.BaseCoreGenericHandler(v66.substring(2), false);
                        } else if (StringUtilities.LiteBansModule_31(v66, "AsyncBackgroundTask_5:", false, 2, null)) {
                            v11.c(MessageKey.BaseCoreGenericHandler(v66.substring(2), false));
                        } else if (StringUtilities.LiteBansModule_31(v66, "e:", false, 2, null)) {
                            v52 = this.plugin(v66);
                        } else if (StringUtilities.LiteBansModule_31(v66, "LiteBansModule_195:", false, 2, null)) {
                            v11.BaseCoreGenericHandler(this.plugin(v66));
                        } else if (StringUtilities.LiteBansModule_31(v66, "g:", false, 2, null)) {
                            v11.c((byte)this.plugin(v66));
                        }
                        v66 = v47.readLine();
                    }
                    if (v56) {
                        if (v11.g()) {
                            v11.BaseCoreGenericHandler((Object)"[!!\ufeff!] 0\ufeffx02");
                        }
                        try {
                            Thread.sleep(v67);
                        }
                        catch (Throwable v71) {
                            // empty catch block
                        }
                        ObjectUtilities.LiteBansModule_31(v42, "");
                        v42.c(true);
                        v70 = ConfigService.e();
                        if (v70.compareAndSet(false, true)) {
                            v16.LiteBansModule_31(new UpdateCheckTask(v16), v52, v68);
                        }
                        ((PluginModule)v42).c();
                    } else {
                        ((BroadcastService)v16.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(2);
                    }
                    if (StringUtilities.LiteBansModule_31((CharSequence)v69) == false) {
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v16.HoverTextFormatter(), (CharSequence)v69, null, 4, null);
                    }
                    if (v49.charAt(0) == '1') {
                        v72   = new char[]{':'};
                        v8 = (String)CollectionUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler((CharSequence)v49, v72  , false, 2, 2, null), 1);
                        if (v8 == null) {
                            v8 = v70 = "undefined";
                        }
                        if (!ObjectUtilities.BaseCoreGenericHandler((Object)(v73 = LiteBansModule_337.c()), v70) && v11.LiteBansModule_195().U()) {
                            v72   = (char[])ConfigService.A();
                            if (v72  .compareAndSet(false, true)) {
                                v74 = TimeUnit.HOURS.toSeconds(4L) * (long)20;
                                v75 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin java.lang.String java.lang.String ), ()V)((PlatformPlugin)v16, (String)v73, (String)v70);
                                v16.LiteBansModule_31(v75, 1L, v74);
                            }
                        }
                    }
                }
                catch (Throwable v76) {
                    v9 = v4[0];
                    ObjectUtilities.LiteBansModule_31(v9, "");
                    ((ConfigService)((PlatformPlugin)v9).BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(v76, 1);
                }
            }
            if (StringUtilities.LiteBansModule_31((CharSequence)v2) == false) {
                return;
            }
        }
        if ((v8 = new File(v1)).exists()) {
            return;
        }
        v77 = new URL(v2).openConnection();
        if (!v5.verify(v2, null) || LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler().PunishmentTableService() == PlatformPlugin.BaseCoreGenericHandler) {
            ObjectUtilities.LiteBansModule_31(v77, "");
            ((HttpsURLConnection)v77).setHostnameVerifier(v5);
        }
        v78   = v77.getInputStream();
        v79 = 8192;
        v10 = v80   = v78   instanceof BufferedInputStream != false ? (BufferedInputStream)v78   : new BufferedInputStream(v78  , v79);
        if (StringUtilities.BaseCoreGenericHandler(v2, ".gz", false, 2, null)) {
            v80   = new GZIPInputStream(v80  );
        }
        if (StringUtilities.BaseCoreGenericHandler(v2, "tar.gz", false, 2, null)) {
            v11 = new ArjHandler("UTF-8").BaseCoreGenericHandler("tar", v80  );
            ObjectUtilities.LiteBansModule_31(v11, "");
            v80   = (GnuSparseMapHandler)v11;
            this.plugin((GnuSparseMapHandler)v80  , v3);
        }
        v78   = v80  ;
        try {
            v11 = v78  ;
            try {
                LiteBansModule_375.BaseCoreGenericHandler((File)v8, OutHandler.BaseCoreGenericHandler(v80  ));
                v13 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (IOException v81) {
                v13 = ConfigService.GnuSparseMapHandler.BaseCoreGenericHandler((File)v8, v81);
            }
            v11 = v13;
        }
        catch (Throwable v82) {
            v83 = v82;
            throw v82;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(v78  , v83);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(MariaDBDriverHandler ig_02, String string, String string2, String string3, Object[] objectArray, int n, Object targetObj) {
        if ((n & 4) != 0) {
            string3 = string;
        }
        if ((n & 8) != 0) {
            objectArray = new Object[]{};
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
    }

    private final void BaseCoreGenericHandler(GnuSparseMapHandler j10, String string) {
        boolean flag;
        block2: {
            UserNameHandler bv_02;
            UserNameHandler bv_03;
            flag = false;
            do {
                LiteBansModule_236 gu_02;
                bv_02 = (gu_02 = j10.BaseCoreGenericHandler()) instanceof UserNameHandler ? (UserNameHandler)gu_02 : null;
                if (bv_02 == null) break block2;
            } while (!ObjectUtilities.BaseCoreGenericHandler((Object)(bv_03 = bv_02).getName(), (Object)string) && !StringUtilities.BaseCoreGenericHandler(bv_03.getName(), '/' + string, false, 2, null) || bv_03.isDirectory());
            flag = true;
        }
        if (!flag) {
            throw new IOException("Could not find \"" + string + "\" InitializerHandler_3 archive");
        }
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
        BaseCoreGenericHandler = new String[]{"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K", "", "X.509", "1", "TLS", "", "update.json", "", "", "", "", "-21191458502013", "sort", "00", "01:", "-1791906487", "8789648393", "876388351072311993428968062", "", "", "", "", "-", "", "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781", "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473", "", "", "%%__USER__%%", "No updates ", "mariadb", "mysql", "LiteBansModule_244", "pgsql", "&LiteBansModule_435=", "&i=", "&Utf8Handler_2=", "&q=", "&LiteBansModule_195=", "&DatabaseMonitorService=", "&AsyncBackgroundTask_5=", "&r=", "&BroadcastService=", "&GnuSparseMapHandler=", "&AsyncBackgroundTask_21=", "&LiteBansModule_31=", "", "\u0006p\ufffd", "", "BaseCoreGenericHandler:", "c:", "AsyncBackgroundTask_5:", "e:", "LiteBansModule_195:", "g:", "[!!\ufeff!] 0\ufeffx02", "", "undefined", "", "", ".gz", "tar.gz", "UTF-8", "tar", "", "SHA-256", "", "Could not find \"", "\" InitializerHandler_3 archive", "[LiteBans] A plugin update is available! Your version: ", ", latest version: ", "[LiteBans] Updates can be downloaded from here:", "[LiteBans] https://www.spigotmc.org/resources/litebans.3715/"};
    }

    static {
        MariaDBDriverHandler.BaseCoreGenericHandler();
    }
}

