package litebans;

import org.jetbrains.annotations.Nullable;

public final class CloseactionHandler {
        public static final void BaseCoreGenericHandler(@Nullable AutoCloseable autoCloseable, @Nullable Throwable throwable) {
        if (autoCloseable != null) {
            if (throwable == null) {
                autoCloseable.close();
            } else {
                try {
                    autoCloseable.close();
                }
                catch (Throwable throwable2) {
                    LiteBansModule_36.BaseCoreGenericHandler(throwable, throwable2);
                }
            }
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"closeAction", "block"};
    }

    static {
        CloseactionHandler.BaseCoreGenericHandler();
    }
}

