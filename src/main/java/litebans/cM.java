package litebans;

import java.util.UUID;
import litebans.cn;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class cM {
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
        return "Profile(name=" + this.b + ", uuid=" + this.c + ')';
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
        a = new String[]{"Profile(name=", ", uuid="};
    }

    static {
        cM.b();
    }
}

