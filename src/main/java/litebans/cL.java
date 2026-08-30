package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.aJ;
import litebans.kL;

public static final class cL {
    private cL() {
    }

    public final List a() {
        kL[] kLArray = kL.values();
        boolean bl = false;
        kL[] kLArray2 = kLArray;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        int n = kLArray2.length;
        for (int i = 0; i < n; ++i) {
            kL kL2;
            kL kL3 = kL2 = kLArray2[i];
            boolean bl3 = false;
            if (!kL3.a()) continue;
            collection.add(kL2);
        }
        return (List)collection;
    }

    public /* synthetic */ cL(aJ aJ2) {
        this();
    }
}

