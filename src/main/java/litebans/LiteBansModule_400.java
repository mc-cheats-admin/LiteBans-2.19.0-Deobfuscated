package litebans;

import java.util.zip.ZipException;
public final class LiteBansModule_400
implements LiteBansModule_351 {
    public static final int e;
    public static final int g;
    public static final int BaseCoreGenericHandler;
    public static final LiteBansModule_400 LiteBansModule_194;
    public static final LiteBansModule_400 LiteBansModule_31;
    public static final LiteBansModule_400 c;
    private final int AsyncBackgroundTask_5;

    private LiteBansModule_400(int n) {
        this.AsyncBackgroundTask_5 = n;
    }

    @Override
    public LiteBansModule_177 BaseCoreGenericHandler(byte[] byArray, int n, int n2, boolean flag, int n3) {
        switch (this.AsyncBackgroundTask_5) {
            case 0: {
                throw new ZipException("Bad extra field starting LiteBansModule_21 " + n + ".  Block length of " + n3 + " bytes exceeds remaining data of " + (n2 - 4) + " ");
            }
            case 2: {
                LiteBansModule_264 hn_02 = new LiteBansModule_264();
                if (flag) {
                    hn_02.BaseCoreGenericHandler(byArray, n, n2);
                } else {
                    hn_02.LiteBansModule_31(byArray, n, n2);
                }
                return hn_02;
            }
            case 1: {
                return null;
}
        throw new ZipException("Unknown UnparseableExtraField key: " + this.AsyncBackgroundTask_5);
    }

    static {
        BaseCoreGenericHandler = 2;
        g = 1;
        e = 0;
        LiteBansModule_194 = new LiteBansModule_400(0);
        LiteBansModule_31 = new LiteBansModule_400(1);
        c = new LiteBansModule_400(2);
}

