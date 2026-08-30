package litebans;

import java.io.Serializable;
import java.math.BigInteger;

public final class iw_0
implements Serializable {
    private static final long k;
    private static final int i;
    private static final int s;
    private static final int z;
    private static final int g;
    private static final int r;
    private static final int m;
    private static final int v;
    private static final long p;
    private static final int f;
    private static final int u;
    private static final long w;
    private static final int l;
    private static final int n;
    private static final long x;
    private static final int q;
    private static final int j;
    private static final long d;
    private static final int c;
    private static final int b;
    private static final long t;
    private static final int e;
    private static final int o;
    private static final byte y;
    private final BigInteger h;
    public static final iw_0 a;

    public iw_0(long l3) {
        this(BigInteger.valueOf(l3));
    }

    public iw_0(BigInteger bigInteger) {
        this.h = bigInteger;
    }

    public iw_0(byte[] byArray, int n) {
        this.h = iw_0.b(byArray, n);
    }

    public byte[] c() {
        return iw_0.a(this.h);
    }

    public long b() {
        return this.h.longValue();
    }

    public BigInteger a() {
        return this.h;
    }

    public static final byte[] a(BigInteger bigInteger) {
        byte[] byArray = new byte[8];
        long l3 = bigInteger.longValue();
        byArray[0] = (byte)(l3 & 0xFFL);
        byArray[1] = (byte)((l3 & 0xFF00L) >> 8);
        byArray[2] = (byte)((l3 & 0xFF0000L) >> 16);
        byArray[3] = (byte)((l3 & 0xFF000000L) >> 24);
        byArray[4] = (byte)((l3 & 0xFF00000000L) >> 32);
        byArray[5] = (byte)((l3 & 0xFF0000000000L) >> 40);
        byArray[6] = (byte)((l3 & 0xFF000000000000L) >> 48);
        byArray[7] = (byte)((l3 & 0x7F00000000000000L) >> 56);
        if (bigInteger.testBit(63)) {
            byArray[7] = (byte)(byArray[7] | 0xFFFFFF80);
        }
        return byArray;
    }

    public static final long a(byte[] byArray, int n) {
        return iw_0.b(byArray, n).longValue();
    }

    public static final BigInteger b(byte[] byArray, int n) {
        long l3 = (long)byArray[n + 7] << 56 & 0x7F00000000000000L;
        l3 += (long)byArray[n + 6] << 48 & 0xFF000000000000L;
        l3 += (long)byArray[n + 5] << 40 & 0xFF0000000000L;
        l3 += (long)byArray[n + 4] << 32 & 0xFF00000000L;
        l3 += (long)byArray[n + 3] << 24 & 0xFF000000L;
        l3 += (long)byArray[n + 2] << 16 & 0xFF0000L;
        l3 += (long)byArray[n + 1] << 8 & 0xFF00L;
        BigInteger bigInteger = BigInteger.valueOf(l3 += (long)byArray[n] & 0xFFL);
        return (byArray[n + 7] & 0xFFFFFF80) == -128 ? bigInteger.setBit(63) : bigInteger;
    }

    public static final long a(byte[] byArray) {
        return iw_0.a(byArray, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof iw_0)) {
            return false;
        }
        return this.h.equals(((iw_0)object).a());
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.h;
    }

    static {
        y = (byte)-128;
        o = 63;
        e = 56;
        t = 0x7F00000000000000L;
        b = 7;
        c = 48;
        d = 0xFF000000000000L;
        j = 6;
        q = 40;
        x = 0xFF0000000000L;
        n = 5;
        l = 32;
        w = 0xFF00000000L;
        u = 4;
        f = 24;
        p = 0xFF000000L;
        v = 3;
        m = 16;
        r = 0xFF0000;
        g = 2;
        z = 8;
        s = 65280;
        i = 1;
        k = 1L;
        a = new iw_0(0L);
    }
}

