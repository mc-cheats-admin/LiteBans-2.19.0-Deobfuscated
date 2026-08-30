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
public final class LiteBansModule_412
extends LiteBansModule_418
implements Wrapper,
AutoCloseable,
Statement,
PreparedStatement,
CallableStatement {
    public boolean isWrapperFor(Class clazz) {
        try {
            return ((CallableStatement)this.plugin).isWrapperFor(clazz);
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
            return ((CallableStatement)this.plugin).getMaxFieldSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setMaxFieldSize(int n) {
        try {
            ((CallableStatement)this.plugin).setMaxFieldSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getMaxRows() {
        try {
            return ((CallableStatement)this.plugin).getMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setMaxRows(int n) {
        try {
            ((CallableStatement)this.plugin).setMaxRows(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setEscapeProcessing(boolean flag) {
        try {
            ((CallableStatement)this.plugin).setEscapeProcessing(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getQueryTimeout() {
        try {
            return ((CallableStatement)this.plugin).getQueryTimeout();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setQueryTimeout(int n) {
        try {
            ((CallableStatement)this.plugin).setQueryTimeout(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void cancel() {
        try {
            ((CallableStatement)this.plugin).cancel();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return ((CallableStatement)this.plugin).getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            ((CallableStatement)this.plugin).clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCursorName(String string) {
        try {
            ((CallableStatement)this.plugin).setCursorName(string);
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
            return ((CallableStatement)this.plugin).getUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getMoreResults() {
        try {
            return ((CallableStatement)this.plugin).getMoreResults();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            ((CallableStatement)this.plugin).setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return ((CallableStatement)this.plugin).getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            ((CallableStatement)this.plugin).setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return ((CallableStatement)this.plugin).getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetConcurrency() {
        try {
            return ((CallableStatement)this.plugin).getResultSetConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getResultSetType() {
        try {
            return ((CallableStatement)this.plugin).getResultSetType();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void addBatch(String string) {
        try {
            ((CallableStatement)this.plugin).addBatch(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearBatch() {
        try {
            ((CallableStatement)this.plugin).clearBatch();
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
            return ((CallableStatement)this.plugin).getMoreResults(n);
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
            return ((CallableStatement)this.plugin).getResultSetHoldability();
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
            ((CallableStatement)this.plugin).setPoolable(flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isPoolable() {
        try {
            return ((CallableStatement)this.plugin).isPoolable();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void closeOnCompletion() {
        try {
            ((CallableStatement)this.plugin).closeOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isCloseOnCompletion() {
        try {
            return ((CallableStatement)this.plugin).isCloseOnCompletion();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLargeUpdateCount() {
        try {
            return ((CallableStatement)this.plugin).getLargeUpdateCount();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setLargeMaxRows(long l3) {
        try {
            ((CallableStatement)this.plugin).setLargeMaxRows(l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLargeMaxRows() {
        try {
            return ((CallableStatement)this.plugin).getLargeMaxRows();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long[] executeLargeBatch() {
        try {
            return ((CallableStatement)this.plugin).executeLargeBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string) {
        try {
            return ((CallableStatement)this.plugin).executeLargeUpdate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int n) {
        try {
            return ((CallableStatement)this.plugin).executeLargeUpdate(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, int[] nArray) {
        try {
            return ((CallableStatement)this.plugin).executeLargeUpdate(string, nArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate(String string, String[] args) {
        try {
            return ((CallableStatement)this.plugin).executeLargeUpdate(string, args);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSet executeQuery() {
        try {
            return super.executeQuery();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int executeUpdate() {
        try {
            return super.executeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNull(int n, int n2) {
        try {
            ((CallableStatement)this.plugin).setNull(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBoolean(int n, boolean flag) {
        try {
            ((CallableStatement)this.plugin).setBoolean(n, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setByte(int n, byte by2) {
        try {
            ((CallableStatement)this.plugin).setByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setShort(int n, short s2) {
        try {
            ((CallableStatement)this.plugin).setShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setInt(int n, int n2) {
        try {
            ((CallableStatement)this.plugin).setInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setLong(int n, long l3) {
        try {
            ((CallableStatement)this.plugin).setLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFloat(int n, float f10) {
        try {
            ((CallableStatement)this.plugin).setFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDouble(int n, double d10) {
        try {
            ((CallableStatement)this.plugin).setDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            ((CallableStatement)this.plugin).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setString(int n, String string) {
        try {
            ((CallableStatement)this.plugin).setString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBytes(int n, byte[] byArray) {
        try {
            ((CallableStatement)this.plugin).setBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date) {
        try {
            ((CallableStatement)this.plugin).setDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time) {
        try {
            ((CallableStatement)this.plugin).setTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp) {
        try {
            ((CallableStatement)this.plugin).setTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setUnicodeStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.plugin).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearParameters() {
        try {
            ((CallableStatement)this.plugin).clearParameters();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2) {
        try {
            ((CallableStatement)this.plugin).setObject(n, object, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object) {
        try {
            ((CallableStatement)this.plugin).setObject(n, object);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean execute() {
        try {
            return super.execute();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void addBatch() {
        try {
            ((CallableStatement)this.plugin).addBatch();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, int n2) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setRef(int n, Ref ref) {
        try {
            ((CallableStatement)this.plugin).setRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(int n, Blob blob) {
        try {
            ((CallableStatement)this.plugin).setBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(int n, Clob clob) {
        try {
            ((CallableStatement)this.plugin).setClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setArray(int n, Array array) {
        try {
            ((CallableStatement)this.plugin).setArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return ((CallableStatement)this.plugin).getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDate(int n, Date date, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setDate(n, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTime(int n, Time time, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setTime(n, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTimestamp(int n, Timestamp timestamp, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNull(int n, int n2, String string) {
        try {
            ((CallableStatement)this.plugin).setNull(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setURL(int n, URL uRL) {
        try {
            ((CallableStatement)this.plugin).setURL(n, uRL);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ParameterMetaData getParameterMetaData() {
        try {
            return ((CallableStatement)this.plugin).getParameterMetaData();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setRowId(int n, RowId rowId) {
        try {
            ((CallableStatement)this.plugin).setRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNString(int n, String string) {
        try {
            ((CallableStatement)this.plugin).setNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(int n, NClob nClob) {
        try {
            ((CallableStatement)this.plugin).setNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setSQLXML(int n, SQLXML sQLXML) {
        try {
            ((CallableStatement)this.plugin).setSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, int n2, int n3) {
        try {
            ((CallableStatement)this.plugin).setObject(n, object, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(int n, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(int n, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(int n, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(int n, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(int n, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType, int n2) {
        try {
            ((CallableStatement)this.plugin).setObject(n, object, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(int n, Object object, SQLType sQLType) {
        try {
            ((CallableStatement)this.plugin).setObject(n, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long executeLargeUpdate() {
        try {
            return ((CallableStatement)this.plugin).executeLargeUpdate();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2, int n3) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, n2, n3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean wasNull() {
        try {
            return ((CallableStatement)this.plugin).wasNull();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getString(int n) {
        try {
            return ((CallableStatement)this.plugin).getString(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getBoolean(int n) {
        try {
            return ((CallableStatement)this.plugin).getBoolean(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte getByte(int n) {
        try {
            return ((CallableStatement)this.plugin).getByte(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public short getShort(int n) {
        try {
            return ((CallableStatement)this.plugin).getShort(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getInt(int n) {
        try {
            return ((CallableStatement)this.plugin).getInt(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLong(int n) {
        try {
            return ((CallableStatement)this.plugin).getLong(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public float getFloat(int n) {
        try {
            return ((CallableStatement)this.plugin).getFloat(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public double getDouble(int n) {
        try {
            return ((CallableStatement)this.plugin).getDouble(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n, int n2) {
        try {
            return ((CallableStatement)this.plugin).getBigDecimal(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte[] getBytes(int n) {
        try {
            return ((CallableStatement)this.plugin).getBytes(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(int n) {
        try {
            return ((CallableStatement)this.plugin).getDate(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(int n) {
        try {
            return ((CallableStatement)this.plugin).getTime(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n) {
        try {
            return ((CallableStatement)this.plugin).getTimestamp(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Object getObject(int n) {
        try {
            return ((CallableStatement)this.plugin).getObject(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n) {
        try {
            return ((CallableStatement)this.plugin).getBigDecimal(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(int n, Map map) {
        try {
            return ((CallableStatement)this.plugin).getObject(n, map);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Ref getRef(int n) {
        try {
            return ((CallableStatement)this.plugin).getRef(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Blob getBlob(int n) {
        try {
            return ((CallableStatement)this.plugin).getBlob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Clob getClob(int n) {
        try {
            return ((CallableStatement)this.plugin).getClob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Array getArray(int n) {
        try {
            return ((CallableStatement)this.plugin).getArray(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getDate(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getTime(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getTimestamp(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, int n2, String string) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, n2, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n, int n2) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, int n, String string2) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, n, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public URL getURL(int n) {
        try {
            return ((CallableStatement)this.plugin).getURL(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setURL(String string, URL uRL) {
        try {
            ((CallableStatement)this.plugin).setURL(string, uRL);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNull(String string, int n) {
        try {
            ((CallableStatement)this.plugin).setNull(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBoolean(String string, boolean flag) {
        try {
            ((CallableStatement)this.plugin).setBoolean(string, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setByte(String string, byte by2) {
        try {
            ((CallableStatement)this.plugin).setByte(string, by2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setShort(String string, short s2) {
        try {
            ((CallableStatement)this.plugin).setShort(string, s2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setInt(String string, int n) {
        try {
            ((CallableStatement)this.plugin).setInt(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setLong(String string, long l3) {
        try {
            ((CallableStatement)this.plugin).setLong(string, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFloat(String string, float f10) {
        try {
            ((CallableStatement)this.plugin).setFloat(string, f10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDouble(String string, double d10) {
        try {
            ((CallableStatement)this.plugin).setDouble(string, d10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBigDecimal(String string, BigDecimal bigDecimal) {
        try {
            ((CallableStatement)this.plugin).setBigDecimal(string, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setString(String string, String string2) {
        try {
            ((CallableStatement)this.plugin).setString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBytes(String string, byte[] byArray) {
        try {
            ((CallableStatement)this.plugin).setBytes(string, byArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDate(String string, Date date) {
        try {
            ((CallableStatement)this.plugin).setDate(string, date);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTime(String string, Time time) {
        try {
            ((CallableStatement)this.plugin).setTime(string, time);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTimestamp(String string, Timestamp timestamp) {
        try {
            ((CallableStatement)this.plugin).setTimestamp(string, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream, int n) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream, int n) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, int n, int n2) {
        try {
            ((CallableStatement)this.plugin).setObject(string, object, n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, int n) {
        try {
            ((CallableStatement)this.plugin).setObject(string, object, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object) {
        try {
            ((CallableStatement)this.plugin).setObject(string, object);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader, int n) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(string, reader, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setDate(String string, Date date, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setDate(string, date, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTime(String string, Time time, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setTime(string, time, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setTimestamp(String string, Timestamp timestamp, Calendar calendar) {
        try {
            ((CallableStatement)this.plugin).setTimestamp(string, timestamp, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNull(String string, int n, String string2) {
        try {
            ((CallableStatement)this.plugin).setNull(string, n, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getString(String string) {
        try {
            return ((CallableStatement)this.plugin).getString(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getBoolean(String string) {
        try {
            return ((CallableStatement)this.plugin).getBoolean(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte getByte(String string) {
        try {
            return ((CallableStatement)this.plugin).getByte(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public short getShort(String string) {
        try {
            return ((CallableStatement)this.plugin).getShort(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getInt(String string) {
        try {
            return ((CallableStatement)this.plugin).getInt(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLong(String string) {
        try {
            return ((CallableStatement)this.plugin).getLong(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public float getFloat(String string) {
        try {
            return ((CallableStatement)this.plugin).getFloat(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public double getDouble(String string) {
        try {
            return ((CallableStatement)this.plugin).getDouble(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte[] getBytes(String string) {
        try {
            return ((CallableStatement)this.plugin).getBytes(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(String string) {
        try {
            return ((CallableStatement)this.plugin).getDate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(String string) {
        try {
            return ((CallableStatement)this.plugin).getTime(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string) {
        try {
            return ((CallableStatement)this.plugin).getTimestamp(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Object getObject(String string) {
        try {
            return ((CallableStatement)this.plugin).getObject(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string) {
        try {
            return ((CallableStatement)this.plugin).getBigDecimal(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(String string, Map map) {
        try {
            return ((CallableStatement)this.plugin).getObject(string, map);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Ref getRef(String string) {
        try {
            return ((CallableStatement)this.plugin).getRef(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Blob getBlob(String string) {
        try {
            return ((CallableStatement)this.plugin).getBlob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Clob getClob(String string) {
        try {
            return ((CallableStatement)this.plugin).getClob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Array getArray(String string) {
        try {
            return ((CallableStatement)this.plugin).getArray(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getDate(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getTime(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string, Calendar calendar) {
        try {
            return ((CallableStatement)this.plugin).getTimestamp(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public URL getURL(String string) {
        try {
            return ((CallableStatement)this.plugin).getURL(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public RowId getRowId(int n) {
        try {
            return ((CallableStatement)this.plugin).getRowId(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public RowId getRowId(String string) {
        try {
            return ((CallableStatement)this.plugin).getRowId(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setRowId(String string, RowId rowId) {
        try {
            ((CallableStatement)this.plugin).setRowId(string, rowId);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNString(String string, String string2) {
        try {
            ((CallableStatement)this.plugin).setNString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setNCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(String string, NClob nClob) {
        try {
            ((CallableStatement)this.plugin).setNClob(string, nClob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setBlob(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setNClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public NClob getNClob(int n) {
        try {
            return ((CallableStatement)this.plugin).getNClob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public NClob getNClob(String string) {
        try {
            return ((CallableStatement)this.plugin).getNClob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setSQLXML(String string, SQLXML sQLXML) {
        try {
            ((CallableStatement)this.plugin).setSQLXML(string, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(int n) {
        try {
            return ((CallableStatement)this.plugin).getSQLXML(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(String string) {
        try {
            return ((CallableStatement)this.plugin).getSQLXML(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getNString(int n) {
        try {
            return ((CallableStatement)this.plugin).getNString(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getNString(String string) {
        try {
            return ((CallableStatement)this.plugin).getNString(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(int n) {
        try {
            return ((CallableStatement)this.plugin).getNCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(String string) {
        try {
            return ((CallableStatement)this.plugin).getNCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(int n) {
        try {
            return ((CallableStatement)this.plugin).getCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(String string) {
        try {
            return ((CallableStatement)this.plugin).getCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(String string, Blob blob) {
        try {
            ((CallableStatement)this.plugin).setBlob(string, blob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(String string, Clob clob) {
        try {
            ((CallableStatement)this.plugin).setClob(string, clob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream, long l3) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader, long l3) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setAsciiStream(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setAsciiStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBinaryStream(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setBinaryStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setCharacterStream(String string, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNCharacterStream(String string, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setNCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setClob(String string, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setBlob(String string, InputStream inputStream) {
        try {
            ((CallableStatement)this.plugin).setBlob(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setNClob(String string, Reader reader) {
        try {
            ((CallableStatement)this.plugin).setNClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(int n, Class clazz) {
        try {
            return ((CallableStatement)this.plugin).getObject(n, clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(String string, Class clazz) {
        try {
            return ((CallableStatement)this.plugin).getObject(string, clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, SQLType sQLType, int n) {
        try {
            ((CallableStatement)this.plugin).setObject(string, object, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setObject(String string, Object object, SQLType sQLType) {
        try {
            ((CallableStatement)this.plugin).setObject(string, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType, int n2) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(int n, SQLType sQLType, String string) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(n, sQLType, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType, int n) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void registerOutParameter(String string, SQLType sQLType, String string2) {
        try {
            ((CallableStatement)this.plugin).registerOutParameter(string, sQLType, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    protected LiteBansModule_412(HexEncodingHelper c22, CallableStatement callableStatement) {
        super(c22, callableStatement);
    }
}

