package litebans;

import java.util.Iterator;
import litebans.cf;
import litebans.dG;
import litebans.ex;
import litebans.hl;
import litebans.i5;
import litebans.iW;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class ed
implements Iterable,
dG {
    public static final ex a;
    private final int c;
    private final int e;
    private final int b;
    private static /* synthetic */ String[] d;

    public ed(int n, int n2, int n3) {
        if (n3 == 0) {
            throw new IllegalArgumentException(d[0]);
        }
        if (n3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(d[1]);
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
        return this.b > 0 ? this.c + d[2] + this.e + d[3] + this.b : this.c + d[4] + this.e + d[5] + -this.b;
    }

    public Iterator iterator() {
        return this.e();
    }

    static {
        ed.d();
        a = new ex(null);
    }

    private static final void d() {
        d = new String[]{hl.a("\ue65e\ue679\ue668\ue67d\ue62d\ue660\ue678\ue67e\ue679\ue62d\ue66f\ue668\ue62d\ue663\ue662\ue663\ue620\ue677\ue668\ue67f\ue662\ue623", -287185395), hl.a("\ub680\ub6a7\ub6b6\ub6a3\ub6f3\ub6be\ub6a6\ub6a0\ub6a7\ub6f3\ub6b1\ub6b6\ub6f3\ub6b4\ub6a1\ub6b6\ub6b2\ub6a7\ub6b6\ub6a1\ub6f3\ub6a7\ub6bb\ub6b2\ub6bd\ub6f3\ub69a\ub6bd\ub6a7\ub6fd\ub69e\ub69a\ub69d\ub68c\ub685\ub692\ub69f\ub686\ub696\ub6f3\ub6a7\ub6bc\ub6f3\ub6b2\ub6a5\ub6bc\ub6ba\ub6b7\ub6f3\ub6bc\ub6a5\ub6b6\ub6a1\ub6b5\ub6bf\ub6bc\ub6a4\ub6f3\ub6bc\ub6bd\ub6f3\ub6bd\ub6b6\ub6b4\ub6b2\ub6a7\ub6ba\ub6bc\ub6bd\ub6fd", 223262419), hl.a("\uf4e6\uf4e6", -1387137848), hl.a("\ub3fb\ub3a8\ub3af\ub3be\ub3ab\ub3fb", -1801276453), hl.a("\u710d\u7149\u7142\u715a\u7143\u7179\u7142\u710d", -1402834643), hl.a("\u5723\u5770\u5777\u5766\u5773\u5723", -4303101)};
    }
}

