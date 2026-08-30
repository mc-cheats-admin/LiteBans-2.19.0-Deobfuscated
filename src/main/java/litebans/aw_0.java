package litebans;

import java.util.Set;
import litebans.a5;
import litebans.a8;
import litebans.e5;
import litebans.ew;
import litebans.hl;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static class aw_0
extends a5 {
    private static /* synthetic */ String[] b;

    public static final Set c() {
        return e5.b;
    }

    public static final Set a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "elements");
        return lo_0.a(objectArray);
    }

    public static final Set a(@NotNull Set set) {
        Set set2;
        ew.a((Object)set, "<this>");
        switch (set.size()) {
            case 0: {
                set2 = a8.c();
                break;
            }
            case 1: {
                set2 = a8.a(set.iterator().next());
                break;
            }
            default: {
                set2 = set;
            }
        }
        return set2;
    }

    private static final void b() {
        b = new String[]{"elements", "elements", "elements", "elements", "elements", "builderAction", "builderAction", "<this>"};
    }

    static {
        aw_0.b();
    }
}

