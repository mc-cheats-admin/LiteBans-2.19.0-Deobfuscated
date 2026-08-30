package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import litebans.bz;
import litebans.dZ;
import litebans.di_0;
import litebans.eO;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gP;
import litebans.h1;
import litebans.hN;
import litebans.hl;
import litebans.il_0;
import litebans.jv_0;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f8
extends fg_0 {
    public static final eO e;
    private ConcurrentHashMap d = new ConcurrentHashMap();
    private static /* synthetic */ String[] f;

    public f8(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final ConcurrentHashMap b() {
        return this.d;
    }

    public final void a(@NotNull ConcurrentHashMap concurrentHashMap) {
        this.d = concurrentHashMap;
    }

    public final void a(@NotNull Object object, @NotNull String string, @NotNull jv_0 jv_02, boolean bl) {
        boolean bl2;
        boolean bl3;
        UUID uUID = jv_02.d();
        Object object2 = this;
        boolean bl4 = false;
        String string2 = ((q_0)((fg_0)object2).h().a(q_0.class)).a(jv_02, object);
        Object object3 = this;
        int n = 0;
        p p2 = (p)((fg_0)object3).h().a(p.class);
        String string3 = jv_02.h();
        if (string3 == null) {
            fg_0 fg_02 = this;
            bl3 = false;
            string3 = ((w)fg_02.h().a(w.class)).u();
        }
        object2 = p2.a(uUID, string2, string3);
        object3 = this;
        n = 0;
        object3 = (q_0)((fg_0)object3).h().a(q_0.class);
        n = 100;
        bl3 = false;
        if (((q_0)object3).a(n)) {
            Object object4 = object3;
            bl2 = false;
            ((q_0)object4).a((Object)("[+] Mute for " + jv_02.i() + " is " + object2));
        }
        if (object2 == null) {
            return;
        }
        if (bl || ((CharSequence)string).length() == 0 || string.charAt(0) != '/') {
            this.a(object, jv_02, string, (dZ)object2);
        } else {
            boolean bl5;
            Object object5;
            Object object6;
            block11: {
                object6 = new char[]{' '};
                object3 = (String)bz.a((CharSequence)string, object6, false, 0, 6, null).get(0);
                object5 = this;
                bl2 = false;
                object6 = ((q_0)((fg_0)object5).h().a(q_0.class)).f();
                object5 = null;
                Object object7 = string;
                object5 = ((String)object7).toLowerCase(Locale.ROOT);
                if (h1.a((CharSequence)object5)) {
                    object5 = h1.b((CharSequence)object5);
                }
                if (bz.c((CharSequence)object3, ':', false, 2, null) && object6.aI()) {
                    object5 = this.a((String)object5);
                }
                object7 = object6.ae();
                boolean bl6 = false;
                if (object7 instanceof Collection && ((Collection)object7).isEmpty()) {
                    bl5 = false;
                } else {
                    Iterator iterator = object7.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        String string4 = (String)t2;
                        boolean bl7 = false;
                        if (!bz.b((String)object5, string4, false, 2, null)) continue;
                        bl5 = true;
                        break block11;
                    }
                    bl5 = false;
                }
            }
            if (bl5 || object6.aC().contains(object5)) {
                this.a(object, jv_02, string, (dZ)object2);
            }
        }
    }

    public static /* synthetic */ void a(f8 f82, Object object, String string, jv_0 jv_02, boolean bl, int n, Object object2) {
        if ((n & 8) != 0) {
            bl = false;
        }
        f82.a(object, string, jv_02, bl);
    }

    private final String a(String string) {
        CharSequence charSequence = string;
        hN hN2 = new hN("^/[^ ]+:");
        String string2 = "/";
        return hN2.a(charSequence, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(@NotNull Object object, @NotNull jv_0 jv_02, @Nullable String string, @Nullable dZ dZ2) {
        il_0.a(this.h().i(), object, null, null, false, null, 30, null);
        if (dZ2 != null) {
            Object object2 = this;
            boolean bl = false;
            object2 = (p)((fg_0)object2).h().a(p.class);
            bl = false;
            fo_0 fo_02 = fg_0.a;
            jv_0 jv_03 = jv_02;
            boolean bl2 = false;
            try {
                fo_02.b().set(jv_03);
                boolean bl3 = false;
                di_0 di_02 = ((p)object2).a;
                CharSequence charSequence = string;
                ew.a(charSequence);
                new gP(di_02, dZ2, charSequence).run();
            }
            finally {
                fo_02.b().remove();
            }
        }
    }

    static {
        f8.a();
        e = new eO(null);
    }

    private static final void a() {
        f = new String[]{"test", "[+] Mute for ", " is ", "^/[^ ]+:", "/"};
    }
}

