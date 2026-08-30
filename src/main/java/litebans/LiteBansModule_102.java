package litebans;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_102
implements LiteBansModule_161,
Serializable {
    private final LiteBansModule_146 BaseCoreGenericHandler;
    private volatile Reference LiteBansModule_31;

    public LiteBansModule_102(@NotNull LiteBansModule_146 messageSupplier) {
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
        LiteBansModule_102 cU2 = this;
        synchronized (cU2) {
            Object object;
            Object t4 = this.LiteBansModule_31.get();
            if (t4 != null) {
                object = t4;
            } else {
                Object object2 = this.plugin.BaseCoreGenericHandler();
                this.LiteBansModule_31 = new SoftReference<Object>(object2);
                object = object2;
            }
            t2 = object;
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

