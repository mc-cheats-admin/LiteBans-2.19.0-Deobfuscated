package litebans;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_103
implements LiteBansModule_162,
Serializable {
    private final LiteBansModule_147 BaseCoreGenericHandler;
    private volatile Reference LiteBansModule_31;

    public LiteBansModule_103(@NotNull LiteBansModule_147 messageSupplier) {
        this.plugin = messageSupplier;
        this.LiteBansModule_31 = new SoftReference<Object>(null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object BaseCoreGenericHandler() {
        Object t2;
        Object t3 = this.LiteBansModule_31.get();
        if (t3 != null) {
            return t3;
        }
        LiteBansModule_103 cU2 = this;
        synchronized (cU2) {
            Object t4 = this.LiteBansModule_31.get();
            if (t4 != null) {
                targetObj = t4;
            } else {
                Object contextObj = this.plugin.BaseCoreGenericHandler();
                this.LiteBansModule_31 = new SoftReference<Object>(contextObj);
                targetObj = contextObj;
            }
            t2 = targetObj;
        }
        return t2;
    }

    @Override
    public boolean LiteBansModule_31() {
        return this.LiteBansModule_31.get() != null;
    }

    public String toString() {
        return String.valueOf(this.LiteBansModule_31() ? this.plugin() : null);
    }

    private final Object LiteBansModule_31() {
        return ProxyConnection.BaseCoreGenericHandler(this.plugin());
    }
}

