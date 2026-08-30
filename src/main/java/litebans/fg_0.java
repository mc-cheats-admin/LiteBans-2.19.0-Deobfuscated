package litebans;

import litebans.as;
import litebans.di_0;
import litebans.ew;
import litebans.fo_0;
import litebans.jv_0;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.fG
 */
public static abstract class fg_0
implements Runnable {
    public static final fo_0 a = new fo_0(null);
    private final di_0 c;
    private static final ThreadLocal b = new ThreadLocal();

    public fg_0(@NotNull di_0 di_02) {
        this.c = di_02;
    }

    public final di_0 h() {
        return this.c;
    }

    public final q_0 b() {
        boolean bl = false;
        return (q_0)this.h().a(q_0.class);
    }

    public final p e() {
        boolean bl = false;
        return (p)this.h().a(p.class);
    }

    public final o a() {
        boolean bl = false;
        return (o)this.h().a(o.class);
    }

    public final w g() {
        boolean bl = false;
        return (w)this.h().a(w.class);
    }

    public final jv_0 d() {
        Object t2 = b.get();
        ew.a(t2);
        return (jv_0)t2;
    }

    @Override
    public void run() {
        x_0.a();
        throw new as();
    }

    public void i() {
    }

    public void f() {
    }

    public static final void a(@NotNull jv_0 jv_02, @NotNull CharSequence charSequence, @NotNull di_0 di_02) {
        a.a(jv_02, charSequence, di_02);
    }

    public static final /* synthetic */ ThreadLocal c() {
        return b;
    }
}

