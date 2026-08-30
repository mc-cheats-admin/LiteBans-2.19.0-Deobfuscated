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
        for (Integer n3 : integerArray) {
            int n4 = ((Number)n3).intValue();
            n = n2;
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

    public final void BaseCoreGenericHandler(@Nullable Object object) {
        if (object instanceof Throwable) {
            ((Throwable)object).printStackTrace();
        } else {
            PluginModule module = this;
            String string = String.valueOf(object);
            module.BaseCoreGenericHandler.getLogger().info(string);
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
            return LiteBansModule_72.LiteBansModule_31(charSequenceArray2.length);
        }
        return -1;
    }

    public final void BaseCoreGenericHandler(@Nullable Object object, int n) {
        if (this.g()) {
            if (object instanceof Throwable) {
                PluginModule module = this;
                String string = "0xAAA";
                module.BaseCoreGenericHandler.getLogger().warning(string);
                ((Throwable)object).printStackTrace();
            } else {
                PluginModule n_03 = this;
                String string = "0xAAA " + object;
                n_03.BaseCoreGenericHandler.getLogger().warning(string);
                Thread.dumpStack();
} else if (n == 1 && object instanceof Throwable) {
            Object object2 = object.getClass().getName();
            for (int i = 0; i < object2.length(); ++i) {
                char c;
                char c10 = c = object2.charAt(i);
                int n3 = n2;
                int n4 = c10 ^ 0x17;
                n2 = n3 + n4;
            }
            int n5 = n2;
            if (n5 == 3140) {
                object2 = new LiteBansModule_324(0L, 1, null);
                this.LiteBansModule_433 = (byte)(((LiteBansModule_324)object2).BaseCoreGenericHandler(2) + 1);
                this.LiteBansModule_401 = (long)((LiteBansModule_324)object2).BaseCoreGenericHandler(23) + 1L;
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
        if (configService.LiteBansModule_194().D()) {
            try {
                Object object;
                BroadcastService o2 = (BroadcastService)configService.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
                Object object2 = configService.BaseCoreGenericHandler.getDataFolder();
                String string = "lockdown.yml";
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
            catch (Exception exception) {
                exception.printStackTrace();
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

    public final Void BaseCoreGenericHandler(byte by2, boolean flag) {
        if (flag) {
            ConfigService configService = this;
            if (configService.g()) {
                ConfigService q_03 = configService;
                q_03.BaseCoreGenericHandler((Object)("" + '!' + by2 + '!'));
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
        Logger logger = ((ConfigService)object).BaseCoreGenericHandler.getLogger();
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

    @Override
    public void e() {
{
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
                arg1 = this;
                arg2 = v5 = v3;
                try {
{
                        v3.c().BaseCoreGenericHandler("templates.yml");
                        arg3 = v3.c().BaseCoreGenericHandler(v3.LiteBansModule_31()).g();
                        arg3.BaseCoreGenericHandler(DatabaseService.LiteBansModule_31("templates.yml", null));
                        v3.BaseCoreGenericHandler(arg3);
                        v3.AsyncBackgroundTask_5().clear();
                        arg4 = v3;
                        v0 = arg4.BaseCoreGenericHandler();
                        ObjectUtilities.BaseCoreGenericHandler(v0);
                        arg5 = v0;
                        arg6 = BanHandler.LiteBansModule_401.BaseCoreGenericHandler();
                        arg7 = arg6;
                        arg8 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg6, 10));
                        for (Object arg9 : arg7) {
                            arg10 = (BanHandler)arg9;
                            arg11 = arg8;
                            arg11.add(LiteBansModule_371.BaseCoreGenericHandler(arg10, arg5.BaseCoreGenericHandler(arg10 + "-templates")));
                        }
                        arg12 = (List)arg8;
                        for (LiteBansModule_354 arg13 : arg12) {
                            arg8 = (LiteBansModule_390)arg13.e();
                            if (arg8 == null) continue;
                            arg14 = arg8.BaseCoreGenericHandler(false);
                            arg15 = arg4.AsyncBackgroundTask_5();
                            ObjectUtilities.BaseCoreGenericHandler(arg14);
                            arg9 = arg14;
                            arg16 = arg9;
                            arg17 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(arg9, 10));
                            arg18 = arg16.iterator();
                            while (arg18.hasNext()) {
{
                                        arg19 = arg18.next();
                                        arg20 = (String)arg19;
                                        arg11 = arg17;
                                        arg21 = arg4;
                                        arg22 = arg23;
                                        arg23 = LiteBansModule_283.BaseCoreGenericHandler((byte)(arg22 + 1));
                                        arg24 = (BanHandler)arg13.LiteBansModule_31();
                                        v1 = arg13.e();
                                        ObjectUtilities.BaseCoreGenericHandler(v1);
                                        arg25 = ((LiteBansModule_390)v1).BaseCoreGenericHandler((String)arg20);
                                        ObjectUtilities.BaseCoreGenericHandler(arg20);
                                        arg26 = arg20;
                                        if (!(arg25 != null)) {
                                            arg27 = "Empty template: '" + (String)arg26 + '\'';
                                            throw new IllegalArgumentException(arg27.toString());
                                        }
                                        if (!(StringUtilities.c((CharSequence)arg26, ' ', false, 2, null) == false && StringUtilities.c((CharSequence)arg26, '.', false, 2, null) == false)) {
                                            arg28 = "Template name '" + (String)arg26 + "' cannot include dots or spaces! Use dashes or underscores instead + ";
                                            throw new IllegalArgumentException(arg28.toString());
                                        }
                                        arg29 = "";
                                        if (!(arg25 != null)) {
                                            arg30 = arg24 + " template '" + (String)arg29 + "' has invalid section + ";
                                            throw new IllegalArgumentException(arg30.toString());
                                        }
                                        arg31 = arg25.BaseCoreGenericHandler(false);
                                        arg32 = CollectionUtilities.e();
                                        arg33 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(arg31);
                                        arg34   = (Iterable)arg31;
                                        for (T arg35 : arg34  ) {
{
                                                                    arg36 = (String)arg35;
                                                                    arg37 = arg36;
                                                                    if (arg37 == null) continue;
                                                                    switch (arg37.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (arg37.equals("duration")) break;
                                                                            break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!arg37.equals("broadcast")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!arg37.equals("reason")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!arg37.equals("flags")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!arg37.equals("permission")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!arg37.equals("message")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!arg37.equals("actions")) {
                                                                                break;
                                                                            }
                                                                            break;
}
                                                                    arg38 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg25.e((String)arg36), 0.0, 2, null);
                                                                    break;
                                                                }
                                                                arg39 = arg25.e((String)arg36);
                                                                break;
                                                            }
                                                            arg40 = arg25.e((String)arg36);
                                                            break;
                                                        }
                                                        arg41 = arg25.e((String)arg36);
                                                        break;
                                                    }
                                                    arg42 = arg25.e((String)arg36);
                                                    break;
                                                }
                                                arg32 = arg21.BaseCoreGenericHandler(arg25, (String)arg36);
                                                break;
                                            }
                                            arg33 = arg21.BaseCoreGenericHandler(arg25, (String)arg36);
                                                                                    }
                                        arg43 = LiteBansModule_337.BaseCoreGenericHandler[arg24.ordinal()] == 1 ? new LiteBansModule_66((String)arg39, arg40, (String)arg41, (String)arg42, arg32, (List)arg33) : (LiteBansModule_66)new LiteBansModule_105(arg38, (String)arg39, arg40, (String)arg41, (String)arg42, arg32, (List)arg33);
                                        arg44 = arg21;
                                        v2 = arg25.BaseCoreGenericHandler("ladder");
                                        if (v2 != null) break;
                                        v3 = CollectionUtilities.e();
                                        break;
                                    }
                                    arg31 = v2;
                                    arg39 = arg31.BaseCoreGenericHandler(false);
                                    arg41 = arg39;
                                    arg42 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg39, 10));
                                    arg33 = arg41.iterator();
                                    while (arg33.hasNext()) {
                                        arg34   = arg33.next();
                                        arg45 = (String)arg34  ;
                                        arg46 = arg42;
                                        arg46.add(arg31.BaseCoreGenericHandler(arg45));
                                    }
                                    arg39 = (List)arg42;
                                    arg41 = arg39;
                                    arg42 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg39, 10));
                                    arg33 = arg41.iterator();
                                    while (arg33.hasNext()) {
                                        arg34   = arg33.next();
                                        arg47 = (LiteBansModule_390)arg34  ;
                                        arg46 = arg42;
                                        arg36 = arg44;
                                        if (!(arg47 != null)) {
                                            arg48 = arg24 + " template '" + (String)arg26 + "' has invalid section + ";
                                            throw new IllegalArgumentException(arg48.toString());
                                        }
                                        arg49   = arg47.BaseCoreGenericHandler(false);
                                        arg50   = CollectionUtilities.e();
                                        arg51 = CollectionUtilities.e();
                                        ObjectUtilities.BaseCoreGenericHandler(arg49  );
                                        arg52 = arg49  ;
                                        for (T arg53 : arg52) {
{
                                                                    arg54   = (String)arg53;
                                                                    arg55 = arg54  ;
                                                                    if (arg55 == null) continue;
                                                                    switch (arg55.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (arg55.equals("duration")) break;
                                                                            break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!arg55.equals("broadcast")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!arg55.equals("reason")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!arg55.equals("flags")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!arg55.equals("permission")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!arg55.equals("message")) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!arg55.equals("actions")) {
                                                                                break;
                                                                            }
                                                                            break;
}
                                                                    arg37 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg47.e(arg54  ), 0.0, 2, null);
                                                                    break;
                                                                }
                                                                arg56 = arg47.e(arg54  );
                                                                break;
                                                            }
                                                            arg57 = arg47.e(arg54  );
                                                            break;
                                                        }
                                                        arg58 = arg47.e(arg54  );
                                                        break;
                                                    }
                                                    arg59 = arg47.e(arg54  );
                                                    break;
                                                }
                                                arg50   = arg36.BaseCoreGenericHandler(arg47, arg54  );
                                                break;
                                            }
                                            arg51 = arg36.BaseCoreGenericHandler(arg47, arg54  );
                                                                                    }
                                        arg46.add(LiteBansModule_337.BaseCoreGenericHandler[arg24.ordinal()] == 1 ? new LiteBansModule_66((String)arg56, (String)arg57, arg58, (String)arg59, (List)arg50  , (List)arg51) : (LiteBansModule_66)new LiteBansModule_105((Long)arg37, (String)arg56, (String)arg57, arg58, (String)arg59, (List)arg50  , (List)arg51));
                                    }
                                    v3 = CollectionUtilities.c((Iterable)((List)arg42));
                                }
                                arg29 = v3;
                                arg60 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg25.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                                arg61 = arg25.BaseCoreGenericHandler("ip_template", false);
                                arg11.add(new LiteBansModule_65(arg22, (String)arg26, (BanHandler)arg24, (LiteBansModule_66)arg43, arg61, (List)arg29, arg60, null));
                            }
                            arg9 = (List)arg17;
                            CollectionUtilities.BaseCoreGenericHandler((Collection)arg15, (Iterable)arg9);
                        }
                        arg4.c().getLogger().info("Loaded " + arg4.AsyncBackgroundTask_5().size() + " templates from templates.yml!");
                        arg6 = arg5.BaseCoreGenericHandler("template-groups");
                        if (arg6 == null) break;
                        arg62 = arg6.BaseCoreGenericHandler(false);
                        v4 = arg4.e();
                        ObjectUtilities.BaseCoreGenericHandler(arg62);
                        arg7 = arg62;
                        arg63 = v4;
                        arg11 = arg4;
                        arg64 = arg7;
                        arg15 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(arg7, 10));
                        for (T arg65 : arg64) {
{
                                        arg17 = (String)arg65;
                                        arg66 = arg15;
                                        arg18 = arg4;
                                        arg19 = arg6.BaseCoreGenericHandler((String)arg17);
                                        ObjectUtilities.BaseCoreGenericHandler(arg17);
                                        arg20 = arg17;
                                        v5 = arg19;
                                        arg21 = v5 != null ? v5.BaseCoreGenericHandler("weights") : null;
                                        if (!(arg19 != null)) {
                                            arg67 = "Empty template group: '" + (String)arg20 + '\'';
                                            throw new IllegalArgumentException(arg67.toString());
                                        }
                                        if (!(arg21 != null)) {
                                            arg68 = "No weights for template group '" + (String)arg20 + "'!";
                                            throw new IllegalArgumentException(arg68.toString());
                                        }
                                        arg69   = BanHandler.values();
                                        arg70 = arg69  .length;
                                        for (arg71 = 0; arg71 < arg70; ++arg71) {
                                            arg29 = arg72 = arg69  [arg71];
                                            if (!ObjectUtilities.BaseCoreGenericHandler((Object)(arg19.BaseCoreGenericHandler("type", "") != null ? arg73.toLowerCase(Locale.ROOT) : null), (Object)arg29.toString())) continue;
                                            v6 = arg72;
                                            break;
                                        }
                                        v6 = arg74 = null;
                                    }
                                    if (!(arg74 != null && arg74 == arg74.c())) {
                                        arg75 = "Template group '" + (String)arg20 + "' type is missing: " + arg74;
                                        throw new IllegalArgumentException(arg75.toString());
                                    }
                                    arg24 = arg18;
                                    if (arg19.BaseCoreGenericHandler("ladder") != null) break;
                                    v7 = CollectionUtilities.e();
                                    break;
                                }
                                arg72 = arg76.BaseCoreGenericHandler(false);
                                arg77 = arg72;
                                arg73 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg72, 10));
                                arg78 = arg77.iterator();
                                while (arg78.hasNext()) {
                                    arg41 = arg78.next();
                                    arg79 = (String)arg41;
                                    arg80 = arg73;
                                    arg80.add(arg76.BaseCoreGenericHandler(arg79));
                                }
                                arg72 = (List)arg73;
                                arg77 = arg72;
                                arg73 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg72, 10));
                                arg78 = arg77.iterator();
                                while (arg78.hasNext()) {
                                    arg41 = arg78.next();
                                    arg81 = (LiteBansModule_390)arg41;
                                    arg82 = arg73;
                                    arg83 = arg24;
                                    if (!(arg81 != null)) {
                                        arg84 = arg74 + " template '" + (String)arg20 + "' has invalid section + ";
                                        throw new IllegalArgumentException(arg84.toString());
                                    }
                                    arg85 = arg81.BaseCoreGenericHandler(false);
                                    arg49   = CollectionUtilities.e();
                                    arg56 = CollectionUtilities.e();
                                    ObjectUtilities.BaseCoreGenericHandler(arg85);
                                    arg57 = arg85;
                                    arg59 = arg57.iterator();
                                    while (arg59.hasNext()) {
{
                                                                arg50   = arg59.next();
                                                                arg51 = (String)arg50  ;
                                                                arg86 = arg51;
                                                                if (arg86 == null) continue;
                                                                switch (arg86.hashCode()) {
                                                                    case -1992012396: {
                                                                        if (arg86.equals("duration")) break;
                                                                        break;
                                                                    }
                                                                    case -1618876223: {
                                                                        if (!arg86.equals("broadcast")) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case -934964668: {
                                                                        if (!arg86.equals("reason")) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 97513095: {
                                                                        if (!arg86.equals("flags")) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case -517618225: {
                                                                        if (!arg86.equals("permission")) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 954925063: {
                                                                        if (!arg86.equals("message")) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case -1161803523: {
                                                                        if (!arg86.equals("actions")) {
                                                                            break;
                                                                        }
                                                                        break;
}
                                                                arg87 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg81.e((String)arg51), 0.0, 2, null);
                                                                break;
                                                            }
                                                            arg88 = arg81.e((String)arg51);
                                                            break;
                                                        }
                                                        arg89 = arg81.e((String)arg51);
                                                        break;
                                                    }
                                                    arg90 = arg81.e((String)arg51);
                                                    break;
                                                }
                                                arg43 = arg81.e((String)arg51);
                                                break;
                                            }
                                            arg49   = arg83.BaseCoreGenericHandler(arg81, (String)arg51);
                                            break;
                                        }
                                        arg56 = arg83.BaseCoreGenericHandler(arg81, (String)arg51);
                                                                            }
                                    arg82.add(LiteBansModule_337.BaseCoreGenericHandler[arg74.ordinal()] == 1 ? new LiteBansModule_66(arg88, arg89, arg90, (String)arg43, arg49  , (List)arg56) : (LiteBansModule_66)new LiteBansModule_105(arg87, arg88, arg89, arg90, (String)arg43, arg49  , (List)arg56));
                                }
                                v7 = CollectionUtilities.c((Iterable)((List)arg73));
                            }
                            arg69   = v7;
                            arg91 = (long)PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, arg19.BaseCoreGenericHandler("expire_ladder", "0"), 0.0, 2, null);
                            if (!(((Collection)arg69  ).isEmpty() == false)) {
                                arg92 = "No ladder for template group '" + (String)arg20 + "'!";
                                throw new IllegalArgumentException(arg92.toString());
                            }
                            arg72 = arg21.BaseCoreGenericHandler(false);
                            arg93 = new LinkedHashMap<K, V>(LiteBansModule_20.c(LiteBansModule_348.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg72, 10)), 16));
                            arg73 = arg72;
                            arg94 = arg73.iterator();
                            while (arg94.hasNext()) {
                                arg41 = arg94.next();
                                arg95   = arg41;
                                arg54   = arg41;
                                arg96 = (Map)arg93;
                                arg55 = Float.valueOf((float)arg21.AsyncBackgroundTask_5(arg95  ));
                                arg96.put(arg54  , arg55);
                            }
                            arg72 = (Map)arg93;
                            arg93 = arg72;
                            arg73 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(arg72.size()));
                            arg94 = arg93.entrySet();
                            arg97 = arg94.iterator();
                            while (arg97.hasNext()) {
                                arg98 = arg97.next();
                                arg99 = (Map.Entry)arg98;
                                arg96 = arg73;
                                arg100 = arg18.BaseCoreGenericHandler(arg74, (String)arg99.getKey());
                                if (!(arg100 != null)) {
                                    arg101 = "Template group '" + (String)arg20 + "' refers to non-existing " + arg74 + " template: '" + (String)arg99.getKey() + '\'';
                                    throw new IllegalArgumentException(arg101.toString());
                                }
                                if (((Collection)arg100.LiteBansModule_31()).isEmpty() == false) {
                                    arg18.c().getLogger().warning("Template '" + (String)arg99.getKey() + "' belongs to template group '" + (String)arg20 + "', its ladder will be ignored. Remove the ladder from '" + (String)arg99.getKey() + "' to silence this warning + ");
                                }
                                arg102 = (Map.Entry)arg98;
                                arg103 = arg100;
                                arg104 = arg96;
                                arg43 = arg102.getValue();
                                arg104.put(arg103, arg43);
                            }
                            arg26 = arg73;
                            if (!(arg26.isEmpty() == false)) {
                                arg105 = "No weights for template group '" + (String)arg20 + "'!";
                                throw new IllegalArgumentException(arg105.toString());
                            }
                            arg72 = arg26.values();
                            arg93 = arg72;
                            arg73 = new ArrayList<PunishmentService>();
                            arg94 = arg93.iterator();
                            while (arg94.hasNext()) {
                                arg106 = arg94.next();
                                arg107 = ((Number)arg106).floatValue();
                                if (!((double)arg107 <= 0.0)) continue;
                                arg73.add(arg106);
                            }
                            arg72 = (List)arg73;
                            arg93 = arg72.iterator();
                            while (arg93.hasNext()) {
                                arg73 = arg93.next();
                                arg108 = ((Number)arg73).floatValue();
                                arg18.c().getLogger().warning("Template group '" + (String)arg20 + "' includes BaseCoreGenericHandler bad weight: " + arg108);
                            }
                            arg29 = arg26;
                            arg73 = arg29;
                            arg39 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(arg29.size()));
                            arg41 = arg73.entrySet();
                            arg109 = arg41.iterator();
                            while (arg109.hasNext()) {
                                arg110 = arg109.next();
                                arg111 = (Map.Entry)arg110;
                                arg112 = arg39;
                                arg102 = (Map.Entry)arg110;
                                arg54   = arg111.getKey();
                                arg96 = arg112;
                                arg55 = (LiteBansModule_65)arg102.getKey();
                                arg96.put(arg54  , arg55);
                            }
                            arg29 = arg39;
                            arg73 = arg29;
                            arg39 = new LinkedHashMap<K, V>(LiteBansModule_348.BaseCoreGenericHandler(arg29.size()));
                            arg41 = arg73.entrySet();
                            arg109 = arg41.iterator();
                            while (arg109.hasNext()) {
                                arg113 = arg109.next();
                                arg114   = (Map.Entry)arg113;
                                arg96 = arg39;
                                arg115 = (Map.Entry)arg113;
                                arg102 = LiteBansModule_283.AsyncBackgroundTask_5(((LiteBansModule_65)arg114  .getKey()).LiteBansModule_194());
                                arg116 = arg96;
                                arg114   = arg115.getValue();
                                arg116.put(arg102, arg114  );
                            }
                            arg72 = arg39;
                            arg66.add(new LiteBansModule_174((String)arg20, arg74, (Map)arg26, (Map)arg72, (List)arg69  , arg91));
                        }
                        arg66 = (List)arg15;
                        arg11.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(arg63, (Iterable)arg66));
                    }
                    if (((Collection)arg4.e()).isEmpty() == false) {
                        arg4.c().getLogger().info("Loaded " + arg4.e().size() + " template groups from templates.yml!");
                    } else {
                        arg4.BaseCoreGenericHandler(CollectionUtilities.e());
}
                catch (Exception arg117) {
                    v3.BaseCoreGenericHandler(arg117);
                    v8 = v3;
                    break;
                }
                v8 = v5;
            }
            arg118 = v8;
            arg1.BaseCoreGenericHandler(arg118);
            this.plugin(new DiscordWebhookClient_2(v1, null, 2, null).BaseCoreGenericHandler());
            if (v1.LiteBansModule_401()) {
                v3 = this;
                try {
                    v5 = v3.AsyncBackgroundTask_22();
                    if (v5 == null) break;
                    v3.CommandThrottleService = arg2 = new NullHandler_8(v3.BaseCoreGenericHandler);
                    if (!BukkitBlockAdapter.c()) {
                        arg2.BaseCoreGenericHandler(v5);
                    }
                    break;
                }
                catch (Throwable arg119) {
                    arg2 = (PluginModule)v3;
                    arg120 = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)"Failed to hook into ServerListPlus + ", (CharSequence)"Try using the latest ServerListPlus development build + ");
                    arg4 = arg2.BaseCoreGenericHandler.getLogger();
                    arg4.warning(arg120.toString());
                    if (v3.BaseCoreGenericHandler(1)) {
                        arg119.printStackTrace();
                    }
                    break;
}
            v1.c((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.ConfigService ), ()V)((ConfigService)this));
        }
        v3 = this;
        v5 = v3.LiteBansModule_194();
        if (v5.W()) {
            arg2 = v3.BaseCoreGenericHandler.getDataFolder();
            arg121 = "geoip";
            arg4 = LiteBansModule_112.c(new File((File)arg2, arg121));
            v3.BaseCoreGenericHandler.LiteBansModule_31(new AsyncBackgroundTask_4((ConfigService)v3, (File)arg4, (DiscordWebhookClient)v5));
        }
        try {
            this.q = true;
            v3 = this;
            v5 = (BroadcastService)v3.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
            arg2 = v3.BaseCoreGenericHandler.getDataFolder();
            arg122 = "lockdown.yml";
            arg4 = new File((File)arg2, arg122);
            if (!arg4.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                arg2 = v3.BaseCoreGenericHandler.getDataFolder();
                arg122 = "lockdown.json";
                arg4 = new File((File)arg2, arg122);
            }
            if (arg4.exists()) {
                arg2 = v3.BaseCoreGenericHandler.BaseCoreGenericHandler((File)arg4).g();
                arg122 = arg2.BaseCoreGenericHandler("scope", "*");
                arg123 = arg2.BaseCoreGenericHandler("reason", "");
                if (v3.LiteBansModule_194().D()) {
                    ObjectUtilities.BaseCoreGenericHandler((Object)arg123);
                    if (((CharSequence)arg123).length() > 0) {
                        v3.BaseCoreGenericHandler.getLogger().info("Applying saved lockdown, reason: \"" + arg123 + '\"');
                        ObjectUtilities.BaseCoreGenericHandler((Object)arg122);
                        v5.BaseCoreGenericHandler(arg122, (CharSequence)arg123, true);
}
            this.AsyncBackgroundTask_5();
            v3 = this;
            v5 = LiteBansModule_336.c();
            arg2 = v3.BaseCoreGenericHandler.e();
            if (!ObjectUtilities.BaseCoreGenericHandler(v5, arg2)) {
                arg122 = "This is LiteBans version " + (String)v5 + ", NOT version " + (String)arg2 + '!';
                arg124 = new AsyncBackgroundTask_12((ConfigService)v3, arg122);
                arg124.run();
                v3.BaseCoreGenericHandler.BaseCoreGenericHandler(arg124, 20L);
            }
            if (this.g()) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, BaseCoreGenericHandler(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 140L);
            }
            if (v1.AsyncBackgroundTask_22() == 0) {
                v1.BaseCoreGenericHandler((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, LiteBansModule_31(litebans.PlatformPlugin litebans.ConfigService ), ()V)((PlatformPlugin)v1, (ConfigService)this), 300L);
}
        catch (Throwable arg125) {
            this.plugin(arg125);
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
            object = this;
            ((PluginModule)object).BaseCoreGenericHandler.getLogger().warning(string3);
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
        Object object = this;
        String[] args = "[!!] Could not load " + string + " + ";
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
        int n2 = ((String[])object3).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = object3[n];
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
                Logger logger = module.BaseCoreGenericHandler.getLogger();
                logger.warning(((Object)charSequence3).toString());
            }
            simpleDateFormat = new SimpleDateFormat(((Object)charSequence2).toString());
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
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
{
            Object object;
            Object object2;
            Object object3;
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
                object3 = k24;
                DatabaseService gn_03 = ((MessagesYmlHandler)object3).c();
                ObjectUtilities.BaseCoreGenericHandler(gn_03);
                object2 = gn_03;
                object = MessageKey.values();
                for (CharSequence charSequence : object) {
                    MessageKey am2 = charSequence;
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
                        ((Logger)object).info(((Object)charSequence).toString());
} else {
                    k24.BaseCoreGenericHandler().getLogger().info("Using system locale (" + k24.AsyncBackgroundTask_5().getLanguage() + ')');
                }
                k24.BaseCoreGenericHandler((DatabaseService)null);
            }
            catch (Exception exception) {
                k24.BaseCoreGenericHandler(exception);
                k22 = k24;
                break;
            }
            if (YamlConfigProvider.AsyncBackgroundTask_5() != null) {
                try {
                    gn_02.LiteBansModule_240();
                }
                catch (Exception exception) {
                    k24.BaseCoreGenericHandler().getLogger().severe("[!!] Could not save messages + ");
                    k24.e().BaseCoreGenericHandler(exception);
}
            object3 = k24;
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
{
            ConfigService q_03 = configService;
            try {
                Object object = q_03.AsyncBackgroundTask_22();
                if (object != null) {
                    NullHandler_8 z = new NullHandler_8(q_03.BaseCoreGenericHandler);
                    q_03.CommandThrottleService = z;
                    if (!BukkitBlockAdapter.c()) {
                        z.BaseCoreGenericHandler(object);
}
            catch (Throwable throwable) {
                PluginModule module = q_03;
                CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)"Failed to hook into ", (CharSequence)"Try using the latest ServerListPlus development ");
                Logger logger = module.BaseCoreGenericHandler.getLogger();
                logger.warning(((Object)charSequence).toString());
                if (!q_03.BaseCoreGenericHandler(1)) break;
                throwable.printStackTrace();
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(PlatformPlugin plugin, ConfigService configService) {
{
            BroadcastService o2 = (BroadcastService)plugin.BaseCoreGenericHandler(BroadcastService.class);
            int n = plugin.z().e().size();
            if (!(n > 8)) {
                Integer n2 = n;
                throw new IllegalArgumentException(((Object)n2).toString());
            }
            Object object = new Class[]{PlatformPlugin.class};
            Class[] classArray = object;
            object = new Object[]{plugin};
            List list = plugin.LiteBansModule_194().BaseCoreGenericHandler(BansHandler.class, classArray, (Object[])object);
            if (!(list.size() > 1)) {
                ObjectUtilities.BaseCoreGenericHandler(list);
                List list2 = list;
                throw new IllegalArgumentException(list2.toString());
            }
            Object object2 = object = (DatabaseMonitorService)plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    boolean flag2;
                    Object object3 = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(ch3.c((CharSequence)"SELECT NOW() CommandExitException now"));
                    resultSet.next();
                    Timestamp timestamp = resultSet.getTimestamp("now");
                    Object object4 = configService;
                    Object object5 = "AsyncBackgroundTask_22: " + timestamp.getTime();
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
                        CharSequence charSequence = object7;
                        throw new IllegalArgumentException(((Object)charSequence).toString());
                    }
                    ch3.BaseCoreGenericHandler(((LiteBansModule_297)object6).LiteBansModule_31(), ((AltsHandler)object4).c(), BanHandler.LiteBansModule_240, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), false, 1);
                    ch3.BaseCoreGenericHandler(((LiteBansModule_297)object6).LiteBansModule_31(), ((AltsHandler)object4).c(), BanHandler.LiteBansModule_240, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), true, 1);
                    object5 = "*";
                    String string2 = LiteBansModule_181.LiteBansModule_194.c("global");
                    if (!LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(string2)) {
                        String string3 = string2 + ' ' + LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                        throw new IllegalArgumentException(string3.toString());
                    }
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)string2, object5) && string2.charAt(0) == ((String)object5).charAt(0))) {
                        String string4 = string2 + ' ' + (String)object5;
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
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break;
                throw sQLException;
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
{
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
                        LiteBansModule_82 ch3 = ch2;
                        if (ch3.BaseCoreGenericHandler()) {
                            CharSequence charSequence;
                            BansHandler_2 kL2 = BansHandler_2.g;
                            Object object4 = "uuid";
                            ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + object4 + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)1))));
                            object4 = resultSet;
                            n = 1;
                            if (object4.next()) {
                                String string;
                                Object object5 = object4;
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
                            if (HexEncodingHelper.BaseCoreGenericHandler((String)((Object)kL2))) {
                                object4 = UUID.fromString(HexEncodingHelper.BaseCoreGenericHandler.g((String)((Object)kL2)));
                                LiteBansModule_158 ec_03 = plugin.i();
                                ObjectUtilities.LiteBansModule_31(ec_03, "");
                                BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_03;
                                ObjectUtilities.BaseCoreGenericHandler(object4);
                                DefaultHandler.BaseCoreGenericHandler(e12, ao_02.BaseCoreGenericHandler((UUID)object4), "test", null, 4, null);
                                e12.BaseCoreGenericHandler(object4);
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
                catch (SQLException sQLException) {
                    if (((DatabaseMonitorService)module).LiteBansModule_31(sQLException)) break;
                    throw sQLException;
}
            module = configService;
            flag = false;
            if (((ConfigService)module).g()) {
                PluginModule n_03 = module;
                ((ConfigService)n_03).BaseCoreGenericHandler((Object)("" + object2 + object + '\n'));
}
        catch (LinkageError linkageError) {
            ConfigService.BaseCoreGenericHandler(configService, linkageError, 0, 2, null);
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

