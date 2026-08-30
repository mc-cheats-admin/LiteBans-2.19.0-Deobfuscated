package litebans;

import fr.xephi.authme.events.LoginEvent;
import litebans.cl_0;
import litebans.di_0;
import litebans.em_0;
import litebans.gf_0;
import litebans.hl;
import litebans.jv_0;
import litebans.q_0;
import litebans.w;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class lX
implements cl_0 {
    private final di_0 a;
    private static /* synthetic */ String[] b;

    public lX(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void a(@NotNull LoginEvent loginEvent) {
        w w2 = (w)this.a.a(w.class);
        try {
            Player player = loginEvent.getPlayer();
            if (player == null) {
                return;
            }
            Player player2 = player;
            jv_0 jv_02 = this.a.a(player2);
            String string = jv_02.i();
            String string2 = jv_02.a();
            String string3 = jv_02.b();
            new gf_0(this.a, string, string2, string3).run();
        }
        catch (Throwable throwable) {
            this.a.getLogger().severe(b[0]);
            q_0 q_02 = (q_0)this.a.a(q_0.class);
            w2.a(throwable);
            em_0[] em_0Array = new em_0[]{this};
            this.a.a(em_0Array);
            q_02.r().a(true);
        }
    }

    public lX b() {
        lX lX2;
        lX lX3 = lX2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{lX3};
        lX3.a.b(em_0Array);
        return lX2;
    }

    @Override
    public em_0 a() {
        return this.b();
    }

    private static final void a() {
        b = new String[]{hl.a("\u2ad0\u2af9\u2af6\u2afc\u2af4\u2af1\u2af6\u2aff\u2ab8\u2ad9\u2aed\u2aec\u2af0\u2ad5\u2afd\u2ab8\u2af4\u2af7\u2aff\u2af1\u2af6\u2ab8\u2afd\u2aee\u2afd\u2af6\u2aec\u2ab8\u2afe\u2af9\u2af1\u2af4\u2afd\u2afc\u2ab6\u2ab8\u2ade\u2aed\u2aea\u2aec\u2af0\u2afd\u2aea\u2ab8\u2afd\u2aee\u2afd\u2af6\u2aec\u2aeb\u2ab8\u2aef\u2af1\u2af4\u2af4\u2ab8\u2af6\u2af7\u2aec\u2ab8\u2afa\u2afd\u2ab8\u2af0\u2af9\u2af6\u2afc\u2af4\u2afd\u2afc\u2ab6", -1412552040)};
    }

    static {
        lX.a();
    }
}

