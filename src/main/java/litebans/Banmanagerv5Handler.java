package litebans;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class Banmanagerv5Handler
extends BansHandler {
        public Banmanagerv5Handler(@NotNull PlatformPlugin plugin) {
        super(plugin, "BanManagerV5", "bm_", 0, 0L, 24, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(@NotNull String string) {
        if (super.c(string)) return true;
        Object targetObj = new String[]{"banmanager5", "banmanager7", "banmanagerv7"};
        if (!ArrayUtilities.LiteBansModule_31((Object[])targetObj, ((String)(targetObj = string)).toLowerCase(Locale.ENGLISH))) return false;
        return true;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_83 ch2, boolean flag) {
        boolean flag2 = StringUtilities.LiteBansModule_31((CharSequence)string, '7', false, 2, null);
        this.plugin("bans", BanHandler.LiteBansModule_241, connection, ch2, flag, flag2);
        this.plugin("mutes", BanHandler.GnuSparseMapHandler, connection, ch2, flag, flag2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(String string, BanHandler a_2, Connection connection, LiteBansModule_83 ch2, boolean flag, boolean flag2) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "player_" + string + " INNER JOIN " + this.i() + "players ON " + this.i() + "player_" + string + ".player_id=" + this.i() + "players.SQLiteDriverHandler_4");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            boolean flag3;
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
                    flag3 = false;
                    while (autoCloseable3.next()) {
                        helperObj = autoCloseable3.getString("name");
                        resultObj = LiteBansModule_287.BaseCoreGenericHandler(autoCloseable3.getBytes("player_id"));
                        contextObj = autoCloseable3.getString("reason");
                        targetObj = LiteBansModule_287.BaseCoreGenericHandler(autoCloseable3.getBytes("actor_id"));
                        long l3 = autoCloseable3.getLong("created") * 1000L;
                        long l5 = autoCloseable3.getLong("expires") * 1000L;
                        String string2 = ((UUID)resultObj).toString();
                        String string3 = this.plugin((UUID)targetObj);
                        ObjectUtilities.BaseCoreGenericHandler(contextObj);
                        SilentHandler dZ2 = new SilentHandler(a_2, string2, null, (CharSequence)contextObj, ((UUID)targetObj).toString(), string3, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), null, l3, l5, 0, false, false, false, 0L, 31744, null);
                        if (AllHandler_3.BaseCoreGenericHandler(ch2, string2, null, null, false, false, 30, null) == null) {
                            ch2.c(dZ2);
                            if (a_2 == BanHandler.LiteBansModule_241) {
                                this.g().incrementAndGet();
                            }
                        } else {
                            this.m().warning("Ignoring duplicate ban for " + string2);
                        }
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
                    flag3 = false;
                    if (autoCloseable3.execute()) {
                        helperObj = autoCloseable3.getResultSet();
                        resultObj = (AutoCloseable)helperObj;
                        contextObj = null;
                        try {
                            targetObj = (ResultSet)resultObj;
                            while (helperObj.next()) {
                                String string4;
                                if (flag2) {
                                    object8 = this;
                                    object7 = helperObj.getBytes("ip");
                                    string4 = InetAddress.getByAddress((byte[])object7).getHostAddress().toString();
                                } else {
                                    object8 = this;
                                    long l7 = helperObj.getLong("ip");
                                    string4 = "" + (l7 >> 24 & 0xFFL) + '.' + (l7 >> 16 & 0xFFL) + '.' + (l7 >> 8 & 0xFFL) + '.' + (l7 & 0xFFL);
                                }
                                String string5 = string4;
                                object8 = helperObj.getString("reason");
                                object7 = LiteBansModule_287.BaseCoreGenericHandler(helperObj.getBytes("actor_id"));
                                BansHandler fS2 = this;
                                long l8 = helperObj.getLong("created");
                                long l9 = l8 * 1000L;
                                                                long l10 = helperObj.getLong("expires");
                                long l11 = l10 * 1000L;
                                object9 = this.plugin((UUID)object7);
                                ObjectUtilities.BaseCoreGenericHandler(object8);
                                SilentHandler dZ3 = new SilentHandler(a_2, null, string5, (CharSequence)object8, ((UUID)object7).toString(), (String)object9, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), null, l9, l11, 0, false, true, false, 0L, 27648, null);
                                this.plugin(ch2, dZ3, this.g(), this.LiteBansModule_195());
                            }
                            targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
        m = new String[]{"BanManagerV5", "bm_", "banmanager5", "banmanager7", "banmanagerv7", "bans", "mutes", "SELECT * FROM ", "player_", " INNER JOIN ", "players ON ", "player_", ".player_id=", "players.SQLiteDriverHandler_4", "name", "player_id", "reason", "actor_id", "created", "expires", "Ignoring duplicate ban for ", "#", "Importing IP-bans.. + ", "SELECT * FROM ", "ip_bans", "ip", "ip", "reason", "actor_id", "created", "expires"};
    }

    static {
        Banmanagerv5Handler.BaseCoreGenericHandler();
    }
}

