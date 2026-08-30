package litebans;

import java.io.Closeable;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import org.jetbrains.annotations.NotNull;

public final class SQLiteDriverHandler_4 {
    private SQLiteDriverHandler_4() {
    }

    public final ThreadLocal BaseCoreGenericHandler() {
        return LiteBansModule_429.BaseCoreGenericHandler();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean BaseCoreGenericHandler(@NotNull DatabaseMonitorService w2) {
        File file;
        boolean flag;
        Object object;
        Object object2;
        boolean flag2;
        DiscordWebhookClient eG2 = w2.PunishmentTableService().LiteBansModule_194();
        String string = eG2.q();
        boolean flag3 = flag2 = StringUtilities.c((CharSequence)string, ':', false, 2, null) || ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"localhost") || ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"127.0.0.1");
        if (flag2) {
            object2 = w2.BaseCoreGenericHandler.getDataFolder();
            object = "litebans.sqlite";
            flag = false;
            string = new File((File)object2, (String)object).getPath();
        }
        if ((file = new File(string)).exists()) {
{
                object2 = w2;
                object = "Converting SQLite database to H2 database.. + ";
                flag = false;
                ((PluginModule)object2).BaseCoreGenericHandler.getLogger().info((String)object);
                object2 = new DatabaseMonitorService(w2.BaseCoreGenericHandler);
                ((DatabaseMonitorService)object2).BaseCoreGenericHandler(false);
                ((DatabaseMonitorService)object2).e();
                eG2.c("LiteBansModule_243");
                w2.Utf8Handler_2().LiteBansModule_31("LiteBansModule_243");
                w2.BaseCoreGenericHandler(w2.PunishmentTableService());
                DatabaseMonitorService.BaseCoreGenericHandler(w2, 0L, false, false, false, 15, null);
                object = w2;
                flag = false;
                try {
                    LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (LiteBansModule_82)closeable;
                        LiteBansModule_82 ch3 = ch2;
                        AutoCloseable autoCloseable = ((DatabaseMonitorService)object2).c();
                        Throwable throwable2 = null;
                        try {
                            Object object4 = (Connection)autoCloseable;
                            if (object4 == null) {
                            } else {
                                BansHandler_2[] kLArray = BansHandler_2.values();
                                int n = kLArray.length;
                                for (int i = 0; i < n; ++i) {
                                    BansHandler_2 kL2;
                                    BansHandler_2 kL3 = kL2 = kLArray[i];
                                    ch3.BaseCoreGenericHandler((Connection)object4, kL3, true);
                                }
                                long l3 = ch3.c();
                                Object object5 = ch3.e().HoverTextFormatter();
                                Object object6 = MessageKey.LiteBansModule_87.BaseCoreGenericHandler("amount", (Object)l3);
                                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)object5, (CharSequence)object6, null, 4, null);
                                object4.close();
                                ((DatabaseMonitorService)object2).c();
                                if (file.exists()) {
                                    object6 = file.getParentFile();
                                    String string2 = file.getName() + ".backup";
                                    object5 = new File((File)object6, string2);
                                    if (file.renameTo((File)object5)) {
                                        object6 = w2;
                                        string2 = "Renamed SQLite database: " + file.getName() + " => " + ((File)object5).getName();
                                        bl10 = false;
                                        ((PluginModule)object6).BaseCoreGenericHandler.getLogger().info(string2);
}
                                object5 = w2;
                                object6 = "SQLite -> H2 conversion completed ";
                                ((PluginModule)object5).BaseCoreGenericHandler.getLogger().info((String)object6);
                                object4 = KotlinUnitHandler.BaseCoreGenericHandler;
}
                        catch (Throwable throwable3) {
                            throwable2 = throwable3;
                            throw throwable3;
                        }
                        finally {
                            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
                        }
                        object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable4) {
                        throwable = throwable4;
                        throw throwable4;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
                catch (SQLException sQLException) {
                    if (((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) break;
                    throw sQLException;
}
            return true;
        }
        eG2.c("LiteBansModule_243");
        w2.Utf8Handler_2().LiteBansModule_31("LiteBansModule_243");
        return false;
    }

    public /* synthetic */ SQLiteDriverHandler_4(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"localhost", "127.0.0.1", "litebans.sqlite", "Converting SQLite database to H2 database.. + ", "LiteBansModule_243", "LiteBansModule_243", "amount", ".backup", "Renamed SQLite database: ", " => ", "SQLite -> H2 conversion completed ", "LiteBansModule_243", "LiteBansModule_243"};
}

