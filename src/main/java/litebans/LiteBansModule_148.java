package litebans;

import java.util.concurrent.TimeUnit;
public class LiteBansModule_148
implements LiteBansModule_149 {
    @Override
    public long BaseCoreGenericHandler() {
        return System.nanoTime();
    }

    @Override
    public long c(long l3) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l3);
    }

    @Override
    public long LiteBansModule_194(long l3, long l5) {
        return TimeUnit.NANOSECONDS.toMillis(l5 - l3);
    }

    @Override
    public long BaseCoreGenericHandler(long l3) {
        return System.nanoTime() - l3;
    }

    @Override
    public long LiteBansModule_31(long l3, long l5) {
        return l5 - l3;
    }

    @Override
    public long AsyncBackgroundTask_5(long l3, long l5) {
        return l3 + TimeUnit.MILLISECONDS.toNanos(l5);
}

