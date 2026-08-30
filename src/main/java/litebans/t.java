package litebans;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import litebans.as;
import litebans.bN;
import litebans.cp_0;
import litebans.di_0;
import litebans.eE;
import litebans.ew;
import litebans.gz_0;
import litebans.hl;
import litebans.ht;
import litebans.jj_0;
import litebans.n_0;
import litebans.q_0;
import litebans.s;
import litebans.v;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class t
extends n_0
implements Runnable {
    public static final ht b;
    private final eE c = bN.a(() -> t.a(this));
    private final ArrayBlockingQueue f = new ArrayBlockingQueue(512);
    private final AtomicBoolean g = new AtomicBoolean();
    public static final long d;
    public static final long e;
    public static final int h;
    private static /* synthetic */ String[] i;

    public t(@NotNull di_0 di_02) {
        super(di_02);
    }

    private final s a() {
        eE eE2 = this.c;
        return (s)eE2.a();
    }

    @Override
    public void e() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.e();
        long l3 = 80L;
        if (q_02.f().e() > 1) {
            l3 = 30L;
        }
        this.a.b(this, l3, l3);
    }

    @Override
    public void c() {
        this.f.clear();
        AtomicBoolean atomicBoolean = this.g;
        boolean bl = false;
        atomicBoolean.set(false);
    }

    @Override
    public void b() {
        this.c();
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.g;
        boolean bl = false;
        Object object = atomicBoolean;
        int n = 0;
        if (!((AtomicBoolean)object).compareAndSet(false, true)) return;
        object = (w)this.a.a(w.class);
        try {
            int n2;
            t t2 = this;
            boolean bl2 = false;
            n = t2.f.size() >= 256 ? 3 : (t2.f.size() >= 128 ? 2 : (t2.f.size() >= 64 ? 1 : 0));
            t t3 = this;
            boolean bl3 = false;
            switch (n) {
                case 0: {
                    n2 = 20;
                    break;
                }
                case 1: {
                    n2 = 40;
                    break;
                }
                case 2: {
                    n2 = 50;
                    break;
                }
                case 3: {
                    n2 = 80;
                    break;
                }
                default: {
                    x_0.a();
                    throw new as();
                }
            }
            int n3 = n2;
            if (((w)object).a(2) && n <= 2) {
                return;
            }
            int n4 = 1;
            if (n4 > n3) return;
            while (true) {
                cp_0 cp_02;
                if ((cp_0)this.f.peek() == null) {
                    return;
                }
                if (this.a(cp_02)) return;
                cp_0 cp_03 = (cp_0)this.f.poll();
                if (cp_03 != cp_02) {
                    ew.a(cp_03);
                    if (this.a(cp_03)) {
                        this.f.offer(cp_03);
                        return;
                    }
                }
                t t4 = this;
                ew.a(cp_03);
                cp_0 cp_04 = cp_03;
                boolean bl4 = false;
                cp_0 cp_05 = cp_04;
                boolean bl5 = false;
                new gz_0(t4.a, cp_05.c(), cp_05.g(), cp_05.b()).run();
                if (n4 == n3) return;
                ++n4;
            }
        }
        catch (Exception exception) {
            if (exception instanceof InterruptedException) {
                return;
            }
            ((w)object).a(exception);
            return;
        }
        finally {
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            boolean bl6 = false;
            atomicBoolean2.set(false);
        }
    }

    private final boolean a(cp_0 cp_02) {
        boolean bl;
        block3: {
            Iterable iterable = this.a().a();
            boolean bl2 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl = false;
            } else {
                for (Object t2 : iterable) {
                    cp_0 cp_03 = (cp_0)t2;
                    boolean bl3 = false;
                    if (!(ew.a((Object)cp_03.c(), (Object)cp_02.c()) || ew.a((Object)cp_03.g(), (Object)cp_02.g()) || ew.a((Object)cp_03.b(), (Object)cp_02.b()))) continue;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
        }
        return bl;
    }

    public final void a(@Nullable String string, @Nullable String string2, @Nullable String string3) {
        v v2 = (v)this.a.a(v.class);
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        if (q_02.f().aP() && !v2.a((byte)0, string2)) {
            String string4 = string;
            ew.a((Object)string4);
            String string5 = string2;
            ew.a((Object)string5);
            this.f.offer(new cp_0(string4, jj_0.f(string5), string3));
            q_0 q_03 = q_02;
            boolean bl = false;
            if (q_03.g()) {
                q_0 q_04 = q_03;
                boolean bl2 = false;
                q_04.a((Object)(i[0] + string));
            }
        }
    }

    private static final s a(t t2) {
        return (s)t2.a.a(s.class);
    }

    static {
        h = 512;
        e = 30L;
        d = 80L;
        t.d();
        b = new ht(null);
    }

    private static final void d() {
        i = new String[]{hl.a("\u0a1b\u0a32\u0a32\u0a31\u0a26\u0a74", -1582822828)};
    }
}

