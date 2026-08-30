package litebans;

import litebans.hl;

public final class eA
extends Enum {
    public static final eA c;
    private static final /* synthetic */ eA[] b;
    private static /* synthetic */ String[] a;

    public static eA[] values() {
        return (eA[])b.clone();
    }

    public static eA a(String string) {
        return Enum.valueOf(eA.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eA() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ eA[] a() {
        return new eA[]{c};
    }

    static {
        eA.b();
        c = new eA("SHOW_TEXT", 0);
        b = eA.a();
    }

    private static final void b() {
        a = new String[]{"SHOW_TEXT"};
    }
}

