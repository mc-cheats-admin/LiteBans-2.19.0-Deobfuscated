package litebans;

import java.util.List;
import java.util.Locale;
import litebans.BungeePlugin;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.gf_0;
import litebans.gu;
import litebans.gx_0;
import litebans.hl;
import litebans.i1;
import litebans.jv_0;
import litebans.ly_0;
import litebans.o;
import litebans.q_0;
import litebans.t;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

public final class gX
implements ly_0 {
    private final di_0 c;
    private final t e;
    private final q_0 d;
    private final o b;
    private static /* synthetic */ String[] a;

    public gX(@NotNull di_0 di_02) {
        this.c = di_02;
        this.e = (t)this.c.a(t.class);
        this.d = (q_0)this.c.a(q_0.class);
        this.b = (o)this.c.a(o.class);
        this.d.e();
    }

    public final di_0 d() {
        return this.c;
    }

    public final t e() {
        return this.e;
    }

    public final q_0 f() {
        return this.d;
    }

    public final o c() {
        return this.b;
    }

    @EventHandler
    public final void a(@NotNull LoginEvent loginEvent) {
        if (loginEvent.isCancelled()) {
            return;
        }
        di_0 di_02 = this.c;
        ew.b(di_02, "");
        loginEvent.registerIntent((Plugin)((BungeePlugin)di_02));
        ((BungeePlugin)this.c).a(() -> gX.a(this, loginEvent));
    }

    @EventHandler
    public final void a(@NotNull ServerConnectEvent serverConnectEvent) {
        if (!serverConnectEvent.isCancelled()) {
            this.b.c().b(serverConnectEvent);
        }
    }

    @EventHandler
    public final void a(@NotNull ServerConnectedEvent serverConnectedEvent) {
        Server server;
        Object object;
        String string;
        jv_0 jv_02 = this.c.a(serverConnectedEvent.getPlayer());
        List list = this.d.f().aj();
        if (list.contains(string = ((String)(object = (server = serverConnectedEvent.getServer()).getInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        object = jv_02;
        boolean bl = false;
        new gf_0(this.c, object.i(), object.a(), object.b()).run();
        ew.a(jv_02);
        Object object2 = jv_02;
        Object object3 = "litebans.exempt.dupeip_join";
        boolean bl2 = false;
        jv_0 jv_03 = object2;
        boolean bl3 = false;
        if (!jv_03.e((String)object3)) {
            object2 = this.e;
            ew.a(object);
            object3 = object;
            bl2 = false;
            ((t)object2).a(object3.i(), object3.a(), object3.b());
        }
    }

    @Override
    public gX a() {
        gX gX2;
        gX gX3 = gX2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{gX3};
        gX3.c.b(em_0Array);
        return gX2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void a(gX gX2, LoginEvent loginEvent) {
        try {
            long l3 = System.nanoTime();
            gu gu2 = gX2.b.c();
            ew.b(gu2, "");
            gx_0 gx_02 = (gx_0)gu2;
            gx_02.a(loginEvent);
            q_0 q_02 = gX2.d;
            int n = 1;
            boolean bl = false;
            if (q_02.a(n)) {
                q_0 q_03 = q_02;
                boolean bl2 = false;
                q_03.a((Object)("Handled login event: " + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " "));
            }
        }
        finally {
            loginEvent.completeIntent((Plugin)gX2.c);
        }
    }

    @Override
    public em_0 a() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{"", "litebans.exempt.dupeip_join", "", "Handled login event: ", " ms."};
    }

    static {
        gX.b();
    }
}

