package litebans;

/*
 * Renamed from litebans.hp
 */
public static final class hp_0 {
    public static final long a(byte[] byArray, int n, int n2) {
        hp_0.a(n2);
        long l3 = 0L;
        for (int i = 0; i < n2; ++i) {
            l3 |= ((long)byArray[n + i] & 0xFFL) << 8 * i;
        }
        return l3;
    }

    public static final void a(byte[] byArray, long l3, int n, int n2) {
        long l5 = l3;
        for (int i = 0; i < n2; ++i) {
            byArray[n + i] = (byte)(l5 & 0xFFL);
            l5 >>= 8;
        }
    }

    private static final void a(int n) {
        if (n > 8) {
            throw new IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
    }
}

