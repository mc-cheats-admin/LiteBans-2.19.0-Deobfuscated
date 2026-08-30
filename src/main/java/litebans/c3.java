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
        String string = aR.e("ALTER TABLE " + object);
        object = this.b;
        String string2 = "server_origin";
        int n = 32;
        String string3 = "";
        String string4 = ((jr_0)object).b().c();
        boolean bl2 = false;
        return aR.f(string, w.v.b(((jr_0)object).b().a()) ? string2 + " VARCHAR(" + n + ')' + string4 + string3 : string2 + " VARCHAR(" + n + ')' + string3);
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    private static final void a() {
        a = new String[]{"ALTER TABLE ", "server_origin", "", " VARCHAR(", " VARCHAR("};
    }

    static {
        c3.a();
    }
}

