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
    public final void BaseCoreGenericHandler(@NotNull String v1, @NotNull String v2, @NotNull String v3, @NotNull Object[] var4_4) {
        block86: {
            block84: {
                var5_5 = new LiteBansModule_124();
                var6_6 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                var7_7 = KeyStore.getInstance(KeyStore.getDefaultType());
                if (var4_4.length != 1) break block86;
                try {
                    block90: {
                        block88: {
                            block89: {
                                block87: {
                                    var8_8 = new LiteBansException_2();
                                    var9_10 = System.currentTimeMillis();
                                    var11_12 = 0L;
                                    var13_14 = (ConfigService)LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
                                    v0 = LiteBansModule_228.BaseCoreGenericHandler("LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K");
                                    if (v0 == null) {
                                        throw var8_8;
                                    }
                                    var14_15 = v0;
                                    LiteBansCommand.i = "";
                                    var15_19 = new BufferedInputStream(new ByteArrayInputStream(var14_15));
                                    var16_20 = CertificateFactory.getInstance("X.509").generateCertificate((InputStream)var15_19);
                                    var7_7.load(null, null);
                                    var7_7.setCertificateEntry("1", var16_20);
                                    var6_6.init(var7_7);
                                    var17_22 = SSLContext.getInstance("TLS");
                                    v1 = var4_4[0];
                                    ObjectUtilities.LiteBansModule_31(v1, "");
                                    var18_23 = (PlatformPlugin)v1;
                                    var17_22.init(null, var6_6.getTrustManagers(), null);
                                    var19_24 = 0;
                                    var20_25 = var13_14;
                                    var21_27 = var19_24;
                                    var22_29 = 0;
                                    if (var20_25.g()) {
                                        var20_25.BaseCoreGenericHandler(var21_27);
                                    }
                                    var20_26 = 0;
                                    var21_28 = Math.min(65535, var13_14.m());
                                    var22_29 = var13_14.LiteBansModule_433() != false ? 1 : 0;
                                    var23_30 = var18_23.AsyncBackgroundTask_22();
                                    var24_31 = -1L;
                                    var26_32 = false;
                                    var27_33 = LiteBansModule_27.BaseCoreGenericHandler;
                                    var29_34 = var18_23.getDataFolder();
                                    var30_35 = "update.json";
                                    var31_36 = false;
                                    var28_38 = new File((File)var29_34, var30_35).exists();
                                    var29_34 = "";
                                    var30_35 = "";
                                    var31_37 = "";
                                    var32_39 = "";
                                    try {
                                        var30_35 = LiteBansModule_376.BaseCoreGenericHandler;
                                        var31_37 = LiteBansModule_237.BaseCoreGenericHandler;
                                        var32_39 = LiteBansModule_75.BaseCoreGenericHandler;
                                        var33_40 = "-21191458502013";
                                        if (var13_14.g() && Long.parseLong((String)var33_40) == (long)var21_28) {
                                            var35_42 = AbstractCommand.AsyncBackgroundTask_5;
                                            var36_43 = false;
                                            if (ObjectUtilities.BaseCoreGenericHandler(var33_40, (Object)"sort")) {
                                                var37_45 = new String[]{"00"};
                                                v2 = var37_45;
                                            } else {
                                                var37_45 = new String[]{"01:" + (String)var33_40};
                                                v2 = var37_45;
                                            }
                                            var34_46 = v2;
                                            new LiteBansModule_403((ConfigService)var13_14, Arrays.copyOf(var34_46, var34_46.length)).LiteBansModule_31();
                                        }
                                        var34_46 = "-1791906487";
                                        if (!StringUtilities.LiteBansModule_31(var30_35, (String)var33_40, false, 2, null) || !StringUtilities.BaseCoreGenericHandler(var30_35, (String)var34_46, false, 2, null)) {
                                            throw var8_8;
                                        }
                                        var35_42 = "8789648393";
                                        if (!StringUtilities.BaseCoreGenericHandler(var31_37, (String)var35_42, false, 2, null)) {
                                            throw var8_8;
                                        }
                                        var36_44 = "876388351072311993428968062";
                                        if (!StringUtilities.LiteBansModule_31(var32_39, var36_44, false, 2, null)) {
                                            throw var8_8;
                                        }
                                        var30_35 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(var30_35, (String)var33_40, "", false, 4, null), (String)var34_46, "", false, 4, null);
                                        var31_37 = StringUtilities.BaseCoreGenericHandler(var31_37, (String)var35_42, "", false, 4, null);
                                        var32_39 = StringUtilities.BaseCoreGenericHandler(var32_39, var36_44, "", false, 4, null);
                                        var29_34 = StringUtilities.BaseCoreGenericHandler(var30_35 + var31_37 + var32_39, "-", "", false, 4, null);
                                        if (!var28_38) {
                                            block82: {
                                                if (var29_34.length() <= 2) {
                                                    throw var8_8;
                                                }
                                                var37_45 = (CharSequence)var29_34;
                                                var38_47 = 0;
                                                for (var39_48 = 0; var39_48 < var37_45.length(); ++var39_48) {
                                                    var41_55 = var40_50 = var37_45.charAt(var39_48);
                                                    var42_57 = false;
                                                    if (!(Character.isDigit(var41_55) == false)) continue;
                                                    v3 = true;
                                                    break block82;
                                                }
                                                v3 = false;
                                            }
                                            if (v3) {
                                                throw var8_8;
                                            }
                                        }
                                        ((BroadcastService)var18_23.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(1);
                                    }
                                    catch (Throwable var33_41) {
                                        var19_24 += 50000;
                                        var11_12 |= 8L;
                                        var26_32 = true;
                                        ConfigService.BaseCoreGenericHandler((ConfigService)var13_14, var33_41, 0, 2, null);
                                    }
                                    var33_40 = null;
                                    var34_46 = "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781";
                                    ObjectUtilities.BaseCoreGenericHandler((Object)var27_33);
                                    if (!StringUtilities.LiteBansModule_31(var27_33, (String)var34_46, false, 2, null)) {
                                        var19_24 += 500;
                                    }
                                    if (!StringUtilities.BaseCoreGenericHandler(var27_33, (String)(var35_42 = "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473"), false, 2, null)) {
                                        var19_24 += 1000;
                                    }
                                    if (ObjectUtilities.BaseCoreGenericHandler((Object)(var36_44 = StringUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler(var27_33, (String)var34_46, "", false, 4, null), (String)var35_42, "", false, 4, null)), (Object)"%%__USER__%%") && !var28_38) {
                                        var19_24 += 2000;
                                        var26_32 = true;
                                        var37_45 = var13_14;
                                        var38_47 = 0;
                                        if (var37_45.g()) {
                                            var62_59 = var37_45;
                                            var39_48 = 0;
                                            var62_59.BaseCoreGenericHandler((Object)"No updates found + ");
                                        }
                                    }
                                    var37_45 = var13_14.LiteBansModule_194().ElementsHandler();
                                    switch (var37_45.hashCode()) {
                                        case 839186932: {
                                            if (!var37_45.equals("mariadb")) {
                                                ** break;
                                            }
                                            break block87;
                                        }
                                        case 104382626: {
                                            if (var37_45.equals("mysql")) break;
                                            ** break;
                                        }
                                        case 3274: {
                                            if (!var37_45.equals("LiteBansModule_243")) {
                                                ** break;
                                            }
                                            break block88;
                                        }
                                        case 106616951: {
                                            if (!var37_45.equals("pgsql")) {
                                                ** break;
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
lbl147:
                        // 5 sources

                        v4 = 9;
                    }
                    var20_26 = v4;
                    var37_45 = v2;
                    var38_47 = (int)(System.currentTimeMillis() % (long)64);
                    switch (var38_47) {
                        case 32: {
                            var37_45 = StringUtilities.BaseCoreGenericHandler((String)var37_45, LiteBansModule_242.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_242.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()) + '0', false, 4, null);
                            break;
                        }
                        case 4: {
                            var37_45 = StringUtilities.BaseCoreGenericHandler((String)var37_45, LiteBansModule_242.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.AsyncBackgroundTask_5()), LiteBansModule_242.BaseCoreGenericHandler('/', (CharSequence)LitebansHandler.LiteBansModule_31.e()), false, 4, null);
                        }
                    }
                    if (var22_29 == 0) {
                        Thread.sleep(10000 + new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler(900) * 1000);
                    }
                    var39_49 = (DatabaseMonitorService)var18_23.BaseCoreGenericHandler(DatabaseMonitorService.class);
                    try {
                        var40_51 = LiteBansModule_326.BaseCoreGenericHandler;
                        var41_55 = '\u0000';
                        var63_60 = 0L;
                        var63_60 = -1L;
                        var43_61 = StackTraceAnalyzer.BaseCoreGenericHandler(RemoteUpdateService.class);
                        var44_62 = new File((String)var43_61);
                        var45_66 = new JarInputStream(new FileInputStream(var44_62));
                        var46_67 = var45_66;
                        var47_69 = null;
                        try {
                            var48_71 = (JarInputStream)var46_67;
                            var49_72 = false;
                            var50_76 = null;
                            while ((v5 = (var50_76 = var45_66.getNextJarEntry())) != null && (v5 = v5.getName()) != null) {
                                var51_78 = v5;
                                if (var51_78.length() > 6) {
                                    var51_78 = StringUtilities.BaseCoreGenericHandler((String)var51_78, '/', '.', false, 4, null).substring(0, var51_78.length() - 6);
                                }
                                var52_79 = var50_76.getTime();
                                if (!ObjectUtilities.BaseCoreGenericHandler(var51_78, (Object)RemoteUpdateService.class.getName())) continue;
                                var63_60 = var52_79;
                            }
                            var48_71 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable var49_73) {
                            var47_69 = var49_73;
                            throw var49_73;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler(var46_67, var47_69);
                        }
                        var24_31 = var63_60 / 1000L;
                    }
                    catch (Throwable var40_52) {
                        var11_12 |= 4L;
                        ConfigService.BaseCoreGenericHandler((ConfigService)var13_14, var40_52, 0, 2, null);
                    }
                    try {
                        var26_32 = var26_32 != false || var5_5.verify(null, null) == false;
                    }
                    catch (Throwable var40_53) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)var13_14, var40_53, 0, 2, null);
                        var13_14.c((byte)2);
                        var26_32 = true;
                    }
                    var40_54 = var26_32 != false ? 1 : 0;
                    var41_56 = LiteBansModule_336.LiteBansModule_31();
                    var43_61 = new StringBuilder();
                    v6 = var43_61.append((String)var37_45).append("&LiteBansModule_433=").append(var19_24).append("&i=");
                    var44_63 = this.LiteBansModule_31();
                    this.plugin(var44_63 + 1);
                    v6.append(var44_63).append("&Utf8Handler_2=").append(var20_26).append("&q=").append(var21_28).append("&LiteBansModule_194=").append(var22_29).append("&DatabaseMonitorService=").append(var23_30).append("&AsyncBackgroundTask_5=").append(var24_31).append("&r=").append(var36_44).append("&BroadcastService=").append((String)var29_34).append("&GnuSparseMapHandler=").append(var40_54).append("&AsyncBackgroundTask_21=").append(var11_12);
                    var43_61.append("&LiteBansModule_31=").append(var41_56);
                    var42_58 = var43_61.toString();
                    v7 = var33_40 = new URL(null, var42_58, null).openConnection();
                    ObjectUtilities.LiteBansModule_31(v7, "");
                    var43_61 = (HttpsURLConnection)v7;
                    var43_61.setSSLSocketFactory(var17_22.getSocketFactory());
                    var43_61.setHostnameVerifier(var5_5);
                    try {
                        ((HttpsURLConnection)var33_40).setReadTimeout(40000);
                        ((HttpsURLConnection)var33_40).setConnectTimeout(40000);
                    }
                    catch (Throwable var44_64) {
                        ConfigService.BaseCoreGenericHandler((ConfigService)var13_14, var44_64, 0, 2, null);
                    }
                    var44_65 = ((HttpsURLConnection)var33_40).getInputStream();
                    var45_66 = new BufferedReader(new InputStreamReader(var44_65, StandardCharsets.UTF_8));
                    var33_40 = null;
                    var46_68 = 210;
                    var47_70 = 1000;
                    var48_71 = var45_66.readLine();
                    if (var48_71 == null || !(((CharSequence)var48_71).length() > 0)) break block84;
                    var49_75 = var45_66.readLine();
                    var26_32 = var26_32 != false || StringUtilities.BaseCoreGenericHandler((CharSequence)var48_71, (CharSequence)"\u0006p\ufffd", false, 2, null) != false;
                    var50_77 = (long)(var46_68 * var47_70) + var9_10 % (long)(var47_70 * var47_70) + (long)(var46_68 * var47_70);
                    var52_79 = 700L;
                    var54_80 = (long)40000 + System.currentTimeMillis() % (long)30000;
                    var56_81 = "";
                    while (var49_75 != null && ((CharSequence)var49_75).length() > 0) {
                        if (StringUtilities.LiteBansModule_31(var49_75, "BaseCoreGenericHandler:", false, 2, null)) {
                            var50_77 = this.plugin(var49_75);
                        } else if (StringUtilities.LiteBansModule_31(var49_75, "c:", false, 2, null)) {
                            var56_81 = var57_82 = MessageKey.BaseCoreGenericHandler(var49_75.substring(2), false);
                        } else if (StringUtilities.LiteBansModule_31(var49_75, "AsyncBackgroundTask_5:", false, 2, null)) {
                            var13_14.c(MessageKey.BaseCoreGenericHandler(var49_75.substring(2), false));
                        } else if (StringUtilities.LiteBansModule_31(var49_75, "e:", false, 2, null)) {
                            var52_79 = this.plugin(var49_75);
                        } else if (StringUtilities.LiteBansModule_31(var49_75, "LiteBansModule_194:", false, 2, null)) {
                            var13_14.BaseCoreGenericHandler(this.plugin(var49_75));
                        } else if (StringUtilities.LiteBansModule_31(var49_75, "g:", false, 2, null)) {
                            var13_14.c((byte)this.plugin(var49_75));
                        }
                        var49_75 = var45_66.readLine();
                    }
                    if (var26_32) {
                        if (var13_14.g()) {
                            var13_14.BaseCoreGenericHandler((Object)"[!!\ufeff!] 0\ufeffx02");
                        }
                        try {
                            Thread.sleep(var50_77);
                        }
                        catch (Throwable var57_83) {
                            // empty catch block
                        }
                        ObjectUtilities.LiteBansModule_31(var39_49, "");
                        var39_49.c(true);
                        var57_82 = ConfigService.e();
                        var58_84 = false;
                        if (var57_82.compareAndSet(false, true)) {
                            var18_23.LiteBansModule_31(new UpdateCheckTask(var18_23), var52_79, var54_80);
                        }
                        ((PluginModule)var39_49).c();
                    } else {
                        ((BroadcastService)var18_23.BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(2);
                    }
                    if (StringUtilities.LiteBansModule_31((CharSequence)var56_81) == false) {
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, var18_23.HoverTextFormatter(), (CharSequence)var56_81, null, 4, null);
                    }
                    if (var48_71.charAt(0) == '1') {
                        var59_86 /* !! */  = new char[]{':'};
                        v8 = (String)CollectionUtilities.BaseCoreGenericHandler(StringUtilities.BaseCoreGenericHandler((CharSequence)var48_71, var59_86 /* !! */ , false, 2, 2, null), 1);
                        if (v8 == null) {
                            v8 = var57_82 = "undefined";
                        }
                        if (!ObjectUtilities.BaseCoreGenericHandler((Object)(var58_85 = LiteBansModule_336.c()), var57_82) && var13_14.LiteBansModule_194().U()) {
                            var59_86 /* !! */  = (char[])ConfigService.A();
                            var60_88 = false;
                            if (var59_86 /* !! */ .compareAndSet(false, true)) {
                                var59_87 = TimeUnit.HOURS.toSeconds(4L) * (long)20;
                                var61_89 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin java.lang.String java.lang.String ), ()V)((PlatformPlugin)var18_23, (String)var58_85, (String)var57_82);
                                var18_23.LiteBansModule_31(var61_89, 1L, var59_87);
                            }
                        }
                    }
                }
                catch (Throwable var8_9) {
                    v9 = var4_4[0];
                    ObjectUtilities.LiteBansModule_31(v9, "");
                    ((ConfigService)((PlatformPlugin)v9).BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(var8_9, 1);
                }
            }
            if (StringUtilities.LiteBansModule_31((CharSequence)v2) == false) {
                return;
            }
        }
        if ((var8_8 = new File(v1)).exists()) {
            return;
        }
        var9_11 = new URL(v2).openConnection();
        if (!var5_5.verify(v2, null) || LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().PunishmentTableService() == PlatformPlugin.BaseCoreGenericHandler) {
            ObjectUtilities.LiteBansModule_31(var9_11, "");
            ((HttpsURLConnection)var9_11).setHostnameVerifier(var5_5);
        }
        var10_90 /* !! */  = null;
        var11_13 /* !! */  = var9_11.getInputStream();
        var12_91 = 8192;
        v10 = var10_90 /* !! */  = var11_13 /* !! */  instanceof BufferedInputStream != false ? (BufferedInputStream)var11_13 /* !! */  : new BufferedInputStream(var11_13 /* !! */ , var12_91);
        if (StringUtilities.BaseCoreGenericHandler(v2, ".gz", false, 2, null)) {
            var10_90 /* !! */  = new GZIPInputStream(var10_90 /* !! */ );
        }
        if (StringUtilities.BaseCoreGenericHandler(v2, "tar.gz", false, 2, null)) {
            v11 = new ArjHandler("UTF-8").BaseCoreGenericHandler("tar", var10_90 /* !! */ );
            ObjectUtilities.LiteBansModule_31(v11, "");
            var10_90 /* !! */  = (GnuSparseMapHandler)v11;
            this.plugin((GnuSparseMapHandler)var10_90 /* !! */ , v3);
        }
        var11_13 /* !! */  = var10_90 /* !! */ ;
        var12_92 = null;
        try {
            var13_14 = var11_13 /* !! */ ;
            var14_16 = false;
            try {
                LiteBansModule_373.BaseCoreGenericHandler((File)var8_8, OutHandler.BaseCoreGenericHandler(var10_90 /* !! */ ));
                var15_19 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (IOException var16_21) {
                var15_19 = ConfigService.GnuSparseMapHandler.BaseCoreGenericHandler((File)var8_8, var16_21);
            }
            var13_14 = var15_19;
        }
        catch (Throwable var14_17) {
            var12_92 = var14_17;
            throw var14_17;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(var11_13 /* !! */ , var12_92);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(MariaDBDriverHandler ig_02, String string, String string2, String string3, Object[] objectArray, int n, Object object) {
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
                LiteBansModule_235 gu_02;
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
        BaseCoreGenericHandler = new String[]{"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUZDakNDQS9LZ0F3SUJBZ0lTQVdSWkdHRUt6NlN2ZFEzT3lDR285L2FJTUEwR0NTcUdTSWIzRFFFQkN3VUEKTUVveEN6QUpCZ05WQkFZVEFsVlRNUll3RkFZRFZRUUtFdzFNWlhRbmN5QkZibU55ZVhCME1TTXdJUVlEVlFRRApFeHBNWlhRbmN5QkZibU55ZVhCMElFRjFkR2h2Y21sMGVTQllNVEFlRncweE5qQXlNRGt3TmpVeE1EQmFGdzB4Ck5qQTFNRGt3TmpVeE1EQmFNQjR4SERBYUJnTlZCQU1URTJ4cGRHVmlZVzV6TG1RdGJpMXpMbTVoYldVd2dnRWkKTUEwR0NTcUdTSWIzRFFFQkFRVUFBNElCRHdBd2dnRUtBb0lCQVFDdHcwc0k3d1VhY3c1MUVHT1Rkd1JwMG1NYgoyYTc4clNhaTh4bFNPRUhnUG1oampZZCtnaDA1MzY2NE5vZmFWbTJFYjN2d0xTNFNiWmRLWDdmSXYzVk9CODFwCjZlUmt1ODFNRmtZWkRJWVRDZEc2Q3RnenlpYmVSREFFUkF4QnptSjFyT1ZuSGx2SGZBUkl2YlV3S3AzNVVnS1oKdm53SkY0TzJLOURlUGQzTnNvSDVLYmhQRlVmWkdGVzg2VVhCNHdobndHek0rcEN1WTNkSzZsTUdmNWlac01OYQpUbFE3OCtLRnFuSWRyNUI4TnE1OU5GcTJqTkVhSEQ2c0ZwOWN0bFVoMGUzRllCQ0FUSmx3eHkvbHAxUFAvTnJSClFkdi9Db0RacEh4b2ZQc1VhZkplSHFTWHRTRGF4YXJvcDlUcVNkK3BZeDBqN25UZGo3aGlvS2d2VnpseEFnTUIKQUFHamdnSVVNSUlDRURBT0JnTlZIUThCQWY4RUJBTUNCYUF3SFFZRFZSMGxCQll3RkFZSUt3WUJCUVVIQXdFRwpDQ3NHQVFVRkJ3TUNNQXdHQTFVZEV3RUIvd1FDTUFBd0hRWURWUjBPQkJZRUZBbjF6ZnJseGZHZU52VzN6ait0CjJsUUhWOXQ3TUI4R0ExVWRJd1FZTUJhQUZLaEthbU1FZmQyNjV0RTV0NlpGWmUvenFPeWhNSEFHQ0NzR0FRVUYKQndFQkJHUXdZakF2QmdnckJnRUZCUWN3QVlZamFIUjBjRG92TDI5amMzQXVhVzUwTFhneExteGxkSE5sYm1OeQplWEIwTG05eVp5OHdMd1lJS3dZQkJRVUhNQUtHSTJoMGRIQTZMeTlqWlhKMExtbHVkQzE0TVM1c1pYUnpaVzVqCmNubHdkQzV2Y21jdk1CNEdBMVVkRVFRWE1CV0NFMnhwZEdWaVlXNXpMbVF0YmkxekxtNWhiV1V3Z2Y0R0ExVWQKSUFTQjlqQ0I4ekFJQmdabmdRd0JBZ0V3Z2VZR0N5c0dBUVFCZ3Q4VEFRRUJNSUhXTUNZR0NDc0dBUVVGQndJQgpGaHBvZEhSd09pOHZZM0J6TG14bGRITmxibU55ZVhCMExtOXlaekNCcXdZSUt3WUJCUVVIQWdJd2daNE1nWnRVCmFHbHpJRU5sY25ScFptbGpZWFJsSUcxaGVTQnZibXg1SUdKbElISmxiR2xsWkNCMWNHOXVJR0o1SUZKbGJIbHAKYm1jZ1VHRnlkR2xsY3lCaGJtUWdiMjVzZVNCcGJpQmhZMk52Y21SaGJtTmxJSGRwZEdnZ2RHaGxJRU5sY25ScApabWxqWVhSbElGQnZiR2xqZVNCbWIzVnVaQ0JoZENCb2RIUndjem92TDJ4bGRITmxibU55ZVhCMExtOXlaeTl5ClpYQnZjMmwwYjNKNUx6QU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFTQmJrR3lZSzR0SmkyT0l1RDRoTVpuL2UKRTlEUU1YNDZNaW8vUzk2U2dpNnJXNmJBcjJYVzB0bWZxUDdhYk5ORlRtY3BwOG9VU0lraS9UbVI5REhwMTVtaApoYzdkRE01TkhRWEdxYWpFOWNneU41MkV0anJ6cGlnaGRHdmw3VGNNZC91cDBZM1d4V2cvemp6RFR6eE1rSVExCnZWVzJQa0RxRkEyNmNRVXpXb3NRTVJOTEtPTSt0V0FBRUU3Y1lBbm14ZkM4TFh4QWlJZWhRR2dqZGI5MFZ4RWMKY0hsMFhPdllaei9wTFVOTkpwVng1eXN2N2RhaUU0dUpZaW9VZkQ1QzloSWxWM3RCUXcwZTlSVnB4bVg5ZEhwVgpieWRGTkFKa2I1aisrdUU5WWZITDRXY2dNVlZ5eW1kU2FFWGI0emRYcWdoazhCZ2Z4elM3L0VQbzV6ZUt2dz09Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K", "", "X.509", "1", "TLS", "", "update.json", "", "", "", "", "-21191458502013", "sort", "00", "01:", "-1791906487", "8789648393", "876388351072311993428968062", "", "", "", "", "-", "", "77142279618762583716915802830664028160381816839200849895833086316046599897565495296301633642928516100659422026751902632646240606158132011324235224682789572320413657329749823729466236774219045476845688824011687517038577865262173025224647375120762510298006793590971759907389418516149881643063556368016552931006558313169398152352863252940493091887062941152768079609276953467974034339710188293294166565323128989959616880915847140982481229549612370871883749596940435680331285085594861403563438897681038246432564219490818466231932533492140440102030122615365584720054680934680594985467317003384725667443979235356484349781", "1950080441763815322170158693513766492531305559420856414018737427901166880837906237360560160969692876550997668532952916344716211578073391135033229394728126082925273168395856512366386928886800893919058564567497939674755045703882906421509459467135560094231479911966092661101837538525202646669789146291238940296391068810518947718916854756047592891550678660916304472518445707563423064538119606401291793147699473", "", "", "%%__USER__%%", "No updates ", "mariadb", "mysql", "LiteBansModule_243", "pgsql", "&LiteBansModule_433=", "&i=", "&Utf8Handler_2=", "&q=", "&LiteBansModule_194=", "&DatabaseMonitorService=", "&AsyncBackgroundTask_5=", "&r=", "&BroadcastService=", "&GnuSparseMapHandler=", "&AsyncBackgroundTask_21=", "&LiteBansModule_31=", "", "\u0006p\ufffd", "", "BaseCoreGenericHandler:", "c:", "AsyncBackgroundTask_5:", "e:", "LiteBansModule_194:", "g:", "[!!\ufeff!] 0\ufeffx02", "", "undefined", "", "", ".gz", "tar.gz", "UTF-8", "tar", "", "SHA-256", "", "Could not find \"", "\" InitializerHandler_3 archive", "[LiteBans] A plugin update is available! Your version: ", ", latest version: ", "[LiteBans] Updates can be downloaded from here:", "[LiteBans] https://www.spigotmc.org/resources/litebans.3715/"};
    }

    }

