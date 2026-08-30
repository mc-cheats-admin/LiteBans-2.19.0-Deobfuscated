package litebans;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import litebans.ao;
import litebans.c4;
import litebans.cx_0;
import litebans.d0;
import litebans.dd_0;
import litebans.e_0;
import litebans.ef_0;
import litebans.hc_0;
import litebans.i9;
import litebans.ik;
import litebans.iq_0;
import litebans.kt_0;
import litebans.ky_0;

public class i_0
extends e_0 {
    private iq_0 g;
    private ky_0 l;
    private boolean j;
    private boolean f;
    private long d;
    private long n;
    private int o;
    private final byte[] p = new byte[1024];
    private byte[] h;
    private int k;
    protected d0 e;
    private final Map i = new HashMap();
    private final Map q = new HashMap();
    private Queue s;
    private final dd_0 m;
    final String r;

    public i_0(InputStream inputStream) {
        this(inputStream, null);
    }

    public i_0(InputStream inputStream, String string) {
        Object object;
        this.e = new d0(inputStream);
        this.f = false;
        this.r = string;
        this.m = c4.b(string);
        try {
            object = this.e.b();
            if (!cx_0.a(object)) {
                throw new i9();
            }
            this.g = new iq_0((byte[])object, this.m);
            this.e.a(this.g.a(), this.g.d());
            this.h = new byte[4096];
            this.b();
            this.a();
        }
        catch (IOException iOException) {
            throw new hc_0(iOException.getMessage(), iOException);
        }
        object = new ef_0(2, 2, 4, " + ");
        this.i.put(2, object);
        this.s = new PriorityQueue(10, new kt_0(this));
    }

    @Override
    public long b() {
        return this.e.a();
    }

    private final void b() {
        byte[] byArray = this.e.b();
        if (!cx_0.a(byArray)) {
            throw new ik();
        }
        this.l = ky_0.a(byArray);
        if (ao.d != this.l.a()) {
            throw new ik();
        }
        if (this.e.skip(1024L * (long)this.l.b()) == -1L) {
            throw new EOFException();
        }
        this.o = this.l.b();
    }

    private final void a() {
        byte[] byArray = this.e.b();
        if (!cx_0.a(byArray)) {
            throw new ik();
        }
        this.l = ky_0.a(byArray);
        if (ao.h != this.l.a()) {
            throw new ik();
        }
        if (this.e.skip(1024L * (long)this.l.b()) == -1L) {
            throw new EOFException();
        }
        this.o = this.l.b();
    }

    @Override
    public int read(byte[] byArray, int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        int n3 = 0;
        if (this.f || this.j || this.n >= this.d) {
            return -1;
        }
        if (this.l == null) {
            throw new IllegalStateException("No current dump entry");
        }
        if ((long)n2 + this.n > this.d) {
            n2 = (int)(this.d - this.n);
        }
        while (n2 > 0) {
            int n4;
            int n5 = n4 = n2 > this.p.length - this.k ? this.p.length - this.k : n2;
            if (this.k + n4 <= this.p.length) {
                System.arraycopy(this.p, this.k, byArray, n, n4);
                n3 += n4;
                this.k += n4;
                n2 -= n4;
                n += n4;
            }
            if (n2 <= 0) continue;
            if (this.o >= 512) {
                byte[] byArray2 = this.e.b();
                if (!cx_0.a(byArray2)) {
                    throw new ik();
                }
                this.l = ky_0.a(byArray2);
                this.o = 0;
            }
            if (!this.l.d(this.o++)) {
                int n6 = this.e.read(this.p, 0, this.p.length);
                if (n6 != this.p.length) {
                    throw new EOFException();
                }
            } else {
                Arrays.fill(this.p, (byte)0);
            }
            this.k = 0;
        }
        this.n += (long)n3;
        return n3;
    }

    @Override
    public void close() {
        if (!this.j) {
            this.j = true;
            this.e.close();
        }
    }
}

