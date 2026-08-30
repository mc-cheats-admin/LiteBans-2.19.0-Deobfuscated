package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JarHandler {
    private final String c;
    private final String e;
    private final String AsyncBackgroundTask_5;
    private final String BaseCoreGenericHandler;
    private final String LiteBansModule_194;
    public JarHandler(@NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        this.c = string;
        this.e = string2;
        this.AsyncBackgroundTask_5 = string3;
        this.plugin = string4;
        this.LiteBansModule_194 = string5;
    }

    public final String AsyncBackgroundTask_5() {
        return this.c;
    }

    public final String LiteBansModule_31() {
        return this.e;
    }

    public final String e() {
        return this.AsyncBackgroundTask_5;
    }

    public final String c() {
        return this.LiteBansModule_194;
    }

    public String toString() {
        return this.c + ' ' + this.plugin;
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.e.hashCode();
        n = n * 31 + (this.AsyncBackgroundTask_5 == null ? 0 : this.AsyncBackgroundTask_5.hashCode());
        n = n * 31 + (this.plugin == null ? 0 : this.plugin.hashCode());
        n = n * 31 + (this.LiteBansModule_194 == null ? 0 : this.LiteBansModule_194.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof JarHandler)) {
            return false;
        }
        JarHandler jP2 = (JarHandler)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.c, jP2.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.e, jP2.e)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, jP2.AsyncBackgroundTask_5)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.plugin, jP2.BaseCoreGenericHandler)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_194, jP2.LiteBansModule_194);
}

