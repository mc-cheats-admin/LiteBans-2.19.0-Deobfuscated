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
        return BanHandler.LiteBansModule_240;
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
{
            Object object = this;
            String string = CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)object, (String)ArrayUtilities.LiteBansModule_31(args));
            object = CommandArgumentUtils.BaseCoreGenericHandler(this, sender, args, null, 4, null);
            Object object2 = this;
            object2 = (DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            flag2 = false;
            try {
                LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object3;
                    Object object4 = (LiteBansModule_82)closeable;
                    LiteBansModule_82 ch3 = ch2;
                    if (HexEncodingHelper.BaseCoreGenericHandler.LiteBansModule_31(string) && (object3 = AllHandler_3.BaseCoreGenericHandler(ch3, CommandArgumentUtils.AsyncBackgroundTask_5(this, string), this.LiteBansModule_31(), null, false, 12, null)) != null) {
                        String string2 = ((SilentHandler)object3).DatabaseMonitorService();
                        if (string2 == null && (string2 = ((SilentHandler)object3).PunishmentTableService()) == null) {
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin());
                            throw new CommandExitException();
                        }
                        String string3 = string2;
                        LiteBansModule_297 iA2 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string3, false, 2, null);
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.c(), (SilentHandler)object3, iA2, false, 4, null));
                        this.plugin(ch3, (SilentHandler)object3, iA2);
                    } else {
                        object3 = CommandArgumentUtils.BaseCoreGenericHandler(ch3, string, false, 2, null);
                        SilentHandler dZ2 = AllHandler_3.BaseCoreGenericHandler(ch3, ((LiteBansModule_297)object3).LiteBansModule_31(), ((LiteBansModule_297)object3).i(), this.LiteBansModule_31(), (String)object, false, false, 48, null);
                        if (dZ2 == null) {
                            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.plugin(), (LiteBansModule_297)object3, false, 2, null));
                            throw new CommandExitException();
                        }
                        SilentHandler dZ3 = dZ2;
                        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, AllHandler_3.BaseCoreGenericHandler(ch3, (CharSequence)this.c(), dZ3, (LiteBansModule_297)object3, false, 4, null));
                        this.plugin(ch3, dZ3, (LiteBansModule_297)object3);
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
                if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break;
                throw sQLException;
}

    private final void BaseCoreGenericHandler(LiteBansModule_82 ch2, SilentHandler dZ2, LiteBansModule_297 iA2) {
        if (this.LiteBansModule_31() == BanHandler.LiteBansModule_240 && !ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), (Object)iA2.LiteBansModule_31())) {
            String[] args = new String[2];
            args[0] = "check";
            String string = iA2.LiteBansModule_31();
            if (string == null && (string = iA2.BaseCoreGenericHandler()) == null) {
                return;
            }
            args[1] = string;
            LitebansAdminHandler f72 = new LitebansAdminHandler(args, ch2.e(), false);
}

    private static final void AsyncBackgroundTask_5() {
        i = new String[]{"checkban", "check"};
}

