package litebans;

import java.io.Serializable;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public static final class jT
implements Serializable {
    private final Object b;
    private final Object c;
    private static /* synthetic */ String[] a;

    public jT(Object object, Object object2) {
        this.b = object;
        this.c = object2;
    }

    public final Object b() {
        return this.b;
    }

    public final Object e() {
        return this.c;
    }

    public String toString() {
        return "" + '(' + this.b + a[0] + this.c + ')';
    }

    public final Object a() {
        return this.b;
    }

    public final Object c() {
        return this.c;
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
        if (!(object instanceof jT)) {
            return false;
        }
        jT jT2 = (jT)object;
        if (!ew.a(this.b, jT2.b)) {
            return false;
        }
        return ew.a(this.c, jT2.c);
    }

    private static final void d() {
        a = new String[]{hl.a("\u9ad6\u9ada", 1033214714)};
    }

    static {
        jT.d();
    }
}

