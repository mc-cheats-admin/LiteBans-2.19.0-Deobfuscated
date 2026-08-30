package litebans;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
static class AsyncBackgroundTask_15
implements Runnable {
    private static final HikariLogger BaseCoreGenericHandler = HikariLogger.BaseCoreGenericHandler(AsyncBackgroundTask_15.class);
    static final AsyncBackgroundTask_15 g = new LiteBansModule_329();
    private ScheduledFuture c;
    private String e;
    private Exception AsyncBackgroundTask_5;
    private String LiteBansModule_194;
    private boolean LiteBansModule_31;

    AsyncBackgroundTask_15(InUseHandler kJ2) {
        this.AsyncBackgroundTask_5 = new Exception("Apparent connection leak detected");
        this.LiteBansModule_194 = Thread.currentThread().getName();
        this.e = kJ2.g.toString();
    }

    private AsyncBackgroundTask_15() {
    }

    void BaseCoreGenericHandler(ScheduledExecutorService scheduledExecutorService, long l3) {
        this.c = scheduledExecutorService.schedule(this, l3, TimeUnit.MILLISECONDS);
    }

    @Override
    public void run() {
        this.LiteBansModule_31 = true;
        StackTraceElement[] stackTraceElementArray = this.AsyncBackgroundTask_5.getStackTrace();
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[stackTraceElementArray.length - 5];
        System.arraycopy(stackTraceElementArray, 5, stackTraceElementArray2, 0, stackTraceElementArray2.length);
        this.AsyncBackgroundTask_5.setStackTrace(stackTraceElementArray2);
        BaseCoreGenericHandler.c("Connection leak detection triggered for %AsyncBackgroundTask_21 on thread %AsyncBackgroundTask_21, stack trace follows", new Object[]{this.e, this.LiteBansModule_194, this.AsyncBackgroundTask_5});
    }

    void BaseCoreGenericHandler() {
        this.c.cancel(false);
        if (this.LiteBansModule_31) {
            BaseCoreGenericHandler.AsyncBackgroundTask_5("Previously reported leaked connection %AsyncBackgroundTask_21 on thread %AsyncBackgroundTask_21 was returned to the pool (unleaked)", new Object[]{this.e, this.LiteBansModule_194});
        }
    }

    /* synthetic */ AsyncBackgroundTask_15(LiteBansModule_329 j22) {
        this();
    }
}

