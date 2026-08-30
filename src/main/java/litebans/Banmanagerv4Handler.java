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
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_83 ch2, boolean flag) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "bans");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            String string2;
            boolean flag2;
            Throwable throwable2;
            AutoCloseable autoCloseable2;
            AutoCloseable autoCloseable3;
            Object object6 = (PreparedStatement)autoCloseable;
            if (preparedStatement.execute()) {
                autoCloseable3 = preparedStatement.getResultSet();
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    tempObj = (ResultSet)autoCloseable2;
                    flag2 = false;
                    while (autoCloseable3.next()) {
                        helperObj = autoCloseable3.getString("banned");
                        resultObj = autoCloseable3.getString("banned_by");
                        contextObj = autoCloseable3.getString("ban_reason");
                        long l3 = autoCloseable3.getLong("ban_time") * 1000L;
                        long l5 = autoCloseable3.getLong("ban_expires_on") * 1000L;
                        string2 = this.LiteBansModule_31((String)helperObj);
                        ObjectUtilities.BaseCoreGenericHandler(contextObj);
                        targetObj = new SilentHandler(BanHandler.LiteBansModule_241, string2, null, (CharSequence)contextObj, this.LiteBansModule_31((String)resultObj), (String)resultObj, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (AllHandler_3.BaseCoreGenericHandler(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c((SilentHandler)targetObj);
                            this.g().incrementAndGet();
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + (String)helperObj);
                        }
                        if (string2 == null) continue;
                        PlatformPlugin plugin = this.LiteBansModule_241();
                        ObjectUtilities.BaseCoreGenericHandler(helperObj);
                        new LiteBansModule_222(plugin, (String)helperObj, string2, "#").run();
                    }
                    tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
                }
            }
            if (flag) {
                this.m().info("Importing IP-bans.. + ");
                autoCloseable3 = connection.prepareStatement("SELECT * FROM " + this.i() + "ip_bans");
                autoCloseable2 = autoCloseable3;
                throwable2 = null;
                try {
                    tempObj = (PreparedStatement)autoCloseable2;
                    flag2 = false;
                    if (autoCloseable3.execute()) {
                        helperObj = autoCloseable3.getResultSet();
                        resultObj = (AutoCloseable)helperObj;
                        contextObj = null;
                        try {
                            Object object7 = (ResultSet)resultObj;
                            while (helperObj.next()) {
                                String string3 = helperObj.getString("banned");
                                String string4 = helperObj.getString("banned_by");
                                string2 = helperObj.getString("ban_reason");
                                targetObj = this;
                                long l7 = helperObj.getLong("ban_time");
                                long l8 = l7 * 1000L;
                                                                long l9 = helperObj.getLong("ban_expires_on");
                                long l10 = l9 * 1000L;
                                ObjectUtilities.BaseCoreGenericHandler((Object)string2);
                                object8 = new SilentHandler(BanHandler.LiteBansModule_241, null, string3, string2, this.LiteBansModule_31(string4), string4, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), null, l8, l10, 0, false, true, false, 0L, 27648, null);
                                this.plugin(ch2, (SilentHandler)object8, this.g(), this.LiteBansModule_195());
                            }
                            object7 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable4) {
                            contextObj = throwable4;
                            throw throwable4;
                        }
                        finally {
                            CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)resultObj, (Throwable)contextObj);
                        }
                    }
                    tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
                }
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
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"BanManagerV4", "bm_", "banmanager4", "SELECT * FROM ", "bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on", "Ignoring duplicate ban for ", "#", "Importing IP-bans.. + ", "SELECT * FROM ", "ip_bans", "banned", "banned_by", "ban_reason", "ban_time", "ban_expires_on"};
    }

    static {
        Banmanagerv4Handler.BaseCoreGenericHandler();
    }
}

