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

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_3)) {
            return false;
        }
        LiteBansModule_3 a42 = (LiteBansModule_3)object;
        return this.plugin == a42.BaseCoreGenericHandler;
}

