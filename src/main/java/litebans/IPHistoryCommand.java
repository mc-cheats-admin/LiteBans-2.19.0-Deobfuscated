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
{
            Object object = MessageHandler.BaseCoreGenericHandler;
            MessageHandler messageHandler = this;
            MessageHandler fg_03 = messageHandler;
            boolean flag3 = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().HikariDataSource() && !sender.LiteBansModule_194();
            CharSequence charSequence = MessageKey.LiteBansModule_31;
            Object object2 = object;
            if (flag3) {
                ChatFormatter chatFormatter = object2;
                chatFormatter.BaseCoreGenericHandler(charSequence);
                throw new CommandExitException();
            }
            MessageHandler fg_04 = this;
            object = CommandArgumentUtils.BaseCoreGenericHandler(fg_04, (String)ArrayUtilities.LiteBansModule_31(args));
            n = LiteBansModule_389.BaseCoreGenericHandler(args, 1, 10);
            Object object3 = this;
            flag4 = false;
            object3 = (DatabaseMonitorService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag4 = false;
            try {
                object2 = ((DatabaseMonitorService)object3).LiteBansModule_194();
                Closeable closeable = (Closeable)object2;
                Throwable throwable = null;
                try {
                    Object object4 = (LiteBansModule_82)closeable;
                    Object object5 = object2;
                    List list = object5.BaseCoreGenericHandler((String)object);
                    ChatFormatter fo_03 = MessageHandler.BaseCoreGenericHandler;
                    int n2 = list.isEmpty();
                    Object object6 = MessageKey.PlayerQuitListener.BaseCoreGenericHandler("target", object);
                    ChatFormatter fo_04 = fo_03;
                    if (n2 != 0) {
                        ChatFormatter fo_05 = fo_04;
                        fo_05.BaseCoreGenericHandler(object6);
                        throw new CommandExitException();
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, object5.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.ProxyResultSet.BaseCoreGenericHandler("target", object), (CharSequence)"limit", n)));
                    n = Math.min(n, list.size());
                    n2 = n;
                    for (int i = 0; i < n2; ++i) {
                        String string;
                        object6 = (LiteBansModule_297)list.get(i);
                        if (((LiteBansModule_297)object6).i() == null) continue;
                        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null)) {
                            if (n >= list.size()) continue;
                            ++n;
                            continue;
                        }
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object5, (CharSequence)MessageKey.ac.BaseCoreGenericHandler("ip", (Object)string), (LiteBansModule_297)object6, false, 2, null), (CharSequence)"date", () -> IPHistoryCommand.BaseCoreGenericHandler(this, (LiteBansModule_297)object6)));
                    }
                    object4 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object3).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final Object BaseCoreGenericHandler(IPHistoryCommand fX2, LiteBansModule_297 iA2) {
        MessageHandler messageHandler = fX2;
        return ((BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(iA2.LiteBansModule_194().getTime(), true);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"iphistory", "target", "target", "limit", "ip", "date"};
}

