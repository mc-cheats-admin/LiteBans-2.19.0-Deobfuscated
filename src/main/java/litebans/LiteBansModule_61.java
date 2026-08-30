package litebans;

import java.util.Comparator;
public final class LiteBansModule_61
implements Comparator {
    public final int compare(Object targetObj, Object contextObj) {
        LiteBansModule_109 cy2 = (LiteBansModule_109)targetObj;
        boolean flag2 = cy2.e().BaseCoreGenericHandler();
        cy2 = (LiteBansModule_109)contextObj;
        Comparable comparable = Integer.valueOf(flag2 ? 1 : 0);
        flag = false;
        flag2 = cy2.e().BaseCoreGenericHandler();
        flag3 = false;
        return LiteBansModule_261.BaseCoreGenericHandler(comparable, Integer.valueOf(flag2 ? 1 : 0));
}

