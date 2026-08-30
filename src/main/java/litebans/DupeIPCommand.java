package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class DupeIPCommand
extends AbstractCommand {
    public DupeIPCommand(@NotNull PlatformPlugin plugin) {
        super("dupeip", plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper v1, @NotNull String[] v2) {
{
            arg1 = this;
            arg2 = CommandArgumentUtils.BaseCoreGenericHandler(arg1, (String)ArrayUtilities.LiteBansModule_31(v2));
            arg3 = this;
            arg4 = arg3;
            arg5 = LiteBansModule_389.BaseCoreGenericHandler(v2, 1, ((ConfigService)arg4.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().HoverTextFormatter());
            arg3 = this;
            arg3 = (DatabaseMonitorService)arg3.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            try {
                arg4 = arg3.LiteBansModule_194();
                arg6 = (Closeable)arg4;
                try {
{
                            arg7 = (LiteBansModule_82)arg6;
                            arg8 = arg4;
                            arg9 = new LiteBansModule_206(arg2, (LiteBansModule_82)arg8, v1, false, arg5).i();
                            if (arg9.e()) break;
                            if (v1.LiteBansModule_194()) break;
                            arg10 = this;
                            arg11 = arg10;
                            if (((ConfigService)arg11.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().O()) ** GOTO lbl-1000
                        }
                        arg10 = v1;
                        arg12 = "litebans.dupeip.viewip";
                        arg13 = arg10;
                        if (arg13.e(arg12) == false) lbl-1000:
                                                {
                        } else {
                        }
                        arg14 = v0;
                        arg10 = arg9.LiteBansModule_194() != false ? MessageKey.PoolBase.BaseCoreGenericHandler("num", (Object)arg9.Utf8Handler_2()) : arg9.GnuSparseMapHandler();
                        arg15 = arg14 != false ? (CharSequence)MessageKey.P : (CharSequence)MessageKey.BanHandler_4;
                        v1 = GeoIPLookupService.BaseCoreGenericHandler(arg15, (CharSequence)"ip", arg10);
                        v2 = arg9.LiteBansModule_401();
                        ObjectUtilities.BaseCoreGenericHandler(v2);
                        arg15 = AllHandler_3.BaseCoreGenericHandler((LiteBansModule_82)arg8, v1, v2, false, 2, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, arg15, null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, arg9.c(), null, 4, null);
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v1, MessageKey.HikariPool, null, 4, null);
                    }
                    arg7 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable arg16) {
                    arg17 = arg16;
                    throw arg16;
                }
                finally {
                    BlockHandler.BaseCoreGenericHandler(arg6, arg17);
}
            catch (SQLException v7) {
                if (arg3.LiteBansModule_31(v7)) break;
                throw v7;
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"dupeip", "litebans.dupeip.viewip", "num", "ip"};
}

