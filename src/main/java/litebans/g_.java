package litebans;

import java.util.UUID;
import litebans.a_;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.h1;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g_
extends fg_0 {
    private final String d;
    private final String g;
    private final String f;
    private final String e;
    private static /* synthetic */ String[] h;

    public g_(@NotNull di_0 di_02, @Nullable String string, @NotNull String string2, @Nullable String string3, @Nullable String string4) {
        super(di_02);
        this.d = string;
        this.g = string2;
        this.f = string3;
        this.e = string4;
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        if (!((q_0)fg_02.h().a(q_0.class)).f().p()) {
            return;
        }
        fg_02 = this;
        bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> g_.a(this, arg_0));
    }

    private static final iv_0 a(g_ g_2, ch ch2) {
        Object object;
        String string = g_2.e;
        if (string == null) {
            Object object2;
            boolean bl;
            Object object3;
            block8: {
                fg_0 fg_02 = g_2;
                object3 = g_2.g;
                bl = false;
                for (Object object4 : (Object[])fg_02.h().q()) {
                    jv_0 jv_02 = (jv_0)object4;
                    boolean bl2 = false;
                    if (!ew.a((Object)jv_02.a(), object3)) continue;
                    object2 = object4;
                    break block8;
                }
                object2 = null;
            }
            jv_0 jv_03 = (jv_0)object2;
            string = jv_03 != null ? jv_03.h() : null;
            if (string == null) {
                fg_0 fg_03 = g_2;
                boolean bl3 = false;
                object3 = fg_03;
                bl = false;
                string = ((q_0)((fg_0)object3).h().a(q_0.class)).f().aw();
            }
        }
        String string2 = h1.a(string, 32);
        dZ dZ2 = null;
        dZ2 = kR.a(ch2, g_2.g, g_2.f, a_.j, string2, false, false, 48, null);
        if (dZ2 == null && g_2.d != null) {
            object = g_2;
            boolean bl = false;
            if (((q_0)((fg_0)object).h().a(q_0.class)).f().a6()) {
                dZ2 = ch2.a(g_2.d, g_2.g, string2, a_.j);
            }
        }
        object = g_2;
        int n = 0;
        object = (q_0)((fg_0)object).h().a(q_0.class);
        n = 3;
        boolean bl = false;
        if (((q_0)object).a(n)) {
            Object object5 = object;
            boolean bl4 = false;
            ((q_0)object5).a((Object)("Active mute for " + g_2.g + " on server " + string2 + ": " + dZ2));
        }
        if (dZ2 != null) {
            object = g_2;
            n = 0;
            ((p)((fg_0)object).h().a(p.class)).a(g_2.g, dZ2);
        } else {
            object = g_2;
            n = 0;
            ((p)((fg_0)object).h().a(p.class)).a().b().remove(UUID.fromString(g_2.g));
        }
        return iv_0.a;
    }

    private static final void a() {
        h = new String[]{"Active mute for ", " on server ", ": "};
    }

    static {
        g_.a();
    }
}

