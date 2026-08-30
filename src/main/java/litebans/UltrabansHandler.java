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
        Object object;
        boolean flag2;
        Object object2;
        Object object3;
        AutoCloseable autoCloseable;
        boolean flag3;
        Object object4;
        boolean flag4;
        Object object5;
        AutoCloseable autoCloseable2 = connection.prepareStatement("SELECT * FROM banlist WHERE type=0");
        Throwable throwable = null;
        try {
            object5 = (PreparedStatement)autoCloseable2;
            flag4 = false;
            if (object5.execute()) {
                object4 = object5.getResultSet();
                flag3 = false;
                autoCloseable = (AutoCloseable)object4;
                Throwable throwable2 = null;
                try {
                    object3 = (ResultSet)autoCloseable;
                    boolean flag5 = false;
                    while (object4.next()) {
                        object2 = object4;
                        flag2 = false;
                        object = object2.getString("name");
                        String string3 = object2.getString("reason");
                        string2 = object2.getString("admin");
                        long l3 = object2.getLong("time") * 1000L;
                        long l5 = object2.getLong("temptime") * 1000L;
                        BansHandler fS2 = this;
                        ObjectUtilities.BaseCoreGenericHandler((Object)string3);
                        BansHandler.BaseCoreGenericHandler(fS2, ch2, (String)object, string3, l3, l5, string2, null, null, null, null, null, 1984, null);
                    }
                    object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
                }
            }
            object5 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable);
        }
        if (flag) {
            object5 = this;
            flag4 = false;
            long l7 = DatabaseMonitorService.BaseCoreGenericHandler((DatabaseMonitorService)((MessageHandler)object5).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class), false, 1, null);
            object5 = connection.prepareStatement("SELECT * FROM banlistip");
            Throwable throwable5 = null;
            try {
                object4 = (PreparedStatement)object5;
                flag3 = false;
                if (object4.execute()) {
                    autoCloseable = object4.getResultSet();
                    boolean flag6 = false;
                    object3 = autoCloseable;
                    Throwable throwable6 = null;
                    try {
                        object2 = (ResultSet)object3;
                        flag2 = false;
                        while (autoCloseable.next()) {
                            object = autoCloseable;
                            boolean flag7 = false;
                            string2 = object.getString("name");
                            String string4 = object.getString("lastip");
                            long l8 = -1L;
                            String string5 = "#imported#";
                            String string6 = this.LiteBansModule_31(string2);
                            SilentHandler dZ2 = new SilentHandler(BanHandler.LiteBansModule_240, string6, string4, "#", this.LiteBansModule_31(string5), string5, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), null, l7, l8, 0, false, true, false, 0L, 27648, null);
                            this.plugin(ch2, dZ2, this.g(), this.LiteBansModule_194());
                            if (string6 == null) continue;
                            PlatformPlugin plugin = this.LiteBansModule_240();
                            ObjectUtilities.BaseCoreGenericHandler((Object)string2);
                            new LiteBansModule_221(plugin, string2, string6, "#").run();
                        }
                        object2 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable7) {
                        throwable6 = throwable7;
                        throw throwable7;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object3, throwable6);
                    }
                }
                object4 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable8) {
                throwable5 = throwable8;
                throw throwable8;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)object5, throwable5);
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"Ultrabans", "SELECT * FROM banlist WHERE type=0", "name", "reason", "admin", "time", "temptime", "SELECT * FROM banlistip", "name", "lastip", "#imported#", "#", "#"};
    }

    }

