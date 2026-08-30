package litebans;

import litebans.ed;
import litebans.gw_0;
import litebans.hl;
import litebans.ib_0;
import litebans.kj_0;
import org.jetbrains.annotations.Nullable;

public final class eI
extends ed
implements kj_0,
gw_0 {
    public static final ib_0 h;
    private static final eI f;
    private static /* synthetic */ String[] g;

    public eI(int n, int n2) {
        super(n, n2, 1);
    }

    public Integer b() {
        return this.c();
    }

    public Integer c() {
        return this.b();
    }

    @Override
    public boolean a() {
        return this.c() > this.b();
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof eI && (this.a() && ((eI)object).a() || this.c() == ((eI)object).c() && this.b() == ((eI)object).b());
    }

    @Override
    public int hashCode() {
        return this.a() ? -1 : 31 * this.c() + this.b();
    }

    @Override
    public String toString() {
        return this.c() + ". + " + this.b();
    }

    public static final /* synthetic */ eI d() {
        return f;
    }

    static {
        eI.a();
        h = new ib_0(null);
        f = new eI(1, 0);
    }

    private static final void a() {
        g = new String[]{"Cannot return the exclusive upper bound of a range that includes ", ".."};
    }
}

