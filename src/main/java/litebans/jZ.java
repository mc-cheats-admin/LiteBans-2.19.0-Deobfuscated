package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public final class jZ
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
        c = new jZ("DELETE", 0);
        b = new jZ("DEACTIVATE", 1);
        e = new jZ("PRUNE", 2);
        d = jZArray = new jZ[]{jZ.c, jZ.b, jZ.e};
        a = iC.a(d);
    }

    private static final void a() {
        f = new String[]{"DELETE", "DEACTIVATE", "PRUNE"};
    }
}

