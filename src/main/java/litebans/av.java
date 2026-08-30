package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
import litebans.en_0;
import litebans.ew_0;
import litebans.i2;

public abstract class av
implements en_0 {
    private final i2 d;
    private byte[] b;
    private byte[] c;

    protected av(i2 i22) {
        this.d = i22;
    }

    @Override
    public i2 c() {
        return this.d;
    }

    public void b(byte[] byArray) {
        this.b = ew_0.b(byArray);
    }

    @Override
    public i2 b() {
        return new i2(this.b != null ? this.b.length : 0);
    }

    @Override
    public byte[] e() {
        return ew_0.b(this.b);
    }

    public void a(byte[] byArray) {
        this.c = ew_0.b(byArray);
    }

    @Override
    public i2 a() {
        if (this.c != null) {
            return new i2(this.c.length);
        }
        return this.b();
    }

    @Override
    public byte[] d() {
        if (this.c != null) {
            return ew_0.b(this.c);
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
        if (this.b == null) {
            this.b(byArray2);
        }
    }

    protected final void a(int n, int n2) {
        if (n2 < n) {
            throw new ZipException(this.getClass().getName() + " is too short, only " + n2 + " bytes, expected at least " + n);
        }
    }
}

