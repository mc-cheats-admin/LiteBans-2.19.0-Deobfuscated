package litebans;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
public final class LiteBansModule_140
implements RejectedExecutionHandler {
    final /* synthetic */ DatabaseMonitorService BaseCoreGenericHandler;

    public LiteBansModule_140(DatabaseMonitorService w2) {
        this.plugin = w2;
    }

    @Override
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown()) {
            try {
                if (this.plugin.BaseCoreGenericHandler.ServerSyncService()) {
                    this.plugin.BaseCoreGenericHandler.BaseCoreGenericHandler(runnable);
                } else {
                    runnable.run();
}
            catch (InterruptedException interruptedException) {
                // empty catch block
}

