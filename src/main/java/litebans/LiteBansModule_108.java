package litebans;

import java.util.Arrays;
static class LiteBansModule_108 {
    public static final int LiteBansModule_31(byte[] byArray) {
        int n = 0;
        for (int i = 0; i < 256; ++i) {
            n += LiteBansModule_108.LiteBansModule_31(byArray, 4 * i);
        }
        return 84446 - (n - LiteBansModule_108.LiteBansModule_31(byArray, 28));
    }

    public static final boolean BaseCoreGenericHandler(byte[] byArray) {
        int n = LiteBansModule_108.LiteBansModule_31(byArray, 24);
        if (n != 60012) {
            return false;
        }
        int n2 = LiteBansModule_108.LiteBansModule_31(byArray, 28);
        return n2 == LiteBansModule_108.LiteBansModule_31(byArray);
    }

    public static final long BaseCoreGenericHandler(byte[] byArray, int n) {
        return LiteBansModule_267.BaseCoreGenericHandler(byArray, n, 8);
    }

    public static final int LiteBansModule_31(byte[] byArray, int n) {
        return (int)LiteBansModule_267.BaseCoreGenericHandler(byArray, n, 4);
    }

    public static final int c(byte[] byArray, int n) {
        return (int)LiteBansModule_267.BaseCoreGenericHandler(byArray, n, 2);
    }

    static final String BaseCoreGenericHandler(LiteBansModule_119 dd_02, byte[] byArray, int n, int n2) {
        return dd_02.BaseCoreGenericHandler(Arrays.copyOfRange(byArray, n, n + n2));
    }
}

