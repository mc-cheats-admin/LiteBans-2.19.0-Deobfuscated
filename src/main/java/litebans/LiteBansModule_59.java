package litebans;

import java.util.zip.ZipException;
public class LiteBansModule_59
implements LiteBansModule_177 {
    static final LiteBansModule_288 g;
    private static final String c;
    private static final byte[] e;
    private LiteBansModule_323 LiteBansModule_31;
    private LiteBansModule_323 AsyncBackgroundTask_5;
    private LiteBansModule_323 LiteBansModule_240;
    private LiteBansModule_84 i;
    private byte[] LiteBansModule_194;

    @Override
    public LiteBansModule_288 c() {
        return g;
    }

    @Override
    public LiteBansModule_288 LiteBansModule_31() {
        return new LiteBansModule_288(this.LiteBansModule_31 != null ? 16 : 0);
    }

    @Override
    public LiteBansModule_288 BaseCoreGenericHandler() {
        return new LiteBansModule_288((this.LiteBansModule_31 != null ? 8 : 0) + (this.AsyncBackgroundTask_5 != null ? 8 : 0) + (this.LiteBansModule_240 != null ? 8 : 0) + (this.i != null ? 4 : 0));
    }

    @Override
    public byte[] e() {
        if (this.LiteBansModule_31 != null || this.AsyncBackgroundTask_5 != null) {
            if (this.LiteBansModule_31 == null || this.AsyncBackgroundTask_5 == null) {
                throw new IllegalArgumentException("Zip64 extended information must contain both size values InitializerHandler_3 the local file ");
            }
            byte[] byArray = new byte[16];
            this.plugin(byArray);
            return byArray;
        }
        return e;
    }

    @Override
    public byte[] AsyncBackgroundTask_5() {
        byte[] byArray = new byte[this.plugin().BaseCoreGenericHandler()];
        int n = this.plugin(byArray);
        if (this.LiteBansModule_240 != null) {
            System.arraycopy(this.LiteBansModule_240.c(), 0, byArray, n, 8);
            n += 8;
        }
        if (this.i != null) {
            System.arraycopy(this.i.c(), 0, byArray, n, 4);
            n += 4;
        }
        return byArray;
    }

    @Override
    public void BaseCoreGenericHandler(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return;
        }
        if (n2 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values InitializerHandler_3 the local file ");
        }
        this.LiteBansModule_31 = new LiteBansModule_323(byArray, n);
        this.AsyncBackgroundTask_5 = new LiteBansModule_323(byArray, n += 8);
        n += 8;
        int n3 = n2 - 16;
        if (n3 >= 8) {
            this.LiteBansModule_240 = new LiteBansModule_323(byArray, n);
            n += 8;
            n3 -= 8;
        }
        if (n3 >= 4) {
            this.i = new LiteBansModule_84(byArray, n);
            n += 4;
            n3 -= 4;
        }
    }

    @Override
    public void LiteBansModule_31(byte[] byArray, int n, int n2) {
        this.LiteBansModule_194 = new byte[n2];
        System.arraycopy(byArray, n, this.LiteBansModule_194, 0, n2);
        if (n2 >= 28) {
            this.plugin(byArray, n, n2);
        } else if (n2 == 24) {
            this.LiteBansModule_31 = new LiteBansModule_323(byArray, n);
            this.AsyncBackgroundTask_5 = new LiteBansModule_323(byArray, n += 8);
            this.LiteBansModule_240 = new LiteBansModule_323(byArray, n += 8);
        } else if (n2 % 8 == 4) {
            this.i = new LiteBansModule_84(byArray, n + n2 - 4);
        }
    }

    private final int BaseCoreGenericHandler(byte[] byArray) {
        int n = 0;
        if (this.LiteBansModule_31 != null) {
            System.arraycopy(this.LiteBansModule_31.c(), 0, byArray, 0, 8);
            n += 8;
        }
        if (this.AsyncBackgroundTask_5 != null) {
            System.arraycopy(this.AsyncBackgroundTask_5.c(), 0, byArray, n, 8);
            n += 8;
        }
        return n;
    }

    static {
        c = "Zip64 extended information must contain both size values InitializerHandler_3 the local file header.";
        g = new LiteBansModule_288(1);
        e = new byte[0];
    }
}

