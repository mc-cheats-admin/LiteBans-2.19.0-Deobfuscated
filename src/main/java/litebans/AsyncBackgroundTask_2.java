package litebans;

public final class AsyncBackgroundTask_2
implements Runnable {
    final /* synthetic */ CommandSenderWrapper BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_144 LiteBansModule_31;

    public AsyncBackgroundTask_2(CommandSenderWrapper sender, LiteBansModule_144 dy_02) {
        this.plugin = sender;
        this.LiteBansModule_31 = dy_02;
    }

    @Override
    public final void run() {
        this.plugin.c(this.LiteBansModule_31.BaseCoreGenericHandler.toString());
    }
}

