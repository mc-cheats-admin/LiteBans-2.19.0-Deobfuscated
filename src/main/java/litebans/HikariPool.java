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
public final class HikariPool
extends PoolEntry
implements LiteBansModule_305,
LiteBansModule_270 {
    public static final int F;
    public static final int L;
    public static final int BanHandler_2;
    private static final String PunishmentService;
    private static final String BanHandler_4;
    private final HikariLogger z = HikariLogger.BaseCoreGenericHandler(HikariPool.class);
    private final long PlayerQuitListener = Long.getLong("com.zaxxer.hikari.aliveBypassWindowMs", TimeUnit.MILLISECONDS.toMillis(500L));
    private final long J = Long.getLong("com.zaxxer.hikari.housekeeping.periodMs", TimeUnit.SECONDS.toMillis(30L));
    private final LiteBansModule_116 O = new LiteBansModule_116(this, null);
    private final LiteBansModule_116 B = new LiteBansModule_116(this, "After adding ");
    private final Collection H;
    private final ThreadPoolExecutor D;
    private final ThreadPoolExecutor K;
    private final ConcurrentBag A = new ConcurrentBag(this);
    private final LiteBansModule_321 BanHandler_5;
    private final PoolInitializationException LiteBansModule_430;
    private final ScheduledExecutorService LockdownService;
    public volatile int P;
    private ScheduledFuture PluginHookService;

    public HikariPool(HikariConfig aB2) {
        super(aB2);
        this.LiteBansModule_430 = aB2.BaseCoreGenericHandler() ? new PoolInitializationException() : PoolInitializationException.LiteBansModule_31;
        this.LockdownService = this.i();
        this.c();
        this.plugin(this, true);
        ThreadFactory threadFactory = aB2.ServerSyncService();
        int n = aB2.LiteBansModule_194();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(n);
        this.H = Collections.unmodifiableCollection(linkedBlockingQueue);
        this.D = LiteBansModule_131.BaseCoreGenericHandler(linkedBlockingQueue, this.e + " innocent connection adder (Async)", threadFactory, (RejectedExecutionHandler)new ThreadPoolExecutor.DiscardOldestPolicy());
        this.K = LiteBansModule_131.BaseCoreGenericHandler(n, this.e + " innocent connection closer (Async)", threadFactory, (RejectedExecutionHandler)new ThreadPoolExecutor.CallerRunsPolicy());
        this.BanHandler_5 = new LiteBansModule_321(aB2.g(), this.LockdownService);
        this.PluginHookService = this.LockdownService.scheduleWithFixedDelay(new HistoryCleanupTask(this, null), 100L, this.J, TimeUnit.MILLISECONDS);
        if (Boolean.getBoolean("com.zaxxer.hikari.blockUntilFilled") && aB2.AsyncBackgroundTask_5() > 1L) {
            this.D.setMaximumPoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
            this.D.setCorePoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
            long l3 = LiteBansModule_149.LiteBansModule_31();
            while (LiteBansModule_149.AsyncBackgroundTask_5(l3) < aB2.AsyncBackgroundTask_5() && this.LiteBansModule_194() < aB2.i()) {
                LiteBansModule_131.BaseCoreGenericHandler(TimeUnit.MILLISECONDS.toMillis(100L));
            }
            this.D.setCorePoolSize(1);
            this.D.setMaximumPoolSize(1);
}

    public Connection LiteBansModule_31() {
        return this.plugin(this.AsyncBackgroundTask_21);
    }

    /*
     * Exception decompiling
     */
    public Connection BaseCoreGenericHandler(long v1) {
        /*
         * This method has failed to decompile.  When submitting BaseCoreGenericHandler bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         *
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[WHILELOOP]], but top level block is 2[TRYBLOCK]
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     LiteBansModule_21 org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     LiteBansModule_21 org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void LiteBansModule_240() {
{
            this.P = 2;
            if (this.D != null) break;
            this.plugin(new String[]{"After shutdown "});
            this.plugin(this, false);
            return;
        }
        try {
            this.plugin(new String[]{"Before shutdown "});
            if (this.PluginHookService != null) {
                this.PluginHookService.cancel(false);
                this.PluginHookService = null;
            }
            this.plugin();
            this.D.shutdown();
            this.D.awaitTermination(this.LiteBansModule_240(), TimeUnit.SECONDS);
            this.LiteBansModule_194();
            this.A.close();
            ThreadPoolExecutor threadPoolExecutor = LiteBansModule_131.BaseCoreGenericHandler(this.AsyncBackgroundTask_22.LiteBansModule_194(), this.e + " connection assassinator", this.AsyncBackgroundTask_22.ServerSyncService(), (RejectedExecutionHandler)new ThreadPoolExecutor.CallerRunsPolicy());
            try {
                long l3 = LiteBansModule_149.LiteBansModule_31();
                do {
                    this.plugin(threadPoolExecutor);
                    this.plugin();
                } while (this.LiteBansModule_194() > 0 && LiteBansModule_149.AsyncBackgroundTask_5(l3) < TimeUnit.SECONDS.toMillis(10L));
            }
            finally {
                threadPoolExecutor.shutdown();
                threadPoolExecutor.awaitTermination(10L, TimeUnit.SECONDS);
            }
            this.LiteBansModule_31();
            this.K.shutdown();
            this.K.awaitTermination(10L, TimeUnit.SECONDS);
        }
        catch (Throwable throwable) {
            this.plugin(new String[]{"After shutdown "});
            this.plugin(this, false);
            throw throwable;
        }
        this.plugin(new String[]{"After shutdown "});
        this.plugin(this, false);
    }

    @Override
    public void BaseCoreGenericHandler(int n) {
        boolean flag;
        boolean flag2 = flag = n - this.H.size() >= 0;
        if (flag) {
            this.D.submit(this.O);
        } else {
            this.z.LiteBansModule_31("%AsyncBackgroundTask_21 - Add connection elided, waiting %AsyncBackgroundTask_5, queue %AsyncBackgroundTask_5", new Object[]{this.e, n, this.H.size()});
}

    @Override
    public int e() {
        return this.A.BaseCoreGenericHandler(1);
    }

    @Override
    public int LiteBansModule_31() {
        return this.A.BaseCoreGenericHandler(0);
    }

    @Override
    public int LiteBansModule_194() {
        return this.A.LiteBansModule_194();
    }

    @Override
    public int c() {
        return this.A.c();
    }

    @Override
    public void BaseCoreGenericHandler() {
        this.A.e().forEach(kJ2 -> this.plugin((InUseHandler)kJ2, "(connection evicted)", false));
    }

    @Override
    public synchronized void g() {
        if (this.LiteBansModule_430 == PoolInitializationException.LiteBansModule_31) {
            throw new IllegalStateException(this.e + " - is not suspendable");
        }
        if (this.P != 1) {
            this.LiteBansModule_430.LiteBansModule_31();
            this.P = 1;
}

    @Override
    public synchronized void AsyncBackgroundTask_5() {
        if (this.P == 1) {
            this.P = 0;
            this.GnuSparseMapHandler();
            this.LiteBansModule_430.c();
}

    void BaseCoreGenericHandler(String[] args) {
        if (this.z.BaseCoreGenericHandler()) {
            this.z.LiteBansModule_31("{} - {}stats (total={}, active={}, idle={}, waiting={})", new Object[]{this.e, args.length > 0 ? args[0] : "", this.LiteBansModule_194(), this.e(), this.LiteBansModule_31(), this.c()});
}

    @Override
    void BaseCoreGenericHandler(InUseHandler kJ2) {
        this.A.LiteBansModule_194(kJ2);
    }

    void BaseCoreGenericHandler(InUseHandler kJ2, String string) {
        if (this.A.e(kJ2)) {
            Connection connection = kJ2.BaseCoreGenericHandler();
            this.K.execute(() -> {
                this.plugin(connection, string);
                if (this.P == 0) {
                    this.GnuSparseMapHandler();
});
}

    private final InUseHandler BaseCoreGenericHandler() {
{
            try {
                long l3;
                long l5;
                InUseHandler kJ2 = this.AsyncBackgroundTask_5();
                long l7 = this.AsyncBackgroundTask_22.LiteBansModule_31();
                if (l7 > 0L) {
                    l5 = l7 > 10000L ? ThreadLocalRandom.current().nextLong(l7 / 40L) : 0L;
                    l3 = l7 - l5;
                    kJ2.LiteBansModule_31(this.LockdownService.schedule(new AsyncBackgroundTask_8(this, kJ2), l3, TimeUnit.MILLISECONDS));
                }
                if ((l5 = this.AsyncBackgroundTask_22.z()) > 0L) {
                    l3 = ThreadLocalRandom.current().nextLong(l5 / 10L);
                    long l8 = l5 - l3;
                    kJ2.BaseCoreGenericHandler(this.LockdownService.scheduleWithFixedDelay(new AsyncBackgroundTask_16(this, kJ2), l8, l8, TimeUnit.MILLISECONDS));
                }
                return kJ2;
            }
            catch (LiteBansException_6 fP2) {
                if (this.P == 0) {
                    this.z.BaseCoreGenericHandler("%AsyncBackgroundTask_21 - Error thrown while acquiring connection from data source", new Object[]{this.e, fP2.getCause()});
                    this.DatabaseMonitorService.set(fP2);
}
            catch (Exception exception) {
                if (this.P != 0) break;
                this.z.LiteBansModule_31("%AsyncBackgroundTask_21 - Cannot acquire connection from data source", new Object[]{this.e, exception});
}
        return null;
    }

    private final synchronized void GnuSparseMapHandler() {
        int n = Math.min(this.AsyncBackgroundTask_22.LiteBansModule_194() - this.LiteBansModule_194(), this.AsyncBackgroundTask_22.i() - this.LiteBansModule_31()) - this.H.size();
        if (n <= 0) {
            this.z.LiteBansModule_31("%AsyncBackgroundTask_21 - Fill pool skipped, pool is LiteBansModule_21 sufficient ", new Object[]{this.e});
        }
        for (int i = 0; i < n; ++i) {
            this.D.submit(i < n - 1 ? this.O : this.B);
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(ExecutorService executorService) {
        for (InUseHandler kJ2 : this.A.LiteBansModule_31(1)) {
            Connection connection = kJ2.BaseCoreGenericHandler();
            try {
                connection.abort(executorService);
            }
            catch (Throwable throwable) {
                this.plugin(connection, "(connection aborted during shutdown)");
            }
            finally {
                this.A.e(kJ2);
}

    private final void c() {
        long l3 = this.AsyncBackgroundTask_22.AsyncBackgroundTask_5();
        if (l3 < 0L) {
            return;
        }
        long l5 = LiteBansModule_149.LiteBansModule_31();
        do {
            InUseHandler kJ2;
            if ((kJ2 = this.plugin()) != null) {
                if (this.AsyncBackgroundTask_22.i() > 0) {
                    this.A.c(kJ2);
                    this.z.LiteBansModule_31("%AsyncBackgroundTask_21 - Added connection %AsyncBackgroundTask_21", new Object[]{this.e, kJ2.g.toString()});
                } else {
                    this.plugin(kJ2.BaseCoreGenericHandler(), "(initialization check complete and minimumIdle is zero)");
                }
                return;
            }
            if (this.g() instanceof LiteBansException_6) {
                this.plugin(this.g().getCause());
            }
            LiteBansModule_131.BaseCoreGenericHandler(TimeUnit.SECONDS.toMillis(1L));
        } while (LiteBansModule_149.AsyncBackgroundTask_5(l5) < l3);
        if (l3 > 0L) {
            this.plugin(this.g());
}

    private final void BaseCoreGenericHandler(Throwable throwable) {
        this.LiteBansModule_194();
        throw new LiteBansException_3(throwable);
    }

    private final boolean BaseCoreGenericHandler(InUseHandler kJ2, String string, boolean flag) {
        kJ2.LiteBansModule_194();
        if (flag || this.A.BaseCoreGenericHandler(kJ2)) {
            this.plugin(kJ2, string);
            return true;
        }
        return false;
    }

    private final ScheduledExecutorService i() {
        if (this.AsyncBackgroundTask_22.LiteBansModule_401() == null) {
            ThreadFactory threadFactory = Optional.ofNullable(this.AsyncBackgroundTask_22.ServerSyncService()).orElseGet(() -> new LiteBansModule_216(this.e + " housekeeper", true));
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory, new ThreadPoolExecutor.DiscardPolicy());
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            return scheduledThreadPoolExecutor;
        }
        return this.AsyncBackgroundTask_22.LiteBansModule_401();
    }

    private final void LiteBansModule_194() {
        if (this.AsyncBackgroundTask_22.LiteBansModule_401() == null) {
            this.LockdownService.shutdownNow();
}

    private final SQLException LiteBansModule_31(long l3) {
        this.plugin(new String[]{"Timeout failure "});
        String string = null;
        Exception exception = this.g();
        if (exception instanceof SQLException) {
            string = ((SQLException)exception).getSQLState();
        }
        SQLTransientConnectionException sQLTransientConnectionException = new SQLTransientConnectionException(this.e + " - Connection is not available, request timed out after " + LiteBansModule_149.AsyncBackgroundTask_5(l3) + "", string, exception);
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

    static /* synthetic */ InUseHandler AsyncBackgroundTask_5(HikariPool dr2) {
        return dr2.BaseCoreGenericHandler();
    }

    static /* synthetic */ ConcurrentBag BaseCoreGenericHandler(HikariPool dr2) {
        return dr2.A;
    }

    static /* synthetic */ HikariLogger LiteBansModule_31(HikariPool dr2) {
        return dr2.z;
    }

    static /* synthetic */ long e(HikariPool dr2) {
        return dr2.J;
    }

    static /* synthetic */ LiteBansModule_321 LiteBansModule_194(HikariPool dr2) {
        return dr2.BanHandler_5;
    }

    static /* synthetic */ void c(HikariPool dr2) {
        dr2.GnuSparseMapHandler();
    }

    static /* synthetic */ boolean BaseCoreGenericHandler(HikariPool dr2, InUseHandler kJ2, String string, boolean flag) {
        return dr2.BaseCoreGenericHandler(kJ2, string, flag);
    }

    static {
        BanHandler_4 = "(connection is dead)";
        PunishmentService = "(connection was evicted)";
        BanHandler_2 = 2;
        L = 1;
        F = 0;
}

