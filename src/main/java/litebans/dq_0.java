package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from litebans.dq
 */
public static final class dq_0
extends Enum {
    public static final dq_0 j;
    public static final dq_0 v;
    public static final dq_0 d;
    public static final dq_0 m;
    public static final dq_0 k;
    public static final dq_0 e;
    public static final dq_0 l;
    public static final dq_0 u;
    public static final dq_0 o;
    public static final dq_0 c;
    public static final dq_0 b;
    public static final dq_0 q;
    public static final dq_0 s;
    public static final dq_0 r;
    public static final dq_0 p;
    public static final dq_0 f;
    public static final dq_0 t;
    public static final dq_0 g;
    public static final dq_0 i;
    static final int n;
    private final int a;
    private static final Map h;
    private static final /* synthetic */ dq_0[] w;

    public static final dq_0[] values() {
        return (dq_0[])w.clone();
    }

    public static final dq_0 a(String string) {
        return Enum.valueOf(dq_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dq_0() {
        this((String)var1_-1, (int)var2_-1, -1);
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dq_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.a = var3_1;
    }

    public int a() {
        return this.a;
    }

    public static final dq_0 a(int n) {
        return (dq_0)((Object)h.get(n));
    }

    static {
        n = -1;
        j = new dq_0("STORED", 0, 0);
        v = new dq_0("UNSHRINKING", 1, 1);
        d = new dq_0("EXPANDING_LEVEL_1", 2, 2);
        m = new dq_0("EXPANDING_LEVEL_2", 3, 3);
        k = new dq_0("EXPANDING_LEVEL_3", 4, 4);
        e = new dq_0("EXPANDING_LEVEL_4", 5, 5);
        l = new dq_0("IMPLODING", 6, 6);
        u = new dq_0("TOKENIZATION", 7, 7);
        o = new dq_0("DEFLATED", 8, 8);
        c = new dq_0("ENHANCED_DEFLATED", 9, 9);
        b = new dq_0("PKWARE_IMPLODING", 10, 10);
        q = new dq_0("BZIP2", 11, 12);
        s = new dq_0("LZMA", 12, 14);
        r = new dq_0("XZ", 13, 95);
        p = new dq_0("JPEG", 14, 96);
        f = new dq_0("WAVPACK", 15, 97);
        t = new dq_0("PPMD", 16, 98);
        g = new dq_0("AES_ENCRYPTED", 17, 99);
        i = new dq_0("UNKNOWN", 18);
        w = new dq_0[]{j, v, d, m, k, e, l, u, o, c, b, q, s, r, p, f, t, g, i};
        HashMap<Integer, dq_0> hashMap = new HashMap<Integer, dq_0>();
        for (dq_0 dq_02 : dq_0.values()) {
            hashMap.put(dq_02.a(), dq_02);
        }
        h = Collections.unmodifiableMap(hashMap);
    }
}

