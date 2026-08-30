package litebans;

import java.util.zip.ZipException;
public abstract class LiteBansModule_42
implements LiteBansModule_178 {
    private long LiteBansModule_31;
    private byte[] c;
    private byte[] AsyncBackgroundTask_5;

    protected LiteBansModule_42() {
    }

    private final void BaseCoreGenericHandler() {
        if (this.c == null) {
            return;
        }
        this.AsyncBackgroundTask_5 = new byte[5 + this.c.length];
        this.AsyncBackgroundTask_5[0] = 1;
        System.arraycopy(LiteBansModule_85.BaseCoreGenericHandler(this.LiteBansModule_31), 0, this.AsyncBackgroundTask_5, 1, 4);
        System.arraycopy(this.c, 0, this.AsyncBackgroundTask_5, 5, this.c.length);
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        if (this.AsyncBackgroundTask_5 == null) {
            this.plugin();
        }
        byte[] byArray = null;
        if (this.AsyncBackgroundTask_5 != null) {
            byArray = new byte[this.AsyncBackgroundTask_5.length];
            System.arraycopy(this.AsyncBackgroundTask_5, 0, byArray, 0, byArray.length);
        }
        return byArray;
    }

    @Override
    public LiteBansModule_289 BaseCoreGenericHandler() {
        if (this.AsyncBackgroundTask_5 == null) {
            this.plugin();
        }
        return new LiteBansModule_289(this.AsyncBackgroundTask_5 != null ? this.AsyncBackgroundTask_5.length : 0);
    }

    @Override
    public byte[] e() {
        return this.AsyncBackgroundTask_5();
    }

    @Override
    public LiteBansModule_289 LiteBansModule_31() {
        return this.plugin();
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        if (n2 < 5) {
            throw new ZipException("UniCode path extra data must have LiteBansModule_21 least 5 ");
        }
        byte by2 = byArray[n];
        if (by2 != 1) {
            throw new ZipException("Unsupported version [" + by2 + "] for UniCode path extra data.");
        }
        this.LiteBansModule_31 = LiteBansModule_85.BaseCoreGenericHandler(byArray, n + 1);
        this.c = new byte[n2 - 5];
        System.arraycopy(byArray, n + 5, this.c, 0, n2 - 5);
        this.AsyncBackgroundTask_5 = null;
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.plugin(byArray, n, n2);
    }
}

