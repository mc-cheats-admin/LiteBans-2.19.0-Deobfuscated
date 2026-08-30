package litebans;

import java.util.Iterator;
import litebans.cf;
import litebans.dG;
import litebans.ex;
import litebans.hl;
import litebans.i5;
import litebans.iW;
import org.jetbrains.annotations.Nullable;

public class ed
implements Iterable,
dG {
    public static final ex a;
    private final int c;
    private final int e;
    private final int b;
    private static /* synthetic */ String[] d;

    public ed(int n, int n2, int n3) {
        if (n3 == 0) {
            throw new IllegalArgumentException("Step must be non-");
        }
        if (n3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on ");
        }
        this.c = n;
        this.e = cf.b(n, n2, n3);
        this.b = n3;
    }

    public final int c() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final int a() {
        return this.b;
    }

    public i5 e() {
        return new iW(this.c, this.e, this.b);
    }

    public boolean a() {
        return this.b > 0 ? this.c > this.e : this.c < this.e;
    }

    public boolean equals(@Nullable Object object) {
        return object instanceof ed && (this.a() && ((ed)object).a() || this.c == ((ed)object).c && this.e == ((ed)object).e && this.b == ((ed)object).b);
    }

    public int hashCode() {
        return this.a() ? -1 : 31 * (31 * this.c + this.e) + this.b;
    }

    public String toString() {
        return this.b > 0 ? this.c + ". + " + this.e + " step " + this.b : this.c + " downTo " + this.e + " step " + -this.b;
    }

    public Iterator iterator() {
        return this.e();
    }

    static {
        ed.d();
        a = new ex(null);
    }

    private static final void d() {
        d = new String[]{"Step must be non-", "Step must be greater than Int.MIN_VALUE to avoid overflow on ", ". + ", " step ", " downTo ", " step "};
    }
}

