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

public abstract class LiteBansModule_13
implements PreparedStatement {
    private final PreparedStatement BaseCoreGenericHandler;

    public LiteBansModule_13(PreparedStatement preparedStatement) {
        this.plugin = preparedStatement;
    }

    @Override
    public ResultSet executeQuery() {
        return this.plugin.executeQuery();
    }

    @Override
    public int executeUpdate() {
        return this.plugin.executeUpdate();
    }

    @Override
    public void setNull(int n, int n2) {
        this.plugin.setNull(n, n2);
    }

    @Override
    public void setBoolean(int n, boolean flag) {
        this.plugin.setBoolean(n, flag);
    }

    @Override
    public void setByte(int n, byte by2) {
        this.plugin.setByte(n, by2);
    }

    @Override
    public void setShort(int n, short s2) {
        this.plugin.setShort(n, s2);
    }

    @Override
    public void setInt(int n, int n2) {
        this.plugin.setInt(n, n2);
    }

    @Override
    public void setLong(int n, long l3) {
        this.plugin.setLong(n, l3);
    }

    @Override
    public void setFloat(int n, float f10) {
        this.plugin.setFloat(n, f10);
    }

    @Override
    public void setDouble(int n, double d10) {
        this.plugin.setDouble(n, d10);
    }

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        this.plugin.setBigDecimal(n, bigDecimal);
    }

    @Override
    public void setString(int n, String string) {
        this.plugin.setString(n, string);
    }

    @Override
    public void setBytes(int n, byte[] byArray) {
        this.plugin.setBytes(n, byArray);
    }

    @Override
    public void setDate(int n, Date date) {
        this.plugin.setDate(n, date);
    }

    @Override
    public void setTime(int n, Time time) {
        this.plugin.setTime(n, time);
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        this.plugin.setTimestamp(n, timestamp);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        this.plugin.setAsciiStream(n, inputStream, n2);
    }

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        this.plugin.setUnicodeStream(n, inputStream, n2);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        this.plugin.setBinaryStream(n, inputStream, n2);
    }

    @Override
    public void clearParameters() {
        this.plugin.clearParameters();
    }

    @Override
    public void setObject(int n, Object object, int n2) {
        this.plugin.setObject(n, object, n2);
    }

    @Override
    public void setObject(int n, Object object) {
        this.plugin.setObject(n, object);
    }

    @Override
    public boolean execute() {
        return this.plugin.execute();
    }

    @Override
    public void addBatch() {
        this.plugin.addBatch();
    }

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        this.plugin.setCharacterStream(n, reader, n2);
    }

    @Override
    public void setRef(int n, Ref ref) {
        this.plugin.setRef(n, ref);
    }

    @Override
    public void setBlob(int n, Blob blob) {
        this.plugin.setBlob(n, blob);
    }

    @Override
    public void setClob(int n, Clob clob) {
        this.plugin.setClob(n, clob);
    }

    @Override
    public void setArray(int n, Array array) {
        this.plugin.setArray(n, array);
    }

    @Override
    public ResultSetMetaData getMetaData() {
        return this.plugin.getMetaData();
    }

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        this.plugin.setDate(n, date, calendar);
    }

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        this.plugin.setTime(n, time, calendar);
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        this.plugin.setTimestamp(n, timestamp, calendar);
    }

    @Override
    public void setNull(int n, int n2, String string) {
        this.plugin.setNull(n, n2, string);
    }

    @Override
    public void setURL(int n, URL uRL) {
        this.plugin.setURL(n, uRL);
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        return this.plugin.getParameterMetaData();
    }

    @Override
    public void setRowId(int n, RowId rowId) {
        this.plugin.setRowId(n, rowId);
    }

    @Override
    public void setNString(int n, String string) {
        this.plugin.setNString(n, string);
    }

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        this.plugin.setNCharacterStream(n, reader, l3);
    }

    @Override
    public void setNClob(int n, NClob nClob) {
        this.plugin.setNClob(n, nClob);
    }

    @Override
    public void setClob(int n, Reader reader, long l3) {
        this.plugin.setClob(n, reader, l3);
    }

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        this.plugin.setBlob(n, inputStream, l3);
    }

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        this.plugin.setNClob(n, reader, l3);
    }

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        this.plugin.setSQLXML(n, sQLXML);
    }

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        this.plugin.setObject(n, object, n2, n3);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        this.plugin.setAsciiStream(n, inputStream, l3);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        this.plugin.setBinaryStream(n, inputStream, l3);
    }

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        this.plugin.setCharacterStream(n, reader, l3);
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        this.plugin.setAsciiStream(n, inputStream);
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        this.plugin.setBinaryStream(n, inputStream);
    }

    @Override
    public void setCharacterStream(int n, Reader reader) {
        this.plugin.setCharacterStream(n, reader);
    }

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        this.plugin.setNCharacterStream(n, reader);
    }

    @Override
    public void setClob(int n, Reader reader) {
        this.plugin.setClob(n, reader);
    }

    @Override
    public void setBlob(int n, InputStream inputStream) {
        this.plugin.setBlob(n, inputStream);
    }

    @Override
    public void setNClob(int n, Reader reader) {
        this.plugin.setNClob(n, reader);
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        this.plugin.setObject(n, object, sQLType, n2);
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        this.plugin.setObject(n, object, sQLType);
    }

    @Override
    public long executeLargeUpdate() {
        return this.plugin.executeLargeUpdate();
    }

    @Override
    public ResultSet executeQuery(String string) {
        return this.plugin.executeQuery(string);
    }

    @Override
    public int executeUpdate(String string) {
        return this.plugin.executeUpdate(string);
    }

    @Override
    public void close() {
        this.plugin.close();
    }

    @Override
    public int getMaxFieldSize() {
        return this.plugin.getMaxFieldSize();
    }

    @Override
    public void setMaxFieldSize(int n) {
        this.plugin.setMaxFieldSize(n);
    }

    @Override
    public int getMaxRows() {
        return this.plugin.getMaxRows();
    }

    @Override
    public void setMaxRows(int n) {
        this.plugin.setMaxRows(n);
    }

    @Override
    public void setEscapeProcessing(boolean flag) {
        this.plugin.setEscapeProcessing(flag);
    }

    @Override
    public int getQueryTimeout() {
        return this.plugin.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(int n) {
        this.plugin.setQueryTimeout(n);
    }

    @Override
    public void cancel() {
        this.plugin.cancel();
    }

    @Override
    public SQLWarning getWarnings() {
        return this.plugin.getWarnings();
    }

    @Override
    public void clearWarnings() {
        this.plugin.clearWarnings();
    }

    @Override
    public void setCursorName(String string) {
        this.plugin.setCursorName(string);
    }

    @Override
    public boolean execute(String string) {
        return this.plugin.execute(string);
    }

    @Override
    public ResultSet getResultSet() {
        return this.plugin.getResultSet();
    }

    @Override
    public int getUpdateCount() {
        return this.plugin.getUpdateCount();
    }

    @Override
    public boolean getMoreResults() {
        return this.plugin.getMoreResults();
    }

    @Override
    public void setFetchDirection(int n) {
        this.plugin.setFetchDirection(n);
    }

    @Override
    public int getFetchDirection() {
        return this.plugin.getFetchDirection();
    }

    @Override
    public void setFetchSize(int n) {
        this.plugin.setFetchSize(n);
    }

    @Override
    public int getFetchSize() {
        return this.plugin.getFetchSize();
    }

    @Override
    public int getResultSetConcurrency() {
        return this.plugin.getResultSetConcurrency();
    }

    @Override
    public int getResultSetType() {
        return this.plugin.getResultSetType();
    }

    @Override
    public void addBatch(String string) {
        this.plugin.addBatch(string);
    }

    @Override
    public void clearBatch() {
        this.plugin.clearBatch();
    }

    @Override
    public int[] executeBatch() {
        return this.plugin.executeBatch();
    }

    @Override
    public Connection getConnection() {
        return this.plugin.getConnection();
    }

    @Override
    public boolean getMoreResults(int n) {
        return this.plugin.getMoreResults(n);
    }

    @Override
    public ResultSet getGeneratedKeys() {
        return this.plugin.getGeneratedKeys();
    }

    @Override
    public int executeUpdate(String string, int n) {
        return this.plugin.executeUpdate(string, n);
    }

    @Override
    public int executeUpdate(String string, int[] nArray) {
        return this.plugin.executeUpdate(string, nArray);
    }

    @Override
    public int executeUpdate(String string, String[] args) {
        return this.plugin.executeUpdate(string, args);
    }

    @Override
    public boolean execute(String string, int n) {
        return this.plugin.execute(string, n);
    }

    @Override
    public boolean execute(String string, int[] nArray) {
        return this.plugin.execute(string, nArray);
    }

    @Override
    public boolean execute(String string, String[] args) {
        return this.plugin.execute(string, args);
    }

    @Override
    public int getResultSetHoldability() {
        return this.plugin.getResultSetHoldability();
    }

    @Override
    public boolean isClosed() {
        return this.plugin.isClosed();
    }

    @Override
    public void setPoolable(boolean flag) {
        this.plugin.setPoolable(flag);
    }

    @Override
    public boolean isPoolable() {
        return this.plugin.isPoolable();
    }

    @Override
    public void closeOnCompletion() {
        this.plugin.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() {
        return this.plugin.isCloseOnCompletion();
    }

    @Override
    public long getLargeUpdateCount() {
        return this.plugin.getLargeUpdateCount();
    }

    public Object unwrap(Class clazz) {
        return this.plugin.unwrap(clazz);
    }

    public boolean isWrapperFor(Class clazz) {
        return this.plugin.isWrapperFor(clazz);
}

