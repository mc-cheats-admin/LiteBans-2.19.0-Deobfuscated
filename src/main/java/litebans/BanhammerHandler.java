package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

public final class BanhammerHandler
extends BansHandler {
        public BanhammerHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "BanHammer", "banhammer_", 0, 0L, 24, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_83 ch2, boolean flag) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "bans WHERE state=0");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object targetObj = (PreparedStatement)autoCloseable;
            if (preparedStatement.execute()) {
                ResultSet resultSet = preparedStatement.getResultSet();
                AutoCloseable autoCloseable2 = resultSet;
                Throwable throwable2 = null;
                try {
                    Object contextObj = (ResultSet)autoCloseable2;
                    while (resultSet.next()) {
                        PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM " + this.i() + "players WHERE SQLiteDriverHandler_4=?");
                        AutoCloseable autoCloseable3 = preparedStatement2;
                        Throwable throwable3 = null;
                        try {
                            Object resultObj = (PreparedStatement)autoCloseable3;
                            preparedStatement2.setInt(1, resultSet.getInt("player_id"));
                            preparedStatement2.execute();
                            ResultSet resultSet2 = preparedStatement2.getResultSet();
                            if (resultSet2 != null && resultSet2.next()) {
                                String string2 = resultSet2.getString("name");
                                String string3 = resultSet.getString("reason");
                                MessageHandler messageHandler = this;
                                BroadcastService o2 = (BroadcastService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                                ObjectUtilities.BaseCoreGenericHandler(resultSet);
                                messageHandler = this;
                                flag5 = false;
                                Date date = o2.BaseCoreGenericHandler(resultSet, "created_at", false, ((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().ElementsHandler());
                                long l3 = date.getTime();
                                MessageHandler fg_03 = this;
                                BroadcastService o3 = (BroadcastService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                                fg_03 = this;
                                flag6 = false;
                                Date date2 = o3.BaseCoreGenericHandler(resultSet, "expires_at", false, ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().ElementsHandler());
                                long l5 = date2.getTime();
                                BansHandler fS2 = this;
                                ObjectUtilities.BaseCoreGenericHandler((Object)string3);
                                BansHandler.BaseCoreGenericHandler(fS2, ch2, string2, string3, l3, l5, null, null, null, null, null, null, 1984, null);
                            }
                            resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable4) {
                            throwable3 = throwable4;
                            throw throwable4;
                        }
                        finally {
                            CloseactionHandler.BaseCoreGenericHandler(autoCloseable3, throwable3);
                        }
                    }
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
                }
            }
            targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
        }
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"BanHammer", "banhammer_", "SELECT * FROM ", "bans WHERE state=0", "SELECT * FROM ", "players WHERE SQLiteDriverHandler_4=?", "player_id", "name", "reason", "created_at", "expires_at"};
    }

    static {
        BanhammerHandler.BaseCoreGenericHandler();
    }
}

