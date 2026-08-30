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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ai_0(a=1)
public static final class M
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
            String string = b[0];
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
        ew.b(ec_02, b[1]);
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
        b = new String[]{hl.a("\u07b6\u0791\u0799\u079c\u0795\u0794\u07d0\u0782\u0795\u0781\u0785\u0799\u0782\u0795\u079d\u0795\u079e\u0784\u07de", -362084368), hl.a("", -994230314)};
    }

    static {
        M.d();
    }
}

