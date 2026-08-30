package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_343 {
    public static final LiteBansModule_102 c;
    private final byte[] LiteBansModule_403;
    private byte Utf8Handler_2;
    private short LiteBansModule_195;
    public static final int BaseCoreGenericHandler;
    public static final int GnuSparseMapHandler;
    public static final int i;
    public static final int m;
    public static final int LiteBansModule_31;
    public static final int e;
    public static final int g;
    public static final int AsyncBackgroundTask_5;
    private static final LiteBansModule_356 LiteBansModule_241;

    private LiteBansModule_343(byte[] byArray, byte by2, short s2) {
        this.LiteBansModule_403 = byArray;
        this.Utf8Handler_2 = by2;
        this.LiteBansModule_195 = s2;
    }

    public /* synthetic */ LiteBansModule_343(byte[] byArray, byte by2, short s2, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            by2 = 0;
        }
        if ((n & 4) != 0) {
            s2 = 0;
        }
        this(byArray, by2, s2, null);
    }

    public final byte[] c() {
        return this.LiteBansModule_403;
    }

    public final byte e() {
        return this.Utf8Handler_2;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.Utf8Handler_2 = by2;
    }

    public final int LiteBansModule_31() {
        return this.LiteBansModule_403.length;
    }

    public final boolean BaseCoreGenericHandler(@NotNull byte[] byArray, int n, int n2) {
        return this.LiteBansModule_31() == n2 - n && this.LiteBansModule_403[0] == byArray[n] ? LiteBansModule_391.BaseCoreGenericHandler(this.LiteBansModule_403, byArray, n, n2) : false;
    }

    public final long BaseCoreGenericHandler() {
        long l3 = this.LiteBansModule_31() - 2;
        long l5 = (long)this.LiteBansModule_195 & 0xFFFFL;
        l3 = l3++ * l3;
        long l7 = l3 * l3 * l3;
        long l8 = l5 * l5;
        long l9 = l8 * l8 * l7 * l7 * l7;
        return (l3 << 30) + (l9 >> 10);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LiteBansModule_343(byte[] byArray, byte by2, short s2, LiteBansModule_14 aJ2) {
        this(byArray, by2, s2);
    }

    public static final /* synthetic */ LiteBansModule_356 AsyncBackgroundTask_5() {
        return LiteBansModule_241;
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
        c = new LiteBansModule_102(null);
        LiteBansModule_241 = LiteBansModule_373.BaseCoreGenericHandler(LiteBansModule_194.AsyncBackgroundTask_5((short)0), LiteBansModule_391.BaseCoreGenericHandler());
    }
}

