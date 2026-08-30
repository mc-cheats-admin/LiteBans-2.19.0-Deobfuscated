package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import litebans.bd_0;

public class b8 {
    private ScheduledExecutorService a = null;

    public void a() {
        if (this.a != null && !this.a.isShutdown()) {
            this.a.shutdown();
            if (!this.a.awaitTermination(2L, TimeUnit.SECONDS)) {
                this.a.shutdownNow();
            }
        }
    }

    public ScheduledExecutorService a(bd_0 bd_02) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService scheduledExecutorService2;
            ThreadFactoryBuilder threadFactoryBuilder = bd_02.d();
            this.a = scheduledExecutorService2 = Executors.newScheduledThreadPool(1, threadFactoryBuilder.build());
            return scheduledExecutorService2;
        }
        return this.a;
    }
}

