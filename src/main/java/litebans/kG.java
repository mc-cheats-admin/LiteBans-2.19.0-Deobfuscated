package litebans;

import java.util.concurrent.atomic.AtomicLong;
import litebans.eo_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jE;
import litebans.ke_0;

static final class kG
extends ke_0
implements eo_0 {
    public static final kG l;
    private static /* synthetic */ String[] k;

    kG() {
        super(1, jE.class, k[0], k[1], 1);
    }

    public final void a(AtomicLong atomicLong) {
        AtomicLong atomicLong2 = atomicLong;
        boolean bl = false;
        atomicLong2.set(0L);
    }

    @Override
    public Object a(Object object) {
        this.a((AtomicLong)object);
        return iv_0.a;
    }

    static {
        kG.b();
        l = new kG();
    }

    private static final void b() {
        k = new String[]{hl.a("\ub867\ub870\ub866\ub870\ub861", 1765390357), hl.a("\u36a7\u36b0\u36a6\u36b0\u36a1\u36fd\u3699\u36bf\u36b4\u36a3\u36b4\u36fa\u36a0\u36a1\u36bc\u36b9\u36fa\u36b6\u36ba\u36bb\u36b6\u36a0\u36a7\u36a7\u36b0\u36bb\u36a1\u36fa\u36b4\u36a1\u36ba\u36b8\u36bc\u36b6\u36fa\u3694\u36a1\u36ba\u36b8\u36bc\u36b6\u3699\u36ba\u36bb\u36b2\u36ee\u36fc\u3683", -1629735211)};
    }
}

