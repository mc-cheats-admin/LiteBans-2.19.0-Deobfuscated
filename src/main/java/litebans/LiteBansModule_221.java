package litebans;

import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_221 {
        private LiteBansModule_221() {
    }

    public final boolean BaseCoreGenericHandler(@Nullable String string, @Nullable String string2) {
        return string != null && ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(boolean flag, @Nullable String string, @Nullable String string2, boolean flag2) {
        if (!flag) return false;
        if (string2 == null) return false;
        if (string == null) return false;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)string)) return true;
        if (!flag2) return false;
        CharSequence charSequence = string2;
        if (!new NativepatternHandler(LiteBansModule_435.LiteBansModule_31.BaseCoreGenericHandler(string, "%", (Object)".*")).BaseCoreGenericHandler(charSequence)) return false;
        return true;
    }

    public final boolean BaseCoreGenericHandler(@Nullable String string) {
        return string != null && (StringUtilities.c((CharSequence)string, '%', false, 2, null) || StringUtilities.c((CharSequence)string, '_', false, 2, null));
    }

    public /* synthetic */ LiteBansModule_221(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"%", ".*"};
    }

    static {
        LiteBansModule_221.BaseCoreGenericHandler();
    }
}

