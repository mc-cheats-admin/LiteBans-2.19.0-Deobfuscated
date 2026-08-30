package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
import litebans.av;
import litebans.bj_0;
import litebans.ca_0;
import litebans.ci_0;
import litebans.i2;

public class aj_0
extends av {
    private int k;
    private ca_0 g;
    private int o;
    private int l;
    private long f;
    private bj_0 h;
    private int p;
    private byte[] j;
    private byte[] m;
    private byte[] q;
    private byte[] i;
    private byte[] n;
    private byte[] e;

    public aj_0() {
        super(new i2(23));
    }

    public void c(byte[] byArray, int n, int n2) {
        this.a(12, n2);
        this.k = i2.a(byArray, n);
        this.g = ca_0.a(i2.a(byArray, n + 2));
        this.o = i2.a(byArray, n + 4);
        this.l = i2.a(byArray, n + 6);
        this.f = ci_0.a(byArray, n + 8);
        if (this.f > 0L) {
            this.a(16, n2);
            this.h = bj_0.a(i2.a(byArray, n + 12));
            this.p = i2.a(byArray, n + 14);
            for (long i = 0L; i < this.f; ++i) {
                for (int i10 = 0; i10 < this.p; ++i10) {
                }
            }
        }
    }

    public void d(byte[] byArray, int n, int n2) {
        this.a(4, n2);
        int n3 = i2.a(byArray, n);
        this.a("ivSize", n3, 4, n2);
        this.j = Arrays.copyOfRange(byArray, n + 4, n3);
        this.a(16 + n3, n2);
        this.k = i2.a(byArray, n + n3 + 6);
        this.g = ca_0.a(i2.a(byArray, n + n3 + 8));
        this.o = i2.a(byArray, n + n3 + 10);
        this.l = i2.a(byArray, n + n3 + 12);
        int n4 = i2.a(byArray, n + n3 + 14);
        this.a("erdSize", n4, n3 + 16, n2);
        this.m = Arrays.copyOfRange(byArray, n + n3 + 16, n4);
        this.a(20 + n3 + n4, n2);
        this.f = ci_0.a(byArray, n + n3 + 16 + n4);
        if (this.f == 0L) {
            this.a(n3 + 20 + n4 + 2, n2);
            int n5 = i2.a(byArray, n + n3 + 20 + n4);
            this.a("vSize", n5, n3 + 22 + n4, n2);
            if (n5 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + n5 + " is too small to hold CRC");
            }
            this.n = Arrays.copyOfRange(byArray, n + n3 + 22 + n4, n5 - 4);
            this.e = Arrays.copyOfRange(byArray, n + n3 + 22 + n4 + n5 - 4, 4);
        } else {
            this.a(n3 + 20 + n4 + 6, n2);
            this.h = bj_0.a(i2.a(byArray, n + n3 + 20 + n4));
            this.p = i2.a(byArray, n + n3 + 22 + n4);
            int n6 = i2.a(byArray, n + n3 + 24 + n4);
            this.q = new byte[this.p];
            if (n6 < this.p) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: resize " + n6 + " is too small to hold hashSize" + this.p);
            }
            this.i = new byte[n6 - this.p];
            this.a("resize", n6, n3 + 24 + n4, n2);
            System.arraycopy(byArray, n + n3 + 24 + n4, this.q, 0, this.p);
            System.arraycopy(byArray, n + n3 + 24 + n4 + this.p, this.i, 0, n6 - this.p);
            this.a(n3 + 26 + n4 + n6 + 2, n2);
            int n7 = i2.a(byArray, n + n3 + 26 + n4 + n6);
            if (n7 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + n7 + " is too small to hold CRC");
            }
            this.a("vSize", n7, n3 + 22 + n4 + n6, n2);
            this.n = new byte[n7 - 4];
            this.e = new byte[4];
            System.arraycopy(byArray, n + n3 + 22 + n4 + n6, this.n, 0, n7 - 4);
            System.arraycopy(byArray, n + n3 + 22 + n4 + n6 + n7 - 4, this.e, 0, 4);
        }
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        super.a(byArray, n, n2);
        this.d(byArray, n, n2);
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        super.b(byArray, n, n2);
        this.c(byArray, n, n2);
    }

    private final void a(String string, int n, int n2, int n3) {
        if (n2 + n > n3) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + string + " " + n + " doesn't fit into " + n3 + " bytes of data at position " + n2);
        }
    }
}

