package litebans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Wrapper;
import litebans.c2;
import litebans.lJ;

public static final class ly
extends lJ
implements Wrapper,
AutoCloseable,
Statement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.a.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet executeQuery(String string) {
        try {
            return super.executeQuery(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string) {
        try {
            return super.executeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxFieldSize() {
        try {
            return this.a.getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxFieldSize(int n) {
        try {
            this.a.setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxRows() {
        try {
            return this.a.getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxRows(int n) {
        try {
            this.a.setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setEscapeProcessing(boolean bl) {
        try {
            this.a.setEscapeProcessing(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getQueryTimeout() {
        try {
            return this.a.getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setQueryTimeout(int n) {
        try {
            this.a.setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void cancel() {
        try {
            this.a.cancel();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return this.a.getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            this.a.clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCursorName(String string) {
        try {
            this.a.setCursorName(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean execute(String string) {
        try {
            return super.execute(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getResultSet() {
        try {
            return super.getResultSet();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getUpdateCount() {
        try {
            return this.a.getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getMoreResults() {
        try {
            return this.a.getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            this.a.setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return this.a.getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            this.a.setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return this.a.getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetConcurrency() {
        try {
            return this.a.getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetType() {
        try {
            return this.a.getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void addBatch(String string) {
        try {
            this.a.addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearBatch() {
        try {
            this.a.clearBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int[] executeBatch() {
        try {
            return super.executeBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Connection getConnection() {
        try {
            return super.getConnection();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getMoreResults(int n) {
        try {
            return this.a.getMoreResults(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet getGeneratedKeys() {
        try {
            return super.getGeneratedKeys();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, int n) {
        try {
            return super.executeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        try {
            return super.executeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, String[] stringArray) {
        try {
            return super.executeUpdate(string, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean execute(String string, int n) {
        try {
            return super.execute(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        try {
            return super.execute(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean execute(String string, String[] stringArray) {
        try {
            return super.execute(string, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetHoldability() {
        try {
            return this.a.getResultSetHoldability();
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
    public void setPoolable(boolean bl) {
        try {
            this.a.setPoolable(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isPoolable() {
        try {
            return this.a.isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void closeOnCompletion() {
        try {
            this.a.closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return this.a.isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeUpdateCount() {
        try {
            return this.a.getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            this.a.setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeMaxRows() {
        try {
            return this.a.getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long[] executeLargeBatch() {
        try {
            return this.a.executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return this.a.executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return this.a.executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return this.a.executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, String[] stringArray) {
        try {
            return this.a.executeLargeUpdate(string, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    ly(c2 c22, Statement statement) {
        super(c22, statement);
    }
}

