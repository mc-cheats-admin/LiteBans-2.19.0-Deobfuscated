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

public final class aX
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
            aX2.d.a((Object)("Handled login event: " + i1.b(d10) + " "));
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
        this.d.a((Object)("Handled login event: " + i1.b(d10) + " "));
    }

    private final void a(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        if (this.b.s()) {
            return;
        }
        if (!this.b.n()) {
            this.b.getLogger().severe("Ignored " + asyncPlayerPreLoginEvent.getClass().getSimpleName() + "; plugin is not enabled yet!");
            if (es_0.b()) {
                this.b.getLogger().severe("Enable late-bind in spigot.yml to fix this problem, otherwise banned players can join before LiteBans has been ");
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
            ew.b(object, "");
            AtomicBoolean atomicBoolean = ((Z)object).c();
            boolean bl = false;
            if (atomicBoolean.compareAndSet(false, true)) {
                Object object2 = this.d.B();
                ew.b(object2, "");
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
        a = new String[]{"Handled login event: ", " ", "Handled login event: ", " ", "Ignored ", "; plugin is not enabled yet!", "Enable late-bind in spigot.yml to fix this problem, otherwise banned players can join before LiteBans has been ", "", ""};
    }

    static {
        aX.a();
    }
}

