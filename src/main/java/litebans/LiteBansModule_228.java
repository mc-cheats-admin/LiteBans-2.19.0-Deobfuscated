package litebans;

import java.util.Arrays;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_228 {
    private static final char[] AsyncBackgroundTask_5;
    private static final int[] c;
    private static final byte[] BaseCoreGenericHandler;
    private static final char[] e;
    public static @Nullable byte[] BaseCoreGenericHandler(String string) {
        int n;
        int n2;
        int n3 = n2 = string != null ? string.length() : 0;
        if (n2 == 0) {
            return BaseCoreGenericHandler;
        }
        int n4 = 0;
        for (n = 0; n < n2; ++n) {
            if (c[string.charAt(n)] >= 0) continue;
            ++n4;
        }
        if ((n2 - n4) % 4 != 0) {
            return null;
        }
        n = 0;
        int n5 = n2;
        while (n5 > 1 && c[string.charAt(--n5)] <= 0) {
            if (string.charAt(n5) != '=') continue;
            ++n;
        }
        n5 = ((n2 - n4) * 6 >> 3) - n;
        byte[] byArray = new byte[n5];
        int n6 = 0;
        int n7 = 0;
        while (n7 < n5) {
            int n8 = 0;
            for (int i = 0; i < 4; ++i) {
                int n9;
                if ((n9 = c[string.charAt(n6++)]) >= 0) {
                    n8 |= n9 << 18 - i * 6;
                    continue;
                }
                --i;
            }
            byArray[n7++] = (byte)(n8 >> 16);
            if (n7 >= n5) continue;
            byArray[n7++] = (byte)(n8 >> 8);
            if (n7 >= n5) continue;
            byArray[n7++] = (byte)n8;
        }
        return byArray;
    }

    public static char[] LiteBansModule_31(byte[] byArray, boolean flag) {
        int n;
        int n2 = n = byArray != null ? byArray.length : 0;
        if (byArray == null || n == 0) {
            return e;
        }
        int n3 = n / 3 * 3;
        int n4 = (n - 1) / 3 + 1 << 2;
        int n5 = n4 + (flag ? (n4 - 1) / 76 << 1 : 0);
        char[] cArray = new char[n5];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        while (n6 < n3) {
            int n9 = (byArray[n6++] & 0xFF) << 16 | (byArray[n6++] & 0xFF) << 8 | byArray[n6++] & 0xFF;
            cArray[n7++] = AsyncBackgroundTask_5[n9 >>> 18 & 0x3F];
            cArray[n7++] = AsyncBackgroundTask_5[n9 >>> 12 & 0x3F];
            cArray[n7++] = AsyncBackgroundTask_5[n9 >>> 6 & 0x3F];
            cArray[n7++] = AsyncBackgroundTask_5[n9 & 0x3F];
            if (!flag || ++n8 != 19 || n7 >= n5 - 2) continue;
            cArray[n7++] = 13;
            cArray[n7++] = 10;
            n8 = 0;
        }
        n6 = n - n3;
        if (n6 > 0) {
            n7 = (byArray[n3] & 0xFF) << 10 | (n6 == 2 ? (byArray[n - 1] & 0xFF) << 2 : 0);
            cArray[n5 - 4] = AsyncBackgroundTask_5[n7 >> 12];
            cArray[n5 - 3] = AsyncBackgroundTask_5[n7 >>> 6 & 0x3F];
            cArray[n5 - 2] = n6 == 2 ? AsyncBackgroundTask_5[n7 & 0x3F] : 61;
            cArray[n5 - 1] = 61;
        }
        return cArray;
    }

    public static String BaseCoreGenericHandler(byte[] byArray, boolean flag) {
        return new String(LiteBansModule_228.LiteBansModule_31(byArray, flag));
    }

    static {
        LiteBansModule_228.BaseCoreGenericHandler();
        AsyncBackgroundTask_5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        c = new int[256];
        BaseCoreGenericHandler = new byte[0];
        e = new char[0];
        Arrays.fill(c, -1);
        int n = AsyncBackgroundTask_5.length;
        for (int i = 0; i < n; ++i) {
            LiteBansModule_228.c[LiteBansModule_228.AsyncBackgroundTask_5[i]] = i;
        }
        LiteBansModule_228.c[61] = 0;
    }

    }

