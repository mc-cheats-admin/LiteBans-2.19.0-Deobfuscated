package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class DefaultvalueHandler_4
extends CharsetHandler {
        public static final List BaseCoreGenericHandler(@NotNull Object[][] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        Object[] objectArray2 = (Object[])objectArray;
        for (Object targetObj : objectArray2) {
            Object[] objectArray3 = (Object[])targetObj;
            int n2 = n;
            int n3 = objectArray3.length;
            n = n2 + n3;
        }
        int n4 = n;
        ArrayList arrayList = new ArrayList(n4);
        n = ((Object[])objectArray).length;
        for (int i = 0; i < n; ++i) {
            Object[] objectArray4 = objectArray[i];
            CollectionUtilities.BaseCoreGenericHandler((Collection)arrayList, objectArray4);
        }
        return arrayList;
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"<this>", "<this>", "defaultValue", "null", "[...]", ", ", "null"};
    }

    static {
        DefaultvalueHandler_4.LiteBansModule_31();
    }
}

