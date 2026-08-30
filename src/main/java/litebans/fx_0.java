package litebans;

public final class fx_0
extends Enum {
    public static final fx_0 c = new fx_0("ZLIB", 0, 0);
    public static final fx_0 b = new fx_0("BZLIB", 1, 1);
    public static final fx_0 d = new fx_0("LZO", 2, 2);
    int a;
    private static final /* synthetic */ fx_0[] e;

    public static final fx_0[] values() {
        return (fx_0[])e.clone();
    }

    public static final fx_0 a(String string) {
        return Enum.valueOf(fx_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fx_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.a = var3_1;
    }

    public static final fx_0 a(int n) {
        for (fx_0 fx_02 : fx_0.values()) {
            if (fx_02.a != n) continue;
            return fx_02;
        }
        return null;
    }

    static {
        e = new fx_0[]{c, b, d};
    }
}

