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

public final class gj
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public gj(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        Object object = new String[]{"litebans.admin", "litebans.broadcast"};
        aa_0.a((fg_0)this, object);
        if (this.d.length <= 1) {
            fg_0.a.a(hd_0.f("Usage: /litebans broadcast <message>"));
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
        dy_02.a = "broadcast";
        String string = "broadcast-type:";
        ll.a(list, arg_0 -> gj.a(string, dy_02, arg_0));
        Object object = am.a(ll.a(list, " ", null, null, 0, null, null, 62, null), true);
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
            CharSequence charSequence2 = lo_0.a(objectArray, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
            aa_0.a((ch)object4, (ij)((Object)object3), charSequence2, null, null, 12, null);
        }
        return iv_0.a;
    }

    private static final void a() {
        e = new String[]{"litebans.admin", "litebans.broadcast", "Usage: /litebans broadcast <message>", "broadcast", "broadcast-type:", " ", "\ufeff"};
    }

    static {
        gj.a();
    }
}

