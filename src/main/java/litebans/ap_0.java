package litebans;

import litebans.ar_0;
import litebans.eI;
import litebans.ed;
import litebans.hl;

static class ap_0
extends ar_0 {
    private static /* synthetic */ String[] b;

    public static final ed a(int n, int n2) {
        return ed.a.a(n, n2, -1);
    }

    public static final eI b(int n, int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return eI.h.a();
        }
        return new eI(n, n2 - 1);
    }

    public static final int c(int n, int n2) {
        return n < n2 ? n2 : n;
    }

    public static final int d(int n, int n2) {
        return n > n2 ? n2 : n;
    }

    public static final int a(int n, int n2, int n3) {
        if (n2 > n3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + n3 + " is less than minimum " + n2 + '.');
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }

    private static final void b() {
        b = new String[]{"<this>", "Progression ", " is ", "<this>", "Progression ", " is ", "<this>", "Progression ", " is ", "<this>", "<this>", "<this>", "<this>", "Progression ", " is ", "<this>", "Progression ", " is ", "<this>", "Progression ", " is ", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "random", "<this>", "random", "<this>", "random", "<this>", "<this>", "<this>", "<this>", "random", "<this>", "random", "<this>", "random", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "minimumValue", "<this>", "maximumValue", "<this>", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "<this>", "range", "Cannot coerce value to an empty range: ", "<this>", "range", "Cannot coerce value to an empty range: ", "range", "Cannot coerce value to an empty range: ", "range", "Cannot coerce value to an empty range: "};
    }

    static {
        ap_0.b();
    }
}

