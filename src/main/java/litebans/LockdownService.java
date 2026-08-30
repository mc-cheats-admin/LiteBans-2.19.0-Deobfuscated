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
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        new MetricsService(this.plugin).BaseCoreGenericHandler();
        if (configService.LiteBansModule_195().PunishmentTableService()) {
            new UpdateChecker(this.plugin).LiteBansModule_31();
        }
    }

    @Override
    public LiteBansModule_428 BaseCoreGenericHandler(@NotNull LiteBansModule_362 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)commandContext.getName(), (Object)"lockdown")) {
            return new LockdownCommandHandler(this.plugin);
        }
        return (LiteBansModule_428)super.BaseCoreGenericHandler(commandContext);
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler(LiteBansModule_362 commandContext) {
        return this.plugin(commandContext);
    }

    private static final void AsyncBackgroundTask_5() {
        LiteBansModule_31 = new String[]{"lockdown"};
    }

    static {
        LockdownService.AsyncBackgroundTask_5();
    }
}

