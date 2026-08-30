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
        ew.a((Object)objectArray, "<this>");
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
        b = new String[]{"<this>", "<this>", "defaultValue", "null", "[...]", ", ", "null"};
    }

    static {
        kM.b();
    }
}

