package litebans;

import java.util.Iterator;
import java.util.UUID;
import litebans.am;
import litebans.as;
import litebans.bK;
import litebans.bz;
import litebans.cM;
import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hd_0;
import litebans.hl;
import litebans.iv_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class fL
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public fL(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = fg_0.a;
        boolean bl = this.d.length < 2;
        CharSequence charSequence = hd_0.f(e[0]);
        boolean bl2 = false;
        fo_0 fo_02 = object;
        boolean bl3 = false;
        if (bl) {
            fo_0 fo_03 = fo_02;
            boolean bl4 = false;
            fo_03.a(charSequence);
            throw new as();
        }
        object = this;
        bl = false;
        ((w)((fg_0)object).h().a(w.class)).a(arg_0 -> fL.a(this, arg_0));
    }

    private final void b() {
        fo_0.a(fg_0.a, this.d(), hd_0.c(e[1]), null, 4, null);
    }

    private static final iv_0 a(fL fL2, ch ch2) {
        Iterator iterator = fg_0.a;
        boolean bl = ch2.b();
        Object object = am.aX;
        boolean bl2 = false;
        fo_0 fo_02 = iterator;
        boolean bl3 = false;
        if (bl) {
            fo_0 fo_03 = fo_02;
            boolean bl4 = false;
            fo_03.a(object);
            throw new as();
        }
        if (fL2.d.length == 2) {
            Object object2 = new char[]{','};
            iterator = bz.a((CharSequence)fL2.d[1], object2, false, 0, 6, null).iterator();
            while (iterator.hasNext()) {
                object2 = (String)iterator.next();
                Object object3 = bK.c.a((String)object2);
                if (object3 == null || (object3 = ((cM)object3).a()) == null || (object3 = ((UUID)object3).toString()) == null) continue;
                object = object3;
                ch2.a((String)object2, (String)object, (String)null, false, true);
            }
            fL2.b();
            return iv_0.a;
        }
        iterator = null;
        if (fL2.d.length >= 4) {
            iterator = fL2.d[3];
        }
        ch2.a(fL2.d[1], fL2.d[2], (String)((Object)iterator), false, true);
        fL2.b();
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{hl.a("\u0d20\u0d67\u0d6b\u0d69\u0d69\u0d65\u0d6a\u0d60\u0d24\u0d65\u0d60\u0d60\u0d29\u0d68\u0d6b\u0d63\u0d6d\u0d6a\u0d24\u0d38\u0d6a\u0d65\u0d69\u0d61\u0d3a\u0d24\u0d38\u0d51\u0d51\u0d4d\u0d40\u0d3a\u0d24\u0d38\u0d4d\u0d54\u0d3a", -1833366268), hl.a("\uc2e5\uc2c6\uc2ce\uc2c0\uc2c7\uc289\uc2db\uc2cc\uc2ca\uc2c6\uc2db\uc2cd\uc281\uc2da\uc280\uc289\uc2c8\uc2cd\uc2cd\uc2cc\uc2cd\uc287", -1483291991)};
    }

    static {
        fL.a();
    }
}

