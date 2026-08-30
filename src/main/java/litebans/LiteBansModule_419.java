package litebans;

import litebans.api.RandomID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_419
extends RandomID {
    private final PlatformPlugin BaseCoreGenericHandler;

    public LiteBansModule_419(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public String convert(long l3) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        return configService.Utf8Handler_2().BaseCoreGenericHandler(l3);
    }

    @Override
    public long reveal(@Nullable String string) {
        if (string == null) {
            return -1L;
        }
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        return configService.Utf8Handler_2().LiteBansModule_31(string);
}

