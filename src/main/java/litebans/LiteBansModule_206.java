package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_206
extends MessageHandler {
        public LiteBansModule_206(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_206.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_206 fq_02, LiteBansModule_83 ch2) {
        ch2.AsyncBackgroundTask_5().AsyncBackgroundTask_5(true);
        Object targetObj = BansHandler_2.i;
        LiteBansModule_185.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e("UPDATE " + targetObj), "accept=1"))));
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)fq_02, (CharSequence)BlackHandler.c("Disclaimer accepted!"));
        targetObj = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
        ServerSyncService.BaseCoreGenericHandler((ServerSyncService)targetObj, BroadcastHandler.BaseCoreGenericHandler, ch2, null, 0, 12, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"UPDATE ", "accept=1", "Disclaimer accepted!"};
    }

    static {
        LiteBansModule_206.BaseCoreGenericHandler();
    }
}

