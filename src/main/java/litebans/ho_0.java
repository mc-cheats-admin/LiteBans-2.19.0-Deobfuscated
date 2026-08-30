package litebans;

import java.util.Comparator;
import litebans.hj_0;
import litebans.jg_0;

/*
 * Renamed from litebans.ho
 */
public static final class ho_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        jg_0 jg_02 = (jg_0)object2;
        boolean bl = false;
        Comparable comparable = Long.valueOf(jg_02.a());
        jg_02 = (jg_0)object;
        Comparable comparable2 = comparable;
        bl = false;
        return hj_0.a(comparable2, Long.valueOf(jg_02.a()));
    }
}

