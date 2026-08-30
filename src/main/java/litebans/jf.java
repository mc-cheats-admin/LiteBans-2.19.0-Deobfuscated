package litebans;

import litebans.dr;
import litebans.kJ;

static final class jf
implements Runnable {
    private final kJ a;
    final /* synthetic */ dr b;

    jf(dr dr2, kJ kJ2) {
        this.b = dr2;
        this.a = kJ2;
    }

    @Override
    public void run() {
        if (dr.a(this.b).a(this.a)) {
            if (!this.b.d(this.a.g)) {
                dr.a(this.b, this.a, "(connection is dead)", true);
                this.b.a(dr.a(this.b).c());
            } else {
                dr.a(this.b).b(this.a);
                dr.b(this.b).b("%s - keepalive: connection %s is alive", new Object[]{this.b.e, this.a.g.toString()});
            }
        }
    }
}

