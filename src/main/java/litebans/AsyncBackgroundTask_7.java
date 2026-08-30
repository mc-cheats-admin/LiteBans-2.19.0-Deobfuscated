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
{
            DatabaseMonitorService w2;
            module = w2 = this.plugin;
            try {
                LiteBansModule_82 ch2 = module.LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    w2.BaseCoreGenericHandler(ch3, true);
                    object = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (module.LiteBansModule_31(sQLException)) break;
                throw sQLException;
}
        module = this.plugin;
        String string = "Server information reset ";
        module.BaseCoreGenericHandler.getLogger().severe(string);
}

