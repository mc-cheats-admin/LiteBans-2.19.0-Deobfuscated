package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_422 {
    private final LiteBansModule_95 c;
    private final Object AsyncBackgroundTask_5;
    private String BaseCoreGenericHandler;
    public LiteBansModule_422(@NotNull LiteBansModule_95 cp_02, @NotNull Object object, @Nullable String string) {
        this.c = cp_02;
        this.AsyncBackgroundTask_5 = object;
        this.plugin = string;
    }

    public /* synthetic */ LiteBansModule_422(LiteBansModule_95 cp_02, Object object, String string, int n, LiteBansModule_14 aJ2) {
        if ((n & 4) != 0) {
            string = null;
        }
        this(cp_02, object, string);
    }

    public final LiteBansModule_95 BaseCoreGenericHandler() {
        return this.c;
    }

    public final String c() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(@Nullable String string) {
        this.plugin = string;
    }

    public String toString() {
        return "FabricPreLoginEvent(data=" + this.c + ", login=" + this.AsyncBackgroundTask_5 + ", cancelReason=" + this.plugin + ')';
    }

    public int hashCode() {
        int n = this.c.hashCode();
        n = n * 31 + this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + (this.plugin == null ? 0 : this.plugin.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_422)) {
            return false;
        }
        LiteBansModule_422 lr_02 = (LiteBansModule_422)object;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.c, lr_02.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, lr_02.AsyncBackgroundTask_5)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.plugin, (Object)lr_02.BaseCoreGenericHandler);
}

