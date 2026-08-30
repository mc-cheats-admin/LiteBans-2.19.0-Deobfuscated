package litebans;

import java.util.Collection;
import java.util.List;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.hq_0;
import litebans.in_0;
import litebans.kz;

public class kb_0 {
    private static /* synthetic */ String[] a;

    private static final Throwable a(Throwable throwable) {
        return ew.a(throwable, kb_0.class.getName());
    }

    public static void a(Object object, String string) {
        String string2 = object == null ? "null" : object.getClass().getName();
        kb_0.a(string2 + " cannot be cast to " + string);
    }

    public static void a(String string) {
        throw kb_0.a(new ClassCastException(string));
    }

    public static ClassCastException a(ClassCastException classCastException) {
        throw (ClassCastException)kb_0.a((Throwable)classCastException);
    }

    public static Iterable a(Object object) {
        if (object instanceof dG && !(object instanceof in_0)) {
            kb_0.a(object, "kotlin.collections.MutableIterable");
        }
        return kb_0.e(object);
    }

    public static Iterable e(Object object) {
        try {
            return (Iterable)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    public static Collection b(Object object) {
        if (object instanceof dG && !(object instanceof hq_0)) {
            kb_0.a(object, "kotlin.collections.MutableCollection");
        }
        return kb_0.d(object);
    }

    public static Collection d(Object object) {
        try {
            return (Collection)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    public static List c(Object object) {
        if (object instanceof dG && !(object instanceof kz)) {
            kb_0.a(object, "kotlin.collections.MutableList");
        }
        return kb_0.f(object);
    }

    public static List f(Object object) {
        try {
            return (List)object;
        }
        catch (ClassCastException classCastException) {
            throw kb_0.a(classCastException);
        }
    }

    private static final void a() {
        a = new String[]{"null", " cannot be cast to ", "kotlin.collections.MutableIterator", "kotlin.collections.MutableListIterator", "kotlin.collections.MutableIterable", "kotlin.collections.MutableCollection", "kotlin.collections.MutableList", "kotlin.collections.MutableSet", "kotlin.collections.MutableMap", "kotlin.collections.MutableMap.MutableEntry", "kotlin.jvm.functions.Function"};
    }

    static {
        kb_0.a();
    }
}

