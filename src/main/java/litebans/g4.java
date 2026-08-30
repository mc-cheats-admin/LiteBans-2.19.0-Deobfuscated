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
import litebans.c2;
import litebans.gi;
import litebans.lJ;

public static final class g4
extends gi
implements Wrapper,
AutoCloseable,
ResultSet {
    public boolean isWrapperFor(Class clazz) {
        try {
            return this.b.isWrapperFor(clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void close() {
        this.b.close();
    }

    @Override
    public boolean next() {
        try {
            return this.b.next();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean wasNull() {
        try {
            return this.b.wasNull();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getString(int n) {
        try {
            return this.b.getString(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getBoolean(int n) {
        try {
            return this.b.getBoolean(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte getByte(int n) {
        try {
            return this.b.getByte(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public short getShort(int n) {
        try {
            return this.b.getShort(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getInt(int n) {
        try {
            return this.b.getInt(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLong(int n) {
        try {
            return this.b.getLong(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public float getFloat(int n) {
        try {
            return this.b.getFloat(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public double getDouble(int n) {
        try {
            return this.b.getDouble(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n, int n2) {
        try {
            return this.b.getBigDecimal(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte[] getBytes(int n) {
        try {
            return this.b.getBytes(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(int n) {
        try {
            return this.b.getDate(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(int n) {
        try {
            return this.b.getTime(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n) {
        try {
            return this.b.getTimestamp(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getAsciiStream(int n) {
        try {
            return this.b.getAsciiStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getUnicodeStream(int n) {
        try {
            return this.b.getUnicodeStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getBinaryStream(int n) {
        try {
            return this.b.getBinaryStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getString(String string) {
        try {
            return this.b.getString(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean getBoolean(String string) {
        try {
            return this.b.getBoolean(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte getByte(String string) {
        try {
            return this.b.getByte(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public short getShort(String string) {
        try {
            return this.b.getShort(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getInt(String string) {
        try {
            return this.b.getInt(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public long getLong(String string) {
        try {
            return this.b.getLong(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public float getFloat(String string) {
        try {
            return this.b.getFloat(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public double getDouble(String string) {
        try {
            return this.b.getDouble(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string, int n) {
        try {
            return this.b.getBigDecimal(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public byte[] getBytes(String string) {
        try {
            return this.b.getBytes(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(String string) {
        try {
            return this.b.getDate(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(String string) {
        try {
            return this.b.getTime(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string) {
        try {
            return this.b.getTimestamp(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getAsciiStream(String string) {
        try {
            return this.b.getAsciiStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getUnicodeStream(String string) {
        try {
            return this.b.getUnicodeStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public InputStream getBinaryStream(String string) {
        try {
            return this.b.getBinaryStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLWarning getWarnings() {
        try {
            return this.b.getWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void clearWarnings() {
        try {
            this.b.clearWarnings();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getCursorName() {
        try {
            return this.b.getCursorName();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() {
        try {
            return this.b.getMetaData();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Object getObject(int n) {
        try {
            return this.b.getObject(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Object getObject(String string) {
        try {
            return this.b.getObject(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int findColumn(String string) {
        try {
            return this.b.findColumn(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(int n) {
        try {
            return this.b.getCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getCharacterStream(String string) {
        try {
            return this.b.getCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int n) {
        try {
            return this.b.getBigDecimal(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String string) {
        try {
            return this.b.getBigDecimal(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isBeforeFirst() {
        try {
            return this.b.isBeforeFirst();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isAfterLast() {
        try {
            return this.b.isAfterLast();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isFirst() {
        try {
            return this.b.isFirst();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isLast() {
        try {
            return this.b.isLast();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void beforeFirst() {
        try {
            this.b.beforeFirst();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void afterLast() {
        try {
            this.b.afterLast();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean first() {
        try {
            return this.b.first();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean last() {
        try {
            return this.b.last();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getRow() {
        try {
            return this.b.getRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean absolute(int n) {
        try {
            return this.b.absolute(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean relative(int n) {
        try {
            return this.b.relative(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean previous() {
        try {
            return this.b.previous();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchDirection(int n) {
        try {
            this.b.setFetchDirection(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchDirection() {
        try {
            return this.b.getFetchDirection();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void setFetchSize(int n) {
        try {
            this.b.setFetchSize(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getFetchSize() {
        try {
            return this.b.getFetchSize();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getType() {
        try {
            return this.b.getType();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getConcurrency() {
        try {
            return this.b.getConcurrency();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean rowUpdated() {
        try {
            return this.b.rowUpdated();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean rowInserted() {
        try {
            return this.b.rowInserted();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean rowDeleted() {
        try {
            return this.b.rowDeleted();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNull(int n) {
        try {
            this.b.updateNull(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBoolean(int n, boolean bl) {
        try {
            this.b.updateBoolean(n, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateByte(int n, byte by2) {
        try {
            this.b.updateByte(n, by2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateShort(int n, short s2) {
        try {
            this.b.updateShort(n, s2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateInt(int n, int n2) {
        try {
            this.b.updateInt(n, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateLong(int n, long l3) {
        try {
            this.b.updateLong(n, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateFloat(int n, float f10) {
        try {
            this.b.updateFloat(n, f10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateDouble(int n, double d10) {
        try {
            this.b.updateDouble(n, d10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBigDecimal(int n, BigDecimal bigDecimal) {
        try {
            this.b.updateBigDecimal(n, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateString(int n, String string) {
        try {
            this.b.updateString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBytes(int n, byte[] byArray) {
        try {
            this.b.updateBytes(n, byArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateDate(int n, Date date) {
        try {
            this.b.updateDate(n, date);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateTime(int n, Time time) {
        try {
            this.b.updateTime(n, time);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateTimestamp(int n, Timestamp timestamp) {
        try {
            this.b.updateTimestamp(n, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream, int n2) {
        try {
            this.b.updateAsciiStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream, int n2) {
        try {
            this.b.updateBinaryStream(n, inputStream, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader, int n2) {
        try {
            this.b.updateCharacterStream(n, reader, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object object, int n2) {
        try {
            this.b.updateObject(n, object, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object object) {
        try {
            this.b.updateObject(n, object);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNull(String string) {
        try {
            this.b.updateNull(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBoolean(String string, boolean bl) {
        try {
            this.b.updateBoolean(string, bl);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateByte(String string, byte by2) {
        try {
            this.b.updateByte(string, by2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateShort(String string, short s2) {
        try {
            this.b.updateShort(string, s2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateInt(String string, int n) {
        try {
            this.b.updateInt(string, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateLong(String string, long l3) {
        try {
            this.b.updateLong(string, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateFloat(String string, float f10) {
        try {
            this.b.updateFloat(string, f10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateDouble(String string, double d10) {
        try {
            this.b.updateDouble(string, d10);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBigDecimal(String string, BigDecimal bigDecimal) {
        try {
            this.b.updateBigDecimal(string, bigDecimal);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateString(String string, String string2) {
        try {
            this.b.updateString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBytes(String string, byte[] byArray) {
        try {
            this.b.updateBytes(string, byArray);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateDate(String string, Date date) {
        try {
            this.b.updateDate(string, date);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateTime(String string, Time time) {
        try {
            this.b.updateTime(string, time);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateTimestamp(String string, Timestamp timestamp) {
        try {
            this.b.updateTimestamp(string, timestamp);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream, int n) {
        try {
            this.b.updateAsciiStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream, int n) {
        try {
            this.b.updateBinaryStream(string, inputStream, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader, int n) {
        try {
            this.b.updateCharacterStream(string, reader, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object object, int n) {
        try {
            this.b.updateObject(string, object, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object object) {
        try {
            this.b.updateObject(string, object);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void insertRow() {
        try {
            super.insertRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateRow() {
        try {
            super.updateRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void deleteRow() {
        try {
            super.deleteRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void refreshRow() {
        try {
            this.b.refreshRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void cancelRowUpdates() {
        try {
            this.b.cancelRowUpdates();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void moveToInsertRow() {
        try {
            this.b.moveToInsertRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void moveToCurrentRow() {
        try {
            this.b.moveToCurrentRow();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(int n, Map map) {
        try {
            return this.b.getObject(n, map);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Ref getRef(int n) {
        try {
            return this.b.getRef(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Blob getBlob(int n) {
        try {
            return this.b.getBlob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Clob getClob(int n) {
        try {
            return this.b.getClob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Array getArray(int n) {
        try {
            return this.b.getArray(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(String string, Map map) {
        try {
            return this.b.getObject(string, map);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Ref getRef(String string) {
        try {
            return this.b.getRef(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Blob getBlob(String string) {
        try {
            return this.b.getBlob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Clob getClob(String string) {
        try {
            return this.b.getClob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Array getArray(String string) {
        try {
            return this.b.getArray(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(int n, Calendar calendar) {
        try {
            return this.b.getDate(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Date getDate(String string, Calendar calendar) {
        try {
            return this.b.getDate(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(int n, Calendar calendar) {
        try {
            return this.b.getTime(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Time getTime(String string, Calendar calendar) {
        try {
            return this.b.getTime(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(int n, Calendar calendar) {
        try {
            return this.b.getTimestamp(n, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Timestamp getTimestamp(String string, Calendar calendar) {
        try {
            return this.b.getTimestamp(string, calendar);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public URL getURL(int n) {
        try {
            return this.b.getURL(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public URL getURL(String string) {
        try {
            return this.b.getURL(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateRef(int n, Ref ref) {
        try {
            this.b.updateRef(n, ref);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateRef(String string, Ref ref) {
        try {
            this.b.updateRef(string, ref);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, Blob blob) {
        try {
            this.b.updateBlob(n, blob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, Blob blob) {
        try {
            this.b.updateBlob(string, blob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Clob clob) {
        try {
            this.b.updateClob(n, clob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Clob clob) {
        try {
            this.b.updateClob(string, clob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateArray(int n, Array array) {
        try {
            this.b.updateArray(n, array);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateArray(String string, Array array) {
        try {
            this.b.updateArray(string, array);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public RowId getRowId(int n) {
        try {
            return this.b.getRowId(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public RowId getRowId(String string) {
        try {
            return this.b.getRowId(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateRowId(int n, RowId rowId) {
        try {
            this.b.updateRowId(n, rowId);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateRowId(String string, RowId rowId) {
        try {
            this.b.updateRowId(string, rowId);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public int getHoldability() {
        try {
            return this.b.getHoldability();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public boolean isClosed() {
        try {
            return this.b.isClosed();
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNString(int n, String string) {
        try {
            this.b.updateNString(n, string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNString(String string, String string2) {
        try {
            this.b.updateNString(string, string2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, NClob nClob) {
        try {
            this.b.updateNClob(n, nClob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, NClob nClob) {
        try {
            this.b.updateNClob(string, nClob);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public NClob getNClob(int n) {
        try {
            return this.b.getNClob(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public NClob getNClob(String string) {
        try {
            return this.b.getNClob(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(int n) {
        try {
            return this.b.getSQLXML(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public SQLXML getSQLXML(String string) {
        try {
            return this.b.getSQLXML(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateSQLXML(int n, SQLXML sQLXML) {
        try {
            this.b.updateSQLXML(n, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateSQLXML(String string, SQLXML sQLXML) {
        try {
            this.b.updateSQLXML(string, sQLXML);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getNString(int n) {
        try {
            return this.b.getNString(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public String getNString(String string) {
        try {
            return this.b.getNString(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(int n) {
        try {
            return this.b.getNCharacterStream(n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public Reader getNCharacterStream(String string) {
        try {
            return this.b.getNCharacterStream(string);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(int n, Reader reader, long l3) {
        try {
            this.b.updateNCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(String string, Reader reader, long l3) {
        try {
            this.b.updateNCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream, long l3) {
        try {
            this.b.updateAsciiStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream, long l3) {
        try {
            this.b.updateBinaryStream(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader, long l3) {
        try {
            this.b.updateCharacterStream(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream, long l3) {
        try {
            this.b.updateAsciiStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream, long l3) {
        try {
            this.b.updateBinaryStream(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader, long l3) {
        try {
            this.b.updateCharacterStream(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, InputStream inputStream, long l3) {
        try {
            this.b.updateBlob(n, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, InputStream inputStream, long l3) {
        try {
            this.b.updateBlob(string, inputStream, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Reader reader, long l3) {
        try {
            this.b.updateClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Reader reader, long l3) {
        try {
            this.b.updateClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, Reader reader, long l3) {
        try {
            this.b.updateNClob(n, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, Reader reader, long l3) {
        try {
            this.b.updateNClob(string, reader, l3);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(int n, Reader reader) {
        try {
            this.b.updateNCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNCharacterStream(String string, Reader reader) {
        try {
            this.b.updateNCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(int n, InputStream inputStream) {
        try {
            this.b.updateAsciiStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(int n, InputStream inputStream) {
        try {
            this.b.updateBinaryStream(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(int n, Reader reader) {
        try {
            this.b.updateCharacterStream(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateAsciiStream(String string, InputStream inputStream) {
        try {
            this.b.updateAsciiStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBinaryStream(String string, InputStream inputStream) {
        try {
            this.b.updateBinaryStream(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateCharacterStream(String string, Reader reader) {
        try {
            this.b.updateCharacterStream(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(int n, InputStream inputStream) {
        try {
            this.b.updateBlob(n, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateBlob(String string, InputStream inputStream) {
        try {
            this.b.updateBlob(string, inputStream);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(int n, Reader reader) {
        try {
            this.b.updateClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateClob(String string, Reader reader) {
        try {
            this.b.updateClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(int n, Reader reader) {
        try {
            this.b.updateNClob(n, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateNClob(String string, Reader reader) {
        try {
            this.b.updateNClob(string, reader);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(int n, Class clazz) {
        try {
            return this.b.getObject(n, clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    public Object getObject(String string, Class clazz) {
        try {
            return this.b.getObject(string, clazz);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object object, SQLType sQLType, int n2) {
        try {
            this.b.updateObject(n, object, sQLType, n2);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object object, SQLType sQLType, int n) {
        try {
            this.b.updateObject(string, object, sQLType, n);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(int n, Object object, SQLType sQLType) {
        try {
            this.b.updateObject(n, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    @Override
    public void updateObject(String string, Object object, SQLType sQLType) {
        try {
            this.b.updateObject(string, object, sQLType);
        }
        catch (SQLException sQLException) {
            throw this.a(sQLException);
        }
    }

    protected g4(c2 c22, lJ lJ2, ResultSet resultSet) {
        super(c22, lJ2, resultSet);
    }
}

