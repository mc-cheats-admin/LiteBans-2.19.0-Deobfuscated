package litebans;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.proxy.Player;
import org.jetbrains.annotations.NotNull;

public final class PlayerChatListener
implements LiteBansModule_171 {
    private final PlatformPlugin LiteBansModule_31;
    private final PunishmentTableService BaseCoreGenericHandler;

    public PlayerChatListener(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
        this.plugin = (PunishmentTableService)this.LiteBansModule_31.BaseCoreGenericHandler(PunishmentTableService.class);
    }

    public final PlatformPlugin LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    @Subscribe(order=PostOrder.EARLY)
    public final void BaseCoreGenericHandler(@NotNull PlayerChatEvent playerChatEvent) {
        if (!playerChatEvent.getResult().isAllowed()) {
            return;
        }
        Player player = playerChatEvent.getPlayer();
        String string = playerChatEvent.getMessage();
        TestHandler_2 f82 = this.plugin.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        f82.BaseCoreGenericHandler((Object)playerChatEvent, string, this.LiteBansModule_31.BaseCoreGenericHandler(player), true);
    }

    @Subscribe(order=PostOrder.EARLY)
    public final void BaseCoreGenericHandler(@NotNull CommandExecuteEvent commandExecuteEvent) {
        CommandSource commandSource = commandExecuteEvent.getCommandSource();
        String string = commandExecuteEvent.getCommand();
        if (!commandExecuteEvent.getResult().isAllowed() || !(commandSource instanceof Player)) {
            return;
        }
        TestHandler_2.BaseCoreGenericHandler(this.plugin.BaseCoreGenericHandler(), commandExecuteEvent, '/' + string, this.LiteBansModule_31.BaseCoreGenericHandler(commandSource), false, 8, null);
    }

    @Override
    public PlayerChatListener BaseCoreGenericHandler() {
        PlayerChatListener e72;
        PlayerChatListener e73 = e72 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{e73};
        e73.LiteBansModule_31.LiteBansModule_31(em_0Array);
        return e72;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.plugin();
}

