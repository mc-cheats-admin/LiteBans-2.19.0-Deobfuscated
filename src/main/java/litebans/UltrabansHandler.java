package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jetbrains.annotations.NotNull;

public final class UltrabansHandler
extends BansHandler {
    public UltrabansHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "Ultrabans", null, 0, 0L, 28, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        String string2;
        boolean flag2;
        AutoCloseable autoCloseable;
        boolean flag3;
        boolean flag4;
        AutoCloseable autoCloseable2 = connection.prepareStatement("SELECT * FROM banlist WHERE type=0");
        Throwable throwable = null;
        try {
            tempObj = (PreparedStatement)autoCloseable2;
            flag4 = false;
            if (tempObj.execute()) {
                helperObj = tempObj.getResultSet();
                flag3 = false;
                autoCloseable = (AutoCloseable)helperObj;
                Throwable throwable2 = null;
                try {
                    resultObj = (ResultSet)autoCloseable;
                    while (helperObj.next()) {
                        contextObj = helperObj;
                        flag2 = false;
                        targetObj = contextObj.getString("name");
                        String string3 = contextObj.getString("reason");
                        string2 = contextObj.getString("admin");
                        long l3 = contextObj.getLong("time") * 1000L;
                        long l5 = contextObj.getLong("temptime") * 1000L;
                        BansHandler fS2 = this;
                        ObjectUtilities.BaseCoreGenericHandler(string3);
                        BansHandler.BaseCoreGenericHandler(fS2, ch2, (String)targetObj, string3, l3, l5, string2, null, null, null, null, null, 1984, null);
                    }
                    resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
}
            tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable);
        }
        if (flag) {
            tempObj = this;
            flag4 = false;
            long l7 = DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)((MessageHandler)tempObj).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class), false, 1, null);
            tempObj = connection.prepareStatement("SELECT * FROM banlistip");
            Throwable throwable5 = null;
            try {
                helperObj = (PreparedStatement)tempObj;
                flag3 = false;
                if (helperObj.execute()) {
                    autoCloseable = helperObj.getResultSet();
                    resultObj = autoCloseable;
                    Throwable throwable6 = null;
                    try {
                        contextObj = (ResultSet)resultObj;
                        flag2 = false;
                        while (autoCloseable.next()) {
                            targetObj = autoCloseable;
                            string2 = targetObj.getString("name");
                            String string4 = targetObj.getString("lastip");
                            long l8 = -1L;
                            String string5 = "#imported#";
                            String string6 = this.LiteBansModule_31(string2);
                            SilentHandler dZ2 = new SilentHandler(BanHandler.LiteBansModule_240, string6, string4, "#", this.LiteBansModule_31(string5), string5, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), null, l7, l8, 0, false, true, false, 0L, 27648, null);
                            this.plugin(ch2, dZ2, this.g(), this.LiteBansModule_194());
                            if (string6 == null) continue;
                            PlatformPlugin plugin = this.LiteBansModule_240();
                            ObjectUtilities.BaseCoreGenericHandler(string2);
                            new LiteBansModule_221(plugin, string2, string6, "#").run();
                        }
                        contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable7) {
                        throwable6 = throwable7;
                        throw throwable7;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)resultObj, throwable6);
}
                helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable8) {
                throwable5 = throwable8;
                throw throwable8;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)tempObj, throwable5);
}

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"Ultrabans", "SELECT * FROM banlist WHERE type=0", "name", "reason", "admin", "time", "temptime", "SELECT * FROM banlistip", "name", "lastip", "#imported#", "#", "#"};
}

