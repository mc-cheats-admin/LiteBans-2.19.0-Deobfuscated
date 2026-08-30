package litebans;

import litebans.bX;
import litebans.ew;

public final class ez_0
implements Comparable {
    public static final bX b;
    private final short c;
    public static final short e;
    public static final short d;
    public static final int f;
    public static final int a;

    public static String b(short s2) {
        return String.valueOf(s2 & 0xFFFF);
    }

    public String toString() {
        return ez_0.b(this.c);
    }

    public static int c(short s2) {
        return Short.hashCode(s2);
    }

    public int hashCode() {
        return ez_0.c(this.c);
    }

    public static boolean a(short s2, Object object) {
        if (!(object instanceof ez_0)) {
            return false;
        }
        short s3 = ((ez_0)object).a();
        return s2 == s3;
    }

    public boolean equals(Object object) {
        return ez_0.a(this.c, object);
    }

    private /* synthetic */ ez_0(short s2) {
        this.c = s2;
    }

    public static short a(short s2) {
        return s2;
    }

    public static final /* synthetic */ ez_0 d(short s2) {
        return new ez_0(s2);
    }

    public final /* synthetic */ short a() {
        return this.c;
    }

    public int compareTo(Object object) {
        ez_0 ez_02 = this;
        short s2 = ((ez_0)object).a();
        return ew.a(ez_02.a() & 0xFFFF, s2 & 0xFFFF);
    }

    static {
        a = 16;
        f = 2;
        d = (short)-1;
        e = 0;
        b = new bX(null);
    }
}

