package litebans;

import java.util.Iterator;
import litebans.ew;
import litebans.g7;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class d2 {
    private static /* synthetic */ String[] a;

    public static final Iterator a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "array");
        return new g7(objectArray);
    }

    private static final void a() {
        a = new String[]{"array"};
    }

    static {
        d2.a();
    }
}

