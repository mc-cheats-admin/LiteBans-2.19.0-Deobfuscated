package litebans;

import java.util.zip.ZipException;
import litebans.ci_0;
import litebans.en_0;
import litebans.i2;

public abstract class ba_0
implements en_0 {
    private long b;
    private byte[] c;
    private byte[] d;

    protected ba_0() {
    }

    private final void a() {
        if (this.c == null) {
            return;
        }
        this.d = new byte[5 + this.c.length];
        this.d[0] = 1;
        System.arraycopy(ci_0.a(this.b), 0, this.d, 1, 4);
        System.arraycopy(this.c, 0, this.d, 5, this.c.length);
    }

    @Override
    public byte[] d() {
        if (this.d == null) {
            this.a();
        }
        byte[] byArray = null;
        if (this.d != null) {
            byArray = new byte[this.d.length];
            System.arraycopy(this.d, 0, byArray, 0, byArray.length);
        }
        return byArray;
    }

    @Override
    public i2 a() {
        if (this.d == null) {
            this.a();
        }
        return new i2(this.d != null ? this.d.length : 0);
    }

    @Override
    public byte[] e() {
        return this.d();
    }

    @Override
    public i2 b() {
        return this.a();
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        if (n2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 ");
        }
        byte by2 = byArray[n];
        if (by2 != 1) {
            throw new ZipException("Unsupported version [" + by2 + "] for UniCode path extra data.");
        }
        this.b = ci_0.a(byArray, n + 1);
        this.c = new byte[n2 - 5];
        System.arraycopy(byArray, n + 5, this.c, 0, n2 - 5);
        this.d = null;
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a(byArray, n, n2);
    }
}

