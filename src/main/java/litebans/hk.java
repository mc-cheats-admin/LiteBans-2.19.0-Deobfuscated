package litebans;

import litebans.dy_0;
import litebans.eo_0;
import litebans.gZ;
import litebans.hc;
import litebans.hl;
import litebans.jJ;
import litebans.jR;

public final class hk
extends hc {
    final /* synthetic */ dy_0 n;
    private static /* synthetic */ String[] m;

    hk(gZ gZ2, boolean bl, int n, dy_0 dy_02, String string, jR jR2, jJ jJ2) {
        this.n = dy_02;
        super(gZ2, string, jR2, bl, jJ2, "time", false, n, null, 320, null);
    }

    @Override
    public void e() {
        this.a(gZ.l.a(this.a(), (eo_0)this.n.a));
    }

    private static final void a() {
        m = new String[]{"time"};
    }

    static {
        hk.a();
    }
}

