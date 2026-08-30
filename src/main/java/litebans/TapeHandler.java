package litebans;

public final class TapeHandler
extends Enum {
    public static final TapeHandler c = new TapeHandler("TAPE", 0, 1);
    public static final TapeHandler LiteBansModule_194 = new TapeHandler("INODE", 1, 2);
    public static final TapeHandler LiteBansModule_240 = new TapeHandler("BITS", 2, 3);
    public static final TapeHandler LiteBansModule_31 = new TapeHandler("ADDR", 3, 4);
    public static final TapeHandler BaseCoreGenericHandler = new TapeHandler("END", 4, 5);
    public static final TapeHandler AsyncBackgroundTask_5 = new TapeHandler("CLRI", 5, 6);
    int g;
    private static final /* synthetic */ TapeHandler[] e;

    public static final TapeHandler[] values() {
        return (TapeHandler[])e.clone();
    }

    public static final TapeHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(TapeHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TapeHandler() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
    }

    public static final TapeHandler BaseCoreGenericHandler(int n) {
        for (TapeHandler ao2 : TapeHandler.values()) {
            if (ao2.g != n) continue;
            return ao2;
        }
        return null;
    }

    static {
        e = new TapeHandler[]{c, LiteBansModule_194, LiteBansModule_240, LiteBansModule_31, BaseCoreGenericHandler, AsyncBackgroundTask_5};
    }
}

