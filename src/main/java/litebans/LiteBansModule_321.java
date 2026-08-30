package litebans;

import java.util.concurrent.ScheduledExecutorService;
static class LiteBansModule_321 {
    private ScheduledExecutorService LiteBansModule_31;
    private long BaseCoreGenericHandler;

    LiteBansModule_321(long l3, ScheduledExecutorService scheduledExecutorService) {
        this.LiteBansModule_31 = scheduledExecutorService;
        this.plugin = l3;
    }

    AsyncBackgroundTask_15 LiteBansModule_31(InUseHandler kJ2) {
        return this.plugin == 0L ? AsyncBackgroundTask_15.g : this.plugin(kJ2);
    }

    void BaseCoreGenericHandler(long l3) {
        this.plugin = l3;
    }

    private final AsyncBackgroundTask_15 BaseCoreGenericHandler(InUseHandler kJ2) {
        AsyncBackgroundTask_15 ja2 = new AsyncBackgroundTask_15(kJ2);
        ja2.BaseCoreGenericHandler(this.LiteBansModule_31, this.plugin);
        return ja2;
}

