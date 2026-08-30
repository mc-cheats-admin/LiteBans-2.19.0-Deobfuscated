package litebans;

import java.io.InputStream;
public class LiteBansModule_194
extends LiteBansModule_153 {
    private final InputStream HoverTextFormatter;
    private long BroadcastService = 0L;
    private boolean e;
    private LiteBansModule_334 LiteBansModule_433 = null;
    private byte[] LiteBansModule_194 = null;
    private long z = -1L;
    private static final int ServerSyncService;
    private static final int LiteBansModule_401;
    private static final int CommandThrottleService;
    private static final int DatabaseMonitorService;
    private static final int GnuSparseMapHandler;
    private static final int m;
    private static final int AsyncBackgroundTask_21;
    private static final int i;
    private static final int g;
    private static final int n;
    private static final int AsyncBackgroundTask_22;
    private static final int PunishmentTableService;
    private final byte[] Utf8Handler_2 = new byte[58];
    static final String A;
    private static final int q;
    private static final String LiteBansModule_240;
    private static final String AsyncBackgroundTask_5;
    private static final String r;

    public LiteBansModule_194(InputStream inputStream) {
        this.HoverTextFormatter = inputStream;
        this.e = false;
    }

    @Override
    public void close() {
        if (!this.e) {
            this.e = true;
            this.HoverTextFormatter.close();
        }
        this.LiteBansModule_433 = null;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (this.LiteBansModule_433 == null) {
            throw new IllegalStateException("No current ar entry");
        }
        long l3 = this.z + this.LiteBansModule_433.BaseCoreGenericHandler();
        if (n2 < 0 || this.BroadcastService >= l3) {
            return -1;
        }
        int n3 = (int)Math.min((long)n2, l3 - this.BroadcastService);
        int n4 = this.HoverTextFormatter.read(byArray, n, n3);
        this.c(n4);
        return n4;
    }

    private final void c(long l3) {
        this.LiteBansModule_31(l3);
        if (l3 > 0L) {
            this.BroadcastService += l3;
        }
    }

    static {
        r = "^/\\AsyncBackgroundTask_5+";
        AsyncBackgroundTask_5 = "//";
        LiteBansModule_240 = "^#1/\\AsyncBackgroundTask_5+";
        A = "#1/";
        PunishmentTableService = 10;
        AsyncBackgroundTask_22 = 48;
        n = 8;
        g = 40;
        i = 6;
        AsyncBackgroundTask_21 = 34;
        m = 6;
        GnuSparseMapHandler = 28;
        DatabaseMonitorService = 12;
        CommandThrottleService = 16;
        LiteBansModule_401 = 16;
        ServerSyncService = 0;
        q = "#1/".length();
    }
}

