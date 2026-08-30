package litebans;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
import litebans.aB;
import litebans.cr;
import litebans.cs_0;
import litebans.d3;
import litebans.dI;
import litebans.dO;
import litebans.db;
import litebans.dl;
import litebans.e6;
import litebans.fP;
import litebans.gc;
import litebans.hR;
import litebans.iI;
import litebans.iU;
import litebans.jf;
import litebans.kI;
import litebans.kJ;
import litebans.kN;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class dr
extends dI
implements iI,
hR {
    public static final int F;
    public static final int L;
    public static final int C;
    private static final String E;
    private static final String G;
    private final kI z = kI.a(dr.class);
    private final long M = Long.getLong("com.zaxxer.hikari.aliveBypassWindowMs", TimeUnit.MILLISECONDS.toMillis(500L));
    private final long J = Long.getLong("com.zaxxer.hikari.housekeeping.periodMs", TimeUnit.SECONDS.toMillis(30L));
    private final db O = new db(this, null);
    private final db B = new db(this, "After adding ");
    private final Collection H;
    private final ThreadPoolExecutor D;
    private final ThreadPoolExecutor K;
    private final kN A = new kN(this);
    private final iU I;
    private final cs_0 N;
    private final ScheduledExecutorService R;
    public volatile int P;
    private ScheduledFuture Q;

    public dr(aB aB2) {
        super(aB2);
        this.N = aB2.a() ? new cs_0() : cs_0.b;
        this.R = this.i();
        this.c();
        this.a(this, true);
        ThreadFactory threadFactory = aB2.u();
        int n = aB2.f();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(n);
        this.H = Collections.unmodifiableCollection(linkedBlockingQueue);
        this.D = dO.a(linkedBlockingQueue, this.e + " innocent connection adder (Async)", threadFactory, (RejectedExecutionHandler)new ThreadPoolExecutor.DiscardOldestPolicy());
        this.K = dO.a(n, this.e + " innocent connection closer (Async)", threadFactory, (RejectedExecutionHandler)new ThreadPoolExecutor.CallerRunsPolicy());
        this.I = new iU(aB2.g(), this.R);
        this.Q = this.R.scheduleWithFixedDelay(new cr(this, null), 100L, this.J, TimeUnit.MILLISECONDS);
        if (Boolean.getBoolean("com.zaxxer.hikari.blockUntilFilled") && aB2.d() > 1L) {
            this.D.setMaximumPoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
            this.D.setCorePoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
            long l3 = e6.b();
            while (e6.d(l3) < aB2.d() && this.f() < aB2.i()) {
                dO.a(TimeUnit.MILLISECONDS.toMillis(100L));
            }
            this.D.setCorePoolSize(1);
            this.D.setMaximumPoolSize(1);
        }
    }

    public Connection b() {
        return this.a(this.s);
    }

    /*
     * Exception decompiling
     */
    public Connection a(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[WHILELOOP]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void h() {
        block8: {
            this.P = 2;
            if (this.D != null) break block8;
            this.a(new String[]{"After shutdown "});
            this.a(this, false);
            return;
        }
        try {
            this.a(new String[]{"Before shutdown "});
            if (this.Q != null) {
                this.Q.cancel(false);
                this.Q = null;
            }
            this.a();
            this.D.shutdown();
            this.D.awaitTermination(this.h(), TimeUnit.SECONDS);
            this.f();
            this.A.close();
            ThreadPoolExecutor threadPoolExecutor = dO.a(this.t.f(), this.e + " connection assassinator", this.t.u(), (RejectedExecutionHandler)new ThreadPoolExecutor.CallerRunsPolicy());
            try {
                long l3 = e6.b();
                do {
                    this.a(threadPoolExecutor);
                    this.a();
                } while (this.f() > 0 && e6.d(l3) < TimeUnit.SECONDS.toMillis(10L));
            }
            finally {
                threadPoolExecutor.shutdown();
                threadPoolExecutor.awaitTermination(10L, TimeUnit.SECONDS);
            }
            this.b();
            this.K.shutdown();
            this.K.awaitTermination(10L, TimeUnit.SECONDS);
        }
        catch (Throwable throwable) {
            this.a(new String[]{"After shutdown "});
            this.a(this, false);
            throw throwable;
        }
        this.a(new String[]{"After shutdown "});
        this.a(this, false);
    }

    @Override
    public void a(int n) {
        boolean bl;
        boolean bl2 = bl = n - this.H.size() >= 0;
        if (bl) {
            this.D.submit(this.O);
        } else {
            this.z.b("%s - Add connection elided, waiting %d, queue %d", new Object[]{this.e, n, this.H.size()});
        }
    }

    @Override
    public int e() {
        return this.A.a(1);
    }

    @Override
    public int b() {
        return this.A.a(0);
    }

    @Override
    public int f() {
        return this.A.f();
    }

    @Override
    public int c() {
        return this.A.c();
    }

    @Override
    public void a() {
        this.A.e().forEach(kJ2 -> this.a((kJ)kJ2, "(connection evicted)", false));
    }

    @Override
    public synchronized void g() {
        if (this.N == cs_0.b) {
            throw new IllegalStateException(this.e + " - is not suspendable");
        }
        if (this.P != 1) {
            this.N.b();
            this.P = 1;
        }
    }

    @Override
    public synchronized void d() {
        if (this.P == 1) {
            this.P = 0;
            this.j();
            this.N.c();
        }
    }

    void a(String[] stringArray) {
        if (this.z.a()) {
            this.z.b("{} - {}stats (total={}, active={}, idle={}, waiting={})", new Object[]{this.e, stringArray.length > 0 ? stringArray[0] : "", this.f(), this.e(), this.b(), this.c()});
        }
    }

    @Override
    void a(kJ kJ2) {
        this.A.f(kJ2);
    }

    void a(kJ kJ2, String string) {
        if (this.A.e(kJ2)) {
            Connection connection = kJ2.a();
            this.K.execute(() -> {
                this.a(connection, string);
                if (this.P == 0) {
                    this.j();
                }
            });
        }
    }

    private final kJ a() {
        block6: {
            try {
                long l3;
                long l5;
                kJ kJ2 = this.d();
                long l7 = this.t.b();
                if (l7 > 0L) {
                    l5 = l7 > 10000L ? ThreadLocalRandom.current().nextLong(l7 / 40L) : 0L;
                    l3 = l7 - l5;
                    kJ2.b(this.R.schedule(new dl(this, kJ2), l3, TimeUnit.MILLISECONDS));
                }
                if ((l5 = this.t.z()) > 0L) {
                    l3 = ThreadLocalRandom.current().nextLong(l5 / 10L);
                    long l8 = l5 - l3;
                    kJ2.a(this.R.scheduleWithFixedDelay(new jf(this, kJ2), l8, l8, TimeUnit.MILLISECONDS));
                }
                return kJ2;
            }
            catch (fP fP2) {
                if (this.P == 0) {
                    this.z.a("%s - Error thrown while acquiring connection from data source", new Object[]{this.e, fP2.getCause()});
                    this.w.set(fP2);
                }
            }
            catch (Exception exception) {
                if (this.P != 0) break block6;
                this.z.b("%s - Cannot acquire connection from data source", new Object[]{this.e, exception});
            }
        }
        return null;
    }

    private final synchronized void j() {
        int n = Math.min(this.t.f() - this.f(), this.t.i() - this.b()) - this.H.size();
        if (n <= 0) {
            this.z.b("%s - Fill pool skipped, pool is at sufficient level.", new Object[]{this.e});
        }
        for (int i = 0; i < n; ++i) {
            this.D.submit(i < n - 1 ? this.O : this.B);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(ExecutorService executorService) {
        for (kJ kJ2 : this.A.b(1)) {
            Connection connection = kJ2.a();
            try {
                connection.abort(executorService);
            }
            catch (Throwable throwable) {
                this.a(connection, "(connection aborted during shutdown)");
            }
            finally {
                this.A.e(kJ2);
            }
        }
    }

    private final void c() {
        long l3 = this.t.d();
        if (l3 < 0L) {
            return;
        }
        long l5 = e6.b();
        do {
            kJ kJ2;
            if ((kJ2 = this.a()) != null) {
                if (this.t.i() > 0) {
                    this.A.c(kJ2);
                    this.z.b("%s - Added connection %s", new Object[]{this.e, kJ2.g.toString()});
                } else {
                    this.a(kJ2.a(), "(initialization check complete and minimumIdle is zero)");
                }
                return;
            }
            if (this.g() instanceof fP) {
                this.a(this.g().getCause());
            }
            dO.a(TimeUnit.SECONDS.toMillis(1L));
        } while (e6.d(l5) < l3);
        if (l3 > 0L) {
            this.a(this.g());
        }
    }

    private final void a(Throwable throwable) {
        this.f();
        throw new d3(throwable);
    }

    private final boolean a(kJ kJ2, String string, boolean bl) {
        kJ2.f();
        if (bl || this.A.a(kJ2)) {
            this.a(kJ2, string);
            return true;
        }
        return false;
    }

    private final ScheduledExecutorService i() {
        if (this.t.l() == null) {
            ThreadFactory threadFactory = Optional.ofNullable(this.t.u()).orElseGet(() -> new gc(this.e + " housekeeper", true));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory, new ThreadPoolExecutor.DiscardPolicy());
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            return scheduledThreadPoolExecutor;
        }
        return this.t.l();
    }

    private final void f() {
        if (this.t.l() == null) {
            this.R.shutdownNow();
        }
    }

    private final SQLException b(long l3) {
        this.a(new String[]{"Timeout failure "});
        String string = null;
        Exception exception = this.g();
        if (exception instanceof SQLException) {
            string = ((SQLException)exception).getSQLState();
        }
        SQLTransientConnectionException sQLTransientConnectionException = new SQLTransientConnectionException(this.e + " - Connection is not available, request timed out after " + e6.d(l3) + "ms.", string, exception);
        if (exception instanceof SQLException) {
            sQLTransientConnectionException.setNextException((SQLException)exception);
        }
        return sQLTransientConnectionException;
    }

    @Override
    public DataSource c() {
        return super.c();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    static /* synthetic */ kJ d(dr dr2) {
        return dr2.a();
    }

    static /* synthetic */ kN a(dr dr2) {
        return dr2.A;
    }

    static /* synthetic */ kI b(dr dr2) {
        return dr2.z;
    }

    static /* synthetic */ long e(dr dr2) {
        return dr2.J;
    }

    static /* synthetic */ iU f(dr dr2) {
        return dr2.I;
    }

    static /* synthetic */ void c(dr dr2) {
        dr2.j();
    }

    static /* synthetic */ boolean a(dr dr2, kJ kJ2, String string, boolean bl) {
        return dr2.a(kJ2, string, bl);
    }

    static {
        G = "(connection is dead)";
        E = "(connection was evicted)";
        C = 2;
        L = 1;
        F = 0;
    }
}

