package litebans;

import org.jetbrains.annotations.NotNull;

public final class MutedplayerHandler
extends MessageHandler {
    private final SilentHandler LiteBansModule_195;
    private final CharSequence AsyncBackgroundTask_5;
        public MutedplayerHandler(@NotNull PlatformPlugin plugin, @NotNull SilentHandler dZ2, @NotNull CharSequence charSequence) {
        super(plugin);
        this.LiteBansModule_195 = dZ2;
        this.AsyncBackgroundTask_5 = charSequence;
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        if (!((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().B()) {
            return;
        }
        messageHandler = this;
        flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> MutedplayerHandler.BaseCoreGenericHandler(this, arg_0));
    }

    private final MessageKey LiteBansModule_31() {
        return this.LiteBansModule_195.HoverTextFormatter() ? MessageKey.AsyncBackgroundTask : MessageKey.ak;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(MutedplayerHandler gP2, LiteBansModule_83 ch2) {
        CommandThrottleService v2 = (CommandThrottleService)ch2.e().BaseCoreGenericHandler(CommandThrottleService.class);
        CharSequence charSequence = GeoIPLookupService.BaseCoreGenericHandler(ch2, gP2.LiteBansModule_195, 0, 0, 6, null);
        if (charSequence == null) {
            charSequence = gP2.LiteBansModule_31();
        }
        CharSequence charSequence2 = charSequence;
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)gP2, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(ch2, gP2.LiteBansModule_195, gP2.AsyncBackgroundTask_5(), charSequence2, 0L, 8, null));
        if (!v2.BaseCoreGenericHandler((byte)1, gP2.AsyncBackgroundTask_5().BaseCoreGenericHandler())) {
            Object targetObj = gP2;
            if (((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().c()) {
                MessageHandler messageHandler = gP2;
                MessageHandler fg_03 = messageHandler;
                targetObj = GeoIPLookupService.BaseCoreGenericHandler(ch2, gP2.LiteBansModule_195, gP2.AsyncBackgroundTask_5(), (CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_56.BaseCoreGenericHandler("mutedPlayer", (Object)(((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().SetHandler() ? gP2.AsyncBackgroundTask_5().g() : gP2.AsyncBackgroundTask_5().i())), (CharSequence)"message", gP2.AsyncBackgroundTask_5), 0L, 8, null);
                MessageHandler fg_04 = gP2;
                BroadcastService o2 = (BroadcastService)fg_04.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                flag2 = false;
                BroadcastService.BaseCoreGenericHandler(o2, ch2, (CharSequence)targetObj, "mute", BanHandler.GnuSparseMapHandler, gP2.LiteBansModule_195.GnuSparseMapHandler(), false, false, null, 112, null);
                CommandArgumentUtils.BaseCoreGenericHandler(ch2, BroadcastHandler.q, (CharSequence)targetObj, null, null, 12, null);
            }
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"mutedPlayer", "message", "mute"};
    }

    static {
        MutedplayerHandler.BaseCoreGenericHandler();
    }
}

