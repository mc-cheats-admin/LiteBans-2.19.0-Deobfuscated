package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_195
extends MessageHandler {
    public LiteBansModule_195(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        boolean flag = false;
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag2 = messageHandler.AsyncBackgroundTask_5().LiteBansModule_194();
        CharSequence charSequence = MessageKey.LiteBansModule_31;
        boolean flag3 = false;
        ChatFormatter fo_03 = chatFormatter;
        boolean flag4 = !flag2;
        boolean flag5 = false;
        if (flag4) {
            ChatFormatter fo_04 = fo_03;
            boolean flag6 = false;
            fo_04.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        messageHandler = this;
        flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_195.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_195 f02, LiteBansModule_82 ch2) {
        Object object = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        Object object2 = MessageKey.ServerEventListener;
        boolean flag2 = false;
        Object object3 = object;
        boolean flag3 = false;
        if (flag) {
            ChatFormatter chatFormatter = object3;
            boolean flag4 = false;
            chatFormatter.BaseCoreGenericHandler(object2);
            throw new CommandExitException();
        }
        object = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
        flag = false;
        object2 = object.iterator();
        while (object2.hasNext()) {
            Object e = object2.next();
            object3 = (BansHandler_2)e;
            flag3 = false;
            ch2.BaseCoreGenericHandler((BansHandler_2)object3);
        }
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f02, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.ServerSyncService, "All templates have been reset "));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"All templates have been reset successfully."};
    }

    }

