package litebans;

public final class CommentHandler
extends Enum {
    public static final CommentHandler c = new CommentHandler("COMMENT", 0);
    public static final CommentHandler BaseCoreGenericHandler = new CommentHandler("UNICODE_EXTRA_FIELD", 1);
    private static final /* synthetic */ CommentHandler[] LiteBansModule_31;

    public static final CommentHandler[] values() {
        return (CommentHandler[])LiteBansModule_31.clone();
    }

    public static final CommentHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(CommentHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CommentHandler() {
        void var2_-1;
        void var1_-1;
    }

    static {
        LiteBansModule_31 = new CommentHandler[]{c, BaseCoreGenericHandler};
    }
}

