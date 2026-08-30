package litebans;

import litebans.a4;
import litebans.au;
import litebans.b3;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class cy {
    private final String e;
    private final b3 c;
    private final au a;
    private final a4 b;
    private static /* synthetic */ String[] d;

    public cy(@NotNull String string, @NotNull b3 b32, @NotNull au au2, @NotNull a4 a42) {
        this.e = string;
        this.c = b32;
        this.a = au2;
        this.b = a42;
    }

    public final String a() {
        return this.e;
    }

    public final b3 c() {
        return this.c;
    }

    public final au f() {
        return this.a;
    }

    public final a4 e() {
        return this.b;
    }

    public final b3 d() {
        return this.c;
    }

    public final au g() {
        return this.a;
    }

    public String toString() {
        return d[0] + this.e + d[1] + this.c + d[2] + this.a + d[3] + this.b + ')';
    }

    public int hashCode() {
        int n = this.e.hashCode();
        n = n * 31 + this.c.hashCode();
        n = n * 31 + this.a.hashCode();
        n = n * 31 + this.b.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cy)) {
            return false;
        }
        cy cy2 = (cy)object;
        if (!ew.a((Object)this.e, (Object)cy2.e)) {
            return false;
        }
        if (!ew.a((Object)this.c, cy2.c)) {
            return false;
        }
        if (!ew.a((Object)this.a, cy2.a)) {
            return false;
        }
        return ew.a((Object)this.b, cy2.b);
    }

    private static final void b() {
        d = new String[]{hl.a("\ueda1\uede8\uedb4", -82383479), hl.a("\u9700\u970c\u9748\u9759\u975e\u974d\u9758\u9745\u9743\u9742\u9711", -1248487636), hl.a("\ue76d\ue761\ue722\ue72e\ue72e\ue72d\ue725\ue72e\ue736\ue72f\ue77c", 675276609), hl.a("\ua202\ua20e\ua241\ua25a\ua246\ua24b\ua25c\ua213", -1265851858)};
    }

    static {
        cy.b();
    }
}

