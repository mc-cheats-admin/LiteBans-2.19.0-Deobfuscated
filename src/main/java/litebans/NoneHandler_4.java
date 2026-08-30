package litebans;

public final class NoneHandler_4
extends Enum {
    public static final NoneHandler_4 LiteBansModule_31;
    public static final NoneHandler_4 e;
    public static final NoneHandler_4 AsyncBackgroundTask_5;
    public static final NoneHandler_4 LiteBansModule_194;
    private static final /* synthetic */ NoneHandler_4[] c;
    public static NoneHandler_4[] values() {
        return (NoneHandler_4[])c.clone();
    }

    public static NoneHandler_4 BaseCoreGenericHandler(String string) {
        return Enum.valueOf(NoneHandler_4.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NoneHandler_4() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ NoneHandler_4[] BaseCoreGenericHandler() {
        return new NoneHandler_4[]{LiteBansModule_31, e, AsyncBackgroundTask_5, LiteBansModule_194};
    }

    static {
        NoneHandler_4.LiteBansModule_31();
        LiteBansModule_31 = new NoneHandler_4("NONE", 0);
        e = new NoneHandler_4("FORMATTING", 1);
        AsyncBackgroundTask_5 = new NoneHandler_4("EVENTS", 2);
        LiteBansModule_194 = new NoneHandler_4("ALL", 3);
        c = NoneHandler_4.BaseCoreGenericHandler();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"NONE", "FORMATTING", "EVENTS", "ALL"};
}

