package litebans;

public final class AsyncBackgroundTask_17
implements Runnable {
    final /* synthetic */ CommandSenderWrapper BaseCoreGenericHandler;
    final /* synthetic */ String LiteBansModule_31;

    public AsyncBackgroundTask_17(CommandSenderWrapper sender, String string) {
        this.plugin = sender;
        this.LiteBansModule_31 = string;
    }

    @Override
    public final void run() {
        this.plugin.c(this.LiteBansModule_31);
}

