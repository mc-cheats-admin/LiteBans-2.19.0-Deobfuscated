package litebans;

static final class AsyncBackgroundTask_16
implements Runnable {
    private final InUseHandler BaseCoreGenericHandler;
    final /* synthetic */ HikariPool LiteBansModule_31;

    AsyncBackgroundTask_16(HikariPool dr2, InUseHandler kJ2) {
        this.LiteBansModule_31 = dr2;
        this.plugin = kJ2;
    }

    @Override
    public void run() {
        if (HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).BaseCoreGenericHandler(this.plugin)) {
            if (!this.LiteBansModule_31.AsyncBackgroundTask_5(this.plugin.g)) {
                HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31, this.plugin, "(connection is dead)", true);
                this.LiteBansModule_31.BaseCoreGenericHandler(HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).c());
            } else {
                HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).LiteBansModule_31(this.plugin);
                HikariPool.LiteBansModule_31(this.LiteBansModule_31).LiteBansModule_31("%AsyncBackgroundTask_21 - keepalive: connection %AsyncBackgroundTask_21 is alive", new Object[]{this.LiteBansModule_31.e, this.plugin.g.toString()});
            }
        }
    }
}

