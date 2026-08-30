package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from litebans.bJ
 */
public static final class bj_0
extends Enum {
    public static final bj_0 g = new bj_0("NONE", 0, 0);
    public static final bj_0 b = new bj_0("CRC32", 1, 1);
    public static final bj_0 i = new bj_0("MD5", 2, 32771);
    public static final bj_0 a = new bj_0("SHA1", 3, 32772);
    public static final bj_0 c = new bj_0("RIPEND160", 4, 32775);
    public static final bj_0 f = new bj_0("SHA256", 5, 32780);
    public static final bj_0 j = new bj_0("SHA384", 6, 32781);
    public static final bj_0 k = new bj_0("SHA512", 7, 32782);
    private final int e;
    private static final Map d;
    private static final /* synthetic */ bj_0[] h;

    public static final bj_0[] values() {
        return (bj_0[])h.clone();
    }

    public static final bj_0 a(String string) {
        return Enum.valueOf(bj_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bj_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.e = var3_1;
    }

    public int a() {
        return this.e;
    }

    public static final bj_0 a(int n) {
        return (bj_0)((Object)d.get(n));
    }

    static {
        h = new bj_0[]{g, b, i, a, c, f, j, k};
        HashMap<Integer, bj_0> hashMap = new HashMap<Integer, bj_0>();
        for (bj_0 bj_02 : bj_0.values()) {
            hashMap.put(bj_02.a(), bj_02);
        }
        d = Collections.unmodifiableMap(hashMap);
    }
}

