package litebans;

import litebans.fj_0;
import litebans.hl;
import litebans.iC;
import litebans.kd;
import litebans.ko;

public static final class ij
extends Enum {
    public static final fj_0 l;
    private static final ij[] m;
    public static final ij e;
    public static final ij v;
    public static final ij t;
    public static final ij o;
    public static final ij k;
    public static final ij i;
    public static final ij b;
    public static final ij q;
    public static final ij w;
    public static final ij u;
    public static final ij x;
    public static final ij r;
    public static final ij g;
    public static final ij j;
    public static final ij s;
    public static final ij f;
    public static final ij p;
    public static final ij c;
    public static final ij h;
    public static final ij a;
    private static final /* synthetic */ ij[] d;
    private static final /* synthetic */ kd n;
    private static /* synthetic */ String[] y;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ij() {
        void var2_-1;
        void var1_-1;
    }

    public final int d() {
        return this.ordinal();
    }

    public final String f() {
        String string;
        switch (ko.a[this.ordinal()]) {
            case 1: {
                string = y[0];
                break;
            }
            case 2: {
                string = y[1];
                break;
            }
            case 3: {
                string = y[2];
                break;
            }
            case 4: {
                string = y[3];
                break;
            }
            case 5: {
                string = y[4];
                break;
            }
            default: {
                throw new UnsupportedOperationException(this.toString());
            }
        }
        return string;
    }

    public final boolean a() {
        return this == j || this == s || this == f;
    }

    public static ij[] values() {
        return (ij[])d.clone();
    }

    public static ij a(String string) {
        return Enum.valueOf(ij.class, string);
    }

    public static final /* synthetic */ ij[] e() {
        return m;
    }

    static {
        ij.c();
        e = new ij(y[5], 0);
        v = new ij(y[6], 1);
        t = new ij(y[7], 2);
        o = new ij(y[8], 3);
        k = new ij(y[9], 4);
        i = new ij(y[10], 5);
        b = new ij(y[11], 6);
        q = new ij(y[12], 7);
        w = new ij(y[13], 8);
        u = new ij(y[14], 9);
        x = new ij(y[15], 10);
        r = new ij(y[16], 11);
        g = new ij(y[17], 12);
        j = new ij(y[18], 13);
        s = new ij(y[19], 14);
        f = new ij(y[20], 15);
        p = new ij(y[21], 16);
        c = new ij(y[22], 17);
        h = new ij(y[23], 18);
        a = new ij(y[24], 19);
        d = ijArray = new ij[]{ij.e, ij.v, ij.t, ij.o, ij.k, ij.i, ij.b, ij.q, ij.w, ij.u, ij.x, ij.r, ij.g, ij.j, ij.s, ij.f, ij.p, ij.c, ij.h, ij.a};
        n = iC.a(d);
        l = new fj_0(null);
        m = ij.values();
    }

    private static final void c() {
        y = new String[]{hl.a("\u5249\u5259\u5244\u524a\u524f\u5248\u524a\u5258\u525f", 986534443), hl.a("\u66bd\u66a7\u66a2\u66ab\u66a0\u66ba", -912955698), hl.a("\u9a7e\u9a72\u9a73\u9a6e\u9a72\u9a71\u9a78", -752379363), hl.a("\u00f7\u00e6\u00e3\u00f6\u00fa\u00e3\u00cc\u00f9\u00fc\u00fa\u00fd", 1513291923), hl.a("\ua3a7\ua3bf\ua3be\ua3af", -1145134134), hl.a("\ued5f\ued46\ued41\ued48", 1839852815), hl.a("\ufc84\ufc9b\ufc9a\ufc93", 651295956), hl.a("\u422e\u423e\u4223\u422d\u4228\u422f\u422d\u423f\u4238", 1254244972), hl.a("\uc62b\uc63b\uc626\uc628\uc62d\uc62a\uc628\uc63a\uc63d\uc636\uc63a\uc620\uc625\uc62c\uc627\uc63d", 1214170729), hl.a("\u185b\u184b\u1856\u1858\u185d\u185a\u1858\u184a\u184d\u1846\u185c\u1841\u184d\u184b\u1858\u1846\u184a\u1850\u1855\u185c\u1857\u184d", -220325863), hl.a("\u6f2f\u6f2e\u6f35\u6f28\u6f27\u6f38\u6f3e\u6f23\u6f20\u6f2f\u6f2f\u6f24\u6f25\u6f3e\u6f2b\u6f2e\u6f28\u6f2f", 9989985), hl.a("\u6aa6\u6aa7\u6abc\u6aa1\u6aae\u6ab1\u6ab7\u6aac\u6abd\u6ab8\u6aad\u6aa1\u6ab8\u6ab7\u6aa2\u6aa7\u6aa1\u6aa6", -2007274776), hl.a("\uf1cb\uf1ca\uf1d1\uf1cc\uf1c3\uf1dc\uf1da\uf1c8\uf1d0\uf1d1\uf1c0", 691335557), hl.a("\ud9b8\ud9bb\ud9b4", 1948310010), hl.a("\u9404\u941c\u941d\u940c", 1681626185), hl.a("\uec3b\uec2d\uec3e\uec22", -1237717908), hl.a("\ub738\ub73a\ub730\ub738\ub72c\ub721\ub736\ub722\ub726\ub736\ub720\ub727", -2066106509), hl.a("\udb5f\udb5d\udb57\udb5f\udb4b\udb47\udb41\udb57\udb57\udb51\udb47\udb47", -362292460), hl.a("\u1e0b\u1e10\u1e1c\u1e1f\u1e10", 456400478), hl.a("\u7717\u770c\u770f\u7717\u7716\u7707", -595822782), hl.a("\u1f39\u1f22\u1f3b\u1f2d\u1f3e\u1f22", -1013375124), hl.a("\u7980\u799d\u7995\u798c\u7997\u7980\u7981\u799a\u798b\u798a\u7991\u798c\u7983\u799c", -527599163), hl.a("\ufbab\ufbbb\ufba6\ufba8\ufbad\ufbaa\ufba8\ufbba\ufbbd\ufbb6\ufbaa\ufbbc\ufbba\ufbbd\ufba6\ufba4", -1162544151), hl.a("\ubd75\ubd63\ubd74\ubd70\ubd63\ubd74\ubd75\ubd79\ubd74\ubd63\ubd6a\ubd69\ubd67\ubd62", 2097659174), hl.a("\ubd83\ubd8f\ubd8e\ubd86\ubd89\ubd87\ubd9f\ubd92\ubd85\ubd8c\ubd8f\ubd81\ubd84", 1682488768)};
    }
}

