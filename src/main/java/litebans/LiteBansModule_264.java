package litebans;

import java.util.concurrent.TimeUnit;
public final class LiteBansModule_264
implements LiteBansModule_150 {
    @Override
    public long BaseCoreGenericHandler() {
        return System.currentTimeMillis();
    }

    @Override
    public long c(long l3) {
        return System.currentTimeMillis() - l3;
    }

    @Override
    public long LiteBansModule_195(long l3, long l5) {
        return l5 - l3;
    }

    @Override
    public long BaseCoreGenericHandler(long l3) {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis() - l3);
    }

    @Override
    public long LiteBansModule_31(long l3, long l5) {
        return TimeUnit.MILLISECONDS.toNanos(l5 - l3);
    }

    @Override
    public long AsyncBackgroundTask_5(long l3, long l5) {
        return l3 + l5;
    }
}

