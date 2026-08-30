package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public class CheckBanCommand
extends AbstractCommand {
        public CheckBanCommand(@NotNull PlatformPlugin plugin) {
        super("checkban", plugin);
    }

    public BanHandler LiteBansModule_31() {
        return BanHandler.LiteBansModule_241;
    }

    public MessageKey c() {
        return MessageKey.HoverTextFormatter;
    }

    public MessageKey BaseCoreGenericHandler() {
        return MessageKey.LiteBansModule_13;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        block11: {
                        String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)targetObj, (String)ArrayUtilities.LiteBansModule_31(args));
            targetObj = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
                        contextObj = (DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag2 = false;
            try {
                LiteBansModule_83 ch2 = ((DatabaseMonitorService)contextObj).LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object helperObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    if (LiteBansModule_346.BaseCoreGenericHandler.LiteBansModule_31(string) && (resultObj = AllHandler_3.BaseCoreGenericHandler(ch3, CommandArgumentUtils.AsyncBackgroundTask_5(this, string), this.LiteBansModule_31(), null, false, 12, null)) != null) {
                        String string2 = ((SilentHandler)resultObj).DatabaseMonitorService();
                        if (string2 == null && (string2 = ((SilentHandler)resultObj).PunishmentTableService()) == null) {
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin());
                            throw new CommandExitException();
                        }
                        String string3 = string2;
                        LiteBansModule_298 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string3, false, 2, null);
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.c(), (SilentHandler)resultObj, iA2, false, 4, null));
                        this.plugin(ch3, (SilentHandler)resultObj, iA2);
                    } else {
                        resultObj = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false, 2, null);
                        SilentHandler dZ2 = AllHandler_3.BaseCoreGenericHandler(ch3, ((LiteBansModule_298)resultObj).LiteBansModule_31(), ((LiteBansModule_298)resultObj).i(), this.LiteBansModule_31(), (String)targetObj, false, false, 48, null);
                        if (dZ2 == null) {
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.plugin(), (LiteBansModule_298)resultObj, false, 2, null));
                            throw new CommandExitException();
                        }
                        SilentHandler dZ3 = dZ2;
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.c(), dZ3, (LiteBansModule_298)resultObj, false, 4, null));
                        this.plugin(ch3, dZ3, (LiteBansModule_298)resultObj);
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
                if (((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) break block11;
                throw sQLException;
            }
        }
    }

    private final void BaseCoreGenericHandler(LiteBansModule_83 ch2, SilentHandler dZ2, LiteBansModule_298 iA2) {
        if (this.LiteBansModule_31() == BanHandler.LiteBansModule_241 && !ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)iA2.LiteBansModule_31())) {
            String[] args = new String[2];
            args[0] = "check";
            String string = iA2.LiteBansModule_31();
            if (string == null && (string = iA2.BaseCoreGenericHandler()) == null) {
                return;
            }
            args[1] = string;
            LitebansAdminHandler f72 = new LitebansAdminHandler(args, ch2.e(), false);
        }
    }

    private static final void AsyncBackgroundTask_5() {
        i = new String[]{"checkban", "check"};
    }

    static {
        CheckBanCommand.AsyncBackgroundTask_5();
    }
}

