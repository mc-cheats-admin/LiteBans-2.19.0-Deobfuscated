package litebans;

import java.util.Collection;
import java.util.List;
import litebans.cc;
import litebans.hy_0;
import litebans.iX;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

public static final class h5 {
    public static final int a(@NotNull int[] nArray, @NotNull iX iX2) {
        if (nArray.length <= 1) {
            return lo_0.b(nArray);
        }
        return nArray[iX2.a(nArray.length)];
    }

    public static final byte c(@NotNull byte[] byArray, @NotNull iX iX2) {
        if (byArray.length <= 1) {
            return lo_0.a(byArray);
        }
        return byArray[iX2.b(byArray.length)];
    }

    public static final byte d(@NotNull byte[] byArray, @NotNull iX iX2) {
        return byArray[iX2.b(byArray.length)];
    }

    public static final byte b(@NotNull byte[] byArray, @NotNull iX iX2) {
        if (cc.a(byArray) <= 1) {
            return hy_0.a(lo_0.a(byArray));
        }
        return cc.a(byArray, iX2.a(cc.a(byArray)));
    }

    public static final Object a(@NotNull Object[] objectArray, @NotNull iX iX2) {
        if (objectArray.length <= 1) {
            return lo_0.b(objectArray);
        }
        return objectArray[iX2.a(objectArray.length)];
    }

    public static final byte[] a(@NotNull byte[] byArray, @NotNull iX iX2) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = byArray;
        boolean bl = false;
        for (int i = lo_0.b(byArray3); 0 < i; --i) {
            int n = iX2.b(i + 1);
            byte by2 = byArray3[i];
            byArray3[i] = byArray3[n];
            byArray3[n] = by2;
        }
        return byArray2;
    }

    public static final byte[] a(@NotNull byte[] byArray, @NotNull iX iX2, int n) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = byArray;
        boolean bl = false;
        int n2 = 0;
        while (n2 < n) {
            byte by2;
            int n3 = n2++;
            boolean bl2 = false;
            int n4 = iX2.b(byArray3.length);
            int n5 = iX2.b(byArray3.length - 1);
            byArray3[n4] = by2 = byArray3[n5];
            byArray3[n5 + 1] = by2;
        }
        return byArray2;
    }

    public static final List b(@NotNull List list, @NotNull iX iX2) {
        List list2;
        List list3 = list2 = list;
        boolean bl = false;
        for (int i = ll.b(list3); 0 < i; --i) {
            int n = iX2.b(i + 1);
            list3.set(n, list3.set(i, list3.get(n)));
        }
        return list2;
    }

    public static final Object c(@NotNull List list, @NotNull iX iX2) {
        if (list.size() <= 1) {
            return ll.b(list);
        }
        return list.get(iX2.b(list.size()));
    }

    public static final Object b(@NotNull Collection collection, @NotNull iX iX2) {
        if (collection.size() <= 1) {
            return ll.h(collection);
        }
        return ll.b((Iterable)collection, iX2.b(collection.size()));
    }

    public static final Object a(@NotNull Collection collection, @NotNull iX iX2) {
        if (collection.isEmpty()) {
            return null;
        }
        return h5.b(collection, iX2);
    }

    public static final void a(@NotNull byte[] byArray, @NotNull iX iX2, @NotNull Number number) {
        boolean bl = false;
        byArray[iX2.b((int)byArray.length)] = number.byteValue();
    }

    public static final List a(@NotNull List list, @NotNull iX iX2) {
        List list2;
        List list3 = list2 = list;
        boolean bl = false;
        list3.remove(iX2.b(list3.size()));
        return list2;
    }
}

