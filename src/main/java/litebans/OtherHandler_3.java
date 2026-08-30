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

    }

