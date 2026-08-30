package litebans;

import java.io.InputStream;

public final class LiteBansModule_341 {
    private static final int LiteBansModule_31;
    private static final int BaseCoreGenericHandler;
    private static final byte[] c;

    public static final long BaseCoreGenericHandler(InputStream inputStream, long l3) {
        int n;
        long l5;
        long l7 = l3;
        while (l3 > 0L && (l5 = inputStream.skip(l3)) != 0L) {
            l3 -= l5;
        }
        while (l3 > 0L && (n = LiteBansModule_341.BaseCoreGenericHandler(inputStream, c, 0, (int)Math.min(l3, 4096L))) >= 1) {
            l3 -= (long)n;
        }
        return l7 - l3;
    }

    public static final int BaseCoreGenericHandler(InputStream inputStream, byte[] byArray) {
        return LiteBansModule_341.BaseCoreGenericHandler(inputStream, byArray, 0, byArray.length);
    }

    public static final int BaseCoreGenericHandler(InputStream inputStream, byte[] byArray, int n, int n2) {
        int n3;
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        for (n3 = 0; n3 != n2 && (n4 = inputStream.read(byArray, n + n3, n2 - n3)) != -1; n3 += n4) {
        }
        return n3;
    }

    static {
        BaseCoreGenericHandler = 4096;
        LiteBansModule_31 = 8024;
        c = new byte[4096];
}

