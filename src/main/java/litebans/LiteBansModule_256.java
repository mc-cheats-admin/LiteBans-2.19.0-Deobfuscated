package litebans;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
public final class LiteBansModule_256
implements Comparator {
    public final int compare(Object object, Object object2) {
        Map.Entry entry = (Map.Entry)object2;
        boolean flag = false;
        Comparable comparable = Integer.valueOf(((List)entry.getValue()).size());
        entry = (Map.Entry)object;
        Comparable comparable2 = comparable;
        flag = false;
        return LiteBansModule_261.BaseCoreGenericHandler(comparable2, Integer.valueOf(((List)entry.getValue()).size()));
    }
}

