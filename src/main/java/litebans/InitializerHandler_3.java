package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static final class InitializerHandler_3
implements LiteBansModule_161,
Serializable {
    private LiteBansModule_146 c;
    private volatile Object LiteBansModule_31;
    private final Object BaseCoreGenericHandler;
    public InitializerHandler_3(@NotNull LiteBansModule_146 messageSupplier, @Nullable Object object) {
        ObjectUtilities.BaseCoreGenericHandler((Object)messageSupplier, "initializer");
        this.c = messageSupplier;
        this.LiteBansModule_31 = LiteBansModule_394.BaseCoreGenericHandler;
        Object object2 = object;
        if (object2 == null) {
            object2 = this;
        }
        this.plugin = object2;
    }

    public /* synthetic */ InitializerHandler_3(LiteBansModule_146 messageSupplier, Object object, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            object = null;
        }
        this(messageSupplier, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object BaseCoreGenericHandler() {
        Object object;
        Object object2 = this.LiteBansModule_31;
        if (object2 != LiteBansModule_394.BaseCoreGenericHandler) {
            return object2;
        }
        Object object3 = this.plugin;
        synchronized (object3) {
            Object object4;
            boolean flag = false;
            Object object5 = this.LiteBansModule_31;
            if (object5 != LiteBansModule_394.BaseCoreGenericHandler) {
                object4 = object5;
            } else {
                Object object6;
                LiteBansModule_146 messageSupplier = this.c;
                ObjectUtilities.BaseCoreGenericHandler(messageSupplier);
                this.LiteBansModule_31 = object6 = messageSupplier.BaseCoreGenericHandler();
                this.c = null;
                object4 = object6;
            }
            object = object4;
        }
        return object;
    }

    @Override
    public boolean LiteBansModule_31() {
        return this.LiteBansModule_31 != LiteBansModule_394.BaseCoreGenericHandler;
    }

    public String toString() {
        return this.LiteBansModule_31() ? String.valueOf(this.plugin()) : "Lazy value not initialized ";
    }

    private final Object LiteBansModule_31() {
        return new LiteBansModule_103(this.plugin());
    }

    private static final void c() {
        AsyncBackgroundTask_5 = new String[]{"initializer", "Lazy value not initialized yet."};
    }

    }

