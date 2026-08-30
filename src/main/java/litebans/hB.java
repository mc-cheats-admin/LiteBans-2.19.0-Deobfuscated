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
        String string = aR.e("ALTER TABLE " + object);
        object = this.a;
        String string2 = "template";
        String string3 = " DEFAULT 255";
        boolean bl2 = false;
        String string4 = ((jr_0)object).b().a();
        return aR.f(string, ew.a((Object)string4, (Object)"pgsql") || ew.a((Object)string4, (Object)"h2") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((jr_0)object).b().e() + " NOT NULL" + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        b = new String[]{"ALTER TABLE ", "template", " DEFAULT 255", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL"};
    }

    static {
        hB.a();
    }
}

