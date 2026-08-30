package litebans;

import java.util.Collection;
import java.util.List;
public class NullHandler_6 {
        private static final Throwable BaseCoreGenericHandler(Throwable throwable) {
        return ObjectUtilities.BaseCoreGenericHandler(throwable, NullHandler_6.class.getName());
    }

    public static void BaseCoreGenericHandler(Object targetObj, String string) {
        String string2 = targetObj == null ? "null" : targetObj.getClass().getName();
        NullHandler_6.BaseCoreGenericHandler(string2 + " cannot be cast to " + string);
    }

    public static void BaseCoreGenericHandler(String string) {
        throw NullHandler_6.BaseCoreGenericHandler(new ClassCastException(string));
    }

    public static ClassCastException BaseCoreGenericHandler(ClassCastException classCastException) {
        throw (ClassCastException)NullHandler_6.BaseCoreGenericHandler((Throwable)classCastException);
    }

    public static Iterable BaseCoreGenericHandler(Object targetObj) {
        if (targetObj instanceof LiteBansModule_123 && !(targetObj instanceof LiteBansModule_313)) {
            NullHandler_6.BaseCoreGenericHandler(targetObj, "kotlin.collections.MutableIterable");
        }
        return NullHandler_6.e(targetObj);
    }

    public static Iterable e(Object targetObj) {
        try {
            return (Iterable)targetObj;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    public static Collection LiteBansModule_31(Object targetObj) {
        if (targetObj instanceof LiteBansModule_123 && !(targetObj instanceof LiteBansModule_270)) {
            NullHandler_6.BaseCoreGenericHandler(targetObj, "kotlin.collections.MutableCollection");
        }
        return NullHandler_6.AsyncBackgroundTask_5(targetObj);
    }

    public static Collection AsyncBackgroundTask_5(Object targetObj) {
        try {
            return (Collection)targetObj;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    public static List c(Object targetObj) {
        if (targetObj instanceof LiteBansModule_123 && !(targetObj instanceof LiteBansModule_401)) {
            NullHandler_6.BaseCoreGenericHandler(targetObj, "kotlin.collections.MutableList");
        }
        return NullHandler_6.LiteBansModule_195(targetObj);
    }

    public static List LiteBansModule_195(Object targetObj) {
        try {
            return (List)targetObj;
        }
        catch (ClassCastException classCastException) {
            throw NullHandler_6.BaseCoreGenericHandler(classCastException);
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"null", " cannot be cast to ", "kotlin.collections.MutableIterator", "kotlin.collections.MutableListIterator", "kotlin.collections.MutableIterable", "kotlin.collections.MutableCollection", "kotlin.collections.MutableList", "kotlin.collections.MutableSet", "kotlin.collections.MutableMap", "kotlin.collections.MutableMap.MutableEntry", "kotlin.jvm.functions.Function"};
    }

    static {
        NullHandler_6.BaseCoreGenericHandler();
    }
}

