package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class StaffRollbackCommand
extends AbstractCommand {
    public StaffRollbackCommand(@NotNull PlatformPlugin plugin) {
        super("staffrollback", plugin);
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
            if (((ConfigService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().AsyncBackgroundTask_22()) {
                object3 = this;
                flag2 = false;
                object4 = MessageHandler.BaseCoreGenericHandler;
                flag3 = ((MessageHandler)object3).AsyncBackgroundTask_5().LiteBansModule_194();
                object2 = MessageKey.LiteBansModule_31;
                object = object4;
                boolean flag5 = !flag3;
                flag = false;
                if (flag5) {
                    Object object5 = object;
                    ((ChatFormatter)object5).BaseCoreGenericHandler(object2);
                    throw new CommandExitException();
}
            Object object6 = this;
            object3 = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object6, (String)ArrayUtilities.LiteBansModule_31(args));
            object6 = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
            Object object7 = this;
            flag3 = false;
            object7 = (DatabaseMonitorService)((MessageHandler)object7).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag3 = false;
            try {
                object2 = ((DatabaseMonitorService)object7).LiteBansModule_194();
                Closeable closeable = (Closeable)object2;
                object = null;
                try {
                    String string;
                    boolean flag8;
                    StringBuilder stringBuilder;
                    int n;
                    String string2;
                    Object object8 = (LiteBansModule_82)closeable;
                    flag = false;
                    Object object9 = object2;
                    LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler((LiteBansModule_82)object9, (String)object3, false, 2, null);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    String[] filteredArgs = args;
                    int n2 = 1;
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
                    String string3 = stringBuilder3.append(string).toString();
                    double d10 = SecHandler.AsyncBackgroundTask_5.BaseCoreGenericHandler(string3, Double.MIN_VALUE);
                    Object object10 = MessageHandler.BaseCoreGenericHandler;
                    flag8 = d10 == Double.MIN_VALUE && !StringUtilities.LiteBansModule_31((CharSequence)string3);
                    CharSequence charSequence = MessageKey.aL;
                    ChatFormatter chatFormatter = object10;
                    if (flag8) {
                        ChatFormatter fo_03 = chatFormatter;
                        fo_03.BaseCoreGenericHandler(charSequence);
                        throw new CommandExitException();
                    }
                    String string4 = iA2.LiteBansModule_31();
                    if (string4 == null) {
                        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.LiteBansException);
                        throw new CommandExitException();
                    }
                    object10 = string4;
                    long l3 = d10 == Double.MIN_VALUE ? 0L : (long)((double)DatabaseMonitorService.BaseCoreGenericHandler(object9.AsyncBackgroundTask_5(), false, 1, null) - d10);
                    long l5 = object9.BaseCoreGenericHandler((String)object10, l3, (String)object6);
                    CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)object9, (CharSequence)MessageKey.LiteBansModule_64.BaseCoreGenericHandler("\uaa80\uaa8c\uaa8e\uaa94\uaa8f\uaa95", (Object)l5), iA2, false, 2, null));
                    object8 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable) {
                    object = throwable;
                    throw throwable;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, (Throwable)object);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)object7).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"staffrollback", "", "", StringDecryptor.BaseCoreGenericHandler("\uaa80\uaa8c\uaa8e\uaa94\uaa8f\uaa95", 0xE1EAAE1)};
}

