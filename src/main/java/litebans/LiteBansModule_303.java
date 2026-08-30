package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_303 {
    private LiteBansModule_303() {
    }

    public final String[] BaseCoreGenericHandler(@NotNull String string, int n) {
        Object targetObj = new char[]{'\ufeff'};
        targetObj = StringUtilities.BaseCoreGenericHandler(string, targetObj, false, n, 2, null);
        char[] cArray = targetObj;
        return cArray.toArray(new String[0]);
    }

    public static /* synthetic */ String[] BaseCoreGenericHandler(LiteBansModule_303 iF2, String string, int n, int n2, Object targetObj) {
        if ((n2 & 2) != 0) {
            n = 2;
        }
        return iF2.BaseCoreGenericHandler(string, n);
    }

    public /* synthetic */ LiteBansModule_303(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"\ufeff", "", "", "\ufeff", "1", "0", "1"};
}

