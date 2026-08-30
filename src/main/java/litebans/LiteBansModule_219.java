package litebans;

import java.util.Comparator;
public final class LiteBansModule_219
implements Comparator {
    final /* synthetic */ SilentHandler BaseCoreGenericHandler;

    public LiteBansModule_219(SilentHandler dZ2) {
        this.plugin = dZ2;
    }

    public final int compare(Object targetObj, Object contextObj) {
        LiteBansModule_110 cy2 = (LiteBansModule_110)targetObj;
        LiteBansModule_23 au2 = cy2.g();
        cy2 = (LiteBansModule_110)contextObj;
        Comparable comparable = Long.valueOf(au2.BaseCoreGenericHandler(this.plugin));
        flag = false;
        au2 = cy2.g();
        return LiteBansModule_262.BaseCoreGenericHandler(comparable, Long.valueOf(au2.BaseCoreGenericHandler(this.plugin)));
    }
}

