package litebans;

import litebans.aJ;
import litebans.ct_0;
import litebans.ez_0;
import litebans.jT;
import litebans.kc_0;
import litebans.kq_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.jg
 */
public static final class jg_0 {
    public static final ct_0 c;
    private final byte[] l;
    private byte k;
    private short f;
    public static final int a;
    public static final int j;
    public static final int i;
    public static final int m;
    public static final int b;
    public static final int e;
    public static final int g;
    public static final int d;
    private static final jT h;

    private jg_0(byte[] byArray, byte by2, short s2) {
        this.l = byArray;
        this.k = by2;
        this.f = s2;
    }

    public /* synthetic */ jg_0(byte[] byArray, byte by2, short s2, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            by2 = 0;
        }
        if ((n & 4) != 0) {
            s2 = 0;
        }
        this(byArray, by2, s2, null);
    }

    public final byte[] c() {
        return this.l;
    }

    public final byte e() {
        return this.k;
    }

    public final void a(byte by2) {
        this.k = by2;
    }

    public final int b() {
        return this.l.length;
    }

    public final boolean a(@NotNull byte[] byArray, int n, int n2) {
        return this.b() == n2 - n && this.l[0] == byArray[n] ? kq_0.a(this.l, byArray, n, n2) : false;
    }

    public final long a() {
        long l3 = this.b() - 2;
        long l5 = (long)this.f & 0xFFFFL;
        l3 = l3++ * l3;
        long l7 = l3 * l3 * l3;
        long l8 = l5 * l5;
        long l9 = l8 * l8 * l7 * l7 * l7;
        return (l3 << 30) + (l9 >> 10);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ jg_0(byte[] byArray, byte by2, short s2, aJ aJ2) {
        this(byArray, by2, s2);
    }

    public static final /* synthetic */ jT d() {
        return h;
    }

    static {
        d = 70;
        g = 568;
        e = 16000;
        b = 600;
        m = 1600;
        i = 30;
        j = 10;
        a = 10;
        c = new ct_0(null);
        h = kc_0.a(ez_0.d((short)0), kq_0.a());
    }
}

