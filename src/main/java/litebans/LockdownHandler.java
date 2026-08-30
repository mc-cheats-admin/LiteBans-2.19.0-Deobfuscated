package litebans;

import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=2)
public final class LockdownHandler
extends AbstractModule {
        public LockdownHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        this.plugin.r();
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 2;
    }

    @Override
    public void e() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        new ServerEventListener_2(this.plugin).LiteBansModule_31();
        if (configService.LiteBansModule_195().PunishmentTableService()) {
            new PlayerChatListener(this.plugin).BaseCoreGenericHandler();
        }
    }

    @Override
    public LiteBansModule_172 BaseCoreGenericHandler(@NotNull LiteBansModule_362 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)commandContext.getName(), (Object)"lockdown")) {
            return new ServerEventListener_3(this.plugin);
        }
        return (LiteBansModule_172)super.BaseCoreGenericHandler(commandContext);
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler(LiteBansModule_362 commandContext) {
        return this.plugin(commandContext);
    }

    private static final void AsyncBackgroundTask_5() {
        LiteBansModule_31 = new String[]{"lockdown"};
    }

    static {
        LockdownHandler.AsyncBackgroundTask_5();
    }
}

