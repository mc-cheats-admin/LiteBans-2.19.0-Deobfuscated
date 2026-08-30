package litebans;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
public abstract class HexEncodingHelper
implements Connection {
    static final int AsyncBackgroundTask_5;
    static final int Utf8Handler_2;
    static final int LiteBansModule_401;
    static final int BaseCoreGenericHandler;
    static final int c;
    static final int LiteBansModule_31;
    private static final HikariLogger n;
    private static final Set ServerSyncService;
    private static final Set q;
    protected Connection r;
    private final InUseHandler LiteBansModule_240;
    private final AsyncBackgroundTask_15 i;
    private final LiteBansModule_226 g;
    private int BroadcastService;
    private long CommandThrottleService;
    private boolean PunishmentTableService;
    private boolean m;
    private boolean GnuSparseMapHandler;
    private int AsyncBackgroundTask_21;
    private int AsyncBackgroundTask_22;
    private String e;
    private String LiteBansModule_194;

    protected HexEncodingHelper(InUseHandler kJ2, Connection connection, LiteBansModule_226 gk2, AsyncBackgroundTask_15 ja2, long l3, boolean flag, boolean flag2) {
        this.LiteBansModule_240 = kJ2;
        this.r = connection;
        this.g = gk2;
        this.i = ja2;
        this.CommandThrottleService = l3;
        this.m = flag;
        this.GnuSparseMapHandler = flag2;
    }

    public final String toString() {
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + this.r;
    }

    final boolean AsyncBackgroundTask_5() {
        return this.GnuSparseMapHandler;
    }

    final String LiteBansModule_240() {
        return this.e;
    }

    final String c() {
        return this.LiteBansModule_194;
    }

    final int BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_22;
    }

    final boolean LiteBansModule_194() {
        return this.m;
    }

    final int g() {
        return this.AsyncBackgroundTask_21;
    }

    final SQLException BaseCoreGenericHandler(SQLException sQLException) {
        SQLException sQLException2 = sQLException;
        LiteBansModule_99 cs2 = this.LiteBansModule_240.AsyncBackgroundTask_5().CommandThrottleService;
        for (int n = 0; this.r != IsclosedHandler.BaseCoreGenericHandler && sQLException2 != null && n < 10; sQLException2 = sQLException2.getNextException(), ++n) {
            String string = sQLException2.getSQLState();
            if ((string == null || !string.startsWith("08")) && !(sQLException2 instanceof SQLTimeoutException) && !ServerSyncService.contains(string) && !q.contains(sQLException2.getErrorCode())) continue;
            if (cs2 != null && cs2.BaseCoreGenericHandler(sQLException2) == ContinueEvictHandler.c) break;
            flag = true;
            break;
        }
        if (flag) {
            SQLException sQLException3 = sQLException2 != null ? sQLException2 : sQLException;
            n.c("%AsyncBackgroundTask_21 - Connection %AsyncBackgroundTask_21 marked CommandExitException broken because of SQLSTATE(%AsyncBackgroundTask_21), ErrorCode(%AsyncBackgroundTask_5)", new Object[]{this.LiteBansModule_240.e(), this.r.toString(), sQLException3.getSQLState(), sQLException3.getErrorCode(), sQLException3});
            this.i.BaseCoreGenericHandler();
            this.LiteBansModule_240.BaseCoreGenericHandler("(connection is broken)");
            this.r = IsclosedHandler.BaseCoreGenericHandler;
        }
        return sQLException;
    }

    final synchronized void LiteBansModule_31(Statement statement) {
        this.g.remove(statement);
    }

    final void LiteBansModule_31() {
        if (this.GnuSparseMapHandler) {
            this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
        } else {
            this.PunishmentTableService = true;
}

    private final synchronized Statement BaseCoreGenericHandler(Statement statement) {
        this.g.add(statement);
        return statement;
    }

    private final synchronized void e() {
        int n = this.g.size();
        if (n > 0) {
            for (int i = 0; i < n && this.r != IsclosedHandler.BaseCoreGenericHandler; ++i) {
                try {
                    Statement statement = (Statement)this.g.get(i);
                    Throwable throwable = null;
                    if (statement == null) continue;
                    if (throwable != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                        continue;
                    }
                    statement.close();
                    continue;
                }
                catch (SQLException sQLException) {
                    HexEncodingHelper.n.c("%AsyncBackgroundTask_21 - Connection %AsyncBackgroundTask_21 marked CommandExitException broken because of HikariDataSource exception closing open statements during Connection.close()", new Object[]{this.LiteBansModule_240.e(), this.r.toString()});
                    this.i.BaseCoreGenericHandler();
                    this.LiteBansModule_240.BaseCoreGenericHandler("(exception closing Statements during Connection.close())");
                    this.r = IsclosedHandler.BaseCoreGenericHandler;
}
            this.g.clear();
}

    @Override
    public final void close() {
        this.e();
        if (this.r != IsclosedHandler.BaseCoreGenericHandler) {
            this.i.BaseCoreGenericHandler();
            try {
                if (this.PunishmentTableService && !this.GnuSparseMapHandler) {
                    this.r.rollback();
                    this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
                    n.LiteBansModule_31("%AsyncBackgroundTask_21 - Executed rollback on connection %AsyncBackgroundTask_21 due to dirty commit state on close() + ", new Object[]{this.LiteBansModule_240.e(), this.r.toString()});
                }
                if (this.BroadcastService != 0) {
                    this.LiteBansModule_240.BaseCoreGenericHandler(this, this.BroadcastService);
                    this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
                }
                this.r.clearWarnings();
            }
            catch (SQLException sQLException) {
                if (!this.LiteBansModule_240.LiteBansModule_31()) {
                    throw this.plugin(sQLException);
}
            finally {
                this.r = IsclosedHandler.BaseCoreGenericHandler;
                this.LiteBansModule_240.BaseCoreGenericHandler(this.CommandThrottleService);
}

    @Override
    public boolean isClosed() {
        return this.r == IsclosedHandler.BaseCoreGenericHandler;
    }

    @Override
    public Statement createStatement() {
        return LiteBansModule_64.BaseCoreGenericHandler(this, this.plugin(this.r.createStatement()));
    }

    @Override
    public Statement createStatement(int n, int n2) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, this.plugin(this.r.createStatement(n, n2)));
    }

    @Override
    public Statement createStatement(int n, int n2, int n3) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, this.plugin(this.r.createStatement(n, n2, n3)));
    }

    @Override
    public CallableStatement prepareCall(String string) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (CallableStatement)this.plugin(this.r.prepareCall(string)));
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (CallableStatement)this.plugin(this.r.prepareCall(string, n, n2)));
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2, int n3) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (CallableStatement)this.plugin(this.r.prepareCall(string, n, n2, n3)));
    }

    @Override
    public PreparedStatement prepareStatement(String string) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string, n)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string, n, n2)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2, int n3) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string, n, n2, n3)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int[] nArray) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string, nArray)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, String[] args) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, (PreparedStatement)this.plugin(this.r.prepareStatement(string, args)));
    }

    @Override
    public DatabaseMetaData getMetaData() {
        this.LiteBansModule_31();
        return LiteBansModule_64.BaseCoreGenericHandler(this, this.r.getMetaData());
    }

    @Override
    public void commit() {
        this.r.commit();
        this.PunishmentTableService = false;
        this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
    }

    @Override
    public void rollback() {
        this.r.rollback();
        this.PunishmentTableService = false;
        this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
    }

    @Override
    public void rollback(Savepoint savepoint) {
        this.r.rollback(savepoint);
        this.PunishmentTableService = false;
        this.CommandThrottleService = LiteBansModule_149.LiteBansModule_31();
    }

    @Override
    public void setAutoCommit(boolean flag) {
        this.r.setAutoCommit(flag);
        this.GnuSparseMapHandler = flag;
        this.BroadcastService |= 2;
    }

    @Override
    public void setReadOnly(boolean flag) {
        this.r.setReadOnly(flag);
        this.m = flag;
        this.PunishmentTableService = false;
        this.BroadcastService |= 1;
    }

    @Override
    public void setTransactionIsolation(int n) {
        this.r.setTransactionIsolation(n);
        this.AsyncBackgroundTask_22 = n;
        this.BroadcastService |= 4;
    }

    @Override
    public void setCatalog(String string) {
        this.r.setCatalog(string);
        this.e = string;
        this.BroadcastService |= 8;
    }

    @Override
    public void setNetworkTimeout(Executor executor, int n) {
        this.r.setNetworkTimeout(executor, n);
        this.AsyncBackgroundTask_21 = n;
        this.BroadcastService |= 0x10;
    }

    @Override
    public void setSchema(String string) {
        this.r.setSchema(string);
        this.LiteBansModule_194 = string;
        this.BroadcastService |= 0x20;
    }

    public final boolean isWrapperFor(Class clazz) {
        return clazz.isInstance(this.r) || this.r != null && this.r.isWrapperFor(clazz);
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.r)) {
            return this.r;
        }
        if (this.r != null) {
            return this.r.unwrap(clazz);
        }
        throw new SQLException("Wrapped connection is not HikariDataSource instance of " + clazz);
    }

    static {
        LiteBansModule_31 = 32;
        c = 16;
        BaseCoreGenericHandler = 8;
        LiteBansModule_401 = 4;
        Utf8Handler_2 = 2;
        AsyncBackgroundTask_5 = 1;
        n = HikariLogger.BaseCoreGenericHandler(HexEncodingHelper.class);
        ServerSyncService = new HashSet();
        ServerSyncService.add("0A000");
        ServerSyncService.add("57P01");
        ServerSyncService.add("57P02");
        ServerSyncService.add("57P03");
        ServerSyncService.add("01002");
        ServerSyncService.add("JZ0C0");
        ServerSyncService.add("JZ0C1");
        q = new HashSet();
        q.add(500150);
        q.add(2399);
}

