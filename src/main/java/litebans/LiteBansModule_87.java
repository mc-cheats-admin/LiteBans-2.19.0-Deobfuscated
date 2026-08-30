package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public final class LiteBansModule_87 {
    private LiteBansModule_87() {
    }

    public final List BaseCoreGenericHandler() {
        BansHandler_2[] kLArray = BansHandler_2.values();
        BansHandler_2[] kLArray2 = kLArray;
        Collection collection = new ArrayList();
        int n = kLArray2.length;
        for (int i = 0; i < n; ++i) {
            BansHandler_2 kL2;
            BansHandler_2 kL3 = kL2 = kLArray2[i];
            if (!kL3.BaseCoreGenericHandler()) continue;
            collection.add(kL2);
        }
        return (List)collection;
    }

    public /* synthetic */ LiteBansModule_87(LiteBansModule_14 aJ2) {
        this();
}

