package litebans;

import java.util.Comparator;
static class LiteBansModule_394
implements Comparator {
    final /* synthetic */ LiteBansModule_297 BaseCoreGenericHandler;

    LiteBansModule_394(LiteBansModule_297 i_02) {
        this.plugin = i_02;
    }

    public int BaseCoreGenericHandler(LiteBansModule_400 ky_02, LiteBansModule_400 ky_03) {
        if (ky_02.c() == null || ky_03.c() == null) {
            return Integer.MAX_VALUE;
        }
        return ky_02.c().compareTo(ky_03.c());
    }

    public int compare(Object targetObj, Object contextObj) {
        return this.plugin((LiteBansModule_400)targetObj, (LiteBansModule_400)contextObj);
    }
}

