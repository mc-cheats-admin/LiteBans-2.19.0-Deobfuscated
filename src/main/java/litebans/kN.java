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
import litebans.e6;
import litebans.gk;
import litebans.hR;
import litebans.iq;
import litebans.kI;

public static class kN
implements AutoCloseable {
    private static final kI b = kI.a(kN.class);
    private final CopyOnWriteArrayList g;
    private final boolean d;
    private final ThreadLocal a;
    private final hR f;
    private final AtomicInteger e;
    private volatile boolean h;
    private final SynchronousQueue c;

    public kN(hR hR2) {
        this.f = hR2;
        this.d = this.b();
        this.c = new SynchronousQueue(true);
        this.e = new AtomicInteger();
        this.g = new CopyOnWriteArrayList();
        this.a = this.d ? ThreadLocal.withInitial(() -> new ArrayList(16)) : ThreadLocal.withInitial(() -> new gk(iq.class, 16));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public iq a(long l3, TimeUnit timeUnit) {
        int n;
        List list = (List)this.a.get();
        for (n = list.size() - 1; n >= 0; --n) {
            iq iq2;
            Object e = list.remove(n);
            iq iq3 = iq2 = this.d ? (iq)((WeakReference)e).get() : (iq)e;
            if (iq2 == null || !iq2.a(0, 1)) continue;
            return iq2;
        }
        n = this.e.incrementAndGet();
        try {
            long l5;
            for (iq iq2 : this.g) {
                if (!iq2.a(0, 1)) continue;
                if (n > 1) {
                    this.f.a(n - 1);
                }
                iq iq4 = iq2;
                return iq4;
            }
            this.f.a(n);
            l3 = timeUnit.toNanos(l3);
            do {
                l5 = e6.b();
                iq iq5 = (iq)this.c.poll(l3, TimeUnit.NANOSECONDS);
                if (iq5 != null && !iq5.a(0, 1)) continue;
                iq iq6 = iq5;
                return iq6;
            } while ((l3 -= e6.b(l5)) > 10000L);
            iq iq7 = null;
            return iq7;
        }
        finally {
            this.e.decrementAndGet();
        }
    }

    public void f(iq iq2) {
        iq2.a(0);
        int n = 0;
        while (this.e.get() > 0) {
            if (iq2.a() != 0 || this.c.offer(iq2)) {
                return;
            }
            if ((n & 0xFF) == 255) {
                LockSupport.parkNanos(TimeUnit.MICROSECONDS.toNanos(10L));
            } else {
                Thread.yield();
            }
            ++n;
        }
        List list = (List)this.a.get();
        if (list.size() < 50) {
            list.add(this.d ? new WeakReference<iq>(iq2) : iq2);
        }
    }

    public void c(iq iq2) {
        if (this.h) {
            b.info("ConcurrentBag has been closed, ignoring add()");
            throw new IllegalStateException("ConcurrentBag has been closed, ignoring add()");
        }
        this.g.add(iq2);
        while (this.e.get() > 0 && iq2.a() == 0 && !this.c.offer(iq2)) {
            Thread.yield();
        }
    }

    public boolean e(iq iq2) {
        if (!(iq2.a(1, -1) || iq2.a(-2, -1) || this.h)) {
            b.c("Attempt to remove an object from the bag that was not borrowed or reserved: %s", new Object[]{iq2.toString()});
            return false;
        }
        boolean bl = this.g.remove(iq2);
        if (!bl && !this.h) {
            b.c("Attempt to remove an object from the bag that does not exist: %s", new Object[]{iq2.toString()});
        }
        ((List)this.a.get()).remove(iq2);
        return bl;
    }

    @Override
    public void close() {
        this.h = true;
    }

    public List b(int n) {
        List list = this.g.stream().filter(iq2 -> iq2.a() == n).collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    public List e() {
        return (List)this.g.clone();
    }

    public boolean a(iq iq2) {
        return iq2.a(0, -2);
    }

    public void b(iq iq2) {
        if (iq2.a(-2, 0)) {
            while (this.e.get() > 0 && !this.c.offer(iq2)) {
                Thread.yield();
            }
        } else {
            b.c("Attempt to relinquish an object to the bag that was not reserved: {}", new Object[]{iq2});
        }
    }

    public int c() {
        return this.e.get();
    }

    public int a(int n) {
        int n2 = 0;
        for (iq iq2 : this.g) {
            if (iq2.a() != n) continue;
            ++n2;
        }
        return n2;
    }

    public int f() {
        return this.g.size();
    }

    private final boolean b() {
        try {
            if (System.getProperty("com.zaxxer.hikari.useWeakReferences") != null) {
                return Boolean.getBoolean("com.zaxxer.hikari.useWeakReferences");
            }
            return this.getClass().getClassLoader() != ClassLoader.getSystemClassLoader();
        }
        catch (SecurityException securityException) {
            return true;
        }
    }

    private static final /* synthetic */ void d(iq iq2) {
        b.info(iq2.toString());
    }
}

