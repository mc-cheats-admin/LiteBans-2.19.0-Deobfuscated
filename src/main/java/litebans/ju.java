package litebans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.zip.ZipException;
import litebans.en_0;
import litebans.ew_0;
import litebans.i2;

public class ju
implements en_0,
Cloneable,
Serializable {
    private static final i2 h;
    private static final i2 d;
    private static final BigInteger b;
    private static final long c;
    private int f = 1;
    private BigInteger e;
    private BigInteger g;

    public ju() {
        this.a();
    }

    @Override
    public i2 c() {
        return h;
    }

    @Override
    public i2 b() {
        byte[] byArray = ju.a(this.e.toByteArray());
        int n = byArray == null ? 0 : byArray.length;
        byArray = ju.a(this.g.toByteArray());
        int n2 = byArray == null ? 0 : byArray.length;
        return new i2(3 + n + n2);
    }

    @Override
    public i2 a() {
        return d;
    }

    @Override
    public byte[] e() {
        byte[] byArray = this.e.toByteArray();
        byte[] byArray2 = this.g.toByteArray();
        int n = (byArray = ju.a(byArray)) != null ? byArray.length : 0;
        byArray2 = ju.a(byArray2);
        int n2 = byArray2 != null ? byArray2.length : 0;
        byte[] byArray3 = new byte[3 + n + n2];
        if (byArray != null) {
            ew_0.a(byArray);
        }
        if (byArray2 != null) {
            ew_0.a(byArray2);
        }
        int n3 = 0;
        byArray3[n3++] = ew_0.a(this.f);
        byArray3[n3++] = ew_0.a(n);
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray3, n3, n);
        }
        n3 += n;
        byArray3[n3++] = ew_0.a(n2);
        if (byArray2 != null) {
            System.arraycopy(byArray2, 0, byArray3, n3, n2);
        }
        return byArray3;
    }

    @Override
    public byte[] d() {
        return new byte[0];
    }

    @Override
    public void a(byte[] byArray, int n, int n2) {
        int n3;
        int n4;
        this.a();
        if (n2 < 3) {
            throw new ZipException("X7875_NewUnix length is too short, only " + n2 + " bytes");
        }
        this.f = ew_0.a(byArray[n++]);
        if ((n4 = ew_0.a(byArray[n++])) + 3 > n2) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + n4 + " doesn't fit into " + n2 + " bytes");
        }
        byte[] byArray2 = Arrays.copyOfRange(byArray, n, n + n4);
        n += n4;
        this.e = new BigInteger(1, ew_0.a(byArray2));
        if (n4 + 3 + (n3 = ew_0.a(byArray[n++])) > n2) {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + n3 + " doesn't fit into " + n2 + " bytes");
        }
        byte[] byArray3 = Arrays.copyOfRange(byArray, n, n + n3);
        this.g = new BigInteger(1, ew_0.a(byArray3));
    }

    @Override
    public void b(byte[] byArray, int n, int n2) {
    }

    private final void a() {
        this.e = b;
        this.g = b;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.e + " GID=" + this.g;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof ju) {
            ju ju2 = (ju)object;
            return this.f == ju2.f && this.e.equals(ju2.e) && this.g.equals(ju2.g);
        }
        return false;
    }

    public int hashCode() {
        int n = -1234567 * this.f;
        n ^= Integer.rotateLeft(this.e.hashCode(), 16);
        return n ^= this.g.hashCode();
    }

    static final byte[] a(byte[] byArray) {
        if (byArray == null) {
            return byArray;
        }
        int n = 0;
        for (byte by2 : byArray) {
            if (by2 != 0) break;
            ++n;
        }
        boolean bl = true;
        byte[] byArray2 = new byte[Math.max(1, byArray.length - n)];
        int n2 = byArray2.length - (byArray.length - n);
        System.arraycopy(byArray, n, byArray2, n2, byArray2.length - n2);
        return byArray2;
    }

    static {
        c = 1L;
        h = new i2(30837);
        d = new i2(0);
        b = BigInteger.valueOf(1000L);
    }
}

