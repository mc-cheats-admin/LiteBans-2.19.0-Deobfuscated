package litebans;

public final class PlayerHandler
implements LiteBansModule_200 {
    final /* synthetic */ NoneHandler_2 AsyncBackgroundTask_5;
    final /* synthetic */ ServerSyncService g;
    final /* synthetic */ CommandSenderWrapper LiteBansModule_194;
    PlayerHandler(NoneHandler_2 cz2, ServerSyncService u2, CommandSenderWrapper sender) {
        this.AsyncBackgroundTask_5 = cz2;
        this.g = u2;
        this.LiteBansModule_194 = sender;
    }

    @Override
    public boolean BaseCoreGenericHandler(LiteBansModule_15 aK2, BroadcastHandler ij2, String string) {
        if (ij2 == BroadcastHandler.g && ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)this.AsyncBackgroundTask_5.AsyncBackgroundTask_21()) && this.g.LiteBansModule_31(this)) {
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.LiteBansModule_194, GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_99.BaseCoreGenericHandler("player", (Object)this.AsyncBackgroundTask_5.AsyncBackgroundTask_21()), (CharSequence)"executor", (Object)this.AsyncBackgroundTask_5.H()), null, 4, null);
        }
        return true;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"player", "executor"};
}

