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

public final class eM {
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
        return "TemplateGroup(name=" + this.c + ", type=" + this.b + ", weights=" + this.a + ", templates=" + this.d + ", ladder=" + this.g + ", ladderExpiry=" + this.f + ')';
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
        e = new String[]{"TemplateGroup(name=", ", type=", ", weights=", ", templates=", ", ladder=", ", ladderExpiry="};
    }

    static {
        eM.g();
    }
}

