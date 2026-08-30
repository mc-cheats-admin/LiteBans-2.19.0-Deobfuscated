package litebans;

import org.jetbrains.annotations.NotNull;

public final class CheckmuteHandler
extends CheckBanCommand {
    public CheckmuteHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public BanHandler LiteBansModule_31() {
        return BanHandler.GnuSparseMapHandler;
    }

    @Override
    public MessageKey c() {
        return MessageKey.Utf8Handler;
    }

    @Override
    public MessageKey BaseCoreGenericHandler() {
        return MessageKey.LiteBansModule_23;
    }

    @Override
    public String getName() {
        return "checkmute";
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"checkmute"};
}

