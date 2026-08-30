package litebans;

import java.util.Arrays;
public abstract class LiteBansModule_188 {
    private static final byte[] BaseCoreGenericHandler = LiteBansModule_84.BaseCoreGenericHandler(8448L);

    public static final byte[] BaseCoreGenericHandler(byte[] byArray) {
        int n = byArray.length - 1;
        for (int i = 0; i < byArray.length / 2; ++i) {
            byte by2 = byArray[i];
            byArray[i] = byArray[n - i];
            byArray[n - i] = by2;
        }
        return byArray;
    }

    public static final int BaseCoreGenericHandler(byte by2) {
        if (by2 >= 0) {
            return by2;
        }
        return 256 + by2;
    }

    public static final byte BaseCoreGenericHandler(int n) {
        if (n > 255 || n < 0) {
            throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + n + "]");
        }
        if (n < 128) {
            return (byte)n;
        }
        return (byte)(n - 256);
    }

    static final byte[] LiteBansModule_31(byte[] byArray) {
        if (byArray != null) {
            return Arrays.copyOf(byArray, byArray.length);
        }
        return null;
    }

    private static final boolean LiteBansModule_31(LiteBansModule_396 kw_02) {
        return !kw_02.AsyncBackgroundTask_5().BaseCoreGenericHandler();
    }

    private static final boolean BaseCoreGenericHandler(LiteBansModule_396 kw_02) {
        return kw_02.getMethod() == 0 || kw_02.getMethod() == StoredHandler.CommandThrottleService.BaseCoreGenericHandler() || kw_02.getMethod() == StoredHandler.LiteBansModule_401.BaseCoreGenericHandler() || kw_02.getMethod() == 8 || kw_02.getMethod() == StoredHandler.c.BaseCoreGenericHandler() || kw_02.getMethod() == StoredHandler.q.BaseCoreGenericHandler();
    }

    static final void c(LiteBansModule_396 kw_02) {
        if (!LiteBansModule_188.LiteBansModule_31(kw_02)) {
            throw new LiteBansModule_173(EncryptionHandler.LiteBansModule_31, kw_02);
        }
        if (!LiteBansModule_188.BaseCoreGenericHandler(kw_02)) {
            StoredHandler dq_02 = StoredHandler.BaseCoreGenericHandler(kw_02.getMethod());
            if (dq_02 == null) {
                throw new LiteBansModule_173(EncryptionHandler.c, kw_02);
            }
            throw new LiteBansModule_173(dq_02, kw_02);
}

