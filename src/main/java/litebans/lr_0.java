package litebans;

import litebans.aJ;
import litebans.cp_0;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lr_0 {
    private final cp_0 c;
    private final Object d;
    private String a;
    private static /* synthetic */ String[] b;

    public lr_0(@NotNull cp_0 cp_02, @NotNull Object object, @Nullable String string) {
        this.c = cp_02;
        this.d = object;
        this.a = string;
    }

    public /* synthetic */ lr_0(cp_0 cp_02, Object object, String string, int n, aJ aJ2) {
        if ((n & 4) != 0) {
            string = null;
        }
        this(cp_02, object, string);
    }

    public final cp_0 a() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final void a(@Nullable String string) {
        this.a = string;
    }

    public String toString() {
        return "FabricPreLoginEvent(data=" + this.c + ", login=" + this.d + ", cancelReason=" + this.a + ')';
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
        if (!(object instanceof lr_0)) {
            return false;
        }
        lr_0 lr_02 = (lr_0)object;
        if (!ew.a((Object)this.c, lr_02.c)) {
            return false;
        }
        if (!ew.a(this.d, lr_02.d)) {
            return false;
        }
        return ew.a((Object)this.a, (Object)lr_02.a);
    }

    private static final void b() {
        b = new String[]{"FabricPreLoginEvent(data=", ", login=", ", cancelReason="};
    }

    static {
        lr_0.b();
    }
}

