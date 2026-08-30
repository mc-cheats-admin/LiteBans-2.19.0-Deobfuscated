package litebans;

import java.util.Date;
import litebans.aJ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iA {
    private final String c;
    private final String e;
    private final String d;
    private final Date a;
    private static /* synthetic */ String[] b;

    public iA(@Nullable String string, @Nullable String string2, @Nullable String string3, @NotNull Date date) {
        this.c = string;
        this.e = string2;
        this.d = string3;
        this.a = date;
    }

    public /* synthetic */ iA(String string, String string2, String string3, Date date, int n, aJ aJ2) {
        if ((n & 4) != 0) {
            string3 = "#";
        }
        if ((n & 8) != 0) {
            date = new Date();
        }
        this(string, string2, string3, date);
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String i() {
        return this.d;
    }

    public final Date f() {
        return this.a;
    }

    public final String h() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final Date e() {
        return this.a;
    }

    public String toString() {
        return "(a=" + this.c + ", uuid=" + this.e + ", ip=" + this.d + ", date=" + this.a + ')';
    }

    public int hashCode() {
        int n = this.c == null ? 0 : this.c.hashCode();
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + (this.d == null ? 0 : this.d.hashCode());
        n = n * 31 + this.a.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof iA)) {
            return false;
        }
        iA iA2 = (iA)object;
        if (!ew.a((Object)this.c, (Object)iA2.c)) {
            return false;
        }
        if (!ew.a((Object)this.e, (Object)iA2.e)) {
            return false;
        }
        if (!ew.a((Object)this.d, (Object)iA2.d)) {
            return false;
        }
        return ew.a((Object)this.a, iA2.a);
    }

    private static final void g() {
        b = new String[]{"#", "(a=", ", uuid=", ", ip=", ", date="};
    }

    static {
        iA.g();
    }
}

