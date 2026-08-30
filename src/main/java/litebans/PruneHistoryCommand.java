package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class PruneHistoryCommand
extends AbstractCommand {
        public PruneHistoryCommand(@NotNull PlatformPlugin plugin) {
        super("prunehistory", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block15: {
            boolean flag;
                        Object helperObj = resultObj;
            if (((ConfigService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_195()) {
                resultObj = this;
                flag2 = false;
                helperObj = MessageHandler.BaseCoreGenericHandler;
                flag3 = ((MessageHandler)resultObj).AsyncBackgroundTask_5().LiteBansModule_195();
                contextObj = MessageKey.LiteBansModule_31;
                targetObj = helperObj;
                flag = !flag3;
                if (flag) {
                    Object tempObj = targetObj;
                    ((ChatFormatter)tempObj).BaseCoreGenericHandler(contextObj);
                    throw new CommandExitException();
                }
            }
                        resultObj = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object6, (String)ArrayUtilities.LiteBansModule_31(args));
            object6 = this;
            flag7 = false;
            object6 = (DatabaseMonitorService)((MessageHandler)object6).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag7 = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)object6).LiteBansModule_195();
                contextObj = ch2;
                Throwable throwable = null;
                try {
                    String string;
                    boolean flag8;
                    StringBuilder stringBuilder;
                    int n;
                    String string2;
                    targetObj = (LiteBansModule_83)contextObj;
                    flag = false;
                    LiteBansModule_83 ch3 = ch2;
                    LiteBansModule_298 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, (String)resultObj, false, 2, null);
                    String string3 = iA2.LiteBansModule_31();
                    if (string3 == null) {
                        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansException);
                        throw new CommandExitException();
                    }
                    String string4 = string3;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    int n2 = 1;
                    String[] filteredArgs = args;
                    if (n2 < filteredArgs.length) {
                        string2 = filteredArgs[n2];
                    } else {
                        n = n2;
                        stringBuilder = stringBuilder2;
                        flag8 = false;
                        string2 = "";
                        stringBuilder2 = stringBuilder;
                    }
                    StringBuilder stringBuilder3 = stringBuilder2.append(string2);
                    filteredArgs = args;
                    n2 = 2;
                    if (n2 < filteredArgs.length) {
                        string = filteredArgs[n2];
                    } else {
                        n = n2;
                        stringBuilder = stringBuilder3;
                        flag8 = false;
                        string = "";
                        stringBuilder3 = stringBuilder;
                    }
                    String string5 = stringBuilder3.append(string).toString();
                    double d10 = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(string5, Double.MIN_VALUE);
                    ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
                    flag8 = d10 == Double.MIN_VALUE && !StringUtilities.LiteBansModule_31((CharSequence)string5);
                    CharSequence charSequence = MessageKey.aL;
                    ChatFormatter fo_03 = chatFormatter;
                    if (flag8) {
                        ChatFormatter fo_04 = fo_03;
                        fo_04.BaseCoreGenericHandler(charSequence);
                        throw new CommandExitException();
                    }
                    long l3 = d10 == Double.MIN_VALUE ? 0L : (long)((double)DatabaseMonitorService.BaseCoreGenericHandler(ch3.AsyncBackgroundTask_5(), false, 1, null) - d10);
                    ch3.BaseCoreGenericHandler(string4, l3);
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)MessageKey.LiteBansModule_15, iA2, false, 2, null));
                    targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler((Closeable)contextObj, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object6).LiteBansModule_31(sQLException)) break block15;
                throw sQLException;
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"prunehistory", "", ""};
    }

    static {
        PruneHistoryCommand.BaseCoreGenericHandler();
    }
}

