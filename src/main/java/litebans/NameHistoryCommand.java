package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class NameHistoryCommand
extends AbstractCommand {
    public NameHistoryCommand(@NotNull PlatformPlugin plugin) {
        super("namehistory", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
{
            MessageHandler messageHandler = this;
            String string = CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, (String)ArrayUtilities.LiteBansModule_31(args));
            n = LiteBansModule_389.BaseCoreGenericHandler(args, 1, 10);
            Object object = this;
            object = (DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag2 = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object2 = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    List list = ch3.BaseCoreGenericHandler(string);
                    Object object3 = MessageHandler.BaseCoreGenericHandler;
                    boolean flag5 = list.isEmpty();
                    CharSequence charSequence = MessageKey.PlayerQuitListener;
                    Object object42 = object3;
                    if (flag5) {
                        ChatFormatter chatFormatter = object42;
                        chatFormatter.BaseCoreGenericHandler(charSequence);
                        throw new CommandExitException();
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, ch3.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.dH.BaseCoreGenericHandler("target", (Object)string), (CharSequence)"limit", n)));
                    Iterable iterable = list;
                    n2 = LiteBansModule_20.c(LiteBansModule_348.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(iterable, 10)), 16);
                    object42 = iterable;
                    Object object5 = new LinkedHashMap(n2);
                    Iterator iterator = object42.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        LiteBansModule_297 iA2 = (LiteBansModule_297)t2;
                        Map map = object5;
                        map.put(iA2.BaseCoreGenericHandler(), t2);
                    }
                    object3 = object5;
                    iterable = CollectionUtilities.BaseCoreGenericHandler((Iterable)object3.values(), n);
                    flag8 = false;
                    for (Object object42 : iterable) {
                        object5 = (LiteBansModule_297)object42;
                        bl9 = false;
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)MessageKey.SortHandler, (LiteBansModule_297)object5, false, 2, null));
                    }
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
        i = new String[]{"namehistory", "target", "limit"};
}

