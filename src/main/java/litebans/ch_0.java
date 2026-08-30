package litebans;

/*
 * Renamed from litebans.cH
 */
public static final class ch_0
implements Cloneable {
    private static final int c;
    private static final int d;
    private static final int g;
    private static final int f;
    private static final int i;
    public static final int b;
    private boolean a = false;
    private boolean h = false;
    private boolean e = false;
    private boolean j = false;

    public boolean b() {
        return this.h;
    }

    public boolean a() {
        return this.e;
    }

    public int hashCode() {
        return 3 * (7 * (13 * (17 * (this.e ? 1 : 0) + (this.j ? 1 : 0)) + (this.a ? 1 : 0)) + (this.h ? 1 : 0));
    }

    public boolean equals(Object object) {
        if (!(object instanceof ch_0)) {
            return false;
        }
        ch_0 ch_02 = (ch_0)object;
        return ch_02.e == this.e && ch_02.j == this.j && ch_02.a == this.a && ch_02.h == this.h;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", cloneNotSupportedException);
        }
    }

    static {
        b = 2048;
        i = 64;
        f = 8;
        g = 4;
        d = 2;
        c = 1;
    }
}

