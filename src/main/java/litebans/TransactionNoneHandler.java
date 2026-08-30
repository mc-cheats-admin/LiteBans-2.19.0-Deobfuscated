package litebans;

public final class TransactionNoneHandler
extends Enum {
    public static final TransactionNoneHandler BaseCoreGenericHandler = new TransactionNoneHandler("TRANSACTION_NONE", 0, 0);
    public static final TransactionNoneHandler LiteBansModule_195 = new TransactionNoneHandler("TRANSACTION_READ_UNCOMMITTED", 1, 1);
    public static final TransactionNoneHandler AsyncBackgroundTask_5 = new TransactionNoneHandler("TRANSACTION_READ_COMMITTED", 2, 2);
    public static final TransactionNoneHandler g = new TransactionNoneHandler("TRANSACTION_REPEATABLE_READ", 3, 4);
    public static final TransactionNoneHandler LiteBansModule_241 = new TransactionNoneHandler("TRANSACTION_SERIALIZABLE", 4, 8);
    public static final TransactionNoneHandler e = new TransactionNoneHandler("TRANSACTION_SQL_SERVER_SNAPSHOT_ISOLATION_LEVEL", 5, 4096);
    private final int LiteBansModule_31;
    private static final /* synthetic */ TransactionNoneHandler[] c;

    public static TransactionNoneHandler[] values() {
        return (TransactionNoneHandler[])c.clone();
    }

    public static TransactionNoneHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(TransactionNoneHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TransactionNoneHandler() {
        void v1;
        void var2_-1;
        void var1_-1;
        this.LiteBansModule_31 = v1;
    }

    public int BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    static {
        c = new TransactionNoneHandler[]{BaseCoreGenericHandler, LiteBansModule_195, AsyncBackgroundTask_5, g, LiteBansModule_241, e};
    }
}

