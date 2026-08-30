package litebans;

import java.util.Comparator;
static class LiteBansModule_52
implements Comparator {
    final /* synthetic */ GnuSparseMapHandler BaseCoreGenericHandler;

    LiteBansModule_52(GnuSparseMapHandler j10) {
        this.plugin = j10;
    }

    public int BaseCoreGenericHandler(LiteBansModule_293 i72, LiteBansModule_293 i73) {
        Long l3 = i72.BaseCoreGenericHandler();
        Long l5 = i73.BaseCoreGenericHandler();
        return l3.compareTo(l5);
    }

    public int compare(Object targetObj, Object contextObj) {
        return this.plugin((LiteBansModule_293)targetObj, (LiteBansModule_293)contextObj);
    }
}

