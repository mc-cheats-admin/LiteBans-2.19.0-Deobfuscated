package litebans;

import litebans.hl;
import litebans.iC;
import litebans.kd;

public final class l4
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
        e = new l4("SYNCHRONIZED", 0);
        d = new l4("PUBLICATION", 1);
        a = new l4("NONE", 2);
        f = l4Array = new l4[]{l4.e, l4.d, l4.a};
        b = iC.a(f);
    }

    private static final void b() {
        c = new String[]{"SYNCHRONIZED", "PUBLICATION", "NONE"};
    }
}

