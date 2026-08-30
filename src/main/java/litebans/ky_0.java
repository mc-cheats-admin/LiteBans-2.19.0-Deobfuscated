package litebans;

import java.util.Collections;
import java.util.Date;
import java.util.Set;
import litebans.ao;
import litebans.cx_0;
import litebans.gu_0;
import litebans.hz;
import litebans.iq_0;
import litebans.ki_0;
import litebans.lh_0;

public class ky_0
implements gu_0 {
    private String b;
    private lh_0 p = lh_0.e;
    private int q;
    private Set n = Collections.emptySet();
    private long c;
    private long k;
    private long r;
    private int j;
    private int l;
    private final iq_0 i = null;
    private final hz g = new hz();
    private String f;
    private int m;
    private int o;
    private int h;
    private long d;
    private int e;

    public ao a() {
        return this.g.a();
    }

    public int b() {
        return this.g.b();
    }

    public boolean d(int n) {
        return (this.g.a(n) & 1) == 0;
    }

    public int hashCode() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        ky_0 ky_02 = (ky_0)object;
        if (ky_02.g == null) {
            return false;
        }
        if (this.o != ky_02.o) {
            return false;
        }
        return (this.i != null || ky_02.i == null) && (this.i == null || this.i.equals(ky_02.i));
    }

    public String toString() {
        return this.getName();
    }

    static final ky_0 a(byte[] byArray) {
        ky_0 ky_02 = new ky_0();
        hz hz2 = ky_02.g;
        hz.a(hz2, ao.a(cx_0.b(byArray, 0)));
        hz.d(hz2, cx_0.b(byArray, 12));
        ky_02.o = hz.c(hz2, cx_0.b(byArray, 20));
        int n = cx_0.c(byArray, 32);
        ky_02.a(lh_0.a(n >> 12 & 0xF));
        ky_02.c(n);
        ky_02.h = cx_0.c(byArray, 34);
        ky_02.a(cx_0.a(byArray, 40));
        long l3 = 1000L * (long)cx_0.b(byArray, 48) + (long)(cx_0.b(byArray, 52) / 1000);
        ky_02.b(new Date(l3));
        l3 = 1000L * (long)cx_0.b(byArray, 56) + (long)(cx_0.b(byArray, 60) / 1000);
        ky_02.a(new Date(l3));
        ky_02.d = l3 = 1000L * (long)cx_0.b(byArray, 64) + (long)(cx_0.b(byArray, 68) / 1000);
        ky_02.e = cx_0.b(byArray, 140);
        ky_02.b(cx_0.b(byArray, 144));
        ky_02.a(cx_0.b(byArray, 148));
        hz.b(hz2, cx_0.b(byArray, 160));
        hz.a(hz2, 0);
        for (int i = 0; i < 512 && i < hz.b(hz2); ++i) {
            if (byArray[164 + i] != 0) continue;
            hz.a(hz2);
        }
        System.arraycopy(byArray, 164, hz.c(hz2), 0, 512);
        ky_02.m = hz2.c();
        return ky_02;
    }

    @Override
    public String getName() {
        return this.b;
    }

    String c() {
        return this.f;
    }

    public void a(lh_0 lh_02) {
        this.p = lh_02;
    }

    public void c(int n) {
        this.q = n & 0xFFF;
        this.n = ki_0.a(n);
    }

    public void a(long l3) {
        this.c = l3;
    }

    public void a(Date date) {
        this.r = date.getTime();
    }

    public void b(Date date) {
        this.k = date.getTime();
    }

    public void b(int n) {
        this.j = n;
    }

    public void a(int n) {
        this.l = n;
    }
}

