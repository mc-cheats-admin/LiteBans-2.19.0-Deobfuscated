package litebans;

import java.io.Serializable;
import java.math.BigInteger;

public final class LiteBansModule_324
implements Serializable {
    private static final long Utf8Handler_2;
    private static final int i;
    private static final int AsyncBackgroundTask_21;
    private static final int z;
    private static final int g;
    private static final int r;
    private static final int m;
    private static final int CommandThrottleService;
    private static final long PunishmentTableService;
    private static final int LiteBansModule_195;
    private static final int ServerSyncService;
    private static final long DatabaseMonitorService;
    private static final int LiteBansModule_403;
    private static final int n;
    private static final long LiteBansModule_435;
    private static final int q;
    private static final int GnuSparseMapHandler;
    private static final long AsyncBackgroundTask_5;
    private static final int c;
    private static final int LiteBansModule_31;
    private static final long AsyncBackgroundTask_22;
    private static final int e;
    private static final int BroadcastService;
    private static final byte HoverTextFormatter;
    private final BigInteger LiteBansModule_241;
    public static final LiteBansModule_324 BaseCoreGenericHandler;

    public LiteBansModule_324(long l3) {
        this(BigInteger.valueOf(l3));
    }

    public LiteBansModule_324(BigInteger bigInteger) {
        this.LiteBansModule_241 = bigInteger;
    }

    public LiteBansModule_324(byte[] byArray, int n) {
        this.LiteBansModule_241 = LiteBansModule_324.LiteBansModule_31(byArray, n);
    }

    public byte[] c() {
        return LiteBansModule_324.BaseCoreGenericHandler(this.LiteBansModule_241);
    }

    public long LiteBansModule_31() {
        return this.LiteBansModule_241.longValue();
    }

    public BigInteger BaseCoreGenericHandler() {
        return this.LiteBansModule_241;
    }

    public static final byte[] BaseCoreGenericHandler(BigInteger bigInteger) {
        byte[] byArray = new byte[8];
        long l3 = bigInteger.longValue();
        byArray[0] = (byte)(l3 & 0xFFL);
        byArray[1] = (byte)((l3 & 0xFF00L) >> 8);
        byArray[2] = (byte)((l3 & 0xFF0000L) >> 16);
        byArray[3] = (byte)((l3 & 0xFF000000L) >> 24);
        byArray[4] = (byte)((l3 & 0xFF00000000L) >> 32);
        byArray[5] = (byte)((l3 & 0xFF0000000000L) >> 40);
        byArray[6] = (byte)((l3 & 0xFF000000000000L) >> 48);
        byArray[7] = (byte)((l3 & 0x7F00000000000000L) >> 56);
        if (bigInteger.testBit(63)) {
            byArray[7] = (byte)(byArray[7] | 0xFFFFFF80);
        }
        return byArray;
    }

    public static final long BaseCoreGenericHandler(byte[] byArray, int n) {
        return LiteBansModule_324.LiteBansModule_31(byArray, n).longValue();
    }

    public static final BigInteger LiteBansModule_31(byte[] byArray, int n) {
        long l3 = (long)byArray[n + 7] << 56 & 0x7F00000000000000L;
        l3 += (long)byArray[n + 6] << 48 & 0xFF000000000000L;
        l3 += (long)byArray[n + 5] << 40 & 0xFF0000000000L;
        l3 += (long)byArray[n + 4] << 32 & 0xFF00000000L;
        l3 += (long)byArray[n + 3] << 24 & 0xFF000000L;
        l3 += (long)byArray[n + 2] << 16 & 0xFF0000L;
        l3 += (long)byArray[n + 1] << 8 & 0xFF00L;
        BigInteger bigInteger = BigInteger.valueOf(l3 += (long)byArray[n] & 0xFFL);
        return (byArray[n + 7] & 0xFFFFFF80) == -128 ? bigInteger.setBit(63) : bigInteger;
    }

    public static final long BaseCoreGenericHandler(byte[] byArray) {
        return LiteBansModule_324.BaseCoreGenericHandler(byArray, 0);
    }

    public boolean equals(Object targetObj) {
        if (targetObj == null || !(targetObj instanceof LiteBansModule_324)) {
            return false;
        }
        return this.LiteBansModule_241.equals(((LiteBansModule_324)targetObj).BaseCoreGenericHandler());
    }

    public int hashCode() {
        return this.LiteBansModule_241.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.LiteBansModule_241;
    }

    static {
        HoverTextFormatter = (byte)-128;
        BroadcastService = 63;
        e = 56;
        AsyncBackgroundTask_22 = 0x7F00000000000000L;
        LiteBansModule_31 = 7;
        c = 48;
        AsyncBackgroundTask_5 = 0xFF000000000000L;
        GnuSparseMapHandler = 6;
        q = 40;
        LiteBansModule_435 = 0xFF0000000000L;
        n = 5;
        LiteBansModule_403 = 32;
        DatabaseMonitorService = 0xFF00000000L;
        ServerSyncService = 4;
        LiteBansModule_195 = 24;
        PunishmentTableService = 0xFF000000L;
        CommandThrottleService = 3;
        m = 16;
        r = 0xFF0000;
        g = 2;
        z = 8;
        AsyncBackgroundTask_21 = 65280;
        i = 1;
        Utf8Handler_2 = 1L;
        BaseCoreGenericHandler = new LiteBansModule_324(0L);
    }
}

