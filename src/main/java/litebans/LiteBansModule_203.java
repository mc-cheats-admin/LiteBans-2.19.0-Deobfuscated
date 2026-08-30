package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_203
extends MessageHandler {
    public LiteBansModule_203(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_203.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_203 ff_02, LiteBansModule_83 ch2) {
        MessageHandler messageHandler = ff_02;
        PunishmentTableService p2 = (PunishmentTableService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(PunishmentTableService.class);
        Object targetObj = ch2.AsyncBackgroundTask_5();
        long l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        int n = 21600000 + new LiteBansModule_325(0L, 1, null).BaseCoreGenericHandler(32400000);
        ((DatabaseMonitorService)targetObj).BaseCoreGenericHandler(l3 + (long)n);
        targetObj = ff_02;
        if (((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().PunishmentTableService()) {
            p2.BaseCoreGenericHandler(ch2);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }
}

