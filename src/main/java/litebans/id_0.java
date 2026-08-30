package litebans;

import java.io.Serializable;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public final class id_0
implements Serializable {
    private final Object d;
    private final Object a;
    private final Object c;
    private static /* synthetic */ String[] b;

    public id_0(Object object, Object object2, Object object3) {
        this.d = object;
        this.a = object2;
        this.c = object3;
    }

    public final Object a() {
        return this.d;
    }

    public final Object c() {
        return this.a;
    }

    public final Object f() {
        return this.c;
    }

    public String toString() {
        return "" + '(' + this.d + ", " + this.a + ", " + this.c + ')';
    }

    public final Object g() {
        return this.d;
    }

    public final Object e() {
        return this.a;
    }

    public final Object d() {
        return this.c;
    }

    public int hashCode() {
        int n = this.d == null ? 0 : this.d.hashCode();
        n = n * 31 + (this.a == null ? 0 : this.a.hashCode());
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof id_0)) {
            return false;
        }
        id_0 id_02 = (id_0)object;
        if (!ew.a(this.d, id_02.d)) {
            return false;
        }
        if (!ew.a(this.a, id_02.a)) {
            return false;
        }
        return ew.a(this.c, id_02.c);
    }

    private static final void b() {
        b = new String[]{", ", ", "};
    }

    static {
        id_0.b();
    }
}

