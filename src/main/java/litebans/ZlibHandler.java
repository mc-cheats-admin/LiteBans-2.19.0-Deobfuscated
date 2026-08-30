package litebans;

public final class ZlibHandler
extends Enum {
    public static final ZlibHandler c = new ZlibHandler("ZLIB", 0, 0);
    public static final ZlibHandler LiteBansModule_31 = new ZlibHandler("BZLIB", 1, 1);
    public static final ZlibHandler AsyncBackgroundTask_5 = new ZlibHandler("LZO", 2, 2);
    int BaseCoreGenericHandler;
    private static final /* synthetic */ ZlibHandler[] e;

    public static final ZlibHandler[] values() {
        return (ZlibHandler[])e.clone();
    }

    public static final ZlibHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(ZlibHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZlibHandler() {
        void arg1;
        void var2_-1;
        void var1_-1;
        this.plugin = arg1;
    }

    public static final ZlibHandler BaseCoreGenericHandler(int n) {
        for (ZlibHandler fx_02 : ZlibHandler.values()) {
            if (fx_02.BaseCoreGenericHandler != n) continue;
            return fx_02;
        }
        return null;
    }

    static {
        e = new ZlibHandler[]{c, LiteBansModule_31, AsyncBackgroundTask_5};
}

