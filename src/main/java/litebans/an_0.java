package litebans;

import java.io.Serializable;
import litebans.eB;
import litebans.ew;
import litebans.hl;
import litebans.iC;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.aN
 */
public static final class an_0
implements Serializable {
    private static final eB b;
    private final Class d;
    private static final long a;
    private static /* synthetic */ String[] e;

    public an_0(@NotNull Enum[] enumArray) {
        ew.a((Object)enumArray, e[0]);
        Class<?> clazz = enumArray.getClass().getComponentType();
        ew.a(clazz);
        this.d = clazz;
    }

    private final Object a() {
        return iC.a((Enum[])this.d.getEnumConstants());
    }

    static {
        a = 0L;
        an_0.b();
        b = new eB(null);
    }

    private static final void b() {
        e = new String[]{hl.a("\u3c15\u3c1e\u3c04\u3c02\u3c19\u3c15\u3c03", -1702413200)};
    }
}

