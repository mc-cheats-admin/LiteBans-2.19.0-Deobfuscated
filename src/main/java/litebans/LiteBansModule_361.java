package litebans;

import java.util.Comparator;
public final class LiteBansModule_361
implements Comparator {
    final /* synthetic */ BanHandler BaseCoreGenericHandler;

    public LiteBansModule_361(BanHandler a_2) {
        this.plugin = a_2;
    }

    public final int compare(Object object, Object object2) {
        LiteBansModule_109 cy2 = (LiteBansModule_109)object2;
        boolean flag = false;
        LiteBansModule_34 b32 = cy2.AsyncBackgroundTask_5();
        cy2 = (LiteBansModule_109)object;
        Comparable comparable = Long.valueOf(b32.BaseCoreGenericHandler(this.plugin));
        flag = false;
        b32 = cy2.AsyncBackgroundTask_5();
        return LiteBansModule_261.BaseCoreGenericHandler(comparable, Long.valueOf(b32.BaseCoreGenericHandler(this.plugin)));
    }
}

