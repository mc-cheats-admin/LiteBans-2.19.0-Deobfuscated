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
import litebans.aB;
import litebans.bh;
import litebans.c2;
import litebans.cs;
import litebans.d3;
import litebans.dO;
import litebans.dr;
import litebans.e6;
import litebans.e9;
import litebans.fP;
import litebans.gc;
import litebans.iO;
import litebans.kI;
import litebans.kJ;

static abstract class dI {
    private final kI q = kI.a(dI.class);
    public final aB t;
    protected final String e;
    volatile String c;
    final AtomicReference w;
    long s;
    long f;
    cs v;
    private static final String[] i;
    private static final int a;
    private static final int r;
    private static final int j;
    private int b;
    private int g;
    private int n;
    private int d;
    private int m;
    private Executor k;
    private DataSource o;
    private final String l;
    private final boolean u;
    private final boolean y;
    private final boolean x;
    private final boolean p;
    private volatile boolean h;

    dI(aB aB2) {
        this.t = aB2;
        this.b = -1;
        this.c = aB2.d();
        this.l = aB2.p();
        this.u = aB2.k();
        this.y = aB2.v();
        this.v = (cs)dO.a(aB2.q(), cs.class, new Object[0]);
        this.m = dO.a(aB2.C());
        this.n = -1;
        this.g = -1;
        this.x = aB2.x() == null;
        this.p = aB2.j();
        this.e = aB2.e();
        this.s = aB2.c();
        this.f = aB2.h();
        this.w = new AtomicReference();
        this.e();
    }

    public String toString() {
        return this.e;
    }

    abstract void a(kJ var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(Connection connection, String string) {
        if (connection != null) {
            try {
                this.q.b("%s - Closing connection %s: %s", new Object[]{this.e, connection.toString(), string});
                try {
                    this.a(connection, TimeUnit.SECONDS.toMillis(15L));
                }
                catch (SQLException sQLException) {
                }
                finally {
                    connection.close();
                }
            }
            catch (Exception exception) {
                this.q.b("%s - Closing connection %s failed", new Object[]{this.e, connection.toString(), exception});
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean d(Connection connection) {
        try {
            try {
                this.a(connection, this.f);
                int n = (int)Math.max(1000L, this.f) / 1000;
                if (this.x) {
                    boolean bl = connection.isValid(n);
                    return bl;
                }
                try (Statement statement = connection.createStatement();){
                    if (this.g != 1) {
                        this.a(statement, n);
                    }
                    statement.execute(this.t.x());
                    return true;
                }
            }
            finally {
                this.a(connection, (long)this.b);
                if (this.p && !this.y) {
                    connection.rollback();
                }
            }
        }
        catch (Exception exception) {
            this.w.set(exception);
            this.q.c("%s - Failed to validate connection %s (%s). Possibly consider using a shorter maxLifetime value.", new Object[]{this.e, connection.toString(), exception.getMessage()});
            return false;
        }
    }

    Exception g() {
        return (Exception)this.w.get();
    }

    public DataSource c() {
        return this.o;
    }

    kJ d() {
        return new kJ(this.f(), this, this.u, this.y);
    }

    void a(Connection connection, c2 c22, int n) {
        int n2 = 0;
        if ((n & 1) != 0 && c22.f() != this.u) {
            connection.setReadOnly(this.u);
            n2 |= 1;
        }
        if ((n & 2) != 0 && c22.d() != this.y) {
            connection.setAutoCommit(this.y);
            n2 |= 2;
        }
        if ((n & 4) != 0 && c22.a() != this.m) {
            connection.setTransactionIsolation(this.m);
            n2 |= 4;
        }
        if ((n & 8) != 0 && this.c != null && !this.c.equals(c22.h())) {
            connection.setCatalog(this.c);
            n2 |= 8;
        }
        if ((n & 0x10) != 0 && c22.g() != this.b) {
            this.a(connection, (long)this.b);
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0 && this.l != null && !this.l.equals(c22.c())) {
            connection.setSchema(this.l);
            n2 |= 0x20;
        }
        if (n2 != 0 && this.q.a()) {
            this.q.b("%s - Reset (%s) on connection %s", new Object[]{this.e, this.a(n2), connection.toString()});
        }
    }

    void b() {
        if (this.k instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor)this.k).shutdownNow();
        }
    }

    long h() {
        try {
            return this.o != null ? (long)this.o.getLoginTimeout() : TimeUnit.SECONDS.toSeconds(5L);
        }
        catch (SQLException sQLException) {
            return TimeUnit.SECONDS.toSeconds(5L);
        }
    }

    void a(dr dr2, boolean bl) {
        if (!this.t.h()) {
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
            if (bl) {
                if (!mBeanServer.isRegistered(objectName2)) {
                    mBeanServer.registerMBean(this.t, objectName2);
                    mBeanServer.registerMBean(dr2, objectName);
                } else {
                    this.q.a("{} - JMX name ({}) is already registered.", new Object[]{this.e, this.e});
                }
            } else if (mBeanServer.isRegistered(objectName2)) {
                mBeanServer.unregisterMBean(objectName2);
                mBeanServer.unregisterMBean(objectName);
            }
        }
        catch (Exception exception) {
            this.q.c("{} - Failed to {} management beans.", new Object[]{this.e, bl ? "register" : "unregister", exception});
        }
    }

    private final void e() {
        String string = this.t.m();
        String string2 = this.t.B();
        String string3 = this.t.s();
        String string4 = this.t.w();
        String string5 = this.t.f();
        String string6 = this.t.i();
        Properties properties = this.t.A();
        DataSource dataSource = this.t.t();
        if (string4 != null && dataSource == null) {
            dataSource = (DataSource)dO.a(string4, DataSource.class, new Object[0]);
            bh.a(dataSource, properties);
        } else if (string != null && dataSource == null) {
            dataSource = new iO(string, string5, properties, string2, string3);
        } else if (string6 != null && dataSource == null) {
            try {
                InitialContext initialContext = new InitialContext();
                dataSource = (DataSource)initialContext.lookup(string6);
            }
            catch (NamingException namingException) {
                throw new d3(namingException);
            }
        }
        if (dataSource != null) {
            this.a(dataSource);
            this.a(dataSource, string4, string);
        }
        this.o = dataSource;
    }

    private final Connection f() {
        long l3 = e6.b();
        Connection connection = null;
        try {
            String string = this.t.B();
            String string2 = this.t.s();
            Connection connection2 = connection = string == null ? this.o.getConnection() : this.o.getConnection(string, string2);
            if (connection == null) {
                throw new SQLTransientConnectionException("DataSource returned null unexpectedly");
            }
            this.e(connection);
            this.w.set(null);
            return connection;
        }
        catch (Exception exception) {
            if (connection != null) {
                this.a(connection, "(Failed to create/setup connection)");
            } else if (this.g() == null) {
                this.q.b("%s - Failed to create/setup connection: %s", new Object[]{this.e, exception.getMessage()});
            }
            this.w.set(exception);
            throw exception;
        }
    }

    private final void e(Connection connection) {
        try {
            if (this.b == -1) {
                this.b = this.b(connection, this.f);
            } else {
                this.a(connection, this.f);
            }
            if (connection.isReadOnly() != this.u) {
                connection.setReadOnly(this.u);
            }
            if (connection.getAutoCommit() != this.y) {
                connection.setAutoCommit(this.y);
            }
            this.c(connection);
            if (this.m != this.d) {
                connection.setTransactionIsolation(this.m);
            }
            if (this.c != null) {
                connection.setCatalog(this.c);
            }
            if (this.l != null) {
                connection.setSchema(this.l);
            }
            this.a(connection, this.t.b(), true);
            this.a(connection, (long)this.b);
        }
        catch (SQLException sQLException) {
            throw new fP(sQLException);
        }
    }

    private final void c(Connection connection) {
        if (!this.h) {
            this.a(connection);
            this.b(connection);
            this.h = true;
        }
    }

    private final void a(Connection connection) {
        try {
            if (this.x) {
                connection.isValid(1);
            } else {
                this.a(connection, this.t.x(), false);
            }
        }
        catch (AbstractMethodError | Exception throwable) {
            this.q.a("%s - Failed to execute%s connection test query (%s).", new Object[]{this.e, this.x ? " isValid() for connection, configure" : "", throwable.getMessage()});
            throw throwable;
        }
    }

    private final void b(Connection connection) {
        block3: {
            try {
                this.d = connection.getTransactionIsolation();
                if (this.m == -1) {
                    this.m = this.d;
                }
            }
            catch (SQLException sQLException) {
                this.q.c("%s - Default transaction isolation level detection failed (%s).", new Object[]{this.e, sQLException.getMessage()});
                if (sQLException.getSQLState() == null || sQLException.getSQLState().startsWith("08")) break block3;
                throw sQLException;
            }
        }
    }

    private final void a(Statement statement, int n) {
        block3: {
            if (this.n != 0) {
                try {
                    statement.setQueryTimeout(n);
                    this.n = 1;
                }
                catch (Exception exception) {
                    if (this.n != -1) break block3;
                    this.n = 0;
                    this.q.d("%s - Failed to set query timeout for statement. (%s)", new Object[]{this.e, exception.getMessage()});
                }
            }
        }
    }

    private final int b(Connection connection, long l3) {
        block4: {
            if (this.g != 0) {
                try {
                    int n = connection.getNetworkTimeout();
                    connection.setNetworkTimeout(this.k, (int)l3);
                    this.g = 1;
                    return n;
                }
                catch (AbstractMethodError | Exception throwable) {
                    if (this.g != -1) break block4;
                    this.g = 0;
                    this.q.d("%s - Driver does not support get/set network timeout for connections. (%s)", new Object[]{this.e, throwable.getMessage()});
                    if (this.f < TimeUnit.SECONDS.toMillis(1L)) {
                        this.q.c("%s - A validationTimeout of less than 1 second cannot be honored on drivers without setNetworkTimeout() support.", new Object[]{this.e});
                    }
                    if (this.f % TimeUnit.SECONDS.toMillis(1L) == 0L) break block4;
                    this.q.c("%s - A validationTimeout with fractional second granularity cannot be honored on drivers without setNetworkTimeout() support.", new Object[]{this.e});
                }
            }
        }
        return 0;
    }

    private final void a(Connection connection, long l3) {
        if (this.g == 1) {
            connection.setNetworkTimeout(this.k, (int)l3);
        }
    }

    private final void a(Connection connection, String string, boolean bl) {
        if (string != null) {
            try (Statement statement = connection.createStatement();){
                statement.execute(string);
            }
            if (this.p && !this.y) {
                if (bl) {
                    connection.commit();
                } else {
                    connection.rollback();
                }
            }
        }
    }

    private final void a(DataSource dataSource, String string, String string2) {
        if (string != null && string.contains("Mysql") || string2 != null && string2.contains("mysql") || dataSource != null && dataSource.getClass().getName().contains("Mysql")) {
            this.k = new e9(null);
        } else {
            ThreadFactory threadFactory = this.t.u();
            threadFactory = threadFactory != null ? threadFactory : new gc(this.e + " network timeout executor", true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)Executors.newCachedThreadPool(threadFactory);
            threadPoolExecutor.setKeepAliveTime(15L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.k = threadPoolExecutor;
        }
    }

    private final void a(DataSource dataSource) {
        if (this.s != Integer.MAX_VALUE) {
            try {
                dataSource.setLoginTimeout(Math.max(1, (int)TimeUnit.MILLISECONDS.toSeconds(500L + this.s)));
            }
            catch (Exception exception) {
                this.q.d("%s - Failed to set login timeout for data source. (%s)", new Object[]{this.e, exception.getMessage()});
            }
        }
    }

    private final String a(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < dI.i.length; ++i) {
            if ((n & 1 << i) == 0) continue;
            stringBuilder.append(dI.i[i]).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);
        return stringBuilder.toString();
    }

    static {
        j = 0;
        r = 1;
        a = -1;
        i = new String[]{"readOnly", "autoCommit", "isolation", "catalog", "netTimeout", "schema"};
    }
}

