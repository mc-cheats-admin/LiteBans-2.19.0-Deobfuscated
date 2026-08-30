package litebans;

import litebans.aC;
import litebans.ew;

public final class hy_0
implements Comparable {
    public static final aC e;
    private final byte c;
    public static final byte b;
    public static final byte a;
    public static final int f;
    public static final int d;

    public static String b(byte by2) {
        return String.valueOf(by2 & 0xFF);
    }

    public String toString() {
        return hy_0.b(this.c);
    }

    public static int c(byte by2) {
        return Byte.hashCode(by2);
    }

    public int hashCode() {
        return hy_0.c(this.c);
    }

    public static boolean a(byte by2, Object object) {
        if (!(object instanceof hy_0)) {
            return false;
        }
        byte by3 = ((hy_0)object).a();
        return by2 == by3;
    }

    public boolean equals(Object object) {
        return hy_0.a(this.c, object);
    }

    private /* synthetic */ hy_0(byte by2) {
        this.c = by2;
    }

    public static byte a(byte by2) {
        return by2;
    }

    public static final /* synthetic */ hy_0 d(byte by2) {
        return new hy_0(by2);
    }

    public final /* synthetic */ byte a() {
        return this.c;
    }

    public int compareTo(Object object) {
        hy_0 hy_02 = this;
        byte by2 = ((hy_0)object).a();
        return ew.a(hy_02.a() & 0xFF, by2 & 0xFF);
    }

    static {
        d = 8;
        f = 1;
        a = (byte)-1;
        b = 0;
        e = new aC(null);
    }
}

