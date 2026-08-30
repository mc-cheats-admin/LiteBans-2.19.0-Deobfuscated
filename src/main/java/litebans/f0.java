package litebans;

import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.iv_0;
import litebans.kL;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class f0
extends fg_0 {
    private static /* synthetic */ String[] d;

    public f0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void run() {
        fg_0 fg_02 = this;
        boolean bl = false;
        fo_0 fo_02 = fg_0.a;
        boolean bl2 = fg_02.d().f();
        CharSequence charSequence = am.b;
        boolean bl3 = false;
        fo_0 fo_03 = fo_02;
        boolean bl4 = !bl2;
        boolean bl5 = false;
        if (bl4) {
            fo_0 fo_04 = fo_03;
            boolean bl6 = false;
            fo_04.a(charSequence);
            throw new as();
        }
        fg_02 = this;
        bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> f0.a(this, arg_0));
    }

    private static final iv_0 a(f0 f02, ch ch2) {
        Object object = fg_0.a;
        boolean bl = ch2.b();
        Object object2 = am.aX;
        boolean bl2 = false;
        Object object3 = object;
        boolean bl3 = false;
        if (bl) {
            fo_0 fo_02 = object3;
            boolean bl4 = false;
            fo_02.a(object2);
            throw new as();
        }
        object = kL.d.a();
        bl = false;
        object2 = object.iterator();
        while (object2.hasNext()) {
            Object e = object2.next();
            object3 = (kL)e;
            bl3 = false;
            ch2.a((kL)object3);
        }
        aa_0.a((fg_0)f02, (CharSequence)h1.a(hd_0.u, "All templates have been reset "));
        return iv_0.a;
    }

    private static final void a() {
        d = new String[]{"All templates have been reset successfully."};
    }

    static {
        f0.a();
    }
}

