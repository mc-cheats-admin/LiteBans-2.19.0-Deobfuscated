package litebans;

import litebans.ao;

static class hz {
    private ao d;
    private int b;
    private int c;
    private int a;
    private int e;
    private final byte[] f = new byte[512];

    hz() {
    }

    public ao a() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int a(int n) {
        return this.f[n];
    }

    static final /* synthetic */ ao a(hz hz2, ao ao2) {
        hz2.d = ao2;
        return hz2.d;
    }

    static final /* synthetic */ int d(hz hz2, int n) {
        hz2.b = n;
        return hz2.b;
    }

    static final /* synthetic */ int c(hz hz2, int n) {
        hz2.c = n;
        return hz2.c;
    }

    static final /* synthetic */ int b(hz hz2, int n) {
        hz2.a = n;
        return hz2.a;
    }

    static final /* synthetic */ int a(hz hz2, int n) {
        hz2.e = n;
        return hz2.e;
    }

    static final /* synthetic */ int b(hz hz2) {
        return hz2.a;
    }

    static final /* synthetic */ int a(hz hz2) {
        return hz2.e++;
    }

    static final /* synthetic */ byte[] c(hz hz2) {
        return hz2.f;
    }
}

