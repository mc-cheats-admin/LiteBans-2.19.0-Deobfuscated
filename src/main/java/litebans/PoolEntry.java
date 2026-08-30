package litebans;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
static abstract class PoolEntry {
    private final HikariLogger q = HikariLogger.BaseCoreGenericHandler(PoolEntry.class);
    public final HikariConfig AsyncBackgroundTask_22;
    protected final String e;
    volatile String c;
    final AtomicReference DatabaseMonitorService;
    long AsyncBackgroundTask_21;
    long LiteBansModule_194;
    LiteBansModule_99 CommandThrottleService;
    private static final String[] i;
    private static final int BaseCoreGenericHandler;
    private static final int r;
    private static final int GnuSparseMapHandler;
    private int LiteBansModule_31;
    private int g;
    private int n;
    private int AsyncBackgroundTask_5;
    private int m;
    private Executor Utf8Handler_2;
    private DataSource BroadcastService;
    private final String LiteBansModule_401;
    private final boolean ServerSyncService;
    private final boolean HoverTextFormatter;
    private final boolean LiteBansModule_433;
    private final boolean PunishmentTableService;
    private volatile boolean LiteBansModule_240;

    PoolEntry(HikariConfig aB2) {
        this.AsyncBackgroundTask_22 = aB2;
        this.LiteBansModule_31 = -1;
        this.c = aB2.AsyncBackgroundTask_5();
        this.LiteBansModule_401 = aB2.PunishmentTableService();
        this.ServerSyncService = aB2.Utf8Handler_2();
        this.HoverTextFormatter = aB2.CommandThrottleService();
        this.CommandThrottleService = (LiteBansModule_99)LiteBansModule_131.BaseCoreGenericHandler(aB2.q(), LiteBansModule_99.class, new Object[0]);
        this.m = LiteBansModule_131.BaseCoreGenericHandler(aB2.BanHandler_2());
        this.n = -1;
        this.g = -1;
        this.LiteBansModule_433 = aB2.LiteBansModule_433() == null;
        this.PunishmentTableService = aB2.GnuSparseMapHandler();
        this.e = aB2.e();
        this.AsyncBackgroundTask_21 = aB2.c();
        this.LiteBansModule_194 = aB2.LiteBansModule_240();
        this.DatabaseMonitorService = new AtomicReference();
        this.e();
    }

    public String toString() {
        return this.e;
    }

    abstract void BaseCoreGenericHandler(InUseHandler var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void BaseCoreGenericHandler(Connection connection, String string) {
        if (connection != null) {
            try {
                this.q.LiteBansModule_31("%AsyncBackgroundTask_21 - Closing connection %AsyncBackgroundTask_21: %AsyncBackgroundTask_21", new Object[]{this.e, connection.toString(), string});
                try {
                    this.plugin(connection, TimeUnit.SECONDS.toMillis(15L));
                }
                catch (SQLException sQLException) {
                }
                finally {
                    connection.close();
}
            catch (Exception exception) {
                this.q.LiteBansModule_31("%AsyncBackgroundTask_21 - Closing connection %AsyncBackgroundTask_21 failed", new Object[]{this.e, connection.toString(), exception});
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean AsyncBackgroundTask_5(Connection connection) {
        try {
            try {
                this.plugin(connection, this.LiteBansModule_194);
                int n = (int)Math.max(1000L, this.LiteBansModule_194) / 1000;
                if (this.LiteBansModule_433) {
                    boolean flag = connection.isValid(n);
                    return flag;
                }
                try (Statement statement = connection.createStatement();){
                    if (this.g != 1) {
                        this.plugin(statement, n);
                    }
                    statement.execute(this.AsyncBackgroundTask_22.LiteBansModule_433());
                    return true;
}
            finally {
                this.plugin(connection, (long)this.LiteBansModule_31);
                if (this.PunishmentTableService && !this.HoverTextFormatter) {
                    connection.rollback();
}
        catch (Exception exception) {
            this.DatabaseMonitorService.set(exception);
            this.q.c("%AsyncBackgroundTask_21 - Failed to validate connection %AsyncBackgroundTask_21 (%AsyncBackgroundTask_21). Possibly consider using BaseCoreGenericHandler shorter maxLifetime ", new Object[]{this.e, connection.toString(), exception.getMessage()});
            return false;
}

    Exception g() {
        return (Exception)this.DatabaseMonitorService.get();
    }

    public DataSource c() {
        return this.BroadcastService;
    }

    InUseHandler AsyncBackgroundTask_5() {
        return new InUseHandler(this.LiteBansModule_194(), this, this.ServerSyncService, this.HoverTextFormatter);
    }

    void BaseCoreGenericHandler(Connection connection, HexEncodingHelper c22, int n) {
        if ((n & 1) != 0 && c22.LiteBansModule_194() != this.ServerSyncService) {
            connection.setReadOnly(this.ServerSyncService);
            n2 |= 1;
        }
        if ((n & 2) != 0 && c22.AsyncBackgroundTask_5() != this.HoverTextFormatter) {
            connection.setAutoCommit(this.HoverTextFormatter);
            n2 |= 2;
        }
        if ((n & 4) != 0 && c22.BaseCoreGenericHandler() != this.m) {
            connection.setTransactionIsolation(this.m);
            n2 |= 4;
        }
        if ((n & 8) != 0 && this.c != null && !this.c.equals(c22.LiteBansModule_240())) {
            connection.setCatalog(this.c);
            n2 |= 8;
        }
        if ((n & 0x10) != 0 && c22.g() != this.LiteBansModule_31) {
            this.plugin(connection, (long)this.LiteBansModule_31);
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0 && this.LiteBansModule_401 != null && !this.LiteBansModule_401.equals(c22.c())) {
            connection.setSchema(this.LiteBansModule_401);
            n2 |= 0x20;
        }
        if (n2 != 0 && this.q.BaseCoreGenericHandler()) {
            this.q.LiteBansModule_31("%AsyncBackgroundTask_21 - Reset (%AsyncBackgroundTask_21) on connection %AsyncBackgroundTask_21", new Object[]{this.e, this.plugin(n2), connection.toString()});
}

    void LiteBansModule_31() {
        if (this.Utf8Handler_2 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor)this.Utf8Handler_2).shutdownNow();
}

    long LiteBansModule_240() {
        try {
            return this.BroadcastService != null ? (long)this.BroadcastService.getLoginTimeout() : TimeUnit.SECONDS.toSeconds(5L);
        }
        catch (SQLException sQLException) {
            return TimeUnit.SECONDS.toSeconds(5L);
}

    void BaseCoreGenericHandler(HikariPool dr2, boolean flag) {
        if (!this.AsyncBackgroundTask_22.LiteBansModule_240()) {
            return;
        }
        try {
            ObjectName objectName;
            ObjectName objectName2;
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            if ("true".equals(System.getProperty("hikaricp.jmx.register2.0"))) {
                objectName2 = new ObjectName("com.zaxxer.hikari:type=PoolConfig,name=" + this.e);
                objectName = new ObjectName("com.zaxxer.hikari:type=Pool,name=" + this.e);
            } else {
                objectName2 = new ObjectName("com.zaxxer.hikari:type=PoolConfig (" + this.e + ")");
                objectName = new ObjectName("com.zaxxer.hikari:type=Pool (" + this.e + ")");
            }
            if (flag) {
                if (!mBeanServer.isRegistered(objectName2)) {
                    mBeanServer.registerMBean(this.AsyncBackgroundTask_22, objectName2);
                    mBeanServer.registerMBean(dr2, objectName);
                } else {
                    this.q.BaseCoreGenericHandler("{} - JMX name ({}) is already ", new Object[]{this.e, this.e});
} else if (mBeanServer.isRegistered(objectName2)) {
                mBeanServer.unregisterMBean(objectName2);
                mBeanServer.unregisterMBean(objectName);
}
        catch (Exception exception) {
            this.q.c("{} - Failed to {} management ", new Object[]{this.e, flag ? "register" : "unregister", exception});
}

    private final void e() {
        String string = this.AsyncBackgroundTask_22.m();
        String string2 = this.AsyncBackgroundTask_22.B();
        String string3 = this.AsyncBackgroundTask_22.AsyncBackgroundTask_21();
        String string4 = this.AsyncBackgroundTask_22.DatabaseMonitorService();
        String string5 = this.AsyncBackgroundTask_22.LiteBansModule_194();
        String string6 = this.AsyncBackgroundTask_22.i();
        Properties properties = this.AsyncBackgroundTask_22.A();
        DataSource dataSource = this.AsyncBackgroundTask_22.AsyncBackgroundTask_22();
        if (string4 != null && dataSource == null) {
            dataSource = (DataSource)LiteBansModule_131.BaseCoreGenericHandler(string4, DataSource.class, new Object[0]);
            SetHandler.BaseCoreGenericHandler(dataSource, properties);
        } else if (string != null && dataSource == null) {
            dataSource = new UserHandler(string, string5, properties, string2, string3);
        } else if (string6 != null && dataSource == null) {
            try {
                InitialContext initialContext = new InitialContext();
                dataSource = (DataSource)initialContext.lookup(string6);
            }
            catch (NamingException namingException) {
                throw new LiteBansException_3(namingException);
}
        if (dataSource != null) {
            this.plugin(dataSource);
            this.plugin(dataSource, string4, string);
        }
        this.BroadcastService = dataSource;
    }

    private final Connection LiteBansModule_194() {
        long l3 = LiteBansModule_149.LiteBansModule_31();
        Connection connection = null;
        try {
            String string = this.AsyncBackgroundTask_22.B();
            String string2 = this.AsyncBackgroundTask_22.AsyncBackgroundTask_21();
            Connection connection2 = connection = string == null ? this.BroadcastService.getConnection() : this.BroadcastService.getConnection(string, string2);
            if (connection == null) {
                throw new SQLTransientConnectionException("DataSource returned null unexpectedly");
            }
            this.e(connection);
            this.DatabaseMonitorService.set(null);
            return connection;
        }
        catch (Exception exception) {
            if (connection != null) {
                this.plugin(connection, "(Failed to create/setup connection)");
            } else if (this.g() == null) {
                this.q.LiteBansModule_31("%AsyncBackgroundTask_21 - Failed to create/setup connection: %AsyncBackgroundTask_21", new Object[]{this.e, exception.getMessage()});
            }
            this.DatabaseMonitorService.set(exception);
            throw exception;
}

    private final void e(Connection connection) {
        try {
            if (this.LiteBansModule_31 == -1) {
                this.LiteBansModule_31 = this.LiteBansModule_31(connection, this.LiteBansModule_194);
            } else {
                this.plugin(connection, this.LiteBansModule_194);
            }
            if (connection.isReadOnly() != this.ServerSyncService) {
                connection.setReadOnly(this.ServerSyncService);
            }
            if (connection.getAutoCommit() != this.HoverTextFormatter) {
                connection.setAutoCommit(this.HoverTextFormatter);
            }
            this.c(connection);
            if (this.m != this.AsyncBackgroundTask_5) {
                connection.setTransactionIsolation(this.m);
            }
            if (this.c != null) {
                connection.setCatalog(this.c);
            }
            if (this.LiteBansModule_401 != null) {
                connection.setSchema(this.LiteBansModule_401);
            }
            this.plugin(connection, this.AsyncBackgroundTask_22.LiteBansModule_31(), true);
            this.plugin(connection, (long)this.LiteBansModule_31);
        }
        catch (SQLException sQLException) {
            throw new LiteBansException_6(sQLException);
}

    private final void c(Connection connection) {
        if (!this.LiteBansModule_240) {
            this.plugin(connection);
            this.LiteBansModule_31(connection);
            this.LiteBansModule_240 = true;
}

    private final void BaseCoreGenericHandler(Connection connection) {
        try {
            if (this.LiteBansModule_433) {
                connection.isValid(1);
            } else {
                this.plugin(connection, this.AsyncBackgroundTask_22.LiteBansModule_433(), false);
}
        catch (AbstractMethodError | Exception throwable) {
            this.q.BaseCoreGenericHandler("%AsyncBackgroundTask_21 - Failed to execute%AsyncBackgroundTask_21 connection test query (%AsyncBackgroundTask_21) + ", new Object[]{this.e, this.LiteBansModule_433 ? " isValid() for connection, configure" : "", throwable.getMessage()});
            throw throwable;
}

    private final void LiteBansModule_31(Connection connection) {
{
            try {
                this.AsyncBackgroundTask_5 = connection.getTransactionIsolation();
                if (this.m == -1) {
                    this.m = this.AsyncBackgroundTask_5;
}
            catch (SQLException sQLException) {
                this.q.c("%AsyncBackgroundTask_21 - Default transaction isolation level detection failed (%AsyncBackgroundTask_21) + ", new Object[]{this.e, sQLException.getMessage()});
                if (sQLException.getSQLState() == null || sQLException.getSQLState().startsWith("08")) break;
                throw sQLException;
}

    private final void BaseCoreGenericHandler(Statement statement, int n) {
{
            if (this.n != 0) {
                try {
                    statement.setQueryTimeout(n);
                    this.n = 1;
                }
                catch (Exception exception) {
                    if (this.n != -1) break;
                    this.n = 0;
                    this.q.AsyncBackgroundTask_5("%AsyncBackgroundTask_21 - Failed to set query timeout for statement. (%AsyncBackgroundTask_21)", new Object[]{this.e, exception.getMessage()});
}

    private final int LiteBansModule_31(Connection connection, long l3) {
{
            if (this.g != 0) {
                try {
                    int n = connection.getNetworkTimeout();
                    connection.setNetworkTimeout(this.Utf8Handler_2, (int)l3);
                    this.g = 1;
                    return n;
                }
                catch (AbstractMethodError | Exception throwable) {
                    if (this.g != -1) break;
                    this.g = 0;
                    this.q.AsyncBackgroundTask_5("%AsyncBackgroundTask_21 - Driver does not support get/set network timeout for connections. (%AsyncBackgroundTask_21)", new Object[]{this.e, throwable.getMessage()});
                    if (this.LiteBansModule_194 < TimeUnit.SECONDS.toMillis(1L)) {
                        this.q.c("%AsyncBackgroundTask_21 - A validationTimeout of less than 1 second cannot be honored on drivers without setNetworkTimeout() ", new Object[]{this.e});
                    }
                    if (this.LiteBansModule_194 % TimeUnit.SECONDS.toMillis(1L) == 0L) break;
                    this.q.c("%AsyncBackgroundTask_21 - A validationTimeout with fractional second granularity cannot be honored on drivers without setNetworkTimeout() ", new Object[]{this.e});
}
        return 0;
    }

    private final void BaseCoreGenericHandler(Connection connection, long l3) {
        if (this.g == 1) {
            connection.setNetworkTimeout(this.Utf8Handler_2, (int)l3);
}

    private final void BaseCoreGenericHandler(Connection connection, String string, boolean flag) {
        if (string != null) {
            try (Statement statement = connection.createStatement();){
                statement.execute(string);
            }
            if (this.PunishmentTableService && !this.HoverTextFormatter) {
                if (flag) {
                    connection.commit();
                } else {
                    connection.rollback();
}

    private final void BaseCoreGenericHandler(DataSource dataSource, String string, String string2) {
        if (string != null && string.contains("Mysql") || string2 != null && string2.contains("mysql") || dataSource != null && dataSource.getClass().getName().contains("Mysql")) {
            this.Utf8Handler_2 = new LiteBansModule_151(null);
        } else {
            ThreadFactory threadFactory = this.AsyncBackgroundTask_22.ServerSyncService();
            threadFactory = threadFactory != null ? threadFactory : new LiteBansModule_216(this.e + " network timeout executor", true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool(threadFactory);
            threadPoolExecutor.setKeepAliveTime(15L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.Utf8Handler_2 = threadPoolExecutor;
}

    private final void BaseCoreGenericHandler(DataSource dataSource) {
        if (this.AsyncBackgroundTask_21 != Integer.MAX_VALUE) {
            try {
                dataSource.setLoginTimeout(Math.max(1, (int)TimeUnit.MILLISECONDS.toSeconds(500L + this.AsyncBackgroundTask_21)));
            }
            catch (Exception exception) {
                this.q.AsyncBackgroundTask_5("%AsyncBackgroundTask_21 - Failed to set login timeout for data source. (%AsyncBackgroundTask_21)", new Object[]{this.e, exception.getMessage()});
}

    private final String BaseCoreGenericHandler(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < PoolEntry.i.length; ++i) {
            if ((n & 1 << i) == 0) continue;
            stringBuilder.append(PoolEntry.i[i]).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);
        return stringBuilder.toString();
    }

    static {
        GnuSparseMapHandler = 0;
        r = 1;
        BaseCoreGenericHandler = -1;
        i = new String[]{"readOnly", "autoCommit", "isolation", "catalog", "netTimeout", "schema"};
}

