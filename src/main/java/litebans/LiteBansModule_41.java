package litebans;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@ModulePriority(priority=0)
public abstract class LiteBansModule_41
extends CommandManager
implements CommandExecutor {
    public LiteBansModule_41(PlatformPlugin plugin) {
        super(plugin);
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] args) {
        CommandSenderWrapper sender = this.plugin.BaseCoreGenericHandler(commandSender);
        this.plugin(sender, command.getName(), args);
        return true;
    }
}

