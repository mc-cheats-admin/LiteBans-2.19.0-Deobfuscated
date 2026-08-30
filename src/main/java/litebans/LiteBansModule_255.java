package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_255 {
        private LiteBansModule_255() {
    }

    public final boolean c() {
        return LiteBansModule_210.BaseCoreGenericHandler();
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        LiteBansModule_210.BaseCoreGenericHandler(flag);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        PlatformPlugin plugin = LiteBansModule_210.c;
        if (plugin != null) {
            return plugin;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        LiteBansModule_210.c = plugin;
    }

    public /* synthetic */ LiteBansModule_255(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{""};
    }

    static {
        LiteBansModule_255.LiteBansModule_31();
    }
}

