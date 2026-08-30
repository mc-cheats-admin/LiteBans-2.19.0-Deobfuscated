package litebans;

import java.util.concurrent.ThreadFactory;

public final class LiteBansModule_217
implements ThreadFactory {
    private final String BaseCoreGenericHandler;
    private final boolean LiteBansModule_31;

    public LiteBansModule_217(String string, boolean flag) {
        this.plugin = string;
        this.LiteBansModule_31 = flag;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.plugin);
        thread.setDaemon(this.LiteBansModule_31);
        return thread;
    }
}

