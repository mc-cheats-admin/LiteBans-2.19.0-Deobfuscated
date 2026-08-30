package litebans;

public final class ContinueEvictHandler
extends Enum {
    public static final ContinueEvictHandler LiteBansModule_31 = new ContinueEvictHandler("CONTINUE_EVICT", 0);
    public static final ContinueEvictHandler c = new ContinueEvictHandler("DO_NOT_EVICT", 1);
    private static final /* synthetic */ ContinueEvictHandler[] BaseCoreGenericHandler;

    public static ContinueEvictHandler[] values() {
        return (ContinueEvictHandler[])BaseCoreGenericHandler.clone();
    }

    public static ContinueEvictHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(ContinueEvictHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ContinueEvictHandler() {
        void var2_-1;
        void var1_-1;
    }

    static {
        BaseCoreGenericHandler = new ContinueEvictHandler[]{LiteBansModule_31, c};
    }
}

