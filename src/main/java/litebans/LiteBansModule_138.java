package litebans;

public final class LiteBansModule_138 {
    private boolean BaseCoreGenericHandler;
    private boolean LiteBansModule_31;

    public LiteBansModule_138(boolean flag, boolean flag2) {
        this.plugin = flag;
        this.LiteBansModule_31 = flag2;
    }

    public /* synthetic */ LiteBansModule_138(boolean flag, boolean flag2, int n, LiteBansModule_14 aJ2) {
        if ((n & 1) != 0) {
            flag = false;
        }
        if ((n & 2) != 0) {
            flag2 = false;
        }
        this(flag, flag2);
    }

    public final boolean BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.plugin = flag;
    }

    public final boolean LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public LiteBansModule_138() {
        this(false, false, 3, null);
    }
}

