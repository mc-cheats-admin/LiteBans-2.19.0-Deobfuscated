package litebans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

public class LiteBansCommand
extends AbstractCommand {
    public static Object i;
    final Map Utf8Handler_2 = new HashMap();
        @Override
    public boolean BaseCoreGenericHandler() {
        return false;
    }

    public LiteBansCommand(PlatformPlugin plugin) {
        super("litebans", plugin);
    }

    private final void BaseCoreGenericHandler(CommandSenderWrapper sender, CharSequence charSequence) {
        LiteBansCommand.BaseCoreGenericHandler(sender, charSequence, this.LiteBansModule_241());
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("version")) {
            this.plugin(sender);
            return;
        }
        PlatformPlugin plugin = this.LiteBansModule_241();
        ServerSyncService u2 = (ServerSyncService)plugin.BaseCoreGenericHandler(ServerSyncService.class);
        BroadcastService o2 = this.plugin();
        DatabaseMonitorService w2 = this.g();
        ConfigService configService = this.LiteBansModule_31();
        PunishmentTableService p2 = this.e();
        DiscordWebhookClient eG2 = configService.LiteBansModule_195();
        String string2 = args[0].toLowerCase(Locale.ENGLISH);
        if (string2.equals("broadcast")) {
            new LitebansAdminHandler_3(args, plugin).run();
            return;
        }
        if (string2.equals("verify")) {
            boolean flag = LiteBansModule_50.c.AsyncBackgroundTask_5(sender.BaseCoreGenericHandler()).equals("2ccd0bb281214361803a945b8f0644ab");
            if (!flag) {
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, new String[]{"litebans.admin", "litebans.verify"});
            } else {
                this.plugin(sender, BlackHandler.ServerSyncService + LiteBansModule_76.BaseCoreGenericHandler + " " + LiteBansModule_378.BaseCoreGenericHandler + " " + LiteBansModule_238.BaseCoreGenericHandler);
            }
            try {
                String string = "undefined";
                String calendar = LiteBansModule_180.BaseCoreGenericHandler;
                SimpleDateFormat string8 = new SimpleDateFormat("yyyy-MM-LiteBansModule_119");
                string8.setTimeZone(TimeZone.getTimeZone("UTC"));
                String string3 = string8.format(new Date());
                String string4 = string3 + "A#63rP";
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                messageDigest.update((string4 + calendar).getBytes(StandardCharsets.UTF_8));
                byte[] byArray = messageDigest.digest();
                StringBuilder stringBuilder = new StringBuilder();
                for (byte by2 : byArray) {
                    String string5 = Integer.toHexString(0xFF & by2);
                    if (string5.length() == 1) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(string5);
                }
                string = "q" + stringBuilder.substring(0, 8);
                this.plugin(sender, BlackHandler.BroadcastService + "Verification code: " + BlackHandler.i + string);
                return;
            }
            catch (NoSuchAlgorithmException timeZone) {
                throw new RuntimeException(timeZone);
            }
        }
        if (string2.equals("allow")) {
            new LitebansAdminHandler(args, plugin, true).run();
            return;
        }
        if (string2.equals("unlink") || string2.equals("clearhistory") || string2.equals("cleariphistory")) {
            if (args.length < 2) {
                return;
            }
            new LitebansAdminHandler_4(args, plugin).run();
            return;
        }
        if (string2.equals("reveal") && args.length >= 2) {
            new LitebansAdminHandler_2(args, plugin).run();
            return;
        }
        if (string2.equals("license")) {
            new LiteBansModule_199(plugin).run();
            return;
        }
        CommandArgumentUtils.c(this, "litebans.admin");
        try {
            if (i == null) {
                throw new IOException();
            }
        }
        catch (Exception exception) {
            configService.BaseCoreGenericHandler(exception, 0);
            this.plugin(sender);
            return;
        }
        if (string2.equals("reload")) {
            configService.c();
            try {
                for (PluginModule k12 : plugin.PunishmentTableService()) {
                    k12.LiteBansModule_31();
                }
                Throwable throwable = plugin.LiteBansModule_241().LiteBansModule_31();
                if (throwable != null) {
                    this.plugin(sender, MessageKey.ar);
                    this.plugin(sender, MessageKey.ProxyPreparedStatement);
                    throw throwable;
                }
                plugin.LiteBansModule_31(() -> {
                    try {
                        w2.c();
                        o2.LiteBansModule_31(configService.LiteBansModule_195().ElementsHandler());
                        w2.e();
                        try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                            if (ch2.LiteBansModule_31()) {
                                this.plugin(sender, MessageKey.bM);
                                return;
                            }
                            DatabaseService gn_02 = configService.z().c();
                            if (configService.A.BaseCoreGenericHandler() == null) {
                                this.plugin(sender, MessageKey.aV);
                                flag = false;
                            }
                            if (gn_02 != null && gn_02.LiteBansModule_31() != null) {
                                this.plugin(sender, MessageKey.ar.LiteBansModule_31(MessageKey.PropertyHandler));
                                flag = false;
                            }
                            if (flag) {
                                this.plugin(sender, MessageKey.aW);
                            }
                        }
                    }
                    catch (Exception exception) {
                        w2.BaseCoreGenericHandler(exception);
                    }
                });
            }
            catch (Throwable by3) {
                w2.BaseCoreGenericHandler(by3);
            }
            return;
        }
        if (string2.equals("info")) {
            plugin.LiteBansModule_31(() -> {
                try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                    HikariDataSource an2 = w2.HoverTextFormatter();
                    if (ch2.LiteBansModule_31() || an2 == null) {
                        this.plugin(sender, MessageKey.ServerEventListener);
                        return;
                    }
                    LiteBansModule_306 iI2 = an2.BaseCoreGenericHandler();
                    String string = configService.LiteBansModule_195().ElementsHandler();
                    String string2 = DatabaseMonitorService.CommandThrottleService.c(string);
                    this.plugin(sender, BlackHandler.c(GnuSparseMapHandler[143]) + BlackHandler.g(string2) + BlackHandler.c(GnuSparseMapHandler[144]));
                    int n = configService.LiteBansModule_195().LiteBansModule_5();
                    int n2 = configService.LiteBansModule_195().V();
                    LiteBansModule_15 aK2 = w2.LiteBansModule_403();
                    if (aK2 != null) {
                        String string3 = GnuSparseMapHandler[145] + BlackHandler.m + aK2.BaseCoreGenericHandler();
                        if (aK2.LiteBansModule_195()) {
                            string3 = GnuSparseMapHandler[146] + BlackHandler.c + aK2.BaseCoreGenericHandler() + GnuSparseMapHandler[147];
                        }
                        this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[148] + BlackHandler.m + aK2.e());
                        this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[149] + BlackHandler.m + aK2.AsyncBackgroundTask_5() + BlackHandler.i + GnuSparseMapHandler[150] + string3 + BlackHandler.i + GnuSparseMapHandler[151]);
                    }
                    this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[152] + BlackHandler.m + iI2.LiteBansModule_195() + BlackHandler.i + GnuSparseMapHandler[153] + BlackHandler.m + n + BlackHandler.i + GnuSparseMapHandler[154] + BlackHandler.m + n2 + BlackHandler.i + GnuSparseMapHandler[155] + BlackHandler.m + iI2.LiteBansModule_31() + BlackHandler.i + GnuSparseMapHandler[156]);
                    int n3 = iI2.c();
                    if (n3 > 0) {
                        this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[157] + BlackHandler.m + n3);
                    }
                    LiteBansModule_302 id_02 = u2.i();
                    AtomicLong atomicLong = (AtomicLong)id_02.g();
                    long l3 = ((AtomicLong)id_02.e()).get();
                    long l5 = Math.max(0L, ((AtomicLong)id_02.AsyncBackgroundTask_5()).get() - l3);
                    this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[158] + BlackHandler.m + atomicLong + BlackHandler.i + GnuSparseMapHandler[159] + BlackHandler.m + l3 + BlackHandler.i + GnuSparseMapHandler[160] + BlackHandler.m + l5);
                }
                catch (Exception exception) {
                    w2.BaseCoreGenericHandler(exception);
                }
            });
            return;
        }
        if (string2.equals("servers")) {
            new LiteBansModule_198(plugin).run();
            return;
        }
        if (string2.equals("accept")) {
            new LiteBansModule_206(plugin).run();
            return;
        }
        if (string2.equals("debug")) {
            if (args.length >= 2) {
                byte simpleDateFormat = (byte)Integer.parseInt(args[1]);
                configService.BaseCoreGenericHandler(simpleDateFormat);
                this.plugin(sender, BlackHandler.i + "Debug level has been set to: " + BlackHandler.m + simpleDateFormat);
            }
            if (configService.g()) {
                this.plugin(sender, BlackHandler.i + "Debug levels: " + configService.BaseCoreGenericHandler() + " (config); " + configService.q() + "/" + configService.LiteBansModule_403() + " (database) + ");
            }
            return;
        }
        if (string2.equals("timezone")) {
            SimpleDateFormat uUID = new SimpleDateFormat("yyyy-MM-LiteBansModule_119 HH:mm:ss");
            TimeZone string11 = TimeZone.getTimeZone(w2.n());
            Calendar resultObj = Calendar.getInstance(string11);
            uUID.setCalendar(resultObj);
            if (args.length == 1) {
                this.plugin(sender, BlackHandler.i + "Current timezone: " + BlackHandler.m + w2.n() + "\n" + BlackHandler.i + "Current time: " + BlackHandler.m + uUID.format(resultObj.getTime()));
            } else {
                String string13 = args[1];
                plugin.LiteBansModule_31(() -> {
                    try {
                        w2.BaseCoreGenericHandler(string8);
                        calendar.setTimeZone(TimeZone.getTimeZone(string8));
                        try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                            try (LiteBansModule_60 bT2 = ch2.c((CharSequence)(GnuSparseMapHandler[138] + BansHandler_2.i + GnuSparseMapHandler[139])).BaseCoreGenericHandler(string8);){
                                w2.LiteBansModule_31(bT2);
                            }
                            this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[140] + BlackHandler.m + w2.n() + GnuSparseMapHandler[141] + BlackHandler.i + GnuSparseMapHandler[142] + BlackHandler.m + simpleDateFormat.format(calendar.getTime()));
                        }
                    }
                    catch (Exception exception) {
                        w2.BaseCoreGenericHandler(exception);
                    }
                });
            }
            return;
        }
        if (string2.equals("fixhistory") || string2.equals("fixiphistory")) {
            plugin.BaseCoreGenericHandler(() -> this.plugin(w2, sender, false));
            return;
        }
        if (string2.startsWith("clearmute")) {
            if (args.length >= 2) {
                UUID string9 = UUID.fromString(args[1]);
                SilentHandler object22 = (SilentHandler)p2.BaseCoreGenericHandler().LiteBansModule_31().remove(string9);
                if (object22 != null) {
                    this.plugin(sender, BlackHandler.i + "Removed active mute for " + object22 + " ");
                } else {
                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.c + "No mute found for " + string9);
                }
                return;
            }
            p2.BaseCoreGenericHandler().LiteBansModule_31().clear();
            this.plugin(sender, BlackHandler.i + "Active mutes have been ");
            return;
        }
        if (string2.equals("listmutes") && sender.LiteBansModule_195()) {
            this.plugin(sender, Arrays.toString(p2.BaseCoreGenericHandler().LiteBansModule_31().entrySet().toArray()));
            return;
        }
        if (string2.equals("import")) {
            String string10;
            if (args.length == 1) {
                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansException_2);
            }
            if ((string10 = args[1].toLowerCase(Locale.ENGLISH)).equals("start")) {
                plugin.LiteBansModule_31(() -> {
                    String string = eG2.bd().toLowerCase(Locale.ENGLISH);
                    if (string.contains(GnuSparseMapHandler[93])) {
                        string = string.replace(GnuSparseMapHandler[94], GnuSparseMapHandler[95]);
                    }
                    boolean flag = string.equals(GnuSparseMapHandler[96]) || string.contains(GnuSparseMapHandler[97]) || string.contains(GnuSparseMapHandler[98]);
                    Connection connection = null;
                    try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                        String string2;
                        if (ch2.LiteBansModule_31()) {
                            this.plugin(sender, MessageKey.ServerEventListener);
                            return;
                        }
                        if (!flag) {
                            String string3;
                            Properties properties = new Properties();
                            resultObj = null;
                            contextObj = null;
                            string2 = GnuSparseMapHandler[99];
                            if (eG2.ai()) {
                                string3 = eG2.m();
                                boolean flag2 = string.equals(GnuSparseMapHandler[100]);
                                if (flag2) {
                                    string2 = GnuSparseMapHandler[101];
                                    string3 = new File(plugin.getDataFolder(), GnuSparseMapHandler[102]).getAbsolutePath();
                                    resultObj = eG2.P();
                                    contextObj = eG2.ah();
                                } else if (string.equals(GnuSparseMapHandler[103]) || string.equals(GnuSparseMapHandler[104])) {
                                    string2 = GnuSparseMapHandler[105];
                                    string3 = new File(GnuSparseMapHandler[106], GnuSparseMapHandler[107]).getAbsolutePath();
                                }
                                File file = new File(string3);
                                File file2 = new File(string3 + GnuSparseMapHandler[108]);
                                if (!(flag2 || file.exists() || file2.exists())) {
                                    throw new FileNotFoundException(string3);
                                }
                                this.plugin(sender, MessageKey.aO.BaseCoreGenericHandler(GnuSparseMapHandler[109], (Object)string3));
                                targetObj = GnuSparseMapHandler[110] + string2 + GnuSparseMapHandler[111] + file.getAbsolutePath();
                            } else {
                                string2 = GnuSparseMapHandler[112];
                                resultObj = eG2.P();
                                contextObj = eG2.ah();
                                targetObj = GnuSparseMapHandler[113] + eG2.BanHandler_4() + '/' + eG2.TapeHandler();
                                this.plugin(sender, MessageKey.aO.BaseCoreGenericHandler(GnuSparseMapHandler[114], targetObj));
                            }
                            Driver driver = (Driver)w2.BaseCoreGenericHandler(Objects.requireNonNull(w2.BaseCoreGenericHandler(configService, string2)), true, true);
                            if (driver == null) {
                                return;
                            }
                            string3 = GnuSparseMapHandler[115];
                            properties.put(GnuSparseMapHandler[116], string3);
                            properties.put(GnuSparseMapHandler[117], string3);
                            properties.put(GnuSparseMapHandler[118], GnuSparseMapHandler[119]);
                            properties.put(GnuSparseMapHandler[120], GnuSparseMapHandler[121]);
                            properties.put(GnuSparseMapHandler[122], GnuSparseMapHandler[123]);
                            properties.put(GnuSparseMapHandler[124], GnuSparseMapHandler[125]);
                            properties.put(GnuSparseMapHandler[126], GnuSparseMapHandler[127]);
                            properties.put(GnuSparseMapHandler[128], GnuSparseMapHandler[129]);
                            properties.put(GnuSparseMapHandler[130], GnuSparseMapHandler[131]);
                            if (resultObj != null && !((String)resultObj).isEmpty()) {
                                properties.put(GnuSparseMapHandler[132], resultObj);
                            }
                            if (contextObj != null && !((String)contextObj).isEmpty()) {
                                properties.put(GnuSparseMapHandler[133], contextObj);
                            }
                            connection = driver.connect((String)targetObj, properties);
                        } else {
                            this.plugin(sender, MessageKey.aO.BaseCoreGenericHandler(GnuSparseMapHandler[134], (Object)GnuSparseMapHandler[135]));
                        }
                        boolean flag3 = eG2.X();
                        targetObj = plugin.LiteBansModule_195().BaseCoreGenericHandler(BansHandler.class, new Class[]{PlatformPlugin.class}, new Object[]{plugin});
                        resultObj = targetObj.iterator();
                        while (resultObj.hasNext()) {
                            contextObj = (BansHandler)resultObj.next();
                            if (!((BansHandler)contextObj).c(string) || ((BansHandler)contextObj).LiteBansModule_403() && connection == null) continue;
                            this.plugin(((BansHandler)contextObj).Utf8Handler_2());
                            string2 = configService.n.az();
                            if (!string2.equals(GnuSparseMapHandler[136])) {
                                ((BansHandler)contextObj).BaseCoreGenericHandler(string2);
                            }
                            ((BansHandler)contextObj).BaseCoreGenericHandler(string, connection, ch2, flag3);
                            flag4 = true;
                            ((BansHandler)contextObj).BaseCoreGenericHandler(sender);
                            if (((BansHandler)contextObj).e()) break;
                            return;
                        }
                        if (!flag4) {
                            this.plugin(sender, MessageKey.GeoIPLookupService.BaseCoreGenericHandler(GnuSparseMapHandler[137], (Object)string));
                            return;
                        }
                        this.plugin(w2, sender, true);
                        return;
                    }
                    catch (Throwable throwable) {
                        this.plugin(sender, MessageKey.LiteBansModule_40);
                        w2.BaseCoreGenericHandler(throwable);
                        return;
                    }
                    finally {
                        this.Utf8Handler_2.clear();
                        if (connection != null) {
                            try {
                                connection.close();
                            }
                            catch (Exception exception) {
                                throw new RuntimeException(exception);
                            }
                        }
                    }
                });
            }
            return;
        }
        if (string2.equals("reset-database")) {
            new GlobalHandler(args, plugin).run();
            return;
        }
        if (string2.equals("reset-templates")) {
            new LiteBansModule_196(plugin).run();
            return;
        }
        if (string2.equals("addhistory") || string2.equals("addiphistory") || string2.equals("add-login")) {
            new LiteBansModule_205(args, plugin).run();
            return;
        }
        if (string2.equals("json-disconnect") && args.length >= 3) {
            CommandSenderWrapper senderWrapper;
            String string = args[1];
            String string6 = LiteBansModule_380.BaseCoreGenericHandler(Arrays.copyOfRange(args, 2, args.length), " ");
            if (configService.g()) {
                configService.BaseCoreGenericHandler((Object)("target:" + string + ", reason:" + string6));
            }
            if ((senderWrapper = CommandArgumentUtils.LiteBansModule_31(this, string)) != null) {
                switch (plugin.AsyncBackgroundTask_22()) {
                    case 0: {
                        LiteBansModule_140.LiteBansModule_31.BaseCoreGenericHandler(senderWrapper.c(), string6);
                        break;
                    }
                    case 1: {
                        GetcancelreasoncomponentsHandler k12 = (GetcancelreasoncomponentsHandler)plugin.i();
                        k12.BaseCoreGenericHandler(senderWrapper, string6);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }
            return;
        }
        if (string2.equals("test-vault") && args.length >= 2) {
            String string = args[1];
            contextObj = UUID.fromString(string);
            targetObj = args.length == 3 ? args[2] : null;
            if (plugin.AsyncBackgroundTask_22() == 0) {
                plugin.LiteBansModule_31(() -> this.plugin(plugin, (UUID)contextObj, (String)targetObj, sender));
                return;
            }
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler("Command is not supported on this ");
        }
        if (string2.equals("refresh") && args.length >= 2) {
            String string;
            String string7 = LiteBansModule_50.c.e(args[1]);
            contextObj = null;
            if (args.length >= 3) {
                contextObj = args[2];
            }
            targetObj = o2.BaseCoreGenericHandler(string7);
            String string8 = configService.n.LiteBansModule_25();
            if (targetObj != null && (string = targetObj.LiteBansModule_241()) != null) {
                string8 = string;
            }
            string = null;
            if (targetObj != null) {
                string = targetObj.i();
            }
            p2.BaseCoreGenericHandler(string, string7, (String)contextObj, string8);
            this.plugin(sender, BlackHandler.i + "Refreshed player: '" + string7 + "', server: " + string8);
            return;
        }
        if (string2.equals("expiry-update")) {
            plugin.LiteBansModule_31(() -> {
                try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                    ch2.BaseCoreGenericHandler(true);
                }
                catch (Exception exception) {
                    w2.BaseCoreGenericHandler(exception);
                }
            });
            this.plugin(sender, BlackHandler.i + "Expiry update ");
            return;
        }
        if (string2.equals("upgrade")) {
            this.LiteBansModule_31(sender);
            return;
        }
        if (string2.equals("benchgen") && sender.LiteBansModule_195() && configService.g()) {
            new LiteBansModule_239(args, plugin).run();
            return;
        }
        if (string2.equals("benchjoin") && sender.LiteBansModule_195() && configService.g()) {
            new LiteBansModule_215(args, plugin).run();
            return;
        }
        this.plugin(sender);
    }

    @Override
    public boolean LiteBansModule_31() {
        return false;
    }

    @Override
    public String getPermission() {
        return null;
    }

    public void BaseCoreGenericHandler(String string) {
        this.LiteBansModule_241().getLogger().info("Begin import from: " + string);
    }

    public void LiteBansModule_31(CommandSenderWrapper sender) {
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
        this.LiteBansModule_241().LiteBansModule_31(() -> {
            try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
                w2.BaseCoreGenericHandler(ch2, ((SQLiteDriverHandler_3)ch2).LiteBansModule_31(), true, true);
                ch2.close();
                w2.c();
                w2.e();
                this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[88]);
            }
            catch (Exception exception) {
                w2.BaseCoreGenericHandler(exception);
            }
        });
    }

    void BaseCoreGenericHandler(DatabaseMonitorService w2, CommandSenderWrapper sender, boolean flag) {
        try (LiteBansModule_83 ch2 = w2.LiteBansModule_195();){
            if (ch2.LiteBansModule_31()) {
                return;
            }
            for (BansHandler_2 kL2 : BansHandler_2.values()) {
                if (!kL2.BaseCoreGenericHandler()) continue;
                long l3 = 0L;
                if (!flag) {
                    this.plugin(sender, MessageKey.ValueHandler.BaseCoreGenericHandler("table", (Object)kL2.toString()));
                }
                LiteBansModule_60 bT2 = ch2.c((CharSequence)("SELECT * FROM " + kL2));
                ResultSet resultSet = w2.BaseCoreGenericHandler(bT2);
                List list = ch2.LiteBansModule_31(resultSet, kL2.c());
                for (SilentHandler dZ2 : list) {
                    String string;
                    String string2 = dZ2.DatabaseMonitorService();
                    if (string2 == null) continue;
                    if (LiteBansModule_50.c.c(string2)) {
                        ++l3;
                        continue;
                    }
                    LiteBansModule_298 iA2 = ch2.c(string2);
                    if (iA2 != null || (string = LiteBansModule_50.c.LiteBansModule_195(string2)) == null) continue;
                    ch2.BaseCoreGenericHandler(string, string2, "#", false, true);
                    ++n;
                }
                if (!flag) {
                    this.plugin(sender, MessageKey.LiteBansModule_65.BaseCoreGenericHandler("amount", (Object)n));
                }
                if (l3 <= 0L || flag) continue;
                this.plugin(sender, MessageKey.LiteBansModule_25.BaseCoreGenericHandler("amount", (Object)l3));
            }
        }
        catch (Exception exception) {
            w2.BaseCoreGenericHandler(exception);
        }
    }

    void BaseCoreGenericHandler(CommandSenderWrapper sender) {
        String string;
        ConfigService configService = (ConfigService)this.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
        if (configService.DatabaseMonitorService() != null) {
            this.plugin(sender, BlackHandler.c + "[LiteBans] " + BlackHandler.F + "Plugin access has been disabled!");
            if (configService.GnuSparseMapHandler() != null) {
                this.plugin(sender, configService.GnuSparseMapHandler());
            }
        }
        switch (this.LiteBansModule_241().AsyncBackgroundTask_22()) {
            case 0: {
                if (OrgBukkitBlockHandler.c()) {
                    string = "Folia";
                    break;
                }
                if (OrgBukkitBlockHandler.BaseCoreGenericHandler()) {
                    string = "Paper";
                    break;
                }
                string = "Bukkit";
                try {
                    Class.forName("org.spigotmc.SpigotConfig");
                    string = "Spigot";
                }
                catch (ClassNotFoundException classNotFoundException) {}
                break;
            }
            case 1: {
                string = "BungeeCord";
                break;
            }
            case 2: {
                string = "Velocity";
                break;
            }
            case 3: {
                string = "Fabric";
                break;
            }
            default: {
                string = "Unknown";
            }
        }
        String string2 = LiteBansModule_121.c.BaseCoreGenericHandler(this.LiteBansModule_241().i().LiteBansModule_31(), new Integer[]{0, 0, 0}).toString();
        this.plugin(sender, BlackHandler.i + "LiteBans version " + BlackHandler.m + LiteBansModule_181.AsyncBackgroundTask_5 + BlackHandler.i + " running on " + BlackHandler.g(string) + " " + BlackHandler.BaseCoreGenericHandler(string2));
        this.plugin(sender, BlackHandler.m.toString() + BlackHandler.r + GnuSparseMapHandler[87]);
    }

    private final /* synthetic */ void BaseCoreGenericHandler(PlatformPlugin plugin, UUID uUID, String string, CommandSenderWrapper sender) {
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)plugin.i();
        boolean flag = ao_02.LiteBansModule_31().BaseCoreGenericHandler(ao_02.BaseCoreGenericHandler(uUID), GnuSparseMapHandler[89], string);
        this.plugin(sender, BlackHandler.i + GnuSparseMapHandler[90] + (flag ? BlackHandler.i + GnuSparseMapHandler[91] : BlackHandler.c + GnuSparseMapHandler[92]));
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"litebans", "version", "broadcast", "verify", "2ccd0bb281214361803a945b8f0644ab", "litebans.admin", "litebans.verify", " ", " ", "undefined", "yyyy-MM-LiteBansModule_119", "UTC", "A#63rP", "SHA-512", "q", "Verification code: ", "allow", "unlink", "clearhistory", "cleariphistory", "reveal", "license", "litebans.admin", "reload", "info", "servers", "accept", "debug", "Debug level has been set to: ", "Debug levels: ", " (config); ", "/", " (database) + ", "timezone", "yyyy-MM-LiteBansModule_119 HH:mm:ss", "Current timezone: ", "\n", "Current time: ", "fixhistory", "fixiphistory", "clearmute", "Removed active mute for ", " ", "No mute found for ", "Active mutes have been ", "listmutes", "import", "start", "reset-database", "reset-templates", "addhistory", "addiphistory", "add-login", "json-disconnect", " ", "target:", ", reason:", "test-vault", "Command is not supported on this ", "refresh", "Refreshed player: '", "', server: ", "expiry-update", "Expiry update ", "upgrade", "benchgen", "benchjoin", "Begin import from: ", "table", "SELECT * FROM ", "#", "amount", "amount", "[LiteBans] ", "Plugin access has been disabled!", "Folia", "Paper", "Bukkit", "org.spigotmc.SpigotConfig", "Spigot", "BungeeCord", "Velocity", "Fabric", "Unknown", "LiteBans version ", " running on ", " ", "https://www.spigotmc.org/resources/litebans.3715/ {url: https://www.spigotmc.org/resources/litebans.3715/}", "Upgrade check executed ", "litebans.test", "litebans.test: ", "true", "false", " ", " ", "", "vanilla", "banned-players", "essentials", "sqlite", "litebans", "LiteBansModule_244", "litebans", "banmanager7", "banmanagerv7", "LiteBansModule_244", "plugins/BanManager", "local_bans", ".mv.LiteBansModule_117", "LiteBansModule_117", "jdbc:", "://", "mysql", "jdbc:mysql://", "LiteBansModule_117", "30000", "connectTimeout", "socketTimeout", "autoReconnect", "true", "useUnicode", "true", "connectionCollation", "utf8mb4_unicode_ci", "characterEncoding", "utf-8", "characterSetResults", "utf-8", "serverTimezone", "UTC", "timezone", "UTC", "user", "password", "LiteBansModule_117", "banned-players.json", "default", "name", "UPDATE ", " SET timezone=?", "Timezone updated: ", "\n", "Current time: ", "LiteBans is connected to BaseCoreGenericHandler ", " ", "", "", "!!!", "Server name: ", "Server UUID: ", " <", ">", "Pooled connections: ", "/", " (minimum: ", ", idle: ", ")", "Threads awaiting connection: ", "Sync events InitializerHandler_3/out/skipped: ", ", ", ", "};
    }

    static {
        LiteBansCommand.BaseCoreGenericHandler();
    }
}
}
