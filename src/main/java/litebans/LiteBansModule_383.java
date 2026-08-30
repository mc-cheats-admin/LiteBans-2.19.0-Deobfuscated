package litebans;

import java.util.zip.ZipException;
public final class LiteBansModule_383
implements LiteBansModule_177 {
    private static final LiteBansModule_288 e = new LiteBansModule_288(51966);
    private static final LiteBansModule_288 AsyncBackgroundTask_5 = new LiteBansModule_288(0);
    private static final byte[] LiteBansModule_31 = new byte[0];
    private static final LiteBansModule_383 c = new LiteBansModule_383();

    @Override
    public LiteBansModule_288 c() {
        return e;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        return AsyncBackgroundTask_5;
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
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

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(byArray, n, n2);
}

