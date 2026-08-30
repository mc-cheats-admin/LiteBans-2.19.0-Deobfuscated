package litebans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import litebans.c0;
import litebans.c2;
import litebans.gi;

public abstract class lJ
implements Statement {
    protected final c2 b;
    final Statement a;
    private boolean c;
    private ResultSet d;

    lJ(c2 c22, Statement statement) {
        this.b = c22;
        this.a = statement;
    }

    final SQLException a(SQLException sQLException) {
        return this.b.a(sQLException);
    }

    public final String toString() {
        String string = this.a.toString();
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void close() {
        lJ lJ2 = this;
        synchronized (lJ2) {
            if (this.c) {
                return;
            }
            this.c = true;
        }
        this.b.b(this.a);
        try {
            this.a.close();
        }
        catch (SQLException sQLException) {
            throw this.b.a(sQLException);
        }
    }

    @Override
    public boolean isClosed() {
        return this.a.isClosed();
    }

    @Override
    public Connection getConnection() {
        return this.b;
    }

    @Override
    public boolean execute(String string) {
        this.b.b();
        return this.a.execute(string);
    }

    @Override
    public boolean execute(String string, int n) {
        this.b.b();
        return this.a.execute(string, n);
    }

    @Override
    public ResultSet executeQuery(String string) {
        this.b.b();
        ResultSet resultSet = this.a.executeQuery(string);
        return c0.a(this.b, this, resultSet);
    }

    @Override
    public int executeUpdate(String string) {
        this.b.b();
        return this.a.executeUpdate(string);
    }

    @Override
    public int[] executeBatch() {
        this.b.b();
        return this.a.executeBatch();
    }

    @Override
    public int executeUpdate(String string, int n) {
        this.b.b();
        return this.a.executeUpdate(string, n);
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        this.b.b();
        return this.a.executeUpdate(string, nArray);
    }

    @Override
    public int executeUpdate(String string, String[] stringArray) {
        this.b.b();
        return this.a.executeUpdate(string, stringArray);
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        this.b.b();
        return this.a.execute(string, nArray);
    }

    @Override
    public boolean execute(String string, String[] stringArray) {
        this.b.b();
        return this.a.execute(string, stringArray);
    }

    @Override
    public long[] executeLargeBatch() {
        this.b.b();
        return this.a.executeLargeBatch();
    }

    @Override
    public long executeLargeUpdate(String string) {
        this.b.b();
        return this.a.executeLargeUpdate(string);
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        this.b.b();
        return this.a.executeLargeUpdate(string, n);
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        this.b.b();
        return this.a.executeLargeUpdate(string, nArray);
    }

    @Override
    public long executeLargeUpdate(String string, String[] stringArray) {
        this.b.b();
        return this.a.executeLargeUpdate(string, stringArray);
    }

    @Override
    public ResultSet getResultSet() {
        ResultSet resultSet = this.a.getResultSet();
        if (resultSet != null) {
            if (this.d == null || ((gi)this.d).b != resultSet) {
                this.d = c0.a(this.b, this, resultSet);
            }
        } else {
            this.d = null;
        }
        return this.d;
    }

    @Override
    public ResultSet getGeneratedKeys() {
        ResultSet resultSet = this.a.getGeneratedKeys();
        if (this.d == null || ((gi)this.d).b != resultSet) {
            this.d = c0.a(this.b, this, resultSet);
        }
        return this.d;
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.a)) {
            return this.a;
        }
        if (this.a != null) {
            return this.a.unwrap(clazz);
        }
        throw new SQLException("Wrapped statement is not an instance of " + clazz);
    }
}

