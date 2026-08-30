package litebans;

import org.jetbrains.annotations.NotNull;

public final class LitebansAdminHandler_2
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
    public LitebansAdminHandler_2(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        Object targetObj = new String[]{"litebans.admin", "litebans.reveal"};
        CommandArgumentUtils.BaseCoreGenericHandler(this, (String[])targetObj);
        if (ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5[1], (Object)"seed") && this.AsyncBackgroundTask_5().LiteBansModule_194()) {
            targetObj = this;
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.c(String.valueOf(((ConfigService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ContinueEvictHandler())));
            throw new CommandExitException();
        }
                targetObj = ((ConfigService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).Utf8Handler_2();
        if (ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5[1], (Object)"web") && this.AsyncBackgroundTask_5().LiteBansModule_194()) {
            contextObj = new StringBuilder();
            for (n = 0; n < 1000; ++n) {
                ((StringBuilder)contextObj).append((String)targetObj.BaseCoreGenericHandler().get(n));
            }
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.c("" + targetObj.LiteBansModule_31() + ':' + contextObj));
            throw new CommandExitException();
        }
        long l3 = targetObj.LiteBansModule_31(this.AsyncBackgroundTask_5[1]);
        if (l3 == -1L) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(BlackHandler.LiteBansModule_194("Invalid "));
            throw new CommandExitException();
        }
        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.AsyncBackgroundTask_5(), BlackHandler.c(String.valueOf(l3)), null, 4, null);
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"litebans.admin", "litebans.reveal", "seed", "web", "Invalid ID."};
}

