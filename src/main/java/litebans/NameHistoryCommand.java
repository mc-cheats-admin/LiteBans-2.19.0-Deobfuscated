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
        block10: {
            MessageHandler messageHandler = this;
            String string = CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, (String)ArrayUtilities.LiteBansModule_31(args));
            n = LiteBansModule_391.BaseCoreGenericHandler(args, 1, 10);
                        targetObj = (DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag2 = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object contextObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    List list = ch3.BaseCoreGenericHandler(string);
                    Object resultObj = MessageHandler.BaseCoreGenericHandler;
                    boolean flag5 = list.isEmpty();
                    CharSequence charSequence = MessageKey.PlayerQuitListener;
                    Object object42 = resultObj;
                    if (flag5) {
                        ChatFormatter chatFormatter = object42;
                        chatFormatter.BaseCoreGenericHandler(charSequence);
                        throw new CommandExitException();
                    }
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, ch3.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.dH.BaseCoreGenericHandler("target", (Object)string), (CharSequence)"limit", n)));
                    Iterable iterable = list;
                    n2 = LiteBansModule_20.c(LiteBansModule_350.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(iterable, 10)), 16);
                    object42 = iterable;
                    Object tempObj = new LinkedHashMap(n2);
                    Iterator iterator = object42.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        LiteBansModule_298 iA2 = (LiteBansModule_298)t2;
                        Map map = tempObj;
                        map.put(iA2.BaseCoreGenericHandler(), t2);
                    }
                    resultObj = tempObj;
                    iterable = CollectionUtilities.BaseCoreGenericHandler((Iterable)resultObj.values(), n);
                    flag8 = false;
                    for (Object object42 : iterable) {
                        tempObj = (LiteBansModule_298)object42;
                        bl9 = false;
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)MessageKey.SortHandler, (LiteBansModule_298)tempObj, false, 2, null));
                    }
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
                if (((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) break block10;
                throw sQLException;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"namehistory", "target", "limit"};
    }

    static {
        NameHistoryCommand.BaseCoreGenericHandler();
    }
}

