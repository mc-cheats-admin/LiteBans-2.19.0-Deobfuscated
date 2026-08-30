package litebans;

import litebans.ed;
import litebans.gw_0;
import litebans.hl;
import litebans.ib_0;
import litebans.kj_0;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class eI
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
        return this.c() + g[1] + this.b();
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
        g = new String[]{hl.a("\ucb8c\ucbae\ucba1\ucba1\ucba0\ucbbb\ucbef\ucbbd\ucbaa\ucbbb\ucbba\ucbbd\ucba1\ucbef\ucbbb\ucba7\ucbaa\ucbef\ucbaa\ucbb7\ucbac\ucba3\ucbba\ucbbc\ucba6\ucbb9\ucbaa\ucbef\ucbba\ucbbf\ucbbf\ucbaa\ucbbd\ucbef\ucbad\ucba0\ucbba\ucba1\ucbab\ucbef\ucba0\ucba9\ucbef\ucbae\ucbef\ucbbd\ucbae\ucba1\ucba8\ucbaa\ucbef\ucbbb\ucba7\ucbae\ucbbb\ucbef\ucba6\ucba1\ucbac\ucba3\ucbba\ucbab\ucbaa\ucbbc\ucbef\ucb82\ucb8e\ucb97\ucb90\ucb99\ucb8e\ucb83\ucb9a\ucb8a\ucbe1", -444609585), hl.a("\u13e9\u13e9", -773581881)};
    }
}

