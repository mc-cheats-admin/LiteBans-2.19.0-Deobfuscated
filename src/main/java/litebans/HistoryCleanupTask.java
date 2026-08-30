package litebans;

import java.util.List;
static final class HistoryCleanupTask
implements Runnable {
    private volatile long BaseCoreGenericHandler;
    final /* synthetic */ HikariPool LiteBansModule_31;

    private HistoryCleanupTask(HikariPool dr2) {
        this.LiteBansModule_31 = dr2;
        this.plugin = LiteBansModule_149.BaseCoreGenericHandler(LiteBansModule_149.LiteBansModule_31(), -HikariPool.e(this.LiteBansModule_31));
    }

    @Override
    public void run() {
        try {
            this.LiteBansModule_31.AsyncBackgroundTask_21 = this.LiteBansModule_31.AsyncBackgroundTask_22.c();
            this.LiteBansModule_31.LiteBansModule_194 = this.LiteBansModule_31.AsyncBackgroundTask_22.LiteBansModule_240();
            HikariPool.LiteBansModule_194(this.LiteBansModule_31).BaseCoreGenericHandler(this.LiteBansModule_31.AsyncBackgroundTask_22.g());
            this.LiteBansModule_31.c = this.LiteBansModule_31.AsyncBackgroundTask_22.AsyncBackgroundTask_5() != null && !this.LiteBansModule_31.AsyncBackgroundTask_22.AsyncBackgroundTask_5().equals(this.LiteBansModule_31.c) ? this.LiteBansModule_31.AsyncBackgroundTask_22.AsyncBackgroundTask_5() : this.LiteBansModule_31.c;
            long l3 = this.LiteBansModule_31.AsyncBackgroundTask_22.BaseCoreGenericHandler();
            long l5 = LiteBansModule_149.LiteBansModule_31();
            if (LiteBansModule_149.BaseCoreGenericHandler(l5, 128L) < LiteBansModule_149.BaseCoreGenericHandler(this.plugin, HikariPool.e(this.LiteBansModule_31))) {
                HikariPool.LiteBansModule_31(this.LiteBansModule_31).c("%AsyncBackgroundTask_21 - Retrograde clock change detected (housekeeper delta=%AsyncBackgroundTask_21), soft-evicting connections from ", new Object[]{this.LiteBansModule_31.e, LiteBansModule_149.e(this.plugin, l5)});
                this.plugin = l5;
                this.LiteBansModule_31.BaseCoreGenericHandler();
                return;
            }
            this.plugin = l5;
            String string = "Pool ";
            if (l3 > 0L && this.LiteBansModule_31.AsyncBackgroundTask_22.i() < this.LiteBansModule_31.AsyncBackgroundTask_22.LiteBansModule_194()) {
                this.LiteBansModule_31.BaseCoreGenericHandler(new String[]{"Before cleanup "});
                string = "After cleanup  ";
                List list = HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).LiteBansModule_31(0);
                int n = list.size() - this.LiteBansModule_31.AsyncBackgroundTask_22.i();
                for (InUseHandler kJ2 : list) {
                    if (n <= 0 || LiteBansModule_149.g(kJ2.e, l5) <= l3 || !HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).BaseCoreGenericHandler(kJ2)) continue;
                    this.LiteBansModule_31.BaseCoreGenericHandler(kJ2, "(connection has passed idleTimeout)");
                    --n;
}
            this.LiteBansModule_31.BaseCoreGenericHandler(new String[]{string});
            HikariPool.c(this.LiteBansModule_31);
        }
        catch (Exception exception) {
            HikariPool.LiteBansModule_31(this.LiteBansModule_31).BaseCoreGenericHandler("Unexpected exception InitializerHandler_3 housekeeping task", new Object[]{exception});
}

    /* synthetic */ HistoryCleanupTask(HikariPool dr2, LiteBansModule_332 j92) {
        this(dr2);
}

