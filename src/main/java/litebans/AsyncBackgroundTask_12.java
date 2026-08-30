package litebans;

public final class AsyncBackgroundTask_12
implements Runnable {
    final /* synthetic */ ConfigService LiteBansModule_31;
    final /* synthetic */ String BaseCoreGenericHandler;

    public AsyncBackgroundTask_12(ConfigService configService, String string) {
        this.LiteBansModule_31 = configService;
        this.plugin = string;
    }

    @Override
    public final void run() {
        this.LiteBansModule_31.BaseCoreGenericHandler.getLogger().info(this.plugin);
}

