package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.jr_0;
import litebans.kL;

static final class hB
implements eo_0 {
    final /* synthetic */ jr_0 a;
    private static /* synthetic */ String[] b;

    hB(jr_0 jr_02) {
        this.a = jr_02;
    }

    public final String a(kL kL2) {
        Object object = kL2;
        boolean bl = false;
        String string = aR.e(b[0] + object);
        object = this.a;
        String string2 = b[1];
        String string3 = b[2];
        boolean bl2 = false;
        String string4 = ((jr_0)object).b().a();
        return aR.f(string, ew.a((Object)string4, (Object)b[3]) || ew.a((Object)string4, (Object)b[4]) ? string2 + b[5] + string3 : string2 + b[6] + ((jr_0)object).b().e() + b[7] + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        b = new String[]{hl.a("\u0139\u0134\u012c\u013d\u012a\u0158\u012c\u0139\u013a\u0134\u013d\u0158", -988806792), hl.a("\u3a08\u3a19\u3a11\u3a0c\u3a10\u3a1d\u3a08\u3a19", 961100412), hl.a("\ub0cf\ub0ab\ub0aa\ub0a9\ub0ae\ub0ba\ub0a3\ub0bb\ub0cf\ub0dd\ub0da\ub0da", -1620135697), hl.a("\ua2fd\ua2ea\ua2fe\ua2fc\ua2e1", -1097817459), hl.a("\ubdb5\ubdef", 1229176285), hl.a("\u12f2\u1281\u129f\u1293\u129e\u129e\u129b\u129c\u1286\u12f2\u129c\u129d\u1286\u12f2\u129c\u1287\u129e\u129e", -1969089838), hl.a("\u5f71\u5f05\u5f18\u5f1f\u5f08\u5f18\u5f1f\u5f05", -755015855), hl.a("\u65f1\u659f\u659e\u6585\u65f1\u659f\u6584\u659d\u659d", 34498001)};
    }

    static {
        hB.a();
    }
}

