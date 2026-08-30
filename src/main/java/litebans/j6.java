package litebans;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import litebans.c0;
import litebans.c2;
import litebans.lJ;

public static abstract class j6
implements DatabaseMetaData {
    protected final c2 b;
    protected final DatabaseMetaData a;

    j6(c2 c22, DatabaseMetaData databaseMetaData) {
        this.b = c22;
        this.a = databaseMetaData;
    }

    final SQLException a(SQLException sQLException) {
        return this.b.a(sQLException);
    }

    public final String toString() {
        String string = this.a.toString();
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + string;
    }

    @Override
    public final Connection getConnection() {
        return this.b;
    }

    @Override
    public ResultSet getProcedures(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getProcedures(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getProcedureColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getProcedureColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getTables(String string, String string2, String string3, String[] stringArray) {
        ResultSet resultSet = this.a.getTables(string, string2, string3, stringArray);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getSchemas() {
        ResultSet resultSet = this.a.getSchemas();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getCatalogs() {
        ResultSet resultSet = this.a.getCatalogs();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getTableTypes() {
        ResultSet resultSet = this.a.getTableTypes();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getColumnPrivileges(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getColumnPrivileges(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getTablePrivileges(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getTablePrivileges(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getBestRowIdentifier(String string, String string2, String string3, int n, boolean bl) {
        ResultSet resultSet = this.a.getBestRowIdentifier(string, string2, string3, n, bl);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getVersionColumns(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getVersionColumns(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getPrimaryKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getPrimaryKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getImportedKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getImportedKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getExportedKeys(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getExportedKeys(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getCrossReference(String string, String string2, String string3, String string4, String string5, String string6) {
        ResultSet resultSet = this.a.getCrossReference(string, string2, string3, string4, string5, string6);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getTypeInfo() {
        ResultSet resultSet = this.a.getTypeInfo();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getIndexInfo(String string, String string2, String string3, boolean bl, boolean bl2) {
        ResultSet resultSet = this.a.getIndexInfo(string, string2, string3, bl, bl2);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getUDTs(String string, String string2, String string3, int[] nArray) {
        ResultSet resultSet = this.a.getUDTs(string, string2, string3, nArray);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getSuperTypes(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getSuperTypes(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getSuperTables(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getSuperTables(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getAttributes(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getAttributes(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getSchemas(String string, String string2) {
        ResultSet resultSet = this.a.getSchemas(string, string2);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getClientInfoProperties() {
        ResultSet resultSet = this.a.getClientInfoProperties();
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getFunctions(String string, String string2, String string3) {
        ResultSet resultSet = this.a.getFunctions(string, string2, string3);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getFunctionColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getFunctionColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    @Override
    public ResultSet getPseudoColumns(String string, String string2, String string3, String string4) {
        ResultSet resultSet = this.a.getPseudoColumns(string, string2, string3, string4);
        Statement statement = resultSet.getStatement();
        if (statement != null) {
            statement = c0.a(this.b, statement);
        }
        return c0.a(this.b, (lJ)statement, resultSet);
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.a)) {
            return this.a;
        }
        if (this.a != null) {
            return this.a.unwrap(clazz);
        }
        throw new SQLException("Wrapped DatabaseMetaData is not an instance of " + clazz);
    }
}

