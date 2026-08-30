package litebans;

import litebans.ew;
import litebans.hl;
import litebans.ji;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class lq {
    public static final ji g;
    private final String d;
    private final String a;
    private final String c;
    private final String e;
    public static final String h;
    public static final String b;
    public static final String i;
    private static /* synthetic */ String[] f;

    public lq(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        this.d = string;
        this.a = string2;
        this.c = string3;
        this.e = string4;
    }

    public final String a() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public String toString() {
        return f[0] + this.d + f[1] + this.a + f[2] + this.c + f[3] + this.e + ')';
    }

    public int hashCode() {
        int n = this.d.hashCode();
        n = n * 31 + this.a.hashCode();
        n = n * 31 + this.c.hashCode();
        n = n * 31 + this.e.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof lq)) {
            return false;
        }
        lq lq2 = (lq)object;
        if (!ew.a((Object)this.d, (Object)lq2.d)) {
            return false;
        }
        if (!ew.a((Object)this.a, (Object)lq2.a)) {
            return false;
        }
        if (!ew.a((Object)this.c, (Object)lq2.c)) {
            return false;
        }
        return ew.a((Object)this.e, (Object)lq2.e);
    }

    static {
        i = " CHARACTER SET ascii COLLATE ascii_general_ci";
        b = " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci";
        h = "utf8mb4_unicode_ci";
        lq.b();
        g = new ji(null);
    }

    private static final void b() {
        f = new String[]{hl.a("\u5c45\u5c0c\u5c50", -1713349523), hl.a("\ua849\ua845\ua800\ua80b\ua802\ua80c\ua80b\ua800\ua858", -1241733019), hl.a("\uc944\uc948\uc90b\uc900\uc909\uc91a\uc91b\uc90d\uc91c\uc955", 814795112), hl.a("\u4eca\u4ec6\u4e93\u4e88\u4e95\u4e8f\u4e81\u4e88\u4e83\u4e82\u4edb", -230142234)};
    }
}

