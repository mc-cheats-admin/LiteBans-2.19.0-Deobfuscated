package litebans;

import litebans.av;
import litebans.bj_0;
import litebans.i2;

public class a1
extends av {
    private int f;
    private bj_0 e;

    public a1() {
        super(new i2(22));
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a(4, n2);
        this.f = i2.a(byArray, n);
        this.e = bj_0.a(i2.a(byArray, n + 2));
    }
}

