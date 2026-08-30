package litebans;

import java.io.Serializable;
import litebans.hp_0;

public final class i2
implements Cloneable,
Serializable {
    public static final i2 c;
    private static final long b;
    private final int a;

    public i2(int n) {
        this.a = n;
    }

    public i2(byte[] byArray, int n) {
        this.a = i2.a(byArray, n);
    }

    public byte[] b() {
        byte[] byArray = new byte[2];
        hp_0.a(byArray, this.a, 0, 2);
        return byArray;
    }

    public int a() {
        return this.a;
    }

    public static final byte[] a(int n) {
        byte[] byArray = new byte[2];
        i2.a(n, byArray, 0);
        return byArray;
    }

    public static final void a(int n, byte[] byArray, int n2) {
        hp_0.a(byArray, n, n2, 2);
    }

    public static final int a(byte[] byArray, int n) {
        return (int)hp_0.a(byArray, n, 2);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof i2)) {
            return false;
        }
        return this.a == ((i2)object).a();
    }

    public int hashCode() {
        return this.a;
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
        return "ZipShort value: " + this.a;
    }

    static {
        b = 1L;
        c = new i2(0);
    }
}

