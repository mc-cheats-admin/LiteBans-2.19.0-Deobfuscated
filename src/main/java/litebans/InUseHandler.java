package litebans;

import java.sql.Connection;
import java.sql.Statement;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
static final class InUseHandler
implements LiteBansModule_315 {
    private static final HikariLogger LiteBansModule_401 = HikariLogger.BaseCoreGenericHandler(InUseHandler.class);
    private static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(InUseHandler.class, "i");
    Connection g;
    long e;
    private volatile int i = 0;
    private volatile boolean LiteBansModule_194;
    private volatile ScheduledFuture GnuSparseMapHandler;
    private volatile ScheduledFuture LiteBansModule_240;
    private final LiteBansModule_226 BroadcastService;
    private final HikariPool PunishmentTableService;
    private final boolean Utf8Handler_2;
    private final boolean m;

    InUseHandler(Connection connection, PoolEntry dI2, boolean flag, boolean flag2) {
        this.g = connection;
        this.PunishmentTableService = (HikariPool)dI2;
        this.Utf8Handler_2 = flag;
        this.m = flag2;
        this.e = LiteBansModule_149.LiteBansModule_31();
        this.BroadcastService = new LiteBansModule_226(Statement.class, 16);
    }

    void BaseCoreGenericHandler(long l3) {
        if (this.g != null) {
            this.e = l3;
            this.PunishmentTableService.BaseCoreGenericHandler(this);
        }
    }

    void LiteBansModule_31(ScheduledFuture scheduledFuture) {
        this.GnuSparseMapHandler = scheduledFuture;
    }

    public void BaseCoreGenericHandler(ScheduledFuture scheduledFuture) {
        this.LiteBansModule_240 = scheduledFuture;
    }

    Connection BaseCoreGenericHandler(AsyncBackgroundTask_15 ja2, long l3) {
        return LiteBansModule_64.BaseCoreGenericHandler(this, this.g, this.BroadcastService, ja2, l3, this.Utf8Handler_2, this.m);
    }

    void BaseCoreGenericHandler(HexEncodingHelper c22, int n) {
        this.PunishmentTableService.BaseCoreGenericHandler(this.g, c22, n);
    }

    String e() {
        return this.PunishmentTableService.toString();
    }

    boolean LiteBansModule_31() {
        return this.LiteBansModule_194;
    }

    void LiteBansModule_194() {
        this.LiteBansModule_194 = true;
    }

    void BaseCoreGenericHandler(String string) {
        this.PunishmentTableService.BaseCoreGenericHandler(this, string);
    }

    PoolEntry AsyncBackgroundTask_5() {
        return this.PunishmentTableService;
    }

    public String toString() {
        long l3 = LiteBansModule_149.LiteBansModule_31();
        return this.g + ", accessed " + LiteBansModule_149.e(this.e, l3) + " ago, " + this.c();
    }

    @Override
    public int BaseCoreGenericHandler() {
        return n.get(this);
    }

    @Override
    public boolean BaseCoreGenericHandler(int n, int n2) {
        return InUseHandler.n.compareAndSet(this, n, n2);
    }

    @Override
    public void BaseCoreGenericHandler(int n) {
        InUseHandler.n.set(this, n);
    }

    Connection BaseCoreGenericHandler() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2 = this.GnuSparseMapHandler;
        if (scheduledFuture2 != null && !scheduledFuture2.isDone() && !scheduledFuture2.cancel(false)) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - maxLifeTime expiration task cancellation unexpectedly returned false for connection %AsyncBackgroundTask_21", new Object[]{this.e(), this.g.toString()});
        }
        if ((scheduledFuture = this.LiteBansModule_240) != null && !scheduledFuture.isDone() && !scheduledFuture.cancel(false)) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - keepalive task cancellation unexpectedly returned false for connection %AsyncBackgroundTask_21", new Object[]{this.e(), this.g.toString()});
        }
        Connection connection = this.g;
        this.g = null;
        this.GnuSparseMapHandler = null;
        this.LiteBansModule_240 = null;
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

