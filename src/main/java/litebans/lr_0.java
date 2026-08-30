package litebans;

import litebans.aJ;
import litebans.cp_0;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.lr
 */
public static final class lr_0 {
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
        b = new String[]{hl.a("\u641c\u643b\u6438\u6428\u6433\u6439\u640a\u6428\u643f\u6416\u6435\u643d\u6433\u6434\u641f\u642c\u643f\u6434\u642e\u6472\u643e\u643b\u642e\u643b\u6467", 589063258), hl.a("\ud938\ud934\ud978\ud97b\ud973\ud97d\ud97a\ud929", 1950406932), hl.a("\u64c1\u64cd\u648e\u648c\u6483\u648e\u6488\u6481\u64bf\u6488\u648c\u649e\u6482\u6483\u64d0", 643392749)};
    }

    static {
        lr_0.b();
    }
}

