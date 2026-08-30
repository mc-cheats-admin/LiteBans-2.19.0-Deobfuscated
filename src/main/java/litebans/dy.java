package litebans;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import litebans.a_;
import litebans.am;
import litebans.ao_0;
import litebans.bF;
import litebans.ch;
import litebans.cl_0;
import litebans.dZ;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.ew;
import litebans.hl;
import litebans.hv_0;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class dy
implements cl_0 {
    private final di_0 b;
    private static /* synthetic */ String[] a;

    public dy(@NotNull di_0 di_02) {
        this.b = di_02;
    }

    @EventHandler
    public final void a(@NotNull PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        w w2 = (w)this.b.a(w.class);
        o o2 = (o)this.b.a(o.class);
        q_0 q_02 = (q_0)this.b.a(q_0.class);
        ec_0 ec_02 = this.b.i();
        ew.b(ec_02, a[0]);
        String string = ((ao_0)ec_02).b(player);
        Serializable serializable = player.getAddress();
        String string2 = serializable != null && (serializable = ((InetSocketAddress)serializable).getAddress()) != null ? ((InetAddress)serializable).getHostAddress() : null;
        String string3 = player.getUniqueId().toString();
        hv_0 hv_02 = new hv_0();
        w2.a(arg_0 -> dy.a(player, string3, string2, q_02, o2, string, this, hv_02, w2, arg_0));
        o2.a(string, string2, string3, w2.u(), hv_02.a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(ch ch2, jv_0 jv_02, String string, String string2, String string3, dZ dZ2, o o2, q_0 q_02, ch ch3) {
        try {
            if (q_02.f().aM()) {
                CharSequence charSequence = ch2.a(kR.a(ch2, (CharSequence)am.h, dZ2, false, 2, null), jv_02);
                o2.b(string, charSequence, true);
            }
        }
        finally {
            dZ dZ3 = dZ2;
            ew.a(dZ3);
            o2.a(jv_02, bF.a(ch2, dZ3, string2, string, string3, null, -1));
        }
    }

    @Override
    public dy a() {
        dy dy2;
        dy dy3 = dy2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{dy3};
        dy3.b.b(em_0Array);
        return dy2;
    }

    private static final iv_0 a(Player player, String string, String string2, q_0 q_02, o o2, String string3, dy dy2, hv_0 hv_02, w w2, ch ch2) {
        dZ dZ2;
        ch ch3 = ch2;
        jv_0 jv_02 = ch2.e().a(player);
        dZ dZ3 = kR.a(ch2, string, string2, a_.h, false, false, 24, null);
        if (q_02.a(4)) {
            q_02.a((Object)(a[1] + dZ3 + a[2] + (dZ3 != null) + ')'));
        }
        if (dZ3 != null) {
            if (o2.a(dZ3, string3)) {
                return iv_0.a;
            }
            ew.a(jv_02);
            ew.a(o2);
            ew.a(q_02);
            dy2.a(ch2, jv_02, string, string3, string2, dZ3, o2, q_02, ch3);
            hv_02.a = true;
        }
        if (!hv_02.a && q_02.f().a6() && (dZ2 = kR.a(ch2, string3, string, w2.u(), null, 8, null)) != null) {
            ew.a(jv_02);
            ew.a(o2);
            ew.a(q_02);
            dy2.a(ch2, jv_02, string, string3, string2, dZ2, o2, q_02, ch3);
            hv_02.a = true;
        }
        return iv_0.a;
    }

    @Override
    public em_0 a() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{hl.a("", 492834520), hl.a("\u0ccb\u0ce8\u0ce7\u0cb3\u0ca9", 894176393), hl.a("\u92e7\u92ef\u92b1\u92a6\u92ab\u92ae\u92a3\u92fd\u92e7", -1373924665)};
    }

    static {
        dy.b();
    }
}

