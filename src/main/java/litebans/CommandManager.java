package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public abstract class CommandManager
extends PluginModule {
    private final Map AsyncBackgroundTask_5 = new HashMap();
    private Collection LiteBansModule_31;
    public CommandManager(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void BaseCoreGenericHandler() {
        this.LiteBansModule_31 = this.g();
        this.LiteBansModule_194();
    }

    public Collection g() {
        return this.plugin.LiteBansModule_194().BaseCoreGenericHandler(LiteCommand.class, new Class[]{PlatformPlugin.class}, new Object[]{this.plugin});
    }

    public void BaseCoreGenericHandler(LiteCommand command, CommandSenderWrapper sender, String[] args) {
        command.BaseCoreGenericHandler(sender, args);
    }

    public void BaseCoreGenericHandler(CommandSenderWrapper sender, String string, String[] args) {
        LiteCommand command = this.plugin(string);
        if (command == null) {
            return;
        }
        this.plugin(command, sender, args);
    }

    public @Nullable LiteCommand BaseCoreGenericHandler(String string) {
        return (LiteCommand)this.AsyncBackgroundTask_5.get(string);
    }

    public Collection e() {
        return this.LiteBansModule_31;
    }

    public List BaseCoreGenericHandler(@Nullable LiteCommand command, String string, CommandSenderWrapper sender, String[] args) {
        this.plugin.getLogger().warning("No suggest implementation for /" + string);
        return Collections.emptyList();
    }

    private final void BaseCoreGenericHandler(LiteCommand command) {
        this.plugin(command.getName(), command);
    }

    public void BaseCoreGenericHandler(String string, LiteCommand command) {
        this.AsyncBackgroundTask_5.put(string, command);
    }

    void LiteBansModule_194() {
        Collection collection = this.LiteBansModule_31;
        if (collection == null) {
            throw new IllegalStateException();
        }
        for (LiteCommand command : collection) {
            this.plugin(command);
}

    private static final void AsyncBackgroundTask_5() {
        c = new String[]{"command is marked non-null but is null", "No suggest implementation for /"};
}

