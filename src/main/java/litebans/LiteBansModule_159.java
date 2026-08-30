package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_159
implements Iterable,
LiteBansModule_122 {
    public static final LiteBansModule_189 BaseCoreGenericHandler;
    private final int c;
    private final int e;
    private final int LiteBansModule_31;
    public LiteBansModule_159(int n, int n2, int n3) {
        if (n3 == 0) {
            throw new IllegalArgumentException("Step must be non-");
        }
        if (n3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on ");
        }
        this.c = n;
        this.e = LiteBansModule_78.LiteBansModule_31(n, n2, n3);
        this.LiteBansModule_31 = n3;
    }

    public final int c() {
        return this.c;
    }

    public final int LiteBansModule_31() {
        return this.e;
    }

    public final int BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public LiteBansModule_290 e() {
        return new LiteBansModule_322(this.c, this.e, this.LiteBansModule_31);
    }

    public boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_31 > 0 ? this.c > this.e : this.c < this.e;
    }

    public boolean equals(@Nullable Object object) {
        return object instanceof LiteBansModule_159 && (this.plugin() && ((LiteBansModule_159)object).BaseCoreGenericHandler() || this.c == ((LiteBansModule_159)object).c && this.e == ((LiteBansModule_159)object).e && this.LiteBansModule_31 == ((LiteBansModule_159)object).LiteBansModule_31);
    }

    public int hashCode() {
        return this.plugin() ? -1 : 31 * (31 * this.c + this.e) + this.LiteBansModule_31;
    }

    public String toString() {
        return this.LiteBansModule_31 > 0 ? this.c + ". + " + this.e + " step " + this.LiteBansModule_31 : this.c + " downTo " + this.e + " step " + -this.LiteBansModule_31;
    }

    public Iterator iterator() {
        return this.e();
    }

    static {
        LiteBansModule_159.AsyncBackgroundTask_5();
        BaseCoreGenericHandler = new LiteBansModule_189(null);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"Step must be non-", "Step must be greater than Int.MIN_VALUE to avoid overflow on ", ". + ", " step ", " downTo ", " step "};
    }
}

