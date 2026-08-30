package litebans;

import java.util.Iterator;
import litebans.cy;
import litebans.ew;
import litebans.hl;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;

public static final class ff {
    private static /* synthetic */ String[] a;

    /*
     * Enabled aggressive block sorting
     */
    public static final cy a(@NotNull Iterable iterable, @NotNull jv_0 jv_02) {
        Object t2;
        Object v0;
        boolean bl;
        Iterable iterable2 = iterable;
        Iterator iterator = iterable2.iterator();
        do {
            block6: {
                block5: {
                    if (!iterator.hasNext()) {
                        v0 = null;
                        return v0;
                    }
                    t2 = iterator.next();
                    cy cy2 = (cy)t2;
                    boolean bl2 = false;
                    if (ew.a((Object)cy2.a(), (Object)a[0])) break block5;
                    jv_0 jv_03 = jv_02;
                    String string = cy2.a();
                    boolean bl3 = false;
                    if (!jv_03.e(string)) break block6;
                }
                bl = true;
                continue;
            }
            bl = false;
        } while (!bl);
        v0 = t2;
        return v0;
    }

    private static final void a() {
        a = new String[]{hl.a("\ue126\ue127\ue126\ue12d", -1399332536)};
    }

    static {
        ff.a();
    }
}

