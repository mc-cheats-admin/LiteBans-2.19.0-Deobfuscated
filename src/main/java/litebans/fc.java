package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.hl;
import litebans.iv_0;
import litebans.o;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class fc
extends fS {
    private static /* synthetic */ String[] m;

    public fc(@NotNull di_0 di_02) {
        super(di_02, "BanHammer", "banhammer_", 0, 0L, 24, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.i() + "bans WHERE state=0");
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl2 = false;
            if (preparedStatement.execute()) {
                ResultSet resultSet = preparedStatement.getResultSet();
                AutoCloseable autoCloseable2 = resultSet;
                Throwable throwable2 = null;
                try {
                    Object object2 = (ResultSet)autoCloseable2;
                    boolean bl3 = false;
                    while (resultSet.next()) {
                        PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM " + this.i() + "players WHERE id=?");
                        AutoCloseable autoCloseable3 = preparedStatement2;
                        Throwable throwable3 = null;
                        try {
                            Object object3 = (PreparedStatement)autoCloseable3;
                            boolean bl4 = false;
                            preparedStatement2.setInt(1, resultSet.getInt("player_id"));
                            preparedStatement2.execute();
                            ResultSet resultSet2 = preparedStatement2.getResultSet();
                            if (resultSet2 != null && resultSet2.next()) {
                                String string2 = resultSet2.getString("name");
                                String string3 = resultSet.getString("reason");
                                fg_0 fg_02 = this;
                                boolean bl5 = false;
                                o o2 = (o)fg_02.h().a(o.class);
                                ew.a(resultSet);
                                fg_02 = this;
                                bl5 = false;
                                Date date = o2.a(resultSet, "created_at", false, ((q_0)fg_02.h().a(q_0.class)).f().aF());
                                long l3 = date.getTime();
                                fg_0 fg_03 = this;
                                boolean bl6 = false;
                                o o3 = (o)fg_03.h().a(o.class);
                                fg_03 = this;
                                bl6 = false;
                                Date date2 = o3.a(resultSet, "expires_at", false, ((q_0)fg_03.h().a(q_0.class)).f().aF());
                                long l5 = date2.getTime();
                                fS fS2 = this;
                                ew.a((Object)string3);
                                fS.a(fS2, ch2, string2, string3, l3, l5, null, null, null, null, null, null, 1984, null);
                            }
                            object3 = iv_0.a;
                        }
                        catch (Throwable throwable4) {
                            throwable3 = throwable4;
                            throw throwable4;
                        }
                        finally {
                            f_.a(autoCloseable3, throwable3);
                        }
                    }
                    object2 = iv_0.a;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
            }
            object = iv_0.a;
        }
        catch (Throwable throwable6) {
            throwable = throwable6;
            throw throwable6;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    private static final void a() {
        m = new String[]{"BanHammer", "banhammer_", "SELECT * FROM ", "bans WHERE state=0", "SELECT * FROM ", "players WHERE id=?", "player_id", "name", "reason", "created_at", "expires_at"};
    }

    static {
        fc.a();
    }
}

