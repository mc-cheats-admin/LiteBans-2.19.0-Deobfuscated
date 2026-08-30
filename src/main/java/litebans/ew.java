package litebans;

import java.util.Arrays;
import litebans.dr_0;
import litebans.hl;

public class ew {
    private static /* synthetic */ String[] a;

    private ew() {
    }

    public static void a(Object object) {
        if (object == null) {
            ew.a();
        }
    }

    public static void b(Object object, String string) {
        if (object == null) {
            ew.d(string);
        }
    }

    public static void a() {
        throw (NullPointerException)ew.a(new NullPointerException());
    }

    public static void d(String string) {
        throw (NullPointerException)ew.a(new NullPointerException(string));
    }

    public static void a(String string) {
        throw (dr_0)ew.a(new dr_0(string));
    }

    public static void e(String string) {
        ew.a("lateinit property " + string + " has not been initialized");
    }

    public static void c(Object object, String string) {
        if (object == null) {
            throw (NullPointerException)ew.a(new NullPointerException(string + " must not be null"));
        }
    }

    public static void a(Object object, String string) {
        if (object == null) {
            ew.b(string);
        }
    }

    private static final void b(String string) {
        throw (NullPointerException)ew.a(new NullPointerException(ew.c(string)));
    }

    private static final String c(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        String string2 = ew.class.getName();
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
        return "Parameter specified as non-null is null: method " + string3 + " + " + string4 + ", parameter " + string;
    }

    public static int a(long l3, long l5) {
        return l3 < l5 ? -1 : (l3 == l5 ? 0 : 1);
    }

    public static int a(int n, int n2) {
        return n < n2 ? -1 : (n == n2 ? 0 : 1);
    }

    public static boolean a(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    private static final Throwable a(Throwable throwable) {
        return ew.a(throwable, ew.class.getName());
    }

    static Throwable a(Throwable throwable, String string) {
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

    private static final void b() {
        a = new String[]{"lateinit property ", " has not been initialized", " must not be null", " must not be null", "Method specified as non-null returned null: ", " + ", "Field specified as non-null is null: ", " + ", "Parameter specified as non-null is null: method ", " + ", ", parameter ", "This function has a reified type parameter and thus can only be inlined at compilation time, not called ", "Class ", " is not found. Please update the Kotlin runtime to the latest version", "Class ", " is not found: this code requires the Kotlin runtime of version at least "};
    }

    static {
        ew.b();
    }
}

