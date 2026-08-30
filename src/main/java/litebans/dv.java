package litebans;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import litebans.w;

public final class dv
implements RejectedExecutionHandler {
    final /* synthetic */ w a;

    public dv(w w2) {
        this.a = w2;
    }

    @Override
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown()) {
            try {
                if (this.a.a.u()) {
                    this.a.a.a(runnable);
                } else {
                    runnable.run();
                }
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }
}

