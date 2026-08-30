package litebans;

import java.io.InputStream;

public class LiteBansModule_279
extends InputStream {
    private final InputStream LiteBansModule_31;
    private long BaseCoreGenericHandler;

    public LiteBansModule_279(InputStream inputStream, long l3) {
        this.LiteBansModule_31 = inputStream;
        this.plugin = l3;
    }

    @Override
    public int read() {
        if (this.plugin > 0L) {
            --this.plugin;
            return this.LiteBansModule_31.read();
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (this.plugin == 0L) {
            return -1;
        }
        int n4 = n2;
        if ((long)n4 > this.plugin) {
            n4 = (int)this.plugin;
        }
        if ((n3 = this.LiteBansModule_31.read(byArray, n, n4)) >= 0) {
            this.plugin -= (long)n3;
        }
        return n3;
    }

    @Override
    public void close() {
    }

    @Override
    public long skip(long l3) {
        long l5 = Math.min(this.plugin, l3);
        long l7 = this.LiteBansModule_31.skip(l5);
        this.plugin -= l7;
        return l7;
}

