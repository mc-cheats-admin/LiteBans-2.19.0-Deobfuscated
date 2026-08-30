package litebans;

import org.jetbrains.annotations.NotNull;

public final class CheckwarnHandler
extends CheckBanCommand {
    public CheckwarnHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public BanHandler LiteBansModule_31() {
        return BanHandler.c;
    }

    @Override
    public MessageKey c() {
        return MessageKey.SelectorHandler;
    }

    @Override
    public MessageKey BaseCoreGenericHandler() {
        return MessageKey.AsyncBackgroundTask_8;
    }

    @Override
    public String getName() {
        return "checkwarn";
    }

    private static final void BaseCoreGenericHandler() {
        GnuSparseMapHandler = new String[]{"checkwarn"};
}

