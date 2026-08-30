package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_342 {
    public static final LiteBansModule_101 c;
    private final byte[] LiteBansModule_401;
    private byte Utf8Handler_2;
    private short LiteBansModule_194;
    public static final int BaseCoreGenericHandler;
    public static final int GnuSparseMapHandler;
    public static final int i;
    public static final int m;
    public static final int LiteBansModule_31;
    public static final int e;
    public static final int g;
    public static final int AsyncBackgroundTask_5;
    private static final LiteBansModule_354 LiteBansModule_240;

    private LiteBansModule_342(byte[] byArray, byte by2, short s2) {
        this.LiteBansModule_401 = byArray;
        this.Utf8Handler_2 = by2;
        this.LiteBansModule_194 = s2;
    }

    public /* synthetic */ LiteBansModule_342(byte[] byArray, byte by2, short s2, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            by2 = 0;
        }
        if ((n & 4) != 0) {
            s2 = 0;
        }
        this(byArray, by2, s2, null);
    }

    public final byte[] c() {
        return this.LiteBansModule_401;
    }

    public final byte e() {
        return this.Utf8Handler_2;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.Utf8Handler_2 = by2;
    }

    public final int LiteBansModule_31() {
        return this.LiteBansModule_401.length;
    }

    public final boolean BaseCoreGenericHandler(@NotNull byte[] byArray, int n, int n2) {
        return this.LiteBansModule_31() == n2 - n && this.LiteBansModule_401[0] == byArray[n] ? LiteBansModule_389.BaseCoreGenericHandler(this.LiteBansModule_401, byArray, n, n2) : false;
    }

    public final long BaseCoreGenericHandler() {
        long l3 = this.LiteBansModule_31() - 2;
        long l5 = this.LiteBansModule_194 & 0xFFFFL;
        l3 = l3++ * l3;
        long l7 = l3 * l3 * l3;
        long l8 = l5 * l5;
        long l9 = l8 * l8 * l7 * l7 * l7;
        return (l3 << 30) + (l9 >> 10);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LiteBansModule_342(byte[] byArray, byte by2, short s2, LiteBansModule_14 aJ2) {
        this(byArray, by2, s2);
    }

    public static final /* synthetic */ LiteBansModule_354 AsyncBackgroundTask_5() {
        return LiteBansModule_240;
    }

    static {
        AsyncBackgroundTask_5 = 70;
        g = 568;
        e = 16000;
        LiteBansModule_31 = 600;
        m = 1600;
        i = 30;
        GnuSparseMapHandler = 10;
        BaseCoreGenericHandler = 10;
        c = new LiteBansModule_101(null);
        LiteBansModule_240 = LiteBansModule_371.BaseCoreGenericHandler(LiteBansModule_193.AsyncBackgroundTask_5((short)0), LiteBansModule_389.BaseCoreGenericHandler());
}

