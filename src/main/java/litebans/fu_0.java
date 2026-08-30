package litebans;

import litebans.aa_0;
import litebans.as;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hd_0;
import litebans.hl;
import litebans.lE;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.fU
 */
public static final class fu_0
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public fu_0(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{e[0], e[1]};
        aa_0.a((fg_0)this, (String[])object);
        if (ew.a((Object)this.d[1], (Object)e[2]) && this.d().f()) {
            object = this;
            boolean bl = false;
            fg_0.a.a(hd_0.c(String.valueOf(((q_0)((fg_0)object).h().a(q_0.class)).f().aD())));
            throw new as();
        }
        Object object2 = this;
        int n = 0;
        object = ((q_0)((fg_0)object2).h().a(q_0.class)).k();
        if (ew.a((Object)this.d[1], (Object)e[3]) && this.d().f()) {
            object2 = new StringBuilder();
            for (n = 0; n < 1000; ++n) {
                ((StringBuilder)object2).append((String)((lE)object).a().get(n));
            }
            fg_0.a.a(hd_0.c("" + ((lE)object).b() + ':' + object2));
            throw new as();
        }
        long l3 = ((lE)object).b(this.d[1]);
        if (l3 == -1L) {
            fg_0.a.a(hd_0.f(e[4]));
            throw new as();
        }
        fo_0.a(fg_0.a, this.d(), hd_0.c(String.valueOf(l3)), null, 4, null);
    }

    private static final void a() {
        e = new String[]{hl.a("\uc4bf\uc4ba\uc4a7\uc4b6\uc4b1\uc4b2\uc4bd\uc4a0\uc4fd\uc4b2\uc4b7\uc4be\uc4ba\uc4bd", 563856595), hl.a("\u0932\u0937\u092a\u093b\u093c\u093f\u0930\u092d\u0970\u092c\u093b\u0928\u093b\u093f\u0932", -2039740066), hl.a("\u2f11\u2f07\u2f07\u2f06", 2134323042), hl.a("\u653d\u652f\u6528", -510958262), hl.a("\uced4\ucef3\uceeb\ucefc\ucef1\ucef4\ucef9\ucebd\uced4\uced9\uceb3", 300207773)};
    }

    static {
        fu_0.a();
    }
}

