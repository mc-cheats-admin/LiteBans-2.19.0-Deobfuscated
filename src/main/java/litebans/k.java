package litebans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import litebans.c4;
import litebans.ci_0;
import litebans.dd_0;
import litebans.dq_0;
import litebans.e_0;
import litebans.el_0;
import litebans.ew_0;
import litebans.fl_0;
import litebans.h9;
import litebans.ha_0;
import litebans.iw_0;
import litebans.je_0;
import litebans.kw_0;

public static class k
extends e_0
implements ha_0 {
    private final dd_0 x;
    final String y;
    private final boolean E;
    private final InputStream q;
    private final Inflater k = new Inflater(true);
    private final ByteBuffer z = ByteBuffer.allocate(512);
    private h9 o = null;
    private boolean j = false;
    private boolean v = false;
    private ByteArrayInputStream B = null;
    private boolean A = false;
    private long i = 0L;
    private final boolean g;
    private static final int s;
    private static final int p;
    private static final long h;
    private final byte[] t = new byte[30];
    private final byte[] e = new byte[1024];
    private final byte[] d = new byte[2];
    private final byte[] f = new byte[4];
    private final byte[] l = new byte[16];
    private int D = 0;
    private static final String w;
    private static final byte[] C;
    private static final byte[] n;
    private static final byte[] m;
    private static final byte[] u;
    private static final BigInteger r;

    public k(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public k(InputStream inputStream, String string) {
        this(inputStream, string, true);
    }

    public k(InputStream inputStream, String string, boolean bl) {
        this(inputStream, string, bl, false);
    }

    public k(InputStream inputStream, String string, boolean bl, boolean bl2) {
        this(inputStream, string, bl, bl2, false);
    }

    public k(InputStream inputStream, String string, boolean bl, boolean bl2, boolean bl3) {
        this.y = string;
        this.x = c4.b(string);
        this.E = bl;
        this.q = new PushbackInputStream(inputStream, this.z.capacity());
        this.A = bl2;
        this.g = bl3;
        this.z.limit(0);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (this.j) {
            throw new IOException("The stream is closed");
        }
        if (this.o == null) {
            return -1;
        }
        if (n > byArray.length || n2 < 0 || n < 0 || byArray.length - n < n2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ew_0.c(h9.d(this.o));
        if (!this.a(h9.d(this.o))) {
            throw new el_0(fl_0.a, h9.d(this.o));
        }
        if (!this.b(h9.d(this.o))) {
            throw new el_0(fl_0.d, h9.d(this.o));
        }
        if (h9.d(this.o).getMethod() == 0) {
            n3 = this.d(byArray, n, n2);
        } else if (h9.d(this.o).getMethod() == 8) {
            n3 = this.b(byArray, n, n2);
        } else if (h9.d(this.o).getMethod() == dq_0.v.a() || h9.d(this.o).getMethod() == dq_0.l.a() || h9.d(this.o).getMethod() == dq_0.c.a() || h9.d(this.o).getMethod() == dq_0.q.a()) {
            n3 = h9.b(this.o).read(byArray, n, n2);
        } else {
            throw new el_0(dq_0.a(h9.d(this.o).getMethod()), h9.d(this.o));
        }
        if (n3 >= 0) {
            h9.g(this.o).update(byArray, n, n3);
            this.i += (long)n3;
        }
        return n3;
    }

    private final int d(byte[] byArray, int n, int n2) {
        h9 h92;
        int n3;
        if (h9.e(this.o)) {
            if (this.B == null) {
                this.c();
            }
            return this.B.read(byArray, n, n2);
        }
        long l3 = h9.d(this.o).getSize();
        if (h9.a(this.o) >= l3) {
            return -1;
        }
        if (this.z.position() >= this.z.limit()) {
            this.z.position(0);
            n3 = this.q.read(this.z.array());
            if (n3 == -1) {
                this.z.limit(0);
                throw new IOException("Truncated ZIP file");
            }
            this.z.limit(n3);
            this.a(n3);
            h92 = this.o;
            h9.b(h92, h9.c(h92) + (long)n3);
        }
        n3 = Math.min(this.z.remaining(), n2);
        if (l3 - h9.a(this.o) < (long)n3) {
            n3 = (int)(l3 - h9.a(this.o));
        }
        this.z.get(byArray, n, n3);
        h92 = this.o;
        h9.a(h92, h9.a(h92) + (long)n3);
        return n3;
    }

    private final int b(byte[] byArray, int n, int n2) {
        int n3 = this.c(byArray, n, n2);
        if (n3 <= 0) {
            if (this.k.finished()) {
                return -1;
            }
            if (this.k.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            }
            if (n3 == -1) {
                throw new IOException("Truncated ZIP file");
            }
        }
        return n3;
    }

    private final int c(byte[] byArray, int n, int n2) {
        int n3 = 0;
        do {
            if (this.k.needsInput()) {
                int n4 = this.b();
                if (n4 > 0) {
                    h9 h92 = this.o;
                    h9.b(h92, h9.c(h92) + (long)this.z.limit());
                } else {
                    if (n4 != -1) break;
                    return -1;
                }
            }
            try {
                n3 = this.k.inflate(byArray, n, n2);
            }
            catch (DataFormatException dataFormatException) {
                throw (IOException)new ZipException(dataFormatException.getMessage()).initCause(dataFormatException);
            }
        } while (n3 == 0 && this.k.needsInput());
        return n3;
    }

    @Override
    public void close() {
        if (!this.j) {
            this.j = true;
            try {
                this.q.close();
            }
            finally {
                this.k.end();
            }
        }
    }

    @Override
    public long skip(long l3) {
        if (l3 >= 0L) {
            long l5;
            int n;
            for (l5 = 0L; l5 < l3; l5 += (long)n) {
                long l7 = l3 - l5;
                n = this.read(this.e, 0, (int)((long)this.e.length > l7 ? l7 : (long)this.e.length));
                if (n != -1) continue;
                return l5;
            }
            return l5;
        }
        throw new IllegalArgumentException();
    }

    private final int b() {
        if (this.j) {
            throw new IOException("The stream is closed");
        }
        int n = this.q.read(this.z.array());
        if (n > 0) {
            this.z.limit(n);
            this.a(this.z.limit());
            this.k.setInput(this.z.array(), 0, this.z.limit());
        }
        return n;
    }

    private final void a(byte[] byArray) {
        this.a(byArray, 0);
    }

    private final void a(byte[] byArray, int n) {
        int n2 = byArray.length - n;
        int n3 = je_0.a(this.q, byArray, n, n2);
        this.a(n3);
        if (n3 < n2) {
            throw new EOFException();
        }
    }

    private final void a() {
        this.a(this.f);
        ci_0 ci_02 = new ci_0(this.f);
        if (ci_0.e.equals(ci_02)) {
            this.a(this.f);
            ci_02 = new ci_0(this.f);
        }
        h9.d(this.o).setCrc(ci_02.a());
        this.a(this.l);
        ci_0 ci_03 = new ci_0(this.l, 8);
        if (ci_03.equals(ci_0.a) || ci_03.equals(ci_0.c)) {
            this.a(this.l, 8, 8);
            h9.d(this.o).setCompressedSize(ci_0.a(this.l));
            h9.d(this.o).setSize(ci_0.a(this.l, 4));
        } else {
            h9.d(this.o).setCompressedSize(iw_0.a(this.l));
            h9.d(this.o).setSize(iw_0.a(this.l, 8));
        }
    }

    private final boolean a(kw_0 kw_02) {
        return !kw_02.d().b() || this.A && kw_02.getMethod() == 0 || kw_02.getMethod() == 8 || kw_02.getMethod() == dq_0.c.a();
    }

    private final boolean b(kw_0 kw_02) {
        return kw_02.getCompressedSize() != -1L || kw_02.getMethod() == 8 || kw_02.getMethod() == dq_0.c.a() || kw_02.d().b() && this.A && kw_02.getMethod() == 0;
    }

    private final void c() {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = 0;
        boolean bl = false;
        int n3 = n = h9.f(this.o) ? 20 : 12;
        while (!bl) {
            int n4 = this.q.read(this.z.array(), n2, 512 - n2);
            if (n4 <= 0) {
                throw new IOException("Truncated ZIP file");
            }
            if (n4 + n2 < 4) {
                n2 += n4;
                continue;
            }
            bl = this.a(byteArrayOutputStream, n2, n4, n);
            if (bl) continue;
            n2 = this.b(byteArrayOutputStream, n2, n4, n);
        }
        if (h9.d(this.o).getCompressedSize() != h9.d(this.o).getSize()) {
            throw new ZipException("compressed and uncompressed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        if ((long)byArray.length != h9.d(this.o).getSize()) {
            throw new ZipException("actual and claimed size don't match while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile");
        }
        this.B = new ByteArrayInputStream(byArray);
    }

    private final boolean a(ByteArrayOutputStream byteArrayOutputStream, int n, int n2, int n3) {
        boolean bl = false;
        for (int i = 0; !bl && i < n + n2 - 4; ++i) {
            if (this.z.array()[i] != C[0] || this.z.array()[i + 1] != C[1]) continue;
            int n4 = i;
            if (i >= n3 && this.z.array()[i + 2] == C[2] && this.z.array()[i + 3] == C[3] || this.z.array()[i] == litebans.k.n[2] && this.z.array()[i + 3] == litebans.k.n[3]) {
                n4 = i - n3;
                bl = true;
            } else if (this.z.array()[i + 2] == m[2] && this.z.array()[i + 3] == m[3]) {
                bl = true;
            }
            if (!bl) continue;
            this.a(this.z.array(), n4, n + n2 - n4);
            byteArrayOutputStream.write(this.z.array(), 0, n4);
            this.a();
        }
        return bl;
    }

    private final int b(ByteArrayOutputStream byteArrayOutputStream, int n, int n2, int n3) {
        int n4 = n + n2 - n3 - 3;
        if (n4 > 0) {
            byteArrayOutputStream.write(this.z.array(), 0, n4);
            System.arraycopy(this.z.array(), n4, this.z.array(), 0, n3 + 3);
            n = n3 + 3;
        } else {
            n += n2;
        }
        return n;
    }

    private final void a(byte[] byArray, int n, int n2) {
        ((PushbackInputStream)this.q).unread(byArray, n, n2);
        this.a((long)n2);
    }

    static {
        w = " while reading a stored entry using data descriptor. Either the archive is broken or it can not be read using ZipArchiveInputStream and you must use ZipFile. A common cause for this is a ZIP archive containing a ZIP archive. See http://commons.apache.org/proper/commons-compress/zip.html#ZipArchiveInputStream_vs_ZipFile";
        h = 0x100000000L;
        p = 46;
        s = 30;
        C = ci_0.c.c();
        n = ci_0.a.c();
        m = ci_0.e.c();
        u = new byte[]{65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};
        r = BigInteger.valueOf(Long.MAX_VALUE);
    }
}

