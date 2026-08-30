package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.hl;
import litebans.kL;

static final class cX
implements eo_0 {
    public static final cX a;
    private static /* synthetic */ String[] b;

    cX() {
    }

    public final String a(kL kL2) {
        kL kL3 = kL2;
        boolean bl = false;
        return aR.f(aR.e("ALTER TABLE " + kL3), "removed_by_uuid VARCHAR(36)");
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    static {
        cX.a();
        a = new cX();
    }

    private static final void a() {
        b = new String[]{"ALTER TABLE ", "removed_by_uuid VARCHAR(36)"};
    }
}

