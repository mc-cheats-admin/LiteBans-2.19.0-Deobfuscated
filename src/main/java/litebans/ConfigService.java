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
    private final LiteBansModule_103 AsyncBackgroundTask_5 = new LiteBansModule_103(() -> ConfigService.BaseCoreGenericHandler(this));
    private final LiteBansModule_162 LiteBansModule_195 = ProxyConnection.BaseCoreGenericHandler(() -> ConfigService.c(this));
    private Object CommandThrottleService;
    private GeoIPLookupService_2 B;
    private boolean q;
    private boolean e = true;
    private int ServerSyncService;
    private final LiteBansModule_139 BanHandler_2 = new LiteBansModule_139(false, false, 3, null);
    private LiteBansModule_15 PunishmentTableService;
    private long LiteBansModule_403 = Long.MAX_VALUE;
    private byte LiteBansModule_435;
    private String LiteBansModule_241;
    private LiteBansModule_325 D = new LiteBansModule_308();
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
        for (Integer n3 : integerArray) {
            int n4 = ((Number)n3).intValue();
            n = n2;
            int n5 = this.LiteBansModule_435 ^ n4;
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

    public final DiscordWebhookClient LiteBansModule_195() {
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

    public final LiteBansModule_411 Utf8Handler_2() {
        LiteBansModule_162 eE2 = this.AsyncBackgroundTask_5;
        return (LiteBansModule_411)eE2.BaseCoreGenericHandler();
    }

    public final boolean HoverTextFormatter() {
        LiteBansModule_162 eE2 = this.LiteBansModule_195;
        return (Boolean)eE2.BaseCoreGenericHandler();
    }

    public final Object B() {
        return this.CommandThrottleService;
    }

    public final GeoIPLookupService_2 LiteBansModule_241() {
        return this.B;
    }

    public final void BaseCoreGenericHandler(@Nullable GeoIPLookupService_2 fv_02) {
        this.B = fv_02;
    }

    public final boolean LiteBansModule_435() {
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

    public final LiteBansModule_139 r() {
        return this.BanHandler_2;
    }

    public final LiteBansModule_15 DatabaseMonitorService() {
        return this.PunishmentTableService;
    }

    public final void BaseCoreGenericHandler(@Nullable LiteBansModule_15 aK2) {
        this.PunishmentTableService = aK2;
    }

    public final long q() {
        return this.LiteBansModule_403;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.LiteBansModule_403 = l3;
    }

    public final byte LiteBansModule_403() {
        return this.LiteBansModule_435;
    }

    public final void c(byte by2) {
        this.LiteBansModule_435 = by2;
    }

    public final String GnuSparseMapHandler() {
        return this.LiteBansModule_241;
    }

    public final void c(@Nullable String string) {
        this.LiteBansModule_241 = string;
    }

    public final LiteBansModule_325 i() {
        return this.D;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_325 iX2) {
        this.D = iX2;
    }

    public final boolean BaseCoreGenericHandler(int n) {
        return this.LiteBansModule_31 >= n;
    }

    public final void BaseCoreGenericHandler(int n, @Nullable Object targetObj) {
        if (this.plugin(n)) {
            this.plugin(targetObj);
        }
    }

    public final void BaseCoreGenericHandler(@Nullable Object targetObj) {
        if (targetObj instanceof Throwable) {
            ((Throwable)targetObj).printStackTrace();
        } else {
            PluginModule module = this;
            String string = String.valueOf(targetObj);
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
                this.plugin(charSequence);
            }
            return LiteBansModule_73.LiteBansModule_31(charSequenceArray2.length);
        }
        return -1;
    }

    public final void BaseCoreGenericHandler(@Nullable Object targetObj, int n) {
        if (this.g()) {
            if (targetObj instanceof Throwable) {
                PluginModule module = this;
                String string = "0xAAA";
                module.BaseCoreGenericHandler.getLogger().warning(string);
                ((Throwable)targetObj).printStackTrace();
            } else {
                PluginModule n_03 = this;
                String string = "0xAAA " + targetObj;
                n_03.BaseCoreGenericHandler.getLogger().warning(string);
                Thread.dumpStack();
            }
        } else if (n == 1 && targetObj instanceof Throwable) {
            Object contextObj = targetObj.getClass().getName();
            for (int i = 0; i < contextObj.length(); ++i) {
                char c;
                char c10 = c = contextObj.charAt(i);
                int n3 = n2;
                int n4 = c10 ^ 0x17;
                n2 = n3 + n4;
            }
            int n5 = n2;
            if (n5 == 3140) {
                contextObj = new LiteBansModule_325(0L, 1, null);
                this.LiteBansModule_435 = (byte)(((LiteBansModule_325)contextObj).BaseCoreGenericHandler(2) + 1);
                this.LiteBansModule_403 = (long)((LiteBansModule_325)contextObj).BaseCoreGenericHandler(23) + 1L;
            }
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(ConfigService configService, Object targetObj, int n, int n2, Object contextObj) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        configService.BaseCoreGenericHandler(targetObj, n);
    }

    public final String LiteBansModule_31(@Nullable String string) {
        Object targetObj = this.B;
        if (targetObj == null || (targetObj = ((GeoIPLookupService_2)targetObj).LiteBansModule_31(string)) == null) {
            targetObj = "geoip.unavailable";
        }
        return targetObj;
    }

    @Override
    public void c() {
        this.c = 0;
        this.plugin.m();
        g.set(false);
        ConfigService configService = this;
        if (configService.LiteBansModule_195().D()) {
            try {
                BroadcastService o2 = (BroadcastService)configService.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
                Object contextObj = configService.BaseCoreGenericHandler.getDataFolder();
                String string = "lockdown.yml";
                File file = new File((File)contextObj, string);
                if (!file.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                    contextObj = configService.BaseCoreGenericHandler.getDataFolder();
                    string = "lockdown.json";
                    flag2 = false;
                    file = new File((File)contextObj, string);
                }
                LitebansLockdownBypassHandler gG2 = o2.e();
                if ((gG2 != null ? gG2.c() : null) == null) {
                    targetObj = LiteBansModule_113.LiteBansModule_31(file);
                } else {
                    contextObj = configService.BaseCoreGenericHandler.BaseCoreGenericHandler(file).g();
                    LitebansLockdownBypassHandler gG3 = o2.e();
                    LitebansLockdownBypassHandler gG4 = o2.e();
                    targetObj = contextObj.LiteBansModule_31("reason", gG3 != null ? gG3.c() : null).LiteBansModule_31("scope", gG4 != null ? gG4.BaseCoreGenericHandler() : null).LiteBansModule_241();
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
            module.BaseCoreGenericHandler.getLogger().warning(string2);
            return;
        }
    }

    public final Void BaseCoreGenericHandler(byte by2, boolean flag) {
        if (flag) {
            ConfigService configService = this;
            if (configService.g()) {
                ConfigService q_03 = configService;
                q_03.BaseCoreGenericHandler((Object)("" + '!' + by2 + '!'));
            }
        }
        throw new RuntimeException("Error 0x" + by2);
    }

    @Override
    public void BaseCoreGenericHandler() {
        LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler(true);
        LiteBansModule_210.LiteBansModule_31.BaseCoreGenericHandler(this.plugin);
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
                Logger logger = ((ConfigService)targetObj).BaseCoreGenericHandler.getLogger();
        Throwable throwable = ((ConfigService)targetObj).BaseCoreGenericHandler.LiteBansModule_241().LiteBansModule_31();
        if (throwable != null) {
            Throwable throwable2 = throwable;
            ((ConfigService)targetObj).BaseCoreGenericHandler("config", throwable2);
            if (((ConfigService)targetObj).BaseCoreGenericHandler.LiteBansModule_241().c().exists()) {
                logger.severe("[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/");
            } else {
                logger.severe("[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"" + ((ConfigService)targetObj).BaseCoreGenericHandler.LiteBansModule_241().c().getAbsolutePath() + "\")");
            }
            if (((ConfigService)targetObj).BaseCoreGenericHandler(2)) {
                ((ConfigService)targetObj).BaseCoreGenericHandler(throwable2);
            }
        }
        targetObj = new DiscordWebhookClient(this.plugin, null, 2, null);
        this.plugin((DiscordWebhookClient)targetObj);
    }

    private final void ServerSyncService() {
        if (YamlConfigProvider.AsyncBackgroundTask_5() == null) {
            DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            JarHandler jP2 = new JarHandler("SnakeYAML", LiteBansModule_124.class.getName(), "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f");
            Object targetObj = litebans.DatabaseMonitorService.BaseCoreGenericHandler(w2, jP2, false, false, 2, null);
            ObjectUtilities.LiteBansModule_31(targetObj, "");
            Class clazz = (Class)targetObj;
            this.plugin.BaseCoreGenericHandler(new LiteBansModule_187(this, clazz));
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
                v2.LiteBansModule_31(this.LiteBansModule_195().ElementsHandler());
                ObjectUtilities.BaseCoreGenericHandler(v1);
                v3 = new TemplatesYmlHandler(v1, null, false, 6, null);
                v4 = this;
                v5 = v6 = v3;
                try {
                    block112: {
                        v3.c().BaseCoreGenericHandler("templates.yml");
                        v7 = v3.c().BaseCoreGenericHandler(v3.LiteBansModule_31()).g();
                        v7.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("templates.yml", null));
                        v3.BaseCoreGenericHandler(v7);
                        v3.AsyncBackgroundTask_5().clear();
                        v8 = v3;
                        v0 = v8.BaseCoreGenericHandler();
                        ObjectUtilities.BaseCoreGenericHandler(v0);
                        v9 = v0;
                        v10 = BanHandler.LiteBansModule_403.BaseCoreGenericHandler();
                        v11 = v10;
                        v12 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v10, 10));
                        for (Object v13 : v11) {
                            v14 = (BanHandler)v13;
                            v15 = v12;
                            v15.add(LiteBansModule_373.BaseCoreGenericHandler(v14, v9.BaseCoreGenericHandler(v14 + "-templates")));
                        }
                        v16 = (List)v12;
                        for (LiteBansModule_356 v17 : v16) {
                            v12 = (LiteBansModule_392)v17.e();
                            if (v12 == null) continue;
                            v18 = v12.BaseCoreGenericHandler(false);
                            v19 = v8.AsyncBackgroundTask_5();
                            ObjectUtilities.BaseCoreGenericHandler(v18);
                            v13 = v18;
                            v20 = v13;
                            v21 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v13, 10));
                            v22 = v20.iterator();
                            while (v22.hasNext()) {
                                block105: {
                                    block104: {
                                        v23 = v22.next();
                                        v24 = (String)v23;
                                        v15 = v21;
                                        v25 = v8;
                                        v26 = v27;
                                        v27 = LiteBansModule_284.BaseCoreGenericHandler((byte)(v26 + 1));
                                        v28 = (BanHandler)v17.LiteBansModule_31();
                                        v1 = v17.e();
                                        ObjectUtilities.BaseCoreGenericHandler(v1);
                                        v29 = ((LiteBansModule_392)v1).BaseCoreGenericHandler((String)v24);
                                        ObjectUtilities.BaseCoreGenericHandler(v24);
                                        v30 = v24;
                                        if (!(v29 != null)) {
                                            v31 = "Empty template: '" + (String)v30 + '\'';
                                            throw new IllegalArgumentException(v31.toString());
                                        }
                                        if (!(StringUtilities.c((CharSequence)v30, ' ', false, 2, null) == false && StringUtilities.c((CharSequence)v30, '.', false, 2, null) == false)) {
                                            v32 = "Template name '" + (String)v30 + "' cannot include dots or spaces! Use dashes or underscores instead + ";
                                            throw new IllegalArgumentException(v32.toString());
                                        }
                                        v33 = "";
                                        if (!(v29 != null)) {
                                            v34 = v28 + " template '" + (String)v33 + "' has invalid section + ";
                                            throw new IllegalArgumentException(v34.toString());
                                        }
                                        v35 = v29.BaseCoreGenericHandler(false);
                                        v36 = CollectionUtilities.e();
                                        v37 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(v35);
                                        v38   = (Iterable)v35;
                                        for (T v39 : v38  ) {
                                            block100: {
                                                block103: {
                                                    block101: {
                                                        block98: {
                                                            block99: {
                                                                block102: {
                                                                    v40 = (String)v39;
                                                                    v41 = v40;
                                                                    if (v41 == null) continue;
                                                                    switch (v41.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (v41.equals("duration")) break;
                                                                            break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!v41.equals("broadcast")) {
                                                                                break;
                                                                            }
                                                                            break block98;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!v41.equals("reason")) {
                                                                                break;
                                                                            }
                                                                            break block99;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!v41.equals("flags")) {
                                                                                break;
                                                                            }
                                                                            break block100;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!v41.equals("permission")) {
                                                                                break;
                                                                            }
                                                                            break block101;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!v41.equals("message")) {
                                                                                break;
                                                                            }
                                                                            break block102;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!v41.equals("actions")) {
                                                                                break;
                                                                            }
                                                                            break block103;
                                                                        }
                                                                    }
                                                                    v42 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v29.e((String)v40), 0.0, 2, null);
                                                                    break;
                                                                }
                                                                v43 = v29.e((String)v40);
                                                                break;
                                                            }
                                                            v44 = v29.e((String)v40);
                                                            break;
                                                        }
                                                        v45 = v29.e((String)v40);
                                                        break;
                                                    }
                                                    v46 = v29.e((String)v40);
                                                    break;
                                                }
                                                v36 = v25.BaseCoreGenericHandler(v29, (String)v40);
                                                break;
                                            }
                                            v37 = v25.BaseCoreGenericHandler(v29, (String)v40);
                                                                                    }
                                        v47 = LiteBansModule_338.BaseCoreGenericHandler[v28.ordinal()] == 1 ? new LiteBansModule_67((String)v43, v44, (String)v45, (String)v46, v36, (List)v37) : (LiteBansModule_67)new LiteBansModule_106(v42, (String)v43, v44, (String)v45, (String)v46, v36, (List)v37);
                                        v48 = v25;
                                        v2 = v29.BaseCoreGenericHandler("ladder");
                                        if (v2 != null) break block104;
                                        v3 = CollectionUtilities.e();
                                        break block105;
                                    }
                                    v35 = v2;
                                    v43 = v35.BaseCoreGenericHandler(false);
                                    v45 = v43;
                                    v46 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v43, 10));
                                    v37 = v45.iterator();
                                    while (v37.hasNext()) {
                                        v38   = v37.next();
                                        v49 = (String)v38  ;
                                        v50 = v46;
                                        v50.add(v35.BaseCoreGenericHandler(v49));
                                    }
                                    v43 = (List)v46;
                                    v45 = v43;
                                    v46 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v43, 10));
                                    v37 = v45.iterator();
                                    while (v37.hasNext()) {
                                        v38   = v37.next();
                                        v51 = (LiteBansModule_392)v38  ;
                                        v50 = v46;
                                        v40 = v48;
                                        if (!(v51 != null)) {
                                            v52 = v28 + " template '" + (String)v30 + "' has invalid section + ";
                                            throw new IllegalArgumentException(v52.toString());
                                        }
                                        v53   = v51.BaseCoreGenericHandler(false);
                                        v54   = CollectionUtilities.e();
                                        v55 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(v53  );
                                        v56 = v53  ;
                                        for (T v57 : v56) {
                                            block108: {
                                                block111: {
                                                    block109: {
                                                        block106: {
                                                            block107: {
                                                                block110: {
                                                                    v58   = (String)v57;
                                                                    v59 = v58  ;
                                                                    if (v59 == null) continue;
                                                                    switch (v59.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (v59.equals("duration")) break;
                                                                            break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!v59.equals("broadcast")) {
                                                                                break;
                                                                            }
                                                                            break block106;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!v59.equals("reason")) {
                                                                                break;
                                                                            }
                                                                            break block107;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!v59.equals("flags")) {
                                                                                break;
                                                                            }
                                                                            break block108;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!v59.equals("permission")) {
                                                                                break;
                                                                            }
                                                                            break block109;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!v59.equals("message")) {
                                                                                break;
                                                                            }
                                                                            break block110;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!v59.equals("actions")) {
                                                                                break;
                                                                            }
                                                                            break block111;
                                                                        }
                                                                    }
                                                                    v41 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v51.e(v58  ), 0.0, 2, null);
                                                                    break;
                                                                }
                                                                v60 = v51.e(v58  );
                                                                break;
                                                            }
                                                            v61 = v51.e(v58  );
                                                            break;
                                                        }
                                                        v62 = v51.e(v58  );
                                                        break;
                                                    }
                                                    v63 = v51.e(v58  );
                                                    break;
                                                }
                                                v54   = v40.BaseCoreGenericHandler(v51, v58  );
                                                break;
                                            }
                                            v55 = v40.BaseCoreGenericHandler(v51, v58  );
                                                                                    }
                                        v50.add(LiteBansModule_338.BaseCoreGenericHandler[v28.ordinal()] == 1 ? new LiteBansModule_67((String)v60, (String)v61, v62, (String)v63, (List)v54  , (List)v55) : (LiteBansModule_67)new LiteBansModule_106((Long)v41, (String)v60, (String)v61, v62, (String)v63, (List)v54  , (List)v55));
                                    }
                                    v3 = CollectionUtilities.c((Iterable)((List)v46));
                                }
                                v33 = v3;
                                v64 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v29.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                                v65 = v29.BaseCoreGenericHandler("ip_template", false);
                                v15.add(new LiteBansModule_65(v26, (String)v30, (BanHandler)v28, (LiteBansModule_67)v47, v65, (List)v33, v64, null));
                            }
                            v13 = (List)v21;
                            CollectionUtilities.BaseCoreGenericHandler((Collection)v19, (Iterable)v13);
                        }
                        v8.c().getLogger().info("Loaded " + v8.AsyncBackgroundTask_5().size() + " templates from templates.yml!");
                        v10 = v9.BaseCoreGenericHandler("template-groups");
                        if (v10 == null) break block112;
                        v66 = v10.BaseCoreGenericHandler(false);
                        v4 = v8.e();
                        ObjectUtilities.BaseCoreGenericHandler(v66);
                        v11 = v66;
                        v67 = v4;
                        v15 = v8;
                        v68 = v11;
                        v19 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v11, 10));
                        for (T v69 : v68) {
                            block114: {
                                block113: {
                                    block95: {
                                        v21 = (String)v69;
                                        v70 = v19;
                                        v22 = v8;
                                        v23 = v10.BaseCoreGenericHandler((String)v21);
                                        ObjectUtilities.BaseCoreGenericHandler(v21);
                                        v24 = v21;
                                        v5 = v23;
                                        v25 = v5 != null ? v5.BaseCoreGenericHandler("weights") : null;
                                        if (!(v23 != null)) {
                                            v71 = "Empty template group: '" + (String)v24 + '\'';
                                            throw new IllegalArgumentException(v71.toString());
                                        }
                                        if (!(v25 != null)) {
                                            v72 = "No weights for template group '" + (String)v24 + "'!";
                                            throw new IllegalArgumentException(v72.toString());
                                        }
                                        v73   = BanHandler.values();
                                        v74 = v73  .length;
                                        for (v75 = 0; v75 < v74; ++v75) {
                                            v33 = v76 = v73  [v75];
                                            if (!ObjectUtilities.BaseCoreGenericHandler((Object)(v23.BaseCoreGenericHandler("type", "") != null ? v77.toLowerCase(Locale.ROOT) : null), (Object)v33.toString())) continue;
                                            v6 = v76;
                                            break block95;
                                        }
                                        v6 = v78 = null;
                                    }
                                    if (!(v78 != null && v78 == v78.c())) {
                                        v79 = "Template group '" + (String)v24 + "' type is missing: " + v78;
                                        throw new IllegalArgumentException(v79.toString());
                                    }
                                    v28 = v22;
                                    if (v23.BaseCoreGenericHandler("ladder") != null) break block113;
                                    v7 = CollectionUtilities.e();
                                    break block114;
                                }
                                v76 = v80.BaseCoreGenericHandler(false);
                                v81 = v76;
                                v77 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v76, 10));
                                v82 = v81.iterator();
                                while (v82.hasNext()) {
                                    v45 = v82.next();
                                    v83 = (String)v45;
                                    v84 = v77;
                                    v84.add(v80.BaseCoreGenericHandler(v83));
                                }
                                v76 = (List)v77;
                                v81 = v76;
                                v77 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v76, 10));
                                v82 = v81.iterator();
                                while (v82.hasNext()) {
                                    v45 = v82.next();
                                    v85 = (LiteBansModule_392)v45;
                                    v86 = v77;
                                    v87 = v28;
                                    if (!(v85 != null)) {
                                        v88 = v78 + " template '" + (String)v24 + "' has invalid section + ";
                                        throw new IllegalArgumentException(v88.toString());
                                    }
                                    v89 = v85.BaseCoreGenericHandler(false);
                                    v53   = CollectionUtilities.e();
                                    v60 = CollectionUtilities.e();
                                    ObjectUtilities.BaseCoreGenericHandler(v89);
                                    v61 = v89;
                                    v63 = v61.iterator();
                                    while (v63.hasNext()) {
                                        block117: {
                                            block120: {
                                                block118: {
                                                    block115: {
                                                        block116: {
                                                            block119: {
                                                                v54   = v63.next();
                                                                v55 = (String)v54  ;
                                                                v90 = v55;
                                                                if (v90 == null) continue;
                                                                switch (v90.hashCode()) {
                                                                    case -1992012396: {
                                                                        if (v90.equals("duration")) break;
                                                                        break;
                                                                    }
                                                                    case -1618876223: {
                                                                        if (!v90.equals("broadcast")) {
                                                                            break;
                                                                        }
                                                                        break block115;
                                                                    }
                                                                    case -934964668: {
                                                                        if (!v90.equals("reason")) {
                                                                            break;
                                                                        }
                                                                        break block116;
                                                                    }
                                                                    case 97513095: {
                                                                        if (!v90.equals("flags")) {
                                                                            break;
                                                                        }
                                                                        break block117;
                                                                    }
                                                                    case -517618225: {
                                                                        if (!v90.equals("permission")) {
                                                                            break;
                                                                        }
                                                                        break block118;
                                                                    }
                                                                    case 954925063: {
                                                                        if (!v90.equals("message")) {
                                                                            break;
                                                                        }
                                                                        break block119;
                                                                    }
                                                                    case -1161803523: {
                                                                        if (!v90.equals("actions")) {
                                                                            break;
                                                                        }
                                                                        break block120;
                                                                    }
                                                                }
                                                                v91 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v85.e((String)v55), 0.0, 2, null);
                                                                break;
                                                            }
                                                            v92 = v85.e((String)v55);
                                                            break;
                                                        }
                                                        v93 = v85.e((String)v55);
                                                        break;
                                                    }
                                                    v94 = v85.e((String)v55);
                                                    break;
                                                }
                                                v47 = v85.e((String)v55);
                                                break;
                                            }
                                            v53   = v87.BaseCoreGenericHandler(v85, (String)v55);
                                            break;
                                        }
                                        v60 = v87.BaseCoreGenericHandler(v85, (String)v55);
                                                                            }
                                    v86.add(LiteBansModule_338.BaseCoreGenericHandler[v78.ordinal()] == 1 ? new LiteBansModule_67(v92, v93, v94, (String)v47, v53  , (List)v60) : (LiteBansModule_67)new LiteBansModule_106(v91, v92, v93, v94, (String)v47, v53  , (List)v60));
                                }
                                v7 = CollectionUtilities.c((Iterable)((List)v77));
                            }
                            v73   = v7;
                            v95 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, v23.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                            if (!(((Collection)v73  ).isEmpty() == false)) {
                                v96 = "No ladder for template group '" + (String)v24 + "'!";
                                throw new IllegalArgumentException(v96.toString());
                            }
                            v76 = v25.BaseCoreGenericHandler(false);
                            v97 = new LinkedHashMap<K, V>(LiteBansModule_20.c(LiteBansModule_350.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler((Iterable)v76, 10)), 16));
                            v77 = v76;
                            v98 = v77.iterator();
                            while (v98.hasNext()) {
                                v45 = v98.next();
                                v99   = v45;
                                v58   = v45;
                                v100 = (Map)v97;
                                v59 = Float.valueOf((float)v25.AsyncBackgroundTask_5(v99  ));
                                v100.put(v58  , v59);
                            }
                            v76 = (Map)v97;
                            v97 = v76;
                            v77 = new LinkedHashMap<K, V>(LiteBansModule_350.BaseCoreGenericHandler(v76.size()));
                            v98 = v97.entrySet();
                            v101 = v98.iterator();
                            while (v101.hasNext()) {
                                v102 = v101.next();
                                v103 = (Map.Entry)v102;
                                v100 = v77;
                                v104 = v22.BaseCoreGenericHandler(v78, (String)v103.getKey());
                                if (!(v104 != null)) {
                                    v105 = "Template group '" + (String)v24 + "' refers to non-existing " + v78 + " template: '" + (String)v103.getKey() + '\'';
                                    throw new IllegalArgumentException(v105.toString());
                                }
                                if (((Collection)v104.LiteBansModule_31()).isEmpty() == false) {
                                    v22.c().getLogger().warning("Template '" + (String)v103.getKey() + "' belongs to template group '" + (String)v24 + "', its ladder will be ignored. Remove the ladder from '" + (String)v103.getKey() + "' to silence this warning + ");
                                }
                                v106 = (Map.Entry)v102;
                                v107 = v104;
                                v108 = v100;
                                v47 = v106.getValue();
                                v108.put(v107, v47);
                            }
                            v30 = v77;
                            if (!(v30.isEmpty() == false)) {
                                v109 = "No weights for template group '" + (String)v24 + "'!";
                                throw new IllegalArgumentException(v109.toString());
                            }
                            v76 = v30.values();
                            v97 = v76;
                            v77 = new ArrayList<PunishmentService>();
                            v98 = v97.iterator();
                            while (v98.hasNext()) {
                                v110 = v98.next();
                                v111 = ((Number)v110).floatValue();
                                if (!((double)v111 <= 0.0)) continue;
                                v77.add(v110);
                            }
                            v76 = (List)v77;
                            v97 = v76.iterator();
                            while (v97.hasNext()) {
                                v77 = v97.next();
                                v112 = ((Number)v77).floatValue();
                                v22.c().getLogger().warning("Template group '" + (String)v24 + "' includes BaseCoreGenericHandler bad weight: " + v112);
                            }
                            v33 = v30;
                            v77 = v33;
                            v43 = new LinkedHashMap<K, V>(LiteBansModule_350.BaseCoreGenericHandler(v33.size()));
                            v45 = v77.entrySet();
                            v113 = v45.iterator();
                            while (v113.hasNext()) {
                                v114 = v113.next();
                                v115 = (Map.Entry)v114;
                                v116 = v43;
                                v106 = (Map.Entry)v114;
                                v58   = v115.getKey();
                                v100 = v116;
                                v59 = (LiteBansModule_65)v106.getKey();
                                v100.put(v58  , v59);
                            }
                            v33 = v43;
                            v77 = v33;
                            v43 = new LinkedHashMap<K, V>(LiteBansModule_350.BaseCoreGenericHandler(v33.size()));
                            v45 = v77.entrySet();
                            v113 = v45.iterator();
                            while (v113.hasNext()) {
                                v117 = v113.next();
                                v118   = (Map.Entry)v117;
                                v100 = v43;
                                v119 = (Map.Entry)v117;
                                v106 = LiteBansModule_284.AsyncBackgroundTask_5(((LiteBansModule_65)v118  .getKey()).LiteBansModule_195());
                                v120 = v100;
                                v118   = v119.getValue();
                                v120.put(v106, v118  );
                            }
                            v76 = v43;
                            v70.add(new LiteBansModule_175((String)v24, v78, (Map)v30, (Map)v76, (List)v73  , v95));
                        }
                        v70 = (List)v19;
                        v15.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(v67, (Iterable)v70));
                    }
                    if (((Collection)v8.e()).isEmpty() == false) {
                        v8.c().getLogger().info("Loaded " + v8.e().size() + " template groups from templates.yml!");
                    } else {
                        v8.BaseCoreGenericHandler(CollectionUtilities.e());
                    }
                }
                catch (Exception v121) {
                    v3.BaseCoreGenericHandler(v121);
                    v8 = v3;
                    break block96;
                }
                v8 = v6;
            }
            v122 = v8;
            v4.BaseCoreGenericHandler(v122);
            this.plugin(new DiscordWebhookClient_2(v1, null, 2, null).BaseCoreGenericHandler());
            if (v1.LiteBansModule_403()) {
                v3 = this;
                try {
                    v6 = v3.AsyncBackgroundTask_22();
                    if (v6 == null) break block97;
                    v3.CommandThrottleService = v5 = new NullHandler_8(v3.BaseCoreGenericHandler);
                    if (!OrgBukkitBlockHandler.c()) {
                        v5.BaseCoreGenericHandler(v6);
                    }
                    break block97;
                }
                catch (Throwable v123) {
                    v5 = (PluginModule)v3;
                    v124 = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)"Failed to hook into ServerListPlus + ", (CharSequence)"Try using the latest ServerListPlus development build + ");
                    v8 = v5.BaseCoreGenericHandler.getLogger();
                    v8.warning(v124.toString());
                    if (v3.BaseCoreGenericHandler(1)) {
                        v123.printStackTrace();
                    }
                    break block97;
                }
            }
            v1.c((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.ConfigService ), ()V)((ConfigService)this));
        }
        v3 = this;
        v6 = v3.LiteBansModule_195();
        if (v6.W()) {
            v5 = v3.BaseCoreGenericHandler.getDataFolder();
            v125 = "geoip";
            v8 = LiteBansModule_113.c(new File((File)v5, v125));
            v3.BaseCoreGenericHandler.LiteBansModule_31(new AsyncBackgroundTask_4((ConfigService)v3, (File)v8, (DiscordWebhookClient)v6));
        }
        try {
            this.q = true;
            v3 = this;
            v6 = (BroadcastService)v3.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
            v5 = v3.BaseCoreGenericHandler.getDataFolder();
            v126 = "lockdown.yml";
            v8 = new File((File)v5, v126);
            if (!v8.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                v5 = v3.BaseCoreGenericHandler.getDataFolder();
                v126 = "lockdown.json";
                v8 = new File((File)v5, v126);
            }
            if (v8.exists()) {
                v5 = v3.BaseCoreGenericHandler.BaseCoreGenericHandler((File)v8).g();
                v126 = v5.BaseCoreGenericHandler("scope", "*");
                v127 = v5.BaseCoreGenericHandler("reason", "");
                if (v3.LiteBansModule_195().D()) {
                    ObjectUtilities.BaseCoreGenericHandler((Object)v127);
                    if (((CharSequence)v127).length() > 0) {
                        v3.BaseCoreGenericHandler.getLogger().info("Applying saved lockdown, reason: \"" + v127 + '\"');
                        ObjectUtilities.BaseCoreGenericHandler((Object)v126);
                        v6.BaseCoreGenericHandler(v126, (CharSequence)v127, true);
                    }
                }
            }
            this.AsyncBackgroundTask_5();
            v3 = this;
            v6 = LiteBansModule_337.c();
            v5 = v3.BaseCoreGenericHandler.e();
            if (!ObjectUtilities.BaseCoreGenericHandler(v6, v5)) {
                v126 = "This is LiteBans version " + (String)v6 + ", NOT version " + (String)v5 + '!';
                v128 = new AsyncBackgroundTask_12((ConfigService)v3, v126);
                v128.run();
                v3.BaseCoreGenericHandler.BaseCoreGenericHandler(v128, 20L);
            }
            if (this.g()) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 140L);
            }
            if (v1.AsyncBackgroundTask_22() == 0) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 300L);
            }
        }
        catch (Throwable v129) {
            this.plugin(v129);
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
            randomID = new LiteBansModule_421(this.plugin);
        }
        Database.setInstance(database);
        Events.setInstance(events);
        PlayerProvider.setInstance(playerProvider);
        RandomID.setInstance(randomID);
    }

    @Override
    public void LiteBansModule_31() {
        this.plugin.BaseCoreGenericHandler("config.yml");
        this.plugin.LiteBansModule_241().LiteBansModule_195();
        this.c = 0;
        this.e();
    }

    public final void BaseCoreGenericHandler(@NotNull Throwable throwable) {
        if (throwable instanceof LiteBansException_9) {
            PluginModule module = this;
            String string = throwable.getMessage();
            ObjectUtilities.BaseCoreGenericHandler((Object)string);
            String string2 = string;
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
        Iterator iterator;
        boolean flag2;
        Collection collection3;
        boolean flag3;
        Iterable iterable;
        Object resultObj = new String[]{System.lineSeparator()};
        List list = StringUtilities.BaseCoreGenericHandler((CharSequence)string, (String[])resultObj, false, 0, 6, null);
        resultObj = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (!(list.size() <= 2 || resultObj != null && ((ConfigService)resultObj).g())) {
            iterable = list;
            flag3 = false;
            contextObj = iterable;
            collection3 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
            flag2 = false;
            iterator = contextObj.iterator();
            while (iterator.hasNext()) {
                targetObj = iterator.next();
                string2 = (String)targetObj;
                Collection collection2 = collection3;
                flag = false;
                collection2.add(this.AsyncBackgroundTask_5(string2));
            }
            list = (List)collection3;
        }
        iterable = list;
        flag3 = false;
        contextObj = iterable;
        collection3 = new ArrayList();
        flag2 = false;
        iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            targetObj = iterator.next();
            string2 = (String)targetObj;
            flag = false;
            boolean flag4 = ((CharSequence)string2).length() > 0;
            if (!flag4) continue;
            collection3.add(targetObj);
        }
        iterable = (List)collection3;
        flag3 = false;
        for (Collection collection3 : iterable) {
            String string3 = (String)((Object)collection3);
            targetObj = this;
            ((PluginModule)targetObj).BaseCoreGenericHandler.getLogger().warning(string3);
        }
    }

    public final String AsyncBackgroundTask_5(@NotNull String string) {
        String string2;
        String string3 = string;
        CharSequence charSequence = string3;
        int n2 = charSequence.length() - 1;
        while (n <= n2) {
            int n3 = !flag3 ? n : n2;
            char c = charSequence.charAt(n3);
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
                String[] args = "[!!] Could not load " + string + " + ";
        ((PluginModule)targetObj).BaseCoreGenericHandler.getLogger().severe((String)args);
        targetObj = "org.bukkit.configuration.InvalidConfigurationException: ";
        Object contextObj = new String[]{(String)targetObj + "while scanning HikariDataSource anchor", (String)targetObj + "while scanning BaseCoreGenericHandler simple key", (String)targetObj + "while scanning for the next token", (String)targetObj + "while parsing BaseCoreGenericHandler block mapping", (String)targetObj + "while parsing BaseCoreGenericHandler block collection", targetObj};
        args = contextObj;
        contextObj = null;
        String string2 = throwable.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        contextObj = string2;
        Object resultObj = args;
        int n2 = ((String[])resultObj).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = resultObj[n];
            contextObj = StringUtilities.BaseCoreGenericHandler((String)contextObj, string4, "", false, 4, null);
        }
        contextObj = StringUtilities.BaseCoreGenericHandler((String)contextObj, "\\AsyncBackgroundTask_22(TAB)", "TAB", false, 4, null);
        resultObj = this;
        String string5 = "[!!] Configuration error found: " + (String)contextObj;
        n = 0;
        resultObj.BaseCoreGenericHandler.getLogger().severe(string5);
        resultObj = this;
        string5 = "[!!] LiteBans will use the default " + string + " until errors have been ";
        n = 0;
        resultObj.BaseCoreGenericHandler.getLogger().severe(string5);
    }

    public final Object AsyncBackgroundTask_22() {
        return this.plugin.i().c("ServerListPlus");
    }

    public final ConfigService BroadcastService() {
        if (!this.q) {
            PluginModule module = this;
            String string = this.plugin.getName() + " is not enabled yet!";
            module.BaseCoreGenericHandler.getLogger().severe(string);
            throw new LiteBansException_2();
        }
        return this;
    }

    public final CharSequence LiteBansModule_31(@Nullable Object targetObj) {
        if (targetObj == null) {
            return MessageKey.ay;
        }
        String string = targetObj.toString();
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"true")) {
            return MessageKey.ap;
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"false")) {
            return MessageKey.OutHandler;
        }
        if (LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(string)) {
            return MessageKey.LiteBansModule_7;
        }
        return string;
    }

    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull Object targetObj) {
        String string;
        String string2 = string = sender.LiteBansModule_31();
        if (string2 == null && !this.LiteBansModule_195().LiteBansModule_241()) {
            this.plugin.getLogger().warning("Player[name=" + sender.i() + "].getAddress() returned null on " + targetObj.getClass().getSimpleName());
        }
        return string;
    }

    public final boolean e(@NotNull String string) {
        if (!this.LiteBansModule_195().PunishmentTableService() && (StringUtilities.BaseCoreGenericHandler(string, "mute", false, 2, null) || StringUtilities.BaseCoreGenericHandler(string, "muteip", false, 2, null))) {
            return false;
        }
        if (!this.LiteBansModule_195().BanHandler_2() && StringUtilities.BaseCoreGenericHandler(string, "warn", false, 2, null)) {
            return false;
        }
        return this.LiteBansModule_195().ab() || !ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"lockdown");
    }

    public final boolean PunishmentTableService() {
        return this.plugin.AsyncBackgroundTask_22() == 0 && this.HoverTextFormatter() && !this.BanHandler_2.BaseCoreGenericHandler() && this.LiteBansModule_195().ay();
    }

    public final SimpleDateFormat BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        SimpleDateFormat simpleDateFormat;
        try {
            simpleDateFormat = new SimpleDateFormat(StringUtilities.BaseCoreGenericHandler(((Object)charSequence).toString(), "YYYY", "yyyy", false, 4, null), this.z().AsyncBackgroundTask_5());
        }
        catch (Exception exception) {
            if (!(exception instanceof LiteBansException_4)) {
                PluginModule module = this;
                CharSequence charSequence3 = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)("Invalid date format: \"" + charSequence + "\". Using default date format \"" + charSequence2 + "\" + "), (CharSequence)"Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html");
                Logger logger = module.BaseCoreGenericHandler.getLogger();
                logger.warning(((Object)charSequence3).toString());
            }
            simpleDateFormat = new SimpleDateFormat(((Object)charSequence2).toString());
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static /* synthetic */ SimpleDateFormat BaseCoreGenericHandler(ConfigService configService, CharSequence charSequence, CharSequence charSequence2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            charSequence2 = "yyyy-MM-LiteBansModule_119";
        }
        return configService.BaseCoreGenericHandler(charSequence, charSequence2);
    }

    private static final LiteBansModule_411 BaseCoreGenericHandler(ConfigService configService) {
        return new LiteBansModule_411(configService.LiteBansModule_195().ContinueEvictHandler());
    }

    private static final boolean c(ConfigService configService) {
        return configService.BaseCoreGenericHandler.i().BaseCoreGenericHandler("AuthMe");
    }

    private static final void BaseCoreGenericHandler(ConfigService configService, PlatformPlugin plugin) {
        MessagesYmlHandler k22;
        ConfigService q_03;
        block14: {
            MessagesYmlHandler k23;
            ObjectUtilities.BaseCoreGenericHandler(plugin);
            MessagesYmlHandler k24 = new MessagesYmlHandler(plugin, null, 2, null);
            q_03 = configService;
            MessagesYmlHandler k25 = k23 = k24;
            DatabaseService gn_02 = null;
            try {
                k24.BaseCoreGenericHandler().BaseCoreGenericHandler("messages.yml");
                gn_02 = k24.BaseCoreGenericHandler().BaseCoreGenericHandler(k24.g()).g();
                gn_02.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("messages.yml", null));
                k24.BaseCoreGenericHandler(gn_02);
                resultObj = k24;
                DatabaseService gn_03 = ((MessagesYmlHandler)resultObj).c();
                ObjectUtilities.BaseCoreGenericHandler(gn_03);
                contextObj = gn_03;
                targetObj = MessageKey.values();
                for (CharSequence charSequence : targetObj) {
                    MessageKey am2 = charSequence;
                    String string = am2.PluginHookService;
                    CharSequence charSequence2 = am2.ServerOriginHandler;
                    if (charSequence2 == null) continue;
                    String string2 = contextObj.BaseCoreGenericHandler(string, null);
                    if (string2 != null) {
                        am2.BaseCoreGenericHandler(contextObj.BaseCoreGenericHandler(string, ((Object)charSequence2).toString()));
                        if (!(((CharSequence)string2).length() > 0)) continue;
                        contextObj.LiteBansModule_31(string, MessageKey.BaseCoreGenericHandler(am2, string2));
                        continue;
                    }
                    contextObj.LiteBansModule_31(string, StringUtilities.BaseCoreGenericHandler(((Object)charSequence2).toString(), '\u00a7', '&', false, 4, null));
                }
                resultObj = gn_02.BaseCoreGenericHandler("locale", "system");
                if (!ObjectUtilities.BaseCoreGenericHandler(resultObj, (Object)"system")) {
                    Locale locale = k24.LiteBansModule_31();
                    k24.BaseCoreGenericHandler(new Locale((String)resultObj));
                    k24.BaseCoreGenericHandler().getLogger().info("Using configured locale (" + k24.AsyncBackgroundTask_5().getLanguage() + ')');
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)k24.AsyncBackgroundTask_5(), locale)) {
                        contextObj = "Supported locales: " + ArrayUtilities.BaseCoreGenericHandler(Locale.getAvailableLocales(), null, null, null, 0, null, (LiteBansModule_179)LiteBansModule_173.BaseCoreGenericHandler, 31, null);
                        targetObj = k24.BaseCoreGenericHandler().getLogger();
                        CharSequence charSequence = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)"Note: If the configured locale is unrecognized, the system default locale is ", (CharSequence)contextObj);
                        ((Logger)targetObj).info(((Object)charSequence).toString());
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
                    gn_02.LiteBansModule_241();
                }
                catch (Exception exception) {
                    k24.BaseCoreGenericHandler().getLogger().severe("[!!] Could not save messages + ");
                    k24.e().BaseCoreGenericHandler(exception);
                }
            }
            resultObj = k24;
            contextObj = MessageKey.PlayerproviderHandler;
            targetObj = MessageKey.ad;
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)contextObj, (CharSequence)"$bannedPlayer", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)targetObj, (CharSequence)"$bannedPlayer", false, 2, null)) {
                ((MessageKey)contextObj).ServerOriginHandler = ((MessageKey)contextObj).BaseCoreGenericHandler((CharSequence)"$bannedPlayer", (Object)"$mutedPlayer");
                ((MessageKey)targetObj).ServerOriginHandler = ((MessageKey)targetObj).BaseCoreGenericHandler((CharSequence)"$bannedPlayer", (Object)"$warnedPlayer");
            }
            try {
                PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, 0L, false, 2, null);
            }
            catch (Exception exception) {
                if (exception instanceof IllegalFormatException) {
                    CharSequence charSequence;
                    String string = "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21";
                    Logger logger = ((MessagesYmlHandler)resultObj).BaseCoreGenericHandler().getLogger();
                    charSequence = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)("Duration format (\"" + MessageKey.InputHandler + "\") is invalid! (" + exception.getClass().getSimpleName() + ')'), (CharSequence)("Using default format instead (\"" + string + "\") + "));
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
            try {
                Object targetObj = q_03.AsyncBackgroundTask_22();
                if (targetObj != null) {
                    NullHandler_8 z = new NullHandler_8(q_03.BaseCoreGenericHandler);
                    q_03.CommandThrottleService = z;
                    if (!OrgBukkitBlockHandler.c()) {
                        z.BaseCoreGenericHandler(targetObj);
                    }
                }
            }
            catch (Throwable throwable) {
                PluginModule module = q_03;
                CharSequence charSequence = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)"Failed to hook into ", (CharSequence)"Try using the latest ServerListPlus development ");
                Logger logger = module.BaseCoreGenericHandler.getLogger();
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
                Integer n2 = n;
                throw new IllegalArgumentException(((Object)n2).toString());
            }
            Object targetObj = new Class[]{PlatformPlugin.class};
            Class[] classArray = targetObj;
            targetObj = new Object[]{plugin};
            List list = plugin.LiteBansModule_195().BaseCoreGenericHandler(BansHandler.class, classArray, (Object[])targetObj);
            if (!(list.size() > 1)) {
                ObjectUtilities.BaseCoreGenericHandler(list);
                List list2 = list;
                throw new IllegalArgumentException(list2.toString());
            }
            Object contextObj = targetObj = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)contextObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    boolean flag2;
                    Object resultObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5(ch3.c((CharSequence)"SELECT NOW() CommandExitException now"));
                    resultSet.next();
                    Timestamp timestamp = resultSet.getTimestamp("now");
                    Object helperObj = configService;
                    Object tempObj = "AsyncBackgroundTask_22: " + timestamp.getTime();
                    ((PluginModule)helperObj).BaseCoreGenericHandler.getLogger().info((String)tempObj);
                    helperObj = configService;
                    tempObj = "LiteBansModule_195: " + o2.BaseCoreGenericHandler(timestamp.getTime(), true) + " +" + o2.BaseCoreGenericHandler(true);
                    flag5 = false;
                    ((PluginModule)helperObj).BaseCoreGenericHandler.getLogger().info((String)tempObj);
                    ObjectUtilities.BaseCoreGenericHandler(plugin);
                    tempObj = helperObj = new AltsHandler(plugin, "", "", "");
                    flag5 = false;
                    LiteBansModule_298 iA2 = ch3.c("[CONSOLE]");
                    ObjectUtilities.BaseCoreGenericHandler(iA2);
                    Object object6 = iA2;
                    String string = ((LiteBansModule_298)object6).LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    Object object7 = ((AltsHandler)tempObj).BaseCoreGenericHandler(ch3, (LiteBansModule_298)object6, new LiteBansModule_207(string, ch3, null, false, 0, 28, null).i());
                    if (!(!StringUtilities.BaseCoreGenericHandler((CharSequence)object7, (CharSequence)"))", false, 2, null))) {
                        CharSequence charSequence = object7;
                        throw new IllegalArgumentException(((Object)charSequence).toString());
                    }
                    ch3.BaseCoreGenericHandler(((LiteBansModule_298)object6).LiteBansModule_31(), ((AltsHandler)helperObj).c(), BanHandler.LiteBansModule_241, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), false, 1);
                    ch3.BaseCoreGenericHandler(((LiteBansModule_298)object6).LiteBansModule_31(), ((AltsHandler)helperObj).c(), BanHandler.LiteBansModule_241, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), true, 1);
                    tempObj = "*";
                    String string2 = LiteBansModule_182.LiteBansModule_195.c("global");
                    if (!LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(string2)) {
                        String string3 = string2 + ' ' + LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                        throw new IllegalArgumentException(string3.toString());
                    }
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)string2, tempObj) && string2.charAt(0) == ((String)tempObj).charAt(0))) {
                        String string4 = string2 + ' ' + (String)tempObj;
                        throw new IllegalArgumentException(string4.toString());
                    }
                    LiteCommand command = plugin.z().BaseCoreGenericHandler("ban");
                    ObjectUtilities.BaseCoreGenericHandler(command);
                    object6 = command;
                    object7 = MessageHandler.BaseCoreGenericHandler;
                    Object object8 = plugin.HoverTextFormatter();
                    try {
                        ((ChatFormatter)object7).LiteBansModule_31().set(object8);
                        flag2 = false;
                        String[] args = new String[]{"test", "server:*"};
                        object6.BaseCoreGenericHandler(plugin.HoverTextFormatter(), args);
                    }
                    finally {
                        ((ChatFormatter)object7).LiteBansModule_31().remove();
                    }
                    LiteBansModule_298 iA3 = ch3.c("test");
                    ObjectUtilities.BaseCoreGenericHandler(iA3);
                    object7 = iA3.LiteBansModule_31();
                    object8 = AllHandler_3.BaseCoreGenericHandler(ch3, (String)object7, null, BanHandler.LiteBansModule_241, (String)tempObj, false, false, 48, null);
                    if (!(object8 != null && ObjectUtilities.BaseCoreGenericHandler((Object)((SilentHandler)object8).m(), tempObj))) {
                        flag2 = false;
                        String string5 = String.valueOf(object8);
                        throw new IllegalArgumentException(string5.toString());
                    }
                    if (plugin.AsyncBackgroundTask_22() == 0 && !(!ObjectUtilities.BaseCoreGenericHandler(plugin.LiteBansModule_31().getClass(), LiteBansModule_369.class))) {
                        String string6 = "Failed ";
                        throw new IllegalArgumentException(string6.toString());
                    }
                    PluginModule module = configService;
                    String string7 = "" + plugin.HoverTextFormatter().c();
                    module.BaseCoreGenericHandler.getLogger().info(string7);
                    resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) break block18;
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
            block16: {
                LiteBansModule_159 ec_02 = plugin.i();
                ObjectUtilities.LiteBansModule_31(ec_02, "");
                DefaultHandler e12 = ((BungeecordHandler_2)ec_02).LiteBansModule_31();
                contextObj = e12.c();
                targetObj = e12.LiteBansModule_31();
                DatabaseMonitorService w2 = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
                module = w2;
                flag = false;
                try {
                    LiteBansModule_83 ch2 = ((DatabaseMonitorService)module).LiteBansModule_195();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object resultObj = (LiteBansModule_83)closeable;
                        LiteBansModule_83 ch3 = ch2;
                        if (ch3.BaseCoreGenericHandler()) {
                            CharSequence charSequence;
                            BansHandler_2 kL2 = BansHandler_2.g;
                            Object helperObj = "uuid";
                            ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5(ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + helperObj + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)1))));
                            helperObj = resultSet;
                            n = 1;
                            if (helperObj.next()) {
                                String string;
                                Object tempObj = helperObj;
                                try {
                                    string = tempObj.getString(n);
                                }
                                catch (SQLException sQLException) {
                                    string = null;
                                }
                                charSequence = string;
                            } else {
                                charSequence = kL2 = null;
                            }
                            if (LiteBansModule_346.BaseCoreGenericHandler((String)((Object)kL2))) {
                                helperObj = UUID.fromString(LiteBansModule_346.BaseCoreGenericHandler.g((String)((Object)kL2)));
                                LiteBansModule_159 ec_03 = plugin.i();
                                ObjectUtilities.LiteBansModule_31(ec_03, "");
                                BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_03;
                                ObjectUtilities.BaseCoreGenericHandler(helperObj);
                                DefaultHandler.BaseCoreGenericHandler(e12, ao_02.BaseCoreGenericHandler((UUID)helperObj), "test", null, 4, null);
                                e12.BaseCoreGenericHandler(helperObj);
                            }
                        }
                        resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                ((ConfigService)n_03).BaseCoreGenericHandler((Object)("" + contextObj + targetObj + '\n'));
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
        DatabaseMonitorService = new String[]{"", "", "", "", "0xAAA", "0xAAA ", "geoip.unavailable", "lockdown.yml", "lockdown.json", "reason", "scope", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "lockdown.yml", "lockdown.json", "reason", "scope", ".. + ", "Error 0x", "config.yml", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "SnakeYAML", "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f", "", "templates.yml", "templates.yml", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes BaseCoreGenericHandler bad weight: ", "Loaded ", " template groups from templates.yml!", "Failed to hook into ", "Try using the latest ServerListPlus development ", "geoip", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "This is LiteBans version ", ", NOT version ", "", "", "This is LiteBans version ", ", NOT version ", "config.yml", "geoip", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "LiteBansModule_21 java.lang.Thread.run(", "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor$Worker.run(", "LiteBansModule_21 java.util.concurrent.ThreadPoolExecutor.runWorker(", "LiteBansModule_21 sun.reflect.NativeConstructorAccessorImpl.newInstance", "LiteBansModule_21 sun.reflect.DelegatingConstructorAccessorImpl.newInstance(", "LiteBansModule_21 java.lang.reflect.Constructor.newInstance(", "", "[!!] Could not load ", " + ", "org.bukkit.configuration.InvalidConfigurationException: ", "while scanning HikariDataSource anchor", "while scanning BaseCoreGenericHandler simple key", "while scanning for the next token", "while parsing BaseCoreGenericHandler block mapping", "while parsing BaseCoreGenericHandler block collection", "", "", "\\AsyncBackgroundTask_22(TAB)", "TAB", "[!!] Configuration error found: ", "[!!] LiteBans will use the default ", " until errors have been ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "ServerListPlus", " is not enabled yet!", "true", "false", "Player[name=", "].getAddress() returned null on ", "mute", "muteip", "warn", "lockdown", "YYYY", "yyyy", "Invalid date format: \"", "\". Using default date format \"", "\" + ", "Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html", "UTC", "yyyy-MM-LiteBansModule_119", "AuthMe", "messages.yml", "messages.yml", "locale", "system", "system", "Using configured locale (", "Supported locales: ", "Note: If the configured locale is unrecognized, the system default locale is ", "Using system locale (", "[!!] Could not save messages + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%AsyncBackgroundTask_5 %AsyncBackgroundTask_21", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "SELECT NOW() CommandExitException now", "now", "AsyncBackgroundTask_22: ", "LiteBansModule_195: ", " +", "", "", "", "[CONSOLE]", "))", "*", "global", "ban", "test", "server:*", "test", "Failed ", "", "", "uuid", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "", "test"};
    }
