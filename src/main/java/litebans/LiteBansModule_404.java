package litebans;

import java.util.Collection;
import net.md_5.bungee.api.connection.ProxiedPlayer;

@ModulePriority(priority=1)
public class LiteBansModule_404
extends ConfigurationManager {
    public LiteBansModule_404(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public int LiteBansModule_31() {
        Collection collection = this.plugin();
        return collection.size();
    }

    private final Collection BaseCoreGenericHandler() {
        return ((BungeePlugin)this.plugin).getProxy().getPlayers();
    }

    @Override
    public CommandSenderWrapper[] BaseCoreGenericHandler() {
        PlatformPlugin plugin = this.plugin;
        Collection collection = this.plugin();
        if (collection.isEmpty()) {
            return CommandSenderWrapper.BaseCoreGenericHandler;
        }
        CommandSenderWrapper[] jv_0Array = new CommandSenderWrapper[collection.size()];
        int n = 0;
        for (ProxiedPlayer proxiedPlayer : collection) {
            jv_0Array[n++] = plugin.BaseCoreGenericHandler(proxiedPlayer);
        }
        return jv_0Array;
    }
}

