package litebans;

import java.sql.SQLTransientException;
import java.util.concurrent.Semaphore;
import litebans.ct;

public class cs_0 {
    public static final cs_0 b;
    private static final int c;
    private final Semaphore a;

    public cs_0() {
        this(true);
    }

    private cs_0(boolean bl) {
        this.a = bl ? new Semaphore(10000, true) : null;
    }

    public void a() {
        if (this.a.tryAcquire()) {
            return;
        }
        if (Boolean.getBoolean("com.zaxxer.hikari.throwIfSuspended")) {
            throw new SQLTransientException("The pool is currently suspended and configured to throw exceptions upon acquisition");
        }
        this.a.acquireUninterruptibly();
    }

    public void d() {
        this.a.release();
    }

    public void b() {
        this.a.acquireUninterruptibly(10000);
    }

    public void c() {
        this.a.release(10000);
    }

    /* synthetic */ cs_0(boolean bl, ct ct2) {
        this(bl);
    }

    static {
        c = 10000;
        b = new ct(false);
    }
}

