package litebans;

import litebans.aK;
import litebans.am;
import litebans.bF;
import litebans.cz;
import litebans.ew;
import litebans.fa_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.ij;
import litebans.jv_0;
import litebans.u;

public final class ka
implements fa_0 {
    final /* synthetic */ cz d;
    final /* synthetic */ u g;
    final /* synthetic */ jv_0 f;
    private static /* synthetic */ String[] e;

    ka(cz cz2, u u2, jv_0 jv_02) {
        this.d = cz2;
        this.g = u2;
        this.f = jv_02;
    }

    @Override
    public boolean a(aK aK2, ij ij2, String string) {
        if (ij2 == ij.g && ew.a((Object)string, (Object)this.d.s()) && this.g.b(this)) {
            fo_0.a(fg_0.a, this.f, bF.a((CharSequence)am.cs.a("player", (Object)this.d.s()), (CharSequence)"executor", (Object)this.d.H()), null, 4, null);
        }
        return true;
    }

    private static final void a() {
        e = new String[]{"player", "executor"};
    }

    static {
        ka.a();
    }
}

