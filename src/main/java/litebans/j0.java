package litebans;

import java.util.Date;
import litebans.dZ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class j0 {
    private final CharSequence g;
    private final String d;
    private final String b;
    private final Date f;
    private final dZ e;
    private final dZ a;
    private static /* synthetic */ String[] c;

    public j0(@NotNull CharSequence charSequence, @NotNull String string, @NotNull String string2, @NotNull Date date, @Nullable dZ dZ2, @Nullable dZ dZ3) {
        this.g = charSequence;
        this.d = string;
        this.b = string2;
        this.f = date;
        this.e = dZ2;
        this.a = dZ3;
    }

    public final CharSequence d() {
        return this.g;
    }

    public final String e() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final dZ c() {
        return this.e;
    }

    public String toString() {
        return "DupeIPResult(prefix=" + this.g + ", name=" + this.d + ", uuid=" + this.b + ", date=" + this.f + ", ban=" + this.e + ", mute=" + this.a + ')';
    }

    public int hashCode() {
        int n = this.g.hashCode();
        n = n * 31 + this.d.hashCode();
        n = n * 31 + this.b.hashCode();
        n = n * 31 + this.f.hashCode();
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + (this.a == null ? 0 : this.a.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j0)) {
            return false;
        }
        j0 j02 = (j0)object;
        if (!ew.a((Object)this.g, j02.g)) {
            return false;
        }
        if (!ew.a((Object)this.d, (Object)j02.d)) {
            return false;
        }
        if (!ew.a((Object)this.b, (Object)j02.b)) {
            return false;
        }
        if (!ew.a((Object)this.f, j02.f)) {
            return false;
        }
        if (!ew.a((Object)this.e, j02.e)) {
            return false;
        }
        return ew.a((Object)this.a, j02.a);
    }

    private static final void a() {
        c = new String[]{"DupeIPResult(prefix=", ", name=", ", uuid=", ", date=", ", ban=", ", mute="};
    }

    static {
        j0.a();
    }
}

