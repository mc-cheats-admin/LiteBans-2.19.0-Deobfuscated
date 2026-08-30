package litebans;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import litebans.ci_0;
import litebans.en_0;
import litebans.g0;
import litebans.i2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.ii
 */
public static class ii_0
implements en_0,
g0,
Cloneable {
    private static final i2 n;
    private static final int p;
    private int i = 0;
    private int j = 0;
    private int l = 0;
    private String m = "";
    private boolean o = false;
    private CRC32 k = new CRC32();

    @Override
    public i2 c() {
        return n;
    }

    @Override
    public i2 b() {
        return new i2(14 + this.c().getBytes().length);
    }

    @Override
    public i2 a() {
        return this.b();
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.b().a() - 4];
        System.arraycopy(i2.a(this.e()), 0, byArray, 0, 2);
        byte[] byArray2 = this.c().getBytes();
        System.arraycopy(ci_0.a(byArray2.length), 0, byArray, 2, 4);
        System.arraycopy(i2.a(this.b()), 0, byArray, 6, 2);
        System.arraycopy(i2.a(this.d()), 0, byArray, 8, 2);
        System.arraycopy(byArray2, 0, byArray, 10, byArray2.length);
        this.k.reset();
        this.k.update(byArray);
        long l3 = this.k.getValue();
        byte[] byArray3 = new byte[byArray.length + 4];
        System.arraycopy(ci_0.a(l3), 0, byArray3, 0, 4);
        System.arraycopy(byArray, 0, byArray3, 4, byArray.length);
        return byArray3;
    }

    @Override
    public byte[] d() {
        return this.e();
    }

    public int b() {
        return this.j;
    }

    public int d() {
        return this.l;
    }

    public String c() {
        return this.m;
    }

    public boolean f() {
        return this.c().length() != 0;
    }

    public void a(int n) {
        this.i = this.b(n);
    }

    public int e() {
        return this.i;
    }

    public void a(boolean bl) {
        this.o = bl;
        this.i = this.b(this.i);
    }

    public boolean a() {
        return this.o && !this.f();
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        long l3 = ci_0.a(byArray, n);
        byte[] byArray2 = new byte[n2 - 4];
        System.arraycopy(byArray, n + 4, byArray2, 0, n2 - 4);
        this.k.reset();
        this.k.update(byArray2);
        long l5 = this.k.getValue();
        if (l3 != l5) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(l3) + " instead of " + Long.toHexString(l5));
        }
        int n3 = i2.a(byArray2, 0);
        byte[] byArray3 = new byte[(int)ci_0.a(byArray2, 2)];
        this.j = i2.a(byArray2, 6);
        this.l = i2.a(byArray2, 8);
        if (byArray3.length == 0) {
            this.m = "";
        } else {
            if (byArray3.length > byArray2.length - 10) {
                throw new ZipException("Bad symbolic link name length " + byArray3.length + " in ASI extra field");
            }
            System.arraycopy(byArray2, 10, byArray3, 0, byArray3.length);
            this.m = new String(byArray3);
        }
        this.a((n3 & 0x4000) != 0);
        this.a(n3);
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a(byArray, n, n2);
    }

    protected int b(int n) {
        int n2 = 32768;
        if (this.f()) {
            n2 = 40960;
        } else if (this.a()) {
            n2 = 16384;
        }
        return n2 | n & 0xFFF;
    }

    public Object clone() {
        try {
            ii_0 ii_02 = (ii_0)super.clone();
            ii_02.k = new CRC32();
            return ii_02;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    static {
        p = 4;
        n = new i2(30062);
    }
}

