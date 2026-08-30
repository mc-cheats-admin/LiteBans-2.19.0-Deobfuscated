package litebans;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
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
import java.util.Map;
import litebans.c2;
import litebans.lO;

public final class lH
extends lO
implements Wrapper,
AutoCloseable,
Statement,
PreparedStatement,
CallableStatement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return ((CallableStatement)this.a).isWrapperFor(clazz);
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
            return ((CallableStatement)this.a).getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxFieldSize(int n) {
        try {
            ((CallableStatement)this.a).setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getMaxRows() {
        try {
            return ((CallableStatement)this.a).getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setMaxRows(int n) {
        try {
            ((CallableStatement)this.a).setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setEscapeProcessing(boolean bl) {
        try {
            ((CallableStatement)this.a).setEscapeProcessing(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getQueryTimeout() {
        try {
            return ((CallableStatement)this.a).getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setQueryTimeout(int n) {
        try {
            ((CallableStatement)this.a).setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void cancel() {
        try {
            ((CallableStatement)this.a).cancel();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return ((CallableStatement)this.a).getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            ((CallableStatement)this.a).clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCursorName(String string) {
        try {
            ((CallableStatement)this.a).setCursorName(string);
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
            return ((CallableStatement)this.a).getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getMoreResults() {
        try {
            return ((CallableStatement)this.a).getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            ((CallableStatement)this.a).setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return ((CallableStatement)this.a).getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            ((CallableStatement)this.a).setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return ((CallableStatement)this.a).getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetConcurrency() {
        try {
            return ((CallableStatement)this.a).getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getResultSetType() {
        try {
            return ((CallableStatement)this.a).getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void addBatch(String string) {
        try {
            ((CallableStatement)this.a).addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearBatch() {
        try {
            ((CallableStatement)this.a).clearBatch();
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
            return ((CallableStatement)this.a).getMoreResults(n);
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
            return ((CallableStatement)this.a).getResultSetHoldability();
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
            ((CallableStatement)this.a).setPoolable(bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isPoolable() {
        try {
            return ((CallableStatement)this.a).isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void closeOnCompletion() {
        try {
            ((CallableStatement)this.a).closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return ((CallableStatement)this.a).isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeUpdateCount() {
        try {
            return ((CallableStatement)this.a).getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            ((CallableStatement)this.a).setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLargeMaxRows() {
        try {
            return ((CallableStatement)this.a).getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long[] executeLargeBatch() {
        try {
            return ((CallableStatement)this.a).executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return ((CallableStatement)this.a).executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return ((CallableStatement)this.a).executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return ((CallableStatement)this.a).executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, String[] stringArray) {
        try {
            return ((CallableStatement)this.a).executeLargeUpdate(string, stringArray);
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
            ((CallableStatement)this.a).setNull(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBoolean(int n, boolean bl) {
        try {
            ((CallableStatement)this.a).setBoolean(n, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setByte(int n, byte by2) {
        try {
            ((CallableStatement)this.a).setByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setShort(int n, short s2) {
        try {
            ((CallableStatement)this.a).setShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setInt(int n, int n2) {
        try {
            ((CallableStatement)this.a).setInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLong(int n, long l3) {
        try {
            ((CallableStatement)this.a).setLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFloat(int n, float f10) {
        try {
            ((CallableStatement)this.a).setFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDouble(int n, double d10) {
        try {
            ((CallableStatement)this.a).setDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            ((CallableStatement)this.a).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setString(int n, String string) {
        try {
            ((CallableStatement)this.a).setString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBytes(int n, byte[] byArray) {
        try {
            ((CallableStatement)this.a).setBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date) {
        try {
            ((CallableStatement)this.a).setDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time) {
        try {
            ((CallableStatement)this.a).setTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        try {
            ((CallableStatement)this.a).setTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.a).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.a).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.a).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearParameters() {
        try {
            ((CallableStatement)this.a).clearParameters();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2) {
        try {
            ((CallableStatement)this.a).setObject(n, object, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object) {
        try {
            ((CallableStatement)this.a).setObject(n, object);
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
            ((CallableStatement)this.a).addBatch();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        try {
            ((CallableStatement)this.a).setCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setRef(int n, Ref ref) {
        try {
            ((CallableStatement)this.a).setRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, Blob blob) {
        try {
            ((CallableStatement)this.a).setBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Clob clob) {
        try {
            ((CallableStatement)this.a).setClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setArray(int n, Array array) {
        try {
            ((CallableStatement)this.a).setArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return ((CallableStatement)this.a).getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setDate(n, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setTime(n, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNull(int n, int n2, String string) {
        try {
            ((CallableStatement)this.a).setNull(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setURL(int n, URL uRL) {
        try {
            ((CallableStatement)this.a).setURL(n, uRL);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        try {
            return ((CallableStatement)this.a).getParameterMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setRowId(int n, RowId rowId) {
        try {
            ((CallableStatement)this.a).setRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNString(int n, String string) {
        try {
            ((CallableStatement)this.a).setNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, NClob nClob) {
        try {
            ((CallableStatement)this.a).setNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        try {
            ((CallableStatement)this.a).setSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        try {
            ((CallableStatement)this.a).setObject(n, object, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader) {
        try {
            ((CallableStatement)this.a).setCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        try {
            ((CallableStatement)this.a).setNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader) {
        try {
            ((CallableStatement)this.a).setClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader) {
        try {
            ((CallableStatement)this.a).setNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        try {
            ((CallableStatement)this.a).setObject(n, object, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        try {
            ((CallableStatement)this.a).setObject(n, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate() {
        try {
            return ((CallableStatement)this.a).executeLargeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2, int n3) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean wasNull() {
        try {
            return ((CallableStatement)this.a).wasNull();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getString(int n) {
        try {
            return ((CallableStatement)this.a).getString(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getBoolean(int n) {
        try {
            return ((CallableStatement)this.a).getBoolean(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte getByte(int n) {
        try {
            return ((CallableStatement)this.a).getByte(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public short getShort(int n) {
        try {
            return ((CallableStatement)this.a).getShort(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getInt(int n) {
        try {
            return ((CallableStatement)this.a).getInt(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLong(int n) {
        try {
            return ((CallableStatement)this.a).getLong(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public float getFloat(int n) {
        try {
            return ((CallableStatement)this.a).getFloat(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public double getDouble(int n) {
        try {
            return ((CallableStatement)this.a).getDouble(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n, int n2) {
        try {
            return ((CallableStatement)this.a).getBigDecimal(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte[] getBytes(int n) {
        try {
            return ((CallableStatement)this.a).getBytes(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(int n) {
        try {
            return ((CallableStatement)this.a).getDate(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(int n) {
        try {
            return ((CallableStatement)this.a).getTime(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n) {
        try {
            return ((CallableStatement)this.a).getTimestamp(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Object getObject(int n) {
        try {
            return ((CallableStatement)this.a).getObject(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n) {
        try {
            return ((CallableStatement)this.a).getBigDecimal(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(int n, Map map) {
        try {
            return ((CallableStatement)this.a).getObject(n, map);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Ref getRef(int n) {
        try {
            return ((CallableStatement)this.a).getRef(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Blob getBlob(int n) {
        try {
            return ((CallableStatement)this.a).getBlob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Clob getClob(int n) {
        try {
            return ((CallableStatement)this.a).getClob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Array getArray(int n) {
        try {
            return ((CallableStatement)this.a).getArray(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getDate(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getTime(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getTimestamp(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2, String string) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n, int n2) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n, String string2) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, n, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public URL getURL(int n) {
        try {
            return ((CallableStatement)this.a).getURL(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setURL(String string, URL uRL) {
        try {
            ((CallableStatement)this.a).setURL(string, uRL);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNull(String string, int n) {
        try {
            ((CallableStatement)this.a).setNull(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBoolean(String string, boolean bl) {
        try {
            ((CallableStatement)this.a).setBoolean(string, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setByte(String string, byte by2) {
        try {
            ((CallableStatement)this.a).setByte(string, by2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setShort(String string, short s2) {
        try {
            ((CallableStatement)this.a).setShort(string, s2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setInt(String string, int n) {
        try {
            ((CallableStatement)this.a).setInt(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setLong(String string, long l3) {
        try {
            ((CallableStatement)this.a).setLong(string, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFloat(String string, float f10) {
        try {
            ((CallableStatement)this.a).setFloat(string, f10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDouble(String string, double d10) {
        try {
            ((CallableStatement)this.a).setDouble(string, d10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBigDecimal(String string, BigDecimal bigDecimal) {
        try {
            ((CallableStatement)this.a).setBigDecimal(string, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setString(String string, String string2) {
        try {
            ((CallableStatement)this.a).setString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBytes(String string, byte[] byArray) {
        try {
            ((CallableStatement)this.a).setBytes(string, byArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(String string, Date date) {
        try {
            ((CallableStatement)this.a).setDate(string, date);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(String string, Time time) {
        try {
            ((CallableStatement)this.a).setTime(string, time);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(String string, Timestamp timestamp) {
        try {
            ((CallableStatement)this.a).setTimestamp(string, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream, int n) {
        try {
            ((CallableStatement)this.a).setAsciiStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream, int n) {
        try {
            ((CallableStatement)this.a).setBinaryStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, int n, int n2) {
        try {
            ((CallableStatement)this.a).setObject(string, object, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, int n) {
        try {
            ((CallableStatement)this.a).setObject(string, object, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object) {
        try {
            ((CallableStatement)this.a).setObject(string, object);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader, int n) {
        try {
            ((CallableStatement)this.a).setCharacterStream(string, reader, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setDate(String string, Date date, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setDate(string, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTime(String string, Time time, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setTime(string, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setTimestamp(String string, Timestamp timestamp, Calendar calendar) {
        try {
            ((CallableStatement)this.a).setTimestamp(string, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNull(String string, int n, String string2) {
        try {
            ((CallableStatement)this.a).setNull(string, n, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getString(String string) {
        try {
            return ((CallableStatement)this.a).getString(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getBoolean(String string) {
        try {
            return ((CallableStatement)this.a).getBoolean(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte getByte(String string) {
        try {
            return ((CallableStatement)this.a).getByte(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public short getShort(String string) {
        try {
            return ((CallableStatement)this.a).getShort(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getInt(String string) {
        try {
            return ((CallableStatement)this.a).getInt(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLong(String string) {
        try {
            return ((CallableStatement)this.a).getLong(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public float getFloat(String string) {
        try {
            return ((CallableStatement)this.a).getFloat(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public double getDouble(String string) {
        try {
            return ((CallableStatement)this.a).getDouble(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte[] getBytes(String string) {
        try {
            return ((CallableStatement)this.a).getBytes(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(String string) {
        try {
            return ((CallableStatement)this.a).getDate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(String string) {
        try {
            return ((CallableStatement)this.a).getTime(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string) {
        try {
            return ((CallableStatement)this.a).getTimestamp(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Object getObject(String string) {
        try {
            return ((CallableStatement)this.a).getObject(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string) {
        try {
            return ((CallableStatement)this.a).getBigDecimal(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(String string, Map map) {
        try {
            return ((CallableStatement)this.a).getObject(string, map);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Ref getRef(String string) {
        try {
            return ((CallableStatement)this.a).getRef(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Blob getBlob(String string) {
        try {
            return ((CallableStatement)this.a).getBlob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Clob getClob(String string) {
        try {
            return ((CallableStatement)this.a).getClob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Array getArray(String string) {
        try {
            return ((CallableStatement)this.a).getArray(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getDate(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getTime(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.a).getTimestamp(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public URL getURL(String string) {
        try {
            return ((CallableStatement)this.a).getURL(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public RowId getRowId(int n) {
        try {
            return ((CallableStatement)this.a).getRowId(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public RowId getRowId(String string) {
        try {
            return ((CallableStatement)this.a).getRowId(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setRowId(String string, RowId rowId) {
        try {
            ((CallableStatement)this.a).setRowId(string, rowId);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNString(String string, String string2) {
        try {
            ((CallableStatement)this.a).setNString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setNCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(String string, NClob nClob) {
        try {
            ((CallableStatement)this.a).setNClob(string, nClob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setBlob(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setNClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public NClob getNClob(int n) {
        try {
            return ((CallableStatement)this.a).getNClob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public NClob getNClob(String string) {
        try {
            return ((CallableStatement)this.a).getNClob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setSQLXML(String string, SQLXML sQLXML) {
        try {
            ((CallableStatement)this.a).setSQLXML(string, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(int n) {
        try {
            return ((CallableStatement)this.a).getSQLXML(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(String string) {
        try {
            return ((CallableStatement)this.a).getSQLXML(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getNString(int n) {
        try {
            return ((CallableStatement)this.a).getNString(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getNString(String string) {
        try {
            return ((CallableStatement)this.a).getNString(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(int n) {
        try {
            return ((CallableStatement)this.a).getNCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(String string) {
        try {
            return ((CallableStatement)this.a).getNCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(int n) {
        try {
            return ((CallableStatement)this.a).getCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(String string) {
        try {
            return ((CallableStatement)this.a).getCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(String string, Blob blob) {
        try {
            ((CallableStatement)this.a).setBlob(string, blob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(String string, Clob clob) {
        try {
            ((CallableStatement)this.a).setClob(string, clob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setAsciiStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.a).setBinaryStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.a).setCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setAsciiStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setBinaryStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader) {
        try {
            ((CallableStatement)this.a).setCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(String string, Reader reader) {
        try {
            ((CallableStatement)this.a).setNCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setClob(String string, Reader reader) {
        try {
            ((CallableStatement)this.a).setClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setBlob(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.a).setBlob(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setNClob(String string, Reader reader) {
        try {
            ((CallableStatement)this.a).setNClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(int n, Class clazz) {
        try {
            return ((CallableStatement)this.a).getObject(n, clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(String string, Class clazz) {
        try {
            return ((CallableStatement)this.a).getObject(string, clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, SQLType sQLType, int n) {
        try {
            ((CallableStatement)this.a).setObject(string, object, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, SQLType sQLType) {
        try {
            ((CallableStatement)this.a).setObject(string, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType, int n2) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType, String string) {
        try {
            ((CallableStatement)this.a).registerOutParameter(n, sQLType, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType, int n) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType, String string2) {
        try {
            ((CallableStatement)this.a).registerOutParameter(string, sQLType, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    protected lH(c2 c22, CallableStatement callableStatement) {
        super(c22, callableStatement);
    }
}

