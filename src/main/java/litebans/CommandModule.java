package litebans;

import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

@ModulePriority(priority=1)
public abstract class CommandModule
extends CommandManager {
    public CommandModule(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 1;
    }

    @Override
    public void BaseCoreGenericHandler() {
        super.BaseCoreGenericHandler();
        for (LiteCommand command : this.e()) {
            this.LiteBansModule_31(new LiteBansModule_262(command, command.getPermission(), this.plugin, new String[0]));
}

    public void LiteBansModule_31(LiteCommand command) {
        Plugin plugin = this.plugin;
        plugin.getProxy().getPluginManager().registerCommand(plugin, (Command)((LiteBansModule_262)command));
}

