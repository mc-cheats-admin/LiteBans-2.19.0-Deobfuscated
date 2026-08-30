package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.hl;
import litebans.kL;

static final class lB
implements eo_0 {
    public static final lB a;
    private static /* synthetic */ String[] b;

    lB() {
    }

    public final String a(kL kL2) {
        kL kL3 = kL2;
        boolean bl = false;
        return aR.f(aR.e("ALTER TABLE " + kL3), "removed_by_date TIMESTAMP");
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    static {
        lB.a();
        a = new lB();
    }

    private static final void a() {
        b = new String[]{"ALTER TABLE ", "removed_by_date TIMESTAMP"};
    }
}

