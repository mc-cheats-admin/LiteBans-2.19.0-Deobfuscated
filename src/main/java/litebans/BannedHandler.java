package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BannedHandler
extends MessageHandler {
    private final NoneHandler_2 LiteBansModule_194;
    private final CommandSenderWrapper LiteBansModule_240;
    private final LiteBansModule_297 AsyncBackgroundTask_5;
    private final CharSequence GnuSparseMapHandler;
    private final CommandSenderWrapper g;
    private final boolean Utf8Handler_2;
    private final boolean i;
    public BannedHandler(@NotNull NoneHandler_2 cz2, @Nullable CommandSenderWrapper sender, @Nullable LiteBansModule_297 iA2, @NotNull CharSequence charSequence, @NotNull PlatformPlugin plugin, @Nullable CommandSenderWrapper senderWrapper, boolean flag, boolean flag2) {
        super(plugin);
        this.LiteBansModule_194 = cz2;
        this.LiteBansModule_240 = sender;
        this.AsyncBackgroundTask_5 = iA2;
        this.GnuSparseMapHandler = charSequence;
        this.g = senderWrapper;
        this.Utf8Handler_2 = flag;
        this.i = flag2;
    }

    public /* synthetic */ BannedHandler(NoneHandler_2 cz2, CommandSenderWrapper sender, LiteBansModule_297 iA2, CharSequence charSequence, PlatformPlugin plugin, CommandSenderWrapper senderWrapper, boolean flag, boolean flag2, int n, LiteBansModule_14 aJ2) {
        if ((n & 0x20) != 0) {
            senderWrapper = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        }
        if ((n & 0x40) != 0) {
            flag = true;
        }
        if ((n & 0x80) != 0) {
            SilentHandler dZ2 = cz2.q();
            ObjectUtilities.BaseCoreGenericHandler(dZ2);
            flag2 = dZ2.AsyncBackgroundTask_5();
        }
        this(cz2, sender, iA2, charSequence, plugin, senderWrapper, flag, flag2);
    }

    public final NoneHandler_2 LiteBansModule_194() {
        return this.LiteBansModule_194;
    }

    public final CommandSenderWrapper LiteBansModule_31() {
        return this.LiteBansModule_240;
    }

    public final LiteBansModule_297 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final CommandSenderWrapper e() {
        return this.g;
    }

    public final boolean LiteBansModule_240() {
        return this.Utf8Handler_2;
    }

    public final boolean g() {
        return this.i;
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> BannedHandler.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(BannedHandler g12, LiteBansModule_82 ch2) {
        BannedHandler g13 = g12;
        LiteBansModule_82 ch3 = ch2;
        Object contextObj = g12;
        LiteBansModule_82 ch4 = ch2;
        Object resultObj = g12.GnuSparseMapHandler;
        Object helperObj = resultObj;
        if (((BannedHandler)contextObj).g()) {
            targetObj = MessageKey.LiteBansModule_83;
            helperObj = "" + targetObj + helperObj;
        }
        if (((BannedHandler)contextObj).BaseCoreGenericHandler() != null) {
            helperObj = AllHandler_3.BaseCoreGenericHandler(ch4, helperObj, ((BannedHandler)contextObj).BaseCoreGenericHandler(), false, 2, null);
        }
        helperObj = GeoIPLookupService.BaseCoreGenericHandler(ch4, helperObj, ((BannedHandler)contextObj).LiteBansModule_194());
        contextObj = AllHandler_3.BaseCoreGenericHandler(ch4, ch4.BaseCoreGenericHandler(helperObj, ((BannedHandler)contextObj).LiteBansModule_31()), ((BannedHandler)contextObj).LiteBansModule_194().q(), false, 2, null);
        resultObj = g13.LiteBansModule_194();
        flag = false;
        SilentHandler dZ2 = this.q();
        ObjectUtilities.BaseCoreGenericHandler(dZ2);
        helperObj = dZ2;
        targetObj = g13;
        LiteBansModule_82 ch5 = ch3;
        BroadcastHandler ij2 = targetObj.LiteBansModule_194().c() ? BroadcastHandler.Utf8Handler_2 : (targetObj.g() ? BroadcastHandler.BroadcastService : BroadcastHandler.AsyncBackgroundTask_22);
        targetObj = g13;
        Object tempObj = (BroadcastService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
        flag4 = false;
        BroadcastService.BaseCoreGenericHandler((BroadcastService)tempObj, ch3, contextObj, ij2.LiteBansModule_194(), ((SilentHandler)helperObj).ServerSyncService(), ((SilentHandler)helperObj).GnuSparseMapHandler(), false, false, g13.e(), 48, null);
        CommandArgumentUtils.BaseCoreGenericHandler(ch3, ij2, contextObj, ((SilentHandler)helperObj).ServerSyncService(), null, 8, null);
        targetObj = g13;
        tempObj = ch3;
        flag4 = false;
        NoneHandler_2 cz2 = targetObj.LiteBansModule_194();
        SilentHandler dZ3 = cz2.q();
        ObjectUtilities.BaseCoreGenericHandler(dZ3);
        SilentHandler dZ4 = dZ3;
        CharSequence charSequence = dZ4.ServerSyncService();
        if ((charSequence.c() == BanHandler.GnuSparseMapHandler || charSequence.c() == BanHandler.c) && targetObj.LiteBansModule_240() && targetObj.LiteBansModule_31() != null) {
            String string;
            switch (LiteBansModule_58.BaseCoreGenericHandler[dZ4.ServerSyncService().c().ordinal()]) {
                case 1: {
                    string = "banned";
                    break;
                }
                case 2: {
                    string = "muted";
                    break;
                }
                case 3: {
                    string = "warned";
                    break;
                }
                case 4: {
                    string = "kicked";
                    break;
                }
                default: {
                    AssertionUtilities.BaseCoreGenericHandler();
                    throw new CommandExitException();
}
            charSequence = string;
            MessageHandler messageHandler = (MessageHandler)targetObj;
            BroadcastService o2 = (BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
            o2.BaseCoreGenericHandler((LiteBansModule_82)tempObj, targetObj.LiteBansModule_31(), dZ4, cz2.D(), (String)charSequence);
        }
        tempObj = g13;
        flag4 = false;
        targetObj = ((ConfigService)((MessageHandler)tempObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31().BaseCoreGenericHandler(((SilentHandler)helperObj).BaseCoreGenericHandler(g13.LiteBansModule_194()));
        if ((targetObj).length() > 0 && (ij2 == BroadcastHandler.AsyncBackgroundTask_22 || ij2 == BroadcastHandler.BroadcastService)) {
            ContentHandler.GnuSparseMapHandler.BaseCoreGenericHandler(ch3, g13.LiteBansModule_194(), (String)targetObj);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void c() {
        e = new String[]{"banned", "muted", "warned", "kicked", "banned", "muted", "warned", "kicked", "banned", "muted", "warned", "kicked"};
}

