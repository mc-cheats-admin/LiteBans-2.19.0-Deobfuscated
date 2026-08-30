package litebans;

public final class DeleteHandler
extends Enum {
    public static final DeleteHandler c;
    public static final DeleteHandler LiteBansModule_31;
    public static final DeleteHandler e;
    private static final /* synthetic */ DeleteHandler[] AsyncBackgroundTask_5;
    private static final /* synthetic */ LiteBansModule_374 BaseCoreGenericHandler;
        /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DeleteHandler() {
        void var2_-1;
        void var1_-1;
    }

    public static DeleteHandler[] values() {
        return (DeleteHandler[])AsyncBackgroundTask_5.clone();
    }

    public static DeleteHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(DeleteHandler.class, string);
    }

    static {
        DeleteHandler.BaseCoreGenericHandler();
        c = new DeleteHandler("DELETE", 0);
        LiteBansModule_31 = new DeleteHandler("DEACTIVATE", 1);
        e = new DeleteHandler("PRUNE", 2);
        AsyncBackgroundTask_5 = jZArray = new DeleteHandler[]{DeleteHandler.c, DeleteHandler.LiteBansModule_31, DeleteHandler.e};
        BaseCoreGenericHandler = EntriesHandler_3.BaseCoreGenericHandler(AsyncBackgroundTask_5);
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_195 = new String[]{"DELETE", "DEACTIVATE", "PRUNE"};
    }
}

