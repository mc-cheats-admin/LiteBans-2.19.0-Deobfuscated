package litebans;

import java.util.Comparator;
import litebans.cy;
import litebans.hj_0;

public static final class by
implements Comparator {
    public final int compare(Object object, Object object2) {
        cy cy2 = (cy)object;
        boolean bl = false;
        boolean bl2 = cy2.e().a();
        boolean bl3 = false;
        cy2 = (cy)object2;
        Comparable comparable = Integer.valueOf(bl2 ? 1 : 0);
        bl = false;
        bl2 = cy2.e().a();
        bl3 = false;
        return hj_0.a(comparable, Integer.valueOf(bl2 ? 1 : 0));
    }
}

