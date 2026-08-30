package litebans;

public final class UuidHandler
extends Enum {
    public static final UuidHandler g;
    public static final UuidHandler e;
    public static final UuidHandler AsyncBackgroundTask_5;
    public static final UuidHandler c;
    private static final /* synthetic */ UuidHandler[] BaseCoreGenericHandler;
    private static final /* synthetic */ LiteBansModule_374 LiteBansModule_31;
        /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UuidHandler() {
        void var2_-1;
        void var1_-1;
    }

    public static UuidHandler[] values() {
        return (UuidHandler[])BaseCoreGenericHandler.clone();
    }

    public static UuidHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(UuidHandler.class, string);
    }

    static {
        UuidHandler.BaseCoreGenericHandler();
        g = new UuidHandler("UUID", 0);
        e = new UuidHandler("EXECUTOR_UUID", 1);
        AsyncBackgroundTask_5 = new UuidHandler("ID", 2);
        c = new UuidHandler("CUSTOM", 3);
        BaseCoreGenericHandler = jRArray = new UuidHandler[]{UuidHandler.g, UuidHandler.e, UuidHandler.AsyncBackgroundTask_5, UuidHandler.c};
        LiteBansModule_31 = EntriesHandler_3.BaseCoreGenericHandler(BaseCoreGenericHandler);
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_195 = new String[]{"UUID", "EXECUTOR_UUID", "ID", "CUSTOM"};
    }
}

