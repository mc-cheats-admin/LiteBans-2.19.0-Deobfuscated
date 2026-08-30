package litebans;

/*
 * Renamed from litebans.aV
 */
public static final class av_0
extends Enum {
    public static final av_0 a = new av_0("NAME", 0);
    public static final av_0 d = new av_0("NAME_WITH_EFS_FLAG", 1);
    public static final av_0 c = new av_0("UNICODE_EXTRA_FIELD", 2);
    private static final /* synthetic */ av_0[] b;

    public static final av_0[] values() {
        return (av_0[])b.clone();
    }

    public static final av_0 a(String string) {
        return Enum.valueOf(av_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private av_0() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b = new av_0[]{a, d, c};
    }
}

