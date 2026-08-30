package litebans;

import java.util.Objects;
import litebans.aJ;
import litebans.c_0;
import litebans.ew;
import org.jetbrains.annotations.Nullable;

public static final class aK {
    private final int a;
    private String c;
    private String b;

    private aK(int n, String string, String string2) {
        this.a = n;
        this.c = string;
        this.b = string2;
    }

    public final int c() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final void a(@Nullable String string) {
        this.c = string;
    }

    public final String d() {
        return this.b;
    }

    public final void b(@Nullable String string) {
        this.b = string;
    }

    public String toString() {
        return Objects.toString(this.c);
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.c != null && this.b != null && Integer.compareUnsigned(this.a, 65535) < 0;
    }

    public final boolean f() {
        return !this.b();
    }

    public int hashCode() {
        int n = c_0.d(this.a);
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        n = n * 31 + (this.b == null ? 0 : this.b.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aK)) {
            return false;
        }
        aK aK2 = (aK)object;
        if (this.a != aK2.a) {
            return false;
        }
        if (!ew.a((Object)this.c, (Object)aK2.c)) {
            return false;
        }
        return ew.a((Object)this.b, (Object)aK2.b);
    }

    public /* synthetic */ aK(int n, String string, String string2, aJ aJ2) {
        this(n, string, string2);
    }
}

