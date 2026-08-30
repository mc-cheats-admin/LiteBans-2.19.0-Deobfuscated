package litebans;

import com.velocitypowered.api.event.EventTask;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.ServerConnectedEvent;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.util.List;
import java.util.Locale;
import litebans.di_0;
import litebans.ek_0;
import litebans.em_0;
import litebans.ew;
import litebans.gf_0;
import litebans.hl;
import litebans.jv_0;
import litebans.o;
import litebans.q_0;
import litebans.t;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class d1
implements ek_0 {
    private final di_0 d;
    private final t f;
    private final q_0 a;
    private final o c;
    private final w b;
    private static /* synthetic */ String[] e;

    public d1(@NotNull di_0 di_02) {
        this.d = di_02;
        this.f = (t)this.d.a(t.class);
        this.a = (q_0)this.d.a(q_0.class);
        this.c = (o)this.d.a(o.class);
        this.b = (w)this.d.a(w.class);
    }

    public final di_0 d() {
        return this.d;
    }

    public final t e() {
        return this.f;
    }

    public final q_0 a() {
        return this.a;
    }

    public final o g() {
        return this.c;
    }

    public final w f() {
        return this.b;
    }

    @Subscribe
    public final EventTask a(@NotNull ServerPreConnectEvent serverPreConnectEvent) {
        if (!serverPreConnectEvent.getResult().isAllowed()) {
            return null;
        }
        return EventTask.async(() -> d1.a(this, serverPreConnectEvent));
    }

    @Subscribe
    public final void a(@NotNull ServerConnectedEvent serverConnectedEvent) {
        RegisteredServer registeredServer;
        Object object;
        String string;
        jv_0 jv_02 = this.d.a(serverConnectedEvent.getPlayer());
        List list = this.a.f().aj();
        if (list.contains(string = ((String)(object = (registeredServer = serverConnectedEvent.getServer()).getServerInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        object = jv_02;
        boolean bl = false;
        new gf_0(this.d, object.i(), object.a(), object.b()).run();
        ew.a(jv_02);
        Object object2 = jv_02;
        Object object3 = "litebans.exempt.dupeip_join";
        boolean bl2 = false;
        jv_0 jv_03 = object2;
        boolean bl3 = false;
        if (!jv_03.e((String)object3)) {
            object2 = this.f;
            ew.a(object);
            object3 = object;
            bl2 = false;
            ((t)object2).a(object3.i(), object3.a(), object3.b());
        }
    }

    public d1 b() {
        d1 d12;
        d1 d13 = d12 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{d13};
        d13.d.b(em_0Array);
        return d12;
    }

    private static final void a(d1 d12, ServerPreConnectEvent serverPreConnectEvent) {
        d12.c.c().b(serverPreConnectEvent);
    }

    @Override
    public em_0 a() {
        return this.b();
    }

    private static final void c() {
        e = new String[]{"litebans.exempt.dupeip_join"};
    }

    static {
        d1.c();
    }
}

