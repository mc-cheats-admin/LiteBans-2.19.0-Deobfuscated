package litebans;

import java.io.IOException;
import java.math.BigInteger;
import litebans.c4;
import litebans.dd;
import litebans.dd_0;
import litebans.i7;

/*
 * Renamed from litebans.jt
 */
public static class jt_0 {
    private static final int b = 255;
    static final dd_0 c = c4.b(null);
    static final dd_0 a = new dd();

    public static final long c(byte[] byArray, int n, int n2) {
        int n3;
        long l3 = 0L;
        int n4 = n + n2;
        if (n2 < 2) {
            throw new IllegalArgumentException("Length " + n2 + " must be at least 2");
        }
        if (byArray[n3] == 0) {
            return 0L;
        }
        for (n3 = n; n3 < n4 && byArray[n3] == 32; ++n3) {
        }
        byte by2 = byArray[n4 - 1];
        while (n3 < n4 && (by2 == 0 || by2 == 32)) {
            by2 = byArray[--n4 - 1];
        }
        while (n3 < n4) {
            byte by3 = byArray[n3];
            if (by3 < 48 || by3 > 55) {
                throw new IllegalArgumentException(jt_0.a(byArray, n, n2, n3, by3));
            }
            l3 = (l3 << 3) + (long)(by3 - 48);
            ++n3;
        }
        return l3;
    }

    public static final long a(byte[] byArray, int n, int n2) {
        boolean bl;
        if ((byArray[n] & 0x80) == 0) {
            return jt_0.c(byArray, n, n2);
        }
        boolean bl2 = bl = byArray[n] == -1;
        if (n2 < 9) {
            return jt_0.b(byArray, n, n2, bl);
        }
        return jt_0.a(byArray, n, n2, bl);
    }

    private static final long b(byte[] byArray, int n, int n2, boolean bl) {
        if (n2 >= 9) {
            throw new IllegalArgumentException("At offset " + n + ", " + n2 + " byte binary number exceeds maximum signed long value");
        }
        long l3 = 0L;
        for (int i = 1; i < n2; ++i) {
            l3 = (l3 << 8) + (long)(byArray[n + i] & 0xFF);
        }
        if (bl) {
            --l3;
            l3 ^= (long)Math.pow(2.0, (double)(n2 - 1) * 8.0) - 1L;
        }
        return bl ? -l3 : l3;
    }

    private static final long a(byte[] byArray, int n, int n2, boolean bl) {
        byte[] byArray2 = new byte[n2 - 1];
        System.arraycopy(byArray, n + 1, byArray2, 0, n2 - 1);
        BigInteger bigInteger = new BigInteger(byArray2);
        if (bl) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + n + ", " + n2 + " byte binary number exceeds maximum signed long value");
        }
        return bl ? -bigInteger.longValue() : bigInteger.longValue();
    }

    public static final boolean a(byte[] byArray, int n) {
        return byArray[n] == 1;
    }

    private static final String a(byte[] byArray, int n, int n2, int n3, byte by2) {
        String string = new String(byArray, n, n2);
        string = string.replaceAll("\u0000", "{NUL}");
        return "Invalid byte " + by2 + " at offset " + (n3 - n) + " in '" + string + "' len=" + n2;
    }

    public static final String b(byte[] byArray, int n, int n2) {
        try {
            return jt_0.a(byArray, n, n2, c);
        }
        catch (IOException iOException) {
            try {
                return jt_0.a(byArray, n, n2, a);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public static final String a(byte[] byArray, int n, int n2, dd_0 dd_02) {
        int n3 = 0;
        int n4 = n;
        while (n3 < n2 && byArray[n4] != 0) {
            ++n3;
            ++n4;
        }
        if (n3 > 0) {
            byte[] byArray2 = new byte[n3];
            System.arraycopy(byArray, n, byArray2, 0, n3);
            return dd_02.a(byArray2);
        }
        return "";
    }

    public static final i7 b(byte[] byArray, int n) {
        long l3 = jt_0.a(byArray, n, 12);
        long l5 = jt_0.a(byArray, n + 12, 12);
        return new i7(l3, l5);
    }

    public static final boolean a(byte[] byArray) {
        long l3 = jt_0.c(byArray, 148, 8);
        long l5 = 0L;
        long l7 = 0L;
        for (int i = 0; i < byArray.length; ++i) {
            int n = byArray[i];
            if (148 <= i && i < 156) {
                n = 32;
            }
            l5 += (long)(0xFF & n);
            l7 += (long)n;
        }
        return l3 == l5 || l3 == l7;
    }
}

