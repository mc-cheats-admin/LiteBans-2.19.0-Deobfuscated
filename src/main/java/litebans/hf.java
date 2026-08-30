package litebans;

import litebans.aJ;
import litebans.di_0;
import litebans.ew;
import litebans.g2;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class hf {
    private static /* synthetic */ String[] a;

    private hf() {
    }

    public final boolean c() {
        return g2.a();
    }

    public final void a(boolean bl) {
        g2.a(bl);
    }

    public final di_0 a() {
        di_0 di_02 = g2.c;
        if (di_02 != null) {
            return di_02;
        }
        ew.e(a[0]);
        return null;
    }

    public final void a(@NotNull di_0 di_02) {
        g2.c = di_02;
    }

    public /* synthetic */ hf(aJ aJ2) {
        this();
    }

    private static final void b() {
        a = new String[]{hl.a("", -60353703)};
    }

    static {
        hf.b();
    }
}

