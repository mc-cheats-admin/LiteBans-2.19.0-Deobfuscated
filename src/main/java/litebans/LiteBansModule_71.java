package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_71 {
    private final Object BaseCoreGenericHandler;
    private boolean LiteBansModule_31;

    public LiteBansModule_71(@NotNull Object targetObj, boolean flag) {
        this.plugin = targetObj;
        this.LiteBansModule_31 = flag;
    }

    public /* synthetic */ LiteBansModule_71(Object targetObj, boolean flag, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            flag = false;
        }
        this(targetObj, flag);
    }

    public final boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.LiteBansModule_31 = flag;
    }
}

