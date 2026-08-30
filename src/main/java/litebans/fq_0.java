package litebans;

import litebans.aR;
import litebans.aa_0;
import litebans.ch;
import litebans.di_0;
import litebans.eS;
import litebans.fg_0;
import litebans.hd_0;
import litebans.hl;
import litebans.ij;
import litebans.iv_0;
import litebans.kL;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class fq_0
extends fg_0 {
    private static /* synthetic */ String[] d;

    public fq_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> fq_0.a(this, arg_0));
    }

    private static final iv_0 a(fq_0 fq_02, ch ch2) {
        ch2.d().d(true);
        Object object = kL.i;
        boolean bl = false;
        eS.d(ch2.c(aR.d(aR.c(aR.e("UPDATE " + object), "accept=1"))));
        aa_0.a((fg_0)fq_02, (CharSequence)hd_0.c("Disclaimer accepted!"));
        object = (u)ch2.e().a(u.class);
        u.a((u)object, ij.a, ch2, null, 0, 12, null);
        return iv_0.a;
    }

    private static final void a() {
        d = new String[]{"UPDATE ", "accept=1", "Disclaimer accepted!"};
    }

    static {
        fq_0.a();
    }
}

