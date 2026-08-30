package litebans;

import litebans.dy_0;
import litebans.jv_0;

public final class cb_0
implements Runnable {
    final /* synthetic */ jv_0 a;
    final /* synthetic */ dy_0 b;

    public cb_0(jv_0 jv_02, dy_0 dy_02) {
        this.a = jv_02;
        this.b = dy_02;
    }

    @Override
    public final void run() {
        this.a.c(this.b.a.toString());
    }
}

