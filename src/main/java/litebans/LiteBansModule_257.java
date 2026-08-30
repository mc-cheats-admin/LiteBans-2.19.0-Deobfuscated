package litebans;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
public final class LiteBansModule_257
implements Comparator {
    public final int compare(Object targetObj, Object contextObj) {
        Map.Entry entry = (Map.Entry)contextObj;
        Comparable comparable = Integer.valueOf(((List)entry.getValue()).size());
        entry = (Map.Entry)targetObj;
        Comparable comparable2 = comparable;
        flag = false;
        return LiteBansModule_262.BaseCoreGenericHandler(comparable2, Integer.valueOf(((List)entry.getValue()).size()));
    }
}

