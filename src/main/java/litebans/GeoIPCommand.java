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
        Object object;
        Object object2;
        Object object3;
{
            boolean flag;
{
                object3 = MessageHandler.BaseCoreGenericHandler;
                MessageHandler messageHandler = this;
                MessageHandler fg_03 = messageHandler;
                boolean flag4 = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().W();
                CharSequence charSequence2 = MessageKey.cF;
                object2 = object3;
                flag = !flag4;
                if (flag) {
                    ChatFormatter chatFormatter = object2;
                    chatFormatter.BaseCoreGenericHandler(charSequence2);
                    throw new CommandExitException();
                }
                object3 = null;
                Object object4 = this;
                object3 = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object4, (String)ArrayUtilities.LiteBansModule_31(args));
                object4 = CommandArgumentUtils.LiteBansModule_31(this, (String)object3);
                object = null;
                charSequence = null;
                charSequence = MessageKey.AsyncBackgroundTask_21;
                if (object4 != null) {
                    object3 = object4.i();
                    object = object4.LiteBansModule_31();
                    object2 = this;
                    flag = false;
                    object2 = (DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
                    flag = false;
                    try {
                        LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object object5 = (LiteBansModule_82)closeable;
                            LiteBansModule_82 ch3 = ch2;
                            charSequence = ch3.BaseCoreGenericHandler(charSequence, (CommandSenderWrapper)object4);
                            object5 = KotlinUnitHandler.BaseCoreGenericHandler;
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
                        if (!((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) {
                            throw sQLException;
                        }
                        break;
}
                object2 = object3;
                flag = false;
                if (!HexEncodingHelper.BaseCoreGenericHandler.i((String)object2)) break;
                object = object3;
                break;
            }
            object2 = this;
            flag = false;
            object2 = (DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag = false;
            try {
                LiteBansModule_82 ch4 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                Closeable closeable = ch4;
                Throwable throwable = null;
                try {
                    LiteBansModule_297 iA2;
                    LiteBansModule_82 ch5;
                    Object object6;
{
                            object6 = (LiteBansModule_82)closeable;
                            ch5 = ch4;
                            iA2 = ch5.c((String)object3);
                            if (iA2 == null) break;
                            String string = iA2.i();
                            boolean bl13 = string != null ? StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null) : false;
                            if (!bl13) break;
                        }
                        throw new LiteBansModule_35();
                    }
                    object = iA2.i();
                    String string = iA2.BaseCoreGenericHandler();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string);
                    object3 = string;
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
                if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}
        if (object == null) {
            throw new LiteBansModule_35();
        }
        CharSequence[] charSequenceArray = this;
        object2 = ((ConfigService)charSequenceArray.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_31((String)object);
        CharSequence charSequence3 = ObjectUtilities.BaseCoreGenericHandler((Object)(charSequenceArray = object2), (Object)"geoip.unavailable") ? (CharSequence)MessageKey.ck : (ObjectUtilities.BaseCoreGenericHandler((Object)charSequenceArray, (Object)"geoip.error") ? (CharSequence)MessageKey.CommandExecutionTask : (CharSequence)charSequence);
        charSequenceArray = new CharSequence[]{"target", object3};
        CharSequence charSequence4 = LiteBansModule_242.BaseCoreGenericHandler(charSequence3, charSequenceArray);
        charSequenceArray = new CharSequence[]{"result", object2};
        charSequence = LiteBansModule_242.BaseCoreGenericHandler(charSequence4, charSequenceArray);
        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(charSequence);
        throw new CommandExitException();
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"geoip", "geoip.unavailable", "geoip.error", "target", "result"};
}

