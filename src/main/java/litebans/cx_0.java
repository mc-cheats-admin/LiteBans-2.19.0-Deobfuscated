package litebans;

import java.util.Arrays;
import litebans.dd_0;
import litebans.hp_0;

/*
 * Renamed from litebans.cx
 */
static class cx_0 {
    public static final int b(byte[] byArray) {
        int n = 0;
        for (int i = 0; i < 256; ++i) {
            n += cx_0.b(byArray, 4 * i);
        }
        return 84446 - (n - cx_0.b(byArray, 28));
    }

    public static final boolean a(byte[] byArray) {
        int n = cx_0.b(byArray, 24);
        if (n != 60012) {
            return false;
        }
        int n2 = cx_0.b(byArray, 28);
        return n2 == cx_0.b(byArray);
    }

    public static final long a(byte[] byArray, int n) {
        return hp_0.a(byArray, n, 8);
    }

    public static final int b(byte[] byArray, int n) {
        return (int)hp_0.a(byArray, n, 4);
    }

    public static final int c(byte[] byArray, int n) {
        return (int)hp_0.a(byArray, n, 2);
    }

    static final String a(dd_0 dd_02, byte[] byArray, int n, int n2) {
        return dd_02.a(Arrays.copyOfRange(byArray, n, n + n2));
    }
}

