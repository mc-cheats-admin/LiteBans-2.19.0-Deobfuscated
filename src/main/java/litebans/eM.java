package litebans;

import java.util.List;
import java.util.Map;
import litebans.a_;
import litebans.c5;
import litebans.ew;
import litebans.hl;
import litebans.ll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class eM {
    private final String c;
    private final a_ b;
    private final Map a;
    private final Map d;
    private final List g;
    private final long f;
    private static /* synthetic */ String[] e;

    public eM(@NotNull String string, @NotNull a_ a_2, @NotNull Map map, @NotNull Map map2, @NotNull List list, long l3) {
        this.c = string;
        this.b = a_2;
        this.a = map;
        this.d = map2;
        this.g = list;
        this.f = l3;
    }

    public final String a() {
        return this.c;
    }

    public final a_ c() {
        return this.b;
    }

    public final Map e() {
        return this.a;
    }

    public final Map b() {
        return this.d;
    }

    public final List f() {
        return this.g;
    }

    public final long d() {
        return this.f;
    }

    public final c5 a(int n) {
        return n >= this.g.size() ? (c5)ll.a(this.g) : (n < 0 ? (c5)ll.b(this.g) : (c5)this.g.get(n));
    }

    public String toString() {
        return e[0] + this.c + e[1] + this.b + e[2] + this.a + e[3] + this.d + e[4] + this.g + e[5] + this.f + ')';
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.b.hashCode();
        n = n * 31 + ((Object)this.a).hashCode();
        n = n * 31 + ((Object)this.d).hashCode();
        n = n * 31 + ((Object)this.g).hashCode();
        n = n * 31 + Long.hashCode(this.f);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eM)) {
            return false;
        }
        eM eM2 = (eM)object;
        if (!ew.a((Object)this.c, (Object)eM2.c)) {
            return false;
        }
        if (this.b != eM2.b) {
            return false;
        }
        if (!ew.a((Object)this.a, eM2.a)) {
            return false;
        }
        if (!ew.a((Object)this.d, eM2.d)) {
            return false;
        }
        if (!ew.a((Object)this.g, eM2.g)) {
            return false;
        }
        return this.f == eM2.f;
    }

    private static final void g() {
        e = new String[]{hl.a("\u752d\u751c\u7514\u7509\u7515\u7518\u750d\u751c\u753e\u750b\u7516\u750c\u7509\u7551\u7517\u7518\u7514\u751c\u7544", -770345607), hl.a("\u9668\u9664\u9630\u963d\u9634\u9621\u9679", -1903061436), hl.a("\uaa7c\uaa70\uaa27\uaa35\uaa39\uaa37\uaa38\uaa24\uaa23\uaa6d", 598583888), hl.a("\ue5f8\ue5f4\ue5a0\ue5b1\ue5b9\ue5a4\ue5b8\ue5b5\ue5a0\ue5b1\ue5a7\ue5e9", 741664212), hl.a("\u63e5\u63e9\u63a5\u63a8\u63ad\u63ad\u63ac\u63bb\u63f4", -1501142071), hl.a("\u682e\u6822\u686e\u6863\u6866\u6866\u6867\u6870\u6847\u687a\u6872\u686b\u6870\u687b\u683f", 390686722)};
    }

    static {
        eM.g();
    }
}

