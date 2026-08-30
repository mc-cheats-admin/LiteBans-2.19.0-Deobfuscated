package litebans;

import java.util.concurrent.atomic.AtomicBoolean;
import litebans.Z;
import litebans.cl_0;
import litebans.di_0;
import litebans.em_0;
import litebans.es_0;
import litebans.ew;
import litebans.hl;
import litebans.i1;
import litebans.o;
import litebans.q_0;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class aX
implements cl_0 {
    private final di_0 b;
    private final o c;
    private final q_0 d;
    private static /* synthetic */ String[] a;

    public aX(@NotNull di_0 di_02) {
        this.b = di_02;
        this.c = (o)this.b.a(o.class);
        this.d = (q_0)this.b.a(q_0.class);
    }

    public final o c() {
        return this.c;
    }

    public final q_0 e() {
        return this.d;
    }

    @EventHandler(priority=EventPriority.LOW)
    public final void b(@NotNull AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (this.d.a(1)) {
            aX aX2 = this;
            boolean bl = false;
            boolean bl2 = false;
            long l3 = System.nanoTime();
            boolean bl3 = false;
            aX2.a(asyncPlayerPreLoginEvent);
            long l5 = System.nanoTime() - l3;
            double d10 = (double)l5 / 1000.0 / 1000.0;
            aX2.d.a((Object)(a[0] + i1.b(d10) + a[1]));
        } else {
            this.a(asyncPlayerPreLoginEvent);
        }
    }

    private final void c(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        boolean bl = false;
        boolean bl2 = false;
        long l3 = System.nanoTime();
        boolean bl3 = false;
        this.a(asyncPlayerPreLoginEvent);
        long l5 = System.nanoTime() - l3;
        double d10 = (double)l5 / 1000.0 / 1000.0;
        this.d.a((Object)(a[2] + i1.b(d10) + a[3]));
    }

    private final void a(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        if (this.b.s()) {
            return;
        }
        if (!this.b.n()) {
            this.b.getLogger().severe(a[4] + asyncPlayerPreLoginEvent.getClass().getSimpleName() + a[5]);
            if (es_0.b()) {
                this.b.getLogger().severe(a[6]);
            }
            return;
        }
        this.b();
        this.c.c().b(asyncPlayerPreLoginEvent);
    }

    private final void b() {
        if (!es_0.c()) {
            return;
        }
        if (this.d.B() != null) {
            Object object = this.d.B();
            ew.b(object, a[7]);
            AtomicBoolean atomicBoolean = ((Z)object).c();
            boolean bl = false;
            if (atomicBoolean.compareAndSet(false, true)) {
                Object object2 = this.d.B();
                ew.b(object2, a[8]);
                ((Z)object2).a(this.d.t());
            }
        }
    }

    public aX d() {
        aX aX2;
        aX aX3 = aX2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{aX3};
        aX3.b.b(em_0Array);
        return aX2;
    }

    @Override
    public em_0 a() {
        return this.d();
    }

    private static final void a() {
        a = new String[]{hl.a("\ue2ee\ue2c7\ue2c8\ue2c2\ue2ca\ue2c3\ue2c2\ue286\ue2ca\ue2c9\ue2c1\ue2cf\ue2c8\ue286\ue2c3\ue2d0\ue2c3\ue2c8\ue2d2\ue29c\ue286", 599843494), hl.a("\u06e0\u06ad\u06b3\u06ee", -1248983360), hl.a("\u69c7\u69ee\u69e1\u69eb\u69e3\u69ea\u69eb\u69af\u69e3\u69e0\u69e8\u69e6\u69e1\u69af\u69ea\u69f9\u69ea\u69e1\u69fb\u69b5\u69af", 1429629327), hl.a("\u28ed\u28a0\u28be\u28e3", -1683478323), hl.a("\u6bcb\u6be5\u6bec\u6bed\u6bf0\u6be7\u6be6\u6ba2", -664114302), hl.a("\uf989\uf992\uf9c2\uf9de\uf9c7\uf9d5\uf9db\uf9dc\uf992\uf9db\uf9c1\uf992\uf9dc\uf9dd\uf9c6\uf992\uf9d7\uf9dc\uf9d3\uf9d0\uf9de\uf9d7\uf9d6\uf992\uf9cb\uf9d7\uf9c6\uf993", -1712129614), hl.a("\ud599\ud5b2\ud5bd\ud5be\ud5b0\ud5b9\ud5fc\ud5b0\ud5bd\ud5a8\ud5b9\ud5f1\ud5be\ud5b5\ud5b2\ud5b8\ud5fc\ud5b5\ud5b2\ud5fc\ud5af\ud5ac\ud5b5\ud5bb\ud5b3\ud5a8\ud5f2\ud5a5\ud5b1\ud5b0\ud5fc\ud5a8\ud5b3\ud5fc\ud5ba\ud5b5\ud5a4\ud5fc\ud5a8\ud5b4\ud5b5\ud5af\ud5fc\ud5ac\ud5ae\ud5b3\ud5be\ud5b0\ud5b9\ud5b1\ud5f0\ud5fc\ud5b3\ud5a8\ud5b4\ud5b9\ud5ae\ud5ab\ud5b5\ud5af\ud5b9\ud5fc\ud5be\ud5bd\ud5b2\ud5b2\ud5b9\ud5b8\ud5fc\ud5ac\ud5b0\ud5bd\ud5a5\ud5b9\ud5ae\ud5af\ud5fc\ud5bf\ud5bd\ud5b2\ud5fc\ud5b6\ud5b3\ud5b5\ud5b2\ud5fc\ud5be\ud5b9\ud5ba\ud5b3\ud5ae\ud5b9\ud5fc\ud590\ud5b5\ud5a8\ud5b9\ud59e\ud5bd\ud5b2\ud5af\ud5fc\ud5b4\ud5bd\ud5af\ud5fc\ud5be\ud5b9\ud5b9\ud5b2\ud5fc\ud5b0\ud5b3\ud5bd\ud5b8\ud5b9\ud5b8\ud5f2", 477877724), hl.a("", 1841389659), hl.a("", 973691667)};
    }

    static {
        aX.a();
    }
}

