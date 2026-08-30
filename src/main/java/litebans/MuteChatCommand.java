package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@CommandMetadata
public final class MuteChatCommand
extends AbstractCommand {
    private final String GnuSparseMapHandler;
    private final CommandManager i;

    public MuteChatCommand(@NotNull String string, @Nullable String string2, @NotNull CommandManager commandManager) {
        super(string, commandManager.BaseCoreGenericHandler);
        this.GnuSparseMapHandler = string2;
        this.i = commandManager;
    }

    @Override
    public String getPermission() {
        return this.GnuSparseMapHandler;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        this.i.BaseCoreGenericHandler(sender, this.getName(), args);
    }
}

