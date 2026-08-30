package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class NoneHandler
extends Enum {
    public static final NoneHandler g = new NoneHandler("NONE", 0, 0);
    public static final NoneHandler LiteBansModule_31 = new NoneHandler("CRC32", 1, 1);
    public static final NoneHandler i = new NoneHandler("MD5", 2, 32771);
    public static final NoneHandler BaseCoreGenericHandler = new NoneHandler("SHA1", 3, 32772);
    public static final NoneHandler c = new NoneHandler("RIPEND160", 4, 32775);
    public static final NoneHandler LiteBansModule_194 = new NoneHandler("SHA256", 5, 32780);
    public static final NoneHandler GnuSparseMapHandler = new NoneHandler("SHA384", 6, 32781);
    public static final NoneHandler Utf8Handler_2 = new NoneHandler("SHA512", 7, 32782);
    private final int e;
    private static final Map AsyncBackgroundTask_5;
    private static final /* synthetic */ NoneHandler[] LiteBansModule_240;

    public static final NoneHandler[] values() {
        return (NoneHandler[])LiteBansModule_240.clone();
    }

    public static final NoneHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(NoneHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NoneHandler() {
        void arg1;
        void var2_-1;
        void var1_-1;
        this.e = arg1;
    }

    public int BaseCoreGenericHandler() {
        return this.e;
    }

    public static final NoneHandler BaseCoreGenericHandler(int n) {
        return (NoneHandler)((Object)AsyncBackgroundTask_5.get(n));
    }

    static {
        LiteBansModule_240 = new NoneHandler[]{g, LiteBansModule_31, i, BaseCoreGenericHandler, c, LiteBansModule_194, GnuSparseMapHandler, Utf8Handler_2};
        HashMap<Integer, NoneHandler> hashMap = new HashMap<Integer, NoneHandler>();
        for (NoneHandler bj_02 : NoneHandler.values()) {
            hashMap.put(bj_02.BaseCoreGenericHandler(), bj_02);
        }
        AsyncBackgroundTask_5 = Collections.unmodifiableMap(hashMap);
}

