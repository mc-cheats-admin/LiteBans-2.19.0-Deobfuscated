package litebans;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import litebans.ah_0;
import litebans.bz;
import litebans.ce_0;
import litebans.di_0;
import litebans.dz_0;
import litebans.ep;
import litebans.eq;
import litebans.ew;
import litebans.hl;
import litebans.kH;
import litebans.n_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.z
 */
public static final class z_0
extends n_0 {
    public static final kH b;
    private ScheduledExecutorService c;
    private static String d;
    private static /* synthetic */ String[] e;

    public z_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.shutdown();
                scheduledExecutorService.awaitTermination(1L, TimeUnit.SECONDS);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        this.c = null;
    }

    @Override
    public void e() {
        di_0 di_02 = this.a;
        q_0 q_02 = (q_0)di_02.a(q_0.class);
        q_02.e();
        String string = d;
        if (string == null || ((CharSequence)string).length() == 0) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = di_02.x();
        ew.b(threadPoolExecutor, e[0]);
        ThreadFactory threadFactory = threadPoolExecutor.getThreadFactory();
        this.c = Executors.newScheduledThreadPool(1, threadFactory);
        Object[] objectArray = new Object[]{string, di_02};
        Object[] objectArray2 = objectArray;
        ScheduledExecutorService scheduledExecutorService = this.c;
        ew.a(scheduledExecutorService);
        scheduledExecutorService.scheduleAtFixedRate(new ce_0(Arrays.copyOf(objectArray2, objectArray2.length)), 0L, 2L, TimeUnit.DAYS);
        d = e[1];
    }

    static {
        z_0.d();
        b = new kH(null);
        try {
            d = e[2];
            d = d + ah_0.b.c();
            d = d + ep.a;
            d = d + ah_0.b.a();
            d = d + dz_0.a;
            d = d + ah_0.b.f();
            d = d + bz.a(eq.d, e[3], e[4], false, 4, null);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static final void d() {
        e = new String[]{hl.a("", -1617062975), hl.a("", -1489641192), hl.a("\udba4\udbb8\udbb8\udbbc\udbbf\udbf6\udbe3\udbe3\udba0\udba5\udbb8\udba9\udbae\udbad\udba2\udbbf\udbe2\udba8\udbe1\udba2\udbe1\udbbf\udbe2\udba2\udbad\udba1\udba9\udbe3\udbb9\udbbc\udba8\udbad\udbb8\udba9\udbe2\udbbc\udba4\udbbc", -1557406772), hl.a("\u44de", 1628914928), hl.a("", -764571793)};
    }
}

