package litebans;

import litebans.aa_0;
import litebans.ch;
import litebans.di_0;
import litebans.fg_0;
import litebans.hl;
import litebans.ij;
import litebans.iv_0;
import litebans.jj_0;
import litebans.lo_0;
import litebans.o;
import litebans.u;
import litebans.v;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class gl
extends fg_0 {
    private final String e;
    private final CharSequence g;
    private final boolean d;
    private static /* synthetic */ String[] f;

    public gl(@NotNull di_0 di_02, @NotNull String string, @NotNull CharSequence charSequence, boolean bl) {
        super(di_02);
        this.e = string;
        this.g = charSequence;
        this.d = bl;
    }

    @Override
    public void run() {
        v v2 = (v)this.h().a(v.class);
        if (!v2.a((byte)2, jj_0.f(this.e))) {
            fg_0 fg_02 = this;
            boolean bl = false;
            ((w)fg_02.h().a(w.class)).a(arg_0 -> gl.a(this, arg_0));
        }
    }

    private static final iv_0 a(gl gl2, ch ch2) {
        Object object = gl2;
        boolean bl = false;
        Object[] objectArray = (Object[])((fg_0)object).h().a(o.class);
        boolean bl2 = false;
        o.a((o)objectArray, ch2, gl2.g, f[0], null, null, false, false, null, 124, null);
        if (gl2.d && ch2.d().s()) {
            object = u.j;
            objectArray = new CharSequence[]{gl2.e, gl2.g};
            bl2 = false;
            aa_0.a(ch2, ij.i, lo_0.a(objectArray, (CharSequence)f[1], null, null, 0, null, null, 62, null), null, null, 12, null);
        }
        return iv_0.a;
    }

    private static final void a() {
        f = new String[]{hl.a("\u775d\u775e\u7751\u7751\u775a\u775b\u7760\u7755\u7750\u7756\u7751", -1906149569), hl.a("\u5925", 2074716122)};
    }

    static {
        gl.a();
    }
}

