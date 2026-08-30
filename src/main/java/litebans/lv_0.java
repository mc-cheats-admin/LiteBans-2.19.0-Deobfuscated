package litebans;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import litebans.ew;
import litebans.hl;
import litebans.lx_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.lv
 */
static class lv_0
extends lx_0 {
    private static /* synthetic */ String[] f;

    public static final void a(@NotNull List list) {
        ew.a((Object)list, f[4]);
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void a(@NotNull List list, @NotNull Comparator comparator) {
        ew.a((Object)list, f[5]);
        ew.a((Object)comparator, f[6]);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    private static final void h() {
        f = new String[]{hl.a("\udc2e\udc66\udc7a\udc7b\udc61\udc2c", -578561006), hl.a("\uaa88\uaa84\uaa86\uaa9b\uaa8a\uaa99\uaa8a\uaa9f\uaa84\uaa99", -1188123925), hl.a("\udd2a\udd62\udd7e\udd7f\udd65\udd28", 348511510), hl.a("\u8644\u8648\u864a\u8657\u8646\u8655\u864e\u8654\u8648\u8649", 2104526375), hl.a("\u359b\u35d3\u35cf\u35ce\u35d4\u3599", 785462695), hl.a("\ufac2\ufa8a\ufa96\ufa97\ufa8d\ufac0", 1996094206), hl.a("\u3968\u3964\u3966\u397b\u396a\u3979\u396a\u397f\u3964\u3979", 1983199499), hl.a("\u1312\u135a\u1346\u1347\u135d\u1310", -1931996370), hl.a("\uc534\uc57c\uc560\uc561\uc57b\uc536", -1881553656), hl.a("\u4c2f\u4c67\u4c7b\u4c7a\u4c60\u4c2d", -1534112749), hl.a("\u8253\u8240\u824f\u8245\u824e\u824c", 1199342113)};
    }

    static {
        lv_0.h();
    }
}

