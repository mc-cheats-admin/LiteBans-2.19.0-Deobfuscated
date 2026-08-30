package litebans;

import fr.xephi.authme.events.LoginEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.jetbrains.annotations.NotNull;

public final class ServerEventListener_4
implements LiteBansModule_89 {
    private final PlatformPlugin BaseCoreGenericHandler;
        public ServerEventListener_4(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void BaseCoreGenericHandler(@NotNull LoginEvent loginEvent) {
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        try {
            Player player = loginEvent.getPlayer();
            if (player == null) {
                return;
            }
            Player player2 = player;
            CommandSenderWrapper sender = this.plugin.BaseCoreGenericHandler(player2);
            String string = sender.i();
            String string2 = sender.BaseCoreGenericHandler();
            String string3 = sender.LiteBansModule_31();
            new LiteBansModule_222(this.plugin, string, string2, string3).run();
        }
        catch (Throwable throwable) {
            this.plugin.getLogger().severe("Handling AuthMe login event failed. Further events will not be ");
            ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
            w2.BaseCoreGenericHandler(throwable);
            LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{this};
            this.plugin.BaseCoreGenericHandler(em_0Array);
            configService.r().BaseCoreGenericHandler(true);
        }
    }

    public ServerEventListener_4 LiteBansModule_31() {
        ServerEventListener_4 lX2;
        ServerEventListener_4 lX3 = lX2 = this;
        LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{lX3};
        lX3.BaseCoreGenericHandler.LiteBansModule_31(em_0Array);
        return lX2;
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"Handling AuthMe login event failed. Further events will not be handled."};
    }

    static {
        ServerEventListener_4.BaseCoreGenericHandler();
    }
}

