package litebans;

static class AsyncBackgroundTask_6
implements Runnable {
    final /* synthetic */ BukkitPlugin BaseCoreGenericHandler;

    AsyncBackgroundTask_6(BukkitPlugin bukkitPlugin) {
        this.plugin = bukkitPlugin;
    }

    @Override
    public void run() {
        if (!this.plugin.AsyncBackgroundTask_5()) {
            Thread.sleep(1250L);
        }
        StackTraceAnalyzer hb_02 = new StackTraceAnalyzer(this.plugin);
        hb_02.BaseCoreGenericHandler(StackTraceAnalyzer.BaseCoreGenericHandler(StackTraceAnalyzer.class), true);
    }
}

