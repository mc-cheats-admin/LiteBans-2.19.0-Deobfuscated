package litebans;

import org.jetbrains.annotations.NotNull;

public final class WarnlistHandler
extends BanListCommand {
        public WarnlistHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public BanHandler BaseCoreGenericHandler() {
        return BanHandler.c;
    }

    @Override
    public String getName() {
        return "warnlist";
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"warnlist"};
    }

    static {
        WarnlistHandler.BaseCoreGenericHandler();
    }
}

