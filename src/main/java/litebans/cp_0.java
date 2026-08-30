package litebans;

import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.cp
 */
public static final class cp_0 {
    private final String c;
    private final String d;
    private final String a;
    private static /* synthetic */ String[] b;

    public cp_0(@NotNull String string, @NotNull String string2, @Nullable String string3) {
        this.c = string;
        this.d = string2;
        this.a = string3;
    }

    public final String c() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String f() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public String toString() {
        return b[0] + this.c + b[1] + this.d + b[2] + this.a + ')';
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.d.hashCode();
        n = n * 31 + (this.a == null ? 0 : this.a.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cp_0)) {
            return false;
        }
        cp_0 cp_02 = (cp_0)object;
        if (!ew.a((Object)this.c, (Object)cp_02.c)) {
            return false;
        }
        if (!ew.a((Object)this.d, (Object)cp_02.d)) {
            return false;
        }
        return ew.a((Object)this.a, (Object)cp_02.a);
    }

    private static final void a() {
        b = new String[]{hl.a("\u5089\u50c0\u509c", -315404127), hl.a("\u8d2f\u8d23\u8d76\u8d76\u8d6a\u8d67\u8d3e", 1495108867), hl.a("\uc3af\uc3a3\uc3ea\uc3f3\uc3be", -1731279997)};
    }

    static {
        cp_0.a();
    }
}

