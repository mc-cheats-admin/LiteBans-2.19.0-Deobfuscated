package litebans;

public final class k6
extends Enum {
    public static final k6 a = new k6("TRANSACTION_NONE", 0, 0);
    public static final k6 f = new k6("TRANSACTION_READ_UNCOMMITTED", 1, 1);
    public static final k6 d = new k6("TRANSACTION_READ_COMMITTED", 2, 2);
    public static final k6 g = new k6("TRANSACTION_REPEATABLE_READ", 3, 4);
    public static final k6 h = new k6("TRANSACTION_SERIALIZABLE", 4, 8);
    public static final k6 e = new k6("TRANSACTION_SQL_SERVER_SNAPSHOT_ISOLATION_LEVEL", 5, 4096);
    private final int b;
    private static final /* synthetic */ k6[] c;

    public static k6[] values() {
        return (k6[])c.clone();
    }

    public static k6 a(String string) {
        return Enum.valueOf(k6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k6() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.b = var3_1;
    }

    public int a() {
        return this.b;
    }

    static {
        c = new k6[]{a, f, d, g, h, e};
    }
}

