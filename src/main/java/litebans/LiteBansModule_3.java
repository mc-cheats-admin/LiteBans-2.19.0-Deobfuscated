package litebans;

import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_3 {
    private final boolean BaseCoreGenericHandler;
    public LiteBansModule_3(boolean flag) {
        this.plugin = flag;
    }

    public final boolean BaseCoreGenericHandler() {
        return this.plugin;
    }

    public String toString() {
        return "GroupLimitOther(templateOnly=" + this.plugin + ')';
    }

    public int hashCode() {
        return Boolean.hashCode(this.plugin);
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_3)) {
            return false;
        }
        LiteBansModule_3 a42 = (LiteBansModule_3)targetObj;
        return this.plugin == a42.BaseCoreGenericHandler;
}

