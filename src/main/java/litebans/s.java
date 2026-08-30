package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import litebans.as;
import litebans.bt_0;
import litebans.ch;
import litebans.cp_0;
import litebans.di_0;
import litebans.hs_0;
import litebans.iv_0;
import litebans.kR;
import litebans.n_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

public static final class s
extends n_0
implements Runnable {
    public static final hs_0 d;
    private final ArrayBlockingQueue f = new ArrayBlockingQueue(2048);
    private final AtomicBoolean c = new AtomicBoolean();
    public static final long b;
    public static final int e;

    public s(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final ArrayBlockingQueue a() {
        return this.f;
    }

    @Override
    public void e() {
        AtomicBoolean atomicBoolean = this.c;
        boolean bl = false;
        atomicBoolean.set(false);
        this.a.b(this, 64L, 64L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.c;
        boolean bl = false;
        Object object = atomicBoolean;
        int n = 0;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            object = (w)this.a.a(w.class);
            try {
                int n2;
                s s2 = this;
                boolean bl2 = false;
                n = s2.a().size() <= 256 ? 0 : (s2.a().size() <= 512 ? 1 : (s2.a().size() <= 1024 ? 2 : (s2.a().size() < 2048 ? 3 : 4)));
                int n3 = 0;
                Object object2 = this;
                boolean bl3 = false;
                switch (n) {
                    case 0: {
                        n2 = 40;
                        break;
                    }
                    case 1: {
                        n2 = 60;
                        break;
                    }
                    case 2: {
                        n2 = 256;
                        break;
                    }
                    case 3: {
                        n2 = 512;
                        break;
                    }
                    case 4: {
                        n2 = 2048;
                        break;
                    }
                    default: {
                        x_0.a();
                        throw new as();
                    }
                }
                n3 = n2;
                if (w.a((w)object, 0, 1, null) && n == 0) {
                    n3 = 1;
                }
                object2 = object;
                bl3 = false;
                try {
                    ch ch2 = ((w)object2).f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (ch)closeable;
                        boolean bl4 = false;
                        ch ch3 = ch2;
                        boolean bl5 = false;
                        int n4 = 1;
                        int n5 = n3;
                        if (n4 <= n5) {
                            while ((cp_0)this.f.poll() != null) {
                                cp_0 cp_02;
                                kR.a(ch3, cp_02.c(), cp_02.g(), cp_02.b(), false, false, 24, null);
                                if (n4 == n5) break;
                                ++n4;
                            }
                        }
                        object3 = iv_0.a;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!((w)object2).b(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Exception exception) {
                if (exception instanceof InterruptedException) {
                    return;
                }
                ((w)object).a(exception);
            }
            finally {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                boolean bl6 = false;
                atomicBoolean2.set(false);
            }
        }
    }

    @Override
    public void b() {
        this.c();
        this.e();
    }

    static {
        e = 2048;
        b = 64L;
        d = new hs_0(null);
    }
}

