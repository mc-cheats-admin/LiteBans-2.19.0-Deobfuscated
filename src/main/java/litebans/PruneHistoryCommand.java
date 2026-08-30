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
{
            boolean flag;
            Object object;
            Object object2;
            Object object3 = this;
            Object object4 = object3;
            if (((ConfigService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_194()) {
                object3 = this;
                flag2 = false;
                object4 = MessageHandler.BaseCoreGenericHandler;
                flag3 = ((MessageHandler)object3).AsyncBackgroundTask_5().LiteBansModule_194();
                object2 = MessageKey.LiteBansModule_31;
                object = object4;
                flag = !flag3;
                if (flag) {
                    Object object5 = object;
                    ((ChatFormatter)object5).BaseCoreGenericHandler(object2);
                    throw new CommandExitException();
}
            Object object6 = this;
            object3 = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object6, (String)ArrayUtilities.LiteBansModule_31(args));
            object6 = this;
            flag7 = false;
            object6 = (DatabaseMonitorService)((MessageHandler)object6).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag7 = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object6).LiteBansModule_194();
                object2 = ch2;
                Throwable throwable = null;
                try {
                    String string;
                    boolean flag8;
                    StringBuilder stringBuilder;
                    int n;
                    String string2;
                    object = (LiteBansModule_82)object2;
                    flag = false;
                    LiteBansModule_82 ch3 = ch2;
                    LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, (String)object3, false, 2, null);
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
                    object = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler((Closeable)object2, throwable);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object6).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"prunehistory", "", ""};
}

