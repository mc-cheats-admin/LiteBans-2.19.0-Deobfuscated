package litebans;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

static class LocaleHandler {
        public static final boolean BaseCoreGenericHandler(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String LiteBansModule_31(char c, @NotNull Locale locale) {
        ObjectUtilities.BaseCoreGenericHandler((Object)locale, "locale");
        String string = String.valueOf(c);
        ObjectUtilities.LiteBansModule_31(string, "");
        return string.toUpperCase(locale);
    }

    public static final String BaseCoreGenericHandler(char c, @NotNull Locale locale) {
        ObjectUtilities.BaseCoreGenericHandler((Object)locale, "locale");
        String string = LiteBansModule_339.LiteBansModule_31(c, locale);
        if (string.length() > 1) {
            String string2;
            if (c == '\u0149') {
                string2 = string;
            } else {
                char c10 = string.charAt(0);
                String string3 = string;
                int n = 1;
                ObjectUtilities.LiteBansModule_31(string3, "");
                string3 = string3.substring(n);
                ObjectUtilities.LiteBansModule_31(string3, "");
                string3 = string3.toLowerCase(Locale.ROOT);
                string2 = c10 + string3;
            }
            return string2;
        }
        String string4 = String.valueOf(c);
        ObjectUtilities.LiteBansModule_31(string4, "");
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)string4.toUpperCase(Locale.ROOT))) {
            return string;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    public static final int BaseCoreGenericHandler(char c, int n) {
        return Character.digit((int)c, n);
    }

    public static final int BaseCoreGenericHandler(int n) {
        if (!(2 <= n ? n < 37 : false)) {
            throw new IllegalArgumentException("radix " + n + " was not InitializerHandler_3 valid range " + new LiteBansModule_167(2, 36));
        }
        return n;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "locale", "", "", "locale", "", "locale", "", "", "", "radix ", " was not InitializerHandler_3 valid range "};
    }

    static {
        LocaleHandler.BaseCoreGenericHandler();
    }
}

