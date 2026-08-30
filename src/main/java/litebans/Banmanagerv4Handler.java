package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jetbrains.annotations.NotNull;

public final class Banmanagerv4Handler
extends BansHandler {
    public Banmanagerv4Handler(@NotNull PlatformPlugin plugin) {
        super(plugin, "BanManagerV4", "bm_", 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || StringUtilities.BaseCoreGenericHandler(string, "banmanager4", true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "bans");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object;
            String string2;
            Object object2;
            Object object3;
            Object object4;
            boolean flag2;
            Object object5;
            Throwable throwable2;
            AutoCloseable autoCloseable2;
            AutoCloseable autoCloseable3;
            Object object6 = (PreparedStatement)autoCloseable;
            if (preparedStatement.execute()) {
                autoCloseable3 = preparedStatement.getResultSet();
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    object5 = (ResultSet)autoCloseable2;
                    flag2 = false;
                    while (autoCloseable3.next()) {
                        object4 = autoCloseable3.getString("banned");
                        object3 = autoCloseable3.getString("banned_by");
                        object2 = autoCloseable3.getString("ban_reason");
                        long l3 = autoCloseable3.getLong("ban_time") * 1000L;
                        long l5 = autoCloseable3.getLong("ban_expires_on") * 1000L;
                        string2 = this.LiteBansModule_31((String)object4);
                        ObjectUtilities.BaseCoreGenericHandler(object2);
                        object = new SilentHandler(BanHandler.LiteBansModule_240, string2, null, (CharSequence)object2, this.LiteBansModule_31((String)object3), (String)object3, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (AllHandler_3.BaseCoreGenericHandler(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c((SilentHandler)object);
                            this.g().incrementAndGet();
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + (String)object4);
                        }
                        if (string2 == null) continue;
                        PlatformPlugin plugin = this.LiteBansModule_240();
                        ObjectUtilities.BaseCoreGenericHandler(object4);
                        new LiteBansModule_221(plugin, (String)object4, string2, "#").run();
                    }
                    object5 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
}
            if (flag) {
                this.m().info("Importing IP-bans.. + ");
                autoCloseable3 = connection.prepareStatement("SELECT * FROM " + this.i() + "ip_bans");
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    object5 = (PreparedStatement)autoCloseable2;
                    flag2 = false;
                    if (autoCloseable3.execute()) {
                        object4 = autoCloseable3.getResultSet();
                        object3 = (AutoCloseable)object4;
                        object2 = null;
                        try {
                            Object object7 = (ResultSet)object3;
                            while (object4.next()) {
                                String string3 = object4.getString("banned");
                                String string4 = object4.getString("banned_by");
                                string2 = object4.getString("ban_reason");
                                object = this;
                                long l7 = object4.getLong("ban_time");
                                long l8 = l7 * 1000L;
                                Object object8 = this;
                                long l9 = object4.getLong("ban_expires_on");
                                long l10 = l9 * 1000L;
                                ObjectUtilities.BaseCoreGenericHandler((Object)string2);
                                object8 = new SilentHandler(BanHandler.LiteBansModule_240, null, string3, string2, this.LiteBansModule_31(string4), string4, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), null, l8, l10, 0, false, true, false, 0L, 27648, null);
                                this.plugin(ch2, (SilentHandler)object8, this.g(), this.LiteBansModule_194());
                            }
                            object7 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable4) {
                            object2 = throwable4;
                            throw throwable4;
                        }
                        finally {
                            CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object3, (Throwable)object2);
}
                    object5 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
}
            object6 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"BanManagerV4", "bm_", "banmanager4", "SELECT * FROM ", "bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on", "Ignoring duplicate ban for ", "#", "Importing IP-bans.. + ", "SELECT * FROM ", "ip_bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on"};
}

