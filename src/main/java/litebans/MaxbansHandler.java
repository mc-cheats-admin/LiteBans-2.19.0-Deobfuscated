package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jetbrains.annotations.NotNull;

public final class MaxbansHandler
extends BansHandler {
    public MaxbansHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "MaxBans", null, 0, 0L, 28, null);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        this.plugin(connection, ch2);
        this.plugin(flag, connection, ch2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(Connection connection, LiteBansModule_82 ch2) {
        while (true) {
            AutoCloseable autoCloseable = connection.prepareStatement("SELECT * FROM bans ORDER BY time LIMIT " + this.GnuSparseMapHandler() + " OFFSET " + n);
            Throwable throwable = null;
            try {
                Object targetObj = (PreparedStatement)autoCloseable;
                ObjectUtilities.BaseCoreGenericHandler(targetObj);
                if (this.plugin((PreparedStatement)targetObj, ch2) == 0) {
                    return;
                }
                targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
            }
            n += this.GnuSparseMapHandler();
            Thread.sleep(this.AsyncBackgroundTask_5());
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(boolean flag, Connection connection, LiteBansModule_82 ch2) {
        if (flag) {
            AutoCloseable autoCloseable = connection.prepareStatement("SELECT * FROM ipbans");
            Throwable throwable = null;
            try {
                Object targetObj = (PreparedStatement)autoCloseable;
                if (targetObj.execute()) {
                    ResultSet resultSet = targetObj.getResultSet();
                    AutoCloseable autoCloseable2 = resultSet;
                    Throwable throwable2 = null;
                    try {
                        Object contextObj = (ResultSet)autoCloseable2;
                        while (resultSet.next()) {
                            ResultSet resultSet2 = resultSet;
                            BansHandler.BaseCoreGenericHandler(this, ch2, null, resultSet2.getString("reason"), resultSet2.getLong("time"), resultSet2.getLong("expires"), resultSet2.getString("banner"), null, null, resultSet2.getString("ip"), null, null, 1728, null);
                        }
                        contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable3) {
                        throwable2 = throwable3;
                        throw throwable3;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
}
                targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable4) {
                throwable = throwable4;
                throw throwable4;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final int BaseCoreGenericHandler(PreparedStatement preparedStatement, LiteBansModule_82 ch2) {
        if (preparedStatement.execute()) {
            ResultSet resultSet = preparedStatement.getResultSet();
            AutoCloseable autoCloseable = resultSet;
            Throwable throwable = null;
            try {
                Object targetObj = (ResultSet)autoCloseable;
                while (resultSet.next()) {
                    ResultSet resultSet2 = resultSet;
                    ++n;
                    try {
                        BansHandler.BaseCoreGenericHandler(this, ch2, resultSet2.getString("name"), resultSet2.getString("reason"), resultSet2.getLong("time"), resultSet2.getLong("expires"), resultSet2.getString("banner"), null, null, null, null, null, 1984, null);
                    }
                    catch (Exception exception) {
                        this.m().warning("Import failed for ban on '" + resultSet2.getString("name") + "'; name changed, perhaps?");
                        MessageHandler messageHandler = this;
                        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
}
                targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}
        return n;
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"MaxBans", "SELECT * FROM bans ORDER BY time LIMIT ", " OFFSET ", "SELECT * FROM ipbans", "reason", "time", "expires", "banner", "ip", "name", "reason", "time", "expires", "banner", "Import failed for ban on '", "name", "'; name changed, perhaps?"};
}

