package litebans;

public final class ShowTextHandler
extends Enum {
    public static final ShowTextHandler c;
    private static final /* synthetic */ ShowTextHandler[] LiteBansModule_31;
    public static ShowTextHandler[] values() {
        return (ShowTextHandler[])LiteBansModule_31.clone();
    }

    public static ShowTextHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(ShowTextHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ShowTextHandler() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ ShowTextHandler[] BaseCoreGenericHandler() {
        return new ShowTextHandler[]{c};
    }

    static {
        ShowTextHandler.LiteBansModule_31();
        c = new ShowTextHandler("SHOW_TEXT", 0);
        LiteBansModule_31 = ShowTextHandler.BaseCoreGenericHandler();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"SHOW_TEXT"};
}

