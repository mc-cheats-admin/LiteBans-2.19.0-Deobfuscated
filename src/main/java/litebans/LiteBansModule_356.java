package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_356
implements Serializable {
    private final Object LiteBansModule_31;
    private final Object c;
        public LiteBansModule_356(Object targetObj, Object contextObj) {
        this.LiteBansModule_31 = targetObj;
        this.c = contextObj;
    }

    public final Object LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final Object e() {
        return this.c;
    }

    public String toString() {
        return "" + '(' + this.LiteBansModule_31 + ", " + this.c + ')';
    }

    public final Object BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final Object c() {
        return this.c;
    }

    public int hashCode() {
        int n = this.LiteBansModule_31 == null ? 0 : this.LiteBansModule_31.hashCode();
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_356)) {
            return false;
        }
        LiteBansModule_356 jT2 = (LiteBansModule_356)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, jT2.LiteBansModule_31)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.c, jT2.c);
    }

    private static final void AsyncBackgroundTask_5() {
        BaseCoreGenericHandler = new String[]{", "};
    }

    static {
        LiteBansModule_356.AsyncBackgroundTask_5();
    }
}

