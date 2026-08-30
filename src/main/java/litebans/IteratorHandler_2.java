package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

static class IteratorHandler_2
extends ElementsHandler_5 {
    public static final int BaseCoreGenericHandler(@NotNull Iterable iterable, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        return iterable instanceof Collection ? ((Collection)iterable).size() : n;
    }

    private static final void e() {
        c = new String[]{"iterator", "<this>", "<this>", "<this>", "<this>"};
    }

    }

