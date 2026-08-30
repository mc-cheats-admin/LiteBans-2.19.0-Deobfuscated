package litebans;

import litebans.ai_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.ew;
import litebans.hl;
import litebans.k1;
import litebans.l_0;
import litebans.ly_0;
import litebans.q_0;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

@ai_0(a=1)
public final class M
extends l_0
implements ly_0 {
    private static /* synthetic */ String[] b;

    public M(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        em_0[] em_0Array = new em_0[]{this};
        this.a.a(em_0Array);
    }

    @Override
    public void e() {
        if (!(this.a.t() == 1)) {
            String string = "Failed ";
            throw new IllegalArgumentException(string.toString());
        }
        this.a.a(this);
        this.e();
    }

    @EventHandler
    public final void a(@NotNull PlayerDisconnectEvent playerDisconnectEvent) {
        this.a.b(playerDisconnectEvent.getPlayer());
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        int n = q_02.m();
        ec_0 ec_02 = this.a.i();
        ew.b(ec_02, "");
        int n2 = ((k1)ec_02).c();
        q_02.b(Math.max(n, n2));
    }

    public M e() {
        M m;
        M m2 = m = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{m2};
        m2.a.b(em_0Array);
        return m;
    }

    @Override
    public em_0 a() {
        return this.e();
    }

    private static final void d() {
        b = new String[]{"Failed ", ""};
    }

    static {
        M.d();
    }
}

