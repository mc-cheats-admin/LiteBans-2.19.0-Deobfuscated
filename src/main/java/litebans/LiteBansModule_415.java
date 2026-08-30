package litebans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class LiteBansModule_415
implements Statement {
    protected final HexEncodingHelper LiteBansModule_31;
    final Statement BaseCoreGenericHandler;
    private boolean c;
    private ResultSet AsyncBackgroundTask_5;

    LiteBansModule_415(HexEncodingHelper c22, Statement statement) {
        this.LiteBansModule_31 = c22;
        this.plugin = statement;
    }

    final SQLException BaseCoreGenericHandler(SQLException sQLException) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(sQLException);
    }

    public final String toString() {
        String string = this.plugin.toString();
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void close() {
        LiteBansModule_415 lJ2 = this;
        synchronized (lJ2) {
            if (this.c) {
                return;
            }
            this.c = true;
        }
        this.LiteBansModule_31.LiteBansModule_31(this.plugin);
        try {
            this.plugin.close();
        }
        catch (SQLException sQLException) {
            throw this.LiteBansModule_31.BaseCoreGenericHandler(sQLException);
}

    @Override
    public boolean isClosed() {
        return this.plugin.isClosed();
    }

    @Override
    public Connection getConnection() {
        return this.LiteBansModule_31;
    }

    @Override
    public boolean execute(String string) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.execute(string);
    }

    @Override
    public boolean execute(String string, int n) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.execute(string, n);
    }

    @Override
    public ResultSet executeQuery(String string) {
        this.LiteBansModule_31.LiteBansModule_31();
        ResultSet resultSet = this.plugin.executeQuery(string);
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, this, resultSet);
    }

    @Override
    public int executeUpdate(String string) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeUpdate(string);
    }

    @Override
    public int[] executeBatch() {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeBatch();
    }

    @Override
    public int executeUpdate(String string, int n) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeUpdate(string, n);
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeUpdate(string, nArray);
    }

    @Override
    public int executeUpdate(String string, String[] args) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeUpdate(string, args);
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.execute(string, nArray);
    }

    @Override
    public boolean execute(String string, String[] args) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.execute(string, args);
    }

    @Override
    public long[] executeLargeBatch() {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeLargeBatch();
    }

    @Override
    public long executeLargeUpdate(String string) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeLargeUpdate(string);
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeLargeUpdate(string, n);
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeLargeUpdate(string, nArray);
    }

    @Override
    public long executeLargeUpdate(String string, String[] args) {
        this.LiteBansModule_31.LiteBansModule_31();
        return this.plugin.executeLargeUpdate(string, args);
    }

    @Override
    public ResultSet getResultSet() {
        ResultSet resultSet = this.plugin.getResultSet();
        if (resultSet != null) {
            if (this.AsyncBackgroundTask_5 == null || ((LiteBansModule_223)this.AsyncBackgroundTask_5).LiteBansModule_31 != resultSet) {
                this.AsyncBackgroundTask_5 = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, this, resultSet);
} else {
            this.AsyncBackgroundTask_5 = null;
        }
        return this.AsyncBackgroundTask_5;
    }

    @Override
    public ResultSet getGeneratedKeys() {
        ResultSet resultSet = this.plugin.getGeneratedKeys();
        if (this.AsyncBackgroundTask_5 == null || ((LiteBansModule_223)this.AsyncBackgroundTask_5).LiteBansModule_31 != resultSet) {
            this.AsyncBackgroundTask_5 = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, this, resultSet);
        }
        return this.AsyncBackgroundTask_5;
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.plugin)) {
            return this.plugin;
        }
        if (this.plugin != null) {
            return this.plugin.unwrap(clazz);
        }
        throw new SQLException("Wrapped statement is not HikariDataSource instance of " + clazz);
}

