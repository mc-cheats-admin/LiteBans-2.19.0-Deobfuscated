package litebans;

import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class LiteBansModule_266
extends LiteBansModule_263 {
    private final PlatformPlugin e;
        public LiteBansModule_266(@NotNull LiteCommand command, @NotNull PlatformPlugin plugin, @Nullable String string, @NotNull String[] args) {
        super(command, string, plugin, Arrays.copyOf(args, args.length));
        this.e = plugin;
        LiteBansModule_159 ec_02 = this.e.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        if (((GetcancelreasoncomponentsHandler)ec_02).BaseCoreGenericHandler()) {
            this.setPermissionMessage(HoverTextFormatter.LiteBansModule_31.BaseCoreGenericHandler(MessageKey.cZ.toString()));
        }
    }

    @Override
    public List suggest(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        CommandManager commandManager = this.e.z();
        ObjectUtilities.LiteBansModule_31(commandManager, "");
        return ((PunishmentService)commandManager).BaseCoreGenericHandler(this, this.getName(), sender, args);
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"", ""};
    }

    static {
        LiteBansModule_266.BaseCoreGenericHandler();
    }
}

