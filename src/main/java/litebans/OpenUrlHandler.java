package litebans;

public final class OpenUrlHandler
extends Enum {
    public static final OpenUrlHandler e;
    public static final OpenUrlHandler LiteBansModule_31;
    public static final OpenUrlHandler g;
    public static final OpenUrlHandler BaseCoreGenericHandler;
    public static final OpenUrlHandler AsyncBackgroundTask_5;
    public static final OpenUrlHandler c;
    private static final /* synthetic */ OpenUrlHandler[] LiteBansModule_241;
        public static OpenUrlHandler[] values() {
        return (OpenUrlHandler[])LiteBansModule_241.clone();
    }

    public static OpenUrlHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(OpenUrlHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OpenUrlHandler() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ OpenUrlHandler[] BaseCoreGenericHandler() {
        return new OpenUrlHandler[]{e, LiteBansModule_31, g, BaseCoreGenericHandler, AsyncBackgroundTask_5, c};
    }

    static {
        OpenUrlHandler.LiteBansModule_31();
        e = new OpenUrlHandler("OPEN_URL", 0);
        LiteBansModule_31 = new OpenUrlHandler("OPEN_FILE", 1);
        g = new OpenUrlHandler("RUN_COMMAND", 2);
        BaseCoreGenericHandler = new OpenUrlHandler("SUGGEST_COMMAND", 3);
        AsyncBackgroundTask_5 = new OpenUrlHandler("CHANGE_PAGE", 4);
        c = new OpenUrlHandler("COPY_TO_CLIPBOARD", 5);
        LiteBansModule_241 = OpenUrlHandler.BaseCoreGenericHandler();
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_195 = new String[]{"OPEN_URL", "OPEN_FILE", "RUN_COMMAND", "SUGGEST_COMMAND", "CHANGE_PAGE", "COPY_TO_CLIPBOARD"};
    }
}

