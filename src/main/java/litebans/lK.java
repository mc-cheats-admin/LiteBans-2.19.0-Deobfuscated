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
import litebans.c2;
import litebans.lV;

public static final class lK
extends lV
implements Wrapper,
AutoCloseable,
Statement,
PreparedStatement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return ((PreparedStatement)this.a).isWrapperFor(clazz);
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
            return ((PreparedStatement)this.a).getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxFieldSize(int n) {
        try {
            ((PreparedStatement)this.a).setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxRows() {
        try {
            return ((PreparedStatement)this.a).getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxRows(int n) {
        try {
            ((PreparedStatement)this.a).setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setEscapeProcessing(boolean bl) {
        try {
            ((PreparedStatement)this.a).setEscapeProcessing(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getQueryTimeout() {
        try {
            return ((PreparedStatement)this.a).getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setQueryTimeout(int n) {
        try {
            ((PreparedStatement)this.a).setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void cancel() {
        try {
            ((PreparedStatement)this.a).cancel();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return ((PreparedStatement)this.a).getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            ((PreparedStatement)this.a).clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCursorName(String string) {
        try {
            ((PreparedStatement)this.a).setCursorName(string);
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
            return ((PreparedStatement)this.a).getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getMoreResults() {
        try {
            return ((PreparedStatement)this.a).getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            ((PreparedStatement)this.a).setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return ((PreparedStatement)this.a).getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            ((PreparedStatement)this.a).setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return ((PreparedStatement)this.a).getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetConcurrency() {
        try {
            return ((PreparedStatement)this.a).getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetType() {
        try {
            return ((PreparedStatement)this.a).getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void addBatch(String string) {
        try {
            ((PreparedStatement)this.a).addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearBatch() {
        try {
            ((PreparedStatement)this.a).clearBatch();
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
            return ((PreparedStatement)this.a).getMoreResults(n);
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
            return ((PreparedStatement)this.a).getResultSetHoldability();
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
            ((PreparedStatement)this.a).setPoolable(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isPoolable() {
        try {
            return ((PreparedStatement)this.a).isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void closeOnCompletion() {
        try {
            ((PreparedStatement)this.a).closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return ((PreparedStatement)this.a).isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeUpdateCount() {
        try {
            return ((PreparedStatement)this.a).getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            ((PreparedStatement)this.a).setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeMaxRows() {
        try {
            return ((PreparedStatement)this.a).getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long[] executeLargeBatch() {
        try {
            return ((PreparedStatement)this.a).executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return ((PreparedStatement)this.a).executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return ((PreparedStatement)this.a).executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return ((PreparedStatement)this.a).executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, String[] stringArray) {
        try {
            return ((PreparedStatement)this.a).executeLargeUpdate(string, stringArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSet executeQuery() {
        try {
            return super.executeQuery();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int executeUpdate() {
        try {
            return super.executeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNull(int n, int n2) {
        try {
            ((PreparedStatement)this.a).setNull(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBoolean(int n, boolean bl) {
        try {
            ((PreparedStatement)this.a).setBoolean(n, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setByte(int n, byte by2) {
        try {
            ((PreparedStatement)this.a).setByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setShort(int n, short s2) {
        try {
            ((PreparedStatement)this.a).setShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setInt(int n, int n2) {
        try {
            ((PreparedStatement)this.a).setInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLong(int n, long l3) {
        try {
            ((PreparedStatement)this.a).setLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFloat(int n, float f10) {
        try {
            ((PreparedStatement)this.a).setFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDouble(int n, double d10) {
        try {
            ((PreparedStatement)this.a).setDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            ((PreparedStatement)this.a).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setString(int n, String string) {
        try {
            ((PreparedStatement)this.a).setString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBytes(int n, byte[] byArray) {
        try {
            ((PreparedStatement)this.a).setBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date) {
        try {
            ((PreparedStatement)this.a).setDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time) {
        try {
            ((PreparedStatement)this.a).setTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        try {
            ((PreparedStatement)this.a).setTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.a).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.a).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            ((PreparedStatement)this.a).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearParameters() {
        try {
            ((PreparedStatement)this.a).clearParameters();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2) {
        try {
            ((PreparedStatement)this.a).setObject(n, object, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object) {
        try {
            ((PreparedStatement)this.a).setObject(n, object);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean execute() {
        try {
            return super.execute();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void addBatch() {
        try {
            ((PreparedStatement)this.a).addBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        try {
            ((PreparedStatement)this.a).setCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setRef(int n, Ref ref) {
        try {
            ((PreparedStatement)this.a).setRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, Blob blob) {
        try {
            ((PreparedStatement)this.a).setBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Clob clob) {
        try {
            ((PreparedStatement)this.a).setClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setArray(int n, Array array) {
        try {
            ((PreparedStatement)this.a).setArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return ((PreparedStatement)this.a).getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        try {
            ((PreparedStatement)this.a).setDate(n, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        try {
            ((PreparedStatement)this.a).setTime(n, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        try {
            ((PreparedStatement)this.a).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNull(int n, int n2, String string) {
        try {
            ((PreparedStatement)this.a).setNull(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setURL(int n, URL uRL) {
        try {
            ((PreparedStatement)this.a).setURL(n, uRL);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        try {
            return ((PreparedStatement)this.a).getParameterMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setRowId(int n, RowId rowId) {
        try {
            ((PreparedStatement)this.a).setRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNString(int n, String string) {
        try {
            ((PreparedStatement)this.a).setNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.a).setNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, NClob nClob) {
        try {
            ((PreparedStatement)this.a).setNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.a).setClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.a).setBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.a).setNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        try {
            ((PreparedStatement)this.a).setSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        try {
            ((PreparedStatement)this.a).setObject(n, object, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.a).setAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            ((PreparedStatement)this.a).setBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        try {
            ((PreparedStatement)this.a).setCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.a).setAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.a).setBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader) {
        try {
            ((PreparedStatement)this.a).setCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        try {
            ((PreparedStatement)this.a).setNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader) {
        try {
            ((PreparedStatement)this.a).setClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream) {
        try {
            ((PreparedStatement)this.a).setBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader) {
        try {
            ((PreparedStatement)this.a).setNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        try {
            ((PreparedStatement)this.a).setObject(n, object, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        try {
            ((PreparedStatement)this.a).setObject(n, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate() {
        try {
            return ((PreparedStatement)this.a).executeLargeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    lK(c2 c22, PreparedStatement preparedStatement) {
        super(c22, preparedStatement);
    }
}

