package litebans;

import litebans.dr;
import litebans.kJ;

static final class dl
implements Runnable {
    private final kJ a;
    final /* synthetic */ dr b;

    dl(dr dr2, kJ kJ2) {
        this.b = dr2;
        this.a = kJ2;
    }

    @Override
    public void run() {
        if (dr.a(this.b, this.a, "(connection has passed maxLifetime)", false)) {
            this.b.a(dr.a(this.b).c());
        }
    }
}

