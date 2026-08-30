package litebans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Wrapper;
public final class LiteBansModule_425
extends LiteBansModule_415
implements Wrapper,
AutoCloseable,
Statement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.plugin.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet executeQuery(String string) {
        try {
            return super.executeQuery(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string) {
        try {
            return super.executeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxFieldSize() {
        try {
            return this.plugin.getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setMaxFieldSize(int n) {
        try {
            this.plugin.setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxRows() {
        try {
            return this.plugin.getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setMaxRows(int n) {
        try {
            this.plugin.setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setEscapeProcessing(boolean flag) {
        try {
            this.plugin.setEscapeProcessing(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getQueryTimeout() {
        try {
            return this.plugin.getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setQueryTimeout(int n) {
        try {
            this.plugin.setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void cancel() {
        try {
            this.plugin.cancel();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return this.plugin.getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            this.plugin.clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCursorName(String string) {
        try {
            this.plugin.setCursorName(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean execute(String string) {
        try {
            return super.execute(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getResultSet() {
        try {
            return super.getResultSet();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getUpdateCount() {
        try {
            return this.plugin.getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getMoreResults() {
        try {
            return this.plugin.getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            this.plugin.setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return this.plugin.getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            this.plugin.setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return this.plugin.getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetConcurrency() {
        try {
            return this.plugin.getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetType() {
        try {
            return this.plugin.getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void addBatch(String string) {
        try {
            this.plugin.addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearBatch() {
        try {
            this.plugin.clearBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int[] executeBatch() {
        try {
            return super.executeBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Connection getConnection() {
        try {
            return super.getConnection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getMoreResults(int n) {
        try {
            return this.plugin.getMoreResults(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet getGeneratedKeys() {
        try {
            return super.getGeneratedKeys();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, int n) {
        try {
            return super.executeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        try {
            return super.executeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int executeUpdate(String string, String[] args) {
        try {
            return super.executeUpdate(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean execute(String string, int n) {
        try {
            return super.execute(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        try {
            return super.execute(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean execute(String string, String[] args) {
        try {
            return super.execute(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetHoldability() {
        try {
            return this.plugin.getResultSetHoldability();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isClosed() {
        try {
            return super.isClosed();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setPoolable(boolean flag) {
        try {
            this.plugin.setPoolable(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isPoolable() {
        try {
            return this.plugin.isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void closeOnCompletion() {
        try {
            this.plugin.closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return this.plugin.isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLargeUpdateCount() {
        try {
            return this.plugin.getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            this.plugin.setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLargeMaxRows() {
        try {
            return this.plugin.getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long[] executeLargeBatch() {
        try {
            return this.plugin.executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return this.plugin.executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return this.plugin.executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return this.plugin.executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, String[] args) {
        try {
            return this.plugin.executeLargeUpdate(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    LiteBansModule_425(0a000Handler c22, Statement statement) {
        super(c22, statement);
    }
}

