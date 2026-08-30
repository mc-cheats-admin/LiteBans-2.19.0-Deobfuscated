package litebans;

import litebans.aJ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.dV
 */
public static final class dv_0
extends Error {
    private static /* synthetic */ String[] a;

    public dv_0(@NotNull String string) {
        ew.a((Object)string, a[0]);
        super(string);
    }

    public /* synthetic */ dv_0(String string, int n, aJ aJ2) {
        if ((n & 1) != 0) {
            string = a[1];
        }
        this(string);
    }

    public dv_0() {
        this(null, 1, null);
    }

    private static final void a() {
        a = new String[]{hl.a("\u9ed1\u9ed9\u9ecf\u9ecf\u9edd\u9edb\u9ed9", 1680318140), hl.a("\u661a\u6635\u667b\u6634\u662b\u663e\u6629\u663a\u662f\u6632\u6634\u6635\u667b\u6632\u6628\u667b\u6635\u6634\u662f\u667b\u6632\u6636\u662b\u6637\u663e\u6636\u663e\u6635\u662f\u663e\u663f\u6675", 2107991643)};
    }

    static {
        dv_0.a();
    }
}

