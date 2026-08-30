package litebans;

import java.util.Arrays;
public class LiteBansModule_436
implements LiteBansModule_178 {
    private LiteBansModule_289 LiteBansModule_31;
    private byte[] c;
    private byte[] AsyncBackgroundTask_5;

    public void BaseCoreGenericHandler(LiteBansModule_289 i22) {
        this.LiteBansModule_31 = i22;
    }

    @Override
    public LiteBansModule_289 c() {
        return this.LiteBansModule_31;
    }

    public void LiteBansModule_31(byte[] byArray) {
        this.c = LiteBansModule_189.LiteBansModule_31(byArray);
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return new LiteBansModule_289(this.c != null ? this.c.length : 0);
    }

    @Override
    public byte[] e() {
        return LiteBansModule_189.LiteBansModule_31(this.c);
    }

    public void BaseCoreGenericHandler(byte[] byArray) {
        this.AsyncBackgroundTask_5 = LiteBansModule_189.LiteBansModule_31(byArray);
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        if (this.AsyncBackgroundTask_5 != null) {
            return new LiteBansModule_289(this.AsyncBackgroundTask_5.length);
        }
        return this.LiteBansModule_31();
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        if (this.AsyncBackgroundTask_5 != null) {
            return LiteBansModule_189.LiteBansModule_31(this.AsyncBackgroundTask_5);
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
        if (this.c == null) {
            this.LiteBansModule_31(byArray2);
        }
    }
}

