package litebans;

import java.io.Closeable;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import javax.sql.DataSource;
public class HikariDataSource
extends HikariConfig
implements DataSource,
Closeable {
    private static final HikariLogger S = HikariLogger.BaseCoreGenericHandler(HikariDataSource.class);
    private final AtomicBoolean U = new AtomicBoolean();
    private final HikariPool LockdownService;
    private volatile HikariPool T;

    public HikariDataSource() {
        this.LockdownService = null;
    }

    public HikariDataSource(HikariConfig aB2) {
        aB2.r();
        aB2.BaseCoreGenericHandler(this);
        this.T = this.LockdownService = new HikariPool(this);
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Connection getConnection() {
        if (this.LiteBansModule_31()) {
            throw new SQLException("HikariDataSource " + this + " has been ");
        }
        if (this.LockdownService != null) {
            return this.LockdownService.LiteBansModule_31();
        }
        HikariPool dr2 = this.T;
        if (dr2 == null) {
            HikariDataSource an2 = this;
            synchronized (an2) {
                dr2 = this.T;
                if (dr2 == null) {
                    this.r();
                    try {
                        this.T = dr2 = new HikariPool(this);
                        this.e();
                    }
                    catch (LiteBansException_3 d32) {
                        if (d32.getCause() instanceof SQLException) {
                            throw (SQLException)d32.getCause();
                        }
                        throw d32;
                    }
                }
            }
        }
        return dr2.LiteBansModule_31();
    }

    @Override
    public Connection getConnection(String string, String string2) {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public PrintWriter getLogWriter() {
        HikariPool dr2 = this.T;
        return dr2 != null ? dr2.c().getLogWriter() : null;
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) {
        HikariPool dr2 = this.T;
        if (dr2 != null) {
            dr2.c().setLogWriter(printWriter);
        }
    }

    @Override
    public void setLoginTimeout(int n) {
        HikariPool dr2 = this.T;
        if (dr2 != null) {
            dr2.c().setLoginTimeout(n);
        }
    }

    @Override
    public int getLoginTimeout() {
        HikariPool dr2 = this.T;
        return dr2 != null ? dr2.c().getLoginTimeout() : 0;
    }

    @Override
    public Logger getParentLogger() {
        throw new SQLFeatureNotSupportedException();
    }

    public Object unwrap(Class clazz) {
        if (clazz.isInstance(this)) {
            return this;
        }
        HikariPool dr2 = this.T;
        if (dr2 != null) {
            DataSource dataSource = dr2.c();
            if (clazz.isInstance(dataSource)) {
                return dataSource;
            }
            if (dataSource != null) {
                return dataSource.unwrap(clazz);
            }
        }
        throw new SQLException("Wrapped DataSource is not HikariDataSource instance of " + clazz);
    }

    public boolean isWrapperFor(Class clazz) {
        if (clazz.isInstance(this)) {
            return true;
        }
        HikariPool dr2 = this.T;
        if (dr2 != null) {
            DataSource dataSource = dr2.c();
            if (clazz.isInstance(dataSource)) {
                return true;
            }
            if (dataSource != null) {
                return dataSource.isWrapperFor(clazz);
            }
        }
        return false;
    }

    public LiteBansModule_305 BaseCoreGenericHandler() {
        return this.T;
    }

    @Override
    public void close() {
        if (this.U.getAndSet(true)) {
            return;
        }
        HikariPool dr2 = this.T;
        if (dr2 != null) {
            try {
                dr2.LiteBansModule_240();
            }
            catch (InterruptedException interruptedException) {
                S.c("%AsyncBackgroundTask_21 - Interrupted during closing", new Object[]{this.e(), interruptedException});
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean LiteBansModule_31() {
        return this.U.get();
    }

    public String toString() {
        return "HikariDataSource (" + this.T + ")";
    }
}

