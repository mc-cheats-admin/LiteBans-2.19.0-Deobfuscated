package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_95 {
    private final String c;
    private final String AsyncBackgroundTask_5;
    private final String BaseCoreGenericHandler;
    public LiteBansModule_95(@NotNull String string, @NotNull String string2, @Nullable String string3) {
        this.c = string;
        this.AsyncBackgroundTask_5 = string2;
        this.plugin = string3;
    }

    public final String c() {
        return this.c;
    }

    public final String g() {
        return this.AsyncBackgroundTask_5;
    }

    public final String LiteBansModule_31() {
        return this.plugin;
    }

    public final String LiteBansModule_194() {
        return this.c;
    }

    public final String e() {
        return this.AsyncBackgroundTask_5;
    }

    public final String AsyncBackgroundTask_5() {
        return this.plugin;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.c + ", uuid=" + this.AsyncBackgroundTask_5 + ", ip=" + this.plugin + ')';
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + (this.plugin == null ? 0 : this.plugin.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_95)) {
            return false;
        }
        LiteBansModule_95 cp_02 = (LiteBansModule_95)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.c, cp_02.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, cp_02.AsyncBackgroundTask_5)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.plugin, cp_02.BaseCoreGenericHandler);
}

