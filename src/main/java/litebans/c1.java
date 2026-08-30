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

public static final class c1 {
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
        return c[0] + hy_0.b(this.d) + c[1] + this.e + c[2] + this.g + c[3] + this.a + c[4] + this.h + c[5] + this.j + c[6] + this.i + ')';
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
        l = new c1(-1, c[7], a_.h, k, false, ll.e(), 0L, null);
    }

    private static final void e() {
        c = new String[]{hl.a("\u3a76\u3a47\u3a4f\u3a52\u3a4e\u3a43\u3a56\u3a47\u3a0a\u3a4b\u3a46\u3a1f", 1070676514), hl.a("\u75d3\u75df\u7591\u759e\u7592\u759a\u75c2", -297241089), hl.a("\udd14\udd18\udd4c\udd41\udd48\udd5d\udd05", 124706104), hl.a("\u43fe\u43f2\u43b6\u43b7\u43b4\u43b3\u43a7\u43be\u43a6\u43a1\u43ef", -2044771374), hl.a("\u659c\u6590\u65d9\u65c0\u65e4\u65d5\u65dd\u65c0\u65dc\u65d1\u65c4\u65d5\u658d", -1899993680), hl.a("\u4cd5\u4cd9\u4c95\u4c98\u4c9d\u4c9d\u4c9c\u4c8b\u4cc4", -1970647815), hl.a("\u1234\u1238\u1274\u1279\u127c\u127c\u127d\u126a\u125d\u1260\u1268\u1271\u126a\u1261\u1225", -175042024), hl.a("", -112761265)};
    }
}

