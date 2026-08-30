package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class StoredHandler
extends Enum {
    public static final StoredHandler GnuSparseMapHandler;
    public static final StoredHandler CommandThrottleService;
    public static final StoredHandler AsyncBackgroundTask_5;
    public static final StoredHandler m;
    public static final StoredHandler Utf8Handler_2;
    public static final StoredHandler e;
    public static final StoredHandler LiteBansModule_403;
    public static final StoredHandler ServerSyncService;
    public static final StoredHandler BroadcastService;
    public static final StoredHandler c;
    public static final StoredHandler LiteBansModule_31;
    public static final StoredHandler q;
    public static final StoredHandler AsyncBackgroundTask_21;
    public static final StoredHandler r;
    public static final StoredHandler PunishmentTableService;
    public static final StoredHandler LiteBansModule_195;
    public static final StoredHandler AsyncBackgroundTask_22;
    public static final StoredHandler g;
    public static final StoredHandler i;
    static final int n;
    private final int BaseCoreGenericHandler;
    private static final Map LiteBansModule_241;
    private static final /* synthetic */ StoredHandler[] DatabaseMonitorService;

    public static final StoredHandler[] values() {
        return (StoredHandler[])DatabaseMonitorService.clone();
    }

    public static final StoredHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(StoredHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private StoredHandler() {
        this((String)var1_-1, (int)var2_-1, -1);
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private StoredHandler() {
        void v1;
        void var2_-1;
        void var1_-1;
        this.plugin = v1;
    }

    public int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public static final StoredHandler BaseCoreGenericHandler(int n) {
        return (StoredHandler)((Object)LiteBansModule_241.get(n));
    }

    static {
        n = -1;
        GnuSparseMapHandler = new StoredHandler("STORED", 0, 0);
        CommandThrottleService = new StoredHandler("UNSHRINKING", 1, 1);
        AsyncBackgroundTask_5 = new StoredHandler("EXPANDING_LEVEL_1", 2, 2);
        m = new StoredHandler("EXPANDING_LEVEL_2", 3, 3);
        Utf8Handler_2 = new StoredHandler("EXPANDING_LEVEL_3", 4, 4);
        e = new StoredHandler("EXPANDING_LEVEL_4", 5, 5);
        LiteBansModule_403 = new StoredHandler("IMPLODING", 6, 6);
        ServerSyncService = new StoredHandler("TOKENIZATION", 7, 7);
        BroadcastService = new StoredHandler("DEFLATED", 8, 8);
        c = new StoredHandler("ENHANCED_DEFLATED", 9, 9);
        LiteBansModule_31 = new StoredHandler("PKWARE_IMPLODING", 10, 10);
        q = new StoredHandler("BZIP2", 11, 12);
        AsyncBackgroundTask_21 = new StoredHandler("LZMA", 12, 14);
        r = new StoredHandler("XZ", 13, 95);
        PunishmentTableService = new StoredHandler("JPEG", 14, 96);
        LiteBansModule_195 = new StoredHandler("WAVPACK", 15, 97);
        AsyncBackgroundTask_22 = new StoredHandler("PPMD", 16, 98);
        g = new StoredHandler("AES_ENCRYPTED", 17, 99);
        i = new StoredHandler("UNKNOWN", 18);
        DatabaseMonitorService = new StoredHandler[]{GnuSparseMapHandler, CommandThrottleService, AsyncBackgroundTask_5, m, Utf8Handler_2, e, LiteBansModule_403, ServerSyncService, BroadcastService, c, LiteBansModule_31, q, AsyncBackgroundTask_21, r, PunishmentTableService, LiteBansModule_195, AsyncBackgroundTask_22, g, i};
        HashMap<Integer, StoredHandler> hashMap = new HashMap<Integer, StoredHandler>();
        for (StoredHandler dq_02 : StoredHandler.values()) {
            hashMap.put(dq_02.BaseCoreGenericHandler(), dq_02);
        }
        LiteBansModule_241 = Collections.unmodifiableMap(hashMap);
    }
}

