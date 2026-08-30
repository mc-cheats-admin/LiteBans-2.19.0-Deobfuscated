package litebans;

import litebans.hl;

public final class g8
extends Enum {
    public static final g8 c;
    public static final g8 a;
    private static final /* synthetic */ g8[] b;
    private static /* synthetic */ String[] d;

    public static g8[] values() {
        return (g8[])b.clone();
    }

    public static g8 a(String string) {
        return Enum.valueOf(g8.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g8() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ g8[] a() {
        return new g8[]{c, a};
    }

    static {
        g8.b();
        c = new g8("V1_16", 0);
        a = new g8("V1_21_5", 1);
        b = g8.a();
    }

    private static final void b() {
        d = new String[]{"V1_16", "V1_21_5"};
    }
}

