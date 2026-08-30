package litebans;

import java.util.ArrayList;
import java.util.Collection;
import org.bukkit.entity.Player;

@ModulePriority(priority=0)
public class LiteBansModule_369
extends ConfigurationManager {
    public LiteBansModule_369(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public int LiteBansModule_31() {
        Collection collection = ((BukkitPlugin)this.plugin).getServer().getOnlinePlayers();
        return collection.size();
    }

    @Override
    public CommandSenderWrapper[] BaseCoreGenericHandler() {
        Collection collection = ((BukkitPlugin)this.plugin).getServer().getOnlinePlayers();
        if (collection.isEmpty()) {
            return CommandSenderWrapper.BaseCoreGenericHandler;
        }
        int n = collection.size();
        ArrayList<CommandSenderWrapper> arrayList = new ArrayList<CommandSenderWrapper>(n);
        for (Player player : collection) {
            arrayList.add(this.plugin.BaseCoreGenericHandler(player));
        }
        return arrayList.toArray(CommandSenderWrapper.BaseCoreGenericHandler);
    }
}

