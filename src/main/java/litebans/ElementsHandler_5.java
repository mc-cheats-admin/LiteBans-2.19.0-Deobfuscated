package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class ElementsHandler_5
extends BuilderactionHandler_3 {
        public static final Collection BaseCoreGenericHandler(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        return new ValuesHandler(objectArray, false);
    }

    public static final List e() {
        return ElementHandler.c;
    }

    public static final List LiteBansModule_31(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "elements");
        return objectArray.length > 0 ? ArrayUtilities.BaseCoreGenericHandler(objectArray) : CollectionUtilities.e();
    }

    public static final List AsyncBackgroundTask_5(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "elements");
        return objectArray.length == 0 ? (List)new ArrayList() : (List)new ArrayList(new ValuesHandler(objectArray, true));
    }

    public static final ArrayList c(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "elements");
        return objectArray.length == 0 ? new ArrayList() : new ArrayList(new ValuesHandler(objectArray, true));
    }

    public static final int LiteBansModule_31(@NotNull List list) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        return list.size() - 1;
    }

    public static final List BaseCoreGenericHandler(@NotNull List list) {
        List list2;
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        switch (list.size()) {
            case 0: {
                list2 = CollectionUtilities.e();
                break;
            }
            case 1: {
                list2 = CollectionUtilities.BaseCoreGenericHandler(list.get(0));
                break;
            }
            default: {
                list2 = list;
            }
        }
        return list2;
    }

    public static final void LiteBansModule_31() {
        throw new ArithmeticException("Index overflow has ");
    }

    public static final void c() {
        throw new ArithmeticException("Count overflow has ");
    }

    private static final void AsyncBackgroundTask_5() {
        LiteBansModule_31 = new String[]{"<this>", "elements", "elements", "elements", "elements", "init", "init", "builderAction", "builderAction", "<this>", "<this>", "<this>", "defaultValue", "<this>", "elements", "<this>", "random", "<this>", "<this>", "<this>", "comparator", "<this>", "selector", "<this>", "selector", "<this>", "comparison", "fromIndex (", ") is greater than toIndex (", ") + ", "fromIndex (", ") is less than ", "toIndex (", ") is greater than size (", ") + ", "Index overflow has ", "Count overflow has ", "collection", "collection", "array"};
    }

    static {
        ElementsHandler_5.AsyncBackgroundTask_5();
    }
}

