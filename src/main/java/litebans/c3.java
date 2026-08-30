package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.hl;
import litebans.jr_0;
import litebans.kL;
import litebans.w;

static final class c3
implements eo_0 {
    final /* synthetic */ jr_0 b;
    private static /* synthetic */ String[] a;

    c3(jr_0 jr_02) {
        this.b = jr_02;
    }

    public final String a(kL kL2) {
        Object object = kL2;
        boolean bl = false;
        String string = aR.e(a[0] + object);
        object = this.b;
        String string2 = a[1];
        int n = 32;
        String string3 = a[2];
        String string4 = ((jr_0)object).b().c();
        boolean bl2 = false;
        return aR.f(string, w.v.b(((jr_0)object).b().a()) ? string2 + a[3] + n + ')' + string4 + string3 : string2 + a[4] + n + ')' + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        a = new String[]{hl.a("\u8ca1\u8cac\u8cb4\u8ca5\u8cb2\u8cc0\u8cb4\u8ca1\u8ca2\u8cac\u8ca5\u8cc0", -1118466848), hl.a("\u4472\u4464\u4473\u4477\u4464\u4473\u445e\u446e\u4473\u4468\u4466\u4468\u446f", 1398555649), hl.a("", 1531053427), hl.a("\u82df\u82a9\u82be\u82ad\u82bc\u82b7\u82be\u82ad\u82d7", -758742273), hl.a("\u8437\u8441\u8456\u8445\u8454\u845f\u8456\u8445\u843f", 643531799)};
    }

    static {
        c3.a();
    }
}

