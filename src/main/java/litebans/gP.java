package litebans;

import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.bF;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.fg_0;
import litebans.hl;
import litebans.ij;
import litebans.iv_0;
import litebans.o;
import litebans.q_0;
import litebans.v;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class gP
extends fg_0 {
    private final dZ f;
    private final CharSequence d;
    private static /* synthetic */ String[] e;

    public gP(@NotNull di_0 di_02, @NotNull dZ dZ2, @NotNull CharSequence charSequence) {
        super(di_02);
        this.f = dZ2;
        this.d = charSequence;
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        if (!((q_0)fg_02.h().a(q_0.class)).f().B()) {
            return;
        }
        fg_02 = this;
        bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> gP.a(this, arg_0));
    }

    private final am b() {
        return this.f.y() ? am.bj : am.ak;
    }

    private static final iv_0 a(gP gP2, ch ch2) {
        v v2 = (v)ch2.e().a(v.class);
        CharSequence charSequence = bF.a(ch2, gP2.f, 0, 0, 6, null);
        if (charSequence == null) {
            charSequence = gP2.b();
        }
        CharSequence charSequence2 = charSequence;
        aa_0.a((fg_0)gP2, (CharSequence)bF.a(ch2, gP2.f, gP2.d(), charSequence2, 0L, 8, null));
        if (!v2.a((byte)1, gP2.d().a())) {
            Object object = gP2;
            boolean bl = false;
            if (((q_0)((fg_0)object).h().a(q_0.class)).f().c()) {
                fg_0 fg_02 = gP2;
                boolean bl2 = false;
                fg_0 fg_03 = fg_02;
                boolean bl3 = false;
                object = bF.a(ch2, gP2.f, gP2.d(), (CharSequence)bF.a((CharSequence)am.bP.a("mutedPlayer", (Object)(((q_0)fg_03.h().a(q_0.class)).f().bh() ? gP2.d().g() : gP2.d().i())), (CharSequence)"message", gP2.d), 0L, 8, null);
                fg_0 fg_04 = gP2;
                boolean bl4 = false;
                o o2 = (o)fg_04.h().a(o.class);
                bl2 = false;
                o.a(o2, ch2, (CharSequence)object, "mute", a_.j, gP2.f.j(), false, false, null, 112, null);
                aa_0.a(ch2, ij.q, (CharSequence)object, null, null, 12, null);
            }
        }
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{"mutedPlayer", "message", "mute"};
    }

    static {
        gP.a();
    }
}

