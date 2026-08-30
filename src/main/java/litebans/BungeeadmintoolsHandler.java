package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class BungeeadmintoolsHandler
extends BansHandler {
    public BungeeadmintoolsHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "BungeeAdminTools", "BAT_", 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || StringUtilities.BaseCoreGenericHandler(string, "BAT", true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "ban WHERE ban_state=1");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                while (resultSet.next()) {
                    Object object3;
                    try {
                        Object object4;
                        String string2;
                        Object object5;
                        Object object6;
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        Object object11;
                        boolean flag4;
                        String string3 = resultSet.getString("UUID");
                        object3 = null;
                        String string4 = null;
                        String string5 = null;
                        string5 = resultSet.getString("ban_ip");
                        boolean flag5 = string5 != null && ((CharSequence)string5).length() > 0 ? true : (flag4 = false);
                        if (string3 != null) {
                            object3 = LiteBansModule_50.c.e(string3);
                            try {
                                object11 = connection.prepareStatement("SELECT " + this.i() + "player,lastip FROM " + this.i() + "players WHERE UUID=? ORDER BY lastlogin DESC LIMIT 1");
                                object10 = (AutoCloseable)object11;
                                object9 = null;
                                try {
                                    object8 = (PreparedStatement)object10;
                                    object11.setString(1, string3);
                                    ResultSet resultSet2 = object11.executeQuery();
                                    object7 = resultSet2;
                                    object6 = null;
                                    try {
                                        object5 = (ResultSet)object7;
                                        if (resultSet2.next()) {
                                            string4 = resultSet2.getString(this.i() + "player");
                                            string5 = resultSet2.getString("lastip");
                                        }
                                        object5 = KotlinUnitHandler.BaseCoreGenericHandler;
                                    }
                                    catch (Throwable throwable3) {
                                        object6 = throwable3;
                                        throw throwable3;
                                    }
                                    finally {
                                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object7, (Throwable)object6);
                                    }
                                    object8 = KotlinUnitHandler.BaseCoreGenericHandler;
                                }
                                catch (Throwable throwable4) {
                                    object9 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object10, (Throwable)object9);
}
                            catch (Exception exception) {
                                object10 = this;
                                ((DatabaseMonitorService)((MessageHandler)object10).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
}
                        if (string4 == null && object3 != null) {
                            string4 = this.plugin(UUID.fromString((String)object3));
                        }
                        object11 = resultSet.getString("ban_staff");
                        object10 = null;
                        if (object11 != null) {
                            try {
                                PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT UUID FROM " + this.i() + "players WHERE " + this.i() + "player=? ORDER BY lastlogin DESC LIMIT 1");
                                object8 = preparedStatement2;
                                Throwable throwable5 = null;
                                try {
                                    Object object12 = (PreparedStatement)object8;
                                    preparedStatement2.setString(1, (String)object11);
                                    object6 = preparedStatement2.executeQuery();
                                    object5 = (AutoCloseable)object6;
                                    Throwable throwable6 = null;
                                    try {
                                        Object object13 = object5;
                                        if (object6.next()) {
                                            object10 = LiteBansModule_50.c.e(object6.getString("UUID"));
                                        }
                                        object13 = KotlinUnitHandler.BaseCoreGenericHandler;
                                    }
                                    catch (Throwable throwable7) {
                                        throwable6 = throwable7;
                                        throw throwable7;
                                    }
                                    finally {
                                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object5, throwable6);
                                    }
                                    object12 = KotlinUnitHandler.BaseCoreGenericHandler;
                                }
                                catch (Throwable throwable8) {
                                    throwable5 = throwable8;
                                    throw throwable8;
                                }
                                finally {
                                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object8, throwable5);
}
                            catch (Exception exception) {
                                object8 = this;
                                ((DatabaseMonitorService)((MessageHandler)object8).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
}
                        if ((string2 = resultSet.getString("ban_reason")) == null) {
                            string2 = "";
                        }
                        object9 = string2;
                        MessageHandler messageHandler = this;
                        BroadcastService o2 = (BroadcastService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                        ObjectUtilities.BaseCoreGenericHandler(resultSet);
                        messageHandler = this;
                        bl12 = false;
                        object8 = o2.BaseCoreGenericHandler(resultSet, "ban_begin", false, ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ElementsHandler());
                        long l3 = ((Date)object8).getTime();
                        object6 = this;
                        BroadcastService o3 = (BroadcastService)((MessageHandler)object6).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                        object6 = this;
                        bl13 = false;
                        object7 = o3.BaseCoreGenericHandler(resultSet, "ban_end", false, ((ConfigService)((MessageHandler)object6).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().ElementsHandler());
                        long l5 = ((Date)object7).getTime();
                        if (resultSet.getTimestamp("ban_end") == null) {
                            l5 = -1L;
                        }
                        if (flag4 || AllHandler_3.BaseCoreGenericHandler(ch2, (String)object3, null, null, false, false, 30, null) == null) {
                            CharSequence charSequence = (CharSequence)object9;
                            Object object14 = object10;
                            if (object14 == null) {
                                object14 = "#";
                            }
                            SilentHandler dZ2 = new SilentHandler(BanHandler.LiteBansModule_240, (String)object3, string5, charSequence, (String)object14, (String)object11, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), null, l3, l5, 0, false, flag4, false, 0L, 27648, null);
                            ch2.c(dZ2);
                            object4 = flag4 ? this.LiteBansModule_194().incrementAndGet() : this.g().incrementAndGet();
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + (String)object3);
                            object4 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        if (string4 == null || object3 == null) continue;
                        new LiteBansModule_221(this.LiteBansModule_240(), string4, (String)object3, "#").run();
                    }
                    catch (Exception exception) {
                        object3 = this;
                        ((DatabaseMonitorService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
}
                object2 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable9) {
                throwable2 = throwable9;
                throw throwable9;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
            }
            object = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable10) {
            throwable = throwable10;
            throw throwable10;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"BungeeAdminTools", "BAT_", "BAT", "SELECT * FROM ", "ban WHERE ban_state=1", "UUID", "ban_ip", "SELECT ", "player,lastip FROM ", "players WHERE UUID=? ORDER BY lastlogin DESC LIMIT 1", "player", "lastip", "ban_staff", "SELECT UUID FROM ", "players WHERE ", "player=? ORDER BY lastlogin DESC LIMIT 1", "UUID", "ban_reason", "", "ban_begin", "ban_end", "ban_end", "#", "Ignoring duplicate ban for ", "#"};
}

