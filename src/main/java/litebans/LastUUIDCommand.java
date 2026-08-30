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
            Object object = this;
            String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object, (String)ArrayUtilities.LiteBansModule_31(args));
            object = this;
            flag = false;
            object = (DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false, 2, null);
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)MessageKey.bI, iA2, false, 2, null));
                    object2 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"lastuuid"};
}

