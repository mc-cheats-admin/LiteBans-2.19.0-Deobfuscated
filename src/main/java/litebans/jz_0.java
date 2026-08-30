package litebans;

import java.util.Date;
import litebans.en_0;
import litebans.i2;
import litebans.iw_0;

public class jz_0
implements en_0 {
    private static final i2 e;
    private static final i2 d;
    private static final i2 c;
    private iw_0 h = iw_0.a;
    private iw_0 f = iw_0.a;
    private iw_0 g = iw_0.a;
    private static final long b;

    @Override
    public i2 c() {
        return e;
    }

    @Override
    public i2 b() {
        return new i2(32);
    }

    @Override
    public i2 a() {
        return this.b();
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.b().a()];
        int n = 4;
        System.arraycopy(d.b(), 0, byArray, n, 2);
        System.arraycopy(c.b(), 0, byArray, n += 2, 2);
        System.arraycopy(this.h.c(), 0, byArray, n += 2, 8);
        System.arraycopy(this.f.c(), 0, byArray, n += 8, 8);
        System.arraycopy(this.g.c(), 0, byArray, n += 8, 8);
        return byArray;
    }

    @Override
    public byte[] d() {
        return this.e();
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        int n3 = n + n2;
        n += 4;
        while (n + 4 <= n3) {
            i2 i22 = new i2(byArray, n);
            n += 2;
            if (i22.equals(d)) {
                this.c(byArray, n, n3 - n);
                break;
            }
            i2 i23 = new i2(byArray, n);
            n += 2 + i23.a();
        }
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.d();
        this.a(byArray, n, n2);
    }

    public Date a() {
        return jz_0.a(this.h);
    }

    public Date b() {
        return jz_0.a(this.f);
    }

    public Date c() {
        return jz_0.a(this.g);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x000A Zip Extra Field:").append(" Modify:[").append(this.a()).append("] ").append(" Access:[").append(this.b()).append("] ").append(" Create:[").append(this.c()).append("] ");
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object instanceof jz_0) {
            jz_0 jz_02 = (jz_0)object;
            return (this.h == jz_02.h || this.h != null && this.h.equals(jz_02.h)) && (this.f == jz_02.f || this.f != null && this.f.equals(jz_02.f)) && (this.g == jz_02.g || this.g != null && this.g.equals(jz_02.g));
        }
        return false;
    }

    public int hashCode() {
        int n = -123;
        if (this.h != null) {
            n ^= this.h.hashCode();
        }
        if (this.f != null) {
            n ^= Integer.rotateLeft(this.f.hashCode(), 11);
        }
        if (this.g != null) {
            n ^= Integer.rotateLeft(this.g.hashCode(), 22);
        }
        return n;
    }

    private final void d() {
        this.h = iw_0.a;
        this.f = iw_0.a;
        this.g = iw_0.a;
    }

    private final void c(byte[] byArray, int n, int n2) {
        i2 i22;
        if (n2 >= 26 && c.equals(i22 = new i2(byArray, n))) {
            this.h = new iw_0(byArray, n += 2);
            this.f = new iw_0(byArray, n += 8);
            this.g = new iw_0(byArray, n += 8);
        }
    }

    private static final Date a(iw_0 iw_02) {
        if (iw_02 == null || iw_0.a.equals(iw_02)) {
            return null;
        }
        long l3 = (iw_02.b() + -116444736000000000L) / 10000L;
        return new Date(l3);
    }

    static {
        b = -116444736000000000L;
        e = new i2(10);
        d = new i2(1);
        c = new i2(24);
    }
}

