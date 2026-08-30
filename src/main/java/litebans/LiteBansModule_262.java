package litebans;

import java.util.List;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;
import org.jetbrains.annotations.NotNull;

@CommandMetadata
@ModulePriority(priority=1)
public class LiteBansModule_262
extends Command
implements LiteCommand,
TabExecutor {
    private final LiteCommand BaseCoreGenericHandler;
    private final PlatformPlugin c;
    private final String[] LiteBansModule_31;

    public LiteBansModule_262(LiteCommand command, String string, PlatformPlugin plugin, String[] args) {
        super(command.getName(), string, args);
        this.plugin = command;
        this.c = plugin;
        this.LiteBansModule_31 = args;
    }

    public void execute(CommandSender commandSender, String[] args) {
        this.plugin(this.c.BaseCoreGenericHandler(commandSender), args);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, String[] args) {
        try {
            this.c.z().BaseCoreGenericHandler(this.plugin, sender, args);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public @NotNull List suggest(@NotNull CommandSenderWrapper sender, String[] args) {
        return this.c.z().BaseCoreGenericHandler(this, this.getName(), sender, args);
    }

    public Iterable onTabComplete(CommandSender commandSender, String[] args) {
        return this.suggest(this.c.BaseCoreGenericHandler(commandSender), args);
    }

    @Override
    public String[] getAliases() {
        return this.LiteBansModule_31;
    }
}

