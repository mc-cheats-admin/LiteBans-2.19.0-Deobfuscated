package litebans;

import java.util.UUID;
import litebans.cn;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public static final class cM {
    private final String b;
    private final UUID c;
    private static /* synthetic */ String[] a;

    public cM(@Nullable String string, @Nullable UUID uUID) {
        this.b = string;
        this.c = uUID;
    }

    public final String d() {
        return this.b;
    }

    public final UUID a() {
        return this.c;
    }

    public final boolean c() {
        return ew.a((Object)this, cn.b());
    }

    public String toString() {
        return a[0] + this.b + a[1] + this.c + ')';
    }

    public int hashCode() {
        int n = this.b == null ? 0 : this.b.hashCode();
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cM)) {
            return false;
        }
        cM cM2 = (cM)object;
        if (!ew.a((Object)this.b, (Object)cM2.b)) {
            return false;
        }
        return ew.a((Object)this.c, cM2.c);
    }

    private static final void b() {
        a = new String[]{hl.a("\u88d3\u88f1\u88ec\u88e5\u88ea\u88ef\u88e6\u88ab\u88ed\u88e2\u88ee\u88e6\u88be", 1502578819), hl.a("\uceec\ucee0\uceb5\uceb5\ucea9\ucea4\ucefd", -670314816)};
    }

    static {
        cM.b();
    }
}

