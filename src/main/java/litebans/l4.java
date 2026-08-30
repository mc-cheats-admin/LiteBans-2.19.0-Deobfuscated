package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public static final class l4
extends Enum {
    public static final l4 e;
    public static final l4 d;
    public static final l4 a;
    private static final /* synthetic */ l4[] f;
    private static final /* synthetic */ kd b;
    private static /* synthetic */ String[] c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l4() {
        void var2_-1;
        void var1_-1;
    }

    public static l4[] values() {
        return (l4[])f.clone();
    }

    public static l4 a(String string) {
        return Enum.valueOf(l4.class, string);
    }

    static {
        l4.b();
        e = new l4(c[0], 0);
        d = new l4(c[1], 1);
        a = new l4(c[2], 2);
        f = l4Array = new l4[]{l4.e, l4.d, l4.a};
        b = iC.a(f);
    }

    private static final void b() {
        c = new String[]{hl.a("\uc4dd\uc4d7\uc4c0\uc4cd\uc4c6\uc4dc\uc4c1\uc4c0\uc4c7\uc4d4\uc4cb\uc4ca", 1954530446), hl.a("\u1737\u1732\u1725\u172b\u172e\u1724\u1726\u1733\u172e\u1728\u1729", -656402585), hl.a("\ub991\ub990\ub991\ub99a", -1734821409)};
    }
}

