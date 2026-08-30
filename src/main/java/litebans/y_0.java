package litebans;

import java.util.Arrays;
import litebans.en_0;
import litebans.ew_0;
import litebans.i2;

public class y_0
implements en_0 {
    private i2 b;
    private byte[] c;
    private byte[] d;

    public void a(i2 i22) {
        this.b = i22;
    }

    @Override
    public i2 c() {
        return this.b;
    }

    public void b(byte[] byArray) {
        this.c = ew_0.b(byArray);
    }

    @Override
    public i2 b() {
        return new i2(this.c != null ? this.c.length : 0);
    }

    @Override
    public byte[] e() {
        return ew_0.b(this.c);
    }

    public void a(byte[] byArray) {
        this.d = ew_0.b(byArray);
    }

    @Override
    public i2 a() {
        if (this.d != null) {
            return new i2(this.d.length);
        }
        return this.b();
    }

    @Override
    public byte[] d() {
        if (this.d != null) {
            return ew_0.b(this.d);
        }
        return this.e();
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        this.b(Arrays.copyOfRange(byArray, n, n + n2));
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        byte[] byArray2 = Arrays.copyOfRange(byArray, n, n + n2);
        this.a(byArray2);
        if (this.c == null) {
            this.b(byArray2);
        }
    }
}

