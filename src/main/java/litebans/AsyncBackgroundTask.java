package litebans;

public final class AsyncBackgroundTask
implements Runnable {
    final /* synthetic */ MessageHandler LiteBansModule_31;
    final /* synthetic */ LiteBansModule_200 BaseCoreGenericHandler;

    public AsyncBackgroundTask(MessageHandler messageHandler, LiteBansModule_200 fa_02) {
        this.LiteBansModule_31 = messageHandler;
        this.plugin = fa_02;
    }

    @Override
    public final void run() {
        ServerSyncService u2 = this.LiteBansModule_31.LiteBansModule_240().BaseCoreGenericHandler(ServerSyncService.class);
        u2.LiteBansModule_31(this.plugin);
}

