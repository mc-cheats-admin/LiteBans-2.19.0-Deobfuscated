package litebans;

import java.util.List;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.bz;
import litebans.ch;
import litebans.di_0;
import litebans.dy_0;
import litebans.fg_0;
import litebans.hd_0;
import litebans.hl;
import litebans.iF;
import litebans.ij;
import litebans.iv_0;
import litebans.ll;
import litebans.lo_0;
import litebans.o;
import litebans.u;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class gj
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public gj(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{e[0], e[1]};
        aa_0.a((fg_0)this, object);
        if (this.d.length <= 1) {
            fg_0.a.a(hd_0.f(e[2]));
            throw new as();
        }
        object = lo_0.d(this.d);
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> gj.a((List)object, this, arg_0));
    }

    private static final boolean a(String string, dy_0 dy_02, String string2) {
        boolean bl;
        if (bz.b(string2, string, false, 2, null)) {
            dy_02.a = string2.substring(string.length());
            bl = false;
        } else {
            bl = true;
        }
        return bl;
    }

    private static final iv_0 a(List list, gj gj2, ch ch2) {
        dy_0 dy_02 = new dy_0();
        dy_02.a = e[3];
        String string = e[4];
        ll.a(list, arg_0 -> gj.a(string, dy_02, arg_0));
        Object object = am.a(ll.a(list, e[5], null, null, 0, null, null, 62, null), true);
        int n = 10;
        CharSequence charSequence = ch2.a((CharSequence)((String)object).substring(n));
        object = gj2;
        n = 0;
        Object object2 = (o)((fg_0)object).h().a(o.class);
        boolean bl = false;
        o.a(object2, ch2, charSequence, (String)dy_02.a, null, gj2.d().h(), false, false, gj2.d(), 52, null);
        object = ch2;
        object2 = ij.c;
        bl = false;
        if (object.d().s()) {
            Object object3 = object2;
            Object object4 = object;
            boolean bl2 = false;
            iF iF2 = u.j;
            Object[] objectArray = new CharSequence[]{dy_02.a, charSequence};
            boolean bl3 = false;
            CharSequence charSequence2 = lo_0.a(objectArray, (CharSequence)e[6], null, null, 0, null, null, 62, null);
            aa_0.a((ch)object4, (ij)((Object)object3), charSequence2, null, null, 12, null);
        }
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{hl.a("\u6f5b\u6f5e\u6f43\u6f52\u6f55\u6f56\u6f59\u6f44\u6f19\u6f56\u6f53\u6f5a\u6f5e\u6f59", 788754231), hl.a("\ub888\ub88d\ub890\ub881\ub886\ub885\ub88a\ub897\ub8ca\ub886\ub896\ub88b\ub885\ub880\ub887\ub885\ub897\ub890", -2078361372), hl.a("\u824b\u826d\u827f\u8279\u827b\u8224\u823e\u8231\u8272\u8277\u826a\u827b\u827c\u827f\u8270\u826d\u823e\u827c\u826c\u8271\u827f\u827a\u827d\u827f\u826d\u826a\u823e\u8222\u8273\u827b\u826d\u826d\u827f\u8279\u827b\u8220", 962036254), hl.a("\u035a\u034a\u0357\u0359\u035c\u035b\u0359\u034b\u034c", -2040200392), hl.a("\ua3b5\ua3a5\ua3b8\ua3b6\ua3b3\ua3b4\ua3b6\ua3a4\ua3a3\ua3fa\ua3a3\ua3ae\ua3a7\ua3b2\ua3ed", 364946391), hl.a("\u29e4", -1017959996), hl.a("\ua48a", 1575180917)};
    }

    static {
        gj.a();
    }
}

