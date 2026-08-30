package litebans;

import java.util.concurrent.atomic.AtomicLong;
static final class ResetHandler
extends LiteBansModule_377
implements LiteBansModule_179 {
    public static final ResetHandler LiteBansModule_403;
        ResetHandler() {
        super(1, LiteBansModule_341.class, "reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V", 1);
    }

    public final void BaseCoreGenericHandler(AtomicLong atomicLong) {
        AtomicLong atomicLong2 = atomicLong;
        atomicLong2.set(0L);
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        this.plugin((AtomicLong)targetObj);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    static {
        ResetHandler.LiteBansModule_31();
        LiteBansModule_403 = new ResetHandler();
    }

    private static final void LiteBansModule_31() {
        Utf8Handler_2 = new String[]{"reset", "reset(Ljava/util/concurrent/atomic/AtomicLong;)V"};
    }
}

