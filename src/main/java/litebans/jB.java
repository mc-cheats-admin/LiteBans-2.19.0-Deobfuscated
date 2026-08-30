package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.hl;
import litebans.kL;

static final class jB
implements eo_0 {
    public static final jB b;
    private static /* synthetic */ String[] a;

    jB() {
    }

    public final String a(kL kL2) {
        kL kL3 = kL2;
        boolean bl = false;
        return aR.f(aR.e("ALTER TABLE " + kL3), "removed_by_name VARCHAR(128)");
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    static {
        jB.a();
        b = new jB();
    }

    private static final void a() {
        a = new String[]{"ALTER TABLE ", "removed_by_name VARCHAR(128)"};
    }
}

