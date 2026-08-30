package litebans;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import litebans.dO;
import litebans.dr;
import litebans.kJ;

static final class db
implements Callable {
    private final String b;
    final /* synthetic */ dr a;

    db(dr dr2, String string) {
        this.a = dr2;
        this.b = string;
    }

    public Boolean a() {
        long l3 = 250L;
        while (this.a.P == 0 && this.b()) {
            kJ kJ2 = dr.d(this.a);
            if (kJ2 != null) {
                dr.a(this.a).c(kJ2);
                dr.b(this.a).b("%s - Added connection %s", new Object[]{this.a.e, kJ2.g.toString()});
                if (this.b != null) {
                    this.a.a(new String[]{this.b});
                }
                return Boolean.TRUE;
            }
            if (this.b != null) {
                dr.b(this.a).b("%s - Connection add failed, sleeping with backoff: %dms", new Object[]{this.a.e, l3});
            }
            dO.a(l3);
            l3 = Math.min(TimeUnit.SECONDS.toMillis(10L), Math.min(this.a.s, (long)((double)l3 * 1.5)));
        }
        return Boolean.FALSE;
    }

    private final synchronized boolean b() {
        return this.a.f() < this.a.t.f() && (dr.a(this.a).c() > 0 || this.a.b() < this.a.t.i());
    }

    public Object call() {
        return this.a();
    }
}

