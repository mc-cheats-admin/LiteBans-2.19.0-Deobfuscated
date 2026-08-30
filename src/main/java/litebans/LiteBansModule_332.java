package litebans;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class LiteBansModule_332
implements DatabaseMetaData {
    protected final LiteBansModule_66 LiteBansModule_31;
    protected final DatabaseMetaData BaseCoreGenericHandler;

    LiteBansModule_332(LiteBansModule_66 c22, DatabaseMetaData databaseMetaData) {
        this.LiteBansModule_31 = c22;
        this.plugin = databaseMetaData;
    }

    final SQLException BaseCoreGenericHandler(SQLException sQLException) {
        return this.LiteBansModule_31.BaseCoreGenericHandler(sQLException);
    }

    public final String toString() {
        String string = this.plugin.toString();
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + string;
    }

    @Override
    public final Connection getConnection() {
        return this.LiteBansModule_31;
    }

    @Override
    public ResultSet getProcedures(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getProcedures(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getProcedureColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getProcedureColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getTables(String string, String string2, String string3, String[] args) {
        ResultSet resultSet = this.plugin.getTables(string, string2, string3, args);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getSchemas() {
        ResultSet resultSet = this.plugin.getSchemas();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getCatalogs() {
        ResultSet resultSet = this.plugin.getCatalogs();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getTableTypes() {
        ResultSet resultSet = this.plugin.getTableTypes();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getColumnPrivileges(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getColumnPrivileges(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getTablePrivileges(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getTablePrivileges(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getBestRowIdentifier(String string, String string2, String string3, int n, boolean flag) {
        ResultSet resultSet = this.plugin.getBestRowIdentifier(string, string2, string3, n, flag);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getVersionColumns(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getVersionColumns(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getPrimaryKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getPrimaryKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getImportedKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getImportedKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getExportedKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getExportedKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getCrossReference(String string, String string2, String string3, String string4, String string5, String string6) {
        ResultSet resultSet = this.plugin.getCrossReference(string, string2, string3, string4, string5, string6);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getTypeInfo() {
        ResultSet resultSet = this.plugin.getTypeInfo();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getIndexInfo(String string, String string2, String string3, boolean flag, boolean flag2) {
        ResultSet resultSet = this.plugin.getIndexInfo(string, string2, string3, flag, flag2);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getUDTs(String string, String string2, String string3, int[] nArray) {
        ResultSet resultSet = this.plugin.getUDTs(string, string2, string3, nArray);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getSuperTypes(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getSuperTypes(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getSuperTables(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getSuperTables(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getAttributes(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getAttributes(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getSchemas(String string, String string2) {
        ResultSet resultSet = this.plugin.getSchemas(string, string2);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getClientInfoProperties() {
        ResultSet resultSet = this.plugin.getClientInfoProperties();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getFunctions(String string, String string2, String string3) {
        ResultSet resultSet = this.plugin.getFunctions(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getFunctionColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getFunctionColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    @Override
    public ResultSet getPseudoColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.plugin.getPseudoColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, statement);
        }
        return LiteBansModule_64.BaseCoreGenericHandler(this.LiteBansModule_31, (LiteBansModule_417)statement, resultSet);
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.plugin)) {
            return this.plugin;
        }
        if (this.plugin != null) {
            return this.plugin.unwrap(clazz);
        }
        throw new SQLException("Wrapped DatabaseMetaData is not HikariDataSource instance of " + clazz);
    }
}

