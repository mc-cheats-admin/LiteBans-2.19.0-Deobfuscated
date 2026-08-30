package litebans;

/*
 * Renamed from litebans.lh
 */
public static final class lh_0
extends Enum {
    public static final lh_0 g = new lh_0("WHITEOUT", 0, 14);
    public static final lh_0 j = new lh_0("SOCKET", 1, 12);
    public static final lh_0 a = new lh_0("LINK", 2, 10);
    public static final lh_0 d = new lh_0("FILE", 3, 8);
    public static final lh_0 f = new lh_0("BLKDEV", 4, 6);
    public static final lh_0 b = new lh_0("DIRECTORY", 5, 4);
    public static final lh_0 k = new lh_0("CHRDEV", 6, 2);
    public static final lh_0 c = new lh_0("FIFO", 7, 1);
    public static final lh_0 e = new lh_0("UNKNOWN", 8, 15);
    private int h;
    private static final /* synthetic */ lh_0[] i;

    public static final lh_0[] values() {
        return (lh_0[])i.clone();
    }

    public static final lh_0 a(String string) {
        return Enum.valueOf(lh_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lh_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.h = var3_1;
    }

    public static final lh_0 a(int n) {
        lh_0 lh_02 = e;
        for (lh_0 lh_03 : lh_0.values()) {
            if (n != lh_03.h) continue;
            lh_02 = lh_03;
        }
        return lh_02;
    }

    static {
        i = new lh_0[]{g, j, a, d, f, b, k, c, e};
    }
}

