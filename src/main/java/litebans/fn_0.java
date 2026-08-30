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

/*
 * Renamed from litebans.fN
 */
public static final class fn_0
extends fS {
    private static /* synthetic */ String[] m;

    public fn_0(@NotNull di_0 di_02) {
        super(di_02, m[0], null, 0, 0L, 28, null);
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
            AutoCloseable autoCloseable = connection.prepareStatement(m[1] + this.j() + m[2] + n);
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
            AutoCloseable autoCloseable = connection.prepareStatement(m[3]);
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
                            fS.a(this, ch2, null, resultSet2.getString(m[4]), resultSet2.getLong(m[5]), resultSet2.getLong(m[6]), resultSet2.getString(m[7]), null, null, resultSet2.getString(m[8]), null, null, 1728, null);
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
                        fS.a(this, ch2, resultSet2.getString(m[9]), resultSet2.getString(m[10]), resultSet2.getLong(m[11]), resultSet2.getLong(m[12]), resultSet2.getString(m[13]), null, null, null, null, null, 1984, null);
                    }
                    catch (Exception exception) {
                        this.m().warning(m[14] + resultSet2.getString(m[15]) + m[16]);
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
        m = new String[]{hl.a("\u6117\u613b\u6122\u6118\u613b\u6134\u6129", -480616102), hl.a("\u3a18\u3a0e\u3a07\u3a0e\u3a08\u3a1f\u3a6b\u3a61\u3a6b\u3a0d\u3a19\u3a04\u3a06\u3a6b\u3a29\u3a2a\u3a25\u3a38\u3a6b\u3a04\u3a19\u3a0f\u3a0e\u3a19\u3a6b\u3a09\u3a12\u3a6b\u3a3f\u3a22\u3a26\u3a2e\u3a6b\u3a07\u3a02\u3a06\u3a02\u3a1f\u3a6b", 1160657483), hl.a("\ud296\ud2f9\ud2f0\ud2f0\ud2e5\ud2f3\ud2e2\ud296", -947137866), hl.a("\u2ea9\u2ebf\u2eb6\u2ebf\u2eb9\u2eae\u2eda\u2ed0\u2eda\u2ebc\u2ea8\u2eb5\u2eb7\u2eda\u2e93\u2e8a\u2e98\u2e9b\u2e94\u2e89", -1771688198), hl.a("\u5173\u5164\u5160\u5172\u516e\u516f", 844386561), hl.a("\u8484\u8499\u849d\u8495", -942111504), hl.a("\u2f71\u2f6c\u2f64\u2f7d\u2f66\u2f71\u2f67", -488624364), hl.a("\u5d14\u5d17\u5d18\u5d18\u5d13\u5d04", -1128505994), hl.a("\u0360\u0379", 705168137), hl.a("\u9b80\u9b8f\u9b83\u9b8b", -1317889042), hl.a("\u2500\u2517\u2513\u2501\u251d\u251c", -22796942), hl.a("\u82c2\u82df\u82db\u82d3", 312181430), hl.a("\u0e94\u0e89\u0e81\u0e98\u0e83\u0e94\u0e82", -1020653839), hl.a("\u827d\u827e\u8271\u8271\u827a\u826d", -1619361249), hl.a("\u9d1b\u9d3f\u9d22\u9d3d\u9d20\u9d26\u9d72\u9d34\u9d33\u9d3b\u9d3e\u9d37\u9d36\u9d72\u9d34\u9d3d\u9d20\u9d72\u9d30\u9d33\u9d3c\u9d72\u9d3d\u9d3c\u9d72\u9d75", 1814469970), hl.a("\ufac7\ufac8\ufac4\ufacc", -1114047831), hl.a("\u9fe1\u9ffd\u9fe6\u9fa8\u9fa7\u9fab\u9fa3\u9fe6\u9fa5\u9fae\u9fa7\u9fa8\u9fa1\u9fa3\u9fa2\u9fea\u9fe6\u9fb6\u9fa3\u9fb4\u9fae\u9fa7\u9fb6\u9fb5\u9ff9", -1839947834)};
    }

    static {
        fn_0.a();
    }
}

