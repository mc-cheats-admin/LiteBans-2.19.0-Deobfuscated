package litebans;

import litebans.hl;

public final class aI
extends Enum {
    public static final aI h;
    public static final aI f;
    public static final aI a;
    public static final aI i;
    public static final aI c;
    public static final aI e;
    public static final aI b;
    public static final aI g;
    private static final /* synthetic */ aI[] d;
    private static /* synthetic */ String[] j;

    public static aI[] values() {
        return (aI[])d.clone();
    }

    public static aI a(String string) {
        return Enum.valueOf(aI.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aI() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ aI[] b() {
        return new aI[]{h, f, a, i, c, e, b, g};
    }

    static {
        aI.a();
        h = new aI("INIT", 0);
        f = new aI("PRE_TARGET", 1);
        a = new aI("POST_TARGET", 2);
        i = new aI("ENTRY_CREATED", 3);
        c = new aI("ENTRY_EMITTED", 4);
        e = new aI("ENTRY_APPLIED", 5);
        b = new aI("FINALIZED", 6);
        g = new aI("CANCELLED", 7);
        d = aI.b();
    }

    private static final void a() {
        j = new String[]{"INIT", "PRE_TARGET", "POST_TARGET", "ENTRY_CREATED", "ENTRY_EMITTED", "ENTRY_APPLIED", "FINALIZED", "CANCELLED"};
    }
}

