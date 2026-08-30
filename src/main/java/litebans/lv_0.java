package litebans;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import litebans.ew;
import litebans.hl;
import litebans.lx_0;
import org.jetbrains.annotations.NotNull;

static class lv_0
extends lx_0 {
    private static /* synthetic */ String[] f;

    public static final void a(@NotNull List list) {
        ew.a((Object)list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void a(@NotNull List list, @NotNull Comparator comparator) {
        ew.a((Object)list, "<this>");
        ew.a((Object)comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    private static final void h() {
        f = new String[]{"<this>", "comparator", "<this>", "comparison", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "random"};
    }

    static {
        lv_0.h();
    }
}

