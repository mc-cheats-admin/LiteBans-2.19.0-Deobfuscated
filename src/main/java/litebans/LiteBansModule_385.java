package litebans;

import java.util.zip.ZipException;
public final class LiteBansModule_385
implements LiteBansModule_178 {
    private static final LiteBansModule_289 e = new LiteBansModule_289(51966);
    private static final LiteBansModule_289 AsyncBackgroundTask_5 = new LiteBansModule_289(0);
    private static final byte[] LiteBansModule_31 = new byte[0];
    private static final LiteBansModule_385 c = new LiteBansModule_385();

    @Override
    public LiteBansModule_289 c() {
        return e;
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return AsyncBackgroundTask_5;
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        return AsyncBackgroundTask_5;
    }

    @Override
    public byte[] e() {
        return LiteBansModule_31;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return LiteBansModule_31;
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        if (n2 != 0) {
            throw new ZipException("JarMarker doesn'AsyncBackgroundTask_22 expect any data");
        }
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(byArray, n, n2);
    }
}

