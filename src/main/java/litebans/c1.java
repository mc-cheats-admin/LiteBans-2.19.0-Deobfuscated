package litebans;

import java.util.List;
import litebans.aJ;
import litebans.a_;
import litebans.c5;
import litebans.ew;
import litebans.hl;
import litebans.hy_0;
import litebans.lZ;
import litebans.ll;
import org.jetbrains.annotations.Nullable;

public final class c1 {
    public static final lZ b;
    private final byte d;
    private final String e;
    private final a_ g;
    private final c5 a;
    private final boolean h;
    private final List j;
    private final long i;
    public static final byte f;
    public static final int m;
    private static final c5 k;
    private static final c1 l;
    private static /* synthetic */ String[] c;

    private c1(byte by2, String string, a_ a_2, c5 c52, boolean bl, List list, long l3) {
        this.d = by2;
        this.e = string;
        this.g = a_2;
        this.a = c52;
        this.h = bl;
        this.j = list;
        this.i = l3;
    }

    public final byte f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final a_ d() {
        return this.g;
    }

    public final c5 h() {
        return this.a;
    }

    public final boolean j() {
        return this.h;
    }

    public final List b() {
        return this.j;
    }

    public final long i() {
        return this.i;
    }

    public final c5 a(int n) {
        return this.j.isEmpty() ? this.a : (n >= this.j.size() ? (c5)ll.a(this.j) : (n < 0 ? (c5)ll.b(this.j) : (c5)this.j.get(n)));
    }

    public String toString() {
        return "Template(id=" + hy_0.b(this.d) + ", name=" + this.e + ", type=" + this.g + ", defaults=" + this.a + ", ipTemplate=" + this.h + ", ladder=" + this.j + ", ladderExpiry=" + this.i + ')';
    }

    public int hashCode() {
        int n = hy_0.c(this.d);
        n = n * 31 + this.e.hashCode();
        n = n * 31 + this.g.hashCode();
        n = n * 31 + this.a.hashCode();
        n = n * 31 + Boolean.hashCode(this.h);
        n = n * 31 + ((Object)this.j).hashCode();
        n = n * 31 + Long.hashCode(this.i);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c1)) {
            return false;
        }
        c1 c12 = (c1)object;
        if (this.d != c12.d) {
            return false;
        }
        if (!ew.a((Object)this.e, (Object)c12.e)) {
            return false;
        }
        if (this.g != c12.g) {
            return false;
        }
        if (!ew.a((Object)this.a, c12.a)) {
            return false;
        }
        if (this.h != c12.h) {
            return false;
        }
        if (!ew.a((Object)this.j, c12.j)) {
            return false;
        }
        return this.i == c12.i;
    }

    public /* synthetic */ c1(byte by2, String string, a_ a_2, c5 c52, boolean bl, List list, long l3, aJ aJ2) {
        this(by2, string, a_2, c52, bl, list, l3);
    }

    public static final /* synthetic */ c5 c() {
        return k;
    }

    public static final /* synthetic */ c1 a() {
        return l;
    }

    static {
        m = -1;
        f = (byte)-1;
        c1.e();
        b = new lZ(null);
        k = new c5(null, null, null, null, ll.e(), ll.e());
        l = new c1(-1, "", a_.h, k, false, ll.e(), 0L, null);
    }

    private static final void e() {
        c = new String[]{"Template(id=", ", name=", ", type=", ", defaults=", ", ipTemplate=", ", ladder=", ", ladderExpiry=", ""};
    }
}

