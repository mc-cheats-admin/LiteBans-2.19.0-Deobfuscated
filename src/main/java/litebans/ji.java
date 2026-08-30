package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.hl;
import litebans.lq;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class ji {
    private static /* synthetic */ String[] a;

    private ji() {
    }

    public final lq a(@NotNull String string, @NotNull String string2) {
        if (w.v.b(string)) {
            return new lq(string, bz.b((CharSequence)string2) ? "" : "ENGINE=" + string2, " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", " UNSIGNED");
        }
        return new lq(string, "", "", " ");
    }

    public /* synthetic */ ji(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{"", "ENGINE=", " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", " UNSIGNED", "", "", " "};
    }

    static {
        ji.a();
    }
}

