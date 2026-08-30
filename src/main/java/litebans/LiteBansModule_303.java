package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_303 {
    private LiteBansModule_303() {
    }

    public final String[] BaseCoreGenericHandler(@NotNull String string, int n) {
        Object object = new char[]{'\ufeff'};
        object = StringUtilities.BaseCoreGenericHandler((CharSequence)string, object, false, n, 2, null);
        boolean flag = false;
        char[] cArray = object;
        return cArray.toArray(new String[0]);
    }

    public static /* synthetic */ String[] BaseCoreGenericHandler(LiteBansModule_303 iF2, String string, int n, int n2, Object object) {
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

    }

