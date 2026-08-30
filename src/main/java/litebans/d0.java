package litebans;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import litebans.cx_0;
import litebans.fx_0;
import litebans.ic_0;
import litebans.im;
import litebans.it_0;
import litebans.je_0;

static class d0
extends FilterInputStream {
    private byte[] a = new byte[1024];
    private int b = -1;
    private int f = 1024;
    private static final int g = 1024;
    private int c = 1024;
    private boolean d = false;
    private long e = 0L;

    public d0(InputStream inputStream) {
        super(inputStream);
    }

    public void a(int n, boolean bl) {
        this.d = bl;
        if (n < 1) {
            throw new IOException("Block with " + n + " records found, must be at least 1");
        }
        this.f = 1024 * n;
        byte[] byArray = this.a;
        this.a = new byte[this.f];
        System.arraycopy(byArray, 0, this.a, 0, 1024);
        this.a(this.a, 1024, this.f - 1024);
        this.b = 0;
        this.c = 1024;
    }

    @Override
    public int available() {
        if (this.c < this.f) {
            return this.f - this.c;
        }
        return this.in.available();
    }

    @Override
    public int read() {
        throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n2 % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        int n3 = 0;
        while (n3 < n2) {
            if (this.c == this.f) {
                try {
                    this.a(true);
                }
                catch (it_0 it_02) {
                    return -1;
                }
            }
            int n4 = 0;
            n4 = this.c + (n2 - n3) <= this.f ? n2 - n3 : this.f - this.c;
            System.arraycopy(this.a, this.c, byArray, n, n4);
            this.c += n4;
            n3 += n4;
            n += n4;
        }
        return n3;
    }

    @Override
    public long skip(long l3) {
        long l5;
        long l7;
        if (l3 % 1024L != 0L) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        for (l5 = 0L; l5 < l3; l5 += l7) {
            if (this.c == this.f) {
                try {
                    this.a(l3 - l5 < (long)this.f);
                }
                catch (it_0 it_02) {
                    return -1L;
                }
            }
            l7 = 0L;
            l7 = (long)this.c + (l3 - l5) <= (long)this.f ? l3 - l5 : (long)this.f - (long)this.c;
            this.c = (int)((long)this.c + l7);
        }
        return l5;
    }

    @Override
    public void close() {
        if (this.in != null && this.in != System.in) {
            this.in.close();
        }
    }

    public byte[] b() {
        byte[] byArray = new byte[1024];
        if (-1 == this.read(byArray, 0, byArray.length)) {
            throw new it_0();
        }
        return byArray;
    }

    private final void a(boolean bl) {
        if (this.in == null) {
            throw new IOException("Input buffer is closed");
        }
        if (!this.d || this.b == -1) {
            this.a(this.a, 0, this.f);
            this.e += (long)this.f;
        } else {
            boolean bl2;
            this.a(this.a, 0, 4);
            this.e += 4L;
            int n = cx_0.b(this.a, 0);
            boolean bl3 = bl2 = (n & 1) == 1;
            if (!bl2) {
                this.a(this.a, 0, this.f);
                this.e += (long)this.f;
            } else {
                int n2 = n >> 1 & 7;
                int n3 = n >> 4 & 0xFFFFFFF;
                byte[] byArray = new byte[n3];
                this.a(byArray, 0, n3);
                this.e += (long)n3;
                if (!bl) {
                    Arrays.fill(this.a, (byte)0);
                } else {
                    switch (fx_0.a(n2 & 3)) {
                        case c: {
                            Inflater inflater = new Inflater();
                            try {
                                inflater.setInput(byArray, 0, byArray.length);
                                n3 = inflater.inflate(this.a);
                                if (n3 != this.f) {
                                    throw new it_0();
                                }
                                break;
                            }
                            catch (DataFormatException dataFormatException) {
                                throw new ic_0("Bad data", dataFormatException);
                            }
                            finally {
                                inflater.end();
                            }
                        }
                        case b: {
                            throw new im("BZLIB2");
                        }
                        case d: {
                            throw new im("LZO");
                        }
                        default: {
                            throw new im();
                        }
                    }
                }
            }
        }
        ++this.b;
        this.c = 0;
    }

    private final void a(byte[] byArray, int n, int n2) {
        int n3 = je_0.a(this.in, byArray, n, n2);
        if (n3 < n2) {
            throw new it_0();
        }
    }

    public long a() {
        return this.e;
    }
}

