package litebans;

import java.sql.Connection;
import java.sql.Statement;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import litebans.c0;
import litebans.c2;
import litebans.dI;
import litebans.dr;
import litebans.e6;
import litebans.gk;
import litebans.iq;
import litebans.ja;
import litebans.kI;

static final class kJ
implements iq {
    private static final kI l = kI.a(kJ.class);
    private static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(kJ.class, "i");
    Connection g;
    long e;
    private volatile int i = 0;
    private volatile boolean f;
    private volatile ScheduledFuture j;
    private volatile ScheduledFuture h;
    private final gk o;
    private final dr p;
    private final boolean k;
    private final boolean m;

    kJ(Connection connection, dI dI2, boolean bl, boolean bl2) {
        this.g = connection;
        this.p = (dr)dI2;
        this.k = bl;
        this.m = bl2;
        this.e = e6.b();
        this.o = new gk(Statement.class, 16);
    }

    void a(long l3) {
        if (this.g != null) {
            this.e = l3;
            this.p.a(this);
        }
    }

    void b(ScheduledFuture scheduledFuture) {
        this.j = scheduledFuture;
    }

    public void a(ScheduledFuture scheduledFuture) {
        this.h = scheduledFuture;
    }

    Connection a(ja ja2, long l3) {
        return c0.a(this, this.g, this.o, ja2, l3, this.k, this.m);
    }

    void a(c2 c22, int n) {
        this.p.a(this.g, c22, n);
    }

    String e() {
        return this.p.toString();
    }

    boolean b() {
        return this.f;
    }

    void f() {
        this.f = true;
    }

    void a(String string) {
        this.p.a(this, string);
    }

    dI d() {
        return this.p;
    }

    public String toString() {
        long l3 = e6.b();
        return this.g + ", accessed " + e6.e(this.e, l3) + " ago, " + this.c();
    }

    @Override
    public int a() {
        return n.get(this);
    }

    @Override
    public boolean a(int n, int n2) {
        return kJ.n.compareAndSet(this, n, n2);
    }

    @Override
    public void a(int n) {
        kJ.n.set(this, n);
    }

    Connection a() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null && !scheduledFuture2.isDone() && !scheduledFuture2.cancel(false)) {
            l.c("%s - maxLifeTime expiration task cancellation unexpectedly returned false for connection %s", new Object[]{this.e(), this.g.toString()});
        }
        if ((scheduledFuture = this.h) != null && !scheduledFuture.isDone() && !scheduledFuture.cancel(false)) {
            l.c("%s - keepalive task cancellation unexpectedly returned false for connection %s", new Object[]{this.e(), this.g.toString()});
        }
        Connection connection = this.g;
        this.g = null;
        this.j = null;
        this.h = null;
        return connection;
    }

    private final String c() {
        switch (this.i) {
            case 1: {
                return "IN_USE";
            }
            case 0: {
                return "NOT_IN_USE";
            }
            case -1: {
                return "REMOVED";
            }
            case -2: {
                return "RESERVED";
            }
        }
        return "Invalid";
    }
}

