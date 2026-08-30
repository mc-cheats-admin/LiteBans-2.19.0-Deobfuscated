package litebans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipException;
import litebans.ci_0;
import litebans.en_0;
import litebans.ew_0;
import litebans.i2;

public class cq_0
implements en_0,
Cloneable,
Serializable {
    private static final i2 c;
    private static final long d;
    public static final byte f;
    public static final byte i;
    public static final byte h;
    private byte g;
    private boolean l;
    private boolean b;
    private boolean m;
    private ci_0 k;
    private ci_0 j;
    private ci_0 e;

    @Override
    public i2 c() {
        return c;
    }

    @Override
    public i2 b() {
        return new i2(1 + (this.l ? 4 : 0) + (this.b && this.j != null ? 4 : 0) + (this.m && this.e != null ? 4 : 0));
    }

    @Override
    public i2 a() {
        return new i2(1 + (this.l ? 4 : 0));
    }

    @Override
    public byte[] e() {
        byte[] byArray = new byte[this.b().a()];
        int n = 0;
        byArray[n++] = 0;
        if (this.l) {
            byArray[0] = (byte)(byArray[0] | 1);
            System.arraycopy(this.k.c(), 0, byArray, n, 4);
            n += 4;
        }
        if (this.b && this.j != null) {
            byArray[0] = (byte)(byArray[0] | 2);
            System.arraycopy(this.j.c(), 0, byArray, n, 4);
            n += 4;
        }
        if (this.m && this.e != null) {
            byArray[0] = (byte)(byArray[0] | 4);
            System.arraycopy(this.e.c(), 0, byArray, n, 4);
            n += 4;
        }
        return byArray;
    }

    @Override
    public byte[] d() {
        return Arrays.copyOf(this.e(), this.a().a());
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        this.a();
        if (n2 < 1) {
            throw new ZipException("X5455_ExtendedTimestamp too short, only " + n2 + " bytes");
        }
        int n3 = n + n2;
        this.a(byArray[n++]);
        if (this.l && n + 4 <= n3) {
            this.k = new ci_0(byArray, n);
            n += 4;
        }
        if (this.b && n + 4 <= n3) {
            this.j = new ci_0(byArray, n);
            n += 4;
        }
        if (this.m && n + 4 <= n3) {
            this.e = new ci_0(byArray, n);
            n += 4;
        }
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
        this.a();
        this.a(byArray, n, n2);
    }

    private final void a() {
        this.a((byte)0);
        this.k = null;
        this.j = null;
        this.e = null;
    }

    public void a(byte by2) {
        this.g = by2;
        this.l = (by2 & 1) == 1;
        this.b = (by2 & 2) == 2;
        this.m = (by2 & 4) == 4;
    }

    public Date b() {
        return cq_0.a(this.k);
    }

    public Date c() {
        return cq_0.a(this.j);
    }

    public Date d() {
        return cq_0.a(this.e);
    }

    public String toString() {
        Date date;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x5455 Zip Extra Field: Flags=");
        stringBuilder.append(Integer.toBinaryString(ew_0.a((int)this.g))).append(" ");
        if (this.l && this.k != null) {
            date = this.b();
            stringBuilder.append(" Modify:[").append(date).append("] ");
        }
        if (this.b && this.j != null) {
            date = this.c();
            stringBuilder.append(" Access:[").append(date).append("] ");
        }
        if (this.m && this.e != null) {
            date = this.d();
            stringBuilder.append(" Create:[").append(date).append("] ");
        }
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof cq_0) {
            cq_0 cq_02 = (cq_0)object;
            return (this.g & 7) == (cq_02.g & 7) && (this.k == cq_02.k || this.k != null && this.k.equals(cq_02.k)) && (this.j == cq_02.j || this.j != null && this.j.equals(cq_02.j)) && (this.e == cq_02.e || this.e != null && this.e.equals(cq_02.e));
        }
        return false;
    }

    public int hashCode() {
        int n = -123 * (this.g & 7);
        if (this.k != null) {
            n ^= this.k.hashCode();
        }
        if (this.j != null) {
            n ^= Integer.rotateLeft(this.j.hashCode(), 11);
        }
        if (this.e != null) {
            n ^= Integer.rotateLeft(this.e.hashCode(), 22);
        }
        return n;
    }

    private static final Date a(ci_0 ci_02) {
        return ci_02 != null ? new Date((long)ci_02.b() * 1000L) : null;
    }

    static {
        h = (byte)4;
        i = (byte)2;
        f = 1;
        d = 1L;
        c = new i2(21589);
    }
}

