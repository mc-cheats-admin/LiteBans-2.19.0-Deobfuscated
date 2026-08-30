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
    private final long LiteBansModule_435;
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
    private final String LiteBansModule_241;
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
    private final boolean LiteBansModule_195;
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
    private final boolean LiteBansModule_432;
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
    private final boolean LiteBansModule_403;
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
                            v4 = this;
                            v5 = System.getenv("LITEBANS_CONFIG");
                            if (v5 != null) {
                                v4.ServerSyncService.getLogger().info("Loading environment options: " + (String)v5);
                                v0 = new LiteBansModule_315().BaseCoreGenericHandler((String)v5);
                                ObjectUtilities.LiteBansModule_31(v0, "");
                                v6 = (HashMap)v0;
                                v7 = v6.entrySet();
                                v8 = v7.iterator();
                                while (v8.hasNext()) {
                                    v9 = v8.next();
                                    v10 = (Map.Entry)v9;
                                    v4.A.LiteBansModule_31((String)v10.getKey(), v10.getValue());
                                }
                            }
                            SQLiteDriverHandler_3.LiteBansModule_403.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler("online_player_select_limit", 64));
                            this.LiteBansModule_31 = this.A.BaseCoreGenericHandler("i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", false);
                            this.m = this.A.BaseCoreGenericHandler("disable_wildcard_bans", false);
                            this.ExceptionHandler = this.A.BaseCoreGenericHandler("disable_expiry_update", false);
                            v4 = this;
                            v11 = "database_time_offset";
                            v5 = "0 seconds";
                            this.c = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v4.bc().BaseCoreGenericHandler(v11, (String)v5), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v5, 0.0));
                            this.ah = LiteBansModule_284.BaseCoreGenericHandler((byte)this.A.BaseCoreGenericHandler("username_max_length", 16));
                            v3.BaseCoreGenericHandler((byte)Math.max(0, this.A.BaseCoreGenericHandler("debug_level", 0)));
                            this.AsyncBackgroundTask_5 = this.A.BaseCoreGenericHandler("bungeecord", false);
                            this.NullHandler_8 = this.A.BaseCoreGenericHandler("online_mode", true);
                            v11 = this.A.BaseCoreGenericHandler("sql.driver", "LiteBansModule_244");
                            v5 = Locale.ENGLISH;
                            v4 = v11.toLowerCase((Locale)v5);
                            if (StringUtilities.LiteBansModule_31((String)v4, "postgres", false, 2, null)) {
                                v4 = "pgsql";
                            }
                            this.plugin = v4;
                            v11 = this.A.BaseCoreGenericHandler("sql.address", "localhost:3306");
                            v5 = this.A.BaseCoreGenericHandler("sql.database", "litebans");
                            v12 = this.A.BaseCoreGenericHandler("sql.username", "");
                            v7 = this.A.BaseCoreGenericHandler("sql.password", "");
                            v13 = this.A.BaseCoreGenericHandler("sql.table_prefix", "litebans_");
                            if (ObjectUtilities.BaseCoreGenericHandler(v4, (Object)"LiteBansModule_244")) {
                                try {
                                    v9 = this.ServerSyncService.getDataFolder();
                                    v10 = "LiteBansModule_244.yml";
                                    v8 = new File((File)v9, (String)v10);
                                    if (!v8.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                                        v9 = this.ServerSyncService.getDataFolder();
                                        v10 = "LiteBansModule_244.json";
                                        v8 = new File((File)v9, (String)v10);
                                    }
                                    if (v8.exists()) {
                                        v9 = this.ServerSyncService.BaseCoreGenericHandler((File)v8).g();
                                        v12 = v9.BaseCoreGenericHandler("user", v12);
                                        v7 = v9.BaseCoreGenericHandler("password", (String)v7);
                                    }
                                }
                                catch (Exception v14) {
                                    v14.printStackTrace();
                                }
                            }
                            if (!ObjectUtilities.BaseCoreGenericHandler((Object)v13, (Object)"litebans_")) {
                                v8 = v13;
                                ObjectUtilities.BaseCoreGenericHandler(v8);
                                v8 = (CharSequence)v8;
                                v9 = new NativepatternHandler("^[0-9a-zA-Z_]*$");
                                if (!v9.BaseCoreGenericHandler((CharSequence)v8)) {
                                    this.ServerSyncService.getLogger().warning("Table prefix '" + v13 + "' is invalid! Using default ('litebans_') + ");
                                    v13 = "litebans_";
                                }
                            }
                            ObjectUtilities.BaseCoreGenericHandler((Object)v11);
                            this.SQLiteDriverHandler = v11;
                            v8 = v12;
                            ObjectUtilities.BaseCoreGenericHandler(v8);
                            this.aU = v8;
                            v8 = v7;
                            ObjectUtilities.BaseCoreGenericHandler(v8);
                            this.aM = v8;
                            ObjectUtilities.BaseCoreGenericHandler(v5);
                            this.AsyncBackgroundTask_22 = v5;
                            v8 = v13;
                            ObjectUtilities.BaseCoreGenericHandler(v8);
                            this.LiteBansModule_9 = v8;
                            v8 = this;
                            v9 = this.A.BaseCoreGenericHandler("sql.engine", "InnoDB");
                            this.LiteBansModule_17 = ObjectUtilities.BaseCoreGenericHandler(v9, (Object)"InnoDB") == false && ArrayUtilities.LiteBansModule_31(v15 = new String[]{"mysql", "mariadb", "LiteBansModule_244", "sqlite"}, v9.toLowerCase(Locale.ROOT)) != false ? "InnoDB" : v9;
                            this.BanHandler = v8 = this.A.BaseCoreGenericHandler("sql.options", "useSSL=false&serverTimezone=UTC");
                            v8 = "version:8";
                            v16   = new String[]{v8, DiscordWebhookClient.bf[48], DiscordWebhookClient.bf[49], DiscordWebhookClient.bf[50], DiscordWebhookClient.bf[51], DiscordWebhookClient.bf[52]};
                            v9 = v16  ;
                            v17 = this;
                            v18 = DiscordWebhookClient.bf[53];
                            v19 = (String[])Arrays.copyOf(v9, ((Object)v9).length);
                            if (!v17.bc().LiteBansModule_195((String)v18)) {
                                v1 = Arrays.copyOf(v19, ((String[])v19).length);
                            } else {
                                v20 = v17.bc().g((String)v18);
                                v21 = v20;
                                v1 = v21.toArray(new String[0]);
                            }
                            if (!ObjectUtilities.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(v16   = v1, 0), v8)) {
                                v16   = v9;
                                v3.BaseCoreGenericHandler((Object)(DiscordWebhookClient.bf[54] + (String)v8 + DiscordWebhookClient.bf[55]));
                            }
                            this.CommandExitException = v16  ;
                            this.PlayerQuitListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[56], 1);
                            this.LiteBansModule_13 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[57], 10);
                            v17 = this;
                            v18 = DiscordWebhookClient.bf[58];
                            v19 = DiscordWebhookClient.bf[59];
                            this.L = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v17.bc().BaseCoreGenericHandler((String)v18, (String)v19), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v19, 0.0));
                            v17 = this;
                            v18 = DiscordWebhookClient.bf[60];
                            v19 = DiscordWebhookClient.bf[61];
                            this.i = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v17.bc().BaseCoreGenericHandler((String)v18, (String)v19), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v19, 0.0));
                            v17 = this;
                            v18 = DiscordWebhookClient.bf[62];
                            v19 = DiscordWebhookClient.bf[63];
                            this.ak = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v17.bc().BaseCoreGenericHandler((String)v18, (String)v19), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v19, 0.0));
                            v17 = this;
                            v18 = DiscordWebhookClient.bf[64];
                            v19 = DiscordWebhookClient.bf[65];
                            this.LiteBansModule_435 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v17.bc().BaseCoreGenericHandler((String)v18, (String)v19), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v19, 0.0));
                            v17 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[66]);
                            v18 = new ArrayList<PunishmentService>();
                            if (v17 != null) {
                                v19 = v17.BaseCoreGenericHandler(false);
                                ObjectUtilities.BaseCoreGenericHandler(v19);
                                v22 = (Iterable)v19;
                                for (Object v21 : v22) {
                                    v23 = (String)v21;
                                    v24 = v17.BaseCoreGenericHandler(v23);
                                    if (v24 == null) continue;
                                    v25 = this;
                                    v26   = new String[]{DiscordWebhookClient.bf[67], DiscordWebhookClient.bf[68], DiscordWebhookClient.bf[69]};
                                    v27 = v26  ;
                                    v28 = new ArrayList<PunishmentService>();
                                    v29 = v27.length;
                                    for (v30 = 0; v30 < v29; ++v30) {
                                        v31 = v32 = v27[v30];
                                        if (!(v24.LiteBansModule_31((String)v31) == null)) continue;
                                        v28.add(v32);
                                    }
                                    v26   = (List)v28;
                                    v27 = v26  ;
                                    v28 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v26  , 10));
                                    for (T v33 : v27) {
                                        v32 = (String)v33;
                                        v34 = v28;
                                        v34.add(LiteBansModule_243.BaseCoreGenericHandler((CharSequence)(DiscordWebhookClient.bf[70] + v23 + DiscordWebhookClient.bf[71] + (String)v32 + DiscordWebhookClient.bf[72]), (CharSequence)DiscordWebhookClient.bf[73]));
                                    }
                                    v26   = (List)v28;
                                    v35 = v25.ServerSyncService.getLogger();
                                    for (PunishmentService v36 : v26  ) {
                                        v37 = (CharSequence)v36;
                                        v32 = v35;
                                        v32.warning(v37.toString());
                                    }
                                    v25 = DiscordWebhookClient.bf[74];
                                    v38 = DiscordWebhookClient.bf[75];
                                    v26   = v24.BaseCoreGenericHandler(DiscordWebhookClient.bf[76], DiscordWebhookClient.bf[77]);
                                    v28 = this;
                                    v39 = v24;
                                    v37 = DiscordWebhookClient.bf[78];
                                    v40 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v39.BaseCoreGenericHandler((String)v37, (String)v25), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v25, 0.0));
                                    v37 = this;
                                    v41 = v24;
                                    v32 = DiscordWebhookClient.bf[79];
                                    v42 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v41.BaseCoreGenericHandler((String)v32, (String)v25), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v25, 0.0));
                                    if (v40 <= 0L) {
                                        v40 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    if (v42 <= 0L) {
                                        v42 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    v32 = this;
                                    v31 = v24;
                                    v43 = DiscordWebhookClient.bf[80];
                                    v44 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v31.BaseCoreGenericHandler((String)v43, (String)v38), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v38, 0.0));
                                    v43 = this;
                                    v34 = v24;
                                    v45 = DiscordWebhookClient.bf[81];
                                    v46 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v34.BaseCoreGenericHandler((String)v45, (String)v38), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v38, 0.0));
                                    v45 = this;
                                    v47 = v24;
                                    v48 = DiscordWebhookClient.bf[82];
                                    v49 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v47.BaseCoreGenericHandler((String)v48, (String)v38), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v38, 0.0));
                                    v48 = this;
                                    v50 = v24;
                                    v51 = DiscordWebhookClient.bf[83];
                                    v52 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v50.BaseCoreGenericHandler((String)v51, (String)v38), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v38, 0.0));
                                    v51 = this;
                                    v53 = v24;
                                    v54 = DiscordWebhookClient.bf[84];
                                    v55 = DiscordWebhookClient.bf[85];
                                    v56 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v53.BaseCoreGenericHandler(v54, v55), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v55, 0.0));
                                    v57 = v24.BaseCoreGenericHandler(DiscordWebhookClient.bf[86], false);
                                    ObjectUtilities.BaseCoreGenericHandler(v26  );
                                    v53 = new LiteBansModule_110((String)v26  , new LiteBansModule_34(v40, v42), new LiteBansModule_23(v44, v46, v49, v52, v56), new LiteBansModule_3(v57));
                                    v18.add(v53);
                                }
                            }
                            this.g = (List)v18;
                            v19 = this;
                            v58   = DiscordWebhookClient.bf[87];
                            v20 = DiscordWebhookClient.bf[88];
                            this.ValueHandler = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v19.bc().BaseCoreGenericHandler((String)v58  , (String)v20), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v20, 0.0));
                            v19 = this;
                            v58   = DiscordWebhookClient.bf[89];
                            v20 = DiscordWebhookClient.bf[90];
                            this.PunishmentService = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v19.bc().BaseCoreGenericHandler((String)v58  , (String)v20), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v20, 0.0));
                            v19 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[91], DiscordWebhookClient.bf[92]);
                            if (ObjectUtilities.BaseCoreGenericHandler(v19, (Object)DiscordWebhookClient.bf[93])) {
                                v20 = LiteBansModule_180.BaseCoreGenericHandler;
                                v58   = StringUtilities.LiteBansModule_31((String)v20);
                                if (v58   != null) {
                                    v58   = v58  .longValue() * (long)127;
                                }
                                if ((v2 = (v20 = v58  )) == null || (v2 = (v59 = v2.toString())) == null) {
                                    v2 = DiscordWebhookClient.bf[94];
                                }
                                v19 = v2;
                            }
                            this.LiteBansModule_27 = v19.hashCode();
                            this.aO = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[95], true);
                            this.LiteBansModule_21 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[96], this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[97], true));
                            this.W = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[98], true);
                            this.D = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[99], true);
                            this.aa = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[100], true);
                            v20 = this;
                            v60 = DiscordWebhookClient.bf[101];
                            v21 = new String[]{DiscordWebhookClient.bf[102], DiscordWebhookClient.bf[103], DiscordWebhookClient.bf[104], DiscordWebhookClient.bf[105]};
                            if (!v20.bc().LiteBansModule_195(v60)) {
                                v3 = Arrays.copyOf(v21, ((String[])v21).length);
                            } else {
                                v61 = v20.bc().g(v60);
                                v25 = v61;
                                v3 = v25.toArray(new String[0]);
                            }
                            v58   = v3;
                            v20 = this;
                            v62 = this;
                            v21 = LiteBansModule_391.BaseCoreGenericHandler((String[])v58  );
                            v63 = v21;
                            v64 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v21, 10));
                            v38 = v63.iterator();
                            while (v38.hasNext()) {
                                v26   = v38.next();
                                v35 = (String)v26  ;
                                v65 = v64;
                                v65.add(StringUtilities.LiteBansModule_31((CharSequence)v35, ' ', false, 2, null) != false ? v35 : (String)v35 + ' ');
                            }
                            v62.LockdownCommandHandler = v66 = (List)v64;
                            v20 = this;
                            this.B = CollectionUtilities.g(LiteBansModule_391.BaseCoreGenericHandler((String[])v58  ));
                            this.BanHandler_4 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[106], true);
                            this.aE = v20 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[107], DiscordWebhookClient.bf[108]);
                            v20 = this;
                            v67 = DiscordWebhookClient.bf[109];
                            v21 = new String[]{};
                            if (!v20.bc().LiteBansModule_195((String)v67)) {
                                v4 = (String[])Arrays.copyOf(v21, ((Object)v21).length);
                            } else {
                                v63 = v20.bc().g((String)v67);
                                v68 = v63;
                                v4 = v68.toArray(new String[0]);
                            }
                            this.CommandThrottleService = v4;
                            this.bd = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[110], false);
                            this.BanHandler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[111]);
                            v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[112], DiscordWebhookClient.bf[113]);
                            v5 = v67;
                            v20 = v5 != null ? v5.toLowerCase(Locale.ROOT) : null;
                            v67 = v20;
                            if (v67 == null) break block68;
                            switch (v67.hashCode()) {
                                case 1841730422: {
                                    if (!v67.equals(DiscordWebhookClient.bf[114])) {
                                        break;
                                    }
                                    break block69;
                                }
                                case -1609594047: {
                                    if (v67.equals(DiscordWebhookClient.bf[115])) break;
                                    break;
                                }
                                case -1305285460: {
                                    if (!v67.equals(DiscordWebhookClient.bf[116])) {
                                        break;
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
            v67 = this;
            v21 = this.A;
            v69 = DiscordWebhookClient.bf[117];
            v63 = DiscordWebhookClient.bf[118];
            this.F = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(v21.BaseCoreGenericHandler((String)v69, (String)v63), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)v63, 0.0));
            this.LiteBansModule_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[119], 9999999);
            this.T = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[120], 20);
            this.BuilderactionHandler = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[121], DiscordWebhookClient.bf[122]);
            this.DatabaseMonitorService = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[123], true);
            this.LiteBansModule_14 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[124], true);
            this.aG = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[125], true) != false || this.PlayerproviderHandler > 1;
            this.ContinueEvictHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[126], true);
            this.InitHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[127], false);
            this.LiteBansModule_195 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[128], false);
            this.AsyncBackgroundTask_21 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[129], true);
            this.LiteBansModule_25 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[130], true);
            this.aj = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[131], false);
            this.af = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[132], true);
            this.be = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[133], DiscordWebhookClient.bf[134]);
            v67 = this;
            v21 = DiscordWebhookClient.bf[135];
            v69 = new String[]{};
            if (!v67.bc().LiteBansModule_195((String)v21)) {
                v7 = Arrays.copyOf(v69, v69.length);
            } else {
                v70 = v67.bc().g((String)v21);
                v38 = v70;
                v7 = v38.toArray(new String[0]);
            }
            this.LiteBansModule = v7;
            v67 = this;
            v21 = DiscordWebhookClient.bf[136];
            v69 = new String[]{};
            if (!v67.bc().LiteBansModule_195((String)v21)) {
                v8 = Arrays.copyOf(v69, v69.length);
            } else {
                v71 = v67.bc().g((String)v21);
                v38 = v71;
                v8 = v38.toArray(new String[0]);
            }
            this.TapeHandler = v8;
            this.LiteBansModule_7 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[137], false);
            v67 = this;
            v21 = DiscordWebhookClient.bf[138];
            v69 = new String[]{};
            if (!v67.bc().LiteBansModule_195((String)v21)) {
                v9 = Arrays.copyOf(v69, v69.length);
            } else {
                v72 = v67.bc().g((String)v21);
                v38 = v72;
                v9 = v38.toArray(new String[0]);
            }
            this.az = v9;
            v67 = this;
            v21 = DiscordWebhookClient.bf[139];
            v69 = new String[]{};
            if (!v67.bc().LiteBansModule_195((String)v21)) {
                v10 = Arrays.copyOf(v69, v69.length);
            } else {
                v73 = v67.bc().g((String)v21);
                v38 = v73;
                v10 = v38.toArray(new String[0]);
            }
            this.HoverTextFormatter = v10;
            v67 = this;
            v21 = DiscordWebhookClient.bf[140];
            v69 = new String[]{DiscordWebhookClient.bf[141], DiscordWebhookClient.bf[142], DiscordWebhookClient.bf[143], DiscordWebhookClient.bf[144], DiscordWebhookClient.bf[145]};
            if (!v67.bc().LiteBansModule_195((String)v21)) {
                v11 = Arrays.copyOf(v69, v69.length);
            } else {
                v74 = v67.bc().g((String)v21);
                v38 = v74;
                v11 = v38.toArray(new String[0]);
            }
            this.LiteBansModule_29 = v11;
            this.n = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[146], DiscordWebhookClient.bf[147]);
            this.ad = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[148], DiscordWebhookClient.bf[149]);
            this.ar = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[150], true);
            this.LiteBansModule_3 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[151], true);
            this.Y = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[152], DiscordWebhookClient.bf[153]);
            this.LiteBansModule_43 = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[154], DiscordWebhookClient.bf[155]);
            this.K = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[156], DiscordWebhookClient.bf[157]);
            this.PunishmentTableService = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[158], DiscordWebhookClient.bf[159]);
            this.MessageKey = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[160], DiscordWebhookClient.bf[161]);
            this.LiteBansModule_241 = v67 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[162], DiscordWebhookClient.bf[163]);
            v67 = litebans.MessageKey.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[164], DiscordWebhookClient.bf[165]), true);
            v67 = (CharSequence)v67;
            v75 = this.ah;
            this.LiteBansModule_15 = LiteBansModule_243.BaseCoreGenericHandler(v67.toString(), v75 & 255);
            this.LiteBansModule_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[166], false);
            this.BanHandler_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[167], false);
            v67 = this;
            v76 = this.A;
            v77 = DiscordWebhookClient.bf[168];
            v78 = 1;
            this.HikariConfig = (byte)v76.BaseCoreGenericHandler((String)v77, v78);
            this.SetHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[169], true);
            this.Utf8Handler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[170], false);
            this.aT = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[171], true);
            this.LiteBansModule_432 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[172], false);
            this.V = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[173], false);
            this.H = Math.max(0, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[174], 5));
            v79 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[175], false);
            if (this.ServerSyncService.AsyncBackgroundTask_22() == 0 && this.ServerSyncService.i().BaseCoreGenericHandler(DiscordWebhookClient.bf[176])) {
                v3.BaseCoreGenericHandler((Object)DiscordWebhookClient.bf[177]);
            }
            this.ac = v79;
            this.ab = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[178], 12000);
            this.r = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[179], 12000);
            this.ServerEventListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[180], false);
            this.ElementsHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[181], false);
            this.LiteBansModule_6 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[182], false);
            v76 = DiscordWebhookClient.BaseCoreGenericHandler(this, false, 1, null);
            this.ai = (String)v76.LiteBansModule_31();
            this.BroadcastService = (String)v76.e();
            v77 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[183], DiscordWebhookClient.bf[184]);
            this.LiteBansModule_12 = LiteBansModule_243.BaseCoreGenericHandler((String)v77, 32);
            this.HikariDataSource = Math.max(40L, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[185], 55L));
            this.S = Math.max(1, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[186], 3));
            v77 = DiscordWebhookClient.bf[187];
            v78 = 1;
            v80 = this;
            v38 = new String[]{};
            if (!v80.bc().LiteBansModule_195((String)v77)) {
                v12 = Arrays.copyOf(v38, ((String[])v38).length);
            } else {
                v35 = v80.bc().g((String)v77);
                v81 = v35;
                v12 = v81.toArray(new String[0]);
            }
            this.LiteBansModule_24 = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_391.BaseCoreGenericHandler(v12));
            v77 = this;
            v82 = DiscordWebhookClient.bf[188];
            v83 = new String[]{DiscordWebhookClient.bf[189]};
            if (!v77.bc().LiteBansModule_195(v82)) {
                v13 = Arrays.copyOf(v83, v83.length);
            } else {
                v38 = v77.bc().g(v82);
                v35 = v38;
                v13 = v35.toArray(new String[0]);
            }
            this.GnuSparseMapHandler = LiteBansModule_391.BaseCoreGenericHandler(v13);
            v77 = this;
            v82 = DiscordWebhookClient.bf[190];
            v84 = this;
            v38 = DiscordWebhookClient.bf[191];
            v85 = new String[]{};
            if (!v84.bc().LiteBansModule_195((String)v38)) {
                v14 = Arrays.copyOf(v85, v85.length);
            } else {
                v86 = v84.bc().g((String)v38);
                v39 = v86;
                v14 = v39.toArray(new String[0]);
            }
            v83 = v14;
            v83 = Arrays.copyOf(v83, v83.length);
            if (!v77.bc().LiteBansModule_195(v82)) {
                v15 = Arrays.copyOf(v83, v83.length);
            } else {
                v38 = v77.bc().g(v82);
                v87 = v38;
                v15 = v87.toArray(new String[0]);
            }
            this.z = LiteBansModule_391.BaseCoreGenericHandler(v15);
            v77 = DiscordWebhookClient.bf[192];
            v88 = this;
            v38 = new String[]{};
            if (!v88.bc().LiteBansModule_195((String)v77)) {
                v16 = (String[])Arrays.copyOf(v38, ((Object)v38).length);
            } else {
                v89 = v88.bc().g((String)v77);
                v90 = v89;
                v16 = v90.toArray(new String[0]);
            }
            this.P = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_391.BaseCoreGenericHandler(v16));
            v77 = LiteBansModule_182.LiteBansModule_195;
            v91 = this.z;
            v62 = this;
            v88 = v91;
            if (v88 instanceof Collection && ((Collection)v88).isEmpty()) {
                v17 = false;
            } else {
                v92 = v88.iterator();
                while (v92.hasNext()) {
                    v93 = v92.next();
                    v94 = (String)v93;
                    if (!LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v94)) continue;
                    v17 = true;
                    break block67;
                }
                v17 = false;
            }
        }
        v62.aL = (v95 = v17) != false || this.z.contains(v76.LiteBansModule_31()) != false;
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
        this.LiteBansModule_403 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[212], false);
        this.J = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[213], true);
        this.q = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[214], true);
        this.X = (byte)Math.min(this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[215], 1), 2);
        this.aW = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[216], false) != false && this.ServerSyncService.AsyncBackgroundTask_22() == 0;
        v77 = this;
        v96 = v77.ServerSyncService.getLogger();
        if (!v77.PluginHookService) {
            v96.warning(DiscordWebhookClient.bf[217]);
        }
        if (v77.aW) {
            v96.warning(DiscordWebhookClient.bf[218]);
        }
        if (v77.m) {
            v96.warning(DiscordWebhookClient.bf[219]);
        }
        if (v77.ExceptionHandler) {
            v96.warning(DiscordWebhookClient.bf[220]);
        }
        if (v77.PlayerproviderHandler == 0) {
            v18 = v77.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[221], DiscordWebhookClient.bf[222]);
            if (v18 == null || (v18 = v18.toLowerCase(Locale.ROOT)) == null) {
                v18 = DiscordWebhookClient.bf[223];
            }
            if (((CharSequence)(v97 = v18)).length() > 0 && !ObjectUtilities.BaseCoreGenericHandler((Object)v97, (Object)DiscordWebhookClient.bf[224])) {
                v96.warning(DiscordWebhookClient.bf[225] + v97 + DiscordWebhookClient.bf[226]);
            }
        }
        v77 = v3;
        if (v77.g()) {
            v62 = v77;
            v98 = LiteBansModule_243.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler((CharSequence)CollectionUtilities.BaseCoreGenericHandler(this.g, null, null, null, 0, null, null, 63, null), (CharSequence)(DiscordWebhookClient.bf[227] + Arrays.toString(v58  ))), (CharSequence)(DiscordWebhookClient.bf[228] + Arrays.toString(this.HoverTextFormatter)));
            v62.BaseCoreGenericHandler(v98);
        }
    }

    public /* synthetic */ DiscordWebhookClient(PlatformPlugin plugin, DatabaseService gn_02, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            gn_02 = plugin.LiteBansModule_241();
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

    public final long LiteBansModule_403() {
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

    public final boolean LiteBansModule_432() {
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
        return this.LiteBansModule_241;
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
        return this.LiteBansModule_195;
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
        return this.LiteBansModule_432;
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

    public final boolean LiteBansModule_435() {
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

    public final boolean LiteBansModule_195() {
        return this.LiteBansModule_403;
    }

    public final boolean LiteBansModule_24() {
        return this.J;
    }

    public final boolean HikariConfig() {
        return this.LiteBansModule_10;
    }

    public final boolean LiteBansModule_241() {
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

    public final LiteBansModule_356 BaseCoreGenericHandler(boolean flag) {
        String string;
        ConfigService configService = (ConfigService)this.ServerSyncService.BaseCoreGenericHandler(ConfigService.class);
        String string2 = LiteBansModule_243.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(bf[255], bf[256]), 32);
        if (LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(string2)) {
            configService.BaseCoreGenericHandler((Object)(bf[257] + string2 + bf[258]));
            string2 = bf[259];
        }
        String string3 = null;
        File file = this.ServerSyncService.getDataFolder();
        Object targetObj = bf[260];
        File file2 = new File(file, (String)targetObj);
        if (!file2.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
            file = this.ServerSyncService.getDataFolder();
            targetObj = bf[261];
            flag2 = false;
            file2 = new File(file, (String)targetObj);
        }
        try {
            boolean flag3 = flag || !file2.exists();
            targetObj = this.ServerSyncService.BaseCoreGenericHandler(file2).g();
            String string4 = targetObj.BaseCoreGenericHandler(bf[262], null);
            if (string4 != null && string4.length() == 32) {
                string3 = string4;
            } else {
                string3 = this.T();
                flag3 = true;
            }
            if (flag3) {
                targetObj.LiteBansModule_31(bf[263], string3);
                ((DatabaseService)targetObj).LiteBansModule_241();
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
        LiteBansModule_356 jT2 = LiteBansModule_373.BaseCoreGenericHandler(string2, string);
        targetObj = configService;
        int n = 10;
        if (((ConfigService)targetObj).BaseCoreGenericHandler(n)) {
            Object contextObj = targetObj;
            ((ConfigService)contextObj).BaseCoreGenericHandler((Object)(bf[264] + (String)jT2.e() + '\"'));
        }
        return jT2;
    }

    public static /* synthetic */ LiteBansModule_356 BaseCoreGenericHandler(DiscordWebhookClient eG2, boolean flag, int n, Object targetObj) {
        if ((n & 1) != 0) {
            flag = false;
        }
        return eG2.BaseCoreGenericHandler(flag);
    }

    public final String T() {
        return LiteBansModule_50.c.BaseCoreGenericHandler(UUID.randomUUID());
    }

    private static final void ba() {
        bf = new String[]{"LITEBANS_CONFIG", "Loading environment options: ", "", "online_player_select_limit", "i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", "disable_wildcard_bans", "disable_expiry_update", "database_time_offset", "0 seconds", "username_max_length", "debug_level", "bungeecord", "online_mode", "sql.driver", "LiteBansModule_244", "postgres", "pgsql", "sql.address", "localhost:3306", "sql.database", "litebans", "sql.username", "", "sql.password", "", "sql.table_prefix", "litebans_", "LiteBansModule_244", "LiteBansModule_244.yml", "LiteBansModule_244.json", "user", "password", "litebans_", "^[0-9a-zA-Z_]*$", "Table prefix '", "' is invalid! Using default ('litebans_') + ", "litebans_", "sql.engine", "InnoDB", "InnoDB", "mysql", "mariadb", "LiteBansModule_244", "sqlite", "InnoDB", "sql.options", "useSSL=false&serverTimezone=UTC", "version:8", "mysql:com.mysql.cj.jdbc.Driver:https://repo1.maven.org/maven2/mysql/mysql-connector-java/{}/mysql-connector-java-{}.jar:8.0.29:d4e32d2a6026b5acc00300b73a86c28fb92681ae9629b21048ee67014c911db6", "pgsql:org.postgresql.Driver:https://repo1.maven.org/maven2/org/postgresql/postgresql/{}/postgresql-{}.jar:42.4.0:fe25b9c0a2c59458504ec88862853df522ee87f8a02564835d537c29ae4cb125", "mariadb:org.mariadb.jdbc.Driver:https://repo1.maven.org/maven2/org/mariadb/jdbc/mariadb-java-client/{}/mariadb-java-client-{}.jar:3.1.2:aaec1ad348d030a65b25c93c65cdaf472bf8b4b6b314b965e5ba13aec81bc622", "sqlite:org.sqlite.JDBC:https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/{}/sqlite-jdbc-{}.jar:3.8.11.1:58ab29176a24a85a0c76177561257a986c4865e45730b79882c688846371d341", "LiteBansModule_244:org.LiteBansModule_244.Driver:https://repo1.maven.org/maven2/com/h2database/LiteBansModule_244/{}/LiteBansModule_244-{}.jar:1.4.197:37f5216e14af2772930dff9b8734353f0a80e89ba3f33e065441de6537c5e842", "sql.drivers", "Using default database drivers (", ") + ", "sql.pool.min_connections", "sql.pool.max_connections", "sql.pool.keepalive", "0 seconds", "sql.pool.timeout", "95 seconds", "sql.pool.idle_timeout", "1 minute", "sql.pool.max_lifetime", "15 minutes", "durations.limits", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "27 seconds", "5 seconds", "permission", "none", "tempban", "tempmute", "cooldown_ban", "cooldown_mute", "cooldown_warn", "cooldown_kick", "cooldown_redo", "1 second", "require_template", "durations.console_cooldown", "1 second", "durations.effective_ipban_duration", "permanent", "security.obscure_seed", "0", "0", "1", "mutes.enabled", "durations.reduce_to_limit", "durations.round_down", "mutes.prevent_bypass", "lockdown.enabled", "lockdown.persist_enabled", "mutes.command_blacklist", "/me", "/say", "/msg", "/tell", "warnings.enabled", "warnings.expire_after", "3 days", "warnings.actions", "warnings.actions_execute_as_console", "warnings.delete_warnings_after_action", "ban_alts", "", "enhanced", "enabled", "extreme", "notify.dupeip_scan_filter_duration", "7d", "notify.dupeip_on_join_threshold", "notify.dupeip_scan_limit", "notify.notify_discord", "", "notify.banned_player_join", "notify.muted_player_chat", "notify.dupeip_on_join", "notify.dupeip_on_banned_account", "notify.dupeip_on_muted_account", "notify.dupeip_show_muted_accounts", "notify.notify_console", "exempt.enable", "exempt.use_group_weights", "exempt.permit_same_weight", "exempt.permission_world", "default", "exempt.exempt_groups", "exempt.exempt_players", "geoip.enable", "geoip.blacklist", "geoip.whitelist", "geoip.download.api", "https://repo1.maven.org/maven2/com/maxmind/geoip2/geoip2/2.1.0/geoip2-2.1.0.jar:81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.4.3/jackson-annotations-2.4.3.jar:3c680cfafad00cfe1432514f19c5c13fde17913aa2269a9844882404242f6452", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.4.3/jackson-core-2.4.3.jar:2c77b1c9441f257eb9e3dda476758a034a9383ef848f97b9949287a0519923e6", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.4.3/jackson-databind-2.4.3.jar:d7ac4f5ce138ce63478673e64378c2efd27f0294602f0fc69cb867685c723797", "https://repo1.maven.org/maven2/com/maxmind/LiteBansModule_117/maxmind-LiteBansModule_117/1.0.0/maxmind-LiteBansModule_117-1.0.0.jar:3cd5c1c731d8d9cb561d4e53ad6017862e4917cc08c24f45111061b1c2170b06", "geoip.download.LiteBansModule_117", "https://download.maxmind.com/app/geoip_download?edition_id=GeoLite2-Country&license_key=YOUR_LICENSE_KEY&suffix=tar.gz", "import.from", "vanilla", "import.sqlite", "import.import_ipbans", "import.sqlite_file", "plugins/MaxBans/bans.LiteBansModule_117", "import.import_mysql_address", "localhost:3306", "import.import_mysql_username", "", "import.import_mysql_password", StringDecryptor.BaseCoreGenericHandler("", 0x1E1BB1B1), "import.import_mysql_database", "maxbans", "import.import_table_prefix", "default", "console_sender_name", "Console", "autocomplete_online_player_names", "dupeip_scan_all_ips", "ipreport_minimum_accounts", "delete_previous_history", "unban_all_history", "support_authme", "use_display_names", "banlist_show_active_only", "banlist_bans_per_page", "ban_names", "FastLogin", "FastLogin detected; forcing `ban_names=true` + ", "offline_tab_size", "notification_throttle_ticks", "require_kick_reason", "require_ban_mute_reason", "require_unban_unmute_reason", "default_server_scope", "*", "sync_poll_ticks", "sync_poll_skip", "hidden_dupeip_players", "ignored_kick_messages", "restarting", "ignored_iphistory_servers", "ignored_history_servers", "disable_login_ban_check_servers", "default_history_limit", "sync", "sync_broadcasts", "sync_notifications", "sync_dupeip_notifications", "use_database_time", "local_messages", "check_after_join", "use_protocollib", "override_lower_duration", "allow_exempt_bypass", "silent", "punish_ip", "use_timezone", "update_check", "security.dupeip", "security.iphistory", "security.staffrollback", "security.modify", "security.prunehistory", "security.sender_custom", "security.ipban", "security.ipban_command", "disable_login_ban_check", "Local messages are disabled! If you don'AsyncBackgroundTask_22 see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, LiteBansModule_21 ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "m:", "LiteBansModule_239: ", "LITEBANS_CONFIG", "Loading environment options: ", "", "InnoDB", "mysql", "mariadb", "LiteBansModule_244", "sqlite", "InnoDB", "Local messages are disabled! If you don'AsyncBackgroundTask_22 see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, LiteBansModule_21 ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "server_name", "litebans", "[Sync] Server name cannot be \"", "\" (global context)! Reverting to ", "litebans", "server.yml", "server.json", "uuid", "uuid", "Server UUID: \""};
    }

    static {
        DiscordWebhookClient.ba();
    }
}
}
