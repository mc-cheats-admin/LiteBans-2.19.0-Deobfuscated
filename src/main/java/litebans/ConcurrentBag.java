package litebans;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;
public class ConcurrentBag
implements AutoCloseable {
    private static final HikariLogger LiteBansModule_31 = HikariLogger.BaseCoreGenericHandler(ConcurrentBag.class);
    private final CopyOnWriteArrayList g;
    private final boolean AsyncBackgroundTask_5;
    private final ThreadLocal BaseCoreGenericHandler;
    private final LiteBansModule_270 LiteBansModule_194;
    private final AtomicInteger e;
    private volatile boolean LiteBansModule_240;
    private final SynchronousQueue c;

    public ConcurrentBag(LiteBansModule_270 hR2) {
        this.LiteBansModule_194 = hR2;
        this.AsyncBackgroundTask_5 = this.LiteBansModule_31();
        this.c = new SynchronousQueue(true);
        this.e = new AtomicInteger();
        this.g = new CopyOnWriteArrayList();
        this.plugin = this.AsyncBackgroundTask_5 ? ThreadLocal.withInitial(() -> new ArrayList(16)) : ThreadLocal.withInitial(() -> new LiteBansModule_226(LiteBansModule_315.class, 16));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public LiteBansModule_315 BaseCoreGenericHandler(long l3, TimeUnit timeUnit) {
        int n;
        List list = (List)this.plugin.get();
        for (n = list.size() - 1; n >= 0; --n) {
            LiteBansModule_315 iq2;
            Object e = list.remove(n);
            LiteBansModule_315 iq3 = iq2 = this.AsyncBackgroundTask_5 ? (LiteBansModule_315)((WeakReference)e).get() : (LiteBansModule_315)e;
            if (iq2 == null || !iq2.BaseCoreGenericHandler(0, 1)) continue;
            return iq2;
        }
        n = this.e.incrementAndGet();
        try {
            long l5;
            for (LiteBansModule_315 iq2 : this.g) {
                if (!iq2.BaseCoreGenericHandler(0, 1)) continue;
                if (n > 1) {
                    this.LiteBansModule_194.BaseCoreGenericHandler(n - 1);
                }
                LiteBansModule_315 iq4 = iq2;
                return iq4;
            }
            this.LiteBansModule_194.BaseCoreGenericHandler(n);
            l3 = timeUnit.toNanos(l3);
            do {
                l5 = LiteBansModule_149.LiteBansModule_31();
                LiteBansModule_315 iq5 = (LiteBansModule_315)this.c.poll(l3, TimeUnit.NANOSECONDS);
                if (iq5 != null && !iq5.BaseCoreGenericHandler(0, 1)) continue;
                LiteBansModule_315 iq6 = iq5;
                return iq6;
            } while ((l3 -= LiteBansModule_149.LiteBansModule_31(l5)) > 10000L);
            LiteBansModule_315 iq7 = null;
            return iq7;
        }
        finally {
            this.e.decrementAndGet();
}

    public void LiteBansModule_194(LiteBansModule_315 iq2) {
        iq2.BaseCoreGenericHandler(0);
        while (this.e.get() > 0) {
            if (iq2.BaseCoreGenericHandler() != 0 || this.c.offer(iq2)) {
                return;
            }
            if ((n & 0xFF) == 255) {
                LockSupport.parkNanos(TimeUnit.MICROSECONDS.toNanos(10L));
            } else {
                Thread.yield();
            }
            ++n;
        }
        List list = (List)this.plugin.get();
        if (list.size() < 50) {
            list.add(this.AsyncBackgroundTask_5 ? new WeakReference<LiteBansModule_315>(iq2) : iq2);
}

    public void c(LiteBansModule_315 iq2) {
        if (this.LiteBansModule_240) {
            LiteBansModule_31.info("ConcurrentBag has been closed, ignoring add()");
            throw new IllegalStateException("ConcurrentBag has been closed, ignoring add()");
        }
        this.g.add(iq2);
        while (this.e.get() > 0 && iq2.BaseCoreGenericHandler() == 0 && !this.c.offer(iq2)) {
            Thread.yield();
}

    public boolean e(LiteBansModule_315 iq2) {
        if (!(iq2.BaseCoreGenericHandler(1, -1) || iq2.BaseCoreGenericHandler(-2, -1) || this.LiteBansModule_240)) {
            LiteBansModule_31.c("Attempt to remove HikariDataSource object from the bag that was not borrowed or reserved: %AsyncBackgroundTask_21", new Object[]{iq2.toString()});
            return false;
        }
        boolean flag = this.g.remove(iq2);
        if (!flag && !this.LiteBansModule_240) {
            LiteBansModule_31.c("Attempt to remove HikariDataSource object from the bag that does not exist: %AsyncBackgroundTask_21", new Object[]{iq2.toString()});
        }
        ((List)this.plugin.get()).remove(iq2);
        return flag;
    }

    @Override
    public void close() {
        this.LiteBansModule_240 = true;
    }

    public List LiteBansModule_31(int n) {
        List list = this.g.stream().filter(iq2 -> iq2.BaseCoreGenericHandler() == n).collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    public List e() {
        return (List)this.g.clone();
    }

    public boolean BaseCoreGenericHandler(LiteBansModule_315 iq2) {
        return iq2.BaseCoreGenericHandler(0, -2);
    }

    public void LiteBansModule_31(LiteBansModule_315 iq2) {
        if (iq2.BaseCoreGenericHandler(-2, 0)) {
            while (this.e.get() > 0 && !this.c.offer(iq2)) {
                Thread.yield();
} else {
            LiteBansModule_31.c("Attempt to relinquish HikariDataSource object to the bag that was not reserved: {}", new Object[]{iq2});
}

    public int c() {
        return this.e.get();
    }

    public int BaseCoreGenericHandler(int n) {
        for (LiteBansModule_315 iq2 : this.g) {
            if (iq2.BaseCoreGenericHandler() != n) continue;
            ++n2;
        }
        return n2;
    }

    public int LiteBansModule_194() {
        return this.g.size();
    }

    private final boolean LiteBansModule_31() {
        try {
            if (System.getProperty("com.zaxxer.hikari.useWeakReferences") != null) {
                return Boolean.getBoolean("com.zaxxer.hikari.useWeakReferences");
            }
            return this.getClass().getClassLoader() != ClassLoader.getSystemClassLoader();
        }
        catch (SecurityException securityException) {
            return true;
}

    private static final /* synthetic */ void AsyncBackgroundTask_5(LiteBansModule_315 iq2) {
        LiteBansModule_31.info(iq2.toString());
}

