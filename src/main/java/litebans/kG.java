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
        super(1, jE.class, "reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V", 1);
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
        k = new String[]{"reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V"};
    }
}

