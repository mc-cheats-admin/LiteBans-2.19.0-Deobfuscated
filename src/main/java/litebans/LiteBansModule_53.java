package litebans;

import com.velocitypowered.api.command.CommandInvocation;
import com.velocitypowered.api.command.SimpleCommand;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@CommandMetadata
@ModulePriority(priority=2)
public class LiteBansModule_53
implements LiteCommand,
SimpleCommand {
    private final LiteCommand AsyncBackgroundTask_5;
    private final String LiteBansModule_31;
    private final PlatformPlugin BaseCoreGenericHandler;
    private final String[] c;

    public LiteBansModule_53(LiteCommand command, String string, PlatformPlugin plugin, String[] args) {
        this.AsyncBackgroundTask_5 = command;
        this.LiteBansModule_31 = string;
        this.plugin = plugin;
        this.c = args;
    }

    public List suggest(SimpleCommand.Invocation invocation) {
        return this.suggest(this.plugin.BaseCoreGenericHandler(invocation.source()), (String[])invocation.arguments());
    }

    public void LiteBansModule_31(SimpleCommand.Invocation invocation) {
        this.plugin(this.plugin.BaseCoreGenericHandler(invocation.source()), (String[])invocation.arguments());
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, String[] args) {
        try {
            this.plugin.z().BaseCoreGenericHandler(this.AsyncBackgroundTask_5, sender, args);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return this.AsyncBackgroundTask_5.getName();
    }

    @Override
    public @Nullable String getPermission() {
        return this.LiteBansModule_31;
    }

    @Override
    public @NotNull List suggest(@NotNull CommandSenderWrapper sender, String[] args) {
        return this.plugin.z().BaseCoreGenericHandler(this, this.getName(), sender, args);
    }

    public boolean BaseCoreGenericHandler(SimpleCommand.Invocation invocation) {
        String string = this.getPermission();
        if (string == null) {
            return true;
        }
        return invocation.source().hasPermission(string);
    }

    @Override
    public String[] getAliases() {
        return this.c;
    }

    public boolean hasPermission(CommandInvocation commandInvocation) {
        return this.plugin((SimpleCommand.Invocation)commandInvocation);
    }

    public List suggest(CommandInvocation commandInvocation) {
        return this.suggest((SimpleCommand.Invocation)commandInvocation);
    }

    public void execute(CommandInvocation commandInvocation) {
        this.LiteBansModule_31((SimpleCommand.Invocation)commandInvocation);
    }
}

