package litebans;

import java.util.Arrays;
import litebans.en_0;
import litebans.ew_0;
import litebans.i2;

public final class hn_0
implements en_0 {
    private static final i2 b = new i2(44225);
    private byte[] d;
    private byte[] c;

    @Override
    public i2 c() {
        return b;
    }

    @Override
    public i2 b() {
        return new i2(this.d == null ? 0 : this.d.length);
    }

    @Override
    public i2 a() {
        return this.c == null ? this.b() : new i2(this.c.length);
    }

    @Override
    public byte[] e() {
        return ew_0.b(this.d);
    }

    @Override
    public byte[] d() {
        return this.c == null ? this.e() : ew_0.b(this.c);
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        this.d = Arrays.copyOfRange(byArray, n, n + n2);
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.c = Arrays.copyOfRange(byArray, n, n + n2);
        if (this.d == null) {
            this.a(byArray, n, n2);
        }
    }
}

