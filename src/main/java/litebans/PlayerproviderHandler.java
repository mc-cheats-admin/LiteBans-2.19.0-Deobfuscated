package litebans;

import litebans.api.PlayerProvider;
import org.jetbrains.annotations.NotNull;

public final class PlayerproviderHandler
extends PlayerProvider {
    private final PlatformPlugin LiteBansModule_31;
    private final ConfigService c;
    public PlayerproviderHandler(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
        this.c = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
    }

    @Override
    public String provide(@NotNull String string) {
        return string;
    }

    public String toString() {
        return "PlayerProvider";
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"PlayerProvider"};
}

