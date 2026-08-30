package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public final class jR
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
        g = new jR("UUID", 0);
        e = new jR("EXECUTOR_UUID", 1);
        d = new jR("ID", 2);
        c = new jR("CUSTOM", 3);
        a = jRArray = new jR[]{jR.g, jR.e, jR.d, jR.c};
        b = iC.a(a);
    }

    private static final void a() {
        f = new String[]{"UUID", "EXECUTOR_UUID", "ID", "CUSTOM"};
    }
}

