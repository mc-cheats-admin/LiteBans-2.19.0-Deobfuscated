package litebans;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import litebans.c4;
import litebans.d4;
import litebans.da_0;
import litebans.dd_0;
import litebans.e_0;
import litebans.je_0;

public static class h
extends e_0
implements d4 {
    private boolean J = false;
    private da_0 P;
    private long K = 0L;
    private boolean O = false;
    private final byte[] T = new byte[4096];
    private long N = 0L;
    private final InputStream M;
    private final byte[] I = new byte[2];
    private final byte[] L = new byte[4];
    private final byte[] S = new byte[6];
    private final int R;
    private final dd_0 H;
    final String Q;

    public h(InputStream inputStream) {
        this(inputStream, 512, "US-ASCII");
    }

    public h(InputStream inputStream, String string) {
        this(inputStream, 512, string);
    }

    public h(InputStream inputStream, int n, String string) {
        this.M = inputStream;
        if (n <= 0) {
            throw new IllegalArgumentException("blockSize must be bigger than 0");
        }
        this.R = n;
        this.Q = string;
        this.H = c4.b(string);
    }

    @Override
    public int available() {
        this.a();
        if (this.O) {
            return 0;
        }
        return 1;
    }

    @Override
    public void close() {
        if (!this.J) {
            this.M.close();
            this.J = true;
        }
    }

    private final void a() {
        if (this.J) {
            throw new IOException("Stream closed");
        }
    }

    private final void b(int n) {
        if (n > 0) {
            this.a(this.L, 0, n);
        }
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        this.a();
        if (n < 0 || n2 < 0 || n > byArray.length - n2) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return 0;
        }
        if (this.P == null || this.O) {
            return -1;
        }
        if (this.K == this.P.getSize()) {
            this.b(this.P.b());
            this.O = true;
            if (this.P.c() == 2 && this.N != this.P.d()) {
                throw new IOException("CRC Error. Occured at byte: " + this.b());
            }
            return -1;
        }
        int n3 = (int)Math.min((long)n2, this.P.getSize() - this.K);
        if (n3 < 0) {
            return -1;
        }
        int n4 = this.a(byArray, n, n3);
        if (this.P.c() == 2) {
            for (int i = 0; i < n4; ++i) {
                this.N += (long)(byArray[i] & 0xFF);
                this.N &= 0xFFFFFFFFL;
            }
        }
        if (n4 > 0) {
            this.K += (long)n4;
        }
        return n4;
    }

    private final int a(byte[] byArray, int n, int n2) {
        int n3 = je_0.a(this.M, byArray, n, n2);
        this.a(n3);
        if (n3 < n2) {
            throw new EOFException();
        }
        return n3;
    }

    @Override
    public long skip(long l3) {
        int n;
        int n2;
        if (l3 < 0L) {
            throw new IllegalArgumentException("Negative skip length");
        }
        this.a();
        int n3 = (int)Math.min(l3, Integer.MAX_VALUE);
        for (n = 0; n < n3; n += n2) {
            n2 = n3 - n;
            if (n2 > this.T.length) {
                n2 = this.T.length;
            }
            if ((n2 = this.read(this.T, 0, n2)) != -1) continue;
            this.O = true;
            break;
        }
        return n;
    }
}

