package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class LiteBansModule_39 {
    private ScheduledExecutorService BaseCoreGenericHandler = null;

    public void BaseCoreGenericHandler() {
        if (this.plugin != null && !this.plugin.isShutdown()) {
            this.plugin.shutdown();
            if (!this.plugin.awaitTermination(2L, TimeUnit.SECONDS)) {
                this.plugin.shutdownNow();
}

    public ScheduledExecutorService BaseCoreGenericHandler(LiteBansCore core) {
        ScheduledExecutorService scheduledExecutorService = this.plugin;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorService2;
            ThreadFactoryBuilder threadFactoryBuilder = core.AsyncBackgroundTask_5();
            this.plugin = scheduledExecutorService2 = Executors.newScheduledThreadPool(1, threadFactoryBuilder.build());
            return scheduledExecutorService2;
        }
        return this.plugin;
}

