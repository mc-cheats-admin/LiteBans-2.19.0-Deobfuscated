package litebans;

public final class BroadcastHandler
extends Enum {
    public static final LiteBansModule_204 LiteBansModule_403;
    private static final BroadcastHandler[] m;
    public static final BroadcastHandler e;
    public static final BroadcastHandler CommandThrottleService;
    public static final BroadcastHandler AsyncBackgroundTask_22;
    public static final BroadcastHandler BroadcastService;
    public static final BroadcastHandler Utf8Handler_2;
    public static final BroadcastHandler i;
    public static final BroadcastHandler LiteBansModule_31;
    public static final BroadcastHandler q;
    public static final BroadcastHandler DatabaseMonitorService;
    public static final BroadcastHandler ServerSyncService;
    public static final BroadcastHandler LiteBansModule_435;
    public static final BroadcastHandler r;
    public static final BroadcastHandler g;
    public static final BroadcastHandler GnuSparseMapHandler;
    public static final BroadcastHandler AsyncBackgroundTask_21;
    public static final BroadcastHandler LiteBansModule_195;
    public static final BroadcastHandler PunishmentTableService;
    public static final BroadcastHandler c;
    public static final BroadcastHandler LiteBansModule_241;
    public static final BroadcastHandler BaseCoreGenericHandler;
    private static final /* synthetic */ BroadcastHandler[] AsyncBackgroundTask_5;
    private static final /* synthetic */ LiteBansModule_374 n;
        /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BroadcastHandler() {
        void var2_-1;
        void var1_-1;
    }

    public final int AsyncBackgroundTask_5() {
        return this.ordinal();
    }

    public final String LiteBansModule_195() {
        String string;
        switch (LiteBansModule_386.BaseCoreGenericHandler[this.ordinal()]) {
            case 1: {
                string = "broadcast";
                break;
            }
            case 2: {
                string = "silent";
                break;
            }
            case 3: {
                string = "console";
                break;
            }
            case 4: {
                string = "dupeip_join";
                break;
            }
            case 5: {
                string = "mute";
                break;
            }
            default: {
                throw new UnsupportedOperationException(this.toString());
            }
        }
        return string;
    }

    public final boolean BaseCoreGenericHandler() {
        return this == GnuSparseMapHandler || this == AsyncBackgroundTask_21 || this == LiteBansModule_195;
    }

    public static BroadcastHandler[] values() {
        return (BroadcastHandler[])AsyncBackgroundTask_5.clone();
    }

    public static BroadcastHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(BroadcastHandler.class, string);
    }

    public static final /* synthetic */ BroadcastHandler[] e() {
        return m;
    }

    static {
        BroadcastHandler.c();
        e = new BroadcastHandler("PING", 0);
        CommandThrottleService = new BroadcastHandler("PONG", 1);
        AsyncBackgroundTask_22 = new BroadcastHandler("BROADCAST", 2);
        BroadcastService = new BroadcastHandler("BROADCAST_SILENT", 3);
        Utf8Handler_2 = new BroadcastHandler("BROADCAST_EXTRA_SILENT", 4);
        i = new BroadcastHandler("NOTIFY_BANNED_JOIN", 5);
        LiteBansModule_31 = new BroadcastHandler("NOTIFY_DUPEIP_JOIN", 6);
        q = new BroadcastHandler("NOTIFY_MUTE", 7);
        DatabaseMonitorService = new BroadcastHandler("BAN", 8);
        ServerSyncService = new BroadcastHandler("MUTE", 9);
        LiteBansModule_435 = new BroadcastHandler("WARN", 10);
        r = new BroadcastHandler("KICK_REQUEST", 11);
        g = new BroadcastHandler("KICK_SUCCESS", 12);
        GnuSparseMapHandler = new BroadcastHandler("UNBAN", 13);
        AsyncBackgroundTask_21 = new BroadcastHandler("UNMUTE", 14);
        LiteBansModule_195 = new BroadcastHandler("UNWARN", 15);
        PunishmentTableService = new BroadcastHandler("EXPIRED_NOTIFY", 16);
        c = new BroadcastHandler("BROADCAST_CUSTOM", 17);
        LiteBansModule_241 = new BroadcastHandler("SERVERS_RELOAD", 18);
        BaseCoreGenericHandler = new BroadcastHandler("CONFIG_RELOAD", 19);
        AsyncBackgroundTask_5 = ijArray = new BroadcastHandler[]{BroadcastHandler.e, BroadcastHandler.CommandThrottleService, BroadcastHandler.AsyncBackgroundTask_22, BroadcastHandler.BroadcastService, BroadcastHandler.Utf8Handler_2, BroadcastHandler.i, BroadcastHandler.LiteBansModule_31, BroadcastHandler.q, BroadcastHandler.DatabaseMonitorService, BroadcastHandler.ServerSyncService, BroadcastHandler.LiteBansModule_435, BroadcastHandler.r, BroadcastHandler.g, BroadcastHandler.GnuSparseMapHandler, BroadcastHandler.AsyncBackgroundTask_21, BroadcastHandler.LiteBansModule_195, BroadcastHandler.PunishmentTableService, BroadcastHandler.c, BroadcastHandler.LiteBansModule_241, BroadcastHandler.BaseCoreGenericHandler};
        n = EntriesHandler_3.BaseCoreGenericHandler(AsyncBackgroundTask_5);
        LiteBansModule_403 = new LiteBansModule_204(null);
        m = BroadcastHandler.values();
    }

    private static final void c() {
        HoverTextFormatter = new String[]{"broadcast", "silent", "console", "dupeip_join", "mute", "PING", "PONG", "BROADCAST", "BROADCAST_SILENT", "BROADCAST_EXTRA_SILENT", "NOTIFY_BANNED_JOIN", "NOTIFY_DUPEIP_JOIN", "NOTIFY_MUTE", "BAN", "MUTE", "WARN", "KICK_REQUEST", "KICK_SUCCESS", "UNBAN", "UNMUTE", "UNWARN", "EXPIRED_NOTIFY", "BROADCAST_CUSTOM", "SERVERS_RELOAD", "CONFIG_RELOAD"};
    }
}

