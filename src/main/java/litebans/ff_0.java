package litebans;

import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.iX;
import litebans.iv_0;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class ff_0
extends fg_0 {
    public ff_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> ff_0.a(this, arg_0));
    }

    private static final iv_0 a(ff_0 ff_02, ch ch2) {
        fg_0 fg_02 = ff_02;
        boolean bl = false;
        p p2 = (p)fg_02.h().a(p.class);
        boolean bl2 = false;
        Object object = ch2.d();
        long l3 = w.a(ch2.d(), false, 1, null);
        int n = 21600000 + new iX(0L, 1, null).a(32400000);
        boolean bl3 = false;
        ((w)object).a(l3 + (long)n);
        object = ff_02;
        boolean bl4 = false;
        if (((q_0)((fg_0)object).h().a(q_0.class)).f().p()) {
            p2.a(ch2);
        }
        return iv_0.a;
    }
}

