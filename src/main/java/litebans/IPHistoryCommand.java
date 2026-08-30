package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class IPHistoryCommand
extends AbstractCommand {
        public IPHistoryCommand(@NotNull PlatformPlugin plugin) {
        super("iphistory", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block11: {
            Object targetObj = MessageHandler.BaseCoreGenericHandler;
            MessageHandler messageHandler = this;
            MessageHandler fg_03 = messageHandler;
            boolean flag3 = ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().HikariDataSource() && !sender.LiteBansModule_195();
            CharSequence charSequence = MessageKey.LiteBansModule_31;
            Object contextObj = targetObj;
            if (flag3) {
                ChatFormatter chatFormatter = contextObj;
                chatFormatter.BaseCoreGenericHandler(charSequence);
                throw new CommandExitException();
            }
            MessageHandler fg_04 = this;
            targetObj = CommandArgumentUtils.BaseCoreGenericHandler(fg_04, (String)ArrayUtilities.LiteBansModule_31(args));
            n = LiteBansModule_391.BaseCoreGenericHandler(args, 1, 10);
                        flag4 = false;
            resultObj = (DatabaseMonitorService)((MessageHandler)resultObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag4 = false;
            try {
                contextObj = ((DatabaseMonitorService)resultObj).LiteBansModule_195();
                Closeable closeable = (Closeable)contextObj;
                Throwable throwable = null;
                try {
                    Object helperObj = (LiteBansModule_83)closeable;
                    Object tempObj = contextObj;
                    List list = tempObj.BaseCoreGenericHandler((String)targetObj);
                    ChatFormatter fo_03 = MessageHandler.BaseCoreGenericHandler;
                    int n2 = list.isEmpty();
                    Object object6 = MessageKey.PlayerQuitListener.BaseCoreGenericHandler("target", targetObj);
                    ChatFormatter fo_04 = fo_03;
                    if (n2 != 0) {
                        ChatFormatter fo_05 = fo_04;
                        fo_05.BaseCoreGenericHandler(object6);
                        throw new CommandExitException();
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, tempObj.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.ProxyResultSet.BaseCoreGenericHandler("target", targetObj), (CharSequence)"limit", n)));
                    n = Math.min(n, list.size());
                    n2 = n;
                    for (int i = 0; i < n2; ++i) {
                        String string;
                        object6 = (LiteBansModule_298)list.get(i);
                        if (((LiteBansModule_298)object6).i() == null) continue;
                        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null)) {
                            if (n >= list.size()) continue;
                            ++n;
                            continue;
                        }
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_83)tempObj, (CharSequence)MessageKey.ac.BaseCoreGenericHandler("ip", (Object)string), (LiteBansModule_298)object6, false, 2, null), (CharSequence)"date", () -> IPHistoryCommand.BaseCoreGenericHandler(this, (LiteBansModule_298)object6)));
                    }
                    helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (((DatabaseMonitorService)resultObj).LiteBansModule_31(sQLException)) break block11;
                throw sQLException;
            }
        }
    }

    private static final Object BaseCoreGenericHandler(IPHistoryCommand fX2, LiteBansModule_298 iA2) {
        MessageHandler messageHandler = fX2;
        return ((BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(iA2.LiteBansModule_195().getTime(), true);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"iphistory", "target", "target", "limit", "ip", "date"};
    }

    static {
        IPHistoryCommand.BaseCoreGenericHandler();
    }
}

