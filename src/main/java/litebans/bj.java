package litebans;

import litebans.fa_0;
import litebans.fg_0;
import litebans.u;

public static final class bj
implements Runnable {
    final /* synthetic */ fg_0 b;
    final /* synthetic */ fa_0 a;

    public bj(fg_0 fg_02, fa_0 fa_02) {
        this.b = fg_02;
        this.a = fa_02;
    }

    @Override
    public final void run() {
        u u2 = (u)this.b.h().a(u.class);
        u2.b(this.a);
    }
}

