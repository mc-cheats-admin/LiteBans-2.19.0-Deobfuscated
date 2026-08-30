package litebans;

import java.util.concurrent.TimeUnit;
import litebans.e6;

public final class hM
implements e6 {
    @Override
    public long a() {
        return System.currentTimeMillis();
    }

    @Override
    public long c(long l3) {
        return System.currentTimeMillis() - l3;
    }

    @Override
    public long f(long l3, long l5) {
        return l5 - l3;
    }

    @Override
    public long a(long l3) {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis() - l3);
    }

    @Override
    public long b(long l3, long l5) {
        return TimeUnit.MILLISECONDS.toNanos(l5 - l3);
    }

    @Override
    public long d(long l3, long l5) {
        return l3 + l5;
    }
}

