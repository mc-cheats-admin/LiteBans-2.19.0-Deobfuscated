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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class DefaultvalueHandler_5
extends KlassHandler_2 {
    public static final boolean BaseCoreGenericHandler(@NotNull Iterable iterable, Object object) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(object);
        }
        return CollectionUtilities.LiteBansModule_31(iterable, object) >= 0;
    }

    public static final Object LiteBansModule_31(@NotNull Iterable iterable, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).get(n);
        }
        return CollectionUtilities.BaseCoreGenericHandler(iterable, n, arg_0 -> DefaultvalueHandler_5.BaseCoreGenericHandler(n, arg_0));
    }

    public static final Object BaseCoreGenericHandler(@NotNull Iterable iterable, int n, @NotNull LiteBansModule_178 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)eo_02, "defaultValue");
        if (iterable instanceof List) {
            List list = (List)iterable;
            return (0 <= n ? n < list.size() : false) ? list.get(n) : eo_02.BaseCoreGenericHandler(n);
        }
        if (n < 0) {
            return eo_02.BaseCoreGenericHandler(n);
        }
        Iterator iterator = iterable.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (n != n2++) continue;
            return t2;
        }
        return eo_02.BaseCoreGenericHandler(n);
    }

    public static final Object LiteBansModule_240(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionUtilities.LiteBansModule_31((List)iterable);
        }
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is ");
        }
        return iterator.next();
    }

    public static final Object LiteBansModule_31(@NotNull List list) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is ");
        }
        return list.get(0);
    }

    public static final Object AsyncBackgroundTask_5(@NotNull List list) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        return list.isEmpty() ? null : list.get(0);
    }

    public static final Object BaseCoreGenericHandler(@NotNull List list, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        return (0 <= n ? n < list.size() : false) ? list.get(n) : null;
    }

    public static final int LiteBansModule_31(@NotNull Iterable iterable, Object object) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(object);
        }
        int n = 0;
        for (Object t2 : iterable) {
            if (n < 0) {
                CollectionUtilities.LiteBansModule_31();
            }
            if (ObjectUtilities.BaseCoreGenericHandler(object, t2)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public static final Object BaseCoreGenericHandler(@NotNull List list) {
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is ");
        }
        return list.get(CollectionUtilities.LiteBansModule_31(list));
    }

    public static final Object BaseCoreGenericHandler(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return CollectionUtilities.c((List)iterable);
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
        ObjectUtilities.BaseCoreGenericHandler((Object)list, "<this>");
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

    public static final List BaseCoreGenericHandler(@NotNull Iterable iterable, int n) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (!(n >= 0)) {
            boolean flag = false;
            String string = "Requested element count " + n + " is less than ";
            throw new IllegalArgumentException(string.toString());
        }
        if (n == 0) {
            return CollectionUtilities.e();
        }
        if (iterable instanceof Collection) {
            if (n >= ((Collection)iterable).size()) {
                return CollectionUtilities.LiteBansModule_194(iterable);
            }
            if (n == 1) {
                return CollectionUtilities.BaseCoreGenericHandler(CollectionUtilities.LiteBansModule_240(iterable));
            }
        }
        int n2 = 0;
        ArrayList arrayList = new ArrayList(n);
        for (Object t2 : iterable) {
            arrayList.add(t2);
            if (++n2 != n) continue;
            break;
        }
        return CollectionUtilities.BaseCoreGenericHandler(arrayList);
    }

    public static final List c(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection && ((Collection)iterable).size() <= 1) {
            return CollectionUtilities.LiteBansModule_194(iterable);
        }
        List list = CollectionUtilities.AsyncBackgroundTask_5(iterable);
        CollectionUtilities.LiteBansModule_31(list);
        return list;
    }

    public static final List e(@NotNull Iterable iterable) {
        List list;
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            if (((Collection)iterable).size() <= 1) {
                return CollectionUtilities.LiteBansModule_194(iterable);
            }
            Object[] objectArray = (Object[])iterable;
            boolean flag = false;
            Object[] objectArray2 = objectArray;
            Object[] objectArray3 = objectArray = objectArray2.toArray(new Comparable[0]);
            boolean flag2 = false;
            ArrayUtilities.LiteBansModule_31(objectArray3);
            return ArrayUtilities.BaseCoreGenericHandler(objectArray);
        }
        List list2 = list = CollectionUtilities.AsyncBackgroundTask_5(iterable);
        boolean flag = false;
        CollectionUtilities.BaseCoreGenericHandler(list2);
        return list;
    }

    public static final List BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull Comparator comparator) {
        List list;
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)comparator, "comparator");
        if (iterable instanceof Collection) {
            if (((Collection)iterable).size() <= 1) {
                return CollectionUtilities.LiteBansModule_194(iterable);
            }
            Object[] objectArray = (Object[])iterable;
            boolean flag = false;
            Object[] objectArray2 = objectArray;
            Object[] objectArray3 = objectArray = objectArray2.toArray(new Object[0]);
            boolean flag2 = false;
            ArrayUtilities.BaseCoreGenericHandler(objectArray3, comparator);
            return ArrayUtilities.BaseCoreGenericHandler(objectArray);
        }
        List list2 = list = CollectionUtilities.AsyncBackgroundTask_5(iterable);
        boolean flag = false;
        CollectionUtilities.BaseCoreGenericHandler(list2, comparator);
        return list;
    }

    public static final Collection BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull Collection collection) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "destination");
        for (Object t2 : iterable) {
            collection.add(t2);
        }
        return collection;
    }

    public static final HashSet g(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        return (HashSet)CollectionUtilities.BaseCoreGenericHandler(iterable, new HashSet(LiteBansModule_348.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(iterable, 12))));
    }

    public static final List LiteBansModule_194(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            List list;
            switch (((Collection)iterable).size()) {
                case 0: {
                    list = CollectionUtilities.e();
                    break;
                }
                case 1: {
                    list = CollectionUtilities.BaseCoreGenericHandler(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                    break;
                }
                default: {
                    list = CollectionUtilities.BaseCoreGenericHandler((Collection)iterable);
                }
            }
            return list;
        }
        return CollectionUtilities.BaseCoreGenericHandler(CollectionUtilities.AsyncBackgroundTask_5(iterable));
    }

    public static final List AsyncBackgroundTask_5(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionUtilities.BaseCoreGenericHandler((Collection)iterable);
        }
        return (List)CollectionUtilities.BaseCoreGenericHandler(iterable, new ArrayList());
    }

    public static final List BaseCoreGenericHandler(@NotNull Collection collection) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "<this>");
        return new ArrayList(collection);
    }

    public static final Set LiteBansModule_31(@NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            Set set;
            switch (((Collection)iterable).size()) {
                case 0: {
                    set = LiteBansModule_5.c();
                    break;
                }
                case 1: {
                    set = LiteBansModule_5.BaseCoreGenericHandler(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                    break;
                }
                default: {
                    set = (Set)CollectionUtilities.BaseCoreGenericHandler(iterable, new LinkedHashSet(LiteBansModule_348.BaseCoreGenericHandler(((Collection)iterable).size())));
                }
            }
            return set;
        }
        return LiteBansModule_5.BaseCoreGenericHandler((Set)CollectionUtilities.BaseCoreGenericHandler(iterable, new LinkedHashSet()));
    }

    public static final List BaseCoreGenericHandler(@NotNull Collection collection, Object object) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "<this>");
        ArrayList<Object> arrayList = new ArrayList<Object>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(object);
        return arrayList;
    }

    public static final List BaseCoreGenericHandler(@NotNull Collection collection, @NotNull Iterable iterable) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            ArrayList arrayList = new ArrayList(collection.size() + ((Collection)iterable).size());
            arrayList.addAll(collection);
            arrayList.addAll((Collection)iterable);
            return arrayList;
        }
        ArrayList arrayList = new ArrayList(collection);
        CollectionUtilities.BaseCoreGenericHandler((Collection)arrayList, iterable);
        return arrayList;
    }

    public static final Appendable BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull Appendable appendable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n, @NotNull CharSequence charSequence4, @Nullable LiteBansModule_178 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)appendable, "buffer");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "separator");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence2, "prefix");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence3, "postfix");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence4, "truncated");
        appendable.append(charSequence2);
        int n2 = 0;
        for (Object t2 : iterable) {
            if (++n2 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && n2 > n) break;
            StringUtilities.BaseCoreGenericHandler(appendable, t2, eo_02);
        }
        if (n >= 0 && n2 > n) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String BaseCoreGenericHandler(@NotNull Iterable iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int n, @NotNull CharSequence charSequence4, @Nullable LiteBansModule_178 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler((Object)iterable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence, "separator");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence2, "prefix");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence3, "postfix");
        ObjectUtilities.BaseCoreGenericHandler((Object)charSequence4, "truncated");
        return ((StringBuilder)CollectionUtilities.BaseCoreGenericHandler(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, eo_02)).toString();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n, CharSequence charSequence4, LiteBansModule_178 eo_02, int n2, Object object) {
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
        return CollectionUtilities.BaseCoreGenericHandler(iterable, charSequence, charSequence2, charSequence3, n, charSequence4, eo_02);
    }

    private static final Object BaseCoreGenericHandler(int n, int n2) {
        throw new IndexOutOfBoundsException("Collection doesn'AsyncBackgroundTask_22 contain element LiteBansModule_21 index " + n + '.');
    }

    private static final void LiteBansModule_401() {
        GnuSparseMapHandler = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "defaultValue", "<this>", "defaultValue", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "Collection is ", "<this>", "List is ", "<this>", "predicate", "Collection contains no element matching the ", "<this>", "transform", "No element of the collection was transformed to BaseCoreGenericHandler non-null ", "<this>", "transform", "<this>", "<this>", "<this>", "predicate", "<this>", "defaultValue", "<this>", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "Collection is ", "<this>", "List is ", "<this>", "predicate", "Collection contains no element matching the ", "<this>", "predicate", "List contains no element matching the ", "<this>", "<this>", "<this>", "<this>", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "random", "Collection is ", "<this>", "<this>", "random", "<this>", "Collection is ", "Collection has more than one ", "<this>", "List is ", "List has more than one ", "<this>", "predicate", "Collection contains more than one matching ", "Collection contains no element matching the ", "<this>", "<this>", "<this>", "predicate", "<this>", "Requested element count ", " is less than ", "<this>", "Requested element count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "predicate", "<this>", "destination", "predicate", "<this>", "LockdownService", "<this>", "destination", "LockdownService", "<this>", "predicate", "<this>", "<this>", "destination", "<this>", "destination", "predicate", "<this>", "destination", "predicate", "<this>", "indices", "<this>", "indices", "<this>", "Requested element count ", " is less than ", "<this>", "Requested element count ", " is less than ", "<this>", "predicate", "<this>", "predicate", "<this>", "<this>", "random", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "destination", "transform", "<this>", "valueSelector", "<this>", "destination", "valueSelector", "<this>", "destination", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "keySelector", "<this>", "keySelector", "valueTransform", "<this>", "destination", "keySelector", "<this>", "destination", "keySelector", "valueTransform", "<this>", "keySelector", "<this>", "transform", "<this>", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "transform", "<this>", "destination", "transform", "<this>", "destination", "transform", "<this>", "<this>", "<this>", "selector", "<this>", "other", "<this>", "other", "<this>", "<this>", "other", "<this>", "predicate", "<this>", "<this>", "predicate", "<this>", "<this>", "<this>", "predicate", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "action", "<this>", "action", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "<this>", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "comparator", "selector", "<this>", "comparator", "selector", "<this>", "<this>", "<this>", "<this>", "comparator", "<this>", "comparator", "<this>", "<this>", "predicate", "<this>", "action", "<this>", "action", "<this>", "operation", "Empty collection can'AsyncBackgroundTask_22 be ", "<this>", "operation", "Empty collection can'AsyncBackgroundTask_22 be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "Empty list can'AsyncBackgroundTask_22 be ", "<this>", "operation", "Empty list can'AsyncBackgroundTask_22 be ", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "operation", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "selector", "<this>", "null element found InitializerHandler_3 ", "<this>", "null element found InitializerHandler_3 ", "<this>", "<this>", "transform", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "predicate", "<this>", "<this>", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "elements", "<this>", "<this>", "<this>", "<this>", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "other", "<this>", "other", "transform", "<this>", "<this>", "transform", "<this>", "buffer", "separator", "prefix", "postfix", "truncated", ", ", "", "", ".. + ", "<this>", "separator", "prefix", "postfix", "truncated", ", ", "", "", ".. + ", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "Collection doesn'AsyncBackgroundTask_22 contain element LiteBansModule_21 index "};
    }

    }

