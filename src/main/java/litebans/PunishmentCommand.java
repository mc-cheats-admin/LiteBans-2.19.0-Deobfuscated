package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@CommandMetadata
public final class PunishmentCommand
extends AbstractCommand {
    private final String i;
    private final PunishmentService GnuSparseMapHandler;

    public PunishmentCommand(@NotNull String string, @Nullable String string2, @NotNull PunishmentService e) {
        super(string, e.BaseCoreGenericHandler);
        this.i = string2;
        this.GnuSparseMapHandler = e;
    }

    @Override
    public String getPermission() {
        return this.i;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        this.GnuSparseMapHandler.BaseCoreGenericHandler(sender, this.getName(), args);
    }
}

