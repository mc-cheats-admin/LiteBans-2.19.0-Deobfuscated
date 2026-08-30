package litebans;

import org.jetbrains.annotations.NotNull;

public final class MutelistHandler
extends BanListCommand {
        public MutelistHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public BanHandler BaseCoreGenericHandler() {
        return BanHandler.GnuSparseMapHandler;
    }

    @Override
    public String getName() {
        return "mutelist";
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"mutelist"};
    }

    static {
        MutelistHandler.BaseCoreGenericHandler();
    }
}

