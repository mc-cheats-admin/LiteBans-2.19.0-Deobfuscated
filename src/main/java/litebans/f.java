package litebans;

import java.io.InputStream;
import litebans.e_0;
import litebans.ja_0;

public static class f
extends e_0 {
    private final InputStream y;
    private long o = 0L;
    private boolean e;
    private ja_0 x = null;
    private byte[] f = null;
    private long z = -1L;
    private static final int u;
    private static final int l;
    private static final int v;
    private static final int w;
    private static final int j;
    private static final int m;
    private static final int s;
    private static final int i;
    private static final int g;
    private static final int n;
    private static final int t;
    private static final int p;
    private final byte[] k = new byte[58];
    static final String A;
    private static final int q;
    private static final String h;
    private static final String d;
    private static final String r;

    public f(InputStream inputStream) {
        this.y = inputStream;
        this.e = false;
    }

    @Override
    public void close() {
        if (!this.e) {
            this.e = true;
            this.y.close();
        }
        this.x = null;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (this.x == null) {
            throw new IllegalStateException("No current ar entry");
        }
        long l3 = this.z + this.x.a();
        if (n2 < 0 || this.o >= l3) {
            return -1;
        }
        int n3 = (int)Math.min((long)n2, l3 - this.o);
        int n4 = this.y.read(byArray, n, n3);
        this.c(n4);
        return n4;
    }

    private final void c(long l3) {
        this.b(l3);
        if (l3 > 0L) {
            this.o += l3;
        }
    }

    static {
        r = "^/\\d+";
        d = "//";
        h = "^#1/\\d+";
        A = "#1/";
        p = 10;
        t = 48;
        n = 8;
        g = 40;
        i = 6;
        s = 34;
        m = 6;
        j = 28;
        w = 12;
        v = 16;
        l = 16;
        u = 0;
        q = "#1/".length();
    }
}

