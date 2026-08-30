package litebans;

import java.io.InputStream;

public static class hw
extends InputStream {
    private final InputStream b;
    private long a;

    public hw(InputStream inputStream, long l3) {
        this.b = inputStream;
        this.a = l3;
    }

    @Override
    public int read() {
        if (this.a > 0L) {
            --this.a;
            return this.b.read();
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (this.a == 0L) {
            return -1;
        }
        int n4 = n2;
        if ((long)n4 > this.a) {
            n4 = (int)this.a;
        }
        if ((n3 = this.b.read(byArray, n, n4)) >= 0) {
            this.a -= (long)n3;
        }
        return n3;
    }

    @Override
    public void close() {
    }

    @Override
    public long skip(long l3) {
        long l5 = Math.min(this.a, l3);
        long l7 = this.b.skip(l5);
        this.a -= l7;
        return l7;
    }
}

