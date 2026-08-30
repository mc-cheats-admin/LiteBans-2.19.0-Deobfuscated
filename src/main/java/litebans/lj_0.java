package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import litebans.a8;
import litebans.bz;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.jm_0;
import litebans.l1;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class lj_0
extends l1 {
    private static /* synthetic */ String[] j;

    public static final boolean a(@NotNull Iterable iterable, Object object) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(object);
        }
        return ll.b(iterable, object) >= 0;
    }

    public static final Object b(@NotNull Iterable iterable, int n) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).get(n);
        }
        return ll.a(iterable, n, arg_0 -> lj_0.a(n, arg_0));
    }

    public static final Object a(@NotNull Iterable iterable, int n, @NotNull eo_0 eo_02) {
        ew.a((Object)iterable, "<this>");
        ew.a((Object)eo_02, "defaultValue");
        if (iterable instanceof List) {
            List list = (List)iterable;
            return (0 <= n ? n < list.size() : false) ? list.get(n) : eo_02.a(n);
        }
        if (n < 0) {
            return eo_02.a(n);
        }
        Iterator iterator = iterable.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (n != n2++) continue;
            return t2;
        }
        return eo_02.a(n);
    }

    public static final Object h(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ll.b((List)iterable);
        }
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is ");
        }
        return iterator.next();
    }

    public static final Object b(@NotNull List list) {
        ew.a((Object)list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is ");
        }
        return list.get(0);
    }

    public static final Object d(@NotNull List list) {
        ew.a((Object)list, "<this>");
        return list.isEmpty() ? null : list.get(0);
    }

    public static final Object a(@NotNull List list, int n) {
        ew.a((Object)list, "<this>");
        return (0 <= n ? n < list.size() : false) ? list.get(n) : null;
    }

    public static final int b(@NotNull Iterable iterable, Object object) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(object);
        }
        int n = 0;
        for (Object t2 : iterable) {
            if (n < 0) {
                ll.b();
            }
            if (ew.a(object, t2)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public static final Object a(@NotNull List list) {
        ew.a((Object)list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is ");
        }
        return list.get(ll.b(list));
    }

    public static final Object a(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ll.c((List)iterable);
        }
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is ");
        }
        Object t2 = iterator.next();
        if (iterator.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one ");
        }
        return t2;
    }

    public static final Object c(@NotNull List list) {
        ew.a((Object)list, "<this>");
        switch (list.size()) {
            case 0: {
                throw new NoSuchElementException("List is ");
            }
            case 1: {
                break;
            }
            default: {
                throw new IllegalArgumentException("List has more than one ");
            }
        }
        return list.get(0);
    }

    public static final List a(@NotNull Iterable iterable, int n) {
        ew.a((Object)iterable, "<this>");
        if (!(n >= 0)) {
            boolean bl = false;
            String string = "Requested element count " + n + " is less than ";
            throw new IllegalArgumentException(string.toString());
        }
        if (n == 0) {
            return ll.e();
        }
        if (iterable instanceof Collection) {
            if (n >= ((Collection)iterable).size()) {
                return ll.f(iterable);
            }
            if (n == 1) {
                return ll.a(ll.h(iterable));
            }
        }
        int n2 = 0;
        ArrayList arrayList = new ArrayList(n);
        for (Object t2 : iterable) {
            arrayList.add(t2);
            if (++n2 != n) continue;
            break;
        }
        return ll.a(arrayList);
    }

    public static final List c(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection && ((Collection)iterable).size() <= 1) {
            return ll.f(iterable);
        }
        List list = ll.d(iterable);
        ll.b(list);
        return list;
    }

    public static final List e(@NotNull Iterable iterable) {
        List list;
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            if (((Collection)iterable).size() <= 1) {
                return ll.f(iterable);
            }
            Object[] objectArray = (Object[])iterable;
            boolean bl = false;
            Object[] objectArray2 = objectArray;
            Object[] objectArray3 = objectArray = objectArray2.toArray(new Comparable[0]);
            boolean bl2 = false;
            lo_0.b(objectArray3);
            return lo_0.a(objectArray);
        }
        List list2 = list = ll.d(iterable);
        boolean bl = false;
        ll.a(list2);
        return list;
    }

    public static final List a(@NotNull Iterable iterable, @NotNull Comparator comparator) {
        List list;
        ew.a((Object)iterable, "<this>");
        ew.a((Object)comparator, "comparator");
        if (iterable instanceof Collection) {
            if (((Collection)iterable).size() <= 1) {
                return ll.f(iterable);
            }
            Object[] objectArray = (Object[])iterable;
            boolean bl = false;
            Object[] objectArray2 = objectArray;
            Object[] objectArray3 = objectArray = objectArray2.toArray(new Object[0]);
            boolean bl2 = false;
            lo_0.a(objectArray3, comparator);
            return lo_0.a(objectArray);
        }
        List list2 = list = ll.d(iterable);
        boolean bl = false;
        ll.a(list2, comparator);
        return list;
    }

    public static final Collection a(@NotNull Iterable iterable, @NotNull Collection collection) {
        ew.a((Object)iterable, "<this>");
        ew.a((Object)collection, "destination");
        for (Object t2 : iterable) {
            collection.add(t2);
        }
        return collection;
    }

    public static final HashSet g(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        return (HashSet)ll.a(iterable, new HashSet(jm_0.a(ll.a(iterable, 12))));
    }

    public static final List f(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            List list;
            switch (((Collection)iterable).size()) {
                case 0: {
                    list = ll.e();
                    break;
                }
                case 1: {
                    list = ll.a(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                    break;
                }
                default: {
                    list = ll.a((Collection)iterable);
                }
            }
            return list;
        }
        return ll.a(ll.d(iterable));
    }

    public static final List d(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return ll.a((Collection)iterable);
        }
        return (List)ll.a(iterable, new ArrayList());
    }

    public static final List a(@NotNull Collection collection) {
        ew.a((Object)collection, "<this>");
        return new ArrayList(collection);
    }

    public static final Set b(@NotNull Iterable iterable) {
        ew.a((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            Set set;
            switch (((Collection)iterable).size()) {
                case 0: {
                    set = a8.c();
                    break;
                }
                case 1: {
                    set = a8.a(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                    break;
                }
                default: {
                    set = (Set)ll.a(iterable, new LinkedHashSet(jm_0.a(((Collection)iterable).size())));
                }
            }
            return set;
        }
        return a8.a((Set)ll.a(iterable, new LinkedHashSet()));
    }

    public static final List a(@NotNull Collection collection, Object object) {
        ew.a((Object)collection, "<this>");
        ArrayList<Object> arrayList = new ArrayList<Object>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(object);
        return arrayList;
    }

    public static final List a(@NotNull Collection collection, @NotNull Iterable iterable) {
        ew.a((Object)collection, "<this>");
        ew.a((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            ArrayList arrayList = new ArrayList(collection.size() + ((Collection)iterable).size());
            arrayList.addAll(collection);
            arrayList.addAll((Collection)iterable);
            return arrayList;
        }
        ArrayList arrayList = new ArrayList(collection);
        ll.a((Collection)arrayList, iterable);
        return arrayList;
    }

    public static final Appendable a(@NotNull Iterable iterable, @NotNull Appendable appendable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n, @NotNull CharSequence charSequence4, @Nullable eo_0 eo_02) {
        ew.a((Object)iterable, "<this>");
        ew.a((Object)appendable, "buffer");
        ew.a((Object)charSequence, "separator");
        ew.a((Object)charSequence2, "prefix");
        ew.a((Object)charSequence3, "postfix");
        ew.a((Object)charSequence4, "truncated");
        appendable.append(charSequence2);
        int n2 = 0;
        for (Object t2 : iterable) {
            if (++n2 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && n2 > n) break;
            bz.a(appendable, t2, eo_02);
        }
        if (n >= 0 && n2 > n) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String a(@NotNull Iterable iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n, @NotNull CharSequence charSequence4, @Nullable eo_0 eo_02) {
        ew.a((Object)iterable, "<this>");
        ew.a((Object)charSequence, "separator");
        ew.a((Object)charSequence2, "prefix");
        ew.a((Object)charSequence3, "postfix");
        ew.a((Object)charSequence4, "truncated");
        return ((StringBuilder)ll.a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, eo_02)).toString();
    }

    public static /* synthetic */ String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n, CharSequence charSequence4, eo_0 eo_02, int n2, Object object) {
        if ((n2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((n2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        if ((n2 & 0x10) != 0) {
            charSequence4 = ".. + ";
        }
        if ((n2 & 0x20) != 0) {
            eo_02 = null;
        }
        return ll.a(iterable, charSequence, charSequence2, charSequence3, n, charSequence4, eo_02);
    }

    private static final Object a(int n, int n2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + n + '.');
    }

    private static final void l() {
        j = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "defaultValue", "<this>", "defaultValue", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "Collection is ", "<this>", "List is ", "<this>", "predicate", "Collection contains no element matching the ", "<this>", "transform", "No element of the collection was transformed to a non-null ", "<this>", "transform", "<this>", "<this>", "<this>", "predicate", "<this>", "defaultValue", "<this>", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "Collection is ", "<this>", "List is ", "<this>", "predicate", "Collection contains no element matching the ", "<this>", "predicate", "List contains no element matching the ", "<this>", "<this>", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "random", "Collection is ", "<this>", "<this>", "random", "<this>", "Collection is ", "Collection has more than one ", "<this>", "List is ", "List has more than one ", "<this>", "predicate", "Collection contains more than one matching ", "Collection contains no element matching the ", "<this>", "<this>", "<this>", "predicate", "<this>", "Requested element count ", " is less than ", "<this>", "Requested element count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "R", "<this>", "destination", "R", "<this>", "predicate", "<this>", "<this>", "destination", "<this>", "destination", "predicate", "<this>", "destination", "predicate", "<this>", "indices", "<this>", "indices", "<this>", "Requested element count ", " is less than ", "<this>", "Requested element count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "random", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "destination", "transform", "<this>", "valueSelector", "<this>", "destination", "valueSelector", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "keySelector", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "<this>", "<this>", "selector", "<this>", "other", "<this>", "other", "<this>", "<this>", "other", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "<this>", "<this>", "predicate", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "action", "<this>", "action", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "predicate", "<this>", "action", "<this>", "action", "<this>", "operation", "Empty collection can't be ", "<this>", "operation", "Empty collection can't be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "Empty list can't be ", "<this>", "operation", "Empty list can't be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "null element found in ", "<this>", "null element found in ", "<this>", "<this>", "transform", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "predicate", "<this>", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "<this>", "transform", "<this>", "buffer", "separator", "prefix", "postfix", "truncated", ", ", "", "", ".. + ", "<this>", "separator", "prefix", "postfix", "truncated", ", ", "", "", ".. + ", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "Collection doesn't contain element at index "};
    }

    static {
        lj_0.l();
    }
}

