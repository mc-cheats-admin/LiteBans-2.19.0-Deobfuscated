package litebans;

import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class jP {
    private final String c;
    private final String e;
    private final String d;
    private final String a;
    private final String f;
    private static /* synthetic */ String[] b;

    public jP(@NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        this.c = string;
        this.e = string2;
        this.d = string3;
        this.a = string4;
        this.f = string5;
    }

    public final String d() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public String toString() {
        return this.c + ' ' + this.a;
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.e.hashCode();
        n = n * 31 + (this.d == null ? 0 : this.d.hashCode());
        n = n * 31 + (this.a == null ? 0 : this.a.hashCode());
        n = n * 31 + (this.f == null ? 0 : this.f.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jP)) {
            return false;
        }
        jP jP2 = (jP)object;
        if (!ew.a((Object)this.c, (Object)jP2.c)) {
            return false;
        }
        if (!ew.a((Object)this.e, (Object)jP2.e)) {
            return false;
        }
        if (!ew.a((Object)this.d, (Object)jP2.d)) {
            return false;
        }
        if (!ew.a((Object)this.a, (Object)jP2.a)) {
            return false;
        }
        return ew.a((Object)this.f, (Object)jP2.f);
    }

    private static final void a() {
        b = new String[]{hl.a("\u8ee3\u8ea7\u8eac\u8ebf", -1412133171), hl.a("\ud6dd\ud699\ud692\ud681", 2091243251), hl.a("\ueb6f\ueb2b\ueb20\ueb33", -14423231)};
    }

    static {
        jP.a();
    }
}

