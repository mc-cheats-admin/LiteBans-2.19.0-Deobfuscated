package litebans;

import litebans.av;
import litebans.bj_0;
import litebans.i2;

/*
 * Renamed from litebans.az
 */
public static class az_0
extends av {
    private int f;
    private bj_0 e;

    public az_0() {
        super(new i2(21));
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a(4, n2);
        super.b(byArray, n, n2);
        this.f = i2.a(byArray, n);
        this.e = bj_0.a(i2.a(byArray, n + 2));
    }
}

