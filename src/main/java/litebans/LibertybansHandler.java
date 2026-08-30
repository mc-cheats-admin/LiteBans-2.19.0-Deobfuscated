package litebans;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LibertybansHandler
extends BansHandler {
    private final byte[] m = LiteBansModule_286.BaseCoreGenericHandler(CommandSenderWrapper.LiteBansModule_31);
    public LibertybansHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "LibertyBans", "libertybans_", 0, 0L, 24, null);
    }

    public final byte[] BaseCoreGenericHandler() {
        return this.m;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_82 ch2, boolean flag) {
        LibertybansHandler.BaseCoreGenericHandler(this, connection, flag, ch2, BanHandler.LiteBansModule_240, null, 16, null);
        LibertybansHandler.BaseCoreGenericHandler(this, connection, flag, ch2, BanHandler.GnuSparseMapHandler, null, 16, null);
        this.plugin(connection, flag, ch2, BanHandler.c, "warns");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(Connection connection, boolean flag, LiteBansModule_82 ch2, BanHandler a_2, String string) {
        String string2 = "SELECT * FROM " + this.i() + "applicable_" + string;
                targetObj = (ConfigService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        flag2 = false;
        if (targetObj.g()) {
            Object contextObj = targetObj;
            ((ConfigService)contextObj).BaseCoreGenericHandler(string2);
        }
        targetObj = connection.prepareStatement(string2);
        AutoCloseable autoCloseable = (AutoCloseable)targetObj;
        Throwable throwable = null;
        try {
            Object resultObj = (PreparedStatement)autoCloseable;
            if (targetObj.execute()) {
                ResultSet resultSet = targetObj.getResultSet();
                AutoCloseable autoCloseable2 = resultSet;
                Throwable throwable2 = null;
                try {
                    Object helperObj = (ResultSet)autoCloseable2;
                    while (resultSet.next()) {
                        String string3;
                        long l3;
                        long l5;
                        UUID uUID;
{
                            boolean flag6;
                            boolean flag7;
                            int n = resultSet.getInt("victim_type");
                            object10 = this;
                            ObjectUtilities.BaseCoreGenericHandler(resultSet);
                            object9 = resultSet;
                            byte[] byArray = object9.getBytes("victim_uuid");
                            Object object11 = null;
                            Object object12 = byArray;
                            if (object12 != null && ((byte[])object12).length == 16) {
                                object12 = byArray;
                                ObjectUtilities.BaseCoreGenericHandler(object12);
                                object11 = LiteBansModule_286.BaseCoreGenericHandler((byte[])object12);
                            }
                            if (object11 == null || ObjectUtilities.BaseCoreGenericHandler(object11, LiteBansModule_91.c())) {
                                byArray = object9.getBytes("uuid");
                                object12 = byArray;
                                bl9 = false;
                                if (object12 != null && (object12).length == 16) {
                                    object12 = byArray;
                                    ObjectUtilities.BaseCoreGenericHandler(object12);
                                    object11 = LiteBansModule_286.BaseCoreGenericHandler((byte[])object12);
}
                            object12 = (MessageHandler)object10;
                            bl9 = false;
                            object12 = (ConfigService)((MessageHandler)object12).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
                            bl9 = false;
                            if (((ConfigService)object12).g()) {
                                object8 = object12;
                                flag7 = false;
                                ((ConfigService)object8).BaseCoreGenericHandler((Object)("victim: " + object11));
                            }
                            uUID = object11;
                            object9 = this;
                            object7 = resultSet;
                            object12 = object11 = object7.getBytes("operator");
                            bl9 = false;
                            object8 = object12;
                            flag7 = false;
                            if (!(object8 != null && (object8).length == 16)) {
                                object11 = ((LibertybansHandler)object9).BaseCoreGenericHandler();
                            }
                            object12 = object11;
                            ObjectUtilities.BaseCoreGenericHandler(object12);
                            object10 = LiteBansModule_286.BaseCoreGenericHandler((byte[])object12);
                            object9 = null;
                            if (flag) {
                                byte[] byArray2;
                                object7 = this;
                                ResultSet resultSet2 = resultSet;
                                object12 = null;
                                if (n != 0 && (byArray2 = resultSet2.getBytes("address")).length >= 4) {
                                    object8 = (BansHandler)object7;
                                    ObjectUtilities.BaseCoreGenericHandler(byArray2);
                                    byte[] byArray3 = byArray2;
                                    flag6 = false;
                                    object12 = InetAddress.getByAddress(byArray3).getHostAddress().toString();
                                }
                                object9 = object12;
                            }
                            object7 = resultSet.getString("reason");
                            l5 = resultSet.getLong("start") * (long)1000;
                            l3 = resultSet.getLong("end") * (long)1000;
                            object6 = this;
                            flag6 = false;
                            if (uUID == null) {
                                string3 = null;
                            } else {
                                tempObj = connection.prepareStatement("SELECT name FROM " + ((BansHandler)object6).i() + "latest_names WHERE uuid=?");
                                AutoCloseable autoCloseable3 = (AutoCloseable)tempObj;
                                Throwable throwable3 = null;
                                try {
                                    Object object13 = (PreparedStatement)autoCloseable3;
                                    tempObj.setBytes(1, LiteBansModule_286.BaseCoreGenericHandler(uUID));
                                    tempObj.execute();
                                    ResultSet resultSet3 = tempObj.getResultSet();
                                    if (resultSet3 != null && resultSet3.next()) {
                                        String string4 = resultSet3.getString(1);
                                        string3 = string4;
                                        break;
                                    }
                                    object13 = KotlinUnitHandler.BaseCoreGenericHandler;
                                }
                                catch (Throwable throwable4) {
                                    throwable3 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable3, throwable3);
                                }
                                string3 = null;
}
                        object8 = string3;
                        ObjectUtilities.BaseCoreGenericHandler(object7);
                        object6 = object7;
                        String string5 = this.plugin((UUID)object10);
                        tempObj = object9;
                        BansHandler.BaseCoreGenericHandler(this, ch2, (String)object8, (String)object6, l5, l3, string5, uUID, (UUID)object10, (String)tempObj, null, a_2, 512, null);
                    }
                    helperObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
}
            resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}

    static /* synthetic */ void BaseCoreGenericHandler(LibertybansHandler fm2, Connection connection, boolean flag, LiteBansModule_82 ch2, BanHandler a_2, String string, int n, Object targetObj) {
        if ((n & 0x10) != 0) {
            String string2 = a_2.BaseCoreGenericHandler().name();
            string = string2.toLowerCase(Locale.ENGLISH);
        }
        fm2.BaseCoreGenericHandler(connection, flag, ch2, a_2, string);
    }

    private static final void c() {
        n = new String[]{"LibertyBans", "libertybans_", "warns", "SELECT * FROM ", "applicable_", "victim_type", "victim_uuid", "uuid", "victim: ", "operator", "address", "reason", "start", "end", "SELECT name FROM ", "latest_names WHERE uuid=?", "address", "victim_uuid", "uuid", "victim: ", "operator", "SELECT name FROM ", "latest_names WHERE uuid=?"};
}

