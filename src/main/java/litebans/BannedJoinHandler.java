package litebans;

import org.jetbrains.annotations.NotNull;

public final class BannedJoinHandler
extends MessageHandler {
    private final String e;
    private final CharSequence g;
    private final boolean AsyncBackgroundTask_5;
    public BannedJoinHandler(@NotNull PlatformPlugin plugin, @NotNull String string, @NotNull CharSequence charSequence, boolean flag) {
        super(plugin);
        this.e = string;
        this.g = charSequence;
        this.AsyncBackgroundTask_5 = flag;
    }

    @Override
    public void run() {
        CommandThrottleService v2 = this.LiteBansModule_240().BaseCoreGenericHandler(CommandThrottleService.class);
        if (!v2.BaseCoreGenericHandler((byte)2, HexEncodingHelper.LiteBansModule_194(this.e))) {
            MessageHandler messageHandler = this;
            ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> BannedJoinHandler.BaseCoreGenericHandler(this, arg_0));
}

    private static final KotlinUnitHandler BaseCoreGenericHandler(BannedJoinHandler gl2, LiteBansModule_82 ch2) {
        Object targetObj = gl2;
        Object[] objectArray = (Object[])targetObj.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
        BroadcastService.BaseCoreGenericHandler((BroadcastService)objectArray, ch2, gl2.g, "banned_join", null, null, false, false, null, 124, null);
        if (gl2.AsyncBackgroundTask_5 && ch2.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            targetObj = ServerSyncService.GnuSparseMapHandler;
            objectArray = new CharSequence[]{gl2.e, gl2.g};
            flag2 = false;
            CommandArgumentUtils.BaseCoreGenericHandler(ch2, BroadcastHandler.i, ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null), null, null, 12, null);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

