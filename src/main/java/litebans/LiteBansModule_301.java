package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_301
implements Serializable {
    private final Object AsyncBackgroundTask_5;
    private final Object BaseCoreGenericHandler;
    private final Object c;
    public LiteBansModule_301(Object targetObj, Object contextObj, Object resultObj) {
        this.AsyncBackgroundTask_5 = targetObj;
        this.plugin = contextObj;
        this.c = resultObj;
    }

    public final Object BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final Object c() {
        return this.plugin;
    }

    public final Object LiteBansModule_194() {
        return this.c;
    }

    public String toString() {
        return "" + '(' + this.AsyncBackgroundTask_5 + ", " + this.plugin + ", " + this.c + ')';
    }

    public final Object g() {
        return this.AsyncBackgroundTask_5;
    }

    public final Object e() {
        return this.plugin;
    }

    public final Object AsyncBackgroundTask_5() {
        return this.c;
    }

    public int hashCode() {
        int n = this.AsyncBackgroundTask_5 == null ? 0 : this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + (this.plugin == null ? 0 : this.plugin.hashCode());
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_301)) {
            return false;
        }
        LiteBansModule_301 id_02 = (LiteBansModule_301)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, id_02.AsyncBackgroundTask_5)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.plugin, id_02.BaseCoreGenericHandler)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.c, id_02.c);
}

