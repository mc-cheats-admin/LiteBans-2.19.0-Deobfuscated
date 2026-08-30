package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.ew;
import litebans.hl;
import litebans.k3;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

static class kM
extends k3 {
    private static /* synthetic */ String[] b;

    public static final List a(@NotNull Object[][] objectArray) {
        ew.a((Object)objectArray, b[0]);
        Object[] objectArray2 = (Object[])objectArray;
        int n = 0;
        for (Object object : objectArray2) {
            Object[] objectArray3 = (Object[])object;
            int n2 = n;
            boolean bl = false;
            int n3 = objectArray3.length;
            n = n2 + n3;
        }
        int n4 = n;
        ArrayList arrayList = new ArrayList(n4);
        n = ((Object[])objectArray).length;
        for (int i = 0; i < n; ++i) {
            Object[] objectArray4 = objectArray[i];
            ll.a((Collection)arrayList, objectArray4);
        }
        return arrayList;
    }

    private static final void b() {
        b = new String[]{hl.a("\uf6c6\uf68e\uf692\uf693\uf689\uf6c4", 555087610), hl.a("\ub152\ub11a\ub106\ub107\ub11d\ub150", -699092626), hl.a("\u6f70\u6f71\u6f72\u6f75\u6f61\u6f78\u6f60\u6f42\u6f75\u6f78\u6f61\u6f71", -1011388652), hl.a("\udc30\udc2b\udc32\udc32", -1363616674), hl.a("\u397b\u390e\u390e\u390e\u397d", 500185376), hl.a("\ubb3d\ubb31", 1506523921), hl.a("\u781d\u7806\u781f\u781f", 98662515)};
    }

    static {
        kM.b();
    }
}

