package litebans;

import java.util.concurrent.Executor;
static class LiteBansModule_151
implements Executor {
    private LiteBansModule_151() {
    }

    @Override
    public void execute(Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Exception exception) {
            HikariLogger.BaseCoreGenericHandler(PoolEntry.class).LiteBansModule_31("Failed to execute: %AsyncBackgroundTask_21", new Object[]{runnable.toString(), exception});
}

    /* synthetic */ LiteBansModule_151(LiteBansModule_259 hI2) {
        this();
}

