package litebans;

import java.util.Locale;
import litebans.eI;
import litebans.ew;
import litebans.hl;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.js
 */
static class js_0 {
    private static /* synthetic */ String[] a;

    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String b(char c, @NotNull Locale locale) {
        ew.a((Object)locale, a[1]);
        String string = String.valueOf(c);
        ew.b(string, a[2]);
        return string.toUpperCase(locale);
    }

    public static final String a(char c, @NotNull Locale locale) {
        ew.a((Object)locale, a[6]);
        String string = jc_0.b(c, locale);
        if (string.length() > 1) {
            String string2;
            if (c == '\u0149') {
                string2 = string;
            } else {
                char c10 = string.charAt(0);
                String string3 = string;
                int n = 1;
                ew.b(string3, a[7]);
                string3 = string3.substring(n);
                ew.b(string3, a[8]);
                string3 = string3.toLowerCase(Locale.ROOT);
                string2 = c10 + string3;
            }
            return string2;
        }
        String string4 = String.valueOf(c);
        ew.b(string4, a[9]);
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
            throw new IllegalArgumentException(a[10] + n + a[11] + new eI(2, 36));
        }
        return n;
    }

    private static final void a() {
        a = new String[]{hl.a("", 1359982500), hl.a("\u0b9e\u0b9d\u0b91\u0b93\u0b9e\u0b97", -1279915022), hl.a("", 1392888094), hl.a("", 2017805222), hl.a("\u8706\u8705\u8709\u870b\u8706\u870f", -1306163350), hl.a("", -931848674), hl.a("\u03a1\u03a2\u03ae\u03ac\u03a1\u03a8", 294388685), hl.a("", 141894091), hl.a("", -1389105477), hl.a("", -1924487919), hl.a("\u58db\u58c8\u58cd\u58c0\u58d1\u5889", -357148503), hl.a("\u2f52\u2f05\u2f13\u2f01\u2f52\u2f1c\u2f1d\u2f06\u2f52\u2f1b\u2f1c\u2f52\u2f04\u2f13\u2f1e\u2f1b\u2f16\u2f52\u2f00\u2f13\u2f1c\u2f15\u2f17\u2f52", -2126499982)};
    }

    static {
        js_0.a();
    }
}

