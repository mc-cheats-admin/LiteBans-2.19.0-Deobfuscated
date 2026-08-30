package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_254 {
    private LiteBansModule_254() {
    }

    public final boolean c() {
        return LiteBansModule_209.BaseCoreGenericHandler();
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        LiteBansModule_209.BaseCoreGenericHandler(flag);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        PlatformPlugin plugin = LiteBansModule_209.c;
        if (plugin != null) {
            return plugin;
        }
        ObjectUtilities.e("");
        return null;
    }

    public final void BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        LiteBansModule_209.c = plugin;
    }

    public /* synthetic */ LiteBansModule_254(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{""};
}

