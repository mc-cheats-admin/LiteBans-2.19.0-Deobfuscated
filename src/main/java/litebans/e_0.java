package litebans;

import java.io.InputStream;
import litebans.gu_0;

public abstract class e_0
extends InputStream {
    private final byte[] a = new byte[1];
    private static final int b = 255;
    private long c = 0L;

    public abstract gu_0 a();

    @Override
    public int read() {
        int n = this.read(this.a, 0, 1);
        return n == -1 ? -1 : this.a[0] & 0xFF;
    }

    protected void a(int n) {
        this.b(n);
    }

    protected void b(long l3) {
        if (l3 != -1L) {
            this.c += l3;
        }
    }

    protected void a(long l3) {
        this.c -= l3;
    }

    public long b() {
        return this.c;
    }
}

