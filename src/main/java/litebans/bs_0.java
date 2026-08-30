package litebans;

import java.util.zip.ZipException;
import litebans.ci_0;
import litebans.en_0;
import litebans.i2;
import litebans.iw_0;

public class bs_0
implements en_0 {
    static final i2 g;
    private static final String c;
    private static final byte[] e;
    private iw_0 b;
    private iw_0 d;
    private iw_0 h;
    private ci_0 i;
    private byte[] f;

    @Override
    public i2 c() {
        return g;
    }

    @Override
    public i2 b() {
        return new i2(this.b != null ? 16 : 0);
    }

    @Override
    public i2 a() {
        return new i2((this.b != null ? 8 : 0) + (this.d != null ? 8 : 0) + (this.h != null ? 8 : 0) + (this.i != null ? 4 : 0));
    }

    @Override
    public byte[] e() {
        if (this.b != null || this.d != null) {
            if (this.b == null || this.d == null) {
                throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file ");
            }
            byte[] byArray = new byte[16];
            this.a(byArray);
            return byArray;
        }
        return e;
    }

    @Override
    public byte[] d() {
        byte[] byArray = new byte[this.a().a()];
        int n = this.a(byArray);
        if (this.h != null) {
            System.arraycopy(this.h.c(), 0, byArray, n, 8);
            n += 8;
        }
        if (this.i != null) {
            System.arraycopy(this.i.c(), 0, byArray, n, 4);
            n += 4;
        }
        return byArray;
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return;
        }
        if (n2 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values in the local file ");
        }
        this.b = new iw_0(byArray, n);
        this.d = new iw_0(byArray, n += 8);
        n += 8;
        int n3 = n2 - 16;
        if (n3 >= 8) {
            this.h = new iw_0(byArray, n);
            n += 8;
            n3 -= 8;
        }
        if (n3 >= 4) {
            this.i = new ci_0(byArray, n);
            n += 4;
            n3 -= 4;
        }
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.f = new byte[n2];
        System.arraycopy(byArray, n, this.f, 0, n2);
        if (n2 >= 28) {
            this.a(byArray, n, n2);
        } else if (n2 == 24) {
            this.b = new iw_0(byArray, n);
            this.d = new iw_0(byArray, n += 8);
            this.h = new iw_0(byArray, n += 8);
        } else if (n2 % 8 == 4) {
            this.i = new ci_0(byArray, n + n2 - 4);
        }
    }

    private final int a(byte[] byArray) {
        int n = 0;
        if (this.b != null) {
            System.arraycopy(this.b.c(), 0, byArray, 0, 8);
            n += 8;
        }
        if (this.d != null) {
            System.arraycopy(this.d.c(), 0, byArray, n, 8);
            n += 8;
        }
        return n;
    }

    static {
        c = "Zip64 extended information must contain both size values in the local file header.";
        g = new i2(1);
        e = new byte[0];
    }
}

