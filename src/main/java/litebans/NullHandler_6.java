package litebans;

import java.util.Collection;
import java.util.List;
public class NullHandler_6 {
    private static final Throwable BaseCoreGenericHandler(Throwable throwable) {
        return ObjectUtilities.BaseCoreGenericHandler(throwable, NullHandler_6.class.getName());
    }

    public static void BaseCoreGenericHandler(Object object, String string) {
        String string2 = object == null ? "null" : object.getClass().getName();
        NullHandler_6.BaseCoreGenericHandler(string2 + " cannot be cast to " + string);
    }

    public static void BaseCoreGenericHandler(String string) {
        throw NullHandler_6.BaseCoreGenericHandler(new ClassCastException(string));
    }

    public static ClassCastException BaseCoreGenericHandler(ClassCastException classCastException) {
        throw (ClassCastException)NullHandler_6.BaseCoreGenericHandler((Throwable)classCastException);
    }

    public static Iterable BaseCoreGenericHandler(Object object) {
        if (object instanceof LiteBansModule_122 && !(object instanceof LiteBansModule_312)) {
            NullHandler_6.BaseCoreGenericHandler(object, "kotlin.collections.MutableIterable");
        }
        return NullHandler_6.e(object);
    }

    public static Iterable e(Object object) {
        try {
            return (Iterable)object;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    public static Collection LiteBansModule_31(Object object) {
        if (object instanceof LiteBansModule_122 && !(object instanceof LiteBansModule_269)) {
            NullHandler_6.BaseCoreGenericHandler(object, "kotlin.collections.MutableCollection");
        }
        return NullHandler_6.AsyncBackgroundTask_5(object);
    }

    public static Collection AsyncBackgroundTask_5(Object object) {
        try {
            return (Collection)object;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    public static List c(Object object) {
        if (object instanceof LiteBansModule_122 && !(object instanceof LiteBansModule_399)) {
            NullHandler_6.BaseCoreGenericHandler(object, "kotlin.collections.MutableList");
        }
        return NullHandler_6.LiteBansModule_194(object);
    }

    public static List LiteBansModule_194(Object object) {
        try {
            return (List)object;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"null", " cannot be cast to ", "kotlin.collections.MutableIterator", "kotlin.collections.MutableListIterator", "kotlin.collections.MutableIterable", "kotlin.collections.MutableCollection", "kotlin.collections.MutableList", "kotlin.collections.MutableSet", "kotlin.collections.MutableMap", "kotlin.collections.MutableMap.MutableEntry", "kotlin.jvm.functions.Function"};
    }

    }

