package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.kb_0;
import litebans.ll;
import litebans.lo_0;
import litebans.lv_0;
import org.jetbrains.annotations.NotNull;

static class lf
extends lv_0 {
    private static /* synthetic */ String[] g;

    public static final boolean a(@NotNull Collection collection, @NotNull Iterable iterable) {
        ew.a((Object)collection, "<this>");
        ew.a((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        boolean bl = false;
        for (Object t2 : iterable) {
            if (!collection.add(t2)) continue;
            bl = true;
        }
        return bl;
    }

    public static final boolean a(@NotNull Collection collection, @NotNull Object[] objectArray) {
        ew.a((Object)collection, "<this>");
        ew.a((Object)objectArray, "elements");
        return collection.addAll(lo_0.a(objectArray));
    }

    public static final boolean a(@NotNull Iterable iterable, @NotNull eo_0 eo_02) {
        ew.a((Object)iterable, "<this>");
        ew.a((Object)eo_02, "predicate");
        return lf.a(iterable, eo_02, true);
    }

    private static final boolean a(Iterable iterable, eo_0 eo_02, boolean bl) {
        boolean bl2 = false;
        Iterator iterator = iterable.iterator();
        boolean bl3 = false;
        while (iterator.hasNext()) {
            if ((Boolean)eo_02.a(iterator.next()) != bl) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean a(@NotNull List list, @NotNull eo_0 eo_02) {
        ew.a((Object)list, "<this>");
        ew.a((Object)eo_02, "predicate");
        return lf.a(list, eo_02, false);
    }

    private static final boolean a(List list, eo_0 eo_02, boolean bl) {
        if (!(list instanceof RandomAccess)) {
            ew.b(list, "");
            return lf.a(kb_0.a(list), eo_02, bl);
        }
        int n = 0;
        int n2 = 0;
        int n3 = ll.b(list);
        if (n2 <= n3) {
            while (true) {
                Object e;
                if ((Boolean)eo_02.a(e = list.get(n2)) != bl) {
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
            n2 = ll.b(list);
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
        lf.i();
    }
}

