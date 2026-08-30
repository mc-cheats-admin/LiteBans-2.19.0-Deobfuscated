package litebans;

import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=1)
public final class LockdownService
extends AbstractModule {
    public LockdownService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        this.plugin.r();
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 1;
    }

    @Override
    public void e() {
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        new MetricsService(this.plugin).BaseCoreGenericHandler();
        if (configService.LiteBansModule_194().PunishmentTableService()) {
            new UpdateChecker(this.plugin).LiteBansModule_31();
}

    @Override
    public LiteBansModule_426 BaseCoreGenericHandler(@NotNull LiteBansModule_360 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler(commandContext.getName(), (Object)"lockdown")) {
            return new LockdownCommandHandler(this.plugin);
        }
        return (LiteBansModule_426)super.BaseCoreGenericHandler(commandContext);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler(LiteBansModule_360 commandContext) {
        return this.plugin(commandContext);
}

