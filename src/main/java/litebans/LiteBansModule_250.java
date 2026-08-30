package litebans;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandManager;
@ModulePriority(priority=2)
public class LiteBansModule_250
extends CommandManager {
    public LiteBansModule_250(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 2;
    }

    @Override
    public void e() {
    }

    @Override
    public void BaseCoreGenericHandler() {
        super.BaseCoreGenericHandler();
        for (LiteCommand command : this.e()) {
            this.LiteBansModule_31(new LiteBansModule_53(command, command.getPermission(), this.plugin, command.getAliases()));
        }
    }

    public void LiteBansModule_31(LiteCommand command) {
        VelocityPlugin velocityPlugin = (VelocityPlugin)this.plugin;
        CommandManager commandManager = velocityPlugin.c.getCommandManager();
        commandManager.register(command.getName(), (Command)((LiteBansModule_53)command), command.getAliases());
    }
}

