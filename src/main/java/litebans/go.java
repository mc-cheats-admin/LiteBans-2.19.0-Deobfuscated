package litebans;

import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hd_0;
import litebans.hl;
import litebans.iA;
import litebans.iv_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class go
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public go(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{"litebans.admin", "litebans.unlink"};
        aa_0.a((fg_0)this, (String[])object);
        object = this;
        boolean bl = false;
        ((w)((fg_0)object).h().a(w.class)).a(arg_0 -> go.a(this, arg_0));
    }

    private static final iv_0 a(go go2, ch ch2) {
        Object object = fg_0.a;
        boolean bl = ch2.b();
        CharSequence charSequence = am.aX;
        boolean bl2 = false;
        fo_0 fo_02 = object;
        boolean bl3 = false;
        if (bl) {
            fo_0 fo_03 = fo_02;
            boolean bl4 = false;
            fo_03.a(charSequence);
            throw new as();
        }
        object = go2.d[1];
        iA iA2 = ch2.c((String)object);
        if (iA2 == null) {
            fg_0.a.a(am.aN);
            throw new as();
        }
        iA iA3 = iA2;
        ch2.a(iA3);
        aa_0.a((fg_0)go2, (CharSequence)(hd_0.c("Player ") + hd_0.g(iA3.a()) + hd_0.c(" has been unlinked ")));
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{"litebans.admin", "litebans.unlink", "Player ", " has been unlinked successfully."};
    }

    static {
        go.a();
    }
}

