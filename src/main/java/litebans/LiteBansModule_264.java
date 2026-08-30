package litebans;

import java.util.Arrays;
public final class LiteBansModule_264
implements LiteBansModule_177 {
    private static final LiteBansModule_288 LiteBansModule_31 = new LiteBansModule_288(44225);
    private byte[] AsyncBackgroundTask_5;
    private byte[] c;

    @Override
    public LiteBansModule_288 c() {
        return LiteBansModule_31;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        return new LiteBansModule_288(this.AsyncBackgroundTask_5 == null ? 0 : this.AsyncBackgroundTask_5.length);
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
        return this.c == null ? this.LiteBansModule_31() : new LiteBansModule_288(this.c.length);
    }

    @Override
    public byte[] e() {
        return LiteBansModule_188.LiteBansModule_31(this.AsyncBackgroundTask_5);
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        return this.c == null ? this.e() : LiteBansModule_188.LiteBansModule_31(this.c);
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

