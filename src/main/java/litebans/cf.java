package litebans;

import litebans.hl;

public static final class cf {
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
            throw new IllegalArgumentException(a[0]);
        }
        return n4;
    }

    private static final void a() {
        a = new String[]{hl.a("\ud40c\ud42b\ud43a\ud42f\ud47f\ud436\ud42c\ud47f\ud425\ud43a\ud42d\ud430\ud471", 942986335), hl.a("\u8d30\u8d17\u8d06\u8d13\u8d43\u8d0a\u8d10\u8d43\u8d19\u8d06\u8d11\u8d0c\u8d4d", -251556509)};
    }

    static {
        cf.a();
    }
}

