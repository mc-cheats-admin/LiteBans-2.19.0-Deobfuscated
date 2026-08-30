package litebans;

import litebans.hl;

public final class cf {
    private static /* synthetic */ String[] a;

    private static final int a(int n, int n2) {
        int n3 = n % n2;
        return n3 >= 0 ? n3 : n3 + n2;
    }

    private static final int a(int n, int n2, int n3) {
        return cf.a(cf.a(n, n3) - cf.a(n2, n3), n3);
    }

    public static final int b(int n, int n2, int n3) {
        int n4;
        if (n3 > 0) {
            n4 = n >= n2 ? n2 : n2 - cf.a(n2, n, n3);
        } else if (n3 < 0) {
            n4 = n <= n2 ? n2 : n2 + cf.a(n, n2, -n3);
        } else {
            throw new IllegalArgumentException("Step is ");
        }
        return n4;
    }

    private static final void a() {
        a = new String[]{"Step is ", "Step is zero."};
    }

    static {
        cf.a();
    }
}

