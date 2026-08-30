package litebans;

import litebans.aJ;

public static class iX {
    private final long[] a;

    public iX(long l3) {
        long[] lArray = new long[]{l3, l3};
        this.a = lArray;
    }

    public /* synthetic */ iX(long l3, int n, aJ aJ2) {
        if ((n & 1) != 0) {
            l3 = System.nanoTime();
        }
        this(l3);
    }

    public final long[] c() {
        return this.a;
    }

    public final void a(long l3) {
        this.a(l3, l3);
    }

    public final void a(long l3, long l5) {
        this.a[0] = l3;
        this.a[1] = l5;
    }

    public final long b() {
        long l3 = this.a[0];
        long l5 = this.a[1];
        l3 ^= l3 << 23;
        l3 = l3 ^ l5 ^ (l3 >> 17 ^ l5 >> 26);
        this.a(l5, l3);
        return l3 + l5;
    }

    public int a(int n) {
        if (!(n > 0)) {
            boolean bl = false;
            String string = String.valueOf(n);
            throw new IllegalArgumentException(string.toString());
        }
        return (int)Math.abs(this.b() % (long)n);
    }

    public final int b(int n) {
        return (int)Math.abs(this.b() % (long)n);
    }

    public final boolean a() {
        return this.b(2) == 0;
    }

    public iX() {
        this(0L, 1, null);
    }
}

