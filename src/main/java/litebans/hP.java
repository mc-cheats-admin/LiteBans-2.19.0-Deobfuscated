package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.jr_0;
import litebans.kL;

static final class hP
implements eo_0 {
    final /* synthetic */ jr_0 b;
    private static /* synthetic */ String[] a;

    hP(jr_0 jr_02) {
        this.b = jr_02;
    }

    public final String a(kL kL2) {
        Object object = kL2;
        boolean bl = false;
        String string = aR.e(a[0] + object);
        object = this.b;
        String string2 = a[1];
        String string3 = a[2];
        boolean bl2 = false;
        String string4 = ((jr_0)object).b().a();
        return aR.f(string, ew.a((Object)string4, (Object)a[3]) || ew.a((Object)string4, (Object)a[4]) ? string2 + a[5] + string3 : string2 + a[6] + ((jr_0)object).b().e() + a[7] + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        a = new String[]{hl.a("\u0daf\u0da2\u0dba\u0dab\u0dbc\u0dce\u0dba\u0daf\u0dac\u0da2\u0dab\u0dce", 2013662702), hl.a("\u4c75\u4c77\u4c77\u4c71\u4c64\u4c60", -1174516716), hl.a("\u2541\u2525\u2524\u2527\u2520\u2534\u252d\u2535\u2541\u2551", 21046625), hl.a("\u2559\u254e\u255a\u2558\u2545", 1875518761), hl.a("\u2d4d\u2d17", -160748251), hl.a("\uc598\uc5eb\uc5f5\uc5f9\uc5f4\uc5f4\uc5f1\uc5f6\uc5ec\uc598\uc5f6\uc5f7\uc5ec\uc598\uc5f6\uc5ed\uc5f4\uc5f4", -894319176), hl.a("\ub9e6\ub992\ub98f\ub988\ub99f\ub98f\ub988\ub992", 915913158), hl.a("\ucb84\ucbea\ucbeb\ucbf0\ucb84\ucbea\ucbf1\ucbe8\ucbe8", 976866212)};
    }

    static {
        hP.a();
    }
}

