package litebans;

import java.io.Serializable;
import litebans.hp_0;

public final class ci_0
implements Cloneable,
Serializable {
    private static final long d = 1L;
    private final long f;
    public static final ci_0 a = new ci_0(33639248L);
    public static final ci_0 c = new ci_0(67324752L);
    public static final ci_0 e = new ci_0(134695760L);
    static final ci_0 h = new ci_0(0xFFFFFFFFL);
    public static final ci_0 b = new ci_0(808471376L);
    public static final ci_0 g = new ci_0(134630224L);

    public ci_0(long l3) {
        this.f = l3;
    }

    public ci_0(byte[] byArray) {
        this(byArray, 0);
    }

    public ci_0(byte[] byArray, int n) {
        this.f = ci_0.a(byArray, n);
    }

    public byte[] c() {
        return ci_0.a(this.f);
    }

    public long a() {
        return this.f;
    }

    public int b() {
        return (int)this.f;
    }

    public static final byte[] a(long l3) {
        byte[] byArray = new byte[4];
        ci_0.a(l3, byArray, 0);
        return byArray;
    }

    public static final void a(long l3, byte[] byArray, int n) {
        hp_0.a(byArray, l3, n, 4);
    }

    public static final long a(byte[] byArray, int n) {
        return hp_0.a(byArray, n, 4);
    }

    public static final long a(byte[] byArray) {
        return ci_0.a(byArray, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof ci_0)) {
            return false;
        }
        return this.f == ((ci_0)object).a();
    }

    public int hashCode() {
        return (int)this.f;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String toString() {
        return "ZipLong value: " + this.f;
    }
}

