package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_420 {
    public static final LiteBansModule_161 BaseCoreGenericHandler(@NotNull LiteBansModule_146 messageSupplier) {
        return ProxyConnection.BaseCoreGenericHandler(SynchronizedHandler.BaseCoreGenericHandler, messageSupplier);
}

