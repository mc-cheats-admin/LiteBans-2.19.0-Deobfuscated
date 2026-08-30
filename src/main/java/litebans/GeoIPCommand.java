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
        block23: {
            boolean flag;
            block24: {
                resultObj = MessageHandler.BaseCoreGenericHandler;
                MessageHandler messageHandler = this;
                MessageHandler fg_03 = messageHandler;
                boolean flag4 = ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().W();
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
                    contextObj = (DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
                    flag = false;
                    try {
                        LiteBansModule_83 ch2 = ((DatabaseMonitorService)contextObj).LiteBansModule_195();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object tempObj = (LiteBansModule_83)closeable;
                            LiteBansModule_83 ch3 = ch2;
                            charSequence = ch3.BaseCoreGenericHandler(charSequence, (CommandSenderWrapper)helperObj);
                            tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
                            break block23;
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
                        if (!((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) {
                            throw sQLException;
                        }
                        break block23;
                    }
                }
                contextObj = resultObj;
                flag = false;
                if (!LiteBansModule_346.BaseCoreGenericHandler.i((String)contextObj)) break block24;
                targetObj = resultObj;
                break block23;
            }
            contextObj = this;
            flag = false;
            contextObj = (DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_83 ch4 = ((DatabaseMonitorService)contextObj).LiteBansModule_195();
                Closeable closeable = ch4;
                Throwable throwable = null;
                try {
                    LiteBansModule_298 iA2;
                    LiteBansModule_83 ch5;
                    block26: {
                        block25: {
                            object6 = (LiteBansModule_83)closeable;
                            ch5 = ch4;
                            iA2 = ch5.c((String)resultObj);
                            if (iA2 == null) break block25;
                            String string = iA2.i();
                            boolean bl13 = string != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null) : false;
                            if (!bl13) break block26;
                        }
                        throw new LiteBansModule_35();
                    }
                    targetObj = iA2.i();
                    String string = iA2.BaseCoreGenericHandler();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
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
            }
            catch (SQLException sQLException) {
                if (((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) break block23;
                throw sQLException;
            }
        }
        if (targetObj == null) {
            throw new LiteBansModule_35();
        }
        CharSequence[] charSequenceArray = this;
        contextObj = ((ConfigService)charSequenceArray.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31((String)targetObj);
        CharSequence charSequence3 = ObjectUtilities.BaseCoreGenericHandler((Object)(charSequenceArray = contextObj), (Object)"geoip.unavailable") ? (CharSequence)MessageKey.ck : (ObjectUtilities.BaseCoreGenericHandler((Object)charSequenceArray, (Object)"geoip.error") ? (CharSequence)MessageKey.CommandExecutionTask : (CharSequence)charSequence);
        charSequenceArray = new CharSequence[]{"target", resultObj};
        CharSequence charSequence4 = LiteBansModule_243.BaseCoreGenericHandler(charSequence3, charSequenceArray);
        charSequenceArray = new CharSequence[]{"result", contextObj};
        charSequence = LiteBansModule_243.BaseCoreGenericHandler(charSequence4, charSequenceArray);
        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(charSequence);
        throw new CommandExitException();
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"geoip", "geoip.unavailable", "geoip.error", "target", "result"};
    }

    static {
        GeoIPCommand.BaseCoreGenericHandler();
    }
}

