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

public final class fu_0
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public fu_0(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{"litebans.admin", "litebans.reveal"};
        aa_0.a((fg_0)this, (String[])object);
        if (ew.a((Object)this.d[1], (Object)"seed") && this.d().f()) {
            object = this;
            boolean bl = false;
            fg_0.a.a(hd_0.c(String.valueOf(((q_0)((fg_0)object).h().a(q_0.class)).f().aD())));
            throw new as();
        }
        Object object2 = this;
        int n = 0;
        object = ((q_0)((fg_0)object2).h().a(q_0.class)).k();
        if (ew.a((Object)this.d[1], (Object)"web") && this.d().f()) {
            object2 = new StringBuilder();
            for (n = 0; n < 1000; ++n) {
                ((StringBuilder)object2).append((String)((lE)object).a().get(n));
            }
            fg_0.a.a(hd_0.c("" + ((lE)object).b() + ':' + object2));
            throw new as();
        }
        long l3 = ((lE)object).b(this.d[1]);
        if (l3 == -1L) {
            fg_0.a.a(hd_0.f("Invalid "));
            throw new as();
        }
        fo_0.a(fg_0.a, this.d(), hd_0.c(String.valueOf(l3)), null, 4, null);
    }

    private static final void a() {
        e = new String[]{"litebans.admin", "litebans.reveal", "seed", "web", "Invalid ID."};
    }

    static {
        fu_0.a();
    }
}

