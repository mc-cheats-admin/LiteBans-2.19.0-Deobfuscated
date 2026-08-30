package litebans;

import java.io.InputStream;
public abstract class LiteBansModule_153
extends InputStream {
    private final byte[] BaseCoreGenericHandler = new byte[1];
    private static final int LiteBansModule_31 = 255;
    private long c = 0L;

    public abstract LiteBansModule_235 BaseCoreGenericHandler();

    @Override
    public int read() {
        int n = this.read(this.plugin, 0, 1);
        return n == -1 ? -1 : this.plugin[0] & 0xFF;
    }

    protected void BaseCoreGenericHandler(int n) {
        this.LiteBansModule_31(n);
    }

    protected void LiteBansModule_31(long l3) {
        if (l3 != -1L) {
            this.c += l3;
        }
    }

    protected void BaseCoreGenericHandler(long l3) {
        this.c -= l3;
    }

    public long LiteBansModule_31() {
        return this.c;
    }
}

