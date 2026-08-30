package litebans;

public final class ao
extends Enum {
    public static final ao c = new ao("TAPE", 0, 1);
    public static final ao f = new ao("INODE", 1, 2);
    public static final ao h = new ao("BITS", 2, 3);
    public static final ao b = new ao("ADDR", 3, 4);
    public static final ao a = new ao("END", 4, 5);
    public static final ao d = new ao("CLRI", 5, 6);
    int g;
    private static final /* synthetic */ ao[] e;

    public static final ao[] values() {
        return (ao[])e.clone();
    }

    public static final ao a(String string) {
        return Enum.valueOf(ao.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ao() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
    }

    public static final ao a(int n) {
        for (ao ao2 : ao.values()) {
            if (ao2.g != n) continue;
            return ao2;
        }
        return null;
    }

    static {
        e = new ao[]{c, f, h, b, a, d};
    }
}

