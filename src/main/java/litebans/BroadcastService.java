package litebans;

import java.io.Closeable;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BroadcastService
extends PluginModule {
    public static final LiteBansModule_7 n;
    private final LiteBansModule_161 m = ProxyConnection.BaseCoreGenericHandler(() -> BroadcastService.LiteBansModule_31(this));
    private final LiteBansModule_161 g = ProxyConnection.BaseCoreGenericHandler(() -> BroadcastService.BaseCoreGenericHandler(this));
    public CharSequence i;
    public CharSequence c;
    public CharSequence e;
    public CharSequence Utf8Handler_2;
    public CharSequence GnuSparseMapHandler;
    private LitebansLockdownBypassHandler AsyncBackgroundTask_5;
    private final Set LiteBansModule_194 = Collections.newSetFromMap(new ConcurrentHashMap());
    private final LiteBansModule_161 BroadcastService = ProxyConnection.BaseCoreGenericHandler(() -> BroadcastService.c(this));
    private int LiteBansModule_401;
    public static final int LiteBansModule_31;
    public BroadcastService(@Nullable PlatformPlugin plugin) {
        super(plugin);
    }

    public final DatabaseMonitorService i() {
        LiteBansModule_161 eE2 = this.m;
        return (DatabaseMonitorService)eE2.BaseCoreGenericHandler();
    }

    public final ConfigService m() {
        LiteBansModule_161 eE2 = this.g;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    public final void AsyncBackgroundTask_5(@NotNull CharSequence charSequence) {
        this.i = charSequence;
    }

    public final CharSequence LiteBansModule_31() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void LiteBansModule_31(@NotNull CharSequence charSequence) {
        this.c = charSequence;
    }

    public final CharSequence LiteBansModule_240() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void e(@NotNull CharSequence charSequence) {
        this.e = charSequence;
    }

    public final CharSequence Utf8Handler_2() {
        CharSequence charSequence = this.Utf8Handler_2;
        if (charSequence != null) {
            return charSequence;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        this.Utf8Handler_2 = charSequence;
    }

    public final CharSequence LiteBansModule_401() {
        CharSequence charSequence = this.GnuSparseMapHandler;
        if (charSequence != null) {
            return charSequence;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void c(@NotNull CharSequence charSequence) {
        this.GnuSparseMapHandler = charSequence;
    }

    public final LitebansLockdownBypassHandler e() {
        return this.AsyncBackgroundTask_5;
    }

    public final Set LiteBansModule_194() {
        return this.LiteBansModule_194;
    }

    public final GeoIPLookupService_3 c() {
        LiteBansModule_161 eE2 = this.BroadcastService;
        return (GeoIPLookupService_3)eE2.BaseCoreGenericHandler();
    }

    public final GeoIPLookupService_3 BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        GeoIPLookupService_3 gu2;
        byte by2 = plugin.AsyncBackgroundTask_22();
        if (by2 == 0 || by2 == 3) {
            gu2 = new LiteBansModule_236(plugin);
        } else if (by2 == 1) {
            gu2 = new KickOtherHandler(plugin);
        } else if (by2 == 2) {
            gu2 = new GeoIPLookupService_3(plugin);
        } else {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        return gu2;
    }

    public final int GnuSparseMapHandler() {
        return this.LiteBansModule_401;
    }

    public final void BaseCoreGenericHandler(int n) {
        this.LiteBansModule_401 = n;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, @NotNull BroadcastHandler ij2, @Nullable BanHandler a_2, @Nullable String string, boolean flag, boolean flag2, @Nullable CommandSenderWrapper sender) {
        this.plugin(ch2, charSequence, ij2.LiteBansModule_194(), a_2, string, flag, flag2, sender);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(BroadcastService o2, LiteBansModule_82 ch2, CharSequence charSequence, BroadcastHandler ij2, BanHandler a_2, String string, boolean flag, boolean flag2, CommandSenderWrapper sender, int n, Object object) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string = null;
        }
        if ((n & 0x10) != 0) {
            flag = true;
        }
        if ((n & 0x20) != 0) {
            flag2 = true;
        }
        if ((n & 0x40) != 0) {
            sender = null;
        }
        o2.BaseCoreGenericHandler(ch2, charSequence, ij2, a_2, string, flag, flag2, sender);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable BanHandler a_2, @Nullable String string2, boolean flag, boolean flag2, @Nullable CommandSenderWrapper sender) {
        DiscordWebhookClient eG2 = this.m().LiteBansModule_194();
        if (!eG2.B() && flag2) {
            ConfigService configService = this.m();
            int n = 10;
            boolean flag3 = false;
            if (configService.BaseCoreGenericHandler(n)) {
                ConfigService q_03 = configService;
                boolean flag4 = false;
                q_03.BaseCoreGenericHandler((Object)("Local messages are disabled, discarding message: \"" + charSequence + '\"'));
            }
            return;
        }
        if (!flag) {
            return;
        }
        if (eG2.LiteBansModule_14()) {
            if (ch2.e().AsyncBackgroundTask_22() == 3) {
                ch2.e().getLogger().info(((Object)charSequence).toString());
            } else {
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, ch2.e().HoverTextFormatter(), charSequence, null, 4, null);
            }
        }
        if (sender != null && !sender.LiteBansModule_194()) {
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, charSequence, null, 4, null);
        }
        LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, ch2.e(), charSequence, string);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)"console", (Object)string)) {
            return;
        }
        Object[] objectArray = ch2.e().q();
        if (string == null) {
            Iterator iterator = ArrayHandler.BaseCoreGenericHandler(objectArray);
            while (iterator.hasNext()) {
                CommandSenderWrapper jv_03 = (CommandSenderWrapper)iterator.next();
                ObjectUtilities.BaseCoreGenericHandler(jv_03);
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_03, charSequence, null, 4, null);
            }
        } else {
            Iterator iterator = ArrayHandler.BaseCoreGenericHandler(objectArray);
            while (iterator.hasNext()) {
                CommandSenderWrapper jv_04 = (CommandSenderWrapper)iterator.next();
                if (ObjectUtilities.BaseCoreGenericHandler((Object)jv_04, sender)) continue;
                ObjectUtilities.BaseCoreGenericHandler(jv_04);
                if (!this.plugin(jv_04, string, a_2, string2)) continue;
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_04, charSequence, null, 4, null);
            }
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(BroadcastService o2, LiteBansModule_82 ch2, CharSequence charSequence, String string, BanHandler a_2, String string2, boolean flag, boolean flag2, CommandSenderWrapper sender, int n, Object object) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string2 = null;
        }
        if ((n & 0x10) != 0) {
            flag = true;
        }
        if ((n & 0x20) != 0) {
            flag2 = true;
        }
        if ((n & 0x40) != 0) {
            sender = null;
        }
        o2.BaseCoreGenericHandler(ch2, charSequence, string, a_2, string2, flag, flag2, sender);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string, @Nullable BanHandler a_2, @Nullable String string2) {
        void var6_10;
        Object object = sender;
        String[] filteredArgs = new String[]{"litebans.notify", "litebans + " + string};
        filteredArgs = filteredArgs;
        boolean flag = false;
        String[] parsedArgs = filteredArgs;
        boolean flag2 = false;
        int n = parsedArgs.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = parsedArgs[i];
            boolean flag3 = false;
            if (!object.e(string4)) continue;
            return true;
        }
        boolean flag4 = false;
        if (flag4) {
            return true;
        }
        if (a_2 == null) return false;
        if (string2 == null) return false;
        object = this.i().ServerSyncService();
        String string5 = sender.LiteBansModule_240();
        if (string5 == null) {
            Object object2 = object;
        }
        CommandSenderWrapper jv_03 = sender;
        String string6 = "litebans + " + string + '.' + string2 + '.' + a_2;
        flag2 = false;
        if (jv_03.e(string6)) return true;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)var6_10, (Object)string2)) return false;
        jv_03 = sender;
        String string7 = "litebans + " + string + " + " + a_2;
        flag2 = false;
        if (!jv_03.e(string7)) return false;
        return true;
    }

    public final boolean BaseCoreGenericHandler(@NotNull SilentHandler dZ2, @NotNull String string) {
        Object object;
        if (!((Collection)this.LiteBansModule_194).isEmpty() && this.LiteBansModule_194.remove(((String)(object = string)).toLowerCase(Locale.ROOT))) {
            object = this.plugin.HoverTextFormatter();
            this.i().BaseCoreGenericHandler(arg_0 -> BroadcastService.BaseCoreGenericHandler(dZ2, (CommandSenderWrapper)object, this, arg_0));
            this.plugin.getLogger().info("Unbanned player: " + string + '.');
            return true;
        }
        return false;
    }

    public final void LiteBansModule_31(@NotNull String string) {
        SQLiteDriverHandler_2 cJ2 = DatabaseMonitorService.CommandThrottleService;
        boolean flag = false;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"postgresql")) {
            this.AsyncBackgroundTask_5("B'0'");
            this.LiteBansModule_31((CharSequence)"B'1'");
            this.e(" ILIKE ");
        } else {
            this.AsyncBackgroundTask_5("0");
            this.LiteBansModule_31((CharSequence)"1");
            this.e("=");
        }
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"sqlite")) {
            this.plugin((CharSequence)"name,uuid,ip,datetime(date) CommandExitException date");
            this.c(" COLLATE NOCASE ");
        } else if (DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(string)) {
            this.plugin((CharSequence)"name,uuid,ip,UNIX_TIMESTAMP(date) CommandExitException date");
            this.c(" ");
        } else {
            this.plugin((CharSequence)"*");
            this.c(" ");
        }
    }

    @Override
    public void c() {
        if (this.AsyncBackgroundTask_5 != null) {
            LitebansLockdownBypassHandler gG2 = this.AsyncBackgroundTask_5;
            ObjectUtilities.BaseCoreGenericHandler(gG2);
            gG2.LiteBansModule_194();
        }
    }

    public final CommandSenderWrapper BaseCoreGenericHandler(@NotNull String string) {
        Object object;
        block1: {
            Object[] objectArray = this.plugin.q();
            boolean flag = false;
            for (Object object2 : objectArray) {
                CommandSenderWrapper sender = (CommandSenderWrapper)object2;
                boolean flag2 = false;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)sender.BaseCoreGenericHandler(), (Object)string)) continue;
                object = object2;
                break block1;
            }
            object = null;
        }
        return (CommandSenderWrapper)object;
    }

    public final CharSequence BaseCoreGenericHandler(long l3, boolean flag) {
        LiteBansModule_354 jT2 = this.plugin();
        if (l3 == -1L) {
            return MessageKey.LiteBansModule_60;
        }
        return ((SimpleDateFormat)jT2.e()).format(new Date(l3 + this.plugin(flag)));
    }

    private final LiteBansModule_354 BaseCoreGenericHandler() {
        LiteBansModule_354 jT2 = (LiteBansModule_354)this.m().c().get();
        if (!ObjectUtilities.BaseCoreGenericHandler(jT2.LiteBansModule_31(), (Object)MessageKey.LiteBansModule.toString())) {
            this.m().c().remove();
            jT2 = (LiteBansModule_354)this.m().c().get();
        }
        LiteBansModule_354 jT3 = jT2;
        ObjectUtilities.BaseCoreGenericHandler(jT3);
        return jT3;
    }

    public final java.util.Date BaseCoreGenericHandler(@NotNull ResultSet resultSet, @NotNull String string, boolean flag, @Nullable String string2) {
        java.util.Date date = null;
        if (this.plugin(resultSet)) {
            try {
                String string3 = resultSet.getString(string);
                if (string3 == null || ((CharSequence)string3).length() == 0) {
                    return new java.util.Date();
                }
                date = ((SimpleDateFormat)LiteBansModule_429.LiteBansModule_31.BaseCoreGenericHandler().get()).parse(string3);
            }
            catch (Exception exception) {
                this.m().BaseCoreGenericHandler(exception, 0);
                date = new java.util.Date();
            }
        } else {
            String string4 = string2;
            if (string4 == null) {
                string4 = this.m().LiteBansModule_194().ElementsHandler();
            }
            if (DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(string4) && flag) {
                return new Date(resultSet.getLong(string) * 1000L);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            Timestamp timestamp = resultSet.getTimestamp(string);
            if (timestamp == null) {
                return new java.util.Date();
            }
            Timestamp timestamp2 = timestamp;
            calendar.setTime(timestamp2);
            return calendar.getTime();
        }
        return date;
    }

    public final String BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2) {
        LiteBansModule_297 iA2;
        String string = dZ2.AsyncBackgroundTask_21();
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"[Console]") || ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"CONSOLE")) {
            return this.m().LiteBansModule_194().SQLiteDriverHandler();
        }
        String string3 = dZ2.q();
        if (this.m().LiteBansModule_194().SetHandler() && string3 != null) {
            return string3;
        }
        LiteBansModule_297 iA3 = iA2 = ch2.c(string2);
        return iA3 != null ? iA3.BaseCoreGenericHandler() : null;
    }

    public final long BaseCoreGenericHandler(boolean flag) {
        if (!flag && this.m().LiteBansModule_194().CommandThrottleService() || !this.m().LiteBansModule_194().z()) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        return calendar.get(15) + calendar.get(16);
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, boolean flag) {
        String string5 = string3;
        ObjectUtilities.BaseCoreGenericHandler((Object)string5);
        String string6 = HexEncodingHelper.LiteBansModule_194(string5);
        DiscordWebhookClient eG2 = this.m().LiteBansModule_194();
        PunishmentTableService p2 = (PunishmentTableService)this.plugin.BaseCoreGenericHandler(PunishmentTableService.class);
        boolean flag2 = !this.m().PunishmentTableService() && !this.plugin.LiteBansModule_401() && !eG2.GnuSparseMapHandler();
        boolean flag3 = flag2 = flag2 || flag && this.plugin.LiteBansModule_401() && this.plugin.c();
        if (flag2) {
            String string7 = string;
            ObjectUtilities.BaseCoreGenericHandler((Object)string7);
            new LiteBansModule_221(this.plugin, string7, string6, string2).run();
        }
        if (flag) {
            return;
        }
        PunishmentTableService p3 = p2;
        boolean flag4 = false;
        PlatformPlugin plugin = p3.BaseCoreGenericHandler;
        String string8 = string6;
        ObjectUtilities.BaseCoreGenericHandler((Object)string8);
        new LiteBansModule_212(plugin, string, string8, string2, string4).run();
        litebans.BroadcastService.BaseCoreGenericHandler(this, string6, string, 0, 4, null);
    }

    private final void BaseCoreGenericHandler(String string, String string2, int n) {
        this.plugin.BaseCoreGenericHandler(() -> BroadcastService.BaseCoreGenericHandler(this, string, n, string2), 30L * (long)n * (long)n);
    }

    static /* synthetic */ void BaseCoreGenericHandler(BroadcastService o2, String string, String string2, int n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            n = 1;
        }
        o2.BaseCoreGenericHandler(string, string2, n);
    }

    @Override
    public void e() {
        this.m().e();
        if (this.AsyncBackgroundTask_5 == null) {
            this.plugin("", null, false);
        }
    }

    public final Object AsyncBackgroundTask_5() {
        if (this.plugin.i().BaseCoreGenericHandler("\u11cb\u11f2\u11e4\u11ec\u11d7\u11e2\u11f5\u11ea\u11f4")) {
            return LiteBansModule_48.LiteBansModule_31.BaseCoreGenericHandler();
        }
        return null;
    }

    public final boolean BaseCoreGenericHandler(@Nullable Object object) {
        if (object instanceof LiteBansModule_223) {
            return StringUtilities.BaseCoreGenericHandler((CharSequence)((LiteBansModule_223)object).toString(), (CharSequence)"org.sqlite", false, 2, null);
        }
        return object != null && StringUtilities.LiteBansModule_31(object.getClass().getName(), "org.sqlite", false, 2, null);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull NoneHandler_2 cz2) {
        SilentHandler dZ2 = cz2.q();
        ObjectUtilities.BaseCoreGenericHandler(dZ2);
        LiteBansModule_297 iA2 = cz2.AsyncBackgroundTask_22();
        this.plugin(ch2, dZ2, iA2 != null ? iA2.BaseCoreGenericHandler() : null);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @Nullable String string) {
        if (ch2.e().AsyncBackgroundTask_22() == 1 && dZ2.ServerSyncService() == BanHandler.LiteBansModule_240) {
            Object object = dZ2.DatabaseMonitorService();
            boolean flag = false;
            if (HexEncodingHelper.BaseCoreGenericHandler((String)object)) {
                GeoIPLookupService_3 gu2 = this.c();
                ObjectUtilities.LiteBansModule_31(gu2, "");
                Object object2 = object = (KickOtherHandler)gu2;
                boolean flag2 = false;
                String string2 = string;
                if (string2 == null) {
                    LiteBansModule_297 iA2 = ch2.c(dZ2.DatabaseMonitorService());
                    string2 = iA2 != null ? iA2.BaseCoreGenericHandler() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                }
                UUID uUID = UUID.fromString(dZ2.DatabaseMonitorService());
                String string3 = dZ2.PunishmentTableService();
                String string4 = dZ2.m();
                if (string4 == null) {
                    string4 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                }
                ((KickOtherHandler)object2).BaseCoreGenericHandler(ch2, string2, uUID, string3, string4, CollectionUtilities.BaseCoreGenericHandler(dZ2));
            }
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(BroadcastService o2, LiteBansModule_82 ch2, SilentHandler dZ2, String string, int n, Object object) {
        if ((n & 2) != 0) {
            string = null;
        }
        o2.BaseCoreGenericHandler(ch2, dZ2, string);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender) {
        KickOtherHandler gx_02;
        List list = ch2.BaseCoreGenericHandler(sender.BaseCoreGenericHandler(), sender.LiteBansModule_31(), BanHandler.LiteBansModule_240, "__ALL__", true, 0);
        GeoIPLookupService_3 gu2 = this.c();
        ObjectUtilities.LiteBansModule_31(gu2, "");
        KickOtherHandler gx_03 = gx_02 = (KickOtherHandler)gu2;
        Comparable<UUID> comparable = sender.AsyncBackgroundTask_5();
        boolean flag = false;
        int n = (int)comparable.getMostSignificantBits();
        comparable = n;
        ((Map)gx_02.LiteBansModule_31()).put(comparable, list);
    }

    public final boolean BaseCoreGenericHandler(@Nullable SilentHandler dZ2) {
        SilentHandler dZ3 = dZ2;
        if ((dZ3 != null ? dZ3.ServerSyncService() : null) == BanHandler.LiteBansModule_240) {
            Object object = dZ2.DatabaseMonitorService();
            int n = 0;
            if (HexEncodingHelper.BaseCoreGenericHandler((String)object) && this.plugin.AsyncBackgroundTask_22() == 1) {
                GeoIPLookupService_3 gu2 = this.c();
                ObjectUtilities.LiteBansModule_31(gu2, "");
                object = (KickOtherHandler)gu2;
                String string = dZ2.DatabaseMonitorService();
                ObjectUtilities.BaseCoreGenericHandler((Object)string);
                n = ((KickOtherHandler)object).BaseCoreGenericHandler(string);
                Collection collection = (Collection)((KickOtherHandler)object).LiteBansModule_31().get(n);
                if (collection == null) {
                    return false;
                }
                Collection collection2 = collection;
                Map map = ((KickOtherHandler)object).LiteBansModule_31();
                Integer n2 = n;
                Iterable iterable = collection2;
                boolean flag = false;
                Iterable iterable2 = iterable;
                Collection collection3 = new ArrayList();
                boolean flag2 = false;
                for (Object t2 : iterable2) {
                    SilentHandler dZ4 = (SilentHandler)t2;
                    boolean flag3 = false;
                    if (!(dZ4.BaseCoreGenericHandler() != dZ2.BaseCoreGenericHandler())) continue;
                    collection3.add(t2);
                }
                iterable = (List)collection3;
                map.put(n2, iterable);
                return true;
            }
        }
        return false;
    }

    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @Nullable String string) {
        LiteBansModule_158 ec_02 = this.plugin.i();
        if (ec_02 instanceof BungeecordHandler_2 && this.m().LiteBansModule_194().LiteBansModule_13()) {
            BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
            String string2 = string;
            ObjectUtilities.BaseCoreGenericHandler((Object)string2);
            ao_02.LiteBansModule_31(sender, string2);
        } else {
            String string3 = string;
            ObjectUtilities.BaseCoreGenericHandler((Object)string3);
            sender.AsyncBackgroundTask_5(string3);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence) {
        this.plugin.c(() -> BroadcastService.BaseCoreGenericHandler(this, sender, charSequence));
    }

    public final void BaseCoreGenericHandler(@NotNull String string, @Nullable CharSequence charSequence, boolean flag) {
        if (this.AsyncBackgroundTask_5 != null) {
            LitebansLockdownBypassHandler gG2 = this.AsyncBackgroundTask_5;
            ObjectUtilities.BaseCoreGenericHandler(gG2);
            gG2.LiteBansModule_194();
        }
        LitebansLockdownBypassHandler gG3 = this.AsyncBackgroundTask_5 = new LitebansLockdownBypassHandler(this.plugin, charSequence, string, flag);
        ObjectUtilities.BaseCoreGenericHandler(gG3);
        gG3.i();
    }

    public final void LiteBansModule_31(@NotNull String string, @NotNull CharSequence charSequence, boolean flag) {
        new BannedJoinHandler(this.plugin, string, charSequence, flag).run();
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull CommandSenderWrapper sender, @NotNull SilentHandler dZ2, int n, @NotNull String string) {
        if (!this.m().LiteBansModule_194().B()) {
            return;
        }
        Object object = sender;
        CharSequence charSequence = "litebans + " + string;
        boolean flag = false;
        if (object.e((String)charSequence)) {
            CharSequence charSequence2;
            switch (LiteBansModule_250.BaseCoreGenericHandler[dZ2.ServerSyncService().ordinal()]) {
                case 1: {
                    Object object2 = MessageKey.bS;
                    break;
                }
                case 2: {
                    Object object2;
                    if (dZ2.HoverTextFormatter()) {
                        object2 = MessageKey.dK;
                        break;
                    }
                    object2 = MessageKey.e;
                    break;
                }
                default: {
                    Object object2 = object = MessageKey.Y;
                }
            }
            if ((charSequence2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, n, 0, 4, null)) == null) {
                charSequence2 = charSequence = (CharSequence)object;
            }
            if (dZ2.ServerSyncService() == BanHandler.c) {
                charSequence = GeoIPLookupService.BaseCoreGenericHandler(charSequence, (CharSequence)"duration", (Object)this.m().LiteBansModule_194().ar());
            }
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ2, sender, charSequence, 0L, 8, null), null, 4, null);
        }
    }

    public final String BaseCoreGenericHandler(@Nullable String string, @Nullable String string2) {
        CommandSenderWrapper sender;
        if (this.m().LiteBansModule_194().SetHandler() && string2 != null && (sender = this.plugin(string2)) != null) {
            return sender.g();
        }
        return string;
    }

    private static final DatabaseMonitorService LiteBansModule_31(BroadcastService o2) {
        return (DatabaseMonitorService)o2.BaseCoreGenericHandler.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    private static final ConfigService BaseCoreGenericHandler(BroadcastService o2) {
        return (ConfigService)o2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
    }

    private static final GeoIPLookupService_3 c(BroadcastService o2) {
        return o2.BaseCoreGenericHandler(o2.BaseCoreGenericHandler);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(SilentHandler dZ2, CommandSenderWrapper sender, BroadcastService o2, LiteBansModule_82 ch2) {
        AllHandler_3.BaseCoreGenericHandler(ch2, dZ2, sender.BaseCoreGenericHandler(), sender.i(), null, false, 24, null);
        o2.BaseCoreGenericHandler(dZ2);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(BroadcastService o2, String string, int n, String string2) {
        try {
            String string3;
            Object object;
            CommandSenderWrapper sender;
            block23: {
                Object object2;
                boolean flag;
                sender = o2.BaseCoreGenericHandler(string);
                if (sender == null) {
                    if (n < 5) {
                        o2.BaseCoreGenericHandler(string, string2, n + 1);
                    }
                    return;
                }
                if (!o2.BaseCoreGenericHandler.LiteBansModule_401()) {
                    object = sender;
                    string3 = "litebans.exempt.dupeip_join";
                    flag = false;
                    object2 = object;
                    boolean flag2 = false;
                    if (!object2.e(string3)) {
                        object = (AsyncBackgroundTask_22)o2.BaseCoreGenericHandler.BaseCoreGenericHandler(AsyncBackgroundTask_22.class);
                        string3 = sender.LiteBansModule_31();
                        if (string3 != null) {
                            ((AsyncBackgroundTask_22)object).BaseCoreGenericHandler(string2, sender.BaseCoreGenericHandler(), string3);
                        }
                    }
                }
                object = sender;
                string3 = "litebans.notify.warned.offline";
                flag = false;
                if (object.e(string3)) {
                    object = o2.i();
                    boolean flag3 = false;
                    try {
                        LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                        object2 = ch2;
                        Throwable throwable = null;
                        try {
                            Object object3 = (LiteBansModule_82)object2;
                            boolean flag4 = false;
                            LiteBansModule_82 ch3 = ch2;
                            boolean flag5 = false;
                            Iterator iterator = ch3.BaseCoreGenericHandler(sender, BanHandler.c, true, 512);
                            boolean flag6 = false;
                            Iterable iterable = iterator;
                            Object[] objectArray = (Object[])new ArrayList();
                            boolean flag7 = false;
                            for (Object t2 : iterable) {
                                SilentHandler dZ2 = (SilentHandler)t2;
                                boolean flag8 = false;
                                if (dZ2.c()) continue;
                                objectArray.add(t2);
                            }
                            List list = (List)objectArray;
                            if (!list.isEmpty()) {
                                ch3.LiteBansModule_31(string);
                                iterator = sender;
                                Object object42 = ch3.BaseCoreGenericHandler((CharSequence)MessageKey.du, sender);
                                boolean bl9 = false;
                                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)((Object)iterator), (CharSequence)object42, null, 4, null);
                                for (Object object42 : list) {
                                    CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch3, (SilentHandler)object42, -1, -1);
                                    if (charSequence == null) {
                                        charSequence = MessageKey.az;
                                    }
                                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, GeoIPLookupService.BaseCoreGenericHandler(ch3, (SilentHandler)object42, sender, charSequence, 0L, 8, null), null, 4, null);
                                }
                                int n2 = list.size();
                                String string4 = "Notified %AsyncBackgroundTask_21 of %AsyncBackgroundTask_5 %";
                                objectArray = new Object[]{sender.i(), n2, n2 == 1 ? "warning" : "warnings"};
                                ch3.e().getLogger().info(String.format(string4, Arrays.copyOf(objectArray, objectArray.length)));
                            }
                            object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            throw throwable2;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler((Closeable)object2, throwable);
                        }
                    }
                    catch (SQLException sQLException) {
                        if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break block23;
                        throw sQLException;
                    }
                }
            }
            object = sender;
            string3 = "litebans.admin";
            boolean flag = false;
            if (object.e(string3)) {
                object = o2.BaseCoreGenericHandler.LiteBansModule_240();
                if (((DatabaseService)object).LiteBansModule_31() != null) {
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, MessageKey.ProxyPreparedStatement, null, 4, null);
                }
                if (o2.m().AsyncBackgroundTask_21().BaseCoreGenericHandler() == null) {
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, MessageKey.aV, null, 4, null);
                }
                DatabaseService gn_02 = o2.m().z().c();
                if ((gn_02 != null ? gn_02.LiteBansModule_31() : null) != null) {
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, MessageKey.PropertyHandler, null, 4, null);
                }
            }
        }
        catch (Exception exception) {
            o2.i().BaseCoreGenericHandler(exception);
        }
    }

    private static final void BaseCoreGenericHandler(BroadcastService o2, CommandSenderWrapper sender, CharSequence charSequence) {
        o2.BaseCoreGenericHandler(sender, ((Object)charSequence).toString());
    }

    static {
        LiteBansModule_31 = 512;
        litebans.BroadcastService.g();
        n = new LiteBansModule_7(null);
    }

    }

