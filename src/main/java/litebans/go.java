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

public static final class go
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public go(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{e[0], e[1]};
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
        aa_0.a((fg_0)go2, (CharSequence)(hd_0.c(e[2]) + hd_0.g(iA3.a()) + hd_0.c(e[3])));
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{hl.a("\u2b35\u2b30\u2b2d\u2b3c\u2b3b\u2b38\u2b37\u2b2a\u2b77\u2b38\u2b3d\u2b34\u2b30\u2b37", 1598827353), hl.a("\ua7cd\ua7c8\ua7d5\ua7c4\ua7c3\ua7c0\ua7cf\ua7d2\ua78f\ua7d4\ua7cf\ua7cd\ua7c8\ua7cf\ua7ca", 1994827681), hl.a("\u7878\u7844\u7849\u7851\u784d\u785a\u7808", 822769704), hl.a("\uac95\uacdd\uacd4\uacc6\uac95\uacd7\uacd0\uacd0\uacdb\uac95\uacc0\uacdb\uacd9\uacdc\uacdb\uacde\uacd0\uacd1\uac95\uacc6\uacc0\uacd6\uacd6\uacd0\uacc6\uacc6\uacd3\uacc0\uacd9\uacd9\uaccc\uac9b", 2147069109)};
    }

    static {
        go.a();
    }
}

