package litebans;

import java.util.concurrent.ScheduledExecutorService;
import litebans.ja;
import litebans.kJ;

static class iU {
    private ScheduledExecutorService b;
    private long a;

    iU(long l3, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = l3;
    }

    ja b(kJ kJ2) {
        return this.a == 0L ? ja.g : this.a(kJ2);
    }

    void a(long l3) {
        this.a = l3;
    }

    private final ja a(kJ kJ2) {
        ja ja2 = new ja(kJ2);
        ja2.a(this.b, this.a);
        return ja2;
    }
}

