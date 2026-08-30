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
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public abstract class aH
implements PreparedStatement {
    private final PreparedStatement a;

    public aH(PreparedStatement preparedStatement) {
        this.a = preparedStatement;
    }

    @Override
    public ResultSet executeQuery() {
        return this.a.executeQuery();
    }

    @Override
    public int executeUpdate() {
        return this.a.executeUpdate();
    }

    @Override
    public void setNull(int n, int n2) {
        this.a.setNull(n, n2);
    }

    @Override
    public void setBoolean(int n, boolean bl) {
        this.a.setBoolean(n, bl);
    }

    @Override
    public void setByte(int n, byte by2) {
        this.a.setByte(n, by2);
    }

    @Override
    public void setShort(int n, short s2) {
        this.a.setShort(n, s2);
    }

    @Override
    public void setInt(int n, int n2) {
        this.a.setInt(n, n2);
    }

    @Override
    public void setLong(int n, long l3) {
        this.a.setLong(n, l3);
    }

    @Override
    public void setFloat(int n, float f10) {
        this.a.setFloat(n, f10);
    }

    @Override
    public void setDouble(int n, double d10) {
        this.a.setDouble(n, d10);
    }

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        this.a.setBigDecimal(n, bigDecimal);
    }

    @Override
    public void setString(int n, String string) {
        this.a.setString(n, string);
    }

    @Override
    public void setBytes(int n, byte[] byArray) {
        this.a.setBytes(n, byArray);
    }

    @Override
    public void setDate(int n, Date date) {
        this.a.setDate(n, date);
    }

    @Override
    public void setTime(int n, Time time) {
        this.a.setTime(n, time);
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        this.a.setTimestamp(n, timestamp);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        this.a.setAsciiStream(n, inputStream, n2);
    }

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        this.a.setUnicodeStream(n, inputStream, n2);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        this.a.setBinaryStream(n, inputStream, n2);
    }

    @Override
    public void clearParameters() {
        this.a.clearParameters();
    }

    @Override
    public void setObject(int n, Object object, int n2) {
        this.a.setObject(n, object, n2);
    }

    @Override
    public void setObject(int n, Object object) {
        this.a.setObject(n, object);
    }

    @Override
    public boolean execute() {
        return this.a.execute();
    }

    @Override
    public void addBatch() {
        this.a.addBatch();
    }

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        this.a.setCharacterStream(n, reader, n2);
    }

    @Override
    public void setRef(int n, Ref ref) {
        this.a.setRef(n, ref);
    }

    @Override
    public void setBlob(int n, Blob blob) {
        this.a.setBlob(n, blob);
    }

    @Override
    public void setClob(int n, Clob clob) {
        this.a.setClob(n, clob);
    }

    @Override
    public void setArray(int n, Array array) {
        this.a.setArray(n, array);
    }

    @Override
    public ResultSetMetaData getMetaData() {
        return this.a.getMetaData();
    }

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        this.a.setDate(n, date, calendar);
    }

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        this.a.setTime(n, time, calendar);
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        this.a.setTimestamp(n, timestamp, calendar);
    }

    @Override
    public void setNull(int n, int n2, String string) {
        this.a.setNull(n, n2, string);
    }

    @Override
    public void setURL(int n, URL uRL) {
        this.a.setURL(n, uRL);
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        return this.a.getParameterMetaData();
    }

    @Override
    public void setRowId(int n, RowId rowId) {
        this.a.setRowId(n, rowId);
    }

    @Override
    public void setNString(int n, String string) {
        this.a.setNString(n, string);
    }

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        this.a.setNCharacterStream(n, reader, l3);
    }

    @Override
    public void setNClob(int n, NClob nClob) {
        this.a.setNClob(n, nClob);
    }

    @Override
    public void setClob(int n, Reader reader, long l3) {
        this.a.setClob(n, reader, l3);
    }

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        this.a.setBlob(n, inputStream, l3);
    }

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        this.a.setNClob(n, reader, l3);
    }

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        this.a.setSQLXML(n, sQLXML);
    }

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        this.a.setObject(n, object, n2, n3);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        this.a.setAsciiStream(n, inputStream, l3);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        this.a.setBinaryStream(n, inputStream, l3);
    }

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        this.a.setCharacterStream(n, reader, l3);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        this.a.setAsciiStream(n, inputStream);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        this.a.setBinaryStream(n, inputStream);
    }

    @Override
    public void setCharacterStream(int n, Reader reader) {
        this.a.setCharacterStream(n, reader);
    }

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        this.a.setNCharacterStream(n, reader);
    }

    @Override
    public void setClob(int n, Reader reader) {
        this.a.setClob(n, reader);
    }

    @Override
    public void setBlob(int n, InputStream inputStream) {
        this.a.setBlob(n, inputStream);
    }

    @Override
    public void setNClob(int n, Reader reader) {
        this.a.setNClob(n, reader);
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        this.a.setObject(n, object, sQLType, n2);
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        this.a.setObject(n, object, sQLType);
    }

    @Override
    public long executeLargeUpdate() {
        return this.a.executeLargeUpdate();
    }

    @Override
    public ResultSet executeQuery(String string) {
        return this.a.executeQuery(string);
    }

    @Override
    public int executeUpdate(String string) {
        return this.a.executeUpdate(string);
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public int getMaxFieldSize() {
        return this.a.getMaxFieldSize();
    }

    @Override
    public void setMaxFieldSize(int n) {
        this.a.setMaxFieldSize(n);
    }

    @Override
    public int getMaxRows() {
        return this.a.getMaxRows();
    }

    @Override
    public void setMaxRows(int n) {
        this.a.setMaxRows(n);
    }

    @Override
    public void setEscapeProcessing(boolean bl) {
        this.a.setEscapeProcessing(bl);
    }

    @Override
    public int getQueryTimeout() {
        return this.a.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(int n) {
        this.a.setQueryTimeout(n);
    }

    @Override
    public void cancel() {
        this.a.cancel();
    }

    @Override
    public SQLWarning getWarnings() {
        return this.a.getWarnings();
    }

    @Override
    public void clearWarnings() {
        this.a.clearWarnings();
    }

    @Override
    public void setCursorName(String string) {
        this.a.setCursorName(string);
    }

    @Override
    public boolean execute(String string) {
        return this.a.execute(string);
    }

    @Override
    public ResultSet getResultSet() {
        return this.a.getResultSet();
    }

    @Override
    public int getUpdateCount() {
        return this.a.getUpdateCount();
    }

    @Override
    public boolean getMoreResults() {
        return this.a.getMoreResults();
    }

    @Override
    public void setFetchDirection(int n) {
        this.a.setFetchDirection(n);
    }

    @Override
    public int getFetchDirection() {
        return this.a.getFetchDirection();
    }

    @Override
    public void setFetchSize(int n) {
        this.a.setFetchSize(n);
    }

    @Override
    public int getFetchSize() {
        return this.a.getFetchSize();
    }

    @Override
    public int getResultSetConcurrency() {
        return this.a.getResultSetConcurrency();
    }

    @Override
    public int getResultSetType() {
        return this.a.getResultSetType();
    }

    @Override
    public void addBatch(String string) {
        this.a.addBatch(string);
    }

    @Override
    public void clearBatch() {
        this.a.clearBatch();
    }

    @Override
    public int[] executeBatch() {
        return this.a.executeBatch();
    }

    @Override
    public Connection getConnection() {
        return this.a.getConnection();
    }

    @Override
    public boolean getMoreResults(int n) {
        return this.a.getMoreResults(n);
    }

    @Override
    public ResultSet getGeneratedKeys() {
        return this.a.getGeneratedKeys();
    }

    @Override
    public int executeUpdate(String string, int n) {
        return this.a.executeUpdate(string, n);
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        return this.a.executeUpdate(string, nArray);
    }

    @Override
    public int executeUpdate(String string, String[] stringArray) {
        return this.a.executeUpdate(string, stringArray);
    }

    @Override
    public boolean execute(String string, int n) {
        return this.a.execute(string, n);
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        return this.a.execute(string, nArray);
    }

    @Override
    public boolean execute(String string, String[] stringArray) {
        return this.a.execute(string, stringArray);
    }

    @Override
    public int getResultSetHoldability() {
        return this.a.getResultSetHoldability();
    }

    @Override
    public boolean isClosed() {
        return this.a.isClosed();
    }

    @Override
    public void setPoolable(boolean bl) {
        this.a.setPoolable(bl);
    }

    @Override
    public boolean isPoolable() {
        return this.a.isPoolable();
    }

    @Override
    public void closeOnCompletion() {
        this.a.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() {
        return this.a.isCloseOnCompletion();
    }

    @Override
    public long getLargeUpdateCount() {
        return this.a.getLargeUpdateCount();
    }

    public Object unwrap(Class clazz) {
        return this.a.unwrap(clazz);
    }

    public boolean isWrapperFor(Class clazz) {
        return this.a.isWrapperFor(clazz);
    }
}

