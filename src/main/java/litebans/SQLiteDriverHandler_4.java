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
        boolean flag2;
        DiscordWebhookClient eG2 = w2.PunishmentTableService().LiteBansModule_194();
        String string = eG2.q();
        boolean flag3 = flag2 = StringUtilities.c(string, ':', false, 2, null) || ObjectUtilities.BaseCoreGenericHandler(string, (Object)"localhost") || ObjectUtilities.BaseCoreGenericHandler(string, (Object)"127.0.0.1");
        if (flag2) {
            contextObj = w2.BaseCoreGenericHandler.getDataFolder();
            targetObj = "litebans.sqlite";
            flag = false;
            string = new File((File)contextObj, (String)targetObj).getPath();
        }
        if ((file = new File(string)).exists()) {
{
                contextObj = w2;
                targetObj = "Converting SQLite database to H2 database.. + ";
                flag = false;
                ((PluginModule)contextObj).BaseCoreGenericHandler.getLogger().infotargetObj;
                contextObj = new DatabaseMonitorService(w2.BaseCoreGenericHandler);
                ((DatabaseMonitorService)contextObj).BaseCoreGenericHandler(false);
                ((DatabaseMonitorService)contextObj).e();
                eG2.c("LiteBansModule_243");
                w2.Utf8Handler_2().LiteBansModule_31("LiteBansModule_243");
                w2.BaseCoreGenericHandler(w2.PunishmentTableService());
                DatabaseMonitorService.BaseCoreGenericHandler(w2, 0L, false, false, false, 15, null);
                targetObj = w2;
                flag = false;
                try {
                    LiteBansModule_82 ch2 = targetObj.LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object resultObj = (LiteBansModule_82)closeable;
                        LiteBansModule_82 ch3 = ch2;
                        AutoCloseable autoCloseable = ((DatabaseMonitorService)contextObj).c();
                        Throwable throwable2 = null;
                        try {
                            Object helperObj = (Connection)autoCloseable;
                            if (helperObj == null) {
                            } else {
                                BansHandler_2[] kLArray = BansHandler_2.values();
                                int n = kLArray.length;
                                for (int i = 0; i < n; ++i) {
                                    BansHandler_2 kL2;
                                    BansHandler_2 kL3 = kL2 = kLArray[i];
                                    ch3.BaseCoreGenericHandler((Connection)helperObj, kL3, true);
                                }
                                long l3 = ch3.c();
                                Object tempObj = ch3.e().HoverTextFormatter();
                                Object object6 = MessageKey.LiteBansModule_87.BaseCoreGenericHandler("amount", l3);
                                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)tempObj, object6, null, 4, null);
                                helperObj.close();
                                ((DatabaseMonitorService)contextObj).c();
                                if (file.exists()) {
                                    object6 = file.getParentFile();
                                    String string2 = file.getName() + ".backup";
                                    tempObj = new File((File)object6, string2);
                                    if (file.renameTo((File)tempObj)) {
                                        object6 = w2;
                                        string2 = "Renamed SQLite database: " + file.getName() + " => " + ((File)tempObj).getName();
                                        bl10 = false;
                                        ((PluginModule)object6).BaseCoreGenericHandler.getLogger().info(string2);
}
                                tempObj = w2;
                                object6 = "SQLite -> H2 conversion completed ";
                                ((PluginModule)tempObj).BaseCoreGenericHandler.getLogger().info((String)object6);
                                helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
}
                        catch (Throwable throwable3) {
                            throwable2 = throwable3;
                            throw throwable3;
                        }
                        finally {
                            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
                        }
                        resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable4) {
                        throwable = throwable4;
                        throw throwable4;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
                catch (SQLException sQLException) {
                    if (targetObj.LiteBansModule_31(sQLException)) break;
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

