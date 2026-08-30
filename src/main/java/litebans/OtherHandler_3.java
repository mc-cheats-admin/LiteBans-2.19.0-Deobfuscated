package litebans;

static class OtherHandler_3
extends LocaleHandler {
        public static final boolean BaseCoreGenericHandler(char c, char c10, boolean flag) {
        char c11;
        if (c == c10) {
            return true;
        }
        if (!flag) {
            return false;
        }
        char c12 = Character.toUpperCase(c);
        return c12 == (c11 = Character.toUpperCase(c10)) || Character.toLowerCase(c12) == Character.toLowerCase(c11);
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"Char ", " is not BaseCoreGenericHandler decimal digit", "Char ", " is not BaseCoreGenericHandler digit InitializerHandler_3 the given radix=", "Int ", " is not BaseCoreGenericHandler decimal digit", "Invalid radix: ", ". Valid radix values are InitializerHandler_3 range 2..36", "Digit ", " does not represent BaseCoreGenericHandler valid digit InitializerHandler_3 radix ", "other"};
    }

    static {
        OtherHandler_3.LiteBansModule_31();
    }
}

