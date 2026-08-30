package litebans;

import java.util.concurrent.atomic.AtomicLong;
static final class ResetHandler
extends LiteBansModule_375
implements LiteBansModule_178 {
    public static final ResetHandler LiteBansModule_401;
    ResetHandler() {
        super(1, LiteBansModule_340.class, "reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V", 1);
    }

    public final void BaseCoreGenericHandler(AtomicLong atomicLong) {
        AtomicLong atomicLong2 = atomicLong;
        boolean flag = false;
        atomicLong2.set(0L);
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        this.plugin((AtomicLong)object);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    static {
        ResetHandler.LiteBansModule_31();
        LiteBansModule_401 = new ResetHandler();
    }

    private static final void LiteBansModule_31() {
        Utf8Handler_2 = new String[]{"reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V"};
    }
}

