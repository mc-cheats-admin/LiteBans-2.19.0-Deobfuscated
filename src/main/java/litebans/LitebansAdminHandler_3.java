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
        Object targetObj = new String[]{"litebans.admin", "litebans.broadcast"};
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, targetObj);
        if (this.AsyncBackgroundTask_5.length <= 1) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.LiteBansModule_195("Usage: /litebans broadcast <message>"));
            throw new CommandExitException();
        }
        targetObj = ArrayUtilities.AsyncBackgroundTask_5(this.AsyncBackgroundTask_5);
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler_3.BaseCoreGenericHandler((List)targetObj, this, arg_0));
    }

    private static final boolean BaseCoreGenericHandler(String string, LiteBansModule_145 dy_02, String string2) {
        boolean flag;
        if (StringUtilities.LiteBansModule_31(string2, string, false, 2, null)) {
            dy_02.BaseCoreGenericHandler = string2.substring(string.length());
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(List list, LitebansAdminHandler_3 gj2, LiteBansModule_83 ch2) {
        LiteBansModule_145 dy_02 = new LiteBansModule_145();
        dy_02.BaseCoreGenericHandler = "broadcast";
        String string = "broadcast-type:";
        CollectionUtilities.BaseCoreGenericHandler(list, arg_0 -> LitebansAdminHandler_3.BaseCoreGenericHandler(string, dy_02, arg_0));
        Object targetObj = MessageKey.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(list, " ", null, null, 0, null, null, 62, null), true);
        int n = 10;
        CharSequence charSequence = ch2.BaseCoreGenericHandler((CharSequence)((String)targetObj).substring(n));
        targetObj = gj2;
        n = 0;
        Object contextObj = (BroadcastService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
        BroadcastService.BaseCoreGenericHandler(contextObj, ch2, charSequence, (String)dy_02.BaseCoreGenericHandler, null, gj2.AsyncBackgroundTask_5().LiteBansModule_241(), false, false, gj2.AsyncBackgroundTask_5(), 52, null);
        targetObj = ch2;
        contextObj = BroadcastHandler.c;
        flag = false;
        if (targetObj.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            Object resultObj = contextObj;
            Object helperObj = targetObj;
            LiteBansModule_304 iF2 = ServerSyncService.GnuSparseMapHandler;
            Object[] objectArray = new CharSequence[]{dy_02.BaseCoreGenericHandler, charSequence};
            CharSequence charSequence2 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_83)helperObj, (BroadcastHandler)((Object)resultObj), charSequence2, null, null, 12, null);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"litebans.admin", "litebans.broadcast", "Usage: /litebans broadcast <message>", "broadcast", "broadcast-type:", " ", "\ufeff"};
    }

    static {
        LitebansAdminHandler_3.BaseCoreGenericHandler();
    }
}

