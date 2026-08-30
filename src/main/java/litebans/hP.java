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
        String string = aR.e("ALTER TABLE " + object);
        object = this.b;
        String string2 = "accept";
        String string3 = " DEFAULT 0";
        boolean bl2 = false;
        String string4 = ((jr_0)object).b().a();
        return aR.f(string, ew.a((Object)string4, (Object)"pgsql") || ew.a((Object)string4, (Object)"h2") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((jr_0)object).b().e() + " NOT NULL" + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        a = new String[]{"ALTER TABLE ", "accept", " DEFAULT 0", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL"};
    }

    static {
        hP.a();
    }
}

