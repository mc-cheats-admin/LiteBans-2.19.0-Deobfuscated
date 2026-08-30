package litebans;

public final class NameHandler
extends Enum {
    public static final NameHandler BaseCoreGenericHandler = new NameHandler("NAME", 0);
    public static final NameHandler AsyncBackgroundTask_5 = new NameHandler("NAME_WITH_EFS_FLAG", 1);
    public static final NameHandler c = new NameHandler("UNICODE_EXTRA_FIELD", 2);
    private static final /* synthetic */ NameHandler[] LiteBansModule_31;

    public static final NameHandler[] values() {
        return (NameHandler[])LiteBansModule_31.clone();
    }

    public static final NameHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(NameHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NameHandler() {
        void var2_-1;
        void var1_-1;
    }

    static {
        LiteBansModule_31 = new NameHandler[]{BaseCoreGenericHandler, AsyncBackgroundTask_5, c};
}

