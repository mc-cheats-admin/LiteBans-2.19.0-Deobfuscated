package litebans;

import java.util.Arrays;
import litebans.ci_0;
import litebans.dq_0;
import litebans.el_0;
import litebans.fl_0;
import litebans.kw_0;

/*
 * Renamed from litebans.eW
 */
public static abstract class ew_0 {
    private static final byte[] a = ci_0.a(8448L);

    public static final byte[] a(byte[] byArray) {
        int n = byArray.length - 1;
        for (int i = 0; i < byArray.length / 2; ++i) {
            byte by2 = byArray[i];
            byArray[i] = byArray[n - i];
            byArray[n - i] = by2;
        }
        return byArray;
    }

    public static final int a(byte by2) {
        if (by2 >= 0) {
            return by2;
        }
        return 256 + by2;
    }

    public static final byte a(int n) {
        if (n > 255 || n < 0) {
            throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + n + "]");
        }
        if (n < 128) {
            return (byte)n;
        }
        return (byte)(n - 256);
    }

    static final byte[] b(byte[] byArray) {
        if (byArray != null) {
            return Arrays.copyOf(byArray, byArray.length);
        }
        return null;
    }

    private static final boolean b(kw_0 kw_02) {
        return !kw_02.d().a();
    }

    private static final boolean a(kw_0 kw_02) {
        return kw_02.getMethod() == 0 || kw_02.getMethod() == dq_0.v.a() || kw_02.getMethod() == dq_0.l.a() || kw_02.getMethod() == 8 || kw_02.getMethod() == dq_0.c.a() || kw_02.getMethod() == dq_0.q.a();
    }

    static final void c(kw_0 kw_02) {
        if (!ew_0.b(kw_02)) {
            throw new el_0(fl_0.b, kw_02);
        }
        if (!ew_0.a(kw_02)) {
            dq_0 dq_02 = dq_0.a(kw_02.getMethod());
            if (dq_02 == null) {
                throw new el_0(fl_0.c, kw_02);
            }
            throw new el_0(dq_02, kw_02);
        }
    }
}

