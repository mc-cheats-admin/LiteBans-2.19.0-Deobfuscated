package litebans;

import litebans.cx_0;
import litebans.dd_0;

/*
 * Renamed from litebans.iQ
 */
public static class iq_0 {
    private long k;
    private long f;
    private int d;
    private String b;
    private int i;
    private String e;
    private String c;
    private String g;
    private int h;
    private int j;
    private int a;

    iq_0(byte[] byArray, dd_0 dd_02) {
        this.k = 1000L * (long)cx_0.b(byArray, 4);
        this.f = 1000L * (long)cx_0.b(byArray, 8);
        this.d = cx_0.b(byArray, 12);
        this.b = cx_0.a(dd_02, byArray, 676, 16).trim();
        this.i = cx_0.b(byArray, 692);
        this.e = cx_0.a(dd_02, byArray, 696, 64).trim();
        this.c = cx_0.a(dd_02, byArray, 760, 64).trim();
        this.g = cx_0.a(dd_02, byArray, 824, 64).trim();
        this.h = cx_0.b(byArray, 888);
        this.j = cx_0.b(byArray, 892);
        this.a = cx_0.b(byArray, 896);
    }

    public String c() {
        return this.c;
    }

    public String b() {
        return this.g;
    }

    public int a() {
        return this.a;
    }

    public boolean d() {
        return (this.h & 0x80) == 128;
    }

    public int hashCode() {
        int n = 17;
        if (this.b != null) {
            n = this.b.hashCode();
        }
        n = (int)((long)n + 31L * this.k);
        if (this.g != null) {
            n = 31 * this.g.hashCode() + 17;
        }
        if (this.c != null) {
            n = 31 * this.c.hashCode() + 17;
        }
        return n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        iq_0 iq_02 = (iq_0)object;
        if (this.k != iq_02.k) {
            return false;
        }
        if (this.b() == null || !this.b().equals(iq_02.b())) {
            return false;
        }
        return this.c() != null && this.c().equals(iq_02.c());
    }
}

