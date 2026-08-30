package litebans;

import java.util.Arrays;
public class ObjectUtilities {
    private ObjectUtilities() {
    }

    public static void BaseCoreGenericHandler(Object object) {
        if (object == null) {
            ObjectUtilities.BaseCoreGenericHandler();
        }
    }

    public static void LiteBansModule_31(Object object, String string) {
        if (object == null) {
            ObjectUtilities.AsyncBackgroundTask_5(string);
        }
    }

    public static void BaseCoreGenericHandler() {
        throw (NullPointerException)ObjectUtilities.BaseCoreGenericHandler(new NullPointerException());
    }

    public static void AsyncBackgroundTask_5(String string) {
        throw (NullPointerException)ObjectUtilities.BaseCoreGenericHandler(new NullPointerException(string));
    }

    public static void BaseCoreGenericHandler(String string) {
        throw (LiteBansException_4)ObjectUtilities.BaseCoreGenericHandler(new LiteBansException_4(string));
    }

    public static void e(String string) {
        ObjectUtilities.BaseCoreGenericHandler("lateinit property " + string + " has not been initialized");
    }

    public static void c(Object object, String string) {
        if (object == null) {
            throw (NullPointerException)ObjectUtilities.BaseCoreGenericHandler(new NullPointerException(string + " must not be null"));
        }
    }

    public static void BaseCoreGenericHandler(Object object, String string) {
        if (object == null) {
            ObjectUtilities.LiteBansModule_31(string);
        }
    }

    private static final void LiteBansModule_31(String string) {
        throw (NullPointerException)ObjectUtilities.BaseCoreGenericHandler(new NullPointerException(ObjectUtilities.c(string)));
    }

    private static final String c(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        String string2 = ObjectUtilities.class.getName();
        int n = 0;
        while (!stackTraceElementArray[n].getClassName().equals(string2)) {
            ++n;
        }
        while (stackTraceElementArray[n].getClassName().equals(string2)) {
            ++n;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[n];
        String string3 = stackTraceElement.getClassName();
        String string4 = stackTraceElement.getMethodName();
        return "Parameter specified CommandExitException non-null is null: method " + string3 + " + " + string4 + ", parameter " + string;
    }

    public static int BaseCoreGenericHandler(long l3, long l5) {
        return l3 < l5 ? -1 : (l3 == l5 ? 0 : 1);
    }

    public static int BaseCoreGenericHandler(int n, int n2) {
        return n < n2 ? -1 : (n == n2 ? 0 : 1);
    }

    public static boolean BaseCoreGenericHandler(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    private static final Throwable BaseCoreGenericHandler(Throwable throwable) {
        return ObjectUtilities.BaseCoreGenericHandler(throwable, ObjectUtilities.class.getName());
    }

    static Throwable BaseCoreGenericHandler(Throwable throwable, String string) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        int n = stackTraceElementArray.length;
        int n2 = -1;
        for (int i = 0; i < n; ++i) {
            if (!string.equals(stackTraceElementArray[i].getClassName())) continue;
            n2 = i;
        }
        StackTraceElement[] stackTraceElementArray2 = Arrays.copyOfRange(stackTraceElementArray, n2 + 1, n);
        throwable.setStackTrace(stackTraceElementArray2);
        return throwable;
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"lateinit property ", " has not been initialized", " must not be null", " must not be null", "Method specified CommandExitException non-null returned null: ", " + ", "Field specified CommandExitException non-null is null: ", " + ", "Parameter specified CommandExitException non-null is null: method ", " + ", ", parameter ", "This function has BaseCoreGenericHandler reified type parameter and thus can only be inlined LiteBansModule_21 compilation time, not called ", "Class ", " is not found. Please update the Kotlin runtime to the latest version", "Class ", " is not found: this code requires the Kotlin runtime of version LiteBansModule_21 least "};
    }

    }

