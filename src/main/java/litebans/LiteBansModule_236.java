package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_236
extends GeoIPLookupService_3 {
    public LiteBansModule_236(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public String c(@NotNull Object targetObj) {
        MessageHandler messageHandler = this;
        return ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
}

