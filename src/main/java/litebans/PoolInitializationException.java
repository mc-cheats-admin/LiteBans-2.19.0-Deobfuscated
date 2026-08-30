package litebans;

import java.sql.SQLTransientException;
import java.util.concurrent.Semaphore;
public class PoolInitializationException {
    public static final PoolInitializationException LiteBansModule_31;
    private static final int c;
    private final Semaphore BaseCoreGenericHandler;

    public PoolInitializationException() {
        this(true);
    }

    private PoolInitializationException(boolean flag) {
        this.plugin = flag ? new Semaphore(10000, true) : null;
    }

    public void BaseCoreGenericHandler() {
        if (this.plugin.tryAcquire()) {
            return;
        }
        if (Boolean.getBoolean("com.zaxxer.hikari.throwIfSuspended")) {
            throw new SQLTransientException("The pool is currently suspended and configured to throw exceptions upon acquisition");
        }
        this.plugin.acquireUninterruptibly();
    }

    public void AsyncBackgroundTask_5() {
        this.plugin.release();
    }

    public void LiteBansModule_31() {
        this.plugin.acquireUninterruptibly(10000);
    }

    public void c() {
        this.plugin.release(10000);
    }

    /* synthetic */ PoolInitializationException(boolean flag, LiteBansModule_101 ct2) {
        this(flag);
    }

    static {
        c = 10000;
        LiteBansModule_31 = new LiteBansModule_101(false);
    }
}

