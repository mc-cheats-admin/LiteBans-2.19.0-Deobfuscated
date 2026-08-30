package litebans;

import litebans.hl;
import litebans.js_0;

static class jn_0
extends js_0 {
    private static /* synthetic */ String[] b;

    public static final boolean a(char c, char c10, boolean bl) {
        char c11;
        if (c == c10) {
            return true;
        }
        if (!bl) {
            return false;
        }
        char c12 = Character.toUpperCase(c);
        return c12 == (c11 = Character.toUpperCase(c10)) || Character.toLowerCase(c12) == Character.toLowerCase(c11);
    }

    private static final void b() {
        b = new String[]{"Char ", " is not a decimal digit", "Char ", " is not a digit in the given radix=", "Int ", " is not a decimal digit", "Invalid radix: ", ". Valid radix values are in range 2..36", "Digit ", " does not represent a valid digit in radix ", "other"};
    }

    static {
        jn_0.b();
    }
}

