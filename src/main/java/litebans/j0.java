package litebans;

import java.util.Date;
import litebans.dZ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class j0 {
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
        return c[0] + this.g + c[1] + this.d + c[2] + this.b + c[3] + this.f + c[4] + this.e + c[5] + this.a + ')';
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
        c = new String[]{hl.a("\u4346\u4377\u4372\u4367\u434b\u4352\u4350\u4367\u4371\u4377\u436e\u4376\u432a\u4372\u4370\u4367\u4364\u436b\u437a\u433f", -28097790), hl.a("\ueffe\ueff2\uefbc\uefb3\uefbf\uefb7\uefef", -1435570222), hl.a("\u7ba7\u7bab\u7bfe\u7bfe\u7be2\u7bef\u7bb6", -320898165), hl.a("\u3872\u387e\u383a\u383f\u382a\u383b\u3863", -1174194082), hl.a("\uccb2\uccbe\uccfc\uccff\uccf0\ucca3", 373214366), hl.a("\uc5e2\uc5ee\uc5a3\uc5bb\uc5ba\uc5ab\uc5f3", 711378382)};
    }

    static {
        j0.a();
    }
}

