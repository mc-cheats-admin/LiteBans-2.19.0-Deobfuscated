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
{
            Object targetObj = this.LiteBansModule_240().q();
            Object contextObj = targetObj;
            Object resultObj = new ArrayList();
            for (Object helperObj : contextObj) {
                CommandSenderWrapper senderWrapper = (CommandSenderWrapper)helperObj;
                if (!(!ObjectUtilities.BaseCoreGenericHandler(senderWrapper, sender))) continue;
                resultObj.add(helperObj);
            }
            List list = (List)resultObj;
            targetObj = this;
            flag = false;
            targetObj = (DatabaseMonitorService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                contextObj = targetObj.LiteBansModule_194();
                resultObj = (Closeable)contextObj;
                Throwable throwable = null;
                try {
                    Object tempObj = (LiteBansModule_82)resultObj;
                    helperObj = contextObj;
                    CharSequence charSequence = helperObj.BaseCoreGenericHandler(MessageKey.LiteBansModule_32.BaseCoreGenericHandler("num", list.size()));
                    CommandArgumentUtils.BaseCoreGenericHandler(this, charSequence);
                    Iterable iterable = list;
                    for (Object t2 : iterable) {
                        CommandSenderWrapper senderWrapper = (CommandSenderWrapper)t2;
                        LiteBansModule_206 fW2 = new LiteBansModule_206(senderWrapper.i(), (LiteBansModule_82)helperObj, null, false, 0, 28, null).i();
                        MessageHandler messageHandler = fW2;
                        if (!(!((LiteBansModule_206)messageHandler).e())) continue;
                        messageHandler = this;
                        flag7 = false;
                        MessageHandler fg_03 = messageHandler;
                        if (fW2.m() < ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_31()) continue;
                        messageHandler = new CharSequence[]{"result", fW2.c()};
                        CommandArgumentUtils.BaseCoreGenericHandler(this, LiteBansModule_242.BaseCoreGenericHandler(helperObj.BaseCoreGenericHandler(MessageKey.LiteBansModule_3, senderWrapper), (CharSequence[])messageHandler));
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
            catch (SQLException sQLException) {
                if (targetObj.LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"ipreport", "num", "result"};
}

