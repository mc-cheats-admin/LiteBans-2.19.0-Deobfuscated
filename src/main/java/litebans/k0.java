package litebans;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import litebans.dk_0;
import litebans.ew;
import litebans.hl;
import litebans.kM;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static class k0
extends kM {
    private static /* synthetic */ String[] c;

    public static final List a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "<this>");
        return dk_0.a(objectArray);
    }

    public static final Object[] a(@NotNull Object[] objectArray, @NotNull Object[] objectArray2, int n, int n2, int n3) {
        ew.a((Object)objectArray, "<this>");
        ew.a((Object)objectArray2, "destination");
        System.arraycopy(objectArray, n2, objectArray2, n, n3 - n2);
        return objectArray2;
    }

    public static /* synthetic */ Object[] a(Object[] objectArray, Object[] objectArray2, int n, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n = 0;
        }
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        if ((n4 & 8) != 0) {
            n3 = objectArray.length;
        }
        return lo_0.a(objectArray, objectArray2, n, n2, n3);
    }

    public static final byte[] a(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2, int n3) {
        ew.a((Object)byArray, "<this>");
        ew.a((Object)byArray2, "destination");
        System.arraycopy(byArray, n2, byArray2, n, n3 - n2);
        return byArray2;
    }

    public static final byte[] a(@NotNull byte[] byArray, int n, int n2) {
        ew.a((Object)byArray, "<this>");
        lo_0.a(n2, byArray.length);
        return Arrays.copyOfRange(byArray, n, n2);
    }

    public static final void b(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "<this>");
        if (objectArray.length > 1) {
            Arrays.sort(objectArray);
        }
    }

    public static final void a(@NotNull Object[] objectArray, @NotNull Comparator comparator) {
        ew.a((Object)objectArray, "<this>");
        ew.a((Object)comparator, "comparator");
        if (objectArray.length > 1) {
            Arrays.sort(objectArray, comparator);
        }
    }

    private static final void c() {
        c = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "klass", "<this>", "destination", "klass", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "other", "<this>", "<this>", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "hVthis>", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector"};
    }

    static {
        k0.c();
    }
}

