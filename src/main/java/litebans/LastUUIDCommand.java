package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class LastUUIDCommand
extends AbstractCommand {
    public LastUUIDCommand(@NotNull PlatformPlugin plugin) {
        super("lastuuid", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
{
                        String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)targetObj, (String)ArrayUtilities.LiteBansModule_31(args));
            targetObj = this;
            flag = false;
            targetObj = (DatabaseMonitorService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch2 = targetObj.LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object contextObj = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false, 2, null);
                    CommandArgumentUtils.BaseCoreGenericHandler(this, AllHandler_3.BaseCoreGenericHandler(ch3, MessageKey.bI, iA2, false, 2, null));
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (targetObj.LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"lastuuid"};
}

