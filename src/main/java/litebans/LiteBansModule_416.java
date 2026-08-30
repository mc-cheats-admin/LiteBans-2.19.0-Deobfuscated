package litebans;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Wrapper;
import java.util.Calendar;
public final class LiteBansModule_416
extends LiteBansModule_424
implements Wrapper,
AutoCloseable,
Statement,
PreparedStatement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return ((PreparedStatement)this.plugin).isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ResultSet executeQuery(String string) {
        try {
            return super.executeQuery(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int executeUpdate(String string) {
        try {
            return super.executeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getMaxFieldSize() {
        try {
            return ((PreparedStatement)this.plugin).getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setMaxFieldSize(int n) {
        try {
            ((PreparedStatement)this.plugin).setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getMaxRows() {
        try {
            return ((PreparedStatement)this.plugin).getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setMaxRows(int n) {
        try {
            ((PreparedStatement)this.plugin).setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setEscapeProcessing(boolean flag) {
        try {
            ((PreparedStatement)this.plugin).setEscapeProcessing(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getQueryTimeout() {
        try {
            return ((PreparedStatement)this.plugin).getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setQueryTimeout(int n) {
        try {
            ((PreparedStatement)this.plugin).setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void cancel() {
        try {
            ((PreparedStatement)this.plugin).cancel();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public SQLWarning getWarnings() {
        try {
            return ((PreparedStatement)this.plugin).getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void clearWarnings() {
        try {
            ((PreparedStatement)this.plugin).clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setCursorName(String string) {
        try {
            ((PreparedStatement)this.plugin).setCursorName(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean execute(String string) {
        try {
            return super.execute(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ResultSet getResultSet() {
        try {
            return super.getResultSet();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getUpdateCount() {
        try {
            return ((PreparedStatement)this.plugin).getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean getMoreResults() {
        try {
            return ((PreparedStatement)this.plugin).getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setFetchDirection(int n) {
        try {
            ((PreparedStatement)this.plugin).setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getFetchDirection() {
        try {
            return ((PreparedStatement)this.plugin).getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setFetchSize(int n) {
        try {
            ((PreparedStatement)this.plugin).setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getFetchSize() {
        try {
            return ((PreparedStatement)this.plugin).getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getResultSetConcurrency() {
        try {
            return ((PreparedStatement)this.plugin).getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getResultSetType() {
        try {
            return ((PreparedStatement)this.plugin).getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void addBatch(String string) {
        try {
            ((PreparedStatement)this.plugin).addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void clearBatch() {
        try {
            ((PreparedStatement)this.plugin).clearBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int[] executeBatch() {
        try {
            return super.executeBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public Connection getConnection() {
        try {
            return super.getConnection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean getMoreResults(int n) {
        try {
            return ((PreparedStatement)this.plugin).getMoreResults(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ResultSet getGeneratedKeys() {
        try {
            return super.getGeneratedKeys();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int executeUpdate(String string, int n) {
        try {
            return super.executeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int executeUpdate(String string, int[] nArray) {
        try {
            return super.executeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int executeUpdate(String string, String[] args) {
        try {
            return super.executeUpdate(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean execute(String string, int n) {
        try {
            return super.execute(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean execute(String string, int[] nArray) {
        try {
            return super.execute(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean execute(String string, String[] args) {
        try {
            return super.execute(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int getResultSetHoldability() {
        try {
            return ((PreparedStatement)this.plugin).getResultSetHoldability();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean isClosed() {
        try {
            return super.isClosed();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setPoolable(boolean flag) {
        try {
            ((PreparedStatement)this.plugin).setPoolable(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean isPoolable() {
        try {
            return ((PreparedStatement)this.plugin).isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void closeOnCompletion() {
        try {
            ((PreparedStatement)this.plugin).closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return ((PreparedStatement)this.plugin).isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long getLargeUpdateCount() {
        try {
            return ((PreparedStatement)this.plugin).getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            ((PreparedStatement)this.plugin).setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long getLargeMaxRows() {
        try {
            return ((PreparedStatement)this.plugin).getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long[] executeLargeBatch() {
        try {
            return ((PreparedStatement)this.plugin).executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return ((PreparedStatement)this.plugin).executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return ((PreparedStatement)this.plugin).executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return ((PreparedStatement)this.plugin).executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long executeLargeUpdate(String string, String[] args) {
        try {
            return ((PreparedStatement)this.plugin).executeLargeUpdate(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ResultSet executeQuery() {
        try {
            return super.executeQuery();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public int executeUpdate() {
        try {
            return super.executeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNull(int n, int n2) {
        try {
            ((PreparedStatement)this.plugin).setNull(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBoolean(int n, boolean flag) {
        try {
            ((PreparedStatement)this.plugin).setBoolean(n, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setByte(int n, byte by2) {
        try {
            ((PreparedStatement)this.plugin).setByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setShort(int n, short s2) {
        try {
            ((PreparedStatement)this.plugin).setShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setInt(int n, int n2) {
        try {
            ((PreparedStatement)this.plugin).setInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setLong(int n, long l3) {
        try {
            ((PreparedStatement)this.plugin).setLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setFloat(int n, float f10) {
        try {
            ((PreparedStatement)this.plugin).setFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setDouble(int n, double d10) {
        try {
            ((PreparedStatement)this.plugin).setDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            ((PreparedStatement)this.plugin).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setString(int n, String string) {
        try {
            ((PreparedStatement)this.plugin).setString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBytes(int n, byte[] byArray) {
        try {
            ((PreparedStatement)this.plugin).setBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setDate(int n, Date date) {
        try {
            ((PreparedStatement)this.plugin).setDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setTime(int n, Time time) {
        try {
            ((PreparedStatement)this.plugin).setTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        try {
            ((PreparedStatement)this.plugin).setTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.plugin).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.plugin).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.plugin).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void clearParameters() {
        try {
            ((PreparedStatement)this.plugin).clearParameters();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setObject(int n, Object object, int n2) {
        try {
            ((PreparedStatement)this.plugin).setObject(n, object, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setObject(int n, Object object) {
        try {
            ((PreparedStatement)this.plugin).setObject(n, object);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public boolean execute() {
        try {
            return super.execute();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void addBatch() {
        try {
            ((PreparedStatement)this.plugin).addBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        try {
            ((PreparedStatement)this.plugin).setCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setRef(int n, Ref ref) {
        try {
            ((PreparedStatement)this.plugin).setRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBlob(int n, Blob blob) {
        try {
            ((PreparedStatement)this.plugin).setBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setClob(int n, Clob clob) {
        try {
            ((PreparedStatement)this.plugin).setClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setArray(int n, Array array) {
        try {
            ((PreparedStatement)this.plugin).setArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return ((PreparedStatement)this.plugin).getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        try {
            ((PreparedStatement)this.plugin).setDate(n, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        try {
            ((PreparedStatement)this.plugin).setTime(n, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        try {
            ((PreparedStatement)this.plugin).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNull(int n, int n2, String string) {
        try {
            ((PreparedStatement)this.plugin).setNull(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setURL(int n, URL uRL) {
        try {
            ((PreparedStatement)this.plugin).setURL(n, uRL);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public ParameterMetaData getParameterMetaData() {
        try {
            return ((PreparedStatement)this.plugin).getParameterMetaData();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setRowId(int n, RowId rowId) {
        try {
            ((PreparedStatement)this.plugin).setRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNString(int n, String string) {
        try {
            ((PreparedStatement)this.plugin).setNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.plugin).setNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNClob(int n, NClob nClob) {
        try {
            ((PreparedStatement)this.plugin).setNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setClob(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.plugin).setClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.plugin).setBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.plugin).setNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        try {
            ((PreparedStatement)this.plugin).setSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        try {
            ((PreparedStatement)this.plugin).setObject(n, object, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.plugin).setAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.plugin).setBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.plugin).setCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.plugin).setAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.plugin).setBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setCharacterStream(int n, Reader reader) {
        try {
            ((PreparedStatement)this.plugin).setCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        try {
            ((PreparedStatement)this.plugin).setNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setClob(int n, Reader reader) {
        try {
            ((PreparedStatement)this.plugin).setClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setBlob(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.plugin).setBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setNClob(int n, Reader reader) {
        try {
            ((PreparedStatement)this.plugin).setNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        try {
            ((PreparedStatement)this.plugin).setObject(n, object, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        try {
            ((PreparedStatement)this.plugin).setObject(n, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    @Override
    public long executeLargeUpdate() {
        try {
            return ((PreparedStatement)this.plugin).executeLargeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
}

    LiteBansModule_416(HexEncodingHelper c22, PreparedStatement preparedStatement) {
        super(c22, preparedStatement);
}

