package litebans;

import java.util.Iterator;
import litebans.cQ;
import litebans.ew;
import litebans.hl;
import litebans.i_;
import litebans.j_;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.ee
 */
static final class ee_0
implements i_ {
    private final CharSequence e;
    private final int d;
    private final int a;
    private final cQ b;
    private static /* synthetic */ String[] c;

    public ee_0(@NotNull CharSequence charSequence, int n, int n2, @NotNull cQ cQ2) {
        ew.a((Object)charSequence, c[0]);
        ew.a((Object)cQ2, c[1]);
        this.e = charSequence;
        this.d = n;
        this.a = n2;
        this.b = cQ2;
    }

    @Override
    public Iterator a() {
        return new j_(this);
    }

    public static final /* synthetic */ int a(ee_0 ee_02) {
        return ee_02.d;
    }

    public static final /* synthetic */ CharSequence c(ee_0 ee_02) {
        return ee_02.e;
    }

    public static final /* synthetic */ int d(ee_0 ee_02) {
        return ee_02.a;
    }

    public static final /* synthetic */ cQ b(ee_0 ee_02) {
        return ee_02.b;
    }

    private static final void a() {
        c = new String[]{hl.a("\u14cd\u14ca\u14d4\u14d1\u14d0", -105835356), hl.a("\ueb7b\ueb79\ueb68\ueb52\ueb79\ueb64\ueb68\ueb51\ueb7d\ueb68\ueb7f\ueb74", 566225692)};
    }

    static {
        ee_0.a();
    }
}

