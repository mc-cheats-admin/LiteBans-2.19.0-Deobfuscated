package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import litebans.ch;
import litebans.di_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.hl;
import litebans.iv_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fn_0
extends fS {
    private static /* synthetic */ String[] m;

    public fn_0(@NotNull di_0 di_02) {
        super(di_02, "MaxBans", null, 0, 0L, 28, null);
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        this.a(connection, ch2);
        this.a(bl, connection, ch2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(Connection connection, ch ch2) {
        int n = 0;
        while (true) {
            AutoCloseable autoCloseable = connection.prepareStatement("SELECT * FROM bans ORDER BY time LIMIT " + this.j() + " OFFSET " + n);
            Throwable throwable = null;
            try {
                Object object = (PreparedStatement)autoCloseable;
                boolean bl = false;
                ew.a(object);
                if (this.a((PreparedStatement)object, ch2) == 0) {
                    return;
                }
                object = iv_0.a;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                f_.a(autoCloseable, throwable);
            }
            n += this.j();
            Thread.sleep(this.d());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(boolean bl, Connection connection, ch ch2) {
        if (bl) {
            AutoCloseable autoCloseable = connection.prepareStatement("SELECT * FROM ipbans");
            Throwable throwable = null;
            try {
                Object object = (PreparedStatement)autoCloseable;
                boolean bl2 = false;
                if (object.execute()) {
                    ResultSet resultSet = object.getResultSet();
                    boolean bl3 = false;
                    AutoCloseable autoCloseable2 = resultSet;
                    Throwable throwable2 = null;
                    try {
                        Object object2 = (ResultSet)autoCloseable2;
                        boolean bl4 = false;
                        while (resultSet.next()) {
                            ResultSet resultSet2 = resultSet;
                            boolean bl5 = false;
                            fS.a(this, ch2, null, resultSet2.getString("reason"), resultSet2.getLong("time"), resultSet2.getLong("expires"), resultSet2.getString("banner"), null, null, resultSet2.getString("ip"), null, null, 1728, null);
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
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final int a(PreparedStatement preparedStatement, ch ch2) {
        int n = 0;
        if (preparedStatement.execute()) {
            ResultSet resultSet = preparedStatement.getResultSet();
            boolean bl = false;
            AutoCloseable autoCloseable = resultSet;
            Throwable throwable = null;
            try {
                Object object = (ResultSet)autoCloseable;
                boolean bl2 = false;
                while (resultSet.next()) {
                    ResultSet resultSet2 = resultSet;
                    boolean bl3 = false;
                    ++n;
                    try {
                        fS.a(this, ch2, resultSet2.getString("name"), resultSet2.getString("reason"), resultSet2.getLong("time"), resultSet2.getLong("expires"), resultSet2.getString("banner"), null, null, null, null, null, 1984, null);
                    }
                    catch (Exception exception) {
                        this.m().warning("Import failed for ban on '" + resultSet2.getString("name") + "'; name changed, perhaps?");
                        fg_0 fg_02 = this;
                        boolean bl4 = false;
                        ((w)fg_02.h().a(w.class)).a(exception);
                    }
                }
                object = iv_0.a;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                f_.a(autoCloseable, throwable);
            }
        }
        return n;
    }

    private static final void a() {
        m = new String[]{"MaxBans", "SELECT * FROM bans ORDER BY time LIMIT ", " OFFSET ", "SELECT * FROM ipbans", "reason", "time", "expires", "banner", "ip", "name", "reason", "time", "expires", "banner", "Import failed for ban on '", "name", "'; name changed, perhaps?"};
    }

    static {
        fn_0.a();
    }
}

