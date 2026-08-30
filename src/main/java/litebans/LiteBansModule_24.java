package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
public abstract class LiteBansModule_24
implements LiteBansModule_178 {
    private final LiteBansModule_289 AsyncBackgroundTask_5;
    private byte[] LiteBansModule_31;
    private byte[] c;

    protected LiteBansModule_24(LiteBansModule_289 i22) {
        this.AsyncBackgroundTask_5 = i22;
    }

    @Override
    public LiteBansModule_289 c() {
        return this.AsyncBackgroundTask_5;
    }

    public void LiteBansModule_31(byte[] byArray) {
        this.LiteBansModule_31 = LiteBansModule_189.LiteBansModule_31(byArray);
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return new LiteBansModule_289(this.LiteBansModule_31 != null ? this.LiteBansModule_31.length : 0);
    }

    @Override
    public byte[] e() {
        return LiteBansModule_189.LiteBansModule_31(this.LiteBansModule_31);
    }

    public void BaseCoreGenericHandler(byte[] byArray) {
        this.c = LiteBansModule_189.LiteBansModule_31(byArray);
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        if (this.c != null) {
            return new LiteBansModule_289(this.c.length);
        }
        return this.LiteBansModule_31();
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        if (this.c != null) {
            return LiteBansModule_189.LiteBansModule_31(this.c);
        }
        return this.e();
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        this.LiteBansModule_31(Arrays.copyOfRange(byArray, n, n + n2));
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        byte[] byArray2 = Arrays.copyOfRange(byArray, n, n + n2);
        this.plugin(byArray2);
        if (this.LiteBansModule_31 == null) {
            this.LiteBansModule_31(byArray2);
        }
    }

    protected final void BaseCoreGenericHandler(int n, int n2) {
        if (n2 < n) {
            throw new ZipException(this.getClass().getName() + " is too short, only " + n2 + " bytes, expected LiteBansModule_21 least " + n);
        }
    }
}

