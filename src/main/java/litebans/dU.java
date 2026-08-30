package litebans;

import litebans.aJ;

public static final class dU {
    private boolean a;
    private boolean b;

    public dU(boolean bl, boolean bl2) {
        this.a = bl;
        this.b = bl2;
    }

    public /* synthetic */ dU(boolean bl, boolean bl2, int n, aJ aJ2) {
        if ((n & 1) != 0) {
            bl = false;
        }
        if ((n & 2) != 0) {
            bl2 = false;
        }
        this(bl, bl2);
    }

    public final boolean a() {
        return this.a;
    }

    public final void a(boolean bl) {
        this.a = bl;
    }

    public final boolean b() {
        return this.b;
    }

    public dU() {
        this(false, false, 3, null);
    }
}

