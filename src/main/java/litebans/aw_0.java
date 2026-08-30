package litebans;

import java.util.Set;
import litebans.a5;
import litebans.a8;
import litebans.e5;
import litebans.ew;
import litebans.hl;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.aW
 */
static class aw_0
extends a5 {
    private static /* synthetic */ String[] b;

    public static final Set c() {
        return e5.b;
    }

    public static final Set a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, b[0]);
        return lo_0.a(objectArray);
    }

    public static final Set a(@NotNull Set set) {
        Set set2;
        ew.a((Object)set, b[7]);
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
        b = new String[]{hl.a("\ufd91\ufd98\ufd91\ufd99\ufd91\ufd9a\ufd80\ufd87", -2103443980), hl.a("\u2a20\u2a29\u2a20\u2a28\u2a20\u2a2b\u2a31\u2a36", -248501691), hl.a("\ubed4\ubedd\ubed4\ubedc\ubed4\ubedf\ubec5\ubec2", -948715855), hl.a("\u2e45\u2e4c\u2e45\u2e4d\u2e45\u2e4e\u2e54\u2e53", 1672031776), hl.a("\ubed3\ubeda\ubed3\ubedb\ubed3\ubed8\ubec2\ubec5", -1672102218), hl.a("\u7261\u7276\u726a\u726f\u7267\u7266\u7271\u7242\u7260\u7277\u726a\u726c\u726d", -1569164797), hl.a("\u3d82\u3d95\u3d89\u3d8c\u3d84\u3d85\u3d92\u3da1\u3d83\u3d94\u3d89\u3d8f\u3d8e", -1446887968), hl.a("\u2227\u226f\u2273\u2272\u2268\u2225", 183116315)};
    }

    static {
        aw_0.b();
    }
}

