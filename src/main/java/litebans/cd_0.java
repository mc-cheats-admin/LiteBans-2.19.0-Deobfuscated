package litebans;

import java.io.UnsupportedEncodingException;

/*
 * Renamed from litebans.cd
 */
public static class cd_0 {
    private static final int a = 255;

    public static final boolean a(String string, byte[] byArray, int n, int n2) {
        byte[] byArray2;
        try {
            byArray2 = string.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
        return cd_0.a(byArray2, 0, byArray2.length, byArray, n, n2, false);
    }

    public static final boolean a(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4, boolean bl) {
        int n5;
        int n6 = n2 < n4 ? n2 : n4;
        for (n5 = 0; n5 < n6; ++n5) {
            if (byArray[n + n5] == byArray2[n3 + n5]) continue;
            return false;
        }
        if (n2 == n4) {
            return true;
        }
        if (bl) {
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

    public static final boolean a(byte[] byArray, int n) {
        for (int i = 0; i < n; ++i) {
            if (byArray[i] == 0) continue;
            return false;
        }
        return true;
    }
}

