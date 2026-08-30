package litebans;

import com.mojang.brigadier.CommandDispatcher;
@ModulePriority(priority=3)
public class LiteBansModule_199
extends CommandManager {
    public LiteBansModule_199(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 3;
    }

    @Override
    public void e() {
    }

    @Override
    public void BaseCoreGenericHandler() {
        super.BaseCoreGenericHandler();
        ((ConfigYmlHandler)this.plugin).g().BaseCoreGenericHandler((T object) -> {
            for (LiteCommand command : this.e()) {
                this.plugin(new LiteBansModule_352(command, command.getPermission(), this.plugin, command.getAliases()), (CommandDispatcher)object);
            }
            return Void.TYPE;
        });
    }

    public void BaseCoreGenericHandler(LiteBansModule_352 jq_02, CommandDispatcher commandDispatcher) {
        ((ConfigYmlHandler)this.plugin).g().BaseCoreGenericHandler(jq_02, commandDispatcher);
    }
}

