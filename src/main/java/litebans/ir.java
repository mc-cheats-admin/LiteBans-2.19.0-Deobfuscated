package litebans;

import java.util.Comparator;
import litebans.hj_0;
import litebans.jT;

public static final class ir
implements Comparator {
    public final int compare(Object object, Object object2) {
        jT jT2 = (jT)object2;
        boolean bl = false;
        Comparable comparable = (Long)jT2.b();
        jT2 = (jT)object;
        Comparable comparable2 = comparable;
        bl = false;
        return hj_0.a(comparable2, (Long)jT2.b());
    }
}

