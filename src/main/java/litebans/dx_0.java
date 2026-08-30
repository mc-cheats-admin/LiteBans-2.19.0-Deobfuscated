package litebans;

public final class dx_0
extends Enum {
    public static final dx_0 c = new dx_0("COMMENT", 0);
    public static final dx_0 a = new dx_0("UNICODE_EXTRA_FIELD", 1);
    private static final /* synthetic */ dx_0[] b;

    public static final dx_0[] values() {
        return (dx_0[])b.clone();
    }

    public static final dx_0 a(String string) {
        return Enum.valueOf(dx_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dx_0() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b = new dx_0[]{c, a};
    }
}

