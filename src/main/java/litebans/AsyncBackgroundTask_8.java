package litebans;

static final class AsyncBackgroundTask_8
implements Runnable {
    private final InUseHandler BaseCoreGenericHandler;
    final /* synthetic */ HikariPool LiteBansModule_31;

    AsyncBackgroundTask_8(HikariPool dr2, InUseHandler kJ2) {
        this.LiteBansModule_31 = dr2;
        this.plugin = kJ2;
    }

    @Override
    public void run() {
        if (HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31, this.plugin, "(connection has passed maxLifetime)", false)) {
            this.LiteBansModule_31.BaseCoreGenericHandler(HikariPool.BaseCoreGenericHandler(this.LiteBansModule_31).c());
        }
    }
}

