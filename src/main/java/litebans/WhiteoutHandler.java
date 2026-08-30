package litebans;

public final class WhiteoutHandler
extends Enum {
    public static final WhiteoutHandler g = new WhiteoutHandler("WHITEOUT", 0, 14);
    public static final WhiteoutHandler GnuSparseMapHandler = new WhiteoutHandler("SOCKET", 1, 12);
    public static final WhiteoutHandler BaseCoreGenericHandler = new WhiteoutHandler("LINK", 2, 10);
    public static final WhiteoutHandler AsyncBackgroundTask_5 = new WhiteoutHandler("FILE", 3, 8);
    public static final WhiteoutHandler LiteBansModule_194 = new WhiteoutHandler("BLKDEV", 4, 6);
    public static final WhiteoutHandler LiteBansModule_31 = new WhiteoutHandler("DIRECTORY", 5, 4);
    public static final WhiteoutHandler Utf8Handler_2 = new WhiteoutHandler("CHRDEV", 6, 2);
    public static final WhiteoutHandler c = new WhiteoutHandler("FIFO", 7, 1);
    public static final WhiteoutHandler e = new WhiteoutHandler("UNKNOWN", 8, 15);
    private int LiteBansModule_240;
    private static final /* synthetic */ WhiteoutHandler[] i;

    public static final WhiteoutHandler[] values() {
        return (WhiteoutHandler[])i.clone();
    }

    public static final WhiteoutHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(WhiteoutHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WhiteoutHandler() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.LiteBansModule_240 = var3_1;
    }

    public static final WhiteoutHandler BaseCoreGenericHandler(int n) {
        WhiteoutHandler lh_02 = e;
        for (WhiteoutHandler lh_03 : WhiteoutHandler.values()) {
            if (n != lh_03.LiteBansModule_240) continue;
            lh_02 = lh_03;
        }
        return lh_02;
    }

    static {
        i = new WhiteoutHandler[]{g, GnuSparseMapHandler, BaseCoreGenericHandler, AsyncBackgroundTask_5, LiteBansModule_194, LiteBansModule_31, Utf8Handler_2, c, e};
    }
}

