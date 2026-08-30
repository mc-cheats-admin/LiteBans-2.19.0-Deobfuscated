package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_202
extends MessageHandler {
    public LiteBansModule_202(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        boolean flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_202.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_202 ff_02, LiteBansModule_82 ch2) {
        MessageHandler messageHandler = ff_02;
        boolean flag = false;
        PunishmentTableService p2 = (PunishmentTableService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
        boolean flag2 = false;
        Object object = ch2.AsyncBackgroundTask_5();
        long l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        int n = 21600000 + new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler(32400000);
        boolean flag3 = false;
        ((DatabaseMonitorService)object).BaseCoreGenericHandler(l3 + (long)n);
        object = ff_02;
        boolean flag4 = false;
        if (((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PunishmentTableService()) {
            p2.BaseCoreGenericHandler(ch2);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }
}

