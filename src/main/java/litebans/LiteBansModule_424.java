package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_424 {
    private final LiteBansModule_96 c;
    private final Object AsyncBackgroundTask_5;
    private String BaseCoreGenericHandler;
        public LiteBansModule_424(@NotNull LiteBansModule_96 cp_02, @NotNull Object targetObj, @Nullable String string) {
        this.c = cp_02;
        this.AsyncBackgroundTask_5 = targetObj;
        this.plugin = string;
    }

    public /* synthetic */ LiteBansModule_424(LiteBansModule_96 cp_02, Object targetObj, String string, int n, LiteBansModule_14 aJ2) {
        if ((n & 4) != 0) {
            string = null;
        }
        this(cp_02, targetObj, string);
    }

    public final LiteBansModule_96 BaseCoreGenericHandler() {
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

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_424)) {
            return false;
        }
        LiteBansModule_424 lr_02 = (LiteBansModule_424)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.c, lr_02.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, lr_02.AsyncBackgroundTask_5)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.plugin, (Object)lr_02.BaseCoreGenericHandler);
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"FabricPreLoginEvent(data=", ", login=", ", cancelReason="};
    }

    static {
        LiteBansModule_424.LiteBansModule_31();
    }
}

