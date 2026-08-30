package litebans;

import java.util.Locale;
import litebans.as_0;
import litebans.b_;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class bu_0
extends b_ {
    private static /* synthetic */ String[] i;

    public static final boolean a(@Nullable String string, @Nullable String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        return !bl ? string.equals(string2) : string.equalsIgnoreCase(string2);
    }

    public static final String a(@NotNull String string, char c, char c10, boolean bl) {
        StringBuilder stringBuilder;
        ew.a((Object)string, "<this>");
        if (!bl) {
            return string.replace(c, c10);
        }
        int n = string.length();
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n);
        boolean bl2 = false;
        CharSequence charSequence = string;
        boolean bl3 = false;
        for (int i = 0; i < charSequence.length(); ++i) {
            char c11;
            char c12 = c11 = charSequence.charAt(i);
            boolean bl4 = false;
            stringBuilder2.append(jc_0.a(c12, c, bl) ? c10 : c12);
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ String a(String string, char c, char c10, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return bz.a(string, c, c10, bl);
    }

    public static final String a(@NotNull String string, @NotNull String string2, @NotNull String string3, boolean bl) {
        ew.a((Object)string, "<this>");
        ew.a((Object)string2, "oldValue");
        ew.a((Object)string3, "newValue");
        String string4 = string;
        boolean bl2 = false;
        int n = bz.b((CharSequence)string4, string2, 0, bl);
        if (n < 0) {
            return string4;
        }
        int n2 = string2.length();
        int n3 = as_0.c(n2, 1);
        int n4 = string4.length() - n2 + string3.length();
        if (n4 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder = new StringBuilder(n4);
        int n5 = 0;
        do {
            stringBuilder.append(string4, n5, n).append(string3);
            n5 = n + n2;
        } while (n < string4.length() && (n = bz.b((CharSequence)string4, string2, n + n3, bl)) > 0);
        return stringBuilder.append(string4, n5, string4.length()).toString();
    }

    public static /* synthetic */ String a(String string, String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return bz.a(string, string2, string3, bl);
    }

    public static final boolean c(@NotNull String string, @NotNull String string2, boolean bl) {
        ew.a((Object)string, "<this>");
        ew.a((Object)string2, "prefix");
        if (!bl) {
            return string.startsWith(string2);
        }
        return bz.a(string, 0, string2, 0, string2.length(), bl);
    }

    public static /* synthetic */ boolean b(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return bz.c(string, string2, bl);
    }

    public static final boolean b(@NotNull String string, @NotNull String string2, boolean bl) {
        ew.a((Object)string, "<this>");
        ew.a((Object)string2, "suffix");
        if (!bl) {
            return string.endsWith(string2);
        }
        return bz.a(string, string.length() - string2.length(), string2, 0, string2.length(), true);
    }

    public static /* synthetic */ boolean a(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return bz.b(string, string2, bl);
    }

    public static final boolean a(@NotNull String string, int n, @NotNull String string2, int n2, int n3, boolean bl) {
        ew.a((Object)string, "<this>");
        ew.a((Object)string2, "other");
        return !bl ? string.regionMatches(n, string2, n2, n3) : string.regionMatches(bl, n, string2, n2, n3);
    }

    public static final String a(@NotNull String string, @NotNull Locale locale) {
        char c;
        ew.a((Object)string, "<this>");
        ew.a((Object)locale, "locale");
        if (((CharSequence)string).length() > 0 && Character.isLowerCase(c = string.charAt(0))) {
            int n;
            String string2;
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3 = stringBuilder2 = new StringBuilder();
            boolean bl = false;
            char c10 = Character.toTitleCase(c);
            if (c10 != Character.toUpperCase(c)) {
                stringBuilder = stringBuilder3.append(c10);
            } else {
                string2 = string;
                n = 0;
                int n2 = 1;
                string2 = string2.substring(n, n2);
                ew.b(string2, "");
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
        bu_0.i();
    }
}

