package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public static final class jR
extends Enum {
    public static final jR g;
    public static final jR e;
    public static final jR d;
    public static final jR c;
    private static final /* synthetic */ jR[] a;
    private static final /* synthetic */ kd b;
    private static /* synthetic */ String[] f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jR() {
        void var2_-1;
        void var1_-1;
    }

    public static jR[] values() {
        return (jR[])a.clone();
    }

    public static jR a(String string) {
        return Enum.valueOf(jR.class, string);
    }

    static {
        jR.a();
        g = new jR(f[0], 0);
        e = new jR(f[1], 1);
        d = new jR(f[2], 2);
        c = new jR(f[3], 3);
        a = jRArray = new jR[]{jR.g, jR.e, jR.d, jR.c};
        b = iC.a(a);
    }

    private static final void a() {
        f = new String[]{hl.a("\uf93d\uf93d\uf921\uf92c", 1024850280), hl.a("\uf136\uf12b\uf136\uf130\uf126\uf127\uf13c\uf121\uf12c\uf126\uf126\uf13a\uf137", -1237520013), hl.a("\ub35b\ub356", 1648997138), hl.a("\u9665\u9673\u9675\u9672\u9669\u966b", 1343919654)};
    }
}

