package litebans;

import java.util.zip.ZipException;
public class LiteBansModule_171
implements LiteBansModule_178 {
    public static final LiteBansModule_289 LiteBansModule_195;
    public static final int g;
    private static final int e;
    private short AsyncBackgroundTask_5;
    private boolean c;
    private int LiteBansModule_31 = 0;

    @Override
    public LiteBansModule_289 c() {
        return LiteBansModule_195;
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return new LiteBansModule_289(2 + this.LiteBansModule_31);
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        return new LiteBansModule_289(2);
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[2 + this.LiteBansModule_31];
        LiteBansModule_289.BaseCoreGenericHandler(this.AsyncBackgroundTask_5 | (this.c ? 32768 : 0), byArray, 0);
        return byArray;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return LiteBansModule_289.BaseCoreGenericHandler(this.AsyncBackgroundTask_5 | (this.c ? 32768 : 0));
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        this.LiteBansModule_31(byArray, n, n2);
        this.LiteBansModule_31 = n2 - 2;
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        if (n2 < 2) {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): " + n2);
        }
        int n3 = LiteBansModule_289.BaseCoreGenericHandler(byArray, n);
        this.AsyncBackgroundTask_5 = (short)(n3 & Short.MAX_VALUE);
        this.c = (n3 & 0x8000) != 0;
    }

    static {
        e = 32768;
        g = 2;
        LiteBansModule_195 = new LiteBansModule_289(41246);
    }
}

