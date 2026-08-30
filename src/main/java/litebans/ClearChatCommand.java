package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@CommandMetadata
public final class ClearChatCommand
extends AbstractCommand {
    private final String GnuSparseMapHandler;
    private final LiteBansModule_354 LiteBansModule_403;
    private final String Utf8Handler_2;
    private final CommandManager m;
        public ClearChatCommand(@NotNull String string, @NotNull String string2, @Nullable LiteBansModule_354 jq_02, @Nullable String string3, @NotNull CommandManager commandManager) {
        super(string, commandManager.BaseCoreGenericHandler);
        this.GnuSparseMapHandler = string2;
        this.LiteBansModule_403 = jq_02;
        this.Utf8Handler_2 = string3;
        this.m = commandManager;
    }

    @Override
    public String getPermission() {
        return this.Utf8Handler_2;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        this.m.BaseCoreGenericHandler(sender, this.GnuSparseMapHandler, args);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String[] args, @NotNull LiteBansModule_147 messageSupplier) {
        super.BaseCoreGenericHandler(args, () -> ClearChatCommand.BaseCoreGenericHandler(this));
    }

    private static final CharSequence BaseCoreGenericHandler(ClearChatCommand fr_02) {
        return MessageKey.c(fr_02.GnuSparseMapHandler + "_USAGE");
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"_USAGE"};
    }

    static {
        ClearChatCommand.BaseCoreGenericHandler();
    }
}

