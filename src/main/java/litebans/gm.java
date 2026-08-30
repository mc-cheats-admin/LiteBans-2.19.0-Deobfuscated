package litebans;

import java.util.Arrays;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

public class gm {
    private static final char[] d;
    private static final int[] c;
    private static final byte[] a;
    private static final char[] e;
    private static /* synthetic */ String[] b;

    public static @Nullable byte[] a(String string) {
        int n;
        int n2;
        int n3 = n2 = string != null ? string.length() : 0;
        if (n2 == 0) {
            return a;
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

    public static char[] b(byte[] byArray, boolean bl) {
        int n;
        int n2 = n = byArray != null ? byArray.length : 0;
        if (byArray == null || n == 0) {
            return e;
        }
        int n3 = n / 3 * 3;
        int n4 = (n - 1) / 3 + 1 << 2;
        int n5 = n4 + (bl ? (n4 - 1) / 76 << 1 : 0);
        char[] cArray = new char[n5];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        while (n6 < n3) {
            int n9 = (byArray[n6++] & 0xFF) << 16 | (byArray[n6++] & 0xFF) << 8 | byArray[n6++] & 0xFF;
            cArray[n7++] = d[n9 >>> 18 & 0x3F];
            cArray[n7++] = d[n9 >>> 12 & 0x3F];
            cArray[n7++] = d[n9 >>> 6 & 0x3F];
            cArray[n7++] = d[n9 & 0x3F];
            if (!bl || ++n8 != 19 || n7 >= n5 - 2) continue;
            cArray[n7++] = 13;
            cArray[n7++] = 10;
            n8 = 0;
        }
        n6 = n - n3;
        if (n6 > 0) {
            n7 = (byArray[n3] & 0xFF) << 10 | (n6 == 2 ? (byArray[n - 1] & 0xFF) << 2 : 0);
            cArray[n5 - 4] = d[n7 >> 12];
            cArray[n5 - 3] = d[n7 >>> 6 & 0x3F];
            cArray[n5 - 2] = n6 == 2 ? d[n7 & 0x3F] : 61;
            cArray[n5 - 1] = 61;
        }
        return cArray;
    }

    public static String a(byte[] byArray, boolean bl) {
        return new String(gm.b(byArray, bl));
    }

    static {
        gm.a();
        d = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        c = new int[256];
        a = new byte[0];
        e = new char[0];
        Arrays.fill(c, -1);
        int n = d.length;
        for (int i = 0; i < n; ++i) {
            gm.c[gm.d[i]] = i;
        }
        gm.c[61] = 0;
    }

    private static final void a() {
        b = new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"};
    }
}

