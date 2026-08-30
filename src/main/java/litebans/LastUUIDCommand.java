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
        block7: {
                        String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)targetObj, (String)ArrayUtilities.LiteBansModule_31(args));
            targetObj = this;
            flag = false;
            targetObj = (DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object contextObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    LiteBansModule_298 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false, 2, null);
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)MessageKey.bI, iA2, false, 2, null));
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) break block7;
                throw sQLException;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"lastuuid"};
    }

    static {
        LastUUIDCommand.BaseCoreGenericHandler();
    }
}

