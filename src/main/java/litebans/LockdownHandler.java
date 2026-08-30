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
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        new ServerEventListener_2(this.plugin).LiteBansModule_31();
        if (configService.LiteBansModule_194().PunishmentTableService()) {
            new PlayerChatListener(this.plugin).BaseCoreGenericHandler();
}

    @Override
    public LiteBansModule_171 BaseCoreGenericHandler(@NotNull LiteBansModule_360 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler(commandContext.getName(), (Object)"lockdown")) {
            return new ServerEventListener_3(this.plugin);
        }
        return (LiteBansModule_171)super.BaseCoreGenericHandler(commandContext);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler(LiteBansModule_360 commandContext) {
        return this.plugin(commandContext);
}

