package litebans;

import litebans.aJ;
import litebans.a_;
import litebans.bi_0;
import litebans.c1;
import litebans.cz;
import litebans.d9;
import litebans.ew;
import litebans.gF;
import litebans.hl;
import litebans.hy_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class dZ
implements Comparable {
    public static final gF s;
    private final a_ d;
    private final String l;
    private final String e;
    private final CharSequence b;
    private final String t;
    private final String h;
    private final String f;
    private final String g;
    private final long o;
    private final long p;
    private final byte i;
    private final boolean u;
    private final boolean v;
    private final boolean n;
    private long c;
    private long a;
    private String q;
    private String k;
    private CharSequence m;
    private boolean j;
    private static /* synthetic */ String[] r;

    private dZ(a_ a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean bl, boolean bl2, boolean bl3, long l7) {
        this.d = a_2;
        this.l = string;
        this.e = string2;
        this.b = charSequence;
        this.t = string3;
        this.h = string4;
        this.f = string5;
        this.g = string6;
        this.o = l3;
        this.p = l5;
        this.i = by2;
        this.u = bl;
        this.v = bl2;
        this.n = bl3;
        this.c = l7;
    }

    public /* synthetic */ dZ(a_ a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean bl, boolean bl2, boolean bl3, long l7, int n, aJ aJ2) {
        if ((n & 0x400) != 0) {
            by2 = (byte)-1;
        }
        if ((n & 0x800) != 0) {
            bl = false;
        }
        if ((n & 0x1000) != 0) {
            bl2 = false;
        }
        if ((n & 0x2000) != 0) {
            bl3 = true;
        }
        if ((n & 0x4000) != 0) {
            l7 = -1L;
        }
        this(a_2, string, string2, charSequence, string3, string4, string5, string6, l3, l5, by2, bl, bl2, bl3, l7, null);
    }

    public final a_ u() {
        return this.d;
    }

    public final String w() {
        return this.l;
    }

    public final String p() {
        return this.e;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final String e() {
        return this.t;
    }

    public final String x() {
        return this.h;
    }

    public final String m() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final long o() {
        return this.o;
    }

    public final long l() {
        return this.p;
    }

    public final byte r() {
        return this.i;
    }

    public final boolean d() {
        return this.u;
    }

    public final boolean h() {
        return this.v;
    }

    public final boolean t() {
        return this.n;
    }

    public final long a() {
        return this.c;
    }

    public final void a(long l3) {
        this.c = l3;
    }

    public dZ(@NotNull cz cz2, @NotNull d9 d92, @NotNull CharSequence charSequence) {
        c1 c12 = cz2.g();
        boolean bl = false;
        c1 c13 = c12;
        this(cz2.u(), d92.a(), d92.c(), charSequence, cz2.d(), cz2.H(), cz2.b(), cz2.v(), cz2.J(), cz2.w(), c13 != null ? c13.f() : (byte)-1, cz2.B(), cz2.y(), !cz2.p(), 0L, 16384, null);
    }

    public final long f() {
        return this.a;
    }

    public final void c(long l3) {
        this.a = l3;
    }

    public final String s() {
        return this.q;
    }

    public final void a(@Nullable String string) {
        this.q = string;
    }

    public final String q() {
        return this.k;
    }

    public final void b(@Nullable String string) {
        this.k = string;
    }

    public final CharSequence v() {
        return this.m;
    }

    public final void a(@Nullable CharSequence charSequence) {
        this.m = charSequence;
    }

    public final boolean c() {
        return this.j;
    }

    public final void a(boolean bl) {
        this.j = bl;
    }

    public int a(@NotNull dZ dZ2) {
        return ew.a(dZ2.o, this.o);
    }

    public final String g() {
        return this.d == a_.c ? r[0] : r[1];
    }

    public final long n() {
        return this.y() ? -1L : this.p - this.o;
    }

    public final boolean i() {
        return this.v && s.a(this.e);
    }

    public final boolean b(long l3) {
        dZ dZ2 = this;
        boolean bl = false;
        return !dZ2.y() && l3 >= this.p;
    }

    public final boolean y() {
        return this.p <= 0L;
    }

    public final String a(@NotNull cz cz2) {
        CharSequence charSequence;
        cz cz3 = cz2;
        boolean bl = false;
        StringBuilder stringBuilder = new StringBuilder().append(cz3.B() ? r[2] : r[3]);
        switch (bi_0.a[cz3.u().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                charSequence = cz3.u();
                break;
            }
            default: {
                dZ dZ2 = this;
                boolean bl2 = false;
                charSequence = (!dZ2.y() ? r[4] : r[5]) + (cz3.y() ? r[6] : r[7]) + cz3.u();
            }
        }
        return stringBuilder.append((Object)charSequence).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@Nullable String string, @Nullable String string2, long l3) {
        dZ dZ2 = this;
        boolean bl = false;
        if (!s.a(dZ2.w(), string)) {
            dZ2 = this;
            bl = false;
            if (!s.a(dZ2.h(), dZ2.p(), string2, dZ2.i())) return false;
        }
        if (!this.n) return false;
        if (this.b(l3)) return false;
        return true;
    }

    public final void a(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence) {
        this.k = string;
        this.q = string2;
        this.m = ((Object)charSequence).toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(r[8]).append((Object)this.d).append(r[9]).append(this.l).append(r[10]).append(this.e).append(r[11]).append((Object)this.b).append(r[12]).append(this.t).append(r[13]).append(this.h).append(r[14]).append(this.f).append(r[15]).append(this.g).append(r[16]).append(this.o).append(r[17]).append(this.p).append(r[18]).append((Object)hy_0.b(this.i)).append(r[19]);
        stringBuilder.append(this.u).append(r[20]).append(this.v).append(r[21]).append(this.n).append(r[22]).append(this.c).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = this.d.hashCode();
        n = n * 31 + (this.l == null ? 0 : this.l.hashCode());
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + this.b.hashCode();
        n = n * 31 + this.t.hashCode();
        n = n * 31 + (this.h == null ? 0 : this.h.hashCode());
        n = n * 31 + (this.f == null ? 0 : this.f.hashCode());
        n = n * 31 + (this.g == null ? 0 : this.g.hashCode());
        n = n * 31 + Long.hashCode(this.o);
        n = n * 31 + Long.hashCode(this.p);
        n = n * 31 + hy_0.c(this.i);
        n = n * 31 + Boolean.hashCode(this.u);
        n = n * 31 + Boolean.hashCode(this.v);
        n = n * 31 + Boolean.hashCode(this.n);
        n = n * 31 + Long.hashCode(this.c);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dZ)) {
            return false;
        }
        dZ dZ2 = (dZ)object;
        if (this.d != dZ2.d) {
            return false;
        }
        if (!ew.a((Object)this.l, (Object)dZ2.l)) {
            return false;
        }
        if (!ew.a((Object)this.e, (Object)dZ2.e)) {
            return false;
        }
        if (!ew.a((Object)this.b, dZ2.b)) {
            return false;
        }
        if (!ew.a((Object)this.t, (Object)dZ2.t)) {
            return false;
        }
        if (!ew.a((Object)this.h, (Object)dZ2.h)) {
            return false;
        }
        if (!ew.a((Object)this.f, (Object)dZ2.f)) {
            return false;
        }
        if (!ew.a((Object)this.g, (Object)dZ2.g)) {
            return false;
        }
        if (this.o != dZ2.o) {
            return false;
        }
        if (this.p != dZ2.p) {
            return false;
        }
        if (this.i != dZ2.i) {
            return false;
        }
        if (this.u != dZ2.u) {
            return false;
        }
        if (this.v != dZ2.v) {
            return false;
        }
        if (this.n != dZ2.n) {
            return false;
        }
        return this.c == dZ2.c;
    }

    public int compareTo(Object object) {
        return this.a((dZ)object);
    }

    public /* synthetic */ dZ(a_ a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean bl, boolean bl2, boolean bl3, long l7, aJ aJ2) {
        this(a_2, string, string2, charSequence, string3, string4, string5, string6, l3, l5, by2, bl, bl2, bl3, l7);
    }

    static {
        dZ.k();
        s = new gF(null);
    }

    private static final void k() {
        r = new String[]{hl.a("\u7d02\u7d59\u7d4f\u7d5c\u7d40\u7d4b\u7d4a", 55213358), hl.a("", -1067444894), hl.a("\u0ee2\u0ef8\u0efd\u0ef4\u0eff\u0ee5\u0ece", -1844834671), hl.a("", -429004378), hl.a("\u4dac\u4dbd\u4db5\u4da8\u4d87", -1552790056), hl.a("", 1748538853), hl.a("\ue9f5\ue9ec", 1327622556), hl.a("", -680269340), hl.a("\u4ad9\u4af2\u4ae8\u4aee\u4ae5\u4ab4\u4ae8\u4ae5\u4aec\u4af9\u4aa1", -1399240036), hl.a("\ue923\ue92f\ue97a\ue97a\ue966\ue96b\ue932", -1615730417), hl.a("\u4666\u466a\u4623\u463a\u4677", -2064038326), hl.a("\u3f8f\u3f83\u3fd1\u3fc6\u3fc2\u3fd0\u3fcc\u3fcd\u3f9e", 326975395), hl.a("\uc4e6\uc4ea\uc4af\uc4b2\uc4af\uc4a9\uc4bf\uc4be\uc4a5\uc4b8\uc49f\uc49f\uc483\uc48e\uc4f7", -219364150), hl.a("\ue1d4\ue1d8\ue19d\ue180\ue19d\ue19b\ue18d\ue18c\ue197\ue18a\ue1b6\ue199\ue195\ue19d\ue1c5", 721936888), hl.a("\u0c7e\u0c72\u0c21\u0c37\u0c20\u0c24\u0c37\u0c20\u0c01\u0c31\u0c3d\u0c22\u0c37\u0c6f", 1909722194), hl.a("\u0d64\u0d68\u0d3b\u0d2d\u0d3a\u0d3e\u0d2d\u0d3a\u0d07\u0d3a\u0d21\u0d2f\u0d21\u0d26\u0d75", -166720184), hl.a("\u4cc5\u4cc9\u4c8d\u4c88\u4c9d\u4c8c\u4cba\u4c9d\u4c88\u4c9b\u4c9d\u4cd4", -230011671), hl.a("\u8ad3\u8adf\u8a9b\u8a9e\u8a8b\u8a9a\u8aba\u8a91\u8a9b\u8ac2", -734557441), hl.a("\u952f\u9523\u9577\u9566\u956e\u9573\u956f\u9562\u9577\u9566\u953e", 838571267), hl.a("\u2f72\u2f7e\u2f2d\u2f37\u2f32\u2f3b\u2f30\u2f2a\u2f63", 127938398), hl.a("\u39e1\u39ed\u39a4\u39bd\u39af\u39ac\u39a3\u39f0", -179947059), hl.a("\u3fd2\u3fde\u3f9f\u3f9d\u3f8a\u3f97\u3f88\u3f9b\u3fc3", 328417278), hl.a("\ue7ed\ue7e1\ue7a8\ue7a5\ue7fc", -598612031)};
    }
}

