package litebans;

import litebans.cl_0;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.fg_0;
import litebans.gG;
import litebans.hl;
import litebans.il_0;
import litebans.jv_0;
import litebans.o;
import litebans.w;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.jetbrains.annotations.NotNull;

public final class ad_0
implements cl_0 {
    private final di_0 a;
    private final o c;
    private static /* synthetic */ String[] b;

    public ad_0(@NotNull di_0 di_02) {
        this.a = di_02;
        this.c = (o)this.a.a(o.class);
    }

    public final di_0 a() {
        return this.a;
    }

    public final o c() {
        return this.c;
    }

    @EventHandler(priority=EventPriority.LOW)
    public final void a(@NotNull PlayerLoginEvent playerLoginEvent) {
        gG gG2 = this.c.e();
        if (playerLoginEvent.getResult() != PlayerLoginEvent.Result.ALLOWED || gG2 == null) {
            return;
        }
        gG gG3 = gG2;
        boolean bl = false;
        jv_0 jv_02 = gG3.h().a(playerLoginEvent.getPlayer());
        ew.a(jv_02);
        Object object = jv_02;
        Object object2 = "litebans.lockdown.bypass";
        boolean bl2 = false;
        jv_0 jv_03 = object;
        boolean bl3 = false;
        if (!jv_03.e((String)object2)) {
            object2 = gG3;
            bl2 = false;
            object = gG2.a(((w)((fg_0)object2).h().a(w.class)).u(), false);
            il_0.a(gG3.h().i(), playerLoginEvent, (CharSequence)object, null, false, "KICK_OTHER", 12, null);
        }
    }

    public ad_0 d() {
        ad_0 ad_02;
        ad_0 ad_03 = ad_02 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{ad_03};
        ad_03.a.b(em_0Array);
        return ad_02;
    }

    @Override
    public em_0 a() {
        return this.d();
    }

    private static final void b() {
        b = new String[]{"litebans.lockdown.bypass", "KICK_OTHER"};
    }

    static {
        ad_0.b();
    }
}

