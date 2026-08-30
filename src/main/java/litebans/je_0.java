package litebans;

import java.io.InputStream;

/*
 * Renamed from litebans.je
 */
public static final class je_0 {
    private static final int b;
    private static final int a;
    private static final byte[] c;

    public static final long a(InputStream inputStream, long l3) {
        int n;
        long l5;
        long l7 = l3;
        while (l3 > 0L && (l5 = inputStream.skip(l3)) != 0L) {
            l3 -= l5;
        }
        while (l3 > 0L && (n = je_0.a(inputStream, c, 0, (int)Math.min(l3, 4096L))) >= 1) {
            l3 -= (long)n;
        }
        return l7 - l3;
    }

    public static final int a(InputStream inputStream, byte[] byArray) {
        return je_0.a(inputStream, byArray, 0, byArray.length);
    }

    public static final int a(InputStream inputStream, byte[] byArray, int n, int n2) {
        int n3;
        if (n2 < 0 || n < 0 || n2 + n > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        int n4 = 0;
        for (n3 = 0; n3 != n2 && (n4 = inputStream.read(byArray, n + n3, n2 - n3)) != -1; n3 += n4) {
        }
        return n3;
    }

    static {
        a = 4096;
        b = 8024;
        c = new byte[4096];
    }
}

