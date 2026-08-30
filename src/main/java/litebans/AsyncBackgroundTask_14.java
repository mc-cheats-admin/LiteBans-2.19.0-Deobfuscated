package litebans;

public final class AsyncBackgroundTask_14
extends ThreadLocal {
    final /* synthetic */ ConfigService BaseCoreGenericHandler;

    AsyncBackgroundTask_14(ConfigService configService) {
        this.plugin = configService;
    }

    protected LiteBansModule_356 BaseCoreGenericHandler() {
        return LiteBansModule_373.BaseCoreGenericHandler(MessageKey.LiteBansModule.toString(), ConfigService.BaseCoreGenericHandler(this.plugin, MessageKey.LiteBansModule, null, 2, null));
    }

    public Object initialValue() {
        return this.plugin();
    }
}

