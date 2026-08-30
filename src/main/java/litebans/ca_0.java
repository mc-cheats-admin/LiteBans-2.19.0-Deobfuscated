package litebans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from litebans.ca
 */
public static final class ca_0
extends Enum {
    public static final ca_0 a = new ca_0("DES", 0, 26113);
    public static final ca_0 l = new ca_0("RC2pre52", 1, 26114);
    public static final ca_0 c = new ca_0("TripleDES168", 2, 26115);
    public static final ca_0 h = new ca_0("TripleDES192", 3, 26121);
    public static final ca_0 m = new ca_0("AES128", 4, 26126);
    public static final ca_0 d = new ca_0("AES192", 5, 26127);
    public static final ca_0 b = new ca_0("AES256", 6, 26128);
    public static final ca_0 e = new ca_0("RC2", 7, 26370);
    public static final ca_0 g = new ca_0("RC4", 8, 26625);
    public static final ca_0 j = new ca_0("UNKNOWN", 9, 65535);
    private final int f;
    private static final Map k;
    private static final /* synthetic */ ca_0[] i;

    public static final ca_0[] values() {
        return (ca_0[])i.clone();
    }

    public static final ca_0 a(String string) {
        return Enum.valueOf(ca_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ca_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.f = var3_1;
    }

    public int a() {
        return this.f;
    }

    public static final ca_0 a(int n) {
        return (ca_0)((Object)k.get(n));
    }

    static {
        i = new ca_0[]{a, l, c, h, m, d, b, e, g, j};
        HashMap<Integer, ca_0> hashMap = new HashMap<Integer, ca_0>();
        for (ca_0 ca_02 : ca_0.values()) {
            hashMap.put(ca_02.a(), ca_02);
        }
        k = Collections.unmodifiableMap(hashMap);
    }
}

