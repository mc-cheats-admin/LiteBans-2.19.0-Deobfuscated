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
{
                            super();
                            this.ServerSyncService = v1;
                            this.A = v2;
                            v3 = this.ServerSyncService.BaseCoreGenericHandler(ConfigService.class);
                            v3.BaseCoreGenericHandler(this);
                                                        arg2 = System.getenv("LITEBANS_CONFIG");
                            if (arg2 != null) {
                                arg1.ServerSyncService.getLogger().info("Loading environment options: " + (String)arg2);
                                v0 = new LiteBansModule_314().BaseCoreGenericHandler((String)arg2);
                                ObjectUtilities.LiteBansModule_31(v0, "");
                                arg3 = (HashMap)v0;
                                arg4 = arg3.entrySet();
                                arg5 = arg4.iterator();
                                while (arg5.hasNext()) {
                                    arg6 = arg5.next();
                                    arg7 = (Map.Entry)arg6;
                                    arg1.A.LiteBansModule_31((String)arg7.getKey(), arg7.getValue());
}
                            SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler("online_player_select_limit", 64));
                            this.LiteBansModule_31 = this.A.BaseCoreGenericHandler("i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", false);
                            this.m = this.A.BaseCoreGenericHandler("disable_wildcard_bans", false);
                            this.ExceptionHandler = this.A.BaseCoreGenericHandler("disable_expiry_update", false);
                                                        arg8 = "database_time_offset";
                            arg2 = "0 seconds";
                            this.c = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg1.bc().BaseCoreGenericHandler(arg8, (String)arg2), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg2, 0.0));
                            this.ah = LiteBansModule_283.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler("username_max_length", 16));
                            v3.BaseCoreGenericHandler((byte)Math.max(0, this.A.BaseCoreGenericHandler("debug_level", 0)));
                            this.AsyncBackgroundTask_5 = this.A.BaseCoreGenericHandler("bungeecord", false);
                            this.NullHandler_8 = this.A.BaseCoreGenericHandler("online_mode", true);
                            arg8 = this.A.BaseCoreGenericHandler("sql.driver", "LiteBansModule_243");
                            arg2 = Locale.ENGLISH;
                            arg1 = arg8.toLowerCase((Locale)arg2);
                            if (StringUtilities.LiteBansModule_31((String)arg1, "postgres", false, 2, null)) {
                                arg1 = "pgsql";
                            }
                            this.plugin = arg1;
                            arg8 = this.A.BaseCoreGenericHandler("sql.address", "localhost:3306");
                            arg2 = this.A.BaseCoreGenericHandler("sql.database", "litebans");
                            v7 = this.A.BaseCoreGenericHandler("sql.username", "");
                            arg4 = this.A.BaseCoreGenericHandler("sql.password", "");
                            arg9 = this.A.BaseCoreGenericHandler("sql.table_prefix", "litebans_");
                            if (ObjectUtilities.BaseCoreGenericHandler(arg1, (Object)"LiteBansModule_243")) {
                                try {
                                    arg6 = this.ServerSyncService.getDataFolder();
                                    arg7 = "LiteBansModule_243.yml";
                                    arg5 = new File((File)arg6, (String)arg7);
                                    if (!arg5.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                                        arg6 = this.ServerSyncService.getDataFolder();
                                        arg7 = "LiteBansModule_243.json";
                                        arg5 = new File((File)arg6, (String)arg7);
                                    }
                                    if (arg5.exists()) {
                                        arg6 = this.ServerSyncService.BaseCoreGenericHandler((File)arg5).g();
                                        v7 = arg6.BaseCoreGenericHandler("user", v7);
                                        arg4 = arg6.BaseCoreGenericHandler("password", (String)arg4);
}
                                catch (Exception arg10) {
                                    arg10.printStackTrace();
}
                            if (!ObjectUtilities.BaseCoreGenericHandler(arg9, (Object)"litebans_")) {
                                arg5 = arg9;
                                ObjectUtilities.BaseCoreGenericHandler(arg5);
                                arg5 = arg5;
                                arg6 = new NativepatternHandler("^[0-9a-zA-Z_]*$");
                                if (!arg6.BaseCoreGenericHandler(arg5)) {
                                    this.ServerSyncService.getLogger().warning("Table prefix '" + arg9 + "' is invalid! Using default ('litebans_') + ");
                                    arg9 = "litebans_";
}
                            ObjectUtilities.BaseCoreGenericHandler(arg8);
                            this.SQLiteDriverHandler = arg8;
                            arg5 = v7;
                            ObjectUtilities.BaseCoreGenericHandler(arg5);
                            this.aU = arg5;
                            arg5 = arg4;
                            ObjectUtilities.BaseCoreGenericHandler(arg5);
                            this.aM = arg5;
                            ObjectUtilities.BaseCoreGenericHandler(arg2);
                            this.AsyncBackgroundTask_22 = arg2;
                            arg5 = arg9;
                            ObjectUtilities.BaseCoreGenericHandler(arg5);
                            this.LiteBansModule_9 = arg5;
                                                        arg6 = this.A.BaseCoreGenericHandler("sql.engine", "InnoDB");
                            this.LiteBansModule_17 = ObjectUtilities.BaseCoreGenericHandler(arg6, (Object)"InnoDB") == false && ArrayUtilities.LiteBansModule_31(arg11 = new String[]{"mysql", "mariadb", "LiteBansModule_243", "sqlite"}, arg6.toLowerCase(Locale.ROOT)) != false ? "InnoDB" : arg6;
                            this.BanHandler = arg5 = this.A.BaseCoreGenericHandler("sql.options", "useSSL=false&serverTimezone=UTC");
                            arg5 = "version:8";
                            arg12   = new String[]{arg5, DiscordWebhookClient.bf[48], DiscordWebhookClient.bf[49], DiscordWebhookClient.bf[50], DiscordWebhookClient.bf[51], DiscordWebhookClient.bf[52]};
                            arg6 = arg12  ;
                                                        arg14 = DiscordWebhookClient.bf[53];
                            arg15 = (String[])Arrays.copyOf(arg6, (arg6).length);
                            if (!arg13.bc().LiteBansModule_194((String)arg14)) {
                                v1 = Arrays.copyOf(arg15, ((String[])arg15).length);
                            } else {
                                arg16 = arg13.bc().g((String)arg14);
                                arg17 = arg16;
                                v1 = arg17.toArray(new String[0]);
                            }
                            if (!ObjectUtilities.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(arg12   = v1, 0), arg5)) {
                                arg12   = arg6;
                                v3.BaseCoreGenericHandler((Object)(DiscordWebhookClient.bf[54] + (String)arg5 + DiscordWebhookClient.bf[55]));
                            }
                            this.CommandExitException = arg12  ;
                            this.PlayerQuitListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[56], 1);
                            this.LiteBansModule_13 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[57], 10);
                                                        arg14 = DiscordWebhookClient.bf[58];
                            arg15 = DiscordWebhookClient.bf[59];
                            this.L = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg13.bc().BaseCoreGenericHandler((String)arg14, (String)arg15), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg15, 0.0));
                                                        arg14 = DiscordWebhookClient.bf[60];
                            arg15 = DiscordWebhookClient.bf[61];
                            this.i = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg13.bc().BaseCoreGenericHandler((String)arg14, (String)arg15), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg15, 0.0));
                                                        arg14 = DiscordWebhookClient.bf[62];
                            arg15 = DiscordWebhookClient.bf[63];
                            this.ak = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg13.bc().BaseCoreGenericHandler((String)arg14, (String)arg15), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg15, 0.0));
                                                        arg14 = DiscordWebhookClient.bf[64];
                            arg15 = DiscordWebhookClient.bf[65];
                            this.LiteBansModule_433 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg13.bc().BaseCoreGenericHandler((String)arg14, (String)arg15), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg15, 0.0));
                            arg13 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[66]);
                            arg14 = new ArrayList<PunishmentService>();
                            if (arg13 != null) {
                                arg15 = arg13.BaseCoreGenericHandler(false);
                                ObjectUtilities.BaseCoreGenericHandler(arg15);
                                arg18 = (Iterable)arg15;
                                for (Object arg17 : arg18) {
                                    arg19 = (String)arg17;
                                    arg20 = arg13.BaseCoreGenericHandler(arg19);
                                    if (arg20 == null) continue;
                                                                        arg22   = new String[]{DiscordWebhookClient.bf[67], DiscordWebhookClient.bf[68], DiscordWebhookClient.bf[69]};
                                    arg23 = arg22  ;
                                    arg24 = new ArrayList<PunishmentService>();
                                    arg25 = arg23.length;
                                    for (arg26 = 0; arg26 < arg25; ++arg26) {
                                        arg27 = arg28 = arg23[arg26];
                                        if (!(arg20.LiteBansModule_31((String)arg27) == null)) continue;
                                        arg24.add(arg28);
                                    }
                                    arg22   = (List)arg24;
                                    arg23 = arg22  ;
                                    arg24 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg22  , 10));
                                    for (T arg29 : arg23) {
                                        arg28 = (String)arg29;
                                        arg30 = arg24;
                                        arg30.add(LiteBansModule_242.BaseCoreGenericHandler((CharSequence)(DiscordWebhookClient.bf[70] + arg19 + DiscordWebhookClient.bf[71] + (String)arg28 + DiscordWebhookClient.bf[72]), DiscordWebhookClient.bf[73]));
                                    }
                                    arg22   = (List)arg24;
                                    arg31 = arg21.ServerSyncService.getLogger();
                                    for (PunishmentService arg32 : arg22  ) {
                                        arg33 = arg32;
                                        arg28 = arg31;
                                        arg28.warning(arg33.toString());
                                    }
                                    arg21 = DiscordWebhookClient.bf[74];
                                    arg34 = DiscordWebhookClient.bf[75];
                                    arg22   = arg20.BaseCoreGenericHandler(DiscordWebhookClient.bf[76], DiscordWebhookClient.bf[77]);
                                                                        arg35 = arg20;
                                    arg33 = DiscordWebhookClient.bf[78];
                                    arg36 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg35.BaseCoreGenericHandler((String)arg33, (String)arg21), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg21, 0.0));
                                                                        arg37 = arg20;
                                    arg28 = DiscordWebhookClient.bf[79];
                                    arg38 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg37.BaseCoreGenericHandler((String)arg28, (String)arg21), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg21, 0.0));
                                    if (arg36 <= 0L) {
                                        arg36 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    if (arg38 <= 0L) {
                                        arg38 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                                                        arg27 = arg20;
                                    arg39 = DiscordWebhookClient.bf[80];
                                    arg40 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg27.BaseCoreGenericHandler((String)arg39, (String)arg34), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg34, 0.0));
                                                                        arg30 = arg20;
                                    arg41 = DiscordWebhookClient.bf[81];
                                    arg42 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg30.BaseCoreGenericHandler((String)arg41, (String)arg34), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg34, 0.0));
                                                                        arg43 = arg20;
                                    arg44 = DiscordWebhookClient.bf[82];
                                    arg45 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg43.BaseCoreGenericHandler((String)arg44, (String)arg34), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg34, 0.0));
                                                                        arg46 = arg20;
                                    arg47 = DiscordWebhookClient.bf[83];
                                    arg48 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg46.BaseCoreGenericHandler((String)arg47, (String)arg34), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg34, 0.0));
                                                                        arg49 = arg20;
                                    arg50 = DiscordWebhookClient.bf[84];
                                    arg51 = DiscordWebhookClient.bf[85];
                                    arg52 = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg49.BaseCoreGenericHandler(arg50, arg51), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg51, 0.0));
                                    arg53 = arg20.BaseCoreGenericHandler(DiscordWebhookClient.bf[86], false);
                                    ObjectUtilities.BaseCoreGenericHandler(arg22  );
                                    arg49 = new LiteBansModule_109((String)arg22  , new LiteBansModule_34(arg36, arg38), new LiteBansModule_23(arg40, arg42, arg45, arg48, arg52), new LiteBansModule_3(arg53));
                                    arg14.add(arg49);
}
                            this.g = (List)arg14;
                                                        arg54   = DiscordWebhookClient.bf[87];
                            arg16 = DiscordWebhookClient.bf[88];
                            this.ValueHandler = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg15.bc().BaseCoreGenericHandler((String)arg54  , (String)arg16), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg16, 0.0));
                                                        arg54   = DiscordWebhookClient.bf[89];
                            arg16 = DiscordWebhookClient.bf[90];
                            this.PunishmentService = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg15.bc().BaseCoreGenericHandler((String)arg54  , (String)arg16), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg16, 0.0));
                            arg15 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[91], DiscordWebhookClient.bf[92]);
                            if (ObjectUtilities.BaseCoreGenericHandler(arg15, DiscordWebhookClient.bf[93])) {
                                arg16 = LiteBansModule_179.BaseCoreGenericHandler;
                                arg54   = StringUtilities.LiteBansModule_31((String)arg16);
                                if (arg54   != null) {
                                    arg54   = arg54  .longValue() * (long)127;
                                }
                                if ((v2 = (arg16 = arg54  )) == null || (v2 = (arg55 = v2.toString())) == null) {
                                    v2 = DiscordWebhookClient.bf[94];
                                }
                                arg15 = v2;
                            }
                            this.LiteBansModule_27 = arg15.hashCode();
                            this.aO = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[95], true);
                            this.LiteBansModule_21 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[96], this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[97], true));
                            this.W = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[98], true);
                            this.D = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[99], true);
                            this.aa = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[100], true);
                                                        arg56 = DiscordWebhookClient.bf[101];
                            arg17 = new String[]{DiscordWebhookClient.bf[102], DiscordWebhookClient.bf[103], DiscordWebhookClient.bf[104], DiscordWebhookClient.bf[105]};
                            if (!arg16.bc().LiteBansModule_194(arg56)) {
                                v3 = Arrays.copyOf(arg17, ((String[])arg17).length);
                            } else {
                                arg57 = arg16.bc().g(arg56);
                                arg21 = arg57;
                                v3 = arg21.toArray(new String[0]);
                            }
                            arg54   = v3;
                                                                                    arg17 = LiteBansModule_389.BaseCoreGenericHandler((String[])arg54  );
                            arg59 = arg17;
                            arg60 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg17, 10));
                            arg34 = arg59.iterator();
                            while (arg34.hasNext()) {
                                arg22   = arg34.next();
                                arg31 = (String)arg22  ;
                                arg61 = arg60;
                                arg61.add(StringUtilities.LiteBansModule_31(arg31, ' ', false, 2, null) != false ? arg31 : (String)arg31 + ' ');
                            }
                            arg58.LockdownCommandHandler = arg62 = (List)arg60;
                                                        this.B = CollectionUtilities.g(LiteBansModule_389.BaseCoreGenericHandler((String[])arg54  ));
                            this.BanHandler_4 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[106], true);
                            this.aE = arg16 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[107], DiscordWebhookClient.bf[108]);
                                                        arg63 = DiscordWebhookClient.bf[109];
                            arg17 = new String[]{ }
                            if (!arg16.bc().LiteBansModule_194((String)arg63)) {
                                v4 = (String[])Arrays.copyOf(arg17, (arg17).length);
                            } else {
                                arg59 = arg16.bc().g((String)arg63);
                                arg64 = arg59;
                                v4 = arg64.toArray(new String[0]);
                            }
                            this.CommandThrottleService = v4;
                            this.bd = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[110], false);
                            this.BanHandler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[111]);
                            arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[112], DiscordWebhookClient.bf[113]);
                            v5 = arg63;
                            arg16 = v5 != null ? v5.toLowerCase(Locale.ROOT) : null;
                            arg63 = arg16;
                            if (arg63 == null) break;
                            switch (arg63.hashCode()) {
                                case 1841730422: {
                                    if (!arg63.equals(DiscordWebhookClient.bf[114])) {
                                        break;
                                    }
                                    break;
                                }
                                case -1609594047: {
                                    if (arg63.equals(DiscordWebhookClient.bf[115])) break;
                                    break;
                                }
                                case -1305285460: {
                                    if (!arg63.equals(DiscordWebhookClient.bf[116])) {
                                        break;
                                    }
                                    break;
}
                            v6 = 1;
                            break;
                        }
                        v6 = 2;
                        break;
                    }
                    v6 = 3;
                    break;
}
            this.PlayerproviderHandler = v6;
                        arg17 = this.A;
            arg65 = DiscordWebhookClient.bf[117];
            arg59 = DiscordWebhookClient.bf[118];
            this.F = (long)SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg17.BaseCoreGenericHandler((String)arg65, (String)arg59), SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler((String)arg59, 0.0));
            this.LiteBansModule_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[119], 9999999);
            this.T = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[120], 20);
            this.BuilderactionHandler = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[121], DiscordWebhookClient.bf[122]);
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
            this.be = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[133], DiscordWebhookClient.bf[134]);
                        arg17 = DiscordWebhookClient.bf[135];
            arg65 = new String[]{ }
            if (!arg63.bc().LiteBansModule_194((String)arg17)) {
                v7 = Arrays.copyOf(arg65, arg65.length);
            } else {
                arg66 = arg63.bc().g((String)arg17);
                arg34 = arg66;
                v7 = arg34.toArray(new String[0]);
            }
            this.LiteBansModule = v7;
                        arg17 = DiscordWebhookClient.bf[136];
            arg65 = new String[]{ }
            if (!arg63.bc().LiteBansModule_194((String)arg17)) {
                v8 = Arrays.copyOf(arg65, arg65.length);
            } else {
                arg67 = arg63.bc().g((String)arg17);
                arg34 = arg67;
                v8 = arg34.toArray(new String[0]);
            }
            this.TapeHandler = v8;
            this.LiteBansModule_7 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[137], false);
                        arg17 = DiscordWebhookClient.bf[138];
            arg65 = new String[]{ }
            if (!arg63.bc().LiteBansModule_194((String)arg17)) {
                v9 = Arrays.copyOf(arg65, arg65.length);
            } else {
                arg68 = arg63.bc().g((String)arg17);
                arg34 = arg68;
                v9 = arg34.toArray(new String[0]);
            }
            this.az = v9;
                        arg17 = DiscordWebhookClient.bf[139];
            arg65 = new String[]{ }
            if (!arg63.bc().LiteBansModule_194((String)arg17)) {
                v10 = Arrays.copyOf(arg65, arg65.length);
            } else {
                arg69 = arg63.bc().g((String)arg17);
                arg34 = arg69;
                v10 = arg34.toArray(new String[0]);
            }
            this.HoverTextFormatter = v10;
                        arg17 = DiscordWebhookClient.bf[140];
            arg65 = new String[]{DiscordWebhookClient.bf[141], DiscordWebhookClient.bf[142], DiscordWebhookClient.bf[143], DiscordWebhookClient.bf[144], DiscordWebhookClient.bf[145]};
            if (!arg63.bc().LiteBansModule_194((String)arg17)) {
                v11 = Arrays.copyOf(arg65, arg65.length);
            } else {
                arg70 = arg63.bc().g((String)arg17);
                arg34 = arg70;
                v11 = arg34.toArray(new String[0]);
            }
            this.LiteBansModule_29 = v11;
            this.n = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[146], DiscordWebhookClient.bf[147]);
            this.ad = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[148], DiscordWebhookClient.bf[149]);
            this.ar = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[150], true);
            this.LiteBansModule_3 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[151], true);
            this.Y = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[152], DiscordWebhookClient.bf[153]);
            this.LiteBansModule_43 = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[154], DiscordWebhookClient.bf[155]);
            this.K = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[156], DiscordWebhookClient.bf[157]);
            this.PunishmentTableService = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[158], DiscordWebhookClient.bf[159]);
            this.MessageKey = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[160], DiscordWebhookClient.bf[161]);
            this.LiteBansModule_240 = arg63 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[162], DiscordWebhookClient.bf[163]);
            arg63 = litebans.MessageKey.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[164], DiscordWebhookClient.bf[165]), true);
            arg63 = arg63;
            arg71 = this.ah;
            this.LiteBansModule_15 = LiteBansModule_242.BaseCoreGenericHandler(arg63.toString(), arg71 & 255);
            this.LiteBansModule_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[166], false);
            this.BanHandler_5 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[167], false);
                        arg72 = this.A;
            arg73 = DiscordWebhookClient.bf[168];
            arg74 = 1;
            this.HikariConfig = (byte)arg72.BaseCoreGenericHandler((String)arg73, arg74);
            this.SetHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[169], true);
            this.Utf8Handler_2 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[170], false);
            this.aT = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[171], true);
            this.LiteBansModule_430 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[172], false);
            this.V = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[173], false);
            this.H = Math.max(0, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[174], 5));
            arg75 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[175], false);
            if (this.ServerSyncService.AsyncBackgroundTask_22() == 0 && this.ServerSyncService.i().BaseCoreGenericHandler(DiscordWebhookClient.bf[176])) {
                v3.BaseCoreGenericHandler(DiscordWebhookClient.bf[177]);
            }
            this.ac = arg75;
            this.ab = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[178], 12000);
            this.r = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[179], 12000);
            this.ServerEventListener = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[180], false);
            this.ElementsHandler = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[181], false);
            this.LiteBansModule_6 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[182], false);
            arg72 = DiscordWebhookClient.BaseCoreGenericHandler(this, false, 1, null);
            this.ai = (String)arg72.LiteBansModule_31();
            this.BroadcastService = (String)arg72.e();
            arg73 = this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[183], DiscordWebhookClient.bf[184]);
            this.LiteBansModule_12 = LiteBansModule_242.BaseCoreGenericHandler((String)arg73, 32);
            this.HikariDataSource = Math.max(40L, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[185], 55L));
            this.S = Math.max(1, this.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[186], 3));
            arg73 = DiscordWebhookClient.bf[187];
            arg74 = 1;
                        arg34 = new String[]{ }
            if (!arg76.bc().LiteBansModule_194((String)arg73)) {
                v12 = Arrays.copyOf(arg34, ((String[])arg34).length);
            } else {
                arg31 = arg76.bc().g((String)arg73);
                arg77 = arg31;
                v12 = arg77.toArray(new String[0]);
            }
            this.LiteBansModule_24 = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_389.BaseCoreGenericHandler(v12));
                        arg78 = DiscordWebhookClient.bf[188];
            arg79 = new String[]{DiscordWebhookClient.bf[189]};
            if (!arg73.bc().LiteBansModule_194(arg78)) {
                v13 = Arrays.copyOf(arg79, arg79.length);
            } else {
                arg34 = arg73.bc().g(arg78);
                arg31 = arg34;
                v13 = arg31.toArray(new String[0]);
            }
            this.GnuSparseMapHandler = LiteBansModule_389.BaseCoreGenericHandler(v13);
                        arg78 = DiscordWebhookClient.bf[190];
                        arg34 = DiscordWebhookClient.bf[191];
            arg81 = new String[]{ }
            if (!arg80.bc().LiteBansModule_194((String)arg34)) {
                v14 = Arrays.copyOf(arg81, arg81.length);
            } else {
                arg82 = arg80.bc().g((String)arg34);
                arg35 = arg82;
                v14 = arg35.toArray(new String[0]);
            }
            arg79 = v14;
            arg79 = Arrays.copyOf(arg79, arg79.length);
            if (!arg73.bc().LiteBansModule_194(arg78)) {
                v15 = Arrays.copyOf(arg79, arg79.length);
            } else {
                arg34 = arg73.bc().g(arg78);
                arg83 = arg34;
                v15 = arg83.toArray(new String[0]);
            }
            this.z = LiteBansModule_389.BaseCoreGenericHandler(v15);
            arg73 = DiscordWebhookClient.bf[192];
                        arg34 = new String[]{ }
            if (!arg84.bc().LiteBansModule_194((String)arg73)) {
                v16 = (String[])Arrays.copyOf(arg34, (arg34).length);
            } else {
                arg85 = arg84.bc().g((String)arg73);
                arg86 = arg85;
                v16 = arg86.toArray(new String[0]);
            }
            this.P = CollectionUtilities.LiteBansModule_31((Iterable)LiteBansModule_389.BaseCoreGenericHandler(v16));
            arg73 = LiteBansModule_181.LiteBansModule_194;
            arg87 = this.z;
                        arg84 = arg87;
            if (arg84 instanceof Collection && ((Collection)arg84).isEmpty()) {
            } else {
                arg88 = arg84.iterator();
                while (arg88.hasNext()) {
                    arg89 = arg88.next();
                    arg90 = (String)arg89;
                    if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(arg90)) continue;
                    break;
}
        arg58.aL = (arg91 = v17) != false || this.z.contains(arg72.LiteBansModule_31()) != false;
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
                arg92 = arg73.ServerSyncService.getLogger();
        if (!arg73.PluginHookService) {
            arg92.warning(DiscordWebhookClient.bf[217]);
        }
        if (arg73.aW) {
            arg92.warning(DiscordWebhookClient.bf[218]);
        }
        if (arg73.m) {
            arg92.warning(DiscordWebhookClient.bf[219]);
        }
        if (arg73.ExceptionHandler) {
            arg92.warning(DiscordWebhookClient.bf[220]);
        }
        if (arg73.PlayerproviderHandler == 0) {
            v18 = arg73.A.BaseCoreGenericHandler(DiscordWebhookClient.bf[221], DiscordWebhookClient.bf[222]);
            if (v18 == null || (v18 = v18.toLowerCase(Locale.ROOT)) == null) {
                v18 = DiscordWebhookClient.bf[223];
            }
            if (((CharSequence)(arg93 = v18)).length() > 0 && !ObjectUtilities.BaseCoreGenericHandler(arg93, DiscordWebhookClient.bf[224])) {
                arg92.warning(DiscordWebhookClient.bf[225] + arg93 + DiscordWebhookClient.bf[226]);
}
        arg73 = v3;
        if (arg73.g()) {
            arg58 = arg73;
            arg94 = LiteBansModule_242.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(this.g, null, null, null, 0, null, null, 63, null), (CharSequence)(DiscordWebhookClient.bf[227] + Arrays.toString(arg54  ))), (CharSequence)(DiscordWebhookClient.bf[228] + Arrays.toString(this.HoverTextFormatter)));
            arg58.BaseCoreGenericHandler(arg94);
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
        ConfigService configService = this.ServerSyncService.BaseCoreGenericHandler(ConfigService.class);
        String string2 = LiteBansModule_242.BaseCoreGenericHandler(this.A.BaseCoreGenericHandler(bf[255], bf[256]), 32);
        if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string2)) {
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
                targetObj.LiteBansModule_240();
            } else {
                configService.BaseCoreGenericHandler(false);
}
        catch (Exception exception) {
            exception.printStackTrace();
            configService.BaseCoreGenericHandler(false);
        }
        if ((string = string3) == null) {
            string = this.T();
        }
        LiteBansModule_354 jT2 = LiteBansModule_371.BaseCoreGenericHandler(string2, string);
        targetObj = configService;
        int n = 10;
        if (targetObj.BaseCoreGenericHandler(n)) {
            Object contextObj = targetObj;
            ((ConfigService)contextObj).BaseCoreGenericHandler((Object)(bf[264] + (String)jT2.e() + '\"'));
        }
        return jT2;
    }

    public static /* synthetic */ LiteBansModule_354 BaseCoreGenericHandler(DiscordWebhookClient eG2, boolean flag, int n, Object targetObj) {
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

