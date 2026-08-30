package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_70 {
    private final Object BaseCoreGenericHandler;
    private boolean LiteBansModule_31;

    public LiteBansModule_70(@NotNull Object object, boolean flag) {
        this.plugin = object;
        this.LiteBansModule_31 = flag;
    }

    public /* synthetic */ LiteBansModule_70(Object object, boolean flag, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            flag = false;
        }
        this(object, flag);
    }

    public final boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.LiteBansModule_31 = flag;
}

