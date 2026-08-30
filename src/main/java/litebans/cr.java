package litebans;

import java.util.List;
import litebans.dr;
import litebans.e6;
import litebans.j9;
import litebans.kJ;

static final class cr
implements Runnable {
    private volatile long a;
    final /* synthetic */ dr b;

    private cr(dr dr2) {
        this.b = dr2;
        this.a = e6.a(e6.b(), -dr.e(this.b));
    }

    @Override
    public void run() {
        try {
            this.b.s = this.b.t.c();
            this.b.f = this.b.t.h();
            dr.f(this.b).a(this.b.t.g());
            this.b.c = this.b.t.d() != null && !this.b.t.d().equals(this.b.c) ? this.b.t.d() : this.b.c;
            long l3 = this.b.t.a();
            long l5 = e6.b();
            if (e6.a(l5, 128L) < e6.a(this.a, dr.e(this.b))) {
                dr.b(this.b).c("%s - Retrograde clock change detected (housekeeper delta=%s), soft-evicting connections from ", new Object[]{this.b.e, e6.e(this.a, l5)});
                this.a = l5;
                this.b.a();
                return;
            }
            this.a = l5;
            String string = "Pool ";
            if (l3 > 0L && this.b.t.i() < this.b.t.f()) {
                this.b.a(new String[]{"Before cleanup "});
                string = "After cleanup  ";
                List list = dr.a(this.b).b(0);
                int n = list.size() - this.b.t.i();
                for (kJ kJ2 : list) {
                    if (n <= 0 || e6.g(kJ2.e, l5) <= l3 || !dr.a(this.b).a(kJ2)) continue;
                    this.b.a(kJ2, "(connection has passed idleTimeout)");
                    --n;
                }
            }
            this.b.a(new String[]{string});
            dr.c(this.b);
        }
        catch (Exception exception) {
            dr.b(this.b).a("Unexpected exception in housekeeping task", new Object[]{exception});
        }
    }

    /* synthetic */ cr(dr dr2, j9 j92) {
        this(dr2);
    }
}

