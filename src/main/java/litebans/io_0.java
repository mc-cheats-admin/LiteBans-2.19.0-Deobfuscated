package litebans;

import litebans.hl;

public final class io_0
extends Enum {
    public static final io_0 b;
    public static final io_0 e;
    public static final io_0 d;
    public static final io_0 f;
    private static final /* synthetic */ io_0[] c;
    private static /* synthetic */ String[] a;

    public static io_0[] values() {
        return (io_0[])c.clone();
    }

    public static io_0 a(String string) {
        return Enum.valueOf(io_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private io_0() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ io_0[] a() {
        return new io_0[]{b, e, d, f};
    }

    static {
        io_0.b();
        b = new io_0("NONE", 0);
        e = new io_0("FORMATTING", 1);
        d = new io_0("EVENTS", 2);
        f = new io_0("ALL", 3);
        c = io_0.a();
    }

    private static final void b() {
        a = new String[]{"NONE", "FORMATTING", "EVENTS", "ALL"};
    }
}

