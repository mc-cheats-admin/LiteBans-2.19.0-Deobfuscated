package litebans;

public final class LiteBansModule_267 {
    public static final long BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        LiteBansModule_267.BaseCoreGenericHandler(n2);
        long l3 = 0L;
        for (int i = 0; i < n2; ++i) {
            l3 |= ((long)byArray[n + i] & 0xFFL) << 8 * i;
        }
        return l3;
    }

    public static final void BaseCoreGenericHandler(byte[] byArray, long l3, int n, int n2) {
        long l5 = l3;
        for (int i = 0; i < n2; ++i) {
            byArray[n + i] = (byte)(l5 & 0xFFL);
            l5 >>= 8;
}

    private static final void BaseCoreGenericHandler(int n) {
        if (n > 8) {
            throw new IllegalArgumentException("Can'AsyncBackgroundTask_22 read more than eight bytes into BaseCoreGenericHandler long value");
}

