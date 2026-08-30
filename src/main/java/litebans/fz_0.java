package litebans;

import litebans.aJ;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.fz
 */
public static final class fz_0
extends RuntimeException {
    private static /* synthetic */ String[] a;

    public fz_0(@NotNull String string) {
        super(string);
    }

    public /* synthetic */ fz_0(String string, int n, aJ aJ2) {
        if ((n & 1) != 0) {
            string = a[0];
        }
        this(string);
    }

    public fz_0() {
        this(null, 1, null);
    }

    private static final void a() {
        a = new String[]{hl.a("", -282164671)};
    }

    static {
        fz_0.a();
    }
}

