package litebans;

import litebans.hl;

public final class hm_0
extends Enum {
    public static final hm_0 e;
    public static final hm_0 b;
    public static final hm_0 g;
    public static final hm_0 a;
    public static final hm_0 d;
    public static final hm_0 c;
    private static final /* synthetic */ hm_0[] h;
    private static /* synthetic */ String[] f;

    public static hm_0[] values() {
        return (hm_0[])h.clone();
    }

    public static hm_0 a(String string) {
        return Enum.valueOf(hm_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hm_0() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ hm_0[] a() {
        return new hm_0[]{e, b, g, a, d, c};
    }

    static {
        hm_0.b();
        e = new hm_0("OPEN_URL", 0);
        b = new hm_0("OPEN_FILE", 1);
        g = new hm_0("RUN_COMMAND", 2);
        a = new hm_0("SUGGEST_COMMAND", 3);
        d = new hm_0("CHANGE_PAGE", 4);
        c = new hm_0("COPY_TO_CLIPBOARD", 5);
        h = hm_0.a();
    }

    private static final void b() {
        f = new String[]{"OPEN_URL", "OPEN_FILE", "RUN_COMMAND", "SUGGEST_COMMAND", "CHANGE_PAGE", "COPY_TO_CLIPBOARD"};
    }
}

