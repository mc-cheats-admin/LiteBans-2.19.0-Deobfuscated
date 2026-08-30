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

public final class dZ
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
        return this.d == a_.c ? ",warned" : "";
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
        StringBuilder stringBuilder = new StringBuilder().append(cz3.B() ? "silent_" : "");
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
                charSequence = (!dZ2.y() ? "temp_" : "") + (cz3.y() ? "ip" : "") + cz3.u();
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
        stringBuilder.append("Entry(type=").append((Object)this.d).append(", uuid=").append(this.l).append(", ip=").append(this.e).append(", reason=").append((Object)this.b).append(", executorUUID=").append(this.t).append(", executorName=").append(this.h).append(", serverScope=").append(this.f).append(", serverOrigin=").append(this.g).append(", dateStart=").append(this.o).append(", dateEnd=").append(this.p).append(", template=").append((Object)hy_0.b(this.i)).append(", silent=");
        stringBuilder.append(this.u).append(", ipban=").append(this.v).append(", active=").append(this.n).append(", id=").append(this.c).append(')');
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
        r = new String[]{",warned", "", "silent_", "", "temp_", "", "ip", "", "Entry(type=", ", uuid=", ", ip=", ", reason=", ", executorUUID=", ", executorName=", ", serverScope=", ", serverOrigin=", ", dateStart=", ", dateEnd=", ", template=", ", silent=", ", ipban=", ", active=", ", id="};
    }
}

