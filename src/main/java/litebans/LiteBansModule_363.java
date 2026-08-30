package litebans;

import java.util.Comparator;
public final class LiteBansModule_363
implements Comparator {
    final /* synthetic */ BanHandler BaseCoreGenericHandler;

    public LiteBansModule_363(BanHandler a_2) {
        this.plugin = a_2;
    }

    public final int compare(Object targetObj, Object contextObj) {
        LiteBansModule_110 cy2 = (LiteBansModule_110)contextObj;
        LiteBansModule_34 b32 = cy2.AsyncBackgroundTask_5();
        cy2 = (LiteBansModule_110)targetObj;
        Comparable comparable = Long.valueOf(b32.BaseCoreGenericHandler(this.plugin));
        flag = false;
        b32 = cy2.AsyncBackgroundTask_5();
        return LiteBansModule_262.BaseCoreGenericHandler(comparable, Long.valueOf(b32.BaseCoreGenericHandler(this.plugin)));
    }
}

