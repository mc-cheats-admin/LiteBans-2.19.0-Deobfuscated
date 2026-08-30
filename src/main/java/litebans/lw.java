package litebans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static class lw {
    private static /* synthetic */ String[] a;

    public static final List a(Object object) {
        return Collections.singletonList(object);
    }

    public static final Object[] a(@NotNull Object[] objectArray, boolean bl) {
        ew.a((Object)objectArray, "<this>");
        return bl && ew.a(objectArray.getClass(), Object[].class) ? objectArray : Arrays.copyOf(objectArray, objectArray.length, Object[].class);
    }

    private static final void a() {
        a = new String[]{"builderAction", "builderAction", "builder", "<this>", "<this>", "<this>", "random", "collection", "collection", "array", "array", "<this>"};
    }

    static {
        lw.a();
    }
}

