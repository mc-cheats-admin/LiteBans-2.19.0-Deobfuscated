package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class InitializerHandler_3
implements LiteBansModule_162,
Serializable {
    private LiteBansModule_147 c;
    private volatile Object LiteBansModule_31;
    private final Object BaseCoreGenericHandler;
        public InitializerHandler_3(@NotNull LiteBansModule_147 messageSupplier, @Nullable Object targetObj) {
        ObjectUtilities.BaseCoreGenericHandler((Object)messageSupplier, "initializer");
        this.c = messageSupplier;
        this.LiteBansModule_31 = LiteBansModule_396.BaseCoreGenericHandler;
        Object contextObj = targetObj;
        if (contextObj == null) {
            contextObj = this;
        }
        this.plugin = contextObj;
    }

    public /* synthetic */ InitializerHandler_3(LiteBansModule_147 messageSupplier, Object targetObj, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            targetObj = null;
        }
        this(messageSupplier, targetObj);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object BaseCoreGenericHandler() {
        Object contextObj = this.LiteBansModule_31;
        if (contextObj != LiteBansModule_396.BaseCoreGenericHandler) {
            return contextObj;
        }
        Object resultObj = this.plugin;
        synchronized (resultObj) {
            Object tempObj = this.LiteBansModule_31;
            if (tempObj != LiteBansModule_396.BaseCoreGenericHandler) {
                helperObj = tempObj;
            } else {
                LiteBansModule_147 messageSupplier = this.c;
                ObjectUtilities.BaseCoreGenericHandler(messageSupplier);
                this.LiteBansModule_31 = object6 = messageSupplier.BaseCoreGenericHandler();
                this.c = null;
                helperObj = object6;
            }
            targetObj = helperObj;
        }
        return targetObj;
    }

    @Override
    public boolean LiteBansModule_31() {
        return this.LiteBansModule_31 != LiteBansModule_396.BaseCoreGenericHandler;
    }

    public String toString() {
        return this.LiteBansModule_31() ? String.valueOf(this.plugin()) : "Lazy value not initialized ";
    }

    private final Object LiteBansModule_31() {
        return new LiteBansModule_104(this.plugin());
    }

    private static final void c() {
        AsyncBackgroundTask_5 = new String[]{"initializer", "Lazy value not initialized yet."};
    }

    static {
        InitializerHandler_3.c();
    }
}

