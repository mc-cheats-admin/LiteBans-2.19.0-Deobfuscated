package litebans;

import java.io.IOException;
import java.math.BigInteger;
public class LiteBansModule_355 {
    private static final int LiteBansModule_31 = 255;
    static final LiteBansModule_119 c = Utf8Handler.LiteBansModule_31(null);
    static final LiteBansModule_119 BaseCoreGenericHandler = new LiteBansModule_118();

    public static final long c(byte[] byArray, int n, int n2) {
        int n3;
        long l3 = 0L;
        int n4 = n + n2;
        if (n2 < 2) {
            throw new IllegalArgumentException("Length " + n2 + " must be LiteBansModule_21 least 2");
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
                throw new IllegalArgumentException(LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2, n3, by3));
            }
            l3 = (l3 << 3) + (long)(by3 - 48);
            ++n3;
        }
        return l3;
    }

    public static final long BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        boolean flag;
        if ((byArray[n] & 0x80) == 0) {
            return LiteBansModule_355.c(byArray, n, n2);
        }
        boolean flag2 = flag = byArray[n] == -1;
        if (n2 < 9) {
            return LiteBansModule_355.LiteBansModule_31(byArray, n, n2, flag);
        }
        return LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2, flag);
    }

    private static final long LiteBansModule_31(byte[] byArray, int n, int n2, boolean flag) {
        if (n2 >= 9) {
            throw new IllegalArgumentException("At offset " + n + ", " + n2 + " byte binary number exceeds maximum signed long value");
        }
        long l3 = 0L;
        for (int i = 1; i < n2; ++i) {
            l3 = (l3 << 8) + (long)(byArray[n + i] & 0xFF);
        }
        if (flag) {
            --l3;
            l3 ^= (long)Math.pow(2.0, (double)(n2 - 1) * 8.0) - 1L;
        }
        return flag ? -l3 : l3;
    }

    private static final long BaseCoreGenericHandler(byte[] byArray, int n, int n2, boolean flag) {
        byte[] byArray2 = new byte[n2 - 1];
        System.arraycopy(byArray, n + 1, byArray2, 0, n2 - 1);
        BigInteger bigInteger = new BigInteger(byArray2);
        if (flag) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + n + ", " + n2 + " byte binary number exceeds maximum signed long value");
        }
        return flag ? -bigInteger.longValue() : bigInteger.longValue();
    }

    public static final boolean BaseCoreGenericHandler(byte[] byArray, int n) {
        return byArray[n] == 1;
    }

    private static final String BaseCoreGenericHandler(byte[] byArray, int n, int n2, int n3, byte by2) {
        String string = new String(byArray, n, n2);
        string = string.replaceAll("\u0000", "{NUL}");
        return "Invalid byte " + by2 + " LiteBansModule_21 offset " + (n3 - n) + " InitializerHandler_3 '" + string + "' len=" + n2;
    }

    public static final String LiteBansModule_31(byte[] byArray, int n, int n2) {
        try {
            return LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2, c);
        }
        catch (IOException iOException) {
            try {
                return LiteBansModule_355.BaseCoreGenericHandler(byArray, n, n2, BaseCoreGenericHandler);
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
}

    public static final String BaseCoreGenericHandler(byte[] byArray, int n, int n2, LiteBansModule_119 dd_02) {
        int n4 = n;
        while (n3 < n2 && byArray[n4] != 0) {
            ++n3;
            ++n4;
        }
        if (n3 > 0) {
            byte[] byArray2 = new byte[n3];
            System.arraycopy(byArray, n, byArray2, 0, n3);
            return dd_02.BaseCoreGenericHandler(byArray2);
        }
        return "";
    }

    public static final LiteBansModule_292 LiteBansModule_31(byte[] byArray, int n) {
        long l3 = LiteBansModule_355.BaseCoreGenericHandler(byArray, n, 12);
        long l5 = LiteBansModule_355.BaseCoreGenericHandler(byArray, n + 12, 12);
        return new LiteBansModule_292(l3, l5);
    }

    public static final boolean BaseCoreGenericHandler(byte[] byArray) {
        long l3 = LiteBansModule_355.c(byArray, 148, 8);
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

