package litebans;

import java.util.Collection;
import litebans.ew;
import litebans.hl;
import litebans.lA;
import org.jetbrains.annotations.NotNull;

static class l_
extends lA {
    private static /* synthetic */ String[] c;

    public static final int a(@NotNull Iterable iterable, int n) {
        ew.a((Object)iterable, "<this>");
        return iterable instanceof Collection ? ((Collection)iterable).size() : n;
    }

    private static final void e() {
        c = new String[]{"iterator", "<this>", "<this>", "<this>", "<this>"};
    }

    static {
        l_.e();
    }
}

