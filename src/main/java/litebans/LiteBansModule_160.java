package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_160
implements Iterable,
LiteBansModule_123 {
    public static final LiteBansModule_190 BaseCoreGenericHandler;
    private final int c;
    private final int e;
    private final int LiteBansModule_31;
        public LiteBansModule_160(int n, int n2, int n3) {
        if (n3 == 0) {
            throw new IllegalArgumentException("Step must be non-");
        }
        if (n3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on ");
        }
        this.c = n;
        this.e = LiteBansModule_79.LiteBansModule_31(n, n2, n3);
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

    public LiteBansModule_291 e() {
        return new LiteBansModule_323(this.c, this.e, this.LiteBansModule_31);
    }

    public boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_31 > 0 ? this.c > this.e : this.c < this.e;
    }

    public boolean equals(@Nullable Object targetObj) {
        return targetObj instanceof LiteBansModule_160 && (this.plugin() && ((LiteBansModule_160)targetObj).BaseCoreGenericHandler() || this.c == ((LiteBansModule_160)targetObj).c && this.e == ((LiteBansModule_160)targetObj).e && this.LiteBansModule_31 == ((LiteBansModule_160)targetObj).LiteBansModule_31);
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
        LiteBansModule_160.AsyncBackgroundTask_5();
        BaseCoreGenericHandler = new LiteBansModule_190(null);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"Step must be non-", "Step must be greater than Int.MIN_VALUE to avoid overflow on ", ". + ", " step ", " downTo ", " step "};
    }
}

