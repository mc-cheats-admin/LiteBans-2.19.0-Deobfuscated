package litebans;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class OldvalueHandler
extends InputHandler {
        public static final boolean BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, boolean flag) {
        if (string == null) {
            return string2 == null;
        }
        return !flag ? string.equals(string2) : string.equalsIgnoreCase(string2);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, char c, char c10, boolean flag) {
        StringBuilder stringBuilder;
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        if (!flag) {
            return string.replace(c, c10);
        }
        int n = string.length();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n);
        CharSequence charSequence = string;
        for (int i = 0; i < charSequence.length(); ++i) {
            char c11;
            char c12 = c11 = charSequence.charAt(i);
            stringBuilder2.append(LiteBansModule_339.BaseCoreGenericHandler(c12, c, flag) ? c10 : c12);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(String string, char c, char c10, boolean flag, int n, Object targetObj) {
        if ((n & 4) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(string, c, c10, flag);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, @NotNull String string2, @NotNull String string3, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string2, "oldValue");
        ObjectUtilities.BaseCoreGenericHandler((Object)string3, "newValue");
        String string4 = string;
        int n = StringUtilities.LiteBansModule_31((CharSequence)string4, string2, 0, flag);
        if (n < 0) {
            return string4;
        }
        int n2 = string2.length();
        int n3 = LiteBansModule_20.c(n2, 1);
        int n4 = string4.length() - n2 + string3.length();
        if (n4 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder = new StringBuilder(n4);
        do {
            stringBuilder.append(string4, n5, n).append(string3);
            n5 = n + n2;
        } while (n < string4.length() && (n = StringUtilities.LiteBansModule_31((CharSequence)string4, string2, n + n3, flag)) > 0);
        return stringBuilder.append(string4, n5, string4.length()).toString();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(String string, String string2, String string3, boolean flag, int n, Object targetObj) {
        if ((n & 4) != 0) {
            flag = false;
        }
        return StringUtilities.BaseCoreGenericHandler(string, string2, string3, flag);
    }

    public static final boolean c(@NotNull String string, @NotNull String string2, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string2, "prefix");
        if (!flag) {
            return string.startsWith(string2);
        }
        return StringUtilities.BaseCoreGenericHandler(string, 0, string2, 0, string2.length(), flag);
    }

    public static /* synthetic */ boolean LiteBansModule_31(String string, String string2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.c(string, string2, flag);
    }

    public static final boolean LiteBansModule_31(@NotNull String string, @NotNull String string2, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string2, "suffix");
        if (!flag) {
            return string.endsWith(string2);
        }
        return StringUtilities.BaseCoreGenericHandler(string, string.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(String string, String string2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        return StringUtilities.LiteBansModule_31(string, string2, flag);
    }

    public static final boolean BaseCoreGenericHandler(@NotNull String string, int n, @NotNull String string2, int n2, int n3, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)string2, "other");
        return !flag ? string.regionMatches(n, string2, n2, n3) : string.regionMatches(flag, n, string2, n2, n3);
    }

    public static final String BaseCoreGenericHandler(@NotNull String string, @NotNull Locale locale) {
        char c;
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)locale, "locale");
        if (((CharSequence)string).length() > 0 && Character.isLowerCase(c = string.charAt(0))) {
            int n;
            String string2;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3 = stringBuilder2 = new StringBuilder();
            char c10 = Character.toTitleCase(c);
            if (c10 != Character.toUpperCase(c)) {
                stringBuilder = stringBuilder3.append(c10);
            } else {
                string2 = string;
                n = 0;
                int n2 = 1;
                string2 = string2.substring(n, n2);
                ObjectUtilities.LiteBansModule_31(string2, "");
                stringBuilder = stringBuilder3.append(string2.toUpperCase(locale));
            }
            string2 = string;
            n = 1;
            stringBuilder3.append(string2.substring(n));
            return stringBuilder2.toString();
        }
        return string;
    }

    private static final void i() {
        i = new String[]{"<this>", "<this>", "str", "<this>", "<this>", "str", "<this>", "<this>", "oldValue", "newValue", "<this>", "<this>", "oldValue", "newValue", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "", "<this>", "<this>", "destination", "<this>", "destination", "<this>", "args", "<this>", "format", "args", "<this>", "args", "<this>", "format", "args", "<this>", "regex", "<this>", "<this>", "<this>", "prefix", "<this>", "prefix", "<this>", "suffix", "bytes", "charset", "bytes", "charset", "bytes", "bytes", "chars", "chars", "codePoints", "stringBuffer", "stringBuilder", "<this>", "<this>", "<this>", "<this>", "other", "<this>", "charSequence", "<this>", "stringBuilder", "<this>", "<this>", "<this>", "other", "<this>", "other", "<this>", "locale", "<this>", "locale", "<this>", "locale", "<this>", "locale", "<this>", "charset", "<this>", "charset", "<this>", "<this>", "<this>", "<this>", "locale", "", "<this>", "", "<this>", "locale", "", "<this>", "Count 'n' must be non-negative, but was ", "", "", "<this>"};
    }

    static {
        OldvalueHandler.i();
    }
}

