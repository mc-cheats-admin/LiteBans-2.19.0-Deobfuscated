package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class GeoIPCommand
extends AbstractCommand {
    public GeoIPCommand(@NotNull PlatformPlugin plugin) {
        super("geoip", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        CharSequence charSequence;
{
            boolean flag;
{
                resultObj = MessageHandler.BaseCoreGenericHandler;
                MessageHandler messageHandler = this;
                MessageHandler fg_03 = messageHandler;
                boolean flag4 = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().W();
                CharSequence charSequence2 = MessageKey.cF;
                contextObj = resultObj;
                flag = !flag4;
                if (flag) {
                    ChatFormatter chatFormatter = contextObj;
                    chatFormatter.BaseCoreGenericHandler(charSequence2);
                    throw new CommandExitException();
                }
                resultObj = null;
                                resultObj = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)helperObj, (String)ArrayUtilities.LiteBansModule_31(args));
                helperObj = CommandArgumentUtils.LiteBansModule_31(this, (String)resultObj);
                targetObj = null;
                charSequence = null;
                charSequence = MessageKey.AsyncBackgroundTask_21;
                if (helperObj != null) {
                    resultObj = helperObj.i();
                    targetObj = helperObj.LiteBansModule_31();
                    contextObj = this;
                    flag = false;
                    contextObj = (DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
                    flag = false;
                    try {
                        LiteBansModule_82 ch2 = ((DatabaseMonitorService)contextObj).LiteBansModule_194();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object tempObj = (LiteBansModule_82)closeable;
                            LiteBansModule_82 ch3 = ch2;
                            charSequence = ch3.BaseCoreGenericHandler(charSequence, (CommandSenderWrapper)helperObj);
                            tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            throw throwable2;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
                    catch (SQLException sQLException) {
                        if (!((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) {
                            throw sQLException;
                        }
                        break;
}
                contextObj = resultObj;
                flag = false;
                if (!HexEncodingHelper.BaseCoreGenericHandler.i((String)contextObj)) break;
                targetObj = resultObj;
                break;
            }
            contextObj = this;
            flag = false;
            contextObj = (DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch4 = ((DatabaseMonitorService)contextObj).LiteBansModule_194();
                Closeable closeable = ch4;
                Throwable throwable = null;
                try {
                    LiteBansModule_297 iA2;
                    LiteBansModule_82 ch5;
{
                            object6 = (LiteBansModule_82)closeable;
                            ch5 = ch4;
                            iA2 = ch5.cthis;
                            if (iA2 == null) break;
                            String string = iA2.i();
                            boolean bl13 = string != null ? StringUtilities.BaseCoreGenericHandler(string, '#', false, 2, null) : false;
                            if (!bl13) break;
                        }
                        throw new LiteBansModule_35();
                    }
                    targetObj = iA2.i();
                    String string = iA2.BaseCoreGenericHandler();
                    ObjectUtilities.BaseCoreGenericHandler(string);
                    resultObj = string;
                    charSequence = AllHandler_3.BaseCoreGenericHandler(ch5, charSequence, iA2, false, 2, null);
                    object6 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable = throwable3;
                    throw throwable3;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}
        if (targetObj == null) {
            throw new LiteBansModule_35();
        }
        CharSequence[] charSequenceArray = this;
        contextObj = ((ConfigService)charSequenceArray.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31targetObj;
        CharSequence charSequence3 = ObjectUtilities.BaseCoreGenericHandler((Object)(charSequenceArray = contextObj), (Object)"geoip.unavailable") ? MessageKey.ck : (ObjectUtilities.BaseCoreGenericHandler(charSequenceArray, (Object)"geoip.error") ? MessageKey.CommandExecutionTask : charSequence);
        charSequenceArray = new CharSequence[]{"target", resultObj};
        CharSequence charSequence4 = LiteBansModule_242.BaseCoreGenericHandler(charSequence3, charSequenceArray);
        charSequenceArray = new CharSequence[]{"result", contextObj};
        charSequence = LiteBansModule_242.BaseCoreGenericHandler(charSequence4, charSequenceArray);
        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(charSequence);
        throw new CommandExitException();
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"geoip", "geoip.unavailable", "geoip.error", "target", "result"};
}

