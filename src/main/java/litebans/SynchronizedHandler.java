package litebans;

public final class SynchronizedHandler
extends Enum {
    public static final SynchronizedHandler e;
    public static final SynchronizedHandler AsyncBackgroundTask_5;
    public static final SynchronizedHandler BaseCoreGenericHandler;
    private static final /* synthetic */ SynchronizedHandler[] LiteBansModule_195;
    private static final /* synthetic */ LiteBansModule_374 LiteBansModule_31;
        /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SynchronizedHandler() {
        void var2_-1;
        void var1_-1;
    }

    public static SynchronizedHandler[] values() {
        return (SynchronizedHandler[])LiteBansModule_195.clone();
    }

    public static SynchronizedHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(SynchronizedHandler.class, string);
    }

    static {
        SynchronizedHandler.LiteBansModule_31();
        e = new SynchronizedHandler("SYNCHRONIZED", 0);
        AsyncBackgroundTask_5 = new SynchronizedHandler("PUBLICATION", 1);
        BaseCoreGenericHandler = new SynchronizedHandler("NONE", 2);
        LiteBansModule_195 = l4Array = new SynchronizedHandler[]{SynchronizedHandler.e, SynchronizedHandler.AsyncBackgroundTask_5, SynchronizedHandler.BaseCoreGenericHandler};
        LiteBansModule_31 = EntriesHandler_3.BaseCoreGenericHandler(LiteBansModule_195);
    }

    private static final void LiteBansModule_31() {
        c = new String[]{"SYNCHRONIZED", "PUBLICATION", "NONE"};
    }
}

