package litebans;

import java.io.Closeable;
import java.sql.SQLException;
public final class AsyncBackgroundTask_7
implements Runnable {
    final /* synthetic */ DatabaseMonitorService BaseCoreGenericHandler;
        public AsyncBackgroundTask_7(DatabaseMonitorService w2) {
        this.plugin = w2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        PluginModule module;
        block7: {
            DatabaseMonitorService w2;
            module = w2 = this.plugin;
            try {
                LiteBansModule_83 ch2 = module.LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object targetObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    w2.BaseCoreGenericHandler(ch3, true);
                    targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (module.LiteBansModule_31(sQLException)) break block7;
                throw sQLException;
            }
        }
        module = this.plugin;
        String string = "Server information reset ";
        module.BaseCoreGenericHandler.getLogger().severe(string);
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"Server information reset complete."};
    }

    static {
        AsyncBackgroundTask_7.BaseCoreGenericHandler();
    }
}

