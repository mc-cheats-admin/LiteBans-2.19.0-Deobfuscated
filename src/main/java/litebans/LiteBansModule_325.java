package litebans;

public class LiteBansModule_325 {
    private final long[] BaseCoreGenericHandler;

    public LiteBansModule_325(long l3) {
        long[] lArray = new long[]{l3, l3};
        this.plugin = lArray;
    }

    public /* synthetic */ LiteBansModule_325(long l3, int n, LiteBansModule_14 aJ2) {
        if ((n & 1) != 0) {
            l3 = System.nanoTime();
        }
        this(l3);
    }

    public final long[] c() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.plugin(l3, l3);
    }

    public final void BaseCoreGenericHandler(long l3, long l5) {
        this.plugin[0] = l3;
        this.plugin[1] = l5;
    }

    public final long LiteBansModule_31() {
        long l3 = this.plugin[0];
        long l5 = this.plugin[1];
        l3 ^= l3 << 23;
        l3 = l3 ^ l5 ^ (l3 >> 17 ^ l5 >> 26);
        this.plugin(l5, l3);
        return l3 + l5;
    }

    public int BaseCoreGenericHandler(int n) {
        if (!(n > 0)) {
            String string = String.valueOf(n);
            throw new IllegalArgumentException(string.toString());
        }
        return (int)Math.abs(this.LiteBansModule_31() % (long)n);
    }

    public final int LiteBansModule_31(int n) {
        return (int)Math.abs(this.LiteBansModule_31() % (long)n);
    }

    public final boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_31(2) == 0;
    }

    public LiteBansModule_325() {
        this(0L, 1, null);
    }
}

