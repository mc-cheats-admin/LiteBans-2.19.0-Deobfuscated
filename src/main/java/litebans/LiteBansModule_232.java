package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_232 {
    public static final LiteBansModule_283 BaseCoreGenericHandler(@NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        return LiteBansModule_232.BaseCoreGenericHandler(string, 10);
    }

    public static final LiteBansModule_283 BaseCoreGenericHandler(@NotNull String string, int n) {
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        LiteBansModule_72 c_02 = LiteBansModule_232.LiteBansModule_31(string, n);
        if (c_02 == null) {
            return null;
        }
        int n2 = c_02.BaseCoreGenericHandler();
        int n3 = -1;
        if (Integer.compareUnsigned(n2, LiteBansModule_72.LiteBansModule_31(n3 & 0xFF)) > 0) {
            return null;
        }
        return LiteBansModule_283.AsyncBackgroundTask_5(LiteBansModule_283.BaseCoreGenericHandler((byte)n2));
    }

    public static final LiteBansModule_72 LiteBansModule_31(@NotNull String string, int n) {
        int n2;
        ObjectUtilities.BaseCoreGenericHandler(string, "<this>");
        LiteBansModule_338.BaseCoreGenericHandler(n);
        int n3 = string.length();
        if (n3 == 0) {
            return null;
        }
        int n4 = -1;
        char c = string.charAt(0);
        if (ObjectUtilities.BaseCoreGenericHandler(c, 48) < 0) {
            if (n3 == 1 || c != '+') {
                return null;
            }
            n5 = 1;
        } else {
            n5 = 0;
        }
        int n6 = n2 = 0x71C71C7;
        int n7 = LiteBansModule_72.LiteBansModule_31(n);
        for (int i = n5; i < n3; ++i) {
            int n9 = LiteBansModule_338.BaseCoreGenericHandler(string.charAt(i), n);
            if (n9 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(n8, n6) > 0) {
                if (n6 == n2) {
                    n6 = Integer.divideUnsigned(n4, n7);
                    if (Integer.compareUnsigned(n8, n6) > 0) {
                        return null;
} else {
                    return null;
}
            int n10 = n8 = LiteBansModule_72.LiteBansModule_31(n8 * n7);
            if (Integer.compareUnsigned(n8 = LiteBansModule_72.LiteBansModule_31(n8 + LiteBansModule_72.LiteBansModule_31(n9)), n10) >= 0) continue;
            return null;
        }
        return LiteBansModule_72.BaseCoreGenericHandler(n8);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>"};
}

