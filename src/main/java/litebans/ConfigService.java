package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.LambdaMetafactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import litebans.api.Database;
import litebans.api.Events;
import litebans.api.PlayerProvider;
import litebans.api.RandomID;
import litebans.api.exception.MissingImplementationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ConfigService
extends PluginModule {
    public static final MariaDBDriverHandler GnuSparseMapHandler;
    private byte LiteBansModule_31;
    private final byte AsyncBackgroundTask_21;
    private byte c;
    private final ThreadLocal HoverTextFormatter = new AsyncBackgroundTask_14(this);
    public DiscordWebhookClient n;
    public MessagesYmlHandler Utf8Handler_2;
    public TemplatesYmlHandler A;
    public DiscordWebhookClient_2 m;
    private final LiteBansModule_102 AsyncBackgroundTask_5 = new LiteBansModule_102(() -> ConfigService.BaseCoreGenericHandler(this));
    private final LiteBansModule_161 LiteBansModule_194 = ProxyConnection.BaseCoreGenericHandler(() -> ConfigService.c(this));
    private Object CommandThrottleService;
    private GeoIPLookupService_2 B;
    private boolean q;
    private boolean e = true;
    private int ServerSyncService;
    private final LiteBansModule_138 BanHandler_2 = new LiteBansModule_138(false, false, 3, null);
    private LiteBansModule_15 PunishmentTableService;
    private long LiteBansModule_401 = Long.MAX_VALUE;
    private byte LiteBansModule_433;
    private String LiteBansModule_240;
    private LiteBansModule_324 D = new LiteBansModule_307();
    public static final int i;
    public static final String BroadcastService;
    public static final int r;
    private static int AsyncBackgroundTask_22;
    private static final AtomicBoolean z;
    private static final AtomicBoolean g;
    public ConfigService(@NotNull PlatformPlugin plugin) {
        super(plugin);
        int n;
        Integer[] integerArray = new Integer[]{29, 5, 7, 1, 5};
        ConfigService configService = this;
        int n2 = 0;
        for (Integer n3 : integerArray) {
            int n4 = ((Number)n3).intValue();
            n = n2;
            boolean flag = false;
            int n5 = this.LiteBansModule_433 ^ n4;
            n2 = n + n5;
        }
        n = n2;
        configService.AsyncBackgroundTask_21 = (byte)n;
    }

    public final byte BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.LiteBansModule_31 = by2;
    }

    public final ThreadLocal c() {
        return this.HoverTextFormatter;
    }

    public final DiscordWebhookClient LiteBansModule_194() {
        DiscordWebhookClient eG2 = this.n;
        if (eG2 != null) {
            return eG2;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull DiscordWebhookClient eG2) {
        this.n = eG2;
    }

    public final MessagesYmlHandler z() {
        MessagesYmlHandler k22 = this.Utf8Handler_2;
        if (k22 != null) {
            return k22;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull MessagesYmlHandler k22) {
        this.Utf8Handler_2 = k22;
    }

    public final TemplatesYmlHandler AsyncBackgroundTask_21() {
        TemplatesYmlHandler fu2 = this.A;
        if (fu2 != null) {
            return fu2;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull TemplatesYmlHandler fu2) {
        this.A = fu2;
    }

    public final DiscordWebhookClient_2 LiteBansModule_31() {
        DiscordWebhookClient_2 h72 = this.m;
        if (h72 != null) {
            return h72;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull DiscordWebhookClient_2 h72) {
        this.m = h72;
    }

    public final LiteBansModule_409 Utf8Handler_2() {
        LiteBansModule_161 eE2 = this.AsyncBackgroundTask_5;
        return (LiteBansModule_409)eE2.BaseCoreGenericHandler();
    }

    public final boolean HoverTextFormatter() {
        LiteBansModule_161 eE2 = this.LiteBansModule_194;
        return (Boolean)eE2.BaseCoreGenericHandler();
    }

    public final Object B() {
        return this.CommandThrottleService;
    }

    public final GeoIPLookupService_2 LiteBansModule_240() {
        return this.B;
    }

    public final void BaseCoreGenericHandler(@Nullable GeoIPLookupService_2 fv_02) {
        this.B = fv_02;
    }

    public final boolean LiteBansModule_433() {
        return this.e;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.e = flag;
    }

    public final int m() {
        return this.ServerSyncService;
    }

    public final void LiteBansModule_31(int n) {
        this.ServerSyncService = n;
    }

    public final LiteBansModule_138 r() {
        return this.BanHandler_2;
    }

    public final LiteBansModule_15 DatabaseMonitorService() {
        return this.PunishmentTableService;
    }

    public final void BaseCoreGenericHandler(@Nullable LiteBansModule_15 aK2) {
        this.PunishmentTableService = aK2;
    }

    public final long q() {
        return this.LiteBansModule_401;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.LiteBansModule_401 = l3;
    }

    public final byte LiteBansModule_401() {
        return this.LiteBansModule_433;
    }

    public final void c(byte by2) {
        this.LiteBansModule_433 = by2;
    }

    public final String GnuSparseMapHandler() {
        return this.LiteBansModule_240;
    }

    public final void c(@Nullable String string) {
        this.LiteBansModule_240 = string;
    }

    public final LiteBansModule_324 i() {
        return this.D;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_324 iX2) {
        this.D = iX2;
    }

    public final boolean BaseCoreGenericHandler(int n) {
        return this.LiteBansModule_31 >= n;
    }

    public final void BaseCoreGenericHandler(int n, @Nullable Object object) {
        if (this.plugin(n)) {
            this.plugin(object);
        }
    }

    public final void BaseCoreGenericHandler(@Nullable Object object) {
        if (object instanceof Throwable) {
            ((Throwable)object).printStackTrace();
        } else {
            PluginModule module = this;
            String string = String.valueOf(object);
            boolean flag = false;
            module.BaseCoreGenericHandler.getLogger().info(string);
        }
    }

    public final boolean g() {
        return this.LiteBansModule_31 == this.AsyncBackgroundTask_21;
    }

    public final int BaseCoreGenericHandler(@NotNull CharSequence[] charSequenceArray) {
        if (this.g()) {
            CharSequence[] charSequenceArray2;
            for (CharSequence charSequence : charSequenceArray2 = charSequenceArray) {
                boolean flag = false;
                this.plugin(charSequence);
            }
            return LiteBansModule_72.LiteBansModule_31(charSequenceArray2.length);
        }
        return -1;
    }

    public final void BaseCoreGenericHandler(@Nullable Object object, int n) {
        if (this.g()) {
            if (object instanceof Throwable) {
                PluginModule module = this;
                String string = "0xAAA";
                boolean flag = false;
                module.BaseCoreGenericHandler.getLogger().warning(string);
                ((Throwable)object).printStackTrace();
            } else {
                PluginModule n_03 = this;
                String string = "0xAAA " + object;
                boolean flag = false;
                n_03.BaseCoreGenericHandler.getLogger().warning(string);
                Thread.dumpStack();
            }
        } else if (n == 1 && object instanceof Throwable) {
            Object object2 = object.getClass().getName();
            boolean flag = false;
            int n2 = 0;
            for (int i = 0; i < object2.length(); ++i) {
                char c;
                char c10 = c = object2.charAt(i);
                int n3 = n2;
                boolean flag2 = false;
                int n4 = c10 ^ 0x17;
                n2 = n3 + n4;
            }
            int n5 = n2;
            if (n5 == 3140) {
                object2 = new LiteBansModule_324(0L, 1, null);
                this.LiteBansModule_433 = (byte)(((LiteBansModule_324)object2).BaseCoreGenericHandler(2) + 1);
                this.LiteBansModule_401 = (long)((LiteBansModule_324)object2).BaseCoreGenericHandler(23) + 1L;
            }
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(ConfigService configService, Object object, int n, int n2, Object object2) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        configService.BaseCoreGenericHandler(object, n);
    }

    public final String LiteBansModule_31(@Nullable String string) {
        Object object = this.B;
        if (object == null || (object = ((GeoIPLookupService_2)object).LiteBansModule_31(string)) == null) {
            object = "geoip.unavailable";
        }
        return object;
    }

    @Override
    public void c() {
        this.c = 0;
        this.plugin.m();
        g.set(false);
        ConfigService configService = this;
        boolean flag = false;
        if (configService.LiteBansModule_194().D()) {
            try {
                Object object;
                BroadcastService o2 = (BroadcastService)configService.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
                Object object2 = configService.BaseCoreGenericHandler.getDataFolder();
                String string = "lockdown.yml";
                boolean flag2 = false;
                File file = new File((File)object2, string);
                if (!file.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                    object2 = configService.BaseCoreGenericHandler.getDataFolder();
                    string = "lockdown.json";
                    flag2 = false;
                    file = new File((File)object2, string);
                }
                LitebansLockdownBypassHandler gG2 = o2.e();
                if ((gG2 != null ? gG2.c() : null) == null) {
                    object = LiteBansModule_112.LiteBansModule_31(file);
                } else {
                    object2 = configService.BaseCoreGenericHandler.BaseCoreGenericHandler(file).g();
                    LitebansLockdownBypassHandler gG3 = o2.e();
                    LitebansLockdownBypassHandler gG4 = o2.e();
                    object = object2.LiteBansModule_31("reason", gG3 != null ? gG3.c() : null).LiteBansModule_31("scope", gG4 != null ? gG4.BaseCoreGenericHandler() : null).LiteBansModule_240();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public final void LiteBansModule_31(byte by2) {
        try {
            this.plugin(by2, false);
            throw new CommandExitException();
        }
        catch (Exception exception) {
            PluginModule module = this;
            String string = exception.getMessage();
            if (string == null) {
                string = ".. + ";
            }
            String string2 = string;
            boolean flag = false;
            module.BaseCoreGenericHandler.getLogger().warning(string2);
            return;
        }
    }

    public final Void BaseCoreGenericHandler(byte by2, boolean flag) {
        if (flag) {
            ConfigService configService = this;
            boolean flag2 = false;
            if (configService.g()) {
                ConfigService q_03 = configService;
                boolean flag3 = false;
                q_03.BaseCoreGenericHandler((Object)("" + '!' + by2 + '!'));
            }
        }
        throw new RuntimeException("Error 0x" + by2);
    }

    @Override
    public void BaseCoreGenericHandler() {
        LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler(true);
        LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler(this.plugin);
        if (this.c >= 1) {
            return;
        }
        this.c = 1;
        this.ServerSyncService();
        try {
            this.plugin.BaseCoreGenericHandler("config.yml");
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        this.plugin.BroadcastService();
        Object object = this;
        boolean flag = false;
        Logger logger = ((ConfigService)object).BaseCoreGenericHandler.getLogger();
        boolean flag2 = false;
        Throwable throwable = ((ConfigService)object).BaseCoreGenericHandler.LiteBansModule_240().LiteBansModule_31();
        if (throwable != null) {
            Throwable throwable2 = throwable;
            ((ConfigService)object).BaseCoreGenericHandler("config", throwable2);
            if (((ConfigService)object).BaseCoreGenericHandler.LiteBansModule_240().c().exists()) {
                logger.severe("[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/");
            } else {
                logger.severe("[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"" + ((ConfigService)object).BaseCoreGenericHandler.LiteBansModule_240().c().getAbsolutePath() + "\")");
            }
            if (((ConfigService)object).BaseCoreGenericHandler(2)) {
                ((ConfigService)object).BaseCoreGenericHandler(throwable2);
            }
        }
        object = new DiscordWebhookClient(this.plugin, null, 2, null);
        this.plugin((DiscordWebhookClient)object);
    }

    private final void ServerSyncService() {
        if (YamlConfigProvider.AsyncBackgroundTask_5() == null) {
            DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            JarHandler jP2 = new JarHandler("SnakeYAML", LiteBansModule_123.class.getName(), "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f");
            Object object = litebans.DatabaseMonitorService.BaseCoreGenericHandler(w2, jP2, false, false, 2, null);
            ObjectUtilities.LiteBansModule_31(object, "");
            Class clazz = (Class)object;
            this.plugin.BaseCoreGenericHandler(new LiteBansModule_186(this, clazz));
        }
    }

    @Override
    public void e() {
        block97: {
            block96: {
                v1 = this.plugin;
                v2 = (BroadcastService)v1.BaseCoreGenericHandler(BroadcastService.class);
                if (this.c >= 2) {
                    return;
                }
                this.plugin();
                this.c = (byte)2;
                v1.LiteBansModule_31((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.ConfigService litebans.PlatformPlugin ), ()V)((ConfigService)this, (PlatformPlugin)v1));
                v2.LiteBansModule_31(this.LiteBansModule_194().ElementsHandler());
                ObjectUtilities.BaseCoreGenericHandler(v1);
                v3 = new TemplatesYmlHandler(v1, null, false, 6, null);
                var73_5 = this;
                var4_6 = false;
                var6_9 = v5 = v3;
                v7 = false;
                var8_14 = null;
                try {
                    block112: {
                        v3.c().BaseCoreGenericHandler("templates.yml");
                        var8_14 = v3.c().BaseCoreGenericHandler(v3.LiteBansModule_31()).g();
                        var8_14.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("templates.yml", null));
                        v3.BaseCoreGenericHandler(var8_14);
                        v3.AsyncBackgroundTask_5().clear();
                        var9_20 = v3;
                        var10_22 = false;
                        v0 = var9_20.BaseCoreGenericHandler();
                        ObjectUtilities.BaseCoreGenericHandler(v0);
                        var11_23 = v0;
                        var12_24 = BanHandler.LiteBansModule_401.BaseCoreGenericHandler();
                        var13_25 = false;
                        var14_28 = var12_24;
                        var15_30 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var12_24, 10));
                        var16_32 = false;
                        for (Object var18_36 : var14_28) {
                            var19_38 = (BanHandler)var18_36;
                            var20_41 = var15_30;
                            var21_42 = false;
                            var20_41.add(LiteBansModule_371.BaseCoreGenericHandler(var19_38, var11_23.BaseCoreGenericHandler(var19_38 + "-templates")));
                        }
                        var22_45 = (List)var15_30;
                        for (LiteBansModule_354 var13_26 : var22_45) {
                            var14_29 = 0;
                            var14_29 = 0;
                            var15_30 = (LiteBansModule_390)var13_26.e();
                            if (var15_30 == null) continue;
                            var16_33 = var15_30.BaseCoreGenericHandler(false);
                            var17_35 = var9_20.AsyncBackgroundTask_5();
                            ObjectUtilities.BaseCoreGenericHandler(var16_33);
                            var18_36 = var16_33;
                            var19_39 = false;
                            var21_43 = var18_36;
                            var23_46 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(var18_36, 10));
                            var24_47 = false;
                            var25_48 = var21_43.iterator();
                            while (var25_48.hasNext()) {
                                block105: {
                                    block104: {
                                        var26_49 = var25_48.next();
                                        var27_50 = (String)var26_49;
                                        var20_41 = var23_46;
                                        var28_51 = false;
                                        var29_52 = var9_20;
                                        var30_53 = var14_29;
                                        var14_29 = LiteBansModule_283.BaseCoreGenericHandler((byte)(var30_53 + 1));
                                        var31_60 = (BanHandler)var13_26.LiteBansModule_31();
                                        v1 = var13_26.e();
                                        ObjectUtilities.BaseCoreGenericHandler(v1);
                                        var32_63 = ((LiteBansModule_390)v1).BaseCoreGenericHandler((String)var27_50);
                                        ObjectUtilities.BaseCoreGenericHandler(var27_50);
                                        var33_65 = var27_50;
                                        var34_68 = false;
                                        if (!(var32_63 != null)) {
                                            var35_73 = false;
                                            var35_74 = "Empty template: '" + (String)var33_65 + '\'';
                                            throw new IllegalArgumentException(var35_74.toString());
                                        }
                                        if (!(StringUtilities.c((CharSequence)var33_65, ' ', false, 2, null) == false && StringUtilities.c((CharSequence)var33_65, '.', false, 2, null) == false)) {
                                            var35_75 = false;
                                            var35_76 = "Template name '" + (String)var33_65 + "' cannot include dots or spaces! Use dashes or underscores instead + ";
                                            throw new IllegalArgumentException(var35_76.toString());
                                        }
                                        var35_72 = "";
                                        var36_81 = false;
                                        if (!(var32_63 != null)) {
                                            var37_86 = false;
                                            var37_87 = var31_60 + " template '" + (String)var35_72 + "' has invalid section + ";
                                            throw new IllegalArgumentException(var37_87.toString());
                                        }
                                        var38_92 = var32_63.BaseCoreGenericHandler(false);
                                        var37_88 = null;
                                        var39_94 = null;
                                        var40_99 = null;
                                        var41_105 = null;
                                        var42_109 = null;
                                        var43_117 = null;
                                        var43_117 = CollectionUtilities.e();
                                        var44_125 = null;
                                        var44_125 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(var38_92);
                                        var45_132 /* !! */  = (Iterable)var38_92;
                                        var46_137 = false;
                                        for (T var48_153 : var45_132 /* !! */ ) {
                                            block100: {
                                                block103: {
                                                    block101: {
                                                        block98: {
                                                            block99: {
                                                                block102: {
                                                                    var49_158 = (String)var48_153;
                                                                    var50_164 = false;
                                                                    var51_169 = var49_158;
                                                                    if (var51_169 == null) continue;
                                                                    switch (var51_169.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (var51_169.equals("duration")) break;
                                                                            ** break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!var51_169.equals("broadcast")) {
                                                                                ** break;
                                                                            }
                                                                            break block98;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!var51_169.equals("reason")) {
                                                                                ** break;
                                                                            }
                                                                            break block99;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!var51_169.equals("flags")) {
                                                                                ** break;
                                                                            }
                                                                            break block100;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!var51_169.equals("permission")) {
                                                                                ** break;
                                                                            }
                                                                            break block101;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!var51_169.equals("message")) {
                                                                                ** break;
                                                                            }
                                                                            break block102;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!var51_169.equals("actions")) {
                                                                                ** break;
                                                                            }
                                                                            break block103;
                                                                        }
                                                                    }
                                                                    var37_88 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var32_63.e((String)var49_158), 0.0, 2, null);
                                                                    ** break;
                                                                }
                                                                var39_94 = var32_63.e((String)var49_158);
                                                                ** break;
                                                            }
                                                            var40_99 = var32_63.e((String)var49_158);
                                                            ** break;
                                                        }
                                                        var41_105 = var32_63.e((String)var49_158);
                                                        ** break;
                                                    }
                                                    var42_109 = var32_63.e((String)var49_158);
                                                    ** break;
                                                }
                                                var43_117 = var29_52.BaseCoreGenericHandler(var32_63, (String)var49_158);
                                                ** break;
                                            }
                                            var44_125 = var29_52.BaseCoreGenericHandler(var32_63, (String)var49_158);
lbl150:
                                            // 15 sources

                                        }
                                        var52_175 = LiteBansModule_337.BaseCoreGenericHandler[var31_60.ordinal()] == 1 ? new LiteBansModule_66((String)var39_94, var40_99, (String)var41_105, (String)var42_109, var43_117, (List)var44_125) : (LiteBansModule_66)new LiteBansModule_105(var37_88, (String)var39_94, var40_99, (String)var41_105, (String)var42_109, var43_117, (List)var44_125);
                                        var36_80 = var29_52;
                                        var37_86 = false;
                                        v2 = var32_63.BaseCoreGenericHandler("ladder");
                                        if (v2 != null) break block104;
                                        v3 = CollectionUtilities.e();
                                        break block105;
                                    }
                                    var38_92 = v2;
                                    var39_94 = var38_92.BaseCoreGenericHandler(false);
                                    var40_100 = false;
                                    var41_105 = var39_94;
                                    var42_109 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var39_94, 10));
                                    var43_118 = false;
                                    var44_125 = var41_105.iterator();
                                    while (var44_125.hasNext()) {
                                        var45_132 /* !! */  = var44_125.next();
                                        var46_138 = (String)var45_132 /* !! */ ;
                                        var47_144 = var42_109;
                                        var48_154 = false;
                                        var47_144.add(var38_92.BaseCoreGenericHandler(var46_138));
                                    }
                                    var39_94 = (List)var42_109;
                                    var40_100 = false;
                                    var41_105 = var39_94;
                                    var42_109 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var39_94, 10));
                                    var43_118 = false;
                                    var44_125 = var41_105.iterator();
                                    while (var44_125.hasNext()) {
                                        var45_132 /* !! */  = var44_125.next();
                                        var46_139 = (LiteBansModule_390)var45_132 /* !! */ ;
                                        var47_144 = var42_109;
                                        var48_155 = false;
                                        var49_158 = var36_80;
                                        var50_164 = false;
                                        if (!(var46_139 != null)) {
                                            var51_170 = false;
                                            var51_171 = var31_60 + " template '" + (String)var33_65 + "' has invalid section + ";
                                            throw new IllegalArgumentException(var51_171.toString());
                                        }
                                        var53_176 /* !! */  = var46_139.BaseCoreGenericHandler(false);
                                        var51_169 = null;
                                        var54_177 = null;
                                        var55_178 = null;
                                        var56_179 = null;
                                        var57_182 = null;
                                        var58_183 /* !! */  = null;
                                        var58_183 /* !! */  = CollectionUtilities.e();
                                        var59_184 = null;
                                        var59_184 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(var53_176 /* !! */ );
                                        var60_185 = var53_176 /* !! */ ;
                                        var61_187 = false;
                                        for (T var63_190 : var60_185) {
                                            block108: {
                                                block111: {
                                                    block109: {
                                                        block106: {
                                                            block107: {
                                                                block110: {
                                                                    var64_191 /* !! */  = (String)var63_190;
                                                                    var65_192 = false;
                                                                    var66_194 = var64_191 /* !! */ ;
                                                                    if (var66_194 == null) continue;
                                                                    switch (var66_194.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (var66_194.equals("duration")) break;
                                                                            ** break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!var66_194.equals("broadcast")) {
                                                                                ** break;
                                                                            }
                                                                            break block106;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!var66_194.equals("reason")) {
                                                                                ** break;
                                                                            }
                                                                            break block107;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!var66_194.equals("flags")) {
                                                                                ** break;
                                                                            }
                                                                            break block108;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!var66_194.equals("permission")) {
                                                                                ** break;
                                                                            }
                                                                            break block109;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!var66_194.equals("message")) {
                                                                                ** break;
                                                                            }
                                                                            break block110;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!var66_194.equals("actions")) {
                                                                                ** break;
                                                                            }
                                                                            break block111;
                                                                        }
                                                                    }
                                                                    var51_169 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var46_139.e(var64_191 /* !! */ ), 0.0, 2, null);
                                                                    ** break;
                                                                }
                                                                var54_177 = var46_139.e(var64_191 /* !! */ );
                                                                ** break;
                                                            }
                                                            var55_178 = var46_139.e(var64_191 /* !! */ );
                                                            ** break;
                                                        }
                                                        var56_179 = var46_139.e(var64_191 /* !! */ );
                                                        ** break;
                                                    }
                                                    var57_182 = var46_139.e(var64_191 /* !! */ );
                                                    ** break;
                                                }
                                                var58_183 /* !! */  = var49_158.BaseCoreGenericHandler(var46_139, var64_191 /* !! */ );
                                                ** break;
                                            }
                                            var59_184 = var49_158.BaseCoreGenericHandler(var46_139, var64_191 /* !! */ );
lbl259:
                                            // 15 sources

                                        }
                                        var47_144.add(LiteBansModule_337.BaseCoreGenericHandler[var31_60.ordinal()] == 1 ? new LiteBansModule_66((String)var54_177, (String)var55_178, var56_179, (String)var57_182, (List)var58_183 /* !! */ , (List)var59_184) : (LiteBansModule_66)new LiteBansModule_105((Long)var51_169, (String)var54_177, (String)var55_178, var56_179, (String)var57_182, (List)var58_183 /* !! */ , (List)var59_184));
                                    }
                                    v3 = CollectionUtilities.c((Iterable)((List)var42_109));
                                }
                                var35_72 = v3;
                                var67_195 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var32_63.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                                var38_91 = var32_63.BaseCoreGenericHandler("ip_template", false);
                                var20_41.add(new LiteBansModule_65(var30_53, (String)var33_65, (BanHandler)var31_60, (LiteBansModule_66)var52_175, var38_91, (List)var35_72, var67_195, null));
                            }
                            var18_36 = (List)var23_46;
                            CollectionUtilities.BaseCoreGenericHandler((Collection)var17_35, (Iterable)var18_36);
                        }
                        var9_20.c().getLogger().info("Loaded " + var9_20.AsyncBackgroundTask_5().size() + " templates from templates.yml!");
                        var12_24 = var11_23.BaseCoreGenericHandler("template-groups");
                        if (var12_24 == null) break block112;
                        var13_27 = var12_24.BaseCoreGenericHandler(false);
                        v4 = var9_20.e();
                        ObjectUtilities.BaseCoreGenericHandler(var13_27);
                        var14_28 = var13_27;
                        var69_196 = v4;
                        var20_41 = var9_20;
                        var15_31 = false;
                        var16_34 = var14_28;
                        var17_35 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(var14_28, 10));
                        var18_37 = false;
                        for (T var21_44 : var16_34) {
                            block114: {
                                block113: {
                                    block95: {
                                        var23_46 = (String)var21_44;
                                        var70_197 = var17_35;
                                        var24_47 = false;
                                        var25_48 = var9_20;
                                        var26_49 = var12_24.BaseCoreGenericHandler((String)var23_46);
                                        ObjectUtilities.BaseCoreGenericHandler(var23_46);
                                        var27_50 = var23_46;
                                        var28_51 = false;
                                        v5 = var26_49;
                                        var29_52 = v5 != null ? v5.BaseCoreGenericHandler("weights") : null;
                                        if (!(var26_49 != null)) {
                                            var30_55 = false;
                                            var30_56 = "Empty template group: '" + (String)var27_50 + '\'';
                                            throw new IllegalArgumentException(var30_56.toString());
                                        }
                                        if (!(var29_52 != null)) {
                                            var30_57 = false;
                                            var30_58 = "No weights for template group '" + (String)var27_50 + "'!";
                                            throw new IllegalArgumentException(var30_58.toString());
                                        }
                                        var30_59 /* !! */  = BanHandler.values();
                                        var31_61 = false;
                                        var33_66 = var30_59 /* !! */ .length;
                                        for (var32_64 = 0; var32_64 < var33_66; ++var32_64) {
                                            var35_72 = var34_69 = var30_59 /* !! */ [var32_64];
                                            var36_82 = false;
                                            if (!ObjectUtilities.BaseCoreGenericHandler((Object)(var26_49.BaseCoreGenericHandler("type", "") != null ? var37_90.toLowerCase(Locale.ROOT) : null), (Object)var35_72.toString())) continue;
                                            v6 = var34_69;
                                            break block95;
                                        }
                                        v6 = var38_93 = null;
                                    }
                                    if (!(var38_93 != null && var38_93 == var38_93.c())) {
                                        var31_61 = false;
                                        var31_62 = "Template group '" + (String)var27_50 + "' type is missing: " + var38_93;
                                        throw new IllegalArgumentException(var31_62.toString());
                                    }
                                    var31_60 = var25_48;
                                    var32_64 = 0;
                                    if (var26_49.BaseCoreGenericHandler("ladder") != null) break block113;
                                    v7 = CollectionUtilities.e();
                                    break block114;
                                }
                                var34_69 = var33_67.BaseCoreGenericHandler(false);
                                var35_77 = false;
                                var36_83 = var34_69;
                                var37_90 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var34_69, 10));
                                var39_95 = false;
                                var40_101 = var36_83.iterator();
                                while (var40_101.hasNext()) {
                                    var41_105 = var40_101.next();
                                    var42_111 = (String)var41_105;
                                    var43_119 = var37_90;
                                    var44_127 = false;
                                    var43_119.add(var33_67.BaseCoreGenericHandler(var42_111));
                                }
                                var34_69 = (List)var37_90;
                                var35_77 = false;
                                var36_83 = var34_69;
                                var37_90 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var34_69, 10));
                                var39_95 = false;
                                var40_101 = var36_83.iterator();
                                while (var40_101.hasNext()) {
                                    var41_105 = var40_101.next();
                                    var42_112 = (LiteBansModule_390)var41_105;
                                    var43_120 = var37_90;
                                    var44_128 = false;
                                    var45_133 = var31_60;
                                    var46_140 = false;
                                    if (!(var42_112 != null)) {
                                        var47_146 = false;
                                        var47_147 = var38_93 + " template '" + (String)var27_50 + "' has invalid section + ";
                                        throw new IllegalArgumentException(var47_147.toString());
                                    }
                                    var48_156 = var42_112.BaseCoreGenericHandler(false);
                                    var47_148 = null;
                                    var49_160 = null;
                                    var50_166 = null;
                                    var51_173 = null;
                                    var52_175 = null;
                                    var53_176 /* !! */  = null;
                                    var53_176 /* !! */  = CollectionUtilities.e();
                                    var54_177 = null;
                                    var54_177 = CollectionUtilities.e();
                                    ObjectUtilities.BaseCoreGenericHandler(var48_156);
                                    var55_178 = var48_156;
                                    var56_181 = false;
                                    var57_182 = var55_178.iterator();
                                    while (var57_182.hasNext()) {
                                        block117: {
                                            block120: {
                                                block118: {
                                                    block115: {
                                                        block116: {
                                                            block119: {
                                                                var58_183 /* !! */  = var57_182.next();
                                                                var59_184 = (String)var58_183 /* !! */ ;
                                                                var60_186 = false;
                                                                var61_188 = var59_184;
                                                                if (var61_188 == null) continue;
                                                                switch (var61_188.hashCode()) {
                                                                    case -1992012396: {
                                                                        if (var61_188.equals("duration")) break;
                                                                        ** break;
                                                                    }
                                                                    case -1618876223: {
                                                                        if (!var61_188.equals("broadcast")) {
                                                                            ** break;
                                                                        }
                                                                        break block115;
                                                                    }
                                                                    case -934964668: {
                                                                        if (!var61_188.equals("reason")) {
                                                                            ** break;
                                                                        }
                                                                        break block116;
                                                                    }
                                                                    case 97513095: {
                                                                        if (!var61_188.equals("flags")) {
                                                                            ** break;
                                                                        }
                                                                        break block117;
                                                                    }
                                                                    case -517618225: {
                                                                        if (!var61_188.equals("permission")) {
                                                                            ** break;
                                                                        }
                                                                        break block118;
                                                                    }
                                                                    case 954925063: {
                                                                        if (!var61_188.equals("message")) {
                                                                            ** break;
                                                                        }
                                                                        break block119;
                                                                    }
                                                                    case -1161803523: {
                                                                        if (!var61_188.equals("actions")) {
                                                                            ** break;
                                                                        }
                                                                        break block120;
                                                                    }
                                                                }
                                                                var47_148 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var42_112.e((String)var59_184), 0.0, 2, null);
                                                                ** break;
                                                            }
                                                            var49_160 = var42_112.e((String)var59_184);
                                                            ** break;
                                                        }
                                                        var50_166 = var42_112.e((String)var59_184);
                                                        ** break;
                                                    }
                                                    var51_173 = var42_112.e((String)var59_184);
                                                    ** break;
                                                }
                                                var52_175 = var42_112.e((String)var59_184);
                                                ** break;
                                            }
                                            var53_176 /* !! */  = var45_133.BaseCoreGenericHandler(var42_112, (String)var59_184);
                                            ** break;
                                        }
                                        var54_177 = var45_133.BaseCoreGenericHandler(var42_112, (String)var59_184);
lbl430:
                                        // 15 sources

                                    }
                                    var43_120.add(LiteBansModule_337.BaseCoreGenericHandler[var38_93.ordinal()] == 1 ? new LiteBansModule_66(var49_160, var50_166, var51_173, (String)var52_175, var53_176 /* !! */ , (List)var54_177) : (LiteBansModule_66)new LiteBansModule_105(var47_148, var49_160, var50_166, var51_173, (String)var52_175, var53_176 /* !! */ , (List)var54_177));
                                }
                                v7 = CollectionUtilities.c((Iterable)((List)var37_90));
                            }
                            var30_59 /* !! */  = v7;
                            var71_198 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, var26_49.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                            if (!(((Collection)var30_59 /* !! */ ).isEmpty() == false)) {
                                var34_70 = false;
                                var34_71 = "No ladder for template group '" + (String)var27_50 + "'!";
                                throw new IllegalArgumentException(var34_71.toString());
                            }
                            var34_69 = var29_52.BaseCoreGenericHandler(false);
                            var35_78 = false;
                            var36_84 = new LinkedHashMap<K, V>(LiteBansModule_20.c(LiteBansModule_348.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler((Iterable)var34_69, 10)), 16));
                            var37_90 = var34_69;
                            var39_97 = false;
                            var40_102 = var37_90.iterator();
                            while (var40_102.hasNext()) {
                                var41_105 = var40_102.next();
                                var42_113 /* !! */  = var41_105;
                                var64_191 /* !! */  = var41_105;
                                var65_193 = (Map)var36_84;
                                var43_121 = false;
                                var66_194 = Float.valueOf((float)var29_52.AsyncBackgroundTask_5(var42_113 /* !! */ ));
                                var65_193.put(var64_191 /* !! */ , var66_194);
                            }
                            var34_69 = (Map)var36_84;
                            var35_78 = false;
                            var36_84 = var34_69;
                            var37_90 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(var34_69.size()));
                            var39_97 = false;
                            var40_102 = var36_84.entrySet();
                            var41_106 = false;
                            var42_114 = var40_102.iterator();
                            while (var42_114.hasNext()) {
                                var43_122 = var42_114.next();
                                var44_129 = (Map.Entry)var43_122;
                                var65_193 = var37_90;
                                var45_134 = false;
                                var46_141 = var25_48.BaseCoreGenericHandler(var38_93, (String)var44_129.getKey());
                                if (!(var46_141 != null)) {
                                    var47_149 = false;
                                    var47_150 = "Template group '" + (String)var27_50 + "' refers to non-existing " + var38_93 + " template: '" + (String)var44_129.getKey() + '\'';
                                    throw new IllegalArgumentException(var47_150.toString());
                                }
                                if (((Collection)var46_141.LiteBansModule_31()).isEmpty() == false) {
                                    var25_48.c().getLogger().warning("Template '" + (String)var44_129.getKey() + "' belongs to template group '" + (String)var27_50 + "', its ladder will be ignored. Remove the ladder from '" + (String)var44_129.getKey() + "' to silence this warning + ");
                                }
                                var48_157 = (Map.Entry)var43_122;
                                var49_161 = var46_141;
                                var50_167 = var65_193;
                                var51_174 = false;
                                var52_175 = var48_157.getValue();
                                var50_167.put(var49_161, var52_175);
                            }
                            var33_65 = var37_90;
                            if (!(var33_65.isEmpty() == false)) {
                                var35_78 = false;
                                var35_79 = "No weights for template group '" + (String)var27_50 + "'!";
                                throw new IllegalArgumentException(var35_79.toString());
                            }
                            var34_69 = var33_65.values();
                            var35_78 = false;
                            var36_84 = var34_69;
                            var37_90 = new ArrayList<PunishmentService>();
                            var39_97 = false;
                            var40_102 = var36_84.iterator();
                            while (var40_102.hasNext()) {
                                var41_108 = var40_102.next();
                                var42_115 = ((Number)var41_108).floatValue();
                                var43_123 = false;
                                if (!((double)var42_115 <= 0.0)) continue;
                                var37_90.add(var41_108);
                            }
                            var34_69 = (List)var37_90;
                            var35_78 = false;
                            var36_84 = var34_69.iterator();
                            while (var36_84.hasNext()) {
                                var37_90 = var36_84.next();
                                var39_98 = ((Number)var37_90).floatValue();
                                var40_103 = false;
                                var25_48.c().getLogger().warning("Template group '" + (String)var27_50 + "' includes BaseCoreGenericHandler bad weight: " + var39_98);
                            }
                            var35_72 = var33_65;
                            var36_85 = false;
                            var37_90 = var35_72;
                            var39_94 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(var35_72.size()));
                            var40_104 = false;
                            var41_105 = var37_90.entrySet();
                            var42_116 = false;
                            var43_124 = var41_105.iterator();
                            while (var43_124.hasNext()) {
                                var44_130 = var43_124.next();
                                var45_135 = (Map.Entry)var44_130;
                                var46_142 = var39_94;
                                var47_151 = false;
                                var48_157 = (Map.Entry)var44_130;
                                var64_191 /* !! */  = var45_135.getKey();
                                var65_193 = var46_142;
                                var49_162 = false;
                                var66_194 = (LiteBansModule_65)var48_157.getKey();
                                var65_193.put(var64_191 /* !! */ , var66_194);
                            }
                            var35_72 = var39_94;
                            var36_85 = false;
                            var37_90 = var35_72;
                            var39_94 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(var35_72.size()));
                            var40_104 = false;
                            var41_105 = var37_90.entrySet();
                            var42_116 = false;
                            var43_124 = var41_105.iterator();
                            while (var43_124.hasNext()) {
                                var44_131 = var43_124.next();
                                var45_136 /* !! */  = (Map.Entry)var44_131;
                                var65_193 = var39_94;
                                var46_143 = false;
                                var47_152 = (Map.Entry)var44_131;
                                var48_157 = LiteBansModule_283.AsyncBackgroundTask_5(((LiteBansModule_65)var45_136 /* !! */ .getKey()).LiteBansModule_194());
                                var49_163 = var65_193;
                                var50_168 = false;
                                var45_136 /* !! */  = var47_152.getValue();
                                var49_163.put(var48_157, var45_136 /* !! */ );
                            }
                            var34_69 = var39_94;
                            var70_197.add(new LiteBansModule_174((String)var27_50, var38_93, (Map)var33_65, (Map)var34_69, (List)var30_59 /* !! */ , var71_198));
                        }
                        var70_197 = (List)var17_35;
                        var20_41.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(var69_196, (Iterable)var70_197));
                    }
                    if (((Collection)var9_20.e()).isEmpty() == false) {
                        var9_20.c().getLogger().info("Loaded " + var9_20.e().size() + " template groups from templates.yml!");
                    } else {
                        var9_20.BaseCoreGenericHandler(CollectionUtilities.e());
                    }
                }
                catch (Exception var9_21) {
                    v3.BaseCoreGenericHandler(var9_21);
                    v8 = v3;
                    break block96;
                }
                v8 = v5;
            }
            var74_199 = v8;
            var73_5.BaseCoreGenericHandler(var74_199);
            this.plugin(new DiscordWebhookClient_2(v1, null, 2, null).BaseCoreGenericHandler());
            if (v1.LiteBansModule_401()) {
                v3 = this;
                var4_6 = false;
                try {
                    v5 = v3.AsyncBackgroundTask_22();
                    if (v5 == null) break block97;
                    v3.CommandThrottleService = var6_9 = new NullHandler_8(v3.BaseCoreGenericHandler);
                    if (!OrgBukkitBlockHandler.c()) {
                        var6_9.BaseCoreGenericHandler(v5);
                    }
                    break block97;
                }
                catch (Throwable var5_8) {
                    var6_9 = (PluginModule)v3;
                    var7_11 = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)"Failed to hook into ServerListPlus + ", (CharSequence)"Try using the latest ServerListPlus development build + ");
                    var8_15 = false;
                    var9_20 = var6_9.BaseCoreGenericHandler.getLogger();
                    var10_22 = false;
                    var9_20.warning(var7_11.toString());
                    if (v3.BaseCoreGenericHandler(1)) {
                        var5_8.printStackTrace();
                    }
                    break block97;
                }
            }
            v1.c((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.ConfigService ), ()V)((ConfigService)this));
        }
        v3 = this;
        var4_6 = false;
        v5 = v3.LiteBansModule_194();
        if (v5.W()) {
            var6_9 = v3.BaseCoreGenericHandler.getDataFolder();
            var7_12 = "geoip";
            var8_16 = false;
            var9_20 = LiteBansModule_112.c(new File((File)var6_9, var7_12));
            v3.BaseCoreGenericHandler.LiteBansModule_31(new AsyncBackgroundTask_4((ConfigService)v3, (File)var9_20, (DiscordWebhookClient)v5));
        }
        try {
            this.q = true;
            v3 = this;
            var4_6 = false;
            v5 = (BroadcastService)v3.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
            var6_9 = v3.BaseCoreGenericHandler.getDataFolder();
            var7_13 = "lockdown.yml";
            var8_17 = false;
            var9_20 = new File((File)var6_9, var7_13);
            if (!var9_20.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                var6_9 = v3.BaseCoreGenericHandler.getDataFolder();
                var7_13 = "lockdown.json";
                var8_17 = false;
                var9_20 = new File((File)var6_9, var7_13);
            }
            if (var9_20.exists()) {
                var6_9 = v3.BaseCoreGenericHandler.BaseCoreGenericHandler((File)var9_20).g();
                var7_13 = var6_9.BaseCoreGenericHandler("scope", "*");
                var8_18 = var6_9.BaseCoreGenericHandler("reason", "");
                if (v3.LiteBansModule_194().D()) {
                    ObjectUtilities.BaseCoreGenericHandler((Object)var8_18);
                    if (((CharSequence)var8_18).length() > 0) {
                        v3.BaseCoreGenericHandler.getLogger().info("Applying saved lockdown, reason: \"" + var8_18 + '\"');
                        ObjectUtilities.BaseCoreGenericHandler((Object)var7_13);
                        v5.BaseCoreGenericHandler(var7_13, (CharSequence)var8_18, true);
                    }
                }
            }
            this.AsyncBackgroundTask_5();
            v3 = this;
            var4_6 = false;
            v5 = LiteBansModule_336.c();
            var6_9 = v3.BaseCoreGenericHandler.e();
            if (!ObjectUtilities.BaseCoreGenericHandler(v5, var6_9)) {
                var7_13 = "This is LiteBans version " + (String)v5 + ", NOT version " + (String)var6_9 + '!';
                var8_19 = new AsyncBackgroundTask_12((ConfigService)v3, var7_13);
                var8_19.run();
                v3.BaseCoreGenericHandler.BaseCoreGenericHandler(var8_19, 20L);
            }
            if (this.g()) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 140L);
            }
            if (v1.AsyncBackgroundTask_22() == 0) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 300L);
            }
        }
        catch (Throwable var3_4) {
            this.plugin(var3_4);
        }
    }

    private final void AsyncBackgroundTask_5() {
        Database database = null;
        Events events = null;
        PlayerProvider playerProvider = null;
        RandomID randomID = null;
        try {
            Database database2 = Database.get();
            ObjectUtilities.LiteBansModule_31(database2, "");
            database = (DefaultHandler_2)database2;
            Events events2 = Events.get();
            ObjectUtilities.LiteBansModule_31(events2, "");
            events = (EventsHandler)events2;
            playerProvider = PlayerProvider.get();
            randomID = RandomID.get();
        }
        catch (MissingImplementationException missingImplementationException) {
            database = new DefaultHandler_2(this.plugin);
            events = new EventsHandler();
            playerProvider = new PlayerproviderHandler(this.plugin);
            randomID = new LiteBansModule_419(this.plugin);
        }
        Database.setInstance(database);
        Events.setInstance(events);
        PlayerProvider.setInstance(playerProvider);
        RandomID.setInstance(randomID);
    }

    @Override
    public void LiteBansModule_31() {
        this.plugin.BaseCoreGenericHandler("config.yml");
        this.plugin.LiteBansModule_240().LiteBansModule_194();
        this.c = 0;
        this.e();
    }

    public final void BaseCoreGenericHandler(@NotNull Throwable throwable) {
        if (throwable instanceof LiteBansException_9) {
            PluginModule module = this;
            String string = throwable.getMessage();
            ObjectUtilities.BaseCoreGenericHandler((Object)string);
            String string2 = string;
            boolean flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string2);
            return;
        }
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        this.plugin(stringWriter.toString());
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        boolean flag;
        String string2;
        Object object;
        Iterator iterator;
        boolean flag2;
        Collection collection3;
        Object object2;
        boolean flag3;
        Iterable iterable;
        Object object3 = new String[]{System.lineSeparator()};
        List list = StringUtilities.BaseCoreGenericHandler((CharSequence)string, (String[])object3, false, 0, 6, null);
        object3 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (!(list.size() <= 2 || object3 != null && ((ConfigService)object3).g())) {
            iterable = list;
            flag3 = false;
            object2 = iterable;
            collection3 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
            flag2 = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                string2 = (String)object;
                Collection collection2 = collection3;
                flag = false;
                collection2.add(this.AsyncBackgroundTask_5(string2));
            }
            list = (List)collection3;
        }
        iterable = list;
        flag3 = false;
        object2 = iterable;
        collection3 = new ArrayList();
        flag2 = false;
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            string2 = (String)object;
            flag = false;
            boolean flag4 = ((CharSequence)string2).length() > 0;
            if (!flag4) continue;
            collection3.add(object);
        }
        iterable = (List)collection3;
        flag3 = false;
        for (Collection collection3 : iterable) {
            String string3 = (String)((Object)collection3);
            boolean flag5 = false;
            object = this;
            boolean flag6 = false;
            ((PluginModule)object).BaseCoreGenericHandler.getLogger().warning(string3);
        }
    }

    public final String AsyncBackgroundTask_5(@NotNull String string) {
        String string2;
        String string3 = string;
        boolean flag = false;
        CharSequence charSequence = string3;
        boolean flag2 = false;
        int n = 0;
        int n2 = charSequence.length() - 1;
        boolean flag3 = false;
        while (n <= n2) {
            int n3 = !flag3 ? n : n2;
            char c = charSequence.charAt(n3);
            boolean flag4 = false;
            char c10 = c = ObjectUtilities.BaseCoreGenericHandler(c, 32) <= 0 ? (char)'\u0001' : '\u0000';
            if (!flag3) {
                if (c == '\u0000') {
                    flag3 = true;
                    continue;
                }
                ++n;
                continue;
            }
            if (c == '\u0000') break;
            --n2;
        }
        return StringUtilities.LiteBansModule_31(string2 = ((Object)charSequence.subSequence(n, n2 + 1)).toString(), "LiteBansModule_21 java.lang.Thread.run(", false, 2, null) || StringUtilities.LiteBansModule_31(string2, "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor$Worker.run(", false, 2, null) || StringUtilities.LiteBansModule_31(string2, "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor.runWorker(", false, 2, null) || StringUtilities.LiteBansModule_31(string2, litebans.DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(), false, 2, null) || StringUtilities.LiteBansModule_31(string2, litebans.DatabaseMonitorService.CommandThrottleService.AsyncBackgroundTask_5(), false, 2, null) || StringUtilities.LiteBansModule_31(string2, litebans.DatabaseMonitorService.CommandThrottleService.c(), false, 2, null) || StringUtilities.LiteBansModule_31(string2, "LiteBansModule_21 sun.reflect.NativeConstructorAccessorImpl.newInstance", false, 2, null) || StringUtilities.LiteBansModule_31(string2, "LiteBansModule_21 sun.reflect.DelegatingConstructorAccessorImpl.newInstance(", false, 2, null) || StringUtilities.LiteBansModule_31(string2, "LiteBansModule_21 java.lang.reflect.Constructor.newInstance(", false, 2, null) ? "" : string;
    }

    public final void BaseCoreGenericHandler(@NotNull String string, @NotNull Throwable throwable) {
        int n;
        Object object = this;
        String[] args = "[!!] Could not load " + string + " + ";
        boolean flag = false;
        ((PluginModule)object).BaseCoreGenericHandler.getLogger().severe((String)args);
        object = "org.bukkit.configuration.InvalidConfigurationException: ";
        Object object2 = new String[]{(String)object + "while scanning HikariDataSource anchor", (String)object + "while scanning BaseCoreGenericHandler simple key", (String)object + "while scanning for the next token", (String)object + "while parsing BaseCoreGenericHandler block mapping", (String)object + "while parsing BaseCoreGenericHandler block collection", object};
        args = object2;
        object2 = null;
        String string2 = throwable.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        object2 = string2;
        Object object3 = args;
        boolean flag2 = false;
        int n2 = ((String[])object3).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = object3[n];
            boolean flag3 = false;
            object2 = StringUtilities.BaseCoreGenericHandler((String)object2, string4, "", false, 4, null);
        }
        object2 = StringUtilities.BaseCoreGenericHandler((String)object2, "\\AsyncBackgroundTask_22(TAB)", "TAB", false, 4, null);
        object3 = this;
        String string5 = "[!!] Configuration error found: " + (String)object2;
        n = 0;
        object3.BaseCoreGenericHandler.getLogger().severe(string5);
        object3 = this;
        string5 = "[!!] LiteBans will use the default " + string + " until errors have been ";
        n = 0;
        object3.BaseCoreGenericHandler.getLogger().severe(string5);
    }

    public final Object AsyncBackgroundTask_22() {
        return this.plugin.i().c("ServerListPlus");
    }

    public final ConfigService BroadcastService() {
        if (!this.q) {
            PluginModule module = this;
            String string = this.plugin.getName() + " is not enabled yet!";
            boolean flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
            throw new LiteBansException_2();
        }
        return this;
    }

    public final CharSequence LiteBansModule_31(@Nullable Object object) {
        if (object == null) {
            return MessageKey.ay;
        }
        String string = object.toString();
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"true")) {
            return MessageKey.ap;
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"false")) {
            return MessageKey.OutHandler;
        }
        if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string)) {
            return MessageKey.LiteBansModule_7;
        }
        return string;
    }

    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull Object object) {
        String string;
        String string2 = string = sender.LiteBansModule_31();
        boolean flag = false;
        if (string2 == null && !this.LiteBansModule_194().LiteBansModule_240()) {
            this.plugin.getLogger().warning("Player[name=" + sender.i() + "].getAddress() returned null on " + object.getClass().getSimpleName());
        }
        return string;
    }

    public final boolean e(@NotNull String string) {
        if (!this.LiteBansModule_194().PunishmentTableService() && (StringUtilities.BaseCoreGenericHandler(string, "mute", false, 2, null) || StringUtilities.BaseCoreGenericHandler(string, "muteip", false, 2, null))) {
            return false;
        }
        if (!this.LiteBansModule_194().BanHandler_2() && StringUtilities.BaseCoreGenericHandler(string, "warn", false, 2, null)) {
            return false;
        }
        return this.LiteBansModule_194().ab() || !ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"lockdown");
    }

    public final boolean PunishmentTableService() {
        return this.plugin.AsyncBackgroundTask_22() == 0 && this.HoverTextFormatter() && !this.BanHandler_2.BaseCoreGenericHandler() && this.LiteBansModule_194().ay();
    }

    public final SimpleDateFormat BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        SimpleDateFormat simpleDateFormat;
        try {
            simpleDateFormat = new SimpleDateFormat(StringUtilities.BaseCoreGenericHandler(((Object)charSequence).toString(), "YYYY", "yyyy", false, 4, null), this.z().AsyncBackgroundTask_5());
        }
        catch (Exception exception) {
            if (!(exception instanceof LiteBansException_4)) {
                PluginModule module = this;
                CharSequence charSequence3 = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)("Invalid date format: \"" + charSequence + "\". Using default date format \"" + charSequence2 + "\" + "), (CharSequence)"Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html");
                boolean flag = false;
                Logger logger = module.BaseCoreGenericHandler.getLogger();
                boolean flag2 = false;
                logger.warning(((Object)charSequence3).toString());
            }
            simpleDateFormat = new SimpleDateFormat(((Object)charSequence2).toString());
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        boolean flag = false;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static /* synthetic */ SimpleDateFormat BaseCoreGenericHandler(ConfigService configService, CharSequence charSequence, CharSequence charSequence2, int n, Object object) {
        if ((n & 2) != 0) {
            charSequence2 = "yyyy-MM-LiteBansModule_118";
        }
        return configService.BaseCoreGenericHandler(charSequence, charSequence2);
    }

    private static final LiteBansModule_409 BaseCoreGenericHandler(ConfigService configService) {
        return new LiteBansModule_409(configService.LiteBansModule_194().ContinueEvictHandler());
    }

    private static final boolean c(ConfigService configService) {
        return configService.BaseCoreGenericHandler.i().BaseCoreGenericHandler("AuthMe");
    }

    private static final void BaseCoreGenericHandler(ConfigService configService, PlatformPlugin plugin) {
        MessagesYmlHandler k22;
        ConfigService q_03;
        block14: {
            Object object;
            Object object2;
            Object object3;
            MessagesYmlHandler k23;
            ObjectUtilities.BaseCoreGenericHandler(plugin);
            MessagesYmlHandler k24 = new MessagesYmlHandler(plugin, null, 2, null);
            q_03 = configService;
            boolean flag = false;
            MessagesYmlHandler k25 = k23 = k24;
            boolean flag2 = false;
            DatabaseService gn_02 = null;
            try {
                k24.BaseCoreGenericHandler().BaseCoreGenericHandler("messages.yml");
                gn_02 = k24.BaseCoreGenericHandler().BaseCoreGenericHandler(k24.g()).g();
                gn_02.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("messages.yml", null));
                k24.BaseCoreGenericHandler(gn_02);
                object3 = k24;
                boolean flag3 = false;
                DatabaseService gn_03 = ((MessagesYmlHandler)object3).c();
                ObjectUtilities.BaseCoreGenericHandler(gn_03);
                object2 = gn_03;
                object = MessageKey.values();
                boolean flag4 = false;
                for (CharSequence charSequence : object) {
                    MessageKey am2 = charSequence;
                    boolean flag5 = false;
                    String string = am2.PluginHookService;
                    CharSequence charSequence2 = am2.ServerOriginHandler;
                    if (charSequence2 == null) continue;
                    String string2 = object2.BaseCoreGenericHandler(string, null);
                    if (string2 != null) {
                        am2.BaseCoreGenericHandler(object2.BaseCoreGenericHandler(string, ((Object)charSequence2).toString()));
                        if (!(((CharSequence)string2).length() > 0)) continue;
                        object2.LiteBansModule_31(string, MessageKey.BaseCoreGenericHandler(am2, string2));
                        continue;
                    }
                    object2.LiteBansModule_31(string, StringUtilities.BaseCoreGenericHandler(((Object)charSequence2).toString(), '\u00a7', '&', false, 4, null));
                }
                object3 = gn_02.BaseCoreGenericHandler("locale", "system");
                if (!ObjectUtilities.BaseCoreGenericHandler(object3, (Object)"system")) {
                    Locale locale = k24.LiteBansModule_31();
                    k24.BaseCoreGenericHandler(new Locale((String)object3));
                    k24.BaseCoreGenericHandler().getLogger().info("Using configured locale (" + k24.AsyncBackgroundTask_5().getLanguage() + ')');
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)k24.AsyncBackgroundTask_5(), locale)) {
                        object2 = "Supported locales: " + ArrayUtilities.BaseCoreGenericHandler(Locale.getAvailableLocales(), null, null, null, 0, null, (LiteBansModule_178)LiteBansModule_172.BaseCoreGenericHandler, 31, null);
                        object = k24.BaseCoreGenericHandler().getLogger();
                        CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)"Note: If the configured locale is unrecognized, the system default locale is ", (CharSequence)object2);
                        int n = 0;
                        ((Logger)object).info(((Object)charSequence).toString());
                    }
                } else {
                    k24.BaseCoreGenericHandler().getLogger().info("Using system locale (" + k24.AsyncBackgroundTask_5().getLanguage() + ')');
                }
                k24.BaseCoreGenericHandler((DatabaseService)null);
            }
            catch (Exception exception) {
                k24.BaseCoreGenericHandler(exception);
                k22 = k24;
                break block14;
            }
            if (YamlConfigProvider.AsyncBackgroundTask_5() != null) {
                try {
                    gn_02.LiteBansModule_240();
                }
                catch (Exception exception) {
                    k24.BaseCoreGenericHandler().getLogger().severe("[!!] Could not save messages + ");
                    k24.e().BaseCoreGenericHandler(exception);
                }
            }
            object3 = k24;
            boolean flag6 = false;
            object2 = MessageKey.PlayerproviderHandler;
            object = MessageKey.ad;
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)object2, (CharSequence)"$bannedPlayer", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)object, (CharSequence)"$bannedPlayer", false, 2, null)) {
                ((MessageKey)object2).ServerOriginHandler = ((MessageKey)object2).BaseCoreGenericHandler((CharSequence)"$bannedPlayer", (Object)"$mutedPlayer");
                ((MessageKey)object).ServerOriginHandler = ((MessageKey)object).BaseCoreGenericHandler((CharSequence)"$bannedPlayer", (Object)"$warnedPlayer");
            }
            try {
                PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, 0L, false, 2, null);
            }
            catch (Exception exception) {
                if (exception instanceof IllegalFormatException) {
                    CharSequence charSequence;
                    String string = "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21";
                    Logger logger = ((MessagesYmlHandler)object3).BaseCoreGenericHandler().getLogger();
                    charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)("Duration format (\"" + MessageKey.InputHandler + "\") is invalid! (" + exception.getClass().getSimpleName() + ')'), (CharSequence)("Using default format instead (\"" + string + "\") + "));
                    boolean flag7 = false;
                    logger.warning(((Object)charSequence).toString());
                    MessageKey.InputHandler.BaseCoreGenericHandler(string);
                }
                throw exception;
            }
            k22 = k23;
        }
        q_03.BaseCoreGenericHandler(k22);
    }

    private static final void LiteBansModule_31(ConfigService configService) {
        block4: {
            ConfigService q_03 = configService;
            boolean flag = false;
            try {
                Object object = q_03.AsyncBackgroundTask_22();
                if (object != null) {
                    NullHandler_8 z = new NullHandler_8(q_03.BaseCoreGenericHandler);
                    q_03.CommandThrottleService = z;
                    if (!OrgBukkitBlockHandler.c()) {
                        z.BaseCoreGenericHandler(object);
                    }
                }
            }
            catch (Throwable throwable) {
                PluginModule module = q_03;
                CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)"Failed to hook into ", (CharSequence)"Try using the latest ServerListPlus development ");
                boolean flag2 = false;
                Logger logger = module.BaseCoreGenericHandler.getLogger();
                boolean flag3 = false;
                logger.warning(((Object)charSequence).toString());
                if (!q_03.BaseCoreGenericHandler(1)) break block4;
                throwable.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(PlatformPlugin plugin, ConfigService configService) {
        block18: {
            BroadcastService o2 = (BroadcastService)plugin.BaseCoreGenericHandler(BroadcastService.class);
            int n = plugin.z().e().size();
            if (!(n > 8)) {
                boolean flag = false;
                Integer n2 = n;
                throw new IllegalArgumentException(((Object)n2).toString());
            }
            Object object = new Class[]{PlatformPlugin.class};
            Class[] classArray = object;
            object = new Object[]{plugin};
            List list = plugin.LiteBansModule_194().BaseCoreGenericHandler(BansHandler.class, classArray, (Object[])object);
            if (!(list.size() > 1)) {
                boolean flag = false;
                ObjectUtilities.BaseCoreGenericHandler(list);
                List list2 = list;
                throw new IllegalArgumentException(list2.toString());
            }
            Object object2 = object = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            boolean flag = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    boolean flag2;
                    Object object3 = (LiteBansModule_82)closeable;
                    boolean flag3 = false;
                    LiteBansModule_82 ch3 = ch2;
                    boolean flag4 = false;
                    ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(ch3.c((CharSequence)"SELECT NOW() CommandExitException now"));
                    resultSet.next();
                    Timestamp timestamp = resultSet.getTimestamp("now");
                    Object object4 = configService;
                    Object object5 = "AsyncBackgroundTask_22: " + timestamp.getTime();
                    boolean flag5 = false;
                    ((PluginModule)object4).BaseCoreGenericHandler.getLogger().info((String)object5);
                    object4 = configService;
                    object5 = "LiteBansModule_194: " + o2.BaseCoreGenericHandler(timestamp.getTime(), true) + " +" + o2.BaseCoreGenericHandler(true);
                    flag5 = false;
                    ((PluginModule)object4).BaseCoreGenericHandler.getLogger().info((String)object5);
                    ObjectUtilities.BaseCoreGenericHandler(plugin);
                    object5 = object4 = new AltsHandler(plugin, "", "", "");
                    flag5 = false;
                    LiteBansModule_297 iA2 = ch3.c("[CONSOLE]");
                    ObjectUtilities.BaseCoreGenericHandler(iA2);
                    Object object6 = iA2;
                    String string = ((LiteBansModule_297)object6).LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    Object object7 = ((AltsHandler)object5).BaseCoreGenericHandler(ch3, (LiteBansModule_297)object6, new LiteBansModule_206(string, ch3, null, false, 0, 28, null).i());
                    if (!(!StringUtilities.BaseCoreGenericHandler((CharSequence)object7, (CharSequence)"))", false, 2, null))) {
                        boolean flag6 = false;
                        CharSequence charSequence = object7;
                        throw new IllegalArgumentException(((Object)charSequence).toString());
                    }
                    ch3.BaseCoreGenericHandler(((LiteBansModule_297)object6).LiteBansModule_31(), ((AltsHandler)object4).c(), BanHandler.LiteBansModule_240, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), false, 1);
                    ch3.BaseCoreGenericHandler(((LiteBansModule_297)object6).LiteBansModule_31(), ((AltsHandler)object4).c(), BanHandler.LiteBansModule_240, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), true, 1);
                    object5 = "*";
                    String string2 = LiteBansModule_181.LiteBansModule_194.c("global");
                    if (!LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string2)) {
                        boolean flag7 = false;
                        String string3 = string2 + ' ' + LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                        throw new IllegalArgumentException(string3.toString());
                    }
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)string2, object5) && string2.charAt(0) == ((String)object5).charAt(0))) {
                        boolean flag8 = false;
                        String string4 = string2 + ' ' + (String)object5;
                        throw new IllegalArgumentException(string4.toString());
                    }
                    LiteCommand command = plugin.z().BaseCoreGenericHandler("ban");
                    ObjectUtilities.BaseCoreGenericHandler(command);
                    object6 = command;
                    object7 = MessageHandler.BaseCoreGenericHandler;
                    Object object8 = plugin.HoverTextFormatter();
                    boolean bl9 = false;
                    try {
                        ((ChatFormatter)object7).LiteBansModule_31().set(object8);
                        flag2 = false;
                        String[] args = new String[]{"test", "server:*"};
                        object6.BaseCoreGenericHandler(plugin.HoverTextFormatter(), args);
                    }
                    finally {
                        ((ChatFormatter)object7).LiteBansModule_31().remove();
                    }
                    LiteBansModule_297 iA3 = ch3.c("test");
                    ObjectUtilities.BaseCoreGenericHandler(iA3);
                    object7 = iA3.LiteBansModule_31();
                    object8 = AllHandler_3.BaseCoreGenericHandler(ch3, (String)object7, null, BanHandler.LiteBansModule_240, (String)object5, false, false, 48, null);
                    if (!(object8 != null && ObjectUtilities.BaseCoreGenericHandler((Object)((SilentHandler)object8).m(), object5))) {
                        flag2 = false;
                        String string5 = String.valueOf(object8);
                        throw new IllegalArgumentException(string5.toString());
                    }
                    if (plugin.AsyncBackgroundTask_22() == 0 && !(!ObjectUtilities.BaseCoreGenericHandler(plugin.LiteBansModule_31().getClass(), LiteBansModule_367.class))) {
                        String string6 = "Failed ";
                        throw new IllegalArgumentException(string6.toString());
                    }
                    PluginModule module = configService;
                    String string7 = "" + plugin.HoverTextFormatter().c();
                    boolean bl10 = false;
                    module.BaseCoreGenericHandler.getLogger().info(string7);
                    object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break block18;
                throw sQLException;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void LiteBansModule_31(PlatformPlugin plugin, ConfigService configService) {
        try {
            boolean flag;
            PluginModule module;
            Object object;
            Object object2;
            block16: {
                LiteBansModule_158 ec_02 = plugin.i();
                ObjectUtilities.LiteBansModule_31(ec_02, "");
                DefaultHandler e12 = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                object2 = e12.c();
                object = e12.LiteBansModule_31();
                DatabaseMonitorService w2 = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
                module = w2;
                flag = false;
                try {
                    LiteBansModule_82 ch2 = ((DatabaseMonitorService)module).LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (LiteBansModule_82)closeable;
                        boolean flag2 = false;
                        LiteBansModule_82 ch3 = ch2;
                        boolean flag3 = false;
                        if (ch3.BaseCoreGenericHandler()) {
                            CharSequence charSequence;
                            BansHandler_2 kL2 = BansHandler_2.g;
                            Object object4 = "uuid";
                            int n = 0;
                            ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + object4 + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)1))));
                            object4 = resultSet;
                            n = 1;
                            boolean flag4 = false;
                            if (object4.next()) {
                                String string;
                                Object object5 = object4;
                                boolean flag5 = false;
                                try {
                                    string = object5.getString(n);
                                }
                                catch (SQLException sQLException) {
                                    string = null;
                                }
                                charSequence = string;
                            } else {
                                charSequence = kL2 = null;
                            }
                            if (0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler((String)((Object)kL2))) {
                                object4 = UUID.fromString(0123456789abcdefmvzabcdefmvzHandler.BaseCoreGenericHandler.g((String)((Object)kL2)));
                                LiteBansModule_158 ec_03 = plugin.i();
                                ObjectUtilities.LiteBansModule_31(ec_03, "");
                                BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_03;
                                ObjectUtilities.BaseCoreGenericHandler(object4);
                                DefaultHandler.BaseCoreGenericHandler(e12, ao_02.BaseCoreGenericHandler((UUID)object4), "test", null, 4, null);
                                e12.BaseCoreGenericHandler(object4);
                            }
                        }
                        object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (((DatabaseMonitorService)module).LiteBansModule_31(sQLException)) break block16;
                    throw sQLException;
                }
            }
            module = configService;
            flag = false;
            if (((ConfigService)module).g()) {
                PluginModule n_03 = module;
                boolean flag6 = false;
                ((ConfigService)n_03).BaseCoreGenericHandler((Object)("" + object2 + object + '\n'));
            }
        }
        catch (LinkageError linkageError) {
            ConfigService.BaseCoreGenericHandler(configService, linkageError, 0, 2, null);
        }
    }

    public static final /* synthetic */ int n() {
        return AsyncBackgroundTask_22;
    }

    public static final /* synthetic */ void c(int n) {
        AsyncBackgroundTask_22 = n;
    }

    public static final /* synthetic */ AtomicBoolean e() {
        return z;
    }

    public static final /* synthetic */ AtomicBoolean A() {
        return g;
    }

    static {
        r = 40000;
        BroadcastService = "geoip";
        i = 8;
        ConfigService.CommandThrottleService();
        GnuSparseMapHandler = new MariaDBDriverHandler(null);
        z = new AtomicBoolean();
        g = new AtomicBoolean();
    }

    private static final void CommandThrottleService() {
        DatabaseMonitorService = new String[]{"", "", "", "", "0xAAA", "0xAAA ", "geoip.unavailable", "lockdown.yml", "lockdown.json", "reason", "scope", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "lockdown.yml", "lockdown.json", "reason", "scope", ".. + ", "Error 0x", "config.yml", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "SnakeYAML", "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f", "", "templates.yml", "templates.yml", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes BaseCoreGenericHandler bad weight: ", "Loaded ", " template groups from templates.yml!", "Failed to hook into ", "Try using the latest ServerListPlus development ", "geoip", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "This is LiteBans version ", ", NOT version ", "", "", "This is LiteBans version ", ", NOT version ", "config.yml", "geoip", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "LiteBansModule_21 java.lang.Thread.run(", "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor$Worker.run(", "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor.runWorker(", "LiteBansModule_21 sun.reflect.NativeConstructorAccessorImpl.newInstance", "LiteBansModule_21 sun.reflect.DelegatingConstructorAccessorImpl.newInstance(", "LiteBansModule_21 java.lang.reflect.Constructor.newInstance(", "", "[!!] Could not load ", " + ", "org.bukkit.configuration.InvalidConfigurationException: ", "while scanning HikariDataSource anchor", "while scanning BaseCoreGenericHandler simple key", "while scanning for the next token", "while parsing BaseCoreGenericHandler block mapping", "while parsing BaseCoreGenericHandler block collection", "", "", "\\AsyncBackgroundTask_22(TAB)", "TAB", "[!!] Configuration error found: ", "[!!] LiteBans will use the default ", " until errors have been ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "ServerListPlus", " is not enabled yet!", "true", "false", "Player[name=", "].getAddress() returned null on ", "mute", "muteip", "warn", "lockdown", "YYYY", "yyyy", "Invalid date format: \"", "\". Using default date format \"", "\" + ", "Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html", "UTC", "yyyy-MM-LiteBansModule_118", "AuthMe", "messages.yml", "messages.yml", "locale", "system", "system", "Using configured locale (", "Supported locales: ", "Note: If the configured locale is unrecognized, the system default locale is ", "Using system locale (", "[!!] Could not save messages + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "SELECT NOW() CommandExitException now", "now", "AsyncBackgroundTask_22: ", "LiteBansModule_194: ", " +", "", "", "", "[CONSOLE]", "))", "*", "global", "ban", "test", "server:*", "test", "Failed ", "", "", "uuid", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "", "test"};
    }
}

