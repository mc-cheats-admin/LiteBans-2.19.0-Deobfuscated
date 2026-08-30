package litebans;

import litebans.aR;
import litebans.eo_0;
import litebans.hl;
import litebans.kL;

static final class ef
implements eo_0 {
    public static final ef b;
    private static /* synthetic */ String[] a;

    ef() {
    }

    public final String a(kL kL2) {
        kL kL3 = kL2;
        boolean bl = false;
        return aR.f(aR.e("ALTER TABLE " + kL3), "removed_by_reason VARCHAR(2048)");
    }

    @Override
    public Object a(Object object) {
        return aR.d(this.a((kL)object));
    }

    static {
        ef.a();
        b = new ef();
    }

    private static final void a() {
        a = new String[]{"ALTER TABLE ", "removed_by_reason VARCHAR(2048)"};
    }
}

