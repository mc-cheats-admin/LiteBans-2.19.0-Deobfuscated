package litebans;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import litebans.j2;
import litebans.kI;
import litebans.kJ;

static class ja
implements Runnable {
    private static final kI a = kI.a(ja.class);
    static final ja g = new j2();
    private ScheduledFuture c;
    private String e;
    private Exception d;
    private String f;
    private boolean b;

    ja(kJ kJ2) {
        this.d = new Exception("Apparent connection leak detected");
        this.f = Thread.currentThread().getName();
        this.e = kJ2.g.toString();
    }

    private ja() {
    }

    void a(ScheduledExecutorService scheduledExecutorService, long l3) {
        this.c = scheduledExecutorService.schedule(this, l3, TimeUnit.MILLISECONDS);
    }

    @Override
    public void run() {
        this.b = true;
        StackTraceElement[] stackTraceElementArray = this.d.getStackTrace();
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[stackTraceElementArray.length - 5];
        System.arraycopy(stackTraceElementArray, 5, stackTraceElementArray2, 0, stackTraceElementArray2.length);
        this.d.setStackTrace(stackTraceElementArray2);
        a.c("Connection leak detection triggered for %s on thread %s, stack trace follows", new Object[]{this.e, this.f, this.d});
    }

    void a() {
        this.c.cancel(false);
        if (this.b) {
            a.d("Previously reported leaked connection %s on thread %s was returned to the pool (unleaked)", new Object[]{this.e, this.f});
        }
    }

    /* synthetic */ ja(j2 j22) {
        this();
    }
}

