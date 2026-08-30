package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class IPReportCommand
extends AbstractCommand {
        public IPReportCommand(@NotNull PlatformPlugin plugin) {
        super("ipreport", plugin);
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block9: {
            Object targetObj = this.LiteBansModule_241().q();
            Object contextObj = targetObj;
            Object resultObj = new ArrayList();
            for (Object helperObj : contextObj) {
                CommandSenderWrapper senderWrapper = (CommandSenderWrapper)helperObj;
                if (!(!ObjectUtilities.BaseCoreGenericHandler((Object)senderWrapper, sender))) continue;
                resultObj.add(helperObj);
            }
            List list = (List)resultObj;
            targetObj = this;
            flag = false;
            targetObj = (DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                contextObj = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                resultObj = (Closeable)contextObj;
                Throwable throwable = null;
                try {
                    Object tempObj = (LiteBansModule_83)resultObj;
                    helperObj = contextObj;
                    CharSequence charSequence = helperObj.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_32.BaseCoreGenericHandler("num", (Object)list.size()));
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, charSequence);
                    Iterable iterable = list;
                    for (Object t2 : iterable) {
                        CommandSenderWrapper senderWrapper = (CommandSenderWrapper)t2;
                        LiteBansModule_207 fW2 = new LiteBansModule_207(senderWrapper.i(), (LiteBansModule_83)helperObj, null, false, 0, 28, null).i();
                        MessageHandler messageHandler = fW2;
                        if (!(!((LiteBansModule_207)messageHandler).e())) continue;
                        messageHandler = this;
                        flag7 = false;
                        MessageHandler fg_03 = messageHandler;
                        if (fW2.m() < ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_31()) continue;
                        messageHandler = new CharSequence[]{"result", fW2.c()};
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)LiteBansModule_243.BaseCoreGenericHandler(helperObj.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_3, senderWrapper), (CharSequence[])messageHandler));
                    }
                    tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler((Closeable)resultObj, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) break block9;
                throw sQLException;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"ipreport", "num", "result"};
    }

    static {
        IPReportCommand.BaseCoreGenericHandler();
    }
}

