package litebans;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class DestinationHandler
extends DefaultvalueHandler_4 {
        public static final List BaseCoreGenericHandler(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        return LiteBansModule_127.BaseCoreGenericHandler(objectArray);
    }

    public static final Object[] BaseCoreGenericHandler(@NotNull Object[] objectArray, @NotNull Object[] objectArray2, int n, int n2, int n3) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray2, "destination");
        System.arraycopy(objectArray, n2, objectArray2, n, n3 - n2);
        return objectArray2;
    }

    public static /* synthetic */ Object[] BaseCoreGenericHandler(Object[] objectArray, Object[] objectArray2, int n, int n2, int n3, int n4, Object targetObj) {
        if ((n4 & 2) != 0) {
            n = 0;
        }
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        if ((n4 & 8) != 0) {
            n3 = objectArray.length;
        }
        return ArrayUtilities.BaseCoreGenericHandler(objectArray, objectArray2, n, n2, n3);
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, @NotNull byte[] byArray2, int n, int n2, int n3) {
        ObjectUtilities.BaseCoreGenericHandler((Object)byArray, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)byArray2, "destination");
        System.arraycopy(byArray, n2, byArray2, n, n3 - n2);
        return byArray2;
    }

    public static final byte[] BaseCoreGenericHandler(@NotNull byte[] byArray, int n, int n2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)byArray, "<this>");
        ArrayUtilities.BaseCoreGenericHandler(n2, byArray.length);
        return Arrays.copyOfRange(byArray, n, n2);
    }

    public static final void LiteBansModule_31(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        if (objectArray.length > 1) {
            Arrays.sort(objectArray);
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull Object[] objectArray, @NotNull Comparator comparator) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)comparator, "comparator");
        if (objectArray.length > 1) {
            Arrays.sort(objectArray, comparator);
        }
    }

    private static final void c() {
        c = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "klass", "<this>", "destination", "klass", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "other", "<this>", "<this>", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "hVthis>", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "comparator", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector"};
    }

    static {
        DestinationHandler.c();
    }
}

