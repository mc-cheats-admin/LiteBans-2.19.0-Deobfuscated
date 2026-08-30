package litebans;

public static final class aD
extends Enum {
    public static final aD b = new aD("CONTINUE_EVICT", 0);
    public static final aD c = new aD("DO_NOT_EVICT", 1);
    private static final /* synthetic */ aD[] a;

    public static aD[] values() {
        return (aD[])a.clone();
    }

    public static aD a(String string) {
        return Enum.valueOf(aD.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aD() {
        void var2_-1;
        void var1_-1;
    }

    static {
        a = new aD[]{b, c};
    }
}

