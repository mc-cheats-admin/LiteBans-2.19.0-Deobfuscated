package litebans;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

static final class InitializerHandler_4
implements LiteBansModule_161,
Serializable {
    public static final LiteBansModule_421 LiteBansModule_31;
    private volatile LiteBansModule_146 AsyncBackgroundTask_5;
    private volatile Object _value;
    private final Object e;
    private static final AtomicReferenceFieldUpdater c;
    public InitializerHandler_4(@NotNull LiteBansModule_146 messageSupplier) {
        ObjectUtilities.BaseCoreGenericHandler(messageSupplier, "initializer");
        this.AsyncBackgroundTask_5 = messageSupplier;
        this._value = LiteBansModule_394.BaseCoreGenericHandler;
        this.e = LiteBansModule_394.BaseCoreGenericHandler;
    }

    @Override
    public Object BaseCoreGenericHandler() {
        Object contextObj = this._value;
        if (contextObj != LiteBansModule_394.BaseCoreGenericHandler) {
            return contextObj;
        }
        LiteBansModule_146 messageSupplier = this.AsyncBackgroundTask_5;
        if (messageSupplier != null && c.compareAndSet(this, LiteBansModule_394.BaseCoreGenericHandler, targetObj = messageSupplier.BaseCoreGenericHandler())) {
            this.AsyncBackgroundTask_5 = null;
            return targetObj;
        }
        return this._value;
    }

    @Override
    public boolean LiteBansModule_31() {
        return this._value != LiteBansModule_394.BaseCoreGenericHandler;
    }

    public String toString() {
        return this.LiteBansModule_31() ? String.valueOf(this.plugin()) : "Lazy value not initialized ";
    }

    private final Object LiteBansModule_31() {
        return new LiteBansModule_103(this.plugin());
    }

    static {
        InitializerHandler_4.c();
        LiteBansModule_31 = new LiteBansModule_421(null);
        c = AtomicReferenceFieldUpdater.newUpdater(InitializerHandler_4.class, Object.class, "_value");
    }

    private static final void c() {
        BaseCoreGenericHandler = new String[]{"initializer", "Lazy value not initialized ", "_value"};
}

