package litebans;

import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import litebans.bK;
import litebans.bz;
import litebans.hl;
import litebans.jp_0;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jj_0 {
    public static final jj_0 a;
    private static final HashSet d;
    private static final HashSet c;
    private static final HashSet e;
    private static /* synthetic */ String[] b;

    private jj_0() {
    }

    public final String g(@Nullable String string) {
        String string2 = string;
        return string2 == null ? null : jj_0.f(string2);
    }

    public static final String f(@NotNull String string) {
        String string2 = string;
        if (jj_0.a(string2)) {
            String string3 = bK.c.e(string2);
            string2 = string3.toLowerCase(Locale.ENGLISH);
        }
        return string2;
    }

    public final UUID j(@NotNull String string) {
        String string2 = jj_0.f(string);
        if (jj_0.a(string2)) {
            return UUID.fromString(string2);
        }
        return null;
    }

    public final boolean c(@Nullable String string) {
        boolean bl;
        if (string == null || ((CharSequence)string).length() == 0) {
            bl = false;
        } else {
            boolean bl2;
            try {
                Double.parseDouble(string);
                bl2 = true;
            }
            catch (NumberFormatException numberFormatException) {
                bl2 = false;
            }
            bl = bl2;
        }
        return bl;
    }

    public final boolean i(@Nullable String string) {
        return string != null && !bz.a((CharSequence)string, '.', false, 2, null) && (bz.c((CharSequence)string, '.', false, 2, null) && this.e(string) || bz.c((CharSequence)string, ':', false, 2, null));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(@NotNull String string) {
        if (string.length() > 15) return false;
        CharSequence charSequence = string;
        boolean bl = false;
        int n = 0;
        while (n < charSequence.length()) {
            char c;
            char c10 = c = charSequence.charAt(n);
            boolean bl2 = false;
            if (!d.contains(Character.valueOf(c10))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    public final boolean d(@Nullable String string) {
        boolean bl;
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            bl = false;
        } else {
            boolean bl2;
            try {
                Long.parseLong(string);
                bl2 = true;
            }
            catch (NumberFormatException numberFormatException) {
                bl2 = false;
            }
            bl = bl2;
        }
        return bl;
    }

    public final boolean b(@Nullable String string) {
        return this.d(string) || this.h(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean h(@Nullable String string) {
        boolean bl;
        char c;
        char c10;
        int n;
        boolean bl2;
        CharSequence charSequence;
        if (string == null) return false;
        if (string.length() < 6) return false;
        if (string.length() > 21) return false;
        if (string.length() % 3 != 0) {
            block6: {
                charSequence = string;
                bl2 = false;
                n = 0;
                while (n < charSequence.length()) {
                    c = c10 = charSequence.charAt(n);
                    bl = false;
                    if (!e.contains(Character.valueOf(c))) {
                        ++n;
                        continue;
                    }
                    break block6;
                }
                return false;
            }
            boolean bl3 = false;
            if (bl3) {
                return false;
            }
        }
        charSequence = string;
        bl2 = false;
        n = 0;
        while (n < charSequence.length()) {
            c = c10 = charSequence.charAt(n);
            bl = false;
            if (!jj_0.c.contains(Character.valueOf(c))) {
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
    public static final boolean a(@Nullable String string) {
        String string2 = string;
        if (string2 == null) return false;
        int n = string2.length();
        if (n != 36) {
            if (n != 32) return false;
        }
        CharSequence charSequence = string;
        boolean bl = false;
        int n2 = 0;
        while (n2 < charSequence.length()) {
            char c;
            char c10 = c = charSequence.charAt(n2);
            boolean bl2 = false;
            if (!Character.isLetterOrDigit(c10)) {
                if (c10 != '-') return false;
            }
            boolean bl3 = true;
            if (!bl3) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public final jp_0 k(@NotNull String string) {
        String string2 = string;
        byte by2 = 0;
        if (this.i(string2)) {
            by2 = 2;
            String string3 = string2;
            string2 = string3.toLowerCase(Locale.ENGLISH);
        } else if (jj_0.a(string2)) {
            string2 = jj_0.f(string2);
            by2 = 1;
        }
        return new jp_0(by2, string2);
    }

    static {
        jj_0.a();
        a = new jj_0();
        d = lo_0.b("0123456789.*%_".toCharArray());
        c = lo_0.b("0123456789ABCDEFMVZabcdefmvz".toCharArray());
        e = lo_0.b("MVZmvz".toCharArray());
    }

    private static final void a() {
        b = new String[]{"0123456789.*%_", "0123456789ABCDEFMVZabcdefmvz", "MVZmvz"};
    }
}

