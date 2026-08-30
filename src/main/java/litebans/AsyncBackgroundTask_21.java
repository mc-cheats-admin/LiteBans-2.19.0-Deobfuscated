package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

public final class AsyncBackgroundTask_21
extends PluginModule
implements Runnable {
    public static final LiteBansModule_272 AsyncBackgroundTask_5;
    private final ArrayBlockingQueue LiteBansModule_194 = new ArrayBlockingQueue(2048);
    private final AtomicBoolean c = new AtomicBoolean();
    public static final long LiteBansModule_31;
    public static final int e;

    public AsyncBackgroundTask_21(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final ArrayBlockingQueue BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    @Override
    public void e() {
        AtomicBoolean atomicBoolean = this.c;
        boolean flag = false;
        atomicBoolean.set(false);
        this.plugin.LiteBansModule_31(this, 64L, 64L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.c;
        boolean flag = false;
        Object object = atomicBoolean;
        int n = 0;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            object = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                int n2;
                AsyncBackgroundTask_21 s2 = this;
                boolean flag2 = false;
                n = s2.BaseCoreGenericHandler().size() <= 256 ? 0 : (s2.BaseCoreGenericHandler().size() <= 512 ? 1 : (s2.BaseCoreGenericHandler().size() <= 1024 ? 2 : (s2.BaseCoreGenericHandler().size() < 2048 ? 3 : 4)));
                int n3 = 0;
                Object object2 = this;
                boolean flag3 = false;
                switch (n) {
                    case 0: {
                        n2 = 40;
                        break;
                    }
                    case 1: {
                        n2 = 60;
                        break;
                    }
                    case 2: {
                        n2 = 256;
                        break;
                    }
                    case 3: {
                        n2 = 512;
                        break;
                    }
                    case 4: {
                        n2 = 2048;
                        break;
                    }
                    default: {
                        AssertionUtilities.BaseCoreGenericHandler();
                        throw new CommandExitException();
                    }
                }
                n3 = n2;
                if (DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)object, 0, 1, null) && n == 0) {
                    n3 = 1;
                }
                object2 = object;
                flag3 = false;
                try {
                    LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (LiteBansModule_82)closeable;
                        boolean flag4 = false;
                        LiteBansModule_82 ch3 = ch2;
                        boolean flag5 = false;
                        int n4 = 1;
                        int n5 = n3;
                        if (n4 <= n5) {
                            while ((LiteBansModule_95)this.LiteBansModule_194.poll() != null) {
                                LiteBansModule_95 cp_02;
                                AllHandler_3.BaseCoreGenericHandler(ch3, cp_02.c(), cp_02.g(), cp_02.LiteBansModule_31(), false, false, 24, null);
                                if (n4 == n5) break;
                                ++n4;
                            }
                        }
                        object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Exception exception) {
                if (exception instanceof InterruptedException) {
                    return;
                }
                ((DatabaseMonitorService)object).BaseCoreGenericHandler(exception);
            }
            finally {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                boolean flag6 = false;
                atomicBoolean2.set(false);
            }
        }
    }

    @Override
    public void LiteBansModule_31() {
        this.c();
        this.e();
    }

    static {
        e = 2048;
        LiteBansModule_31 = 64L;
        AsyncBackgroundTask_5 = new LiteBansModule_272(null);
    }
}

