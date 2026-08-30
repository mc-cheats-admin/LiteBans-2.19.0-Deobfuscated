package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_196
extends MessageHandler {
        public LiteBansModule_196(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag2 = messageHandler.AsyncBackgroundTask_5().LiteBansModule_195();
        CharSequence charSequence = MessageKey.LiteBansModule_31;
        ChatFormatter fo_03 = chatFormatter;
        boolean flag4 = !flag2;
        if (flag4) {
            ChatFormatter fo_04 = fo_03;
            fo_04.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        messageHandler = this;
        flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_196.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_196 f02, LiteBansModule_83 ch2) {
        Object targetObj = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        Object contextObj = MessageKey.ServerEventListener;
        Object resultObj = targetObj;
        if (flag) {
            ChatFormatter chatFormatter = resultObj;
            chatFormatter.BaseCoreGenericHandler(contextObj);
            throw new CommandExitException();
        }
        targetObj = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
        flag = false;
        contextObj = targetObj.iterator();
        while (contextObj.hasNext()) {
            Object e = contextObj.next();
            resultObj = (BansHandler_2)e;
            flag3 = false;
            ch2.BaseCoreGenericHandler((BansHandler_2)resultObj);
        }
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f02, (CharSequence)LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.ServerSyncService, "All templates have been reset "));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"All templates have been reset successfully."};
    }

    static {
        LiteBansModule_196.BaseCoreGenericHandler();
    }
}

