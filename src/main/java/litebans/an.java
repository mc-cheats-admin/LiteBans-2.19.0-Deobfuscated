package litebans;

import java.io.Closeable;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import javax.sql.DataSource;
import litebans.aB;
import litebans.d3;
import litebans.dr;
import litebans.iI;
import litebans.kI;

public static class an
extends aB
implements DataSource,
Closeable {
    private static final kI S = kI.a(an.class);
    private final AtomicBoolean U = new AtomicBoolean();
    private final dr R;
    private volatile dr T;

    public an() {
        this.R = null;
    }

    public an(aB aB2) {
        aB2.r();
        aB2.a(this);
        this.T = this.R = new dr(this);
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Connection getConnection() {
        if (this.b()) {
            throw new SQLException("HikariDataSource " + this + " has been closed.");
        }
        if (this.R != null) {
            return this.R.b();
        }
        dr dr2 = this.T;
        if (dr2 == null) {
            an an2 = this;
            synchronized (an2) {
                dr2 = this.T;
                if (dr2 == null) {
                    this.r();
                    try {
                        this.T = dr2 = new dr(this);
                        this.e();
                    }
                    catch (d3 d32) {
                        if (d32.getCause() instanceof SQLException) {
                            throw (SQLException)d32.getCause();
                        }
                        throw d32;
                    }
                }
            }
        }
        return dr2.b();
    }

    @Override
    public Connection getConnection(String string, String string2) {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public PrintWriter getLogWriter() {
        dr dr2 = this.T;
        return dr2 != null ? dr2.c().getLogWriter() : null;
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) {
        dr dr2 = this.T;
        if (dr2 != null) {
            dr2.c().setLogWriter(printWriter);
        }
    }

    @Override
    public void setLoginTimeout(int n) {
        dr dr2 = this.T;
        if (dr2 != null) {
            dr2.c().setLoginTimeout(n);
        }
    }

    @Override
    public int getLoginTimeout() {
        dr dr2 = this.T;
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
        dr dr2 = this.T;
        if (dr2 != null) {
            DataSource dataSource = dr2.c();
            if (clazz.isInstance(dataSource)) {
                return dataSource;
            }
            if (dataSource != null) {
                return dataSource.unwrap(clazz);
            }
        }
        throw new SQLException("Wrapped DataSource is not an instance of " + clazz);
    }

    public boolean isWrapperFor(Class clazz) {
        if (clazz.isInstance(this)) {
            return true;
        }
        dr dr2 = this.T;
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

    public iI a() {
        return this.T;
    }

    @Override
    public void close() {
        if (this.U.getAndSet(true)) {
            return;
        }
        dr dr2 = this.T;
        if (dr2 != null) {
            try {
                dr2.h();
            }
            catch (InterruptedException interruptedException) {
                S.c("%s - Interrupted during closing", new Object[]{this.e(), interruptedException});
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean b() {
        return this.U.get();
    }

    public String toString() {
        return "HikariDataSource (" + this.T + ")";
    }
}

