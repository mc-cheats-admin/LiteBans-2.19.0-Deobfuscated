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
        Object object = new String[]{"litebans.admin", "litebans.unlink"};
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (String[])object);
        object = this;
        boolean flag = false;
        ((DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler_4.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LitebansAdminHandler_4 go2, LiteBansModule_82 ch2) {
        Object object = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        CharSequence charSequence = MessageKey.ServerEventListener;
        boolean flag2 = false;
        ChatFormatter chatFormatter = object;
        boolean flag3 = false;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            boolean flag4 = false;
            fo_03.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        object = go2.AsyncBackgroundTask_5[1];
        LiteBansModule_297 iA2 = ch2.c((String)object);
        if (iA2 == null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.aN);
            throw new CommandExitException();
        }
        LiteBansModule_297 iA3 = iA2;
        ch2.BaseCoreGenericHandler(iA3);
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)go2, (CharSequence)(BlackHandler.c("Player ") + BlackHandler.g(iA3.BaseCoreGenericHandler()) + BlackHandler.c(" has been unlinked ")));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"litebans.admin", "litebans.unlink", "Player ", " has been unlinked successfully."};
    }

    }

