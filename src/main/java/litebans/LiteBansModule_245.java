package litebans;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_245 {
    public static final int BaseCoreGenericHandler(@NotNull int[] nArray, @NotNull LiteBansModule_324 iX2) {
        if (nArray.length <= 1) {
            return ArrayUtilities.LiteBansModule_31(nArray);
        }
        return nArray[iX2.BaseCoreGenericHandler(nArray.length)];
    }

    public static final byte c(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2) {
        if (byArray.length <= 1) {
            return ArrayUtilities.BaseCoreGenericHandler(byArray);
        }
        return byArray[iX2.LiteBansModule_31(byArray.length)];
    }

    public static final byte AsyncBackgroundTask_5(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2) {
        return byArray[iX2.LiteBansModule_31(byArray.length)];
    }

    public static final byte LiteBansModule_31(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2) {
        if (ElementsHandler_3.BaseCoreGenericHandler(byArray) <= 1) {
            return LiteBansModule_283.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(byArray));
        }
        return ElementsHandler_3.BaseCoreGenericHandler(byArray, iX2.BaseCoreGenericHandler(ElementsHandler_3.BaseCoreGenericHandler(byArray)));
    }

    public static final Object BaseCoreGenericHandler(@NotNull Object[] objectArray, @NotNull LiteBansModule_324 iX2) {
        if (objectArray.length <= 1) {
            return ArrayUtilities.LiteBansModule_31(objectArray);
        }
        return objectArray[iX2.BaseCoreGenericHandler(objectArray.length)];
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = byArray;
        boolean flag = false;
        for (int i = ArrayUtilities.LiteBansModule_31(byArray3); 0 < i; --i) {
            int n = iX2.LiteBansModule_31(i + 1);
            byte by2 = byArray3[i];
            byArray3[i] = byArray3[n];
            byArray3[n] = by2;
        }
        return byArray2;
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2, int n) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = byArray;
        boolean flag = false;
        int n2 = 0;
        while (n2 < n) {
            byte by2;
            int n3 = n2++;
            boolean flag2 = false;
            int n4 = iX2.LiteBansModule_31(byArray3.length);
            int n5 = iX2.LiteBansModule_31(byArray3.length - 1);
            byArray3[n4] = by2 = byArray3[n5];
            byArray3[n5 + 1] = by2;
        }
        return byArray2;
    }

    public static final List LiteBansModule_31(@NotNull List list, @NotNull LiteBansModule_324 iX2) {
        List list2;
        List list3 = list2 = list;
        boolean flag = false;
        for (int i = CollectionUtilities.LiteBansModule_31(list3); 0 < i; --i) {
            int n = iX2.LiteBansModule_31(i + 1);
            list3.set(n, list3.set(i, list3.get(n)));
        }
        return list2;
    }

    public static final Object c(@NotNull List list, @NotNull LiteBansModule_324 iX2) {
        if (list.size() <= 1) {
            return CollectionUtilities.LiteBansModule_31(list);
        }
        return list.get(iX2.LiteBansModule_31(list.size()));
    }

    public static final Object LiteBansModule_31(@NotNull Collection collection, @NotNull LiteBansModule_324 iX2) {
        if (collection.size() <= 1) {
            return CollectionUtilities.LiteBansModule_240(collection);
        }
        return CollectionUtilities.LiteBansModule_31((Iterable)collection, iX2.LiteBansModule_31(collection.size()));
    }

    public static final Object BaseCoreGenericHandler(@NotNull Collection collection, @NotNull LiteBansModule_324 iX2) {
        if (collection.isEmpty()) {
            return null;
        }
        return LiteBansModule_245.LiteBansModule_31(collection, iX2);
    }

    public static final void BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull LiteBansModule_324 iX2, @NotNull Number number) {
        boolean flag = false;
        byArray[iX2.LiteBansModule_31((int)byArray.length)] = number.byteValue();
    }

    public static final List BaseCoreGenericHandler(@NotNull List list, @NotNull LiteBansModule_324 iX2) {
        List list2;
        List list3 = list2 = list;
        boolean flag = false;
        list3.remove(iX2.LiteBansModule_31(list3.size()));
        return list2;
    }
}

