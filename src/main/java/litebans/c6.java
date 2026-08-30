package litebans;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Wrapper;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import litebans.c2;
import litebans.gk;
import litebans.ja;
import litebans.kJ;

public final class c6
extends c2
implements Wrapper,
AutoCloseable,
Connection {
    @Override
    public Statement createStatement() {
        try {
            return super.createStatement();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string) {
        try {
            return super.prepareStatement(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public CallableStatement prepareCall(String string) {
        try {
            return super.prepareCall(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String nativeSQL(String string) {
        try {
            return this.r.nativeSQL(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAutoCommit(boolean bl) {
        try {
            super.setAutoCommit(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getAutoCommit() {
        try {
            return this.r.getAutoCommit();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void commit() {
        try {
            super.commit();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void rollback() {
        try {
            super.rollback();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isClosed() {
        try {
            return super.isClosed();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public DatabaseMetaData getMetaData() {
        try {
            return super.getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setReadOnly(boolean bl) {
        try {
            super.setReadOnly(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isReadOnly() {
        try {
            return this.r.isReadOnly();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCatalog(String string) {
        try {
            super.setCatalog(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getCatalog() {
        try {
            return this.r.getCatalog();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTransactionIsolation(int n) {
        try {
            super.setTransactionIsolation(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getTransactionIsolation() {
        try {
            return this.r.getTransactionIsolation();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return this.r.getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            this.r.clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Statement createStatement(int n, int n2) {
        try {
            return super.createStatement(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2) {
        try {
            return super.prepareStatement(string, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2) {
        try {
            return super.prepareCall(string, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Map getTypeMap() {
        try {
            return this.r.getTypeMap();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public void setTypeMap(Map map) {
        try {
            this.r.setTypeMap(map);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setHoldability(int n) {
        try {
            this.r.setHoldability(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getHoldability() {
        try {
            return this.r.getHoldability();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Savepoint setSavepoint() {
        try {
            return this.r.setSavepoint();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Savepoint setSavepoint(String string) {
        try {
            return this.r.setSavepoint(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void rollback(Savepoint savepoint) {
        try {
            super.rollback(savepoint);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) {
        try {
            this.r.releaseSavepoint(savepoint);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Statement createStatement(int n, int n2, int n3) {
        try {
            return super.createStatement(n, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2, int n3) {
        try {
            return super.prepareStatement(string, n, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2, int n3) {
        try {
            return super.prepareCall(string, n, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n) {
        try {
            return super.prepareStatement(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string, int[] nArray) {
        try {
            return super.prepareStatement(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String string, String[] stringArray) {
        try {
            return super.prepareStatement(string, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Clob createClob() {
        try {
            return this.r.createClob();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Blob createBlob() {
        try {
            return this.r.createBlob();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public NClob createNClob() {
        try {
            return this.r.createNClob();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLXML createSQLXML() {
        try {
            return this.r.createSQLXML();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isValid(int n) {
        try {
            return this.r.isValid(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClientInfo(String string, String string2) {
        this.r.setClientInfo(string, string2);
    }

    @Override
    public void setClientInfo(Properties properties) {
        this.r.setClientInfo(properties);
    }

    @Override
    public String getClientInfo(String string) {
        try {
            return this.r.getClientInfo(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Properties getClientInfo() {
        try {
            return this.r.getClientInfo();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Array createArrayOf(String string, Object[] objectArray) {
        try {
            return this.r.createArrayOf(string, objectArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Struct createStruct(String string, Object[] objectArray) {
        try {
            return this.r.createStruct(string, objectArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setSchema(String string) {
        try {
            super.setSchema(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getSchema() {
        try {
            return this.r.getSchema();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void abort(Executor executor) {
        try {
            this.r.abort(executor);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNetworkTimeout(Executor executor, int n) {
        try {
            super.setNetworkTimeout(executor, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getNetworkTimeout() {
        try {
            return this.r.getNetworkTimeout();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    protected c6(kJ kJ2, Connection connection, gk gk2, ja ja2, long l3, boolean bl, boolean bl2) {
        super(kJ2, connection, gk2, ja2, l3, bl, bl2);
    }
}

