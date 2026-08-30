package litebans;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
static final class LiteBansModule_117
implements Callable {
    private final String LiteBansModule_31;
    final /* synthetic */ HikariPool BaseCoreGenericHandler;

    LiteBansModule_117(HikariPool dr2, String string) {
        this.plugin = dr2;
        this.LiteBansModule_31 = string;
    }

    public Boolean BaseCoreGenericHandler() {
        long l3 = 250L;
        while (this.plugin.P == 0 && this.LiteBansModule_31()) {
            InUseHandler kJ2 = HikariPool.AsyncBackgroundTask_5(this.plugin);
            if (kJ2 != null) {
                HikariPool.BaseCoreGenericHandler(this.plugin).c(kJ2);
                HikariPool.LiteBansModule_31(this.plugin).LiteBansModule_31("%AsyncBackgroundTask_21 - Added connection %AsyncBackgroundTask_21", new Object[]{this.plugin.e, kJ2.g.toString()});
                if (this.LiteBansModule_31 != null) {
                    this.plugin.BaseCoreGenericHandler(new String[]{this.LiteBansModule_31});
                }
                return Boolean.TRUE;
            }
            if (this.LiteBansModule_31 != null) {
                HikariPool.LiteBansModule_31(this.plugin).LiteBansModule_31("%AsyncBackgroundTask_21 - Connection add failed, sleeping with backoff: %dms", new Object[]{this.plugin.e, l3});
            }
            LiteBansModule_132.BaseCoreGenericHandler(l3);
            l3 = Math.min(TimeUnit.SECONDS.toMillis(10L), Math.min(this.plugin.AsyncBackgroundTask_21, (long)((double)l3 * 1.5)));
        }
        return Boolean.FALSE;
    }

    private final synchronized boolean LiteBansModule_31() {
        return this.plugin.LiteBansModule_195() < this.plugin.AsyncBackgroundTask_22.LiteBansModule_195() && (HikariPool.BaseCoreGenericHandler(this.plugin).c() > 0 || this.plugin.LiteBansModule_31() < this.plugin.AsyncBackgroundTask_22.i());
    }

    public Object call() {
        return this.plugin();
    }
}

