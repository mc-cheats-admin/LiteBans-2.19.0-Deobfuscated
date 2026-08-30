package litebans;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import litebans.hj_0;

public static final class hG
implements Comparator {
    public final int compare(Object object, Object object2) {
        Map.Entry entry = (Map.Entry)object2;
        boolean bl = false;
        Comparable comparable = Integer.valueOf(((List)entry.getValue()).size());
        entry = (Map.Entry)object;
        Comparable comparable2 = comparable;
        bl = false;
        return hj_0.a(comparable2, Integer.valueOf(((List)entry.getValue()).size()));
    }
}

