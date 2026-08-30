package litebans;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Wrapper;
import java.util.Calendar;
import java.util.Map;
public final class LiteBansModule_211
extends LiteBansModule_224
implements Wrapper,
AutoCloseable,
ResultSet {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.LiteBansModule_31.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void close() {
        this.LiteBansModule_31.close();
    }

    @Override
    public boolean next() {
        try {
            return this.LiteBansModule_31.next();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean wasNull() {
        try {
            return this.LiteBansModule_31.wasNull();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getString(int n) {
        try {
            return this.LiteBansModule_31.getString(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getBoolean(int n) {
        try {
            return this.LiteBansModule_31.getBoolean(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte getByte(int n) {
        try {
            return this.LiteBansModule_31.getByte(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public short getShort(int n) {
        try {
            return this.LiteBansModule_31.getShort(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getInt(int n) {
        try {
            return this.LiteBansModule_31.getInt(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLong(int n) {
        try {
            return this.LiteBansModule_31.getLong(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public float getFloat(int n) {
        try {
            return this.LiteBansModule_31.getFloat(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public double getDouble(int n) {
        try {
            return this.LiteBansModule_31.getDouble(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n, int n2) {
        try {
            return this.LiteBansModule_31.getBigDecimal(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte[] getBytes(int n) {
        try {
            return this.LiteBansModule_31.getBytes(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(int n) {
        try {
            return this.LiteBansModule_31.getDate(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(int n) {
        try {
            return this.LiteBansModule_31.getTime(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n) {
        try {
            return this.LiteBansModule_31.getTimestamp(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getAsciiStream(int n) {
        try {
            return this.LiteBansModule_31.getAsciiStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getUnicodeStream(int n) {
        try {
            return this.LiteBansModule_31.getUnicodeStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getBinaryStream(int n) {
        try {
            return this.LiteBansModule_31.getBinaryStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getString(String string) {
        try {
            return this.LiteBansModule_31.getString(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean getBoolean(String string) {
        try {
            return this.LiteBansModule_31.getBoolean(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte getByte(String string) {
        try {
            return this.LiteBansModule_31.getByte(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public short getShort(String string) {
        try {
            return this.LiteBansModule_31.getShort(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getInt(String string) {
        try {
            return this.LiteBansModule_31.getInt(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public long getLong(String string) {
        try {
            return this.LiteBansModule_31.getLong(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public float getFloat(String string) {
        try {
            return this.LiteBansModule_31.getFloat(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public double getDouble(String string) {
        try {
            return this.LiteBansModule_31.getDouble(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string, int n) {
        try {
            return this.LiteBansModule_31.getBigDecimal(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public byte[] getBytes(String string) {
        try {
            return this.LiteBansModule_31.getBytes(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(String string) {
        try {
            return this.LiteBansModule_31.getDate(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(String string) {
        try {
            return this.LiteBansModule_31.getTime(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string) {
        try {
            return this.LiteBansModule_31.getTimestamp(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getAsciiStream(String string) {
        try {
            return this.LiteBansModule_31.getAsciiStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getUnicodeStream(String string) {
        try {
            return this.LiteBansModule_31.getUnicodeStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public InputStream getBinaryStream(String string) {
        try {
            return this.LiteBansModule_31.getBinaryStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return this.LiteBansModule_31.getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            this.LiteBansModule_31.clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getCursorName() {
        try {
            return this.LiteBansModule_31.getCursorName();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return this.LiteBansModule_31.getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Object getObject(int n) {
        try {
            return this.LiteBansModule_31.getObject(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Object getObject(String string) {
        try {
            return this.LiteBansModule_31.getObject(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int findColumn(String string) {
        try {
            return this.LiteBansModule_31.findColumn(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(int n) {
        try {
            return this.LiteBansModule_31.getCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(String string) {
        try {
            return this.LiteBansModule_31.getCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n) {
        try {
            return this.LiteBansModule_31.getBigDecimal(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string) {
        try {
            return this.LiteBansModule_31.getBigDecimal(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isBeforeFirst() {
        try {
            return this.LiteBansModule_31.isBeforeFirst();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isAfterLast() {
        try {
            return this.LiteBansModule_31.isAfterLast();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isFirst() {
        try {
            return this.LiteBansModule_31.isFirst();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isLast() {
        try {
            return this.LiteBansModule_31.isLast();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void beforeFirst() {
        try {
            this.LiteBansModule_31.beforeFirst();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void afterLast() {
        try {
            this.LiteBansModule_31.afterLast();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean first() {
        try {
            return this.LiteBansModule_31.first();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean last() {
        try {
            return this.LiteBansModule_31.last();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getRow() {
        try {
            return this.LiteBansModule_31.getRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean absolute(int n) {
        try {
            return this.LiteBansModule_31.absolute(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean relative(int n) {
        try {
            return this.LiteBansModule_31.relative(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean previous() {
        try {
            return this.LiteBansModule_31.previous();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            this.LiteBansModule_31.setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return this.LiteBansModule_31.getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            this.LiteBansModule_31.setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return this.LiteBansModule_31.getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getType() {
        try {
            return this.LiteBansModule_31.getType();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getConcurrency() {
        try {
            return this.LiteBansModule_31.getConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean rowUpdated() {
        try {
            return this.LiteBansModule_31.rowUpdated();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean rowInserted() {
        try {
            return this.LiteBansModule_31.rowInserted();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean rowDeleted() {
        try {
            return this.LiteBansModule_31.rowDeleted();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNull(int n) {
        try {
            this.LiteBansModule_31.updateNull(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBoolean(int n, boolean flag) {
        try {
            this.LiteBansModule_31.updateBoolean(n, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateByte(int n, byte by2) {
        try {
            this.LiteBansModule_31.updateByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateShort(int n, short s2) {
        try {
            this.LiteBansModule_31.updateShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateInt(int n, int n2) {
        try {
            this.LiteBansModule_31.updateInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateLong(int n, long l3) {
        try {
            this.LiteBansModule_31.updateLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateFloat(int n, float f10) {
        try {
            this.LiteBansModule_31.updateFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateDouble(int n, double d10) {
        try {
            this.LiteBansModule_31.updateDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            this.LiteBansModule_31.updateBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateString(int n, String string) {
        try {
            this.LiteBansModule_31.updateString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBytes(int n, byte[] byArray) {
        try {
            this.LiteBansModule_31.updateBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateDate(int n, Date date) {
        try {
            this.LiteBansModule_31.updateDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateTime(int n, Time time) {
        try {
            this.LiteBansModule_31.updateTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateTimestamp(int n, Timestamp timestamp) {
        try {
            this.LiteBansModule_31.updateTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            this.LiteBansModule_31.updateAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            this.LiteBansModule_31.updateBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader, int n2) {
        try {
            this.LiteBansModule_31.updateCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object targetObj, int n2) {
        try {
            this.LiteBansModule_31.updateObject(n, targetObj, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object targetObj) {
        try {
            this.LiteBansModule_31.updateObject(n, targetObj);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNull(String string) {
        try {
            this.LiteBansModule_31.updateNull(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBoolean(String string, boolean flag) {
        try {
            this.LiteBansModule_31.updateBoolean(string, flag);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateByte(String string, byte by2) {
        try {
            this.LiteBansModule_31.updateByte(string, by2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateShort(String string, short s2) {
        try {
            this.LiteBansModule_31.updateShort(string, s2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateInt(String string, int n) {
        try {
            this.LiteBansModule_31.updateInt(string, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateLong(String string, long l3) {
        try {
            this.LiteBansModule_31.updateLong(string, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateFloat(String string, float f10) {
        try {
            this.LiteBansModule_31.updateFloat(string, f10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateDouble(String string, double d10) {
        try {
            this.LiteBansModule_31.updateDouble(string, d10);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBigDecimal(String string, BigDecimal bigDecimal) {
        try {
            this.LiteBansModule_31.updateBigDecimal(string, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateString(String string, String string2) {
        try {
            this.LiteBansModule_31.updateString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBytes(String string, byte[] byArray) {
        try {
            this.LiteBansModule_31.updateBytes(string, byArray);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateDate(String string, Date date) {
        try {
            this.LiteBansModule_31.updateDate(string, date);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateTime(String string, Time time) {
        try {
            this.LiteBansModule_31.updateTime(string, time);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateTimestamp(String string, Timestamp timestamp) {
        try {
            this.LiteBansModule_31.updateTimestamp(string, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream, int n) {
        try {
            this.LiteBansModule_31.updateAsciiStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream, int n) {
        try {
            this.LiteBansModule_31.updateBinaryStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader, int n) {
        try {
            this.LiteBansModule_31.updateCharacterStream(string, reader, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object targetObj, int n) {
        try {
            this.LiteBansModule_31.updateObject(string, targetObj, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object targetObj) {
        try {
            this.LiteBansModule_31.updateObject(string, targetObj);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void insertRow() {
        try {
            super.insertRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateRow() {
        try {
            super.updateRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void deleteRow() {
        try {
            super.deleteRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void refreshRow() {
        try {
            this.LiteBansModule_31.refreshRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void cancelRowUpdates() {
        try {
            this.LiteBansModule_31.cancelRowUpdates();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void moveToInsertRow() {
        try {
            this.LiteBansModule_31.moveToInsertRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void moveToCurrentRow() {
        try {
            this.LiteBansModule_31.moveToCurrentRow();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(int n, Map map) {
        try {
            return this.LiteBansModule_31.getObject(n, map);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Ref getRef(int n) {
        try {
            return this.LiteBansModule_31.getRef(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Blob getBlob(int n) {
        try {
            return this.LiteBansModule_31.getBlob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Clob getClob(int n) {
        try {
            return this.LiteBansModule_31.getClob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Array getArray(int n) {
        try {
            return this.LiteBansModule_31.getArray(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(String string, Map map) {
        try {
            return this.LiteBansModule_31.getObject(string, map);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Ref getRef(String string) {
        try {
            return this.LiteBansModule_31.getRef(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Blob getBlob(String string) {
        try {
            return this.LiteBansModule_31.getBlob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Clob getClob(String string) {
        try {
            return this.LiteBansModule_31.getClob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Array getArray(String string) {
        try {
            return this.LiteBansModule_31.getArray(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(int n, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getDate(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Date getDate(String string, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getDate(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(int n, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getTime(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Time getTime(String string, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getTime(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getTimestamp(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string, Calendar calendar) {
        try {
            return this.LiteBansModule_31.getTimestamp(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public URL getURL(int n) {
        try {
            return this.LiteBansModule_31.getURL(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public URL getURL(String string) {
        try {
            return this.LiteBansModule_31.getURL(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateRef(int n, Ref ref) {
        try {
            this.LiteBansModule_31.updateRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateRef(String string, Ref ref) {
        try {
            this.LiteBansModule_31.updateRef(string, ref);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, Blob blob) {
        try {
            this.LiteBansModule_31.updateBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, Blob blob) {
        try {
            this.LiteBansModule_31.updateBlob(string, blob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Clob clob) {
        try {
            this.LiteBansModule_31.updateClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Clob clob) {
        try {
            this.LiteBansModule_31.updateClob(string, clob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateArray(int n, Array array) {
        try {
            this.LiteBansModule_31.updateArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateArray(String string, Array array) {
        try {
            this.LiteBansModule_31.updateArray(string, array);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public RowId getRowId(int n) {
        try {
            return this.LiteBansModule_31.getRowId(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public RowId getRowId(String string) {
        try {
            return this.LiteBansModule_31.getRowId(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateRowId(int n, RowId rowId) {
        try {
            this.LiteBansModule_31.updateRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateRowId(String string, RowId rowId) {
        try {
            this.LiteBansModule_31.updateRowId(string, rowId);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public int getHoldability() {
        try {
            return this.LiteBansModule_31.getHoldability();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public boolean isClosed() {
        try {
            return this.LiteBansModule_31.isClosed();
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNString(int n, String string) {
        try {
            this.LiteBansModule_31.updateNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNString(String string, String string2) {
        try {
            this.LiteBansModule_31.updateNString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, NClob nClob) {
        try {
            this.LiteBansModule_31.updateNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, NClob nClob) {
        try {
            this.LiteBansModule_31.updateNClob(string, nClob);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public NClob getNClob(int n) {
        try {
            return this.LiteBansModule_31.getNClob(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public NClob getNClob(String string) {
        try {
            return this.LiteBansModule_31.getNClob(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(int n) {
        try {
            return this.LiteBansModule_31.getSQLXML(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(String string) {
        try {
            return this.LiteBansModule_31.getSQLXML(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateSQLXML(int n, SQLXML sQLXML) {
        try {
            this.LiteBansModule_31.updateSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateSQLXML(String string, SQLXML sQLXML) {
        try {
            this.LiteBansModule_31.updateSQLXML(string, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getNString(int n) {
        try {
            return this.LiteBansModule_31.getNString(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public String getNString(String string) {
        try {
            return this.LiteBansModule_31.getNString(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(int n) {
        try {
            return this.LiteBansModule_31.getNCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(String string) {
        try {
            return this.LiteBansModule_31.getNCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(int n, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(String string, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateNCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateAsciiStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateBinaryStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, InputStream inputStream, long l3) {
        try {
            this.LiteBansModule_31.updateBlob(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, Reader reader, long l3) {
        try {
            this.LiteBansModule_31.updateNClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(int n, Reader reader) {
        try {
            this.LiteBansModule_31.updateNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(String string, Reader reader) {
        try {
            this.LiteBansModule_31.updateNCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader) {
        try {
            this.LiteBansModule_31.updateCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateAsciiStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateBinaryStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader) {
        try {
            this.LiteBansModule_31.updateCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, InputStream inputStream) {
        try {
            this.LiteBansModule_31.updateBlob(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Reader reader) {
        try {
            this.LiteBansModule_31.updateClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Reader reader) {
        try {
            this.LiteBansModule_31.updateClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, Reader reader) {
        try {
            this.LiteBansModule_31.updateNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, Reader reader) {
        try {
            this.LiteBansModule_31.updateNClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(int n, Class clazz) {
        try {
            return this.LiteBansModule_31.getObject(n, clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    public Object getObject(String string, Class clazz) {
        try {
            return this.LiteBansModule_31.getObject(string, clazz);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object targetObj, SQLType sQLType, int n2) {
        try {
            this.LiteBansModule_31.updateObject(n, targetObj, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object targetObj, SQLType sQLType, int n) {
        try {
            this.LiteBansModule_31.updateObject(string, targetObj, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object targetObj, SQLType sQLType) {
        try {
            this.LiteBansModule_31.updateObject(n, targetObj, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object targetObj, SQLType sQLType) {
        try {
            this.LiteBansModule_31.updateObject(string, targetObj, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.plugin(sQLException);
        }
    }

    protected LiteBansModule_211(LiteBansModule_66 c22, LiteBansModule_417 lJ2, ResultSet resultSet) {
        super(c22, lJ2, resultSet);
    }
}

