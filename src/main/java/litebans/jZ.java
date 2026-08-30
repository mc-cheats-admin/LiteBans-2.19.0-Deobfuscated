package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public static final class jZ
extends Enum {
    public static final jZ c;
    public static final jZ b;
    public static final jZ e;
    private static final /* synthetic */ jZ[] d;
    private static final /* synthetic */ kd a;
    private static /* synthetic */ String[] f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jZ() {
        void var2_-1;
        void var1_-1;
    }

    public static jZ[] values() {
        return (jZ[])d.clone();
    }

    public static jZ a(String string) {
        return Enum.valueOf(jZ.class, string);
    }

    static {
        jZ.a();
        c = new jZ(f[0], 0);
        b = new jZ(f[1], 1);
        e = new jZ(f[2], 2);
        d = jZArray = new jZ[]{jZ.c, jZ.b, jZ.e};
        a = iC.a(d);
    }

    private static final void a() {
        f = new String[]{hl.a("\u55d1\u55d0\u55d9\u55d0\u55c1\u55d0", -548186731), hl.a("\u9c50\u9c51\u9c55\u9c57\u9c40\u9c5d\u9c42\u9c55\u9c40\u9c51", -819946476), hl.a("\u4d6a\u4d68\u4d6f\u4d74\u4d7f", 1735019834)};
    }
}

