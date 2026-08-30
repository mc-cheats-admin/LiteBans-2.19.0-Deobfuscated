package litebans;

import org.jetbrains.annotations.NotNull;

public final class LitebansAdminHandler_4
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
        public LitebansAdminHandler_4(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        Object targetObj = new String[]{"litebans.admin", "litebans.unlink"};
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (String[])targetObj);
        targetObj = this;
        ((DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler_4.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LitebansAdminHandler_4 go2, LiteBansModule_83 ch2) {
        Object targetObj = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        CharSequence charSequence = MessageKey.ServerEventListener;
        ChatFormatter chatFormatter = targetObj;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            fo_03.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        targetObj = go2.AsyncBackgroundTask_5[1];
        LiteBansModule_298 iA2 = ch2.c((String)targetObj);
        if (iA2 == null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.aN);
            throw new CommandExitException();
        }
        LiteBansModule_298 iA3 = iA2;
        ch2.BaseCoreGenericHandler(iA3);
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)go2, (CharSequence)(BlackHandler.c("Player ") + BlackHandler.g(iA3.BaseCoreGenericHandler()) + BlackHandler.c(" has been unlinked ")));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"litebans.admin", "litebans.unlink", "Player ", " has been unlinked successfully."};
    }

    static {
        LitebansAdminHandler_4.BaseCoreGenericHandler();
    }
}

