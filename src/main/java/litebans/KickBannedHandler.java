package litebans;

import org.jetbrains.annotations.NotNull;

public final class KickBannedHandler {
        public static /* synthetic */ void BaseCoreGenericHandler(LiteBansModule_159 ec_02, Object targetObj, CharSequence charSequence, String string, boolean flag, String string2, int n, Object contextObj) {
        if (contextObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            charSequence = "";
        }
        if ((n & 4) != 0) {
            string = "[event cancelled]";
        }
        if ((n & 8) != 0) {
            flag = true;
        }
        if ((n & 0x10) != 0) {
            string2 = "KICK_BANNED";
        }
        ec_02.BaseCoreGenericHandler(targetObj, charSequence, string, flag, string2);
    }

    public static boolean BaseCoreGenericHandler(@NotNull LiteBansModule_159 ec_02, @NotNull String string) {
        return ec_02.c(string) != null;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "", "[event cancelled]", "KICK_BANNED"};
    }

    static {
        KickBannedHandler.BaseCoreGenericHandler();
    }
}

