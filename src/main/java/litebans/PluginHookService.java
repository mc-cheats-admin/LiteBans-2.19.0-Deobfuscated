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
        boolean flag = false;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object;
            Object object2 = object = objectArray[i];
            boolean flag2 = false;
            TemporaryplayerHandler.LiteBansModule_31(this, object2);
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
        DiscordWebhookClient eG2 = configService.LiteBansModule_194();
        new ServerEventListener(this.plugin).AsyncBackgroundTask_5();
        PlatformPlugin plugin = this.plugin;
        boolean flag = eG2.J();
        boolean flag2 = false;
        if (flag) {
            LiteBansModule_175 em_02;
            LiteBansModule_175[] em_0Array = new LiteBansModule_175[1];
            int n = 0;
            LiteBansModule_175[] em_0Array2 = em_0Array;
            PlatformPlugin di_03 = plugin;
            boolean flag3 = false;
            em_0Array2[n] = em_02 = (LiteBansModule_175)new PlayerJoinListener(this.plugin);
            di_03.LiteBansModule_31(em_0Array);
        }
        this.plugin.c(() -> PluginHookService.BaseCoreGenericHandler(configService, this));
        if (configService.LiteBansModule_194().PunishmentTableService()) {
            this.plugin.c(() -> PluginHookService.BaseCoreGenericHandler(this, eG2, configService));
            new PlayerChatListener_2(this.plugin).BaseCoreGenericHandler();
        }
    }

    @Override
    public LiteBansModule_88 BaseCoreGenericHandler(@NotNull LiteBansModule_360 commandContext) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)commandContext.getName(), (Object)"lockdown")) {
            return new PlayerLoginListener(this.plugin);
        }
        return (LiteBansModule_88)super.BaseCoreGenericHandler(commandContext);
    }

    private static final LiteBansModule_175[] BaseCoreGenericHandler(PluginHookService q) {
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
                boolean flag = false;
                module.BaseCoreGenericHandler.getLogger().warning(string);
                exception.printStackTrace();
            }
        }
    }

    private static final void BaseCoreGenericHandler(PluginHookService q, DiscordWebhookClient eG2, ConfigService configService) {
        block6: {
            try {
                boolean flag = q.LiteBansModule_31 = eG2.BaseCoreGenericHandler() && q.BaseCoreGenericHandler.i().BaseCoreGenericHandler("ProtocolLib");
                if (q.LiteBansModule_31 && LiteBansModule_139.LiteBansModule_31.LiteBansModule_31()) {
                    q.BaseCoreGenericHandler.getLogger().warning("ProtocolLib error 00 - manager is ");
                } else if (q.LiteBansModule_31) {
                    Object[] objectArray;
                    PluginModule module = q;
                    Object[] objectArray2 = new Object[]{new LiteBansModule_134(q.BaseCoreGenericHandler), new LiteBansModule_143(q.BaseCoreGenericHandler)};
                    PluginHookService q2 = q;
                    boolean flag2 = false;
                    for (Object object : objectArray = objectArray2) {
                        boolean flag3 = false;
                        TemporaryplayerHandler.BaseCoreGenericHandler(module, object);
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
    public LiteBansModule_175 BaseCoreGenericHandler(LiteBansModule_360 commandContext) {
        return this.plugin(commandContext);
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"lockdown", "fr.xephi.authme.events.LoginEvent", "Hooking into AuthMe ", "ProtocolLib", "ProtocolLib error 00 - manager is ", "Failed to add ProtocolLib packet listener."};
    }

    }

