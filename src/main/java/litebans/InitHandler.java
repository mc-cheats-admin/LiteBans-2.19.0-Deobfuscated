package litebans;

public final class InitHandler
extends Enum {
    public static final InitHandler LiteBansModule_240;
    public static final InitHandler LiteBansModule_194;
    public static final InitHandler BaseCoreGenericHandler;
    public static final InitHandler i;
    public static final InitHandler c;
    public static final InitHandler e;
    public static final InitHandler LiteBansModule_31;
    public static final InitHandler g;
    private static final /* synthetic */ InitHandler[] AsyncBackgroundTask_5;
    public static InitHandler[] values() {
        return (InitHandler[])AsyncBackgroundTask_5.clone();
    }

    public static InitHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(InitHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InitHandler() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ InitHandler[] LiteBansModule_31() {
        return new InitHandler[]{LiteBansModule_240, LiteBansModule_194, BaseCoreGenericHandler, i, c, e, LiteBansModule_31, g};
    }

    static {
        InitHandler.BaseCoreGenericHandler();
        LiteBansModule_240 = new InitHandler("INIT", 0);
        LiteBansModule_194 = new InitHandler("PRE_TARGET", 1);
        BaseCoreGenericHandler = new InitHandler("POST_TARGET", 2);
        i = new InitHandler("ENTRY_CREATED", 3);
        c = new InitHandler("ENTRY_EMITTED", 4);
        e = new InitHandler("ENTRY_APPLIED", 5);
        LiteBansModule_31 = new InitHandler("FINALIZED", 6);
        g = new InitHandler("CANCELLED", 7);
        AsyncBackgroundTask_5 = InitHandler.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"INIT", "PRE_TARGET", "POST_TARGET", "ENTRY_CREATED", "ENTRY_EMITTED", "ENTRY_APPLIED", "FINALIZED", "CANCELLED"};
    }
}

