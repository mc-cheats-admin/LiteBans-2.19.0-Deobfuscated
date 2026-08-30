package litebans;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import litebans.aD;
import litebans.c0;
import litebans.cs;
import litebans.e6;
import litebans.g5;
import litebans.gk;
import litebans.ja;
import litebans.kI;
import litebans.kJ;

public static abstract class c2
implements Connection {
    static final int d;
    static final int k;
    static final int l;
    static final int a;
    static final int c;
    static final int b;
    private static final kI n;
    private static final Set u;
    private static final Set q;
    protected Connection r;
    private final kJ h;
    private final ja i;
    private final gk g;
    private int o;
    private long v;
    private boolean p;
    private boolean m;
    private boolean j;
    private int s;
    private int t;
    private String e;
    private String f;

    protected c2(kJ kJ2, Connection connection, gk gk2, ja ja2, long l3, boolean bl, boolean bl2) {
        this.h = kJ2;
        this.r = connection;
        this.g = gk2;
        this.i = ja2;
        this.v = l3;
        this.m = bl;
        this.j = bl2;
    }

    public final String toString() {
        return this.getClass().getSimpleName() + '@' + System.identityHashCode(this) + " wrapping " + this.r;
    }

    final boolean d() {
        return this.j;
    }

    final String h() {
        return this.e;
    }

    final String c() {
        return this.f;
    }

    final int a() {
        return this.t;
    }

    final boolean f() {
        return this.m;
    }

    final int g() {
        return this.s;
    }

    final SQLException a(SQLException sQLException) {
        boolean bl = false;
        SQLException sQLException2 = sQLException;
        cs cs2 = this.h.d().v;
        for (int n = 0; this.r != g5.a && sQLException2 != null && n < 10; sQLException2 = sQLException2.getNextException(), ++n) {
            String string = sQLException2.getSQLState();
            if ((string == null || !string.startsWith("08")) && !(sQLException2 instanceof SQLTimeoutException) && !u.contains(string) && !q.contains(sQLException2.getErrorCode())) continue;
            if (cs2 != null && cs2.a(sQLException2) == aD.c) break;
            bl = true;
            break;
        }
        if (bl) {
            SQLException sQLException3 = sQLException2 != null ? sQLException2 : sQLException;
            n.c("%s - Connection %s marked as broken because of SQLSTATE(%s), ErrorCode(%d)", new Object[]{this.h.e(), this.r.toString(), sQLException3.getSQLState(), sQLException3.getErrorCode(), sQLException3});
            this.i.a();
            this.h.a("(connection is broken)");
            this.r = g5.a;
        }
        return sQLException;
    }

    final synchronized void b(Statement statement) {
        this.g.remove(statement);
    }

    final void b() {
        if (this.j) {
            this.v = e6.b();
        } else {
            this.p = true;
        }
    }

    private final synchronized Statement a(Statement statement) {
        this.g.add(statement);
        return statement;
    }

    private final synchronized void e() {
        int n = this.g.size();
        if (n > 0) {
            for (int i = 0; i < n && this.r != g5.a; ++i) {
                try {
                    Statement statement = (Statement)this.g.get(i);
                    Throwable throwable = null;
                    if (statement == null) continue;
                    if (throwable != null) {
                        try {
                            statement.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                        continue;
                    }
                    statement.close();
                    continue;
                }
                catch (SQLException sQLException) {
                    c2.n.c("%s - Connection %s marked as broken because of an exception closing open statements during Connection.close()", new Object[]{this.h.e(), this.r.toString()});
                    this.i.a();
                    this.h.a("(exception closing Statements during Connection.close())");
                    this.r = g5.a;
                }
            }
            this.g.clear();
        }
    }

    @Override
    public final void close() {
        this.e();
        if (this.r != g5.a) {
            this.i.a();
            try {
                if (this.p && !this.j) {
                    this.r.rollback();
                    this.v = e6.b();
                    n.b("%s - Executed rollback on connection %s due to dirty commit state on close().", new Object[]{this.h.e(), this.r.toString()});
                }
                if (this.o != 0) {
                    this.h.a(this, this.o);
                    this.v = e6.b();
                }
                this.r.clearWarnings();
            }
            catch (SQLException sQLException) {
                if (!this.h.b()) {
                    throw this.a(sQLException);
                }
            }
            finally {
                this.r = g5.a;
                this.h.a(this.v);
            }
        }
    }

    @Override
    public boolean isClosed() {
        return this.r == g5.a;
    }

    @Override
    public Statement createStatement() {
        return c0.a(this, this.a(this.r.createStatement()));
    }

    @Override
    public Statement createStatement(int n, int n2) {
        return c0.a(this, this.a(this.r.createStatement(n, n2)));
    }

    @Override
    public Statement createStatement(int n, int n2, int n3) {
        return c0.a(this, this.a(this.r.createStatement(n, n2, n3)));
    }

    @Override
    public CallableStatement prepareCall(String string) {
        return c0.a(this, (CallableStatement)this.a(this.r.prepareCall(string)));
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2) {
        return c0.a(this, (CallableStatement)this.a(this.r.prepareCall(string, n, n2)));
    }

    @Override
    public CallableStatement prepareCall(String string, int n, int n2, int n3) {
        return c0.a(this, (CallableStatement)this.a(this.r.prepareCall(string, n, n2, n3)));
    }

    @Override
    public PreparedStatement prepareStatement(String string) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string, n)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string, n, n2)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int n, int n2, int n3) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string, n, n2, n3)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, int[] nArray) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string, nArray)));
    }

    @Override
    public PreparedStatement prepareStatement(String string, String[] stringArray) {
        return c0.a(this, (PreparedStatement)this.a(this.r.prepareStatement(string, stringArray)));
    }

    @Override
    public DatabaseMetaData getMetaData() {
        this.b();
        return c0.a(this, this.r.getMetaData());
    }

    @Override
    public void commit() {
        this.r.commit();
        this.p = false;
        this.v = e6.b();
    }

    @Override
    public void rollback() {
        this.r.rollback();
        this.p = false;
        this.v = e6.b();
    }

    @Override
    public void rollback(Savepoint savepoint) {
        this.r.rollback(savepoint);
        this.p = false;
        this.v = e6.b();
    }

    @Override
    public void setAutoCommit(boolean bl) {
        this.r.setAutoCommit(bl);
        this.j = bl;
        this.o |= 2;
    }

    @Override
    public void setReadOnly(boolean bl) {
        this.r.setReadOnly(bl);
        this.m = bl;
        this.p = false;
        this.o |= 1;
    }

    @Override
    public void setTransactionIsolation(int n) {
        this.r.setTransactionIsolation(n);
        this.t = n;
        this.o |= 4;
    }

    @Override
    public void setCatalog(String string) {
        this.r.setCatalog(string);
        this.e = string;
        this.o |= 8;
    }

    @Override
    public void setNetworkTimeout(Executor executor, int n) {
        this.r.setNetworkTimeout(executor, n);
        this.s = n;
        this.o |= 0x10;
    }

    @Override
    public void setSchema(String string) {
        this.r.setSchema(string);
        this.f = string;
        this.o |= 0x20;
    }

    public final boolean isWrapperFor(Class clazz) {
        return clazz.isInstance(this.r) || this.r != null && this.r.isWrapperFor(clazz);
    }

    public final Object unwrap(Class clazz) {
        if (clazz.isInstance(this.r)) {
            return this.r;
        }
        if (this.r != null) {
            return this.r.unwrap(clazz);
        }
        throw new SQLException("Wrapped connection is not an instance of " + clazz);
    }

    static {
        b = 32;
        c = 16;
        a = 8;
        l = 4;
        k = 2;
        d = 1;
        n = kI.a(c2.class);
        u = new HashSet();
        u.add("0A000");
        u.add("57P01");
        u.add("57P02");
        u.add("57P03");
        u.add("01002");
        u.add("JZ0C0");
        u.add("JZ0C1");
        q = new HashSet();
        q.add(500150);
        q.add(2399);
    }
}

