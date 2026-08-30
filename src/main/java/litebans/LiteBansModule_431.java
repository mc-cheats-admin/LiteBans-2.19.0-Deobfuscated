package litebans;

import com.velocitypowered.api.proxy.Player;
import java.util.Collection;
@ModulePriority(priority=2)
public class LiteBansModule_431
extends ConfigurationManager {
    public LiteBansModule_431(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public int LiteBansModule_31() {
        Collection collection = this.plugin();
        return collection.size();
    }

    private final Collection BaseCoreGenericHandler() {
        return (this.plugin).c.getAllPlayers();
    }

    @Override
    public CommandSenderWrapper[] BaseCoreGenericHandler() {
        PlatformPlugin plugin = this.plugin;
        Collection collection = this.plugin();
        if (collection.isEmpty()) {
            return CommandSenderWrapper.BaseCoreGenericHandler;
        }
        CommandSenderWrapper[] jv_0Array = new CommandSenderWrapper[collection.size()];
        for (Player player : collection) {
            jv_0Array[n++] = plugin.BaseCoreGenericHandler(player);
        }
        return jv_0Array;
}

