package litebans;

import java.util.Arrays;
public final class LiteBansModule_265
implements LiteBansModule_178 {
    private static final LiteBansModule_289 LiteBansModule_31 = new LiteBansModule_289(44225);
    private byte[] AsyncBackgroundTask_5;
    private byte[] c;

    @Override
    public LiteBansModule_289 c() {
        return LiteBansModule_31;
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return new LiteBansModule_289(this.AsyncBackgroundTask_5 == null ? 0 : this.AsyncBackgroundTask_5.length);
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        return this.c == null ? this.LiteBansModule_31() : new LiteBansModule_289(this.c.length);
    }

    @Override
    public byte[] e() {
        return LiteBansModule_189.LiteBansModule_31(this.AsyncBackgroundTask_5);
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return this.c == null ? this.e() : LiteBansModule_189.LiteBansModule_31(this.c);
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        this.AsyncBackgroundTask_5 = Arrays.copyOfRange(byArray, n, n + n2);
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.c = Arrays.copyOfRange(byArray, n, n + n2);
        if (this.AsyncBackgroundTask_5 == null) {
            this.plugin(byArray, n, n2);
        }
    }
}

