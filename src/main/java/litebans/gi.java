package litebans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import litebans.c2;
import litebans.lJ;

public static abstract class gi
implements ResultSet {
    protected final c2 c;
    protected final lJ a;
    final ResultSet b;

    protected gi(c2 c22, lJ lJ2, ResultSet resultSet) {
        this.c = c22;
        this.a = lJ2;
        this.b = resultSet;
    }

    final SQLException a(SQLException sQLException) {
        return this.c.a(sQLException);
    }

    public String toString() {
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + this.b;
    }

    @Override
    public final Statement getStatement() {
        return this.a;
    }

    @Override
    public void updateRow() {
        this.c.b();
        this.b.updateRow();
    }

    @Override
    public void insertRow() {
        this.c.b();
        this.b.insertRow();
    }

    @Override
    public void deleteRow() {
        this.c.b();
        this.b.deleteRow();
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.b)) {
            return this.b;
        }
        if (this.b != null) {
            return this.b.unwrap(clazz);
        }
        throw new SQLException("Wrapped ResultSet is not an instance of " + clazz);
    }
}

