package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public final class InitializerHandler_2
implements LiteBansModule_162,
Serializable {
    private LiteBansModule_147 BaseCoreGenericHandler;
    private Object LiteBansModule_31;
        public InitializerHandler_2(@NotNull LiteBansModule_147 messageSupplier) {
        ObjectUtilities.BaseCoreGenericHandler((Object)messageSupplier, "initializer");
        this.plugin = messageSupplier;
        this.LiteBansModule_31 = LiteBansModule_396.BaseCoreGenericHandler;
    }

    @Override
    public Object BaseCoreGenericHandler() {
        if (this.LiteBansModule_31 == LiteBansModule_396.BaseCoreGenericHandler) {
            LiteBansModule_147 messageSupplier = this.plugin;
            ObjectUtilities.BaseCoreGenericHandler(messageSupplier);
            this.LiteBansModule_31 = messageSupplier.BaseCoreGenericHandler();
            this.plugin = null;
        }
        return this.LiteBansModule_31;
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
        c = new String[]{"initializer", "Lazy value not initialized yet."};
    }

    static {
        InitializerHandler_2.c();
    }
}

