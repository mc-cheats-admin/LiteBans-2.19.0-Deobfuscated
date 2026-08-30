package litebans;

import java.util.Comparator;
static class LiteBansModule_392
implements Comparator {
    final /* synthetic */ LiteBansModule_296 BaseCoreGenericHandler;

    LiteBansModule_392(LiteBansModule_296 i_02) {
        this.plugin = i_02;
    }

    public int BaseCoreGenericHandler(LiteBansModule_398 ky_02, LiteBansModule_398 ky_03) {
        if (ky_02.c() == null || ky_03.c() == null) {
            return Integer.MAX_VALUE;
        }
        return ky_02.c().compareTo(ky_03.c());
    }

    public int compare(Object targetObj, Object contextObj) {
        return this.plugin((LiteBansModule_398)targetObj, (LiteBansModule_398)contextObj);
}

