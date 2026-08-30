package litebans;

import java.util.concurrent.ThreadFactory;

public static final class gc
implements ThreadFactory {
    private final String a;
    private final boolean b;

    public gc(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}

