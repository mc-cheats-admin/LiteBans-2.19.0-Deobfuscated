package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import litebans.a_;
import litebans.bK;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.gf_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jj_0;
import litebans.kR;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class ft
extends fS {
    private static /* synthetic */ String[] m;

    public ft(@NotNull di_0 di_02) {
        super(di_02, "AdvancedBan", null, 0, 0L, 28, null);
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        this.a("ban", a_.h, connection, ch2);
        this.a("mute", a_.j, connection, ch2);
    }

    private final void a(String string, a_ a_2, Connection connection, ch ch2) {
        try {
            String string2 = bz.a(string, Locale.ENGLISH);
            String string3 = "WHERE punishmentType='" + string2 + "' OR punishmentType='Temp" + string + "' OR punishmentType='TEMP_" + string2 + "' OR punishmentType='Ip" + string + "' OR punishmentType='IP_" + string2 + "' OR punishmentType='Tempip" + string + "' OR punishmentType='TEMP_IP_" + string2 + '\'';
            ft.a(this, connection, "SELECT * FROM Punishments " + string3, string, ch2, a_2, false, 32, null);
            this.a(connection, "SELECT * FROM PunishmentHistory " + string3, string, ch2, a_2, false);
        }
        catch (Exception exception) {
            fg_0 fg_02 = this;
            boolean bl = false;
            ((w)fg_02.h().a(w.class)).a(exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Connection connection, String string, String string2, ch ch2, a_ a_2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement(string);
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl2 = false;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean bl3 = false;
                while (resultSet.next()) {
                    String string3 = resultSet.getString("name");
                    String string4 = bK.c.e(resultSet.getString("uuid"));
                    String string5 = resultSet.getString("operator");
                    String string6 = resultSet.getString("reason");
                    String string7 = resultSet.getString("punishmentType");
                    ew.a((Object)string7);
                    String string8 = string7;
                    String string9 = string8.toLowerCase(Locale.ENGLISH);
                    string8 = null;
                    boolean bl4 = bz.a((CharSequence)string9, (CharSequence)("ip" + string2), false, 2, null);
                    String string10 = string4;
                    boolean bl5 = false;
                    if (jj_0.a.i(string10) && !bl4) {
                        this.m().warning("IP was stored in UUID column for " + string7 + '!');
                        bl4 = true;
                    }
                    if (bl4) {
                        string8 = string4;
                        string4 = this.b(string3);
                    }
                    string10 = string4;
                    bl5 = false;
                    if (!jj_0.a(string10)) {
                        this.m().warning("Username ('" + string4 + "') was stored in UUID column for " + string7 + '!');
                        string4 = this.b(string4);
                    }
                    string10 = string4;
                    bl5 = false;
                    if (!jj_0.a(string10)) {
                        this.m().warning("Failed to import " + string7 + " for " + string4);
                        string4 = null;
                    }
                    long l3 = resultSet.getLong("start");
                    long l5 = Math.max(resultSet.getLong("end"), 0L);
                    Object object3 = this;
                    boolean bl6 = false;
                    String string11 = ((q_0)((fg_0)object3).h().a(q_0.class)).f().aw();
                    Object object4 = this;
                    boolean bl7 = false;
                    object3 = eq_0.f.a(((q_0)((fg_0)object4).h().a(q_0.class)).f().a5(), string11, this.h().y());
                    if (!bl || kR.a(ch2, string4, null, null, false, false, 30, null) == null) {
                        ew.a((Object)string6);
                        object4 = new dZ(a_2, string4, string8, string6, this.b(string5), string5, (String)object3, string11, l3, l5, 0, false, bl4, bl, 0L, 19456, null);
                        ch2.c((dZ)object4);
                        if (a_2 == a_.h) {
                            this.g().incrementAndGet();
                        }
                    } else {
                        this.m().warning("Ignoring duplicate " + string2 + " for " + string4);
                    }
                    if (string4 == null) continue;
                    di_0 di_02 = this.h();
                    ew.a((Object)string3);
                    new gf_0(di_02, string3, string4, string8).run();
                }
                object2 = iv_0.a;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
                throw throwable3;
            }
            finally {
                f_.a(autoCloseable2, throwable2);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    static /* synthetic */ void a(ft ft2, Connection connection, String string, String string2, ch ch2, a_ a_2, boolean bl, int n, Object object) {
        if ((n & 0x20) != 0) {
            bl = true;
        }
        ft2.a(connection, string, string2, ch2, a_2, bl);
    }

    private static final void a() {
        m = new String[]{"AdvancedBan", "ban", "mute", "WHERE punishmentType='", "' OR punishmentType='Temp", "' OR punishmentType='TEMP_", "' OR punishmentType='Ip", "' OR punishmentType='IP_", "' OR punishmentType='Tempip", "' OR punishmentType='TEMP_IP_", "SELECT * FROM Punishments ", "SELECT * FROM PunishmentHistory ", "name", "uuid", "operator", "reason", "punishmentType", "ip", "IP was stored in UUID column for ", "Username ('", "') was stored in UUID column for ", "Failed to import ", " for ", "start", "end", "Ignoring duplicate ", " for "};
    }

    static {
        ft.a();
    }
}

