package litebans;

import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_32
extends LiteBansModule_53 {
    private final PlatformPlugin e;
    public LiteBansModule_32(@NotNull LiteCommand command, @NotNull PlatformPlugin plugin, @Nullable String string, @NotNull String[] args) {
        super(command, string, plugin, Arrays.copyOf(args, args.length));
        this.e = plugin;
    }

    public /* synthetic */ LiteBansModule_32(LiteCommand command, PlatformPlugin plugin, String string, String[] args, int n, LiteBansModule_14 aJ2) {
        if ((n & 4) != 0) {
            string = command.getPermission();
        }
        this(command, plugin, string, args);
    }

    @Override
    public List suggest(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        CommandManager commandManager = this.e.z();
        ObjectUtilities.LiteBansModule_31(commandManager, "");
        return ((BanHandler_5)commandManager).BaseCoreGenericHandler(this, this.getName(), sender, args);
    }

    }

