package litebans;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class ComparatorHandler_2
extends OperationHandler {
    public static final void BaseCoreGenericHandler(@NotNull List list) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void BaseCoreGenericHandler(@NotNull List list, @NotNull Comparator comparator) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    }

