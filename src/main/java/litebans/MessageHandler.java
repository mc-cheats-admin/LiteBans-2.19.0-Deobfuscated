package litebans;

import org.jetbrains.annotations.NotNull;

public abstract class MessageHandler
implements Runnable {
    public static final ChatFormatter BaseCoreGenericHandler = new ChatFormatter(null);
    private final PlatformPlugin c;
    private static final ThreadLocal LiteBansModule_31 = new ThreadLocal();

    public MessageHandler(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
    }

    public final PlatformPlugin LiteBansModule_240() {
        return this.c;
    }

    public final ConfigService LiteBansModule_31() {
        return this.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
    }

    public final PunishmentTableService e() {
        return this.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
    }

    public final BroadcastService BaseCoreGenericHandler() {
        return this.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
    }

    public final DatabaseMonitorService g() {
        return this.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public final CommandSenderWrapper AsyncBackgroundTask_5() {
        Object t2 = LiteBansModule_31.get();
        ObjectUtilities.BaseCoreGenericHandler(t2);
        return (CommandSenderWrapper)t2;
    }

    @Override
    public void run() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public void i() {
    }

    public void LiteBansModule_194() {
    }

    public static final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull CharSequence charSequence, @NotNull PlatformPlugin plugin) {
        BaseCoreGenericHandler.BaseCoreGenericHandler(sender, charSequence, plugin);
    }

    public static final /* synthetic */ ThreadLocal c() {
        return LiteBansModule_31;
}

