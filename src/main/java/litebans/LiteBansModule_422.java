package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_422 {
    public static final LiteBansModule_162 BaseCoreGenericHandler(@NotNull LiteBansModule_147 messageSupplier) {
        return ProxyConnection.BaseCoreGenericHandler(SynchronizedHandler.BaseCoreGenericHandler, messageSupplier);
    }
}

