package litebans;

import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

public final class UpdateChecker
implements LiteBansModule_426 {
    private final PlatformPlugin BaseCoreGenericHandler;
    private final PunishmentTableService LiteBansModule_31;

    public UpdateChecker(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
        this.LiteBansModule_31 = (PunishmentTableService)this.plugin.BaseCoreGenericHandler(PunishmentTableService.class);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.plugin;
    }

    @EventHandler(priority=-32)
    public final void BaseCoreGenericHandler(@NotNull ChatEvent chatEvent) {
        if (chatEvent.isCancelled()) {
            return;
        }
        Connection connection = chatEvent.getSender();
        ProxiedPlayer proxiedPlayer = connection instanceof ProxiedPlayer ? (ProxiedPlayer)connection : null;
        if (proxiedPlayer == null) {
            return;
        }
        ProxiedPlayer proxiedPlayer2 = proxiedPlayer;
        String string = chatEvent.getMessage();
        TestHandler_2 f82 = this.LiteBansModule_31.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        TestHandler_2.BaseCoreGenericHandler(f82, chatEvent, string, this.plugin.BaseCoreGenericHandler(proxiedPlayer2), false, 8, null);
    }

    public UpdateChecker LiteBansModule_31() {
        UpdateChecker kX2;
        UpdateChecker kX3 = kX2 = this;
        boolean flag = false;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{kX3};
        kX3.BaseCoreGenericHandler.LiteBansModule_31(em_0Array);
        return kX2;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }
}

