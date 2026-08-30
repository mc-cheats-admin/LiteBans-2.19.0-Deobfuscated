package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.ao_0;
import litebans.bz;
import litebans.cl_0;
import litebans.dZ;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.ew;
import litebans.f8;
import litebans.h1;
import litebans.hN;
import litebans.hl;
import litebans.jv_0;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class hE
implements cl_0 {
    private final di_0 d;
    private final q_0 e;
    private final p c;
    private final w b;
    private static /* synthetic */ String[] a;

    public hE(@NotNull di_0 di_02) {
        this.d = di_02;
        this.e = (q_0)this.d.a(q_0.class);
        this.c = (p)this.d.a(p.class);
        this.b = (w)this.d.a(w.class);
    }

    public final di_0 c() {
        return this.d;
    }

    public final q_0 b() {
        return this.e;
    }

    public final p f() {
        return this.c;
    }

    public final w e() {
        return this.b;
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void a(@NotNull AsyncPlayerChatEvent asyncPlayerChatEvent) {
        try {
            jv_0 jv_02 = this.d.a(asyncPlayerChatEvent.getPlayer());
            ew.a(jv_02);
            String string = this.e.a(jv_02, (Object)asyncPlayerChatEvent);
            dZ dZ2 = this.c.a(jv_02.d(), string, this.b.u());
            if (dZ2 != null) {
                this.a(asyncPlayerChatEvent, jv_02, dZ2);
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            di_0 di_02 = this.d;
            boolean bl = false;
            di_0 di_03 = di_02;
            boolean bl2 = false;
            if (!di_03.isEnabled() || di_02.s()) {
                q_0.a(this.e, nullPointerException, 0, 2, null);
            }
            throw nullPointerException;
        }
    }

    @EventHandler(priority=EventPriority.LOW, ignoreCancelled=true)
    public final void a(@NotNull PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        jv_0 jv_02 = this.d.a(playerCommandPreprocessEvent.getPlayer());
        ew.a(jv_02);
        String string = this.e.a(jv_02, (Object)playerCommandPreprocessEvent);
        dZ dZ2 = this.c.a(jv_02.d(), string, this.b.u());
        if (dZ2 != null) {
            boolean bl;
            String string2;
            Object object;
            block7: {
                Object object2;
                Object object3;
                object = new char[]{' '};
                String string3 = (String)bz.a((CharSequence)playerCommandPreprocessEvent.getMessage(), object, false, 0, 6, null).get(0);
                object = this.e.f();
                string2 = null;
                string2 = playerCommandPreprocessEvent.getMessage();
                if (h1.a((CharSequence)string2)) {
                    string2 = h1.b(string2);
                }
                if (bz.c((CharSequence)string3, ':', false, 2, null) && object.aI()) {
                    object3 = string2;
                    object2 = new hN(a[0]);
                    String string4 = a[1];
                    string2 = ((hN)object2).a((CharSequence)object3, string4);
                }
                object3 = object.ae();
                object2 = (Iterable)object3;
                boolean bl2 = false;
                if (object2 instanceof Collection && ((Collection)object2).isEmpty()) {
                    bl = false;
                } else {
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        String string5 = (String)t2;
                        boolean bl3 = false;
                        if (!bz.c(string2, string5, true)) continue;
                        bl = true;
                        break block7;
                    }
                    bl = false;
                }
            }
            if (bl || object.aC().contains(string2)) {
                this.a(playerCommandPreprocessEvent, jv_02, dZ2);
                return;
            }
        }
    }

    private final void a(Object object, jv_0 jv_02, dZ dZ2) {
        f8 f82 = this.c.a();
        ec_0 ec_02 = this.d.i();
        ew.b(ec_02, a[2]);
        f82.a(object, jv_02, ((ao_0)ec_02).c(object), dZ2);
    }

    static /* synthetic */ void a(hE hE2, Object object, jv_0 jv_02, dZ dZ2, int n, Object object2) {
        if ((n & 4) != 0) {
            dZ2 = null;
        }
        hE2.a(object, jv_02, dZ2);
    }

    @Override
    public hE a() {
        hE hE2;
        hE hE3 = hE2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{hE3};
        hE3.d.b(em_0Array);
        return hE2;
    }

    @Override
    public em_0 a() {
        return this.a();
    }

    private static final void d() {
        a = new String[]{hl.a("\ud0fb\ud08a\ud0fe\ud0fb\ud085\ud0f8\ud08e\ud09f", -193343323), hl.a("\u6a2b", -1967232508), hl.a("", -1427657590)};
    }

    static {
        hE.d();
    }
}

