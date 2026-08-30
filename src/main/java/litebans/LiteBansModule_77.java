package litebans;

import java.io.UnsupportedEncodingException;

public class LiteBansModule_77 {
    private static final int BaseCoreGenericHandler = 255;

    public static final boolean BaseCoreGenericHandler(String string, byte[] byArray, int n, int n2) {
        byte[] byArray2;
        try {
            byArray2 = string.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
        return LiteBansModule_77.BaseCoreGenericHandler(byArray2, 0, byArray2.length, byArray, n, n2, false);
    }

    public static final boolean BaseCoreGenericHandler(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4, boolean flag) {
        int n5;
        int n6 = n2 < n4 ? n2 : n4;
        for (n5 = 0; n5 < n6; ++n5) {
            if (byArray[n + n5] == byArray2[n3 + n5]) continue;
            return false;
        }
        if (n2 == n4) {
            return true;
        }
        if (flag) {
            if (n2 > n4) {
                for (n5 = n4; n5 < n2; ++n5) {
                    if (byArray[n + n5] == 0) continue;
                    return false;
                }
            } else {
                for (n5 = n2; n5 < n4; ++n5) {
                    if (byArray2[n3 + n5] == 0) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean BaseCoreGenericHandler(byte[] byArray, int n) {
        for (int i = 0; i < n; ++i) {
            if (byArray[i] == 0) continue;
            return false;
        }
        return true;
    }
}

