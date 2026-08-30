package litebans;

import java.util.Locale;
import litebans.eI;
import litebans.ew;
import litebans.hl;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

static class js_0 {
    private static /* synthetic */ String[] a;

    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String b(char c, @NotNull Locale locale) {
        ew.a((Object)locale, "locale");
        String string = String.valueOf(c);
        ew.b(string, "");
        return string.toUpperCase(locale);
    }

    public static final String a(char c, @NotNull Locale locale) {
        ew.a((Object)locale, "locale");
        String string = jc_0.b(c, locale);
        if (string.length() > 1) {
            String string2;
            if (c == '\u0149') {
                string2 = string;
            } else {
                char c10 = string.charAt(0);
                String string3 = string;
                int n = 1;
                ew.b(string3, "");
                string3 = string3.substring(n);
                ew.b(string3, "");
                string3 = string3.toLowerCase(Locale.ROOT);
                string2 = c10 + string3;
            }
            return string2;
        }
        String string4 = String.valueOf(c);
        ew.b(string4, "");
        if (!ew.a((Object)string, (Object)string4.toUpperCase(Locale.ROOT))) {
            return string;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    public static final int a(char c, int n) {
        return Character.digit((int)c, n);
    }

    public static final int a(int n) {
        if (!(2 <= n ? n < 37 : false)) {
            throw new IllegalArgumentException("radix " + n + " was not in valid range " + new eI(2, 36));
        }
        return n;
    }

    private static final void a() {
        a = new String[]{"", "locale", "", "", "locale", "", "locale", "", "", "", "radix ", " was not in valid range "};
    }

    static {
        js_0.a();
    }
}

