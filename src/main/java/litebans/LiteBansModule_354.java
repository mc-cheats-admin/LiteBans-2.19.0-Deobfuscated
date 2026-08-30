package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_354
implements Serializable {
    private final Object LiteBansModule_31;
    private final Object c;
    public LiteBansModule_354(Object object, Object object2) {
        this.LiteBansModule_31 = object;
        this.c = object2;
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

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_354)) {
            return false;
        }
        LiteBansModule_354 jT2 = (LiteBansModule_354)object;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, jT2.LiteBansModule_31)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.c, jT2.c);
    }

    private static final void AsyncBackgroundTask_5() {
        BaseCoreGenericHandler = new String[]{", "};
}

