package litebans;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=0)
public final class PluginHookService
extends AbstractModule {
    private boolean LiteBansModule_31;
    private Object[] c = new Object[0];
        public PluginHookService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        this.plugin.r();
        Object[] objectArray = this.c;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object contextObj = targetObj = objectArray[i];
            TemporaryplayerHandler.LiteBansModule_31(this, contextObj);
        }
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 0;
    }

    @Override
    public void e() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        DiscordWebhookClient eG2 = configService.LiteBansModule_195();
        new ServerEventListener(this.plugin).AsyncBackgroundTask_5();
        PlatformPlugin plugin = this.plugin;
        boolean flag = eG2.J();
        if (flag) {
            LiteBansModule_176 em_02;
            LiteBansModule_176[] em_0Array = new LiteBansModule_176[1];
            LiteBansModule_176[] em_0Array2 = em_0Array;
            PlatformPlugin pluginWrapper = plugin;
            em_0Array2[n] = em_02 = (LiteBansModule_176)new PlayerJoinListener(this.plugin);
            pluginWrapper.LiteBansModule_31(em_0Array);
        }
        this.plugin.c(() -> PluginHookService.BaseCoreGenericHandler(configService, this));
        if (configService.LiteBansModule_195().PunishmentTableService()) {
            this.plugin.c(() -> PluginHookService.BaseCoreGenericHandler(this, eG2, configService));
            new PlayerChatListener_2(this.plugin).BaseCoreGenericHandler();
        }
    }

    @Override
    public LiteBansModule_89 BaseCoreGenericHandler(@NotNull LiteBansModule_362 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)commandContext.getName(), (Object)"lockdown")) {
            return new PlayerLoginListener(this.plugin);
        }
        return (LiteBansModule_89)super.BaseCoreGenericHandler(commandContext);
    }

    private static final LiteBansModule_176[] BaseCoreGenericHandler(PluginHookService q) {
        ServerEventListener_4[] lXArray = new ServerEventListener_4[]{new ServerEventListener_4(q.BaseCoreGenericHandler)};
        return lXArray;
    }

    private static final void BaseCoreGenericHandler(ConfigService configService, PluginHookService q) {
        if (configService.PunishmentTableService()) {
            try {
                q.BaseCoreGenericHandler.BaseCoreGenericHandler("fr.xephi.authme.events.LoginEvent", () -> PluginHookService.BaseCoreGenericHandler(q));
            }
            catch (Exception exception) {
                PluginModule module = q;
                String string = "Hooking into AuthMe ";
                module.BaseCoreGenericHandler.getLogger().warning(string);
                exception.printStackTrace();
            }
        }
    }

    private static final void BaseCoreGenericHandler(PluginHookService q, DiscordWebhookClient eG2, ConfigService configService) {
        block6: {
            try {
                boolean flag = q.LiteBansModule_31 = eG2.BaseCoreGenericHandler() && q.BaseCoreGenericHandler.i().BaseCoreGenericHandler("ProtocolLib");
                if (q.LiteBansModule_31 && LiteBansModule_140.LiteBansModule_31.LiteBansModule_31()) {
                    q.BaseCoreGenericHandler.getLogger().warning("ProtocolLib error 00 - manager is ");
                } else if (q.LiteBansModule_31) {
                    Object[] objectArray;
                    PluginModule module = q;
                    Object[] objectArray2 = new Object[]{new LiteBansModule_135(q.BaseCoreGenericHandler), new LiteBansModule_144(q.BaseCoreGenericHandler)};
                    PluginHookService q2 = q;
                    for (Object targetObj : objectArray = objectArray2) {
                        TemporaryplayerHandler.BaseCoreGenericHandler(module, targetObj);
                    }
                    Object[] objectArray3 = objectArray;
                    q2.c = Arrays.copyOf(objectArray3, objectArray3.length);
                }
            }
            catch (Throwable throwable) {
                q.BaseCoreGenericHandler.getLogger().warning("Failed to add ProtocolLib packet ");
                if ((throwable instanceof LinkageError || throwable instanceof ReflectiveOperationException) && !configService.g()) break block6;
                configService.BaseCoreGenericHandler(throwable);
            }
        }
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler(LiteBansModule_362 commandContext) {
        return this.plugin(commandContext);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"lockdown", "fr.xephi.authme.events.LoginEvent", "Hooking into AuthMe ", "ProtocolLib", "ProtocolLib error 00 - manager is ", "Failed to add ProtocolLib packet listener."};
    }

    static {
        PluginHookService.AsyncBackgroundTask_5();
    }
}

