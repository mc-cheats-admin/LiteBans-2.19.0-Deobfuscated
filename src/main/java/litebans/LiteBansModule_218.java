package litebans;

import java.util.Comparator;
public final class LiteBansModule_218
implements Comparator {
    final /* synthetic */ SilentHandler BaseCoreGenericHandler;

    public LiteBansModule_218(SilentHandler dZ2) {
        this.plugin = dZ2;
    }

    public final int compare(Object targetObj, Object contextObj) {
        LiteBansModule_109 cy2 = (LiteBansModule_109)targetObj;
        LiteBansModule_23 au2 = cy2.g();
        cy2 = (LiteBansModule_109)contextObj;
        Comparable comparable = Long.valueOf(au2.BaseCoreGenericHandler(this.plugin));
        flag = false;
        au2 = cy2.g();
        return LiteBansModule_261.BaseCoreGenericHandler(comparable, Long.valueOf(au2.BaseCoreGenericHandler(this.plugin)));
}

