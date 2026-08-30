package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.cK;
import litebans.ew;
import litebans.h_;
import litebans.hl;
import litebans.ll;
import litebans.lo_0;
import litebans.lw;
import org.jetbrains.annotations.NotNull;

static class lA
extends lw {
    private static /* synthetic */ String[] b;

    public static final Collection a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "<this>");
        return new h_(objectArray, false);
    }

    public static final List e() {
        return cK.c;
    }

    public static final List b(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "elements");
        return objectArray.length > 0 ? lo_0.a(objectArray) : ll.e();
    }

    public static final List d(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "elements");
        return objectArray.length == 0 ? (List)new ArrayList() : (List)new ArrayList(new h_(objectArray, true));
    }

    public static final ArrayList c(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "elements");
        return objectArray.length == 0 ? new ArrayList() : new ArrayList(new h_(objectArray, true));
    }

    public static final int b(@NotNull List list) {
        ew.a((Object)list, "<this>");
        return list.size() - 1;
    }

    public static final List a(@NotNull List list) {
        List list2;
        ew.a((Object)list, "<this>");
        switch (list.size()) {
            case 0: {
                list2 = ll.e();
                break;
            }
            case 1: {
                list2 = ll.a(list.get(0));
                break;
            }
            default: {
                list2 = list;
            }
        }
        return list2;
    }

    public static final void b() {
        throw new ArithmeticException("Index overflow has ");
    }

    public static final void c() {
        throw new ArithmeticException("Count overflow has ");
    }

    private static final void d() {
        b = new String[]{"<this>", "elements", "elements", "elements", "elements", "init", "init", "builderAction", "builderAction", "<this>", "<this>", "<this>", "defaultValue", "<this>", "elements", "<this>", "random", "<this>", "<this>", "<this>", "comparator", "<this>", "selector", "<this>", "selector", "<this>", "comparison", "fromIndex (", ") is greater than toIndex (", ") + ", "fromIndex (", ") is less than ", "toIndex (", ") is greater than size (", ") + ", "Index overflow has ", "Count overflow has ", "collection", "collection", "array"};
    }

    static {
        lA.d();
    }
}

