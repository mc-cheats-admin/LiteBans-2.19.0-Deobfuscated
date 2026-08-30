package litebans;

import litebans.aJ;

public static final class bE {
    private final int b;
    private final int c;
    private final int a;

    public bE(int n, int n2, int n3) {
        this.b = n;
        this.c = n2;
        this.a = n3;
    }

    public /* synthetic */ bE(int n, int n2, int n3, int n4, aJ aJ2) {
        if ((n4 & 1) != 0) {
            n = 0;
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = 0;
        }
        this(n, n2, n3);
    }

    public final int c() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int a() {
        return this.a;
    }

    public bE() {
        this(0, 0, 0, 7, null);
    }
}

