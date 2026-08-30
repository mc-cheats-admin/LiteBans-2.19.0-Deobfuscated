package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class DesHandler
extends Enum {
    public static final DesHandler BaseCoreGenericHandler = new DesHandler("DES", 0, 26113);
    public static final DesHandler LiteBansModule_401 = new DesHandler("RC2pre52", 1, 26114);
    public static final DesHandler c = new DesHandler("TripleDES168", 2, 26115);
    public static final DesHandler LiteBansModule_240 = new DesHandler("TripleDES192", 3, 26121);
    public static final DesHandler m = new DesHandler("AES128", 4, 26126);
    public static final DesHandler AsyncBackgroundTask_5 = new DesHandler("AES192", 5, 26127);
    public static final DesHandler LiteBansModule_31 = new DesHandler("AES256", 6, 26128);
    public static final DesHandler e = new DesHandler("RC2", 7, 26370);
    public static final DesHandler g = new DesHandler("RC4", 8, 26625);
    public static final DesHandler GnuSparseMapHandler = new DesHandler("UNKNOWN", 9, 65535);
    private final int LiteBansModule_194;
    private static final Map Utf8Handler_2;
    private static final /* synthetic */ DesHandler[] i;

    public static final DesHandler[] values() {
        return (DesHandler[])i.clone();
    }

    public static final DesHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(DesHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DesHandler() {
        void arg1;
        void var2_-1;
        void var1_-1;
        this.LiteBansModule_194 = arg1;
    }

    public int BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    public static final DesHandler BaseCoreGenericHandler(int n) {
        return (DesHandler)(Utf8Handler_2.get(n));
    }

    static {
        i = new DesHandler[]{BaseCoreGenericHandler, LiteBansModule_401, c, LiteBansModule_240, m, AsyncBackgroundTask_5, LiteBansModule_31, e, g, GnuSparseMapHandler};
        HashMap<Integer, DesHandler> hashMap = new HashMap<Integer, DesHandler>();
        for (DesHandler ca_02 : DesHandler.values()) {
            hashMap.put(ca_02.BaseCoreGenericHandler(), ca_02);
        }
        Utf8Handler_2 = Collections.unmodifiableMap(hashMap);
}

