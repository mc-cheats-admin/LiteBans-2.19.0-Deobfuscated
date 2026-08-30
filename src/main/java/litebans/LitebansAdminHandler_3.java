package litebans;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class LitebansAdminHandler_3
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
    public LitebansAdminHandler_3(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        Object object = new String[]{"litebans.admin", "litebans.broadcast"};
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, object);
        if (this.AsyncBackgroundTask_5.length <= 1) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.LiteBansModule_194("Usage: /litebans broadcast <message>"));
            throw new CommandExitException();
        }
        object = ArrayUtilities.AsyncBackgroundTask_5(this.AsyncBackgroundTask_5);
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler_3.BaseCoreGenericHandler((List)object, this, arg_0));
    }

    private static final boolean BaseCoreGenericHandler(String string, LiteBansModule_144 dy_02, String string2) {
        boolean flag;
        if (StringUtilities.LiteBansModule_31(string2, string, false, 2, null)) {
            dy_02.BaseCoreGenericHandler = string2.substring(string.length());
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(List list, LitebansAdminHandler_3 gj2, LiteBansModule_82 ch2) {
        LiteBansModule_144 dy_02 = new LiteBansModule_144();
        dy_02.BaseCoreGenericHandler = "broadcast";
        String string = "broadcast-type:";
        CollectionUtilities.BaseCoreGenericHandler(list, arg_0 -> LitebansAdminHandler_3.BaseCoreGenericHandler(string, dy_02, arg_0));
        Object object = MessageKey.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(list, " ", null, null, 0, null, null, 62, null), true);
        int n = 10;
        CharSequence charSequence = ch2.BaseCoreGenericHandler((CharSequence)((String)object).substring(n));
        object = gj2;
        n = 0;
        Object object2 = (BroadcastService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
        BroadcastService.BaseCoreGenericHandler(object2, ch2, charSequence, (String)dy_02.BaseCoreGenericHandler, null, gj2.AsyncBackgroundTask_5().LiteBansModule_240(), false, false, gj2.AsyncBackgroundTask_5(), 52, null);
        object = ch2;
        object2 = BroadcastHandler.c;
        flag = false;
        if (object.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            Object object3 = object2;
            Object object4 = object;
            LiteBansModule_303 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[]{dy_02.BaseCoreGenericHandler, charSequence};
            CharSequence charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)object4, (BroadcastHandler)((Object)object3), charSequence2, null, null, 12, null);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"litebans.admin", "litebans.broadcast", "Usage: /litebans broadcast <message>", "broadcast", "broadcast-type:", " ", "\ufeff"};
}

