package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class AdvancedbanHandler
extends BansHandler {
        public AdvancedbanHandler(@NotNull PlatformPlugin plugin) {
        super(plugin, "AdvancedBan", null, 0, 0L, 28, null);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull String string, @NotNull Connection connection, @NotNull LiteBansModule_83 ch2, boolean flag) {
        this.plugin("ban", BanHandler.LiteBansModule_241, connection, ch2);
        this.plugin("mute", BanHandler.GnuSparseMapHandler, connection, ch2);
    }

    private final void BaseCoreGenericHandler(String string, BanHandler a_2, Connection connection, LiteBansModule_83 ch2) {
        try {
            String string2 = StringUtilities.BaseCoreGenericHandler(string, Locale.ENGLISH);
            String string3 = "WHERE punishmentType='" + string2 + "' OR punishmentType='Temp" + string + "' OR punishmentType='TEMP_" + string2 + "' OR punishmentType='Ip" + string + "' OR punishmentType='IP_" + string2 + "' OR punishmentType='Tempip" + string + "' OR punishmentType='TEMP_IP_" + string2 + '\'';
            AdvancedbanHandler.BaseCoreGenericHandler(this, connection, "SELECT * FROM Punishments " + string3, string, ch2, a_2, false, 32, null);
            this.plugin(connection, "SELECT * FROM PunishmentHistory " + string3, string, ch2, a_2, false);
        }
        catch (Exception exception) {
            MessageHandler messageHandler = this;
            ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(Connection connection, String string, String string2, LiteBansModule_83 ch2, BanHandler a_2, boolean flag) {
        PreparedStatement preparedStatement = connection.prepareStatement(string);
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object targetObj = (PreparedStatement)autoCloseable;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object contextObj = (ResultSet)autoCloseable2;
                while (resultSet.next()) {
                    String string3 = resultSet.getString("name");
                    String string4 = LiteBansModule_50.c.e(resultSet.getString("uuid"));
                    String string5 = resultSet.getString("operator");
                    String string6 = resultSet.getString("reason");
                    String string7 = resultSet.getString("punishmentType");
                    ObjectUtilities.BaseCoreGenericHandler((Object)string7);
                    String string8 = string7;
                    String string9 = string8.toLowerCase(Locale.ENGLISH);
                    string8 = null;
                    boolean flag4 = StringUtilities.BaseCoreGenericHandler((CharSequence)string9, (CharSequence)("ip" + string2), false, 2, null);
                    String string10 = string4;
                    if (LiteBansModule_346.BaseCoreGenericHandler.i(string10) && !flag4) {
                        this.m().warning("IP was stored InitializerHandler_3 UUID column for " + string7 + '!');
                        flag4 = true;
                    }
                    if (flag4) {
                        string8 = string4;
                        string4 = this.LiteBansModule_31(string3);
                    }
                    string10 = string4;
                    flag5 = false;
                    if (!LiteBansModule_346.BaseCoreGenericHandler(string10)) {
                        this.m().warning("Username ('" + string4 + "') was stored InitializerHandler_3 UUID column for " + string7 + '!');
                        string4 = this.LiteBansModule_31(string4);
                    }
                    string10 = string4;
                    flag5 = false;
                    if (!LiteBansModule_346.BaseCoreGenericHandler(string10)) {
                        this.m().warning("Failed to import " + string7 + " for " + string4);
                        string4 = null;
                    }
                    long l3 = resultSet.getLong("start");
                    long l5 = Math.max(resultSet.getLong("end"), 0L);
                                        String string11 = ((ConfigService)((MessageHandler)resultObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25();
                                        resultObj = LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(((ConfigService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().BuilderactionHandler(), string11, this.LiteBansModule_241().HoverTextFormatter());
                    if (!flag || AllHandler_3.BaseCoreGenericHandler(ch2, string4, null, null, false, false, 30, null) == null) {
                        ObjectUtilities.BaseCoreGenericHandler((Object)string6);
                        helperObj = new SilentHandler(a_2, string4, string8, string6, this.LiteBansModule_31(string5), string5, (String)resultObj, string11, l3, l5, 0, false, flag4, flag, 0L, 19456, null);
                        ch2.c((SilentHandler)helperObj);
                        if (a_2 == BanHandler.LiteBansModule_241) {
                            this.g().incrementAndGet();
                        }
                    } else {
                        this.m().warning("Ignoring duplicate " + string2 + " for " + string4);
                    }
                    if (string4 == null) continue;
                    PlatformPlugin plugin = this.LiteBansModule_241();
                    ObjectUtilities.BaseCoreGenericHandler((Object)string3);
                    new LiteBansModule_222(plugin, string3, string4, string8).run();
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
    }

    static /* synthetic */ void BaseCoreGenericHandler(AdvancedbanHandler ft2, Connection connection, String string, String string2, LiteBansModule_83 ch2, BanHandler a_2, boolean flag, int n, Object targetObj) {
        if ((n & 0x20) != 0) {
            flag = true;
        }
        ft2.BaseCoreGenericHandler(connection, string, string2, ch2, a_2, flag);
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"AdvancedBan", "ban", "mute", "WHERE punishmentType='", "' OR punishmentType='Temp", "' OR punishmentType='TEMP_", "' OR punishmentType='Ip", "' OR punishmentType='IP_", "' OR punishmentType='Tempip", "' OR punishmentType='TEMP_IP_", "SELECT * FROM Punishments ", "SELECT * FROM PunishmentHistory ", "name", "uuid", "operator", "reason", "punishmentType", "ip", "IP was stored InitializerHandler_3 UUID column for ", "Username ('", "') was stored InitializerHandler_3 UUID column for ", "Failed to import ", " for ", "start", "end", "Ignoring duplicate ", " for "};
    }

    static {
        AdvancedbanHandler.BaseCoreGenericHandler();
    }
}

