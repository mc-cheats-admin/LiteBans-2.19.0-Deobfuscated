package litebans;

public final class V116Handler
extends Enum {
    public static final V116Handler c;
    public static final V116Handler BaseCoreGenericHandler;
    private static final /* synthetic */ V116Handler[] LiteBansModule_31;
    public static V116Handler[] values() {
        return (V116Handler[])LiteBansModule_31.clone();
    }

    public static V116Handler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(V116Handler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private V116Handler() {
        void var2_-1;
        void var1_-1;
    }

    private static final /* synthetic */ V116Handler[] BaseCoreGenericHandler() {
        return new V116Handler[]{c, BaseCoreGenericHandler};
    }

    static {
        V116Handler.LiteBansModule_31();
        c = new V116Handler("V1_16", 0);
        BaseCoreGenericHandler = new V116Handler("V1_21_5", 1);
        LiteBansModule_31 = V116Handler.BaseCoreGenericHandler();
    }

    private static final void LiteBansModule_31() {
        AsyncBackgroundTask_5 = new String[]{"V1_16", "V1_21_5"};
}

