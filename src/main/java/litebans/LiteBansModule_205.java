package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_205
extends MessageHandler {
    public LiteBansModule_205(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_205.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_205 fq_02, LiteBansModule_82 ch2) {
        ch2.AsyncBackgroundTask_5().AsyncBackgroundTask_5(true);
        Object targetObj = BansHandler_2.i;
        LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e("UPDATE " + targetObj), "accept=1"))));
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)fq_02, BlackHandler.c("Disclaimer accepted!"));
        targetObj = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
        ServerSyncService.BaseCoreGenericHandler((ServerSyncService)targetObj, BroadcastHandler.BaseCoreGenericHandler, ch2, null, 0, 12, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"UPDATE ", "accept=1", "Disclaimer accepted!"};
}

