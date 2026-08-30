package litebans;

import litebans.e8;
import litebans.lI;

public final class c_0
implements Comparable {
    public static final lI e;
    private final int b;
    public static final int c;
    public static final int d;
    public static final int f;
    public static final int a;

    public static String c(int n) {
        return String.valueOf((long)n & 0xFFFFFFFFL);
    }

    public String toString() {
        return c_0.c(this.b);
    }

    public static int d(int n) {
        return Integer.hashCode(n);
    }

    public int hashCode() {
        return c_0.d(this.b);
    }

    public static boolean a(int n, Object object) {
        if (!(object instanceof c_0)) {
            return false;
        }
        int n2 = ((c_0)object).a();
        return n == n2;
    }

    public boolean equals(Object object) {
        return c_0.a(this.b, object);
    }

    private /* synthetic */ c_0(int n) {
        this.b = n;
    }

    public static int b(int n) {
        return n;
    }

    public static final /* synthetic */ c_0 a(int n) {
        return new c_0(n);
    }

    public final /* synthetic */ int a() {
        return this.b;
    }

    public int compareTo(Object object) {
        c_0 c_02 = this;
        int n = ((c_0)object).a();
        return e8.a(c_02.a(), n);
    }

    static {
        a = 32;
        f = 4;
        d = -1;
        c = 0;
        e = new lI(null);
    }
}

