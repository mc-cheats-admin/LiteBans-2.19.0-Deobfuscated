package litebans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class LiteBansModule_224
implements ResultSet {
    protected final LiteBansModule_66 c;
    protected final LiteBansModule_417 BaseCoreGenericHandler;
    final ResultSet LiteBansModule_31;

    protected LiteBansModule_224(LiteBansModule_66 c22, LiteBansModule_417 lJ2, ResultSet resultSet) {
        this.c = c22;
        this.plugin = lJ2;
        this.LiteBansModule_31 = resultSet;
    }

    final SQLException BaseCoreGenericHandler(SQLException sQLException) {
        return this.c.BaseCoreGenericHandler(sQLException);
    }

    public String toString() {
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + this.LiteBansModule_31;
    }

    @Override
    public final Statement getStatement() {
        return this.plugin;
    }

    @Override
    public void updateRow() {
        this.c.LiteBansModule_31();
        this.LiteBansModule_31.updateRow();
    }

    @Override
    public void insertRow() {
        this.c.LiteBansModule_31();
        this.LiteBansModule_31.insertRow();
    }

    @Override
    public void deleteRow() {
        this.c.LiteBansModule_31();
        this.LiteBansModule_31.deleteRow();
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.LiteBansModule_31)) {
            return this.LiteBansModule_31;
        }
        if (this.LiteBansModule_31 != null) {
            return this.LiteBansModule_31.unwrap(clazz);
        }
        throw new SQLException("Wrapped ResultSet is not HikariDataSource instance of " + clazz);
    }
}

