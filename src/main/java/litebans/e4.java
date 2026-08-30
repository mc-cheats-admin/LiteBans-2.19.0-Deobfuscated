package litebans;

import java.util.concurrent.TimeUnit;
import litebans.e6;

public static class e4
implements e6 {
    @Override
    public long a() {
        return System.nanoTime();
    }

    @Override
    public long c(long l3) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l3);
    }

    @Override
    public long f(long l3, long l5) {
        return TimeUnit.NANOSECONDS.toMillis(l5 - l3);
    }

    @Override
    public long a(long l3) {
        return System.nanoTime() - l3;
    }

    @Override
    public long b(long l3, long l5) {
        return l5 - l3;
    }

    @Override
    public long d(long l3, long l5) {
        return l3 + TimeUnit.MILLISECONDS.toNanos(l5);
    }
}

