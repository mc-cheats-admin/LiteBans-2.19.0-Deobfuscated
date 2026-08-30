package litebans;

import litebans.a4;
import litebans.au;
import litebans.b3;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cy {
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
        return "(a=" + this.e + ", duration=" + this.c + ", cooldown=" + this.a + ", other=" + this.b + ')';
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
        d = new String[]{"(a=", ", duration=", ", cooldown=", ", other="};
    }

    static {
        cy.b();
    }
}

