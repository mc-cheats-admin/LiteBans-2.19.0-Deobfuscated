package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

static class ElementsHandler_6
extends ComparatorHandler_2 {
        public static final boolean BaseCoreGenericHandler(@NotNull Collection collection, @NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        for (Object t2 : iterable) {
            if (!collection.add(t2)) continue;
            flag = true;
        }
        return flag;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull Collection collection, @NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "elements");
        return collection.addAll(ArrayUtilities.BaseCoreGenericHandler(objectArray));
    }

    public static final boolean BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull LiteBansModule_179 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)eo_02, "predicate");
        return ElementsHandler_6.BaseCoreGenericHandler(iterable, eo_02, true);
    }

    private static final boolean BaseCoreGenericHandler(Iterable iterable, LiteBansModule_179 eo_02, boolean flag) {
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if ((Boolean)eo_02.BaseCoreGenericHandler(iterator.next()) != flag) continue;
            iterator.remove();
            flag2 = true;
        }
        return flag2;
    }

    public static final boolean BaseCoreGenericHandler(@NotNull List list, @NotNull LiteBansModule_179 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)eo_02, "predicate");
        return ElementsHandler_6.BaseCoreGenericHandler(list, eo_02, false);
    }

    private static final boolean BaseCoreGenericHandler(List list, LiteBansModule_179 eo_02, boolean flag) {
        if (!(list instanceof RandomAccess)) {
            ObjectUtilities.LiteBansModule_31(list, "");
            return ElementsHandler_6.BaseCoreGenericHandler(NullHandler_6.BaseCoreGenericHandler(list), eo_02, flag);
        }
        int n3 = CollectionUtilities.LiteBansModule_31(list);
        if (n2 <= n3) {
            while (true) {
                Object e;
                if ((Boolean)eo_02.BaseCoreGenericHandler(e = list.get(n2)) != flag) {
                    if (n != n2) {
                        list.set(n, e);
                    }
                    ++n;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        if (n < list.size()) {
            n3 = n;
            n2 = CollectionUtilities.LiteBansModule_31(list);
            if (n3 <= n2) {
                while (true) {
                    list.remove(n2);
                    if (n2 == n3) break;
                    --n2;
                }
            }
            return true;
        }
        return false;
    }

    private static final void i() {
        g = new String[]{"<this>", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "List is ", "<this>", "<this>", "List is ", "<this>", "<this>", "predicate", "<this>", "predicate", ""};
    }

    static {
        ElementsHandler_6.i();
    }
}

