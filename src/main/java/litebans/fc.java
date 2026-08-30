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

public static final class fc
extends fS {
    private static /* synthetic */ String[] m;

    public fc(@NotNull di_0 di_02) {
        super(di_02, m[0], m[1], 0, 0L, 24, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement(m[2] + this.i() + m[3]);
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
                        PreparedStatement preparedStatement2 = connection.prepareStatement(m[4] + this.i() + m[5]);
                        AutoCloseable autoCloseable3 = preparedStatement2;
                        Throwable throwable3 = null;
                        try {
                            Object object3 = (PreparedStatement)autoCloseable3;
                            boolean bl4 = false;
                            preparedStatement2.setInt(1, resultSet.getInt(m[6]));
                            preparedStatement2.execute();
                            ResultSet resultSet2 = preparedStatement2.getResultSet();
                            if (resultSet2 != null && resultSet2.next()) {
                                String string2 = resultSet2.getString(m[7]);
                                String string3 = resultSet.getString(m[8]);
                                fg_0 fg_02 = this;
                                boolean bl5 = false;
                                o o2 = (o)fg_02.h().a(o.class);
                                ew.a(resultSet);
                                fg_02 = this;
                                bl5 = false;
                                Date date = o2.a(resultSet, m[9], false, ((q_0)fg_02.h().a(q_0.class)).f().aF());
                                long l3 = date.getTime();
                                fg_0 fg_03 = this;
                                boolean bl6 = false;
                                o o3 = (o)fg_03.h().a(o.class);
                                fg_03 = this;
                                bl6 = false;
                                Date date2 = o3.a(resultSet, m[10], false, ((q_0)fg_03.h().a(q_0.class)).f().aF());
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
        m = new String[]{hl.a("\ue73b\ue718\ue717\ue731\ue718\ue714\ue714\ue71c\ue70b", 2054023033), hl.a("\u7f7a\u7f79\u7f76\u7f70\u7f79\u7f75\u7f75\u7f7d\u7f6a\u7f47", -653951208), hl.a("\u1b4e\u1b58\u1b51\u1b58\u1b5e\u1b49\u1b3d\u1b37\u1b3d\u1b5b\u1b4f\u1b52\u1b50\u1b3d", 2124028701), hl.a("\u104f\u104c\u1043\u105e\u100d\u107a\u1065\u1068\u107f\u1068\u100d\u105e\u1059\u104c\u1059\u1048\u1010\u101d", -399372243), hl.a("\u7280\u7296\u729f\u7296\u7290\u7287\u72f3\u72f9\u72f3\u7295\u7281\u729c\u729e\u72f3", -211258669), hl.a("\u0aff\u0ae3\u0aee\u0af6\u0aea\u0afd\u0afc\u0aaf\u0ad8\u0ac7\u0aca\u0add\u0aca\u0aaf\u0ae6\u0aeb\u0ab2\u0ab0", -2105800049), hl.a("\uaed5\uaec9\uaec4\uaedc\uaec0\uaed7\uaefa\uaecc\uaec1", -116085083), hl.a("\u3360\u336f\u3363\u336b", 1200108302), hl.a("\u1f93\u1f84\u1f80\u1f92\u1f8e\u1f8f", -507174943), hl.a("\u1423\u1432\u1425\u1421\u1434\u1425\u1424\u141f\u1421\u1434", 1847268416), hl.a("\uaa25\uaa38\uaa30\uaa29\uaa32\uaa25\uaa33\uaa1f\uaa21\uaa34", 69839424)};
    }

    static {
        fc.a();
    }
}

