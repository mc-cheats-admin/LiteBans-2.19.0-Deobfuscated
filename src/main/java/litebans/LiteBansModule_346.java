package litebans;

import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_346 {
    public static final LiteBansModule_346 BaseCoreGenericHandler;
    private static final HashSet AsyncBackgroundTask_5;
    private static final HashSet c;
    private static final HashSet e;
        private LiteBansModule_346() {
    }

    public final String g(@Nullable String string) {
        String string2 = string;
        return string2 == null ? null : LiteBansModule_346.LiteBansModule_195(string2);
    }

    public static final String LiteBansModule_195(@NotNull String string) {
        String string2 = string;
        if (LiteBansModule_346.BaseCoreGenericHandler(string2)) {
            String string3 = LiteBansModule_50.c.e(string2);
            string2 = string3.toLowerCase(Locale.ENGLISH);
        }
        return string2;
    }

    public final UUID GnuSparseMapHandler(@NotNull String string) {
        String string2 = LiteBansModule_346.LiteBansModule_195(string);
        if (LiteBansModule_346.BaseCoreGenericHandler(string2)) {
            return UUID.fromString(string2);
        }
        return null;
    }

    public final boolean c(@Nullable String string) {
        boolean flag;
        if (string == null || ((CharSequence)string).length() == 0) {
            flag = false;
        } else {
            boolean flag2;
            try {
                Double.parseDouble(string);
                flag2 = true;
            }
            catch (NumberFormatException numberFormatException) {
                flag2 = false;
            }
            flag = flag2;
        }
        return flag;
    }

    public final boolean i(@Nullable String string) {
        return string != null && !StringUtilities.BaseCoreGenericHandler((CharSequence)string, '.', false, 2, null) && (StringUtilities.c((CharSequence)string, '.', false, 2, null) && this.e(string) || StringUtilities.c((CharSequence)string, ':', false, 2, null));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(@NotNull String string) {
        if (string.length() > 15) return false;
        CharSequence charSequence = string;
        while (n < charSequence.length()) {
            char c;
            char c10 = c = charSequence.charAt(n);
            if (!AsyncBackgroundTask_5.contains(Character.valueOf(c10))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    public final boolean AsyncBackgroundTask_5(@Nullable String string) {
        boolean flag;
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            flag = false;
        } else {
            boolean flag2;
            try {
                Long.parseLong(string);
                flag2 = true;
            }
            catch (NumberFormatException numberFormatException) {
                flag2 = false;
            }
            flag = flag2;
        }
        return flag;
    }

    public final boolean LiteBansModule_31(@Nullable String string) {
        return this.AsyncBackgroundTask_5(string) || this.LiteBansModule_241(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean LiteBansModule_241(@Nullable String string) {
        boolean flag;
        char c;
        char c10;
        int n;
        boolean flag2;
        CharSequence charSequence;
        if (string == null) return false;
        if (string.length() < 6) return false;
        if (string.length() > 21) return false;
        if (string.length() % 3 != 0) {
            block6: {
                charSequence = string;
                flag2 = false;
                n = 0;
                while (n < charSequence.length()) {
                    c = c10 = charSequence.charAt(n);
                    flag = false;
                    if (!e.contains(Character.valueOf(c))) {
                        ++n;
                        continue;
                    }
                    break block6;
                }
                return false;
            }
            if (flag3) {
                return false;
            }
        }
        charSequence = string;
        flag2 = false;
        n = 0;
        while (n < charSequence.length()) {
            c = c10 = charSequence.charAt(n);
            flag = false;
            if (!LiteBansModule_346.c.contains(Character.valueOf(c))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean BaseCoreGenericHandler(@Nullable String string) {
        String string2 = string;
        if (string2 == null) return false;
        int n = string2.length();
        if (n != 36) {
            if (n != 32) return false;
        }
        CharSequence charSequence = string;
        while (n2 < charSequence.length()) {
            char c;
            char c10 = c = charSequence.charAt(n2);
            if (!Character.isLetterOrDigit(c10)) {
                if (c10 != '-') return false;
            }
            if (!flag3) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public final NameHandler_3 Utf8Handler_2(@NotNull String string) {
        String string2 = string;
        byte by2 = 0;
        if (this.i(string2)) {
            by2 = 2;
            String string3 = string2;
            string2 = string3.toLowerCase(Locale.ENGLISH);
        } else if (LiteBansModule_346.BaseCoreGenericHandler(string2)) {
            string2 = LiteBansModule_346.LiteBansModule_195(string2);
            by2 = 1;
        }
        return new NameHandler_3(by2, string2);
    }

    static {
        LiteBansModule_346.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_346();
        AsyncBackgroundTask_5 = ArrayUtilities.LiteBansModule_31("0123456789.*%_".toCharArray());
        c = ArrayUtilities.LiteBansModule_31("0123456789ABCDEFMVZabcdefmvz".toCharArray());
        e = ArrayUtilities.LiteBansModule_31("MVZmvz".toCharArray());
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"0123456789.*%_", "0123456789ABCDEFMVZabcdefmvz", "MVZmvz"};
    }
}

