package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class DiscordWebhookClient {
    private final PlatformPlugin ServerSyncService;
    private final DatabaseService A;
    private String BroadcastService;
    private String ai;
    private String BaseCoreGenericHandler;
    private final String SQLiteDriverHandler;
    private final String aU;
    private final String aM;
    private final String AsyncBackgroundTask_22;
    private final String LiteBansModule_9;
    private final String LiteBansModule_17;
    private final String BanHandler;
    private final String[] CommandExitException;
    private final int PlayerQuitListener;
    private final int LiteBansModule_13;
    private final long L;
    private final long i;
    private final long ak;
    private final long LiteBansModule_433;
    private final List LockdownCommandHandler;
    private final Set B;
    private final boolean BanHandler_4;
    private final String[] CommandThrottleService;
    private final boolean bd;
    private final boolean BanHandler_2;
    private final String aE;
    private final boolean LiteBansModule_25;
    private final boolean aj;
    private final boolean af;
    private final String be;
    private final String[] LiteBansModule;
    private final String[] TapeHandler;
    private final boolean LiteBansModule_3;
    private final boolean ar;
    private final String Y;
    private final String ad;
    private final String LiteBansModule_43;
    private final String MessageKey;
    private final String K;
    private final String PunishmentTableService;
    private final String LiteBansModule_240;
    private final String LiteBansModule_12;
    private final String LiteBansModule_15;
    private final byte PlayerproviderHandler;
    private final byte HikariConfig;
    private final int H;
    private final int r;
    private final int ab;
    private final long ValueHandler;
    private final long PunishmentService;
    private final long LiteBansModule_27;
    private final long F;
    private final int T;
    private final int LiteBansModule_2;
    private final String BuilderactionHandler;
    private final boolean DatabaseMonitorService;
    private final boolean LiteBansModule_14;
    private final boolean aG;
    private final boolean ContinueEvictHandler;
    private final boolean InitHandler;
    private final boolean LiteBansModule_194;
    private final boolean AsyncBackgroundTask_21;
    private final boolean AsyncBackgroundTask_5;
    private final boolean NullHandler_8;
    private final boolean LiteBansModule_4;
    private final boolean bc;
    private final boolean W;
    private final boolean aO;
    private final boolean D;
    private final boolean aa;
    private final boolean aT;
    private final boolean LiteBansModule_5;
    private final boolean BanHandler_5;
    private final boolean SetHandler;
    private final boolean Utf8Handler_2;
    private final boolean V;
    private final boolean LiteBansModule_430;
    private final boolean ac;
    private final boolean ServerEventListener;
    private final boolean ElementsHandler;
    private final boolean LiteBansModule_6;
    private final boolean aS;
    private final boolean LiteBansModule_21;
    private final boolean LockdownService;
    private final boolean ap;
    private final boolean ax;
    private final boolean ba;
    private final boolean aN;
    private final boolean PluginHookService;
    private final boolean aV;
    private final boolean LiteBansModule_23;
    private final boolean O;
    private final boolean LiteBansModule_18;
    private final boolean aq;
    private final boolean ay;
    private final boolean q;
    private final byte X;
    private final boolean U;
    private final boolean LiteBansModule_401;
    private final boolean J;
    private final boolean LiteBansModule_10;
    private final boolean LiteBansModule_31;
    private final boolean aW;
    private final boolean m;
    private final boolean ExceptionHandler;
    private final boolean e;
    private final boolean aL;
    private final boolean LiteBansModule_7;
    private final String n;
    private final String[] az;
    private final String[] HoverTextFormatter;
    private final String[] LiteBansModule_29;
    private final List GnuSparseMapHandler;
    private final List g;
    private final Set LiteBansModule_24;
    private final Set P;
    private final List z;
    private final long c;
    private final long HikariDataSource;
    private final int S;
    private final int NullHandler;
    private final byte ah;
    public DiscordWebhookClient(@NotNull PlatformPlugin v1, @NotNull DatabaseService v2) {
        block67: {
            block71: {
                block68: {
                    block70: {
                        block69: {
                            super();
                            this.ServerSyncService = v1;
                            this.A = v2;
                            v3 = (ConfigService)this.ServerSyncService.BaseCoreGenericHandler(ConfigService.class);
                            v3.BaseCoreGenericHandler(this);
                            var4_4 = this;
                            var5_5 = false;
                            var6_7 = System.getenv("LITEBANS_CONFIG");
                            if (var6_7 != null) {
                                var4_4.ServerSyncService.getLogger().info("Loading environment options: " + (String)var6_7);
                                v0 = new LiteBansModule_314().BaseCoreGenericHandler((String)var6_7);
                                ObjectUtilities.LiteBansModule_31(v0, "");
                                var7_8 = (HashMap)v0;
                                var8_11 = var7_8.entrySet();
                                var9_12 = false;
                                var10_14 = var8_11.iterator();
                                while (var10_14.hasNext()) {
                                    var11_16 = var10_14.next();
                                    var12_17 = (Map.Entry)var11_16;
                                    var13_20 = false;
                                    var4_4.A.LiteBansModule_31((String)var12_17.getKey(), var12_17.getValue());
                                }
                            }
                            SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler("online_player_select_limit", 64));
                            this.LiteBansModule_31 = this.A.BaseCoreGenericHandler("i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", false);
                            this.m = this.A.BaseCoreGenericHandler("disable_wildcard_bans", false);
                            this.ExceptionHandler = this.A.BaseCoreGenericHandler("disable_expiry_update", false);
                            var4_4 = this;
                            var5_6 = "database_time_offset";
                            var6_7 = "0 seconds";
                            var7_9 = false;
                            this.c = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var4_4.bc().BaseCoreGenericHandler(var5_6, (String)var6_7), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var6_7, 0.0));
                            this.ah = LiteBansModule_283.BaseCoreGenericHandler((byte)this.A.BaseCoreGenericHandler("username_max_length", 16));
                            v3.BaseCoreGenericHandler((byte)Math.max(0, this.A.BaseCoreGenericHandler("debug_level", 0)));
                            this.AsyncBackgroundTask_5 = this.A.BaseCoreGenericHandler("bungeecord", false);
                            this.NullHandler_8 = this.A.BaseCoreGenericHandler("online_mode", true);
                            var5_6 = this.A.BaseCoreGenericHandler("sql.driver", "LiteBansModule_243");
                            var6_7 = Locale.ENGLISH;
                            var4_4 = var5_6.toLowerCase((Locale)var6_7);
                            if (StringUtilities.LiteBansModule_31((String)var4_4, "postgres", false, 2, null)) {
                                var4_4 = "pgsql";
                            }
                            this.plugin = var4_4;
                            var5_6 = this.A.BaseCoreGenericHandler("sql.address", "localhost:3306");
                            var6_7 = this.A.BaseCoreGenericHandler("sql.database", "litebans");
                            v7 = this.A.BaseCoreGenericHandler("sql.username", "");
                            var8_11 = this.A.BaseCoreGenericHandler("sql.password", "");
                            var9_13 = this.A.BaseCoreGenericHandler("sql.table_prefix", "litebans_");
                            if (ObjectUtilities.BaseCoreGenericHandler(var4_4, (Object)"LiteBansModule_243")) {
                                try {
                                    var11_16 = this.ServerSyncService.getDataFolder();
                                    var12_17 = "LiteBansModule_243.yml";
                                    var13_20 = false;
                                    var10_14 = new File((File)var11_16, (String)var12_17);
                                    if (!var10_14.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                                        var11_16 = this.ServerSyncService.getDataFolder();
                                        var12_17 = "LiteBansModule_243.json";
                                        var13_20 = false;
                                        var10_14 = new File((File)var11_16, (String)var12_17);
                                    }
                                    if (var10_14.exists()) {
                                        var11_16 = this.ServerSyncService.BaseCoreGenericHandler((File)var10_14).g();
                                        v7 = var11_16.BaseCoreGenericHandler("user", v7);
                                        var8_11 = var11_16.BaseCoreGenericHandler("password", (String)var8_11);
                                    }
                                }
                                catch (Exception var10_15) {
                                    var10_15.printStackTrace();
                                }
                            }
                            if (!ObjectUtilities.BaseCoreGenericHandler((Object)var9_13, (Object)"litebans_")) {
                                var10_14 = var9_13;
                                ObjectUtilities.BaseCoreGenericHandler(var10_14);
                                var10_14 = (CharSequence)var10_14;
                                var11_16 = new NativepatternHandler("^[0-9a-zA-Z_]*$");
                                if (!var11_16.BaseCoreGenericHandler((CharSequence)var10_14)) {
                                    this.ServerSyncService.getLogger().warning("Table prefix '" + var9_13 + "' is invalid! Using default ('litebans_') + ");
                                    var9_13 = "litebans_";
                                }
                            }
                            ObjectUtilities.BaseCoreGenericHandler((Object)var5_6);
                            this.SQLiteDriverHandler = var5_6;
                            var10_14 = v7;
                            ObjectUtilities.BaseCoreGenericHandler(var10_14);
                            this.aU = var10_14;
                            var10_14 = var8_11;
                            ObjectUtilities.BaseCoreGenericHandler(var10_14);
                            this.aM = var10_14;
                            ObjectUtilities.BaseCoreGenericHandler(var6_7);
                            this.AsyncBackgroundTask_22 = var6_7;
                            var10_14 = var9_13;
                            ObjectUtilities.BaseCoreGenericHandler(var10_14);
                            this.LiteBansModule_9 = var10_14;
                            var10_14 = this;
                            var11_16 = this.A.BaseCoreGenericHandler("sql.engine", "InnoDB");
                            var12_18 = false;
                            this.LiteBansModule_17 = ObjectUtilities.BaseCoreGenericHandler(var11_16, (Object)"InnoDB") == false && ArrayUtilities.LiteBansModule_31(var13_21 = new String[]{"mysql", "mariadb", "LiteBansModule_243", "sqlite"}, var11_16.toLowerCase(Locale.ROOT)) != false ? "InnoDB" : var11_16;
                            this.BanHandler = var10_14 = this.A.BaseCoreGenericHandler("sql.options", "useSSL=false&serverTimezone=UTC");
                            var10_14 = "version:8";
                            var12_19 /* !! */  = new String[]{var10_14, DiscordWebhookClient.bf[48], DiscordWebhookClient.bf[49], DiscordWebhookClient.bf[50], DiscordWebhookClient.bf[51], DiscordWebhookClient.bf[52]};
                            var11_16 = var12_19 /* !! */ ;
                            var13_22 = this;
                            var14_23 = DiscordWebhookClient.bf[53];
                            var15_24 = (String[])Arrays.copyOf(var11_16, ((Object)var11_16).length);
                            var16_25 = false;
                            if (!var13_22.bc().LiteBansModule_194((String)var14_23)) {
                                v1 = Arrays.copyOf(var15_24, ((String[])var15_24).length);
                            } else {
                                var17_28 = var13_22.bc().g((String)var14_23);
                                var18_30 = false;
                                var19_37 = var17_28;
                                v1 = var19_37.toArray(new String[0]);
                            }
                            if (!ObjectUtilities.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(var12_19 /* !! */  = v1, 0), var10_14)) {
                                var12_19 /* !! */  = var11_16;
                                v3.BaseCoreGenericHandler((Object)(DiscordWebhookClient.bf[54] + (String)var10_14 + DiscordWebhookClient.bf[55]));
                            }
                            this.CommandExitException = var12_19 /* !! */ ;
                            this.PlayerQuitListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[56], 1);
                            this.LiteBansModule_13 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[57], 10);
                            var13_22 = this;
                            var14_23 = DiscordWebhookClient.bf[58];
                            var15_24 = DiscordWebhookClient.bf[59];
                            var16_25 = false;
                            this.L = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.bc().BaseCoreGenericHandler((String)var14_23, (String)var15_24), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = DiscordWebhookClient.bf[60];
                            var15_24 = DiscordWebhookClient.bf[61];
                            var16_25 = false;
                            this.i = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.bc().BaseCoreGenericHandler((String)var14_23, (String)var15_24), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = DiscordWebhookClient.bf[62];
                            var15_24 = DiscordWebhookClient.bf[63];
                            var16_25 = false;
                            this.ak = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.bc().BaseCoreGenericHandler((String)var14_23, (String)var15_24), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = DiscordWebhookClient.bf[64];
                            var15_24 = DiscordWebhookClient.bf[65];
                            var16_25 = false;
                            this.LiteBansModule_433 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var13_22.bc().BaseCoreGenericHandler((String)var14_23, (String)var15_24), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var15_24, 0.0));
                            var13_22 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[66]);
                            var14_23 = new ArrayList<PunishmentService>();
                            if (var13_22 != null) {
                                var15_24 = var13_22.BaseCoreGenericHandler(false);
                                ObjectUtilities.BaseCoreGenericHandler(var15_24);
                                var16_26 = (Iterable)var15_24;
                                var17_29 = false;
                                for (Object var19_37 : var16_26) {
                                    var20_40 = (String)var19_37;
                                    var21_45 = false;
                                    var22_53 = var13_22.BaseCoreGenericHandler(var20_40);
                                    if (var22_53 == null) continue;
                                    var23_68 = this;
                                    var24_84 = false;
                                    var25_87 /* !! */  = new String[]{DiscordWebhookClient.bf[67], DiscordWebhookClient.bf[68], DiscordWebhookClient.bf[69]};
                                    var26_95 = false;
                                    var27_101 = var25_87 /* !! */ ;
                                    var28_107 = new ArrayList<PunishmentService>();
                                    var29_115 = false;
                                    var31_120 = var27_101.length;
                                    for (var30_118 = 0; var30_118 < var31_120; ++var30_118) {
                                        var33_123 = var32_122 = var27_101[var30_118];
                                        var34_129 = false;
                                        if (!(var22_53.LiteBansModule_31((String)var33_123) == null)) continue;
                                        var28_107.add(var32_122);
                                    }
                                    var25_87 /* !! */  = (List)var28_107;
                                    var26_95 = false;
                                    var27_101 = var25_87 /* !! */ ;
                                    var28_107 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var25_87 /* !! */ , 10));
                                    var29_115 = false;
                                    for (T var31_121 : var27_101) {
                                        var32_122 = (String)var31_121;
                                        var35_130 = var28_107;
                                        var33_125 = false;
                                        var35_130.add(LiteBansModule_242.BaseCoreGenericHandler((CharSequence)(DiscordWebhookClient.bf[70] + var20_40 + DiscordWebhookClient.bf[71] + (String)var32_122 + DiscordWebhookClient.bf[72]), (CharSequence)DiscordWebhookClient.bf[73]));
                                    }
                                    var25_87 /* !! */  = (List)var28_107;
                                    var26_94 = var23_68.ServerSyncService.getLogger();
                                    var27_100 = false;
                                    for (PunishmentService var29_116 : var25_87 /* !! */ ) {
                                        var30_117 = (CharSequence)var29_116;
                                        var31_120 = 0;
                                        var32_122 = var26_94;
                                        var33_126 = false;
                                        var32_122.warning(var30_117.toString());
                                    }
                                    var23_68 = DiscordWebhookClient.bf[74];
                                    var24_83 = DiscordWebhookClient.bf[75];
                                    var25_87 /* !! */  = var22_53.BaseCoreGenericHandler(DiscordWebhookClient.bf[76], DiscordWebhookClient.bf[77]);
                                    var28_107 = this;
                                    var29_114 = var22_53;
                                    var30_117 = DiscordWebhookClient.bf[78];
                                    var31_120 = 0;
                                    var36_132 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var29_114.BaseCoreGenericHandler((String)var30_117, (String)var23_68), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var23_68, 0.0));
                                    var30_117 = this;
                                    var31_119 = var22_53;
                                    var32_122 = DiscordWebhookClient.bf[79];
                                    var33_127 = false;
                                    var38_133 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var31_119.BaseCoreGenericHandler((String)var32_122, (String)var23_68), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var23_68, 0.0));
                                    if (var36_132 <= 0L) {
                                        var36_132 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    if (var38_133 <= 0L) {
                                        var38_133 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    var32_122 = this;
                                    var33_123 = var22_53;
                                    var34_128 = DiscordWebhookClient.bf[80];
                                    var35_131 = false;
                                    var40_134 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var33_123.BaseCoreGenericHandler((String)var34_128, (String)var24_83), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var24_83, 0.0));
                                    var34_128 = this;
                                    var35_130 = var22_53;
                                    var42_135 = DiscordWebhookClient.bf[81];
                                    var43_137 = false;
                                    var44_138 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var35_130.BaseCoreGenericHandler((String)var42_135, (String)var24_83), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var24_83, 0.0));
                                    var42_135 = this;
                                    var43_136 = var22_53;
                                    var46_139 = DiscordWebhookClient.bf[82];
                                    var47_141 = false;
                                    var48_142 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var43_136.BaseCoreGenericHandler((String)var46_139, (String)var24_83), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var24_83, 0.0));
                                    var46_139 = this;
                                    var47_140 = var22_53;
                                    var50_144 = DiscordWebhookClient.bf[83];
                                    var51_146 = false;
                                    var52_147 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var47_140.BaseCoreGenericHandler((String)var50_144, (String)var24_83), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var24_83, 0.0));
                                    var50_144 = this;
                                    var51_145 = var22_53;
                                    var54_148 = DiscordWebhookClient.bf[84];
                                    var55_149 = DiscordWebhookClient.bf[85];
                                    var56_150 = false;
                                    var57_151 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var51_145.BaseCoreGenericHandler(var54_148, var55_149), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var55_149, 0.0));
                                    var50_143 = var22_53.BaseCoreGenericHandler(DiscordWebhookClient.bf[86], false);
                                    ObjectUtilities.BaseCoreGenericHandler(var25_87 /* !! */ );
                                    var51_145 = new LiteBansModule_109((String)var25_87 /* !! */ , new LiteBansModule_34(var36_132, var38_133), new LiteBansModule_23(var40_134, var44_138, var48_142, var52_147, var57_151), new LiteBansModule_3(var50_143));
                                    var14_23.add(var51_145);
                                }
                            }
                            this.g = (List)var14_23;
                            var15_24 = this;
                            var16_27 /* !! */  = DiscordWebhookClient.bf[87];
                            var17_28 = DiscordWebhookClient.bf[88];
                            var18_30 = false;
                            this.ValueHandler = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var15_24.bc().BaseCoreGenericHandler((String)var16_27 /* !! */ , (String)var17_28), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var17_28, 0.0));
                            var15_24 = this;
                            var16_27 /* !! */  = DiscordWebhookClient.bf[89];
                            var17_28 = DiscordWebhookClient.bf[90];
                            var18_30 = false;
                            this.PunishmentService = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var15_24.bc().BaseCoreGenericHandler((String)var16_27 /* !! */ , (String)var17_28), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var17_28, 0.0));
                            var15_24 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[91], DiscordWebhookClient.bf[92]);
                            if (ObjectUtilities.BaseCoreGenericHandler(var15_24, (Object)DiscordWebhookClient.bf[93])) {
                                var17_28 = LiteBansModule_179.BaseCoreGenericHandler;
                                var16_27 /* !! */  = StringUtilities.LiteBansModule_31((String)var17_28);
                                if (var16_27 /* !! */  != null) {
                                    var16_27 /* !! */  = var16_27 /* !! */ .longValue() * (long)127;
                                }
                                if ((v2 = (var17_28 = var16_27 /* !! */ )) == null || (v2 = (var18_32 = v2.toString())) == null) {
                                    v2 = DiscordWebhookClient.bf[94];
                                }
                                var15_24 = v2;
                            }
                            this.LiteBansModule_27 = var15_24.hashCode();
                            this.aO = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[95], true);
                            this.LiteBansModule_21 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[96], this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[97], true));
                            this.W = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[98], true);
                            this.D = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[99], true);
                            this.aa = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[100], true);
                            var17_28 = this;
                            var18_33 = DiscordWebhookClient.bf[101];
                            var19_37 = new String[]{DiscordWebhookClient.bf[102], DiscordWebhookClient.bf[103], DiscordWebhookClient.bf[104], DiscordWebhookClient.bf[105]};
                            var20_41 = false;
                            if (!var17_28.bc().LiteBansModule_194(var18_33)) {
                                v3 = Arrays.copyOf(var19_37, ((String[])var19_37).length);
                            } else {
                                var21_46 = var17_28.bc().g(var18_33);
                                var22_54 = false;
                                var23_68 = var21_46;
                                v3 = var23_68.toArray(new String[0]);
                            }
                            var16_27 /* !! */  = v3;
                            var17_28 = this;
                            var59_152 = this;
                            var18_34 = false;
                            var19_37 = LiteBansModule_389.BaseCoreGenericHandler((String[])var16_27 /* !! */ );
                            var20_41 = false;
                            var21_47 = var19_37;
                            var22_55 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var19_37, 10));
                            var23_69 = false;
                            var24_83 = var21_47.iterator();
                            while (var24_83.hasNext()) {
                                var25_87 /* !! */  = var24_83.next();
                                var26_94 = (String)var25_87 /* !! */ ;
                                var27_102 = var22_55;
                                var28_109 = false;
                                var27_102.add(StringUtilities.LiteBansModule_31((CharSequence)var26_94, ' ', false, 2, null) != false ? var26_94 : (String)var26_94 + ' ');
                            }
                            var59_152.LockdownCommandHandler = var60_153 = (List)var22_55;
                            var17_28 = this;
                            var18_34 = false;
                            this.B = CollectionUtilities.g(LiteBansModule_389.BaseCoreGenericHandler((String[])var16_27 /* !! */ ));
                            this.BanHandler_4 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[106], true);
                            this.aE = var17_28 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[107], DiscordWebhookClient.bf[108]);
                            var17_28 = this;
                            var18_35 = DiscordWebhookClient.bf[109];
                            var19_37 = new String[]{};
                            var20_41 = false;
                            if (!var17_28.bc().LiteBansModule_194((String)var18_35)) {
                                v4 = (String[])Arrays.copyOf(var19_37, ((Object)var19_37).length);
                            } else {
                                var21_47 = var17_28.bc().g((String)var18_35);
                                var22_56 = false;
                                var23_70 = var21_47;
                                v4 = var23_70.toArray(new String[0]);
                            }
                            this.CommandThrottleService = v4;
                            this.bd = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[110], false);
                            this.BanHandler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[111]);
                            var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[112], DiscordWebhookClient.bf[113]);
                            v5 = var18_35;
                            var17_28 = v5 != null ? v5.toLowerCase(Locale.ROOT) : null;
                            var18_35 = var17_28;
                            if (var18_35 == null) break block68;
                            switch (var18_35.hashCode()) {
                                case 1841730422: {
                                    if (!var18_35.equals(DiscordWebhookClient.bf[114])) {
                                        ** break;
                                    }
                                    break block69;
                                }
                                case -1609594047: {
                                    if (var18_35.equals(DiscordWebhookClient.bf[115])) break;
                                    ** break;
                                }
                                case -1305285460: {
                                    if (!var18_35.equals(DiscordWebhookClient.bf[116])) {
                                        ** break;
                                    }
                                    break block70;
                                }
                            }
                            v6 = 1;
                            break block71;
                        }
                        v6 = 2;
                        break block71;
                    }
                    v6 = 3;
                    break block71;
                }
                v6 = 0;
            }
            this.PlayerproviderHandler = v6;
            var18_35 = this;
            var19_37 = this.A;
            var20_42 = DiscordWebhookClient.bf[117];
            var21_47 = DiscordWebhookClient.bf[118];
            var22_57 = false;
            this.F = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(var19_37.BaseCoreGenericHandler((String)var20_42, (String)var21_47), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)var21_47, 0.0));
            this.LiteBansModule_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[119], 9999999);
            this.T = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[120], 20);
            this.BuilderactionHandler = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[121], DiscordWebhookClient.bf[122]);
            this.DatabaseMonitorService = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[123], true);
            this.LiteBansModule_14 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[124], true);
            this.aG = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[125], true) != false || this.PlayerproviderHandler > 1;
            this.ContinueEvictHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[126], true);
            this.InitHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[127], false);
            this.LiteBansModule_194 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[128], false);
            this.AsyncBackgroundTask_21 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[129], true);
            this.LiteBansModule_25 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[130], true);
            this.aj = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[131], false);
            this.af = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[132], true);
            this.be = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[133], DiscordWebhookClient.bf[134]);
            var18_35 = this;
            var19_37 = DiscordWebhookClient.bf[135];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().LiteBansModule_194((String)var19_37)) {
                v7 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_58 = var18_35.bc().g((String)var19_37);
                var23_72 = false;
                var24_83 = var22_58;
                v7 = var24_83.toArray(new String[0]);
            }
            this.LiteBansModule = v7;
            var18_35 = this;
            var19_37 = DiscordWebhookClient.bf[136];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().LiteBansModule_194((String)var19_37)) {
                v8 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_59 = var18_35.bc().g((String)var19_37);
                var23_73 = false;
                var24_83 = var22_59;
                v8 = var24_83.toArray(new String[0]);
            }
            this.TapeHandler = v8;
            this.LiteBansModule_7 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[137], false);
            var18_35 = this;
            var19_37 = DiscordWebhookClient.bf[138];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().LiteBansModule_194((String)var19_37)) {
                v9 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_60 = var18_35.bc().g((String)var19_37);
                var23_74 = false;
                var24_83 = var22_60;
                v9 = var24_83.toArray(new String[0]);
            }
            this.az = v9;
            var18_35 = this;
            var19_37 = DiscordWebhookClient.bf[139];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().LiteBansModule_194((String)var19_37)) {
                v10 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_61 = var18_35.bc().g((String)var19_37);
                var23_75 = false;
                var24_83 = var22_61;
                v10 = var24_83.toArray(new String[0]);
            }
            this.HoverTextFormatter = v10;
            var18_35 = this;
            var19_37 = DiscordWebhookClient.bf[140];
            var20_42 = new String[]{DiscordWebhookClient.bf[141], DiscordWebhookClient.bf[142], DiscordWebhookClient.bf[143], DiscordWebhookClient.bf[144], DiscordWebhookClient.bf[145]};
            var21_48 = 0;
            if (!var18_35.bc().LiteBansModule_194((String)var19_37)) {
                v11 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_62 = var18_35.bc().g((String)var19_37);
                var23_76 = false;
                var24_83 = var22_62;
                v11 = var24_83.toArray(new String[0]);
            }
            this.LiteBansModule_29 = v11;
            this.n = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[146], DiscordWebhookClient.bf[147]);
            this.ad = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[148], DiscordWebhookClient.bf[149]);
            this.ar = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[150], true);
            this.LiteBansModule_3 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[151], true);
            this.Y = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[152], DiscordWebhookClient.bf[153]);
            this.LiteBansModule_43 = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[154], DiscordWebhookClient.bf[155]);
            this.K = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[156], DiscordWebhookClient.bf[157]);
            this.PunishmentTableService = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[158], DiscordWebhookClient.bf[159]);
            this.MessageKey = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[160], DiscordWebhookClient.bf[161]);
            this.LiteBansModule_240 = var18_35 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[162], DiscordWebhookClient.bf[163]);
            var18_35 = litebans.MessageKey.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[164], DiscordWebhookClient.bf[165]), true);
            var18_35 = (CharSequence)var18_35;
            var19_38 = this.ah;
            var20_43 = false;
            this.LiteBansModule_15 = LiteBansModule_242.BaseCoreGenericHandler(var18_35.toString(), var19_38 & 255);
            this.LiteBansModule_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[166], false);
            this.BanHandler_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[167], false);
            var18_35 = this;
            var19_39 = this.A;
            var20_44 = DiscordWebhookClient.bf[168];
            var21_48 = 1;
            var22_63 = false;
            this.HikariConfig = (byte)var19_39.BaseCoreGenericHandler((String)var20_44, var21_48);
            this.SetHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[169], true);
            this.Utf8Handler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[170], false);
            this.aT = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[171], true);
            this.LiteBansModule_430 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[172], false);
            this.V = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[173], false);
            this.H = Math.max(0, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[174], 5));
            var18_36 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[175], false);
            if (this.ServerSyncService.AsyncBackgroundTask_22() == 0 && this.ServerSyncService.i().BaseCoreGenericHandler(DiscordWebhookClient.bf[176])) {
                v3.BaseCoreGenericHandler((Object)DiscordWebhookClient.bf[177]);
                var18_36 = true;
            }
            this.ac = var18_36;
            this.ab = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[178], 12000);
            this.r = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[179], 12000);
            this.ServerEventListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[180], false);
            this.ElementsHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[181], false);
            this.LiteBansModule_6 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[182], false);
            var19_39 = DiscordWebhookClient.BaseCoreGenericHandler(this, false, 1, null);
            this.ai = (String)var19_39.LiteBansModule_31();
            this.BroadcastService = (String)var19_39.e();
            var20_44 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[183], DiscordWebhookClient.bf[184]);
            this.LiteBansModule_12 = LiteBansModule_242.BaseCoreGenericHandler((String)var20_44, 32);
            this.HikariDataSource = Math.max(40L, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[185], 55L));
            this.S = Math.max(1, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[186], 3));
            var20_44 = DiscordWebhookClient.bf[187];
            var21_48 = 1;
            var22_63 = false;
            var23_77 = this;
            var24_83 = new String[]{};
            var25_88 = false;
            if (!var23_77.bc().LiteBansModule_194((String)var20_44)) {
                v12 = Arrays.copyOf(var24_83, ((String[])var24_83).length);
            } else {
                var26_94 = var23_77.bc().g((String)var20_44);
                var27_103 = false;
                var28_110 = var26_94;
                v12 = var28_110.toArray(new String[0]);
            }
            this.LiteBansModule_24 = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_389.BaseCoreGenericHandler(v12));
            var20_44 = this;
            var21_49 = DiscordWebhookClient.bf[188];
            var22_64 = new String[]{DiscordWebhookClient.bf[189]};
            var23_78 = false;
            if (!var20_44.bc().LiteBansModule_194(var21_49)) {
                v13 = Arrays.copyOf(var22_64, var22_64.length);
            } else {
                var24_83 = var20_44.bc().g(var21_49);
                var25_88 = false;
                var26_94 = var24_83;
                v13 = var26_94.toArray(new String[0]);
            }
            this.GnuSparseMapHandler = LiteBansModule_389.BaseCoreGenericHandler(v13);
            var20_44 = this;
            var21_49 = DiscordWebhookClient.bf[190];
            var23_79 = this;
            var24_83 = DiscordWebhookClient.bf[191];
            var25_89 = new String[]{};
            var26_96 = false;
            if (!var23_79.bc().LiteBansModule_194((String)var24_83)) {
                v14 = Arrays.copyOf(var25_89, var25_89.length);
            } else {
                var27_104 = var23_79.bc().g((String)var24_83);
                var28_111 = false;
                var29_114 = var27_104;
                v14 = var29_114.toArray(new String[0]);
            }
            var22_64 = v14;
            var22_64 = Arrays.copyOf(var22_64, var22_64.length);
            var23_80 = false;
            if (!var20_44.bc().LiteBansModule_194(var21_49)) {
                v15 = Arrays.copyOf(var22_64, var22_64.length);
            } else {
                var24_83 = var20_44.bc().g(var21_49);
                var25_90 = false;
                var26_97 = var24_83;
                v15 = var26_97.toArray(new String[0]);
            }
            this.z = LiteBansModule_389.BaseCoreGenericHandler(v15);
            var20_44 = DiscordWebhookClient.bf[192];
            var21_50 = true;
            var22_65 = false;
            var23_81 = this;
            var24_83 = new String[]{};
            var25_92 = false;
            if (!var23_81.bc().LiteBansModule_194((String)var20_44)) {
                v16 = (String[])Arrays.copyOf(var24_83, ((Object)var24_83).length);
            } else {
                var26_98 = var23_81.bc().g((String)var20_44);
                var27_105 = false;
                var28_112 = var26_98;
                v16 = var28_112.toArray(new String[0]);
            }
            this.P = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_389.BaseCoreGenericHandler(v16));
            var20_44 = LiteBansModule_181.LiteBansModule_194;
            var21_51 = this.z;
            var59_152 = this;
            var22_65 = false;
            var23_81 = var21_51;
            var24_85 = false;
            if (var23_81 instanceof Collection && ((Collection)var23_81).isEmpty()) {
                v17 = false;
            } else {
                var25_93 = var23_81.iterator();
                while (var25_93.hasNext()) {
                    var26_99 = var25_93.next();
                    var27_106 = (String)var26_99;
                    var28_113 = false;
                    if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(var27_106)) continue;
                    v17 = true;
                    break block67;
                }
                v17 = false;
            }
        }
        var59_152.aL = (var60_154 = v17) != false || this.z.contains(var19_39.LiteBansModule_31()) != false;
        this.NullHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[193], 10);
        this.ap = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[194], true);
        this.ax = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[195], true);
        this.ba = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[196], true);
        this.aN = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[197], false);
        this.aS = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[198], false);
        this.PluginHookService = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[199], true);
        this.e = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[200], false);
        this.LiteBansModule_23 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[201], true);
        this.LockdownService = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[202], true);
        this.LiteBansModule_10 = this.aj != false || this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[203], true) != false;
        this.bc = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[204], false);
        this.LiteBansModule_4 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[205], false);
        this.O = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[206], true);
        this.aV = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[207], true);
        this.LiteBansModule_18 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[208], true);
        this.ay = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[209], true);
        this.aq = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[210], true);
        this.U = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[211], false);
        this.LiteBansModule_401 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[212], false);
        this.J = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[213], true);
        this.q = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[214], true);
        this.X = (byte)Math.min(this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[215], 1), 2);
        this.aW = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[216], false) != false && this.ServerSyncService.AsyncBackgroundTask_22() == 0;
        var20_44 = this;
        var21_52 = false;
        var22_66 = var20_44.ServerSyncService.getLogger();
        var23_82 = false;
        if (!var20_44.PluginHookService) {
            var22_66.warning(DiscordWebhookClient.bf[217]);
        }
        if (var20_44.aW) {
            var22_66.warning(DiscordWebhookClient.bf[218]);
        }
        if (var20_44.m) {
            var22_66.warning(DiscordWebhookClient.bf[219]);
        }
        if (var20_44.ExceptionHandler) {
            var22_66.warning(DiscordWebhookClient.bf[220]);
        }
        if (var20_44.PlayerproviderHandler == 0) {
            v18 = var20_44.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[221], DiscordWebhookClient.bf[222]);
            if (v18 == null || (v18 = v18.toLowerCase(Locale.ROOT)) == null) {
                v18 = DiscordWebhookClient.bf[223];
            }
            if (((CharSequence)(var24_86 = v18)).length() > 0 && !ObjectUtilities.BaseCoreGenericHandler((Object)var24_86, (Object)DiscordWebhookClient.bf[224])) {
                var22_66.warning(DiscordWebhookClient.bf[225] + var24_86 + DiscordWebhookClient.bf[226]);
            }
        }
        var20_44 = v3;
        var21_52 = false;
        if (var20_44.g()) {
            var59_152 = var20_44;
            var22_67 = false;
            var60_155 = LiteBansModule_242.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler((CharSequence)CollectionUtilities.BaseCoreGenericHandler(this.g, null, null, null, 0, null, null, 63, null), (CharSequence)(DiscordWebhookClient.bf[227] + Arrays.toString(var16_27 /* !! */ ))), (CharSequence)(DiscordWebhookClient.bf[228] + Arrays.toString(this.HoverTextFormatter)));
            var59_152.BaseCoreGenericHandler(var60_155);
        }
    }

    public /* synthetic */ DiscordWebhookClient(PlatformPlugin plugin, DatabaseService gn_02, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            gn_02 = plugin.LiteBansModule_240();
        }
        this(plugin, gn_02);
    }

    public final PlatformPlugin LiteBansModule_4() {
        return this.ServerSyncService;
    }

    public final DatabaseService bc() {
        return this.A;
    }

    public final String aG() {
        return this.BroadcastService;
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        this.BroadcastService = string;
    }

    public final String LiteBansModule_25() {
        return this.ai;
    }

    public final void LiteBansModule_31(@NotNull String string) {
        this.ai = string;
    }

    public final String ElementsHandler() {
        return this.plugin;
    }

    public final void c(@NotNull String string) {
        this.plugin = string;
    }

    public final String q() {
        return this.SQLiteDriverHandler;
    }

    public final String aW() {
        return this.aU;
    }

    public final String LiteBansModule_6() {
        return this.aM;
    }

    public final String DatabaseMonitorService() {
        return this.AsyncBackgroundTask_22;
    }

    public final String AsyncBackgroundTask_5() {
        return this.LiteBansModule_9;
    }

    public final String BanHandler() {
        return this.LiteBansModule_17;
    }

    public final String aN() {
        return this.BanHandler;
    }

    public final String[] aV() {
        return this.CommandExitException;
    }

    public final int V() {
        return this.PlayerQuitListener;
    }

    public final int LiteBansModule_5() {
        return this.LiteBansModule_13;
    }

    public final long LiteBansModule_401() {
        return this.L;
    }

    public final long Y() {
        return this.i;
    }

    public final long ServerEventListener() {
        return this.ak;
    }

    public final List LiteBansModule_10() {
        return this.LockdownCommandHandler;
    }

    public final Set LiteBansModule_9() {
        return this.B;
    }

    public final boolean BanHandler_2() {
        return this.BanHandler_4;
    }

    public final String[] A() {
        return this.CommandThrottleService;
    }

    public final boolean LiteBansModule() {
        return this.bd;
    }

    public final boolean LiteBansModule_2() {
        return this.BanHandler_2;
    }

    public final String ar() {
        return this.aE;
    }

    public final boolean LockdownService() {
        return this.LiteBansModule_25;
    }

    public final boolean ac() {
        return this.aj;
    }

    public final boolean LiteBansModule_430() {
        return this.af;
    }

    public final String aL() {
        return this.be;
    }

    public final String[] CommandExitException() {
        return this.LiteBansModule;
    }

    public final String[] r() {
        return this.TapeHandler;
    }

    public final boolean X() {
        return this.LiteBansModule_3;
    }

    public final boolean ai() {
        return this.ar;
    }

    public final String m() {
        return this.Y;
    }

    public final String bd() {
        return this.ad;
    }

    public final String BanHandler_4() {
        return this.LiteBansModule_43;
    }

    public final String TapeHandler() {
        return this.MessageKey;
    }

    public final String P() {
        return this.K;
    }

    public final String ah() {
        return this.PunishmentTableService;
    }

    public final String az() {
        return this.LiteBansModule_240;
    }

    public final String BuilderactionHandler() {
        return this.LiteBansModule_12;
    }

    public final String SQLiteDriverHandler() {
        return this.LiteBansModule_15;
    }

    public final byte e() {
        return this.PlayerproviderHandler;
    }

    public final byte LiteBansModule_31() {
        return this.HikariConfig;
    }

    public final int LiteBansModule_29() {
        return this.H;
    }

    public final int bf() {
        return this.r;
    }

    public final int NullHandler_8() {
        return this.ab;
    }

    public final long PlayerproviderHandler() {
        return this.ValueHandler;
    }

    public final long LiteBansModule_43() {
        return this.PunishmentService;
    }

    public final long ContinueEvictHandler() {
        return this.LiteBansModule_27;
    }

    public final long BroadcastService() {
        return this.F;
    }

    public final int HoverTextFormatter() {
        return this.T;
    }

    public final int ValueHandler() {
        return this.LiteBansModule_2;
    }

    public final String aO() {
        return this.BuilderactionHandler;
    }

    public final boolean aM() {
        return this.DatabaseMonitorService;
    }

    public final boolean c() {
        return this.LiteBansModule_14;
    }

    public final boolean LockdownCommandHandler() {
        return this.aG;
    }

    public final boolean LiteBansModule_27() {
        return this.ContinueEvictHandler;
    }

    public final boolean PluginHookService() {
        return this.InitHandler;
    }

    public final boolean ak() {
        return this.LiteBansModule_194;
    }

    public final boolean LiteBansModule_14() {
        return this.AsyncBackgroundTask_21;
    }

    public final boolean LiteBansModule_13() {
        return this.AsyncBackgroundTask_5;
    }

    public final boolean af() {
        return this.NullHandler_8;
    }

    public final boolean ServerSyncService() {
        return this.LiteBansModule_4;
    }

    public final boolean n() {
        return this.bc;
    }

    public final boolean InitHandler() {
        return this.W;
    }

    public final boolean PunishmentTableService() {
        return this.aO;
    }

    public final boolean ab() {
        return this.D;
    }

    public final boolean D() {
        return this.aa;
    }

    public final boolean ay() {
        return this.aT;
    }

    public final boolean F() {
        return this.LiteBansModule_5;
    }

    public final boolean PunishmentService() {
        return this.BanHandler_5;
    }

    public final boolean LiteBansModule_3() {
        return this.SetHandler;
    }

    public final boolean K() {
        return this.Utf8Handler_2;
    }

    public final boolean LiteBansModule_7() {
        return this.V;
    }

    public final boolean SetHandler() {
        return this.LiteBansModule_430;
    }

    public final boolean NullHandler() {
        return this.ac;
    }

    public final boolean i() {
        return this.ServerEventListener;
    }

    public final boolean aq() {
        return this.ElementsHandler;
    }

    public final boolean ad() {
        return this.LiteBansModule_6;
    }

    public final boolean CommandThrottleService() {
        return this.aS;
    }

    public final boolean LiteBansModule_433() {
        return this.LiteBansModule_21;
    }

    public final boolean ax() {
        return this.LockdownService;
    }

    public final boolean aS() {
        return this.ap;
    }

    public final boolean AsyncBackgroundTask_21() {
        return this.ax;
    }

    public final boolean aU() {
        return this.ba;
    }

    public final boolean ExceptionHandler() {
        return this.aN;
    }

    public final boolean B() {
        return this.PluginHookService;
    }

    public final boolean U() {
        return this.aV;
    }

    public final boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_23;
    }

    public final boolean z() {
        return this.O;
    }

    public final boolean O() {
        return this.LiteBansModule_18;
    }

    public final boolean AsyncBackgroundTask_22() {
        return this.aq;
    }

    public final boolean HikariDataSource() {
        return this.ay;
    }

    public final boolean aa() {
        return this.q;
    }

    public final byte MessageKey() {
        return this.X;
    }

    public final boolean LiteBansModule_17() {
        return this.U;
    }

    public final boolean LiteBansModule_194() {
        return this.LiteBansModule_401;
    }

    public final boolean LiteBansModule_24() {
        return this.J;
    }

    public final boolean HikariConfig() {
        return this.LiteBansModule_10;
    }

    public final boolean LiteBansModule_240() {
        return this.LiteBansModule_31;
    }

    public final boolean PlayerQuitListener() {
        return this.aW;
    }

    public final boolean aE() {
        return this.m;
    }

    public final boolean BanHandler_5() {
        return this.ExceptionHandler;
    }

    public final boolean J() {
        return this.e;
    }

    public final boolean GnuSparseMapHandler() {
        return this.aL;
    }

    public final boolean W() {
        return this.LiteBansModule_7;
    }

    public final String Utf8Handler_2() {
        return this.n;
    }

    public final String[] LiteBansModule_21() {
        return this.az;
    }

    public final String[] S() {
        return this.HoverTextFormatter;
    }

    public final String[] g() {
        return this.LiteBansModule_29;
    }

    public final List H() {
        return this.GnuSparseMapHandler;
    }

    public final List L() {
        return this.g;
    }

    public final Set LiteBansModule_23() {
        return this.LiteBansModule_24;
    }

    public final Set ap() {
        return this.P;
    }

    public final List aj() {
        return this.z;
    }

    public final long LiteBansModule_15() {
        return this.c;
    }

    public final long LiteBansModule_18() {
        return this.HikariDataSource;
    }

    public final int LiteBansModule_12() {
        return this.S;
    }

    public final int aT() {
        return this.NullHandler;
    }

    public final byte be() {
        return this.ah;
    }

    public final LiteBansModule_354 BaseCoreGenericHandler(boolean flag) {
        String string;
        ConfigService configService = (ConfigService)this.ServerSyncService.BaseCoreGenericHandler(ConfigService.class);
        String string2 = LiteBansModule_242.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(bf[255], bf[256]), 32);
        if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string2)) {
            configService.BaseCoreGenericHandler((Object)(bf[257] + string2 + bf[258]));
            string2 = bf[259];
        }
        String string3 = null;
        File file = this.ServerSyncService.getDataFolder();
        Object object = bf[260];
        boolean flag2 = false;
        File file2 = new File(file, (String)object);
        if (!file2.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
            file = this.ServerSyncService.getDataFolder();
            object = bf[261];
            flag2 = false;
            file2 = new File(file, (String)object);
        }
        try {
            boolean flag3 = flag || !file2.exists();
            object = this.ServerSyncService.BaseCoreGenericHandler(file2).g();
            String string4 = object.BaseCoreGenericHandler(bf[262], null);
            if (string4 != null && string4.length() == 32) {
                string3 = string4;
            } else {
                string3 = this.T();
                flag3 = true;
            }
            if (flag3) {
                object.LiteBansModule_31(bf[263], string3);
                ((DatabaseService)object).LiteBansModule_240();
            } else {
                configService.BaseCoreGenericHandler(false);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            configService.BaseCoreGenericHandler(false);
        }
        if ((string = string3) == null) {
            string = this.T();
        }
        LiteBansModule_354 jT2 = LiteBansModule_371.BaseCoreGenericHandler(string2, string);
        object = configService;
        int n = 10;
        boolean flag4 = false;
        if (((ConfigService)object).BaseCoreGenericHandler(n)) {
            Object object2 = object;
            boolean flag5 = false;
            ((ConfigService)object2).BaseCoreGenericHandler((Object)(bf[264] + (String)jT2.e() + '\"'));
        }
        return jT2;
    }

    public static /* synthetic */ LiteBansModule_354 BaseCoreGenericHandler(DiscordWebhookClient eG2, boolean flag, int n, Object object) {
        if ((n & 1) != 0) {
            flag = false;
        }
        return eG2.BaseCoreGenericHandler(flag);
    }

    public final String T() {
        return LiteBansModule_50.c.BaseCoreGenericHandler(UUID.randomUUID());
    }

    private static final void ba() {
        bf = new String[]{"LITEBANS_CONFIG", "Loading environment options: ", "", "online_player_select_limit", "i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", "disable_wildcard_bans", "disable_expiry_update", "database_time_offset", "0 seconds", "username_max_length", "debug_level", "bungeecord", "online_mode", "sql.driver", "LiteBansModule_243", "postgres", "pgsql", "sql.address", "localhost:3306", "sql.database", "litebans", "sql.username", "", "sql.password", "", "sql.table_prefix", "litebans_", "LiteBansModule_243", "LiteBansModule_243.yml", "LiteBansModule_243.json", "user", "password", "litebans_", "^[0-9a-zA-Z_]*$", "Table prefix '", "' is invalid! Using default ('litebans_') + ", "litebans_", "sql.engine", "InnoDB", "InnoDB", "mysql", "mariadb", "LiteBansModule_243", "sqlite", "InnoDB", "sql.options", "useSSL=false&serverTimezone=UTC", "version:8", "mysql:com.mysql.cj.jdbc.Driver:https://repo1.maven.org/maven2/mysql/mysql-connector-java/{}/mysql-connector-java-{}.jar:8.0.29:d4e32d2a6026b5acc00300b73a86c28fb92681ae9629b21048ee67014c911db6", "pgsql:org.postgresql.Driver:https://repo1.maven.org/maven2/org/postgresql/postgresql/{}/postgresql-{}.jar:42.4.0:fe25b9c0a2c59458504ec88862853df522ee87f8a02564835d537c29ae4cb125", "mariadb:org.mariadb.jdbc.Driver:https://repo1.maven.org/maven2/org/mariadb/jdbc/mariadb-java-client/{}/mariadb-java-client-{}.jar:3.1.2:aaec1ad348d030a65b25c93c65cdaf472bf8b4b6b314b965e5ba13aec81bc622", "sqlite:org.sqlite.JDBC:https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/{}/sqlite-jdbc-{}.jar:3.8.11.1:58ab29176a24a85a0c76177561257a986c4865e45730b79882c688846371d341", "LiteBansModule_243:org.LiteBansModule_243.Driver:https://repo1.maven.org/maven2/com/h2database/LiteBansModule_243/{}/LiteBansModule_243-{}.jar:1.4.197:37f5216e14af2772930dff9b8734353f0a80e89ba3f33e065441de6537c5e842", "sql.drivers", "Using default database drivers (", ") + ", "sql.pool.min_connections", "sql.pool.max_connections", "sql.pool.keepalive", "0 seconds", "sql.pool.timeout", "95 seconds", "sql.pool.idle_timeout", "1 minute", "sql.pool.max_lifetime", "15 minutes", "durations.limits", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "27 seconds", "5 seconds", "permission", "none", "tempban", "tempmute", "cooldown_ban", "cooldown_mute", "cooldown_warn", "cooldown_kick", "cooldown_redo", "1 second", "require_template", "durations.console_cooldown", "1 second", "durations.effective_ipban_duration", "permanent", "security.obscure_seed", "0", "0", "1", "mutes.enabled", "durations.reduce_to_limit", "durations.round_down", "mutes.prevent_bypass", "lockdown.enabled", "lockdown.persist_enabled", "mutes.command_blacklist", "/me", "/say", "/msg", "/tell", "warnings.enabled", "warnings.expire_after", "3 days", "warnings.actions", "warnings.actions_execute_as_console", "warnings.delete_warnings_after_action", "ban_alts", "", "enhanced", "enabled", "extreme", "notify.dupeip_scan_filter_duration", "7d", "notify.dupeip_on_join_threshold", "notify.dupeip_scan_limit", "notify.notify_discord", "", "notify.banned_player_join", "notify.muted_player_chat", "notify.dupeip_on_join", "notify.dupeip_on_banned_account", "notify.dupeip_on_muted_account", "notify.dupeip_show_muted_accounts", "notify.notify_console", "exempt.enable", "exempt.use_group_weights", "exempt.permit_same_weight", "exempt.permission_world", "default", "exempt.exempt_groups", "exempt.exempt_players", "geoip.enable", "geoip.blacklist", "geoip.whitelist", "geoip.download.api", "https://repo1.maven.org/maven2/com/maxmind/geoip2/geoip2/2.1.0/geoip2-2.1.0.jar:81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.4.3/jackson-annotations-2.4.3.jar:3c680cfafad00cfe1432514f19c5c13fde17913aa2269a9844882404242f6452", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.4.3/jackson-core-2.4.3.jar:2c77b1c9441f257eb9e3dda476758a034a9383ef848f97b9949287a0519923e6", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.4.3/jackson-databind-2.4.3.jar:d7ac4f5ce138ce63478673e64378c2efd27f0294602f0fc69cb867685c723797", "https://repo1.maven.org/maven2/com/maxmind/LiteBansModule_116/maxmind-LiteBansModule_116/1.0.0/maxmind-LiteBansModule_116-1.0.0.jar:3cd5c1c731d8d9cb561d4e53ad6017862e4917cc08c24f45111061b1c2170b06", "geoip.download.LiteBansModule_116", "https://download.maxmind.com/app/geoip_download?edition_id=GeoLite2-Country&license_key=YOUR_LICENSE_KEY&suffix=tar.gz", "import.from", "vanilla", "import.sqlite", "import.import_ipbans", "import.sqlite_file", "plugins/MaxBans/bans.LiteBansModule_116", "import.import_mysql_address", "localhost:3306", "import.import_mysql_username", "", "import.import_mysql_password", StringDecryptor.BaseCoreGenericHandler("", 0x1E1BB1B1), "import.import_mysql_database", "maxbans", "import.import_table_prefix", "default", "console_sender_name", "Console", "autocomplete_online_player_names", "dupeip_scan_all_ips", "ipreport_minimum_accounts", "delete_previous_history", "unban_all_history", "support_authme", "use_display_names", "banlist_show_active_only", "banlist_bans_per_page", "ban_names", "FastLogin", "FastLogin detected; forcing `ban_names=true` + ", "offline_tab_size", "notification_throttle_ticks", "require_kick_reason", "require_ban_mute_reason", "require_unban_unmute_reason", "default_server_scope", "*", "sync_poll_ticks", "sync_poll_skip", "hidden_dupeip_players", "ignored_kick_messages", "restarting", "ignored_iphistory_servers", "ignored_history_servers", "disable_login_ban_check_servers", "default_history_limit", "sync", "sync_broadcasts", "sync_notifications", "sync_dupeip_notifications", "use_database_time", "local_messages", "check_after_join", "use_protocollib", "override_lower_duration", "allow_exempt_bypass", "silent", "punish_ip", "use_timezone", "update_check", "security.dupeip", "security.iphistory", "security.staffrollback", "security.modify", "security.prunehistory", "security.sender_custom", "security.ipban", "security.ipban_command", "disable_login_ban_check", "Local messages are disabled! If you don'AsyncBackgroundTask_22 see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, LiteBansModule_21 ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "m:", "LiteBansModule_238: ", "LITEBANS_CONFIG", "Loading environment options: ", "", "InnoDB", "mysql", "mariadb", "LiteBansModule_243", "sqlite", "InnoDB", "Local messages are disabled! If you don'AsyncBackgroundTask_22 see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, LiteBansModule_21 ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "server_name", "litebans", "[Sync] Server name cannot be \"", "\" (global context)! Reverting to ", "litebans", "server.yml", "server.json", "uuid", "uuid", "Server UUID: \""};
    }

    }

