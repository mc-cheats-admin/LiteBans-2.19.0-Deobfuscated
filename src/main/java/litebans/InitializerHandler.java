package litebans;

import org.jetbrains.annotations.NotNull;

static class InitializerHandler {
        public static final LiteBansModule_162 BaseCoreGenericHandler(@NotNull LiteBansModule_147 messageSupplier) {
        ObjectUtilities.BaseCoreGenericHandler((Object)messageSupplier, "initializer");
        return new InitializerHandler_3(messageSupplier, null, 2, null);
    }

    public static final LiteBansModule_162 BaseCoreGenericHandler(@NotNull SynchronizedHandler l42, @NotNull LiteBansModule_147 messageSupplier) {
        LiteBansModule_162 eE2;
        ObjectUtilities.BaseCoreGenericHandler((Object)l42, "mode");
        ObjectUtilities.BaseCoreGenericHandler((Object)messageSupplier, "initializer");
        switch (LiteBansModule_347.BaseCoreGenericHandler[l42.ordinal()]) {
            case 1: {
                eE2 = new InitializerHandler_3(messageSupplier, null, 2, null);
                break;
            }
            case 2: {
                eE2 = new InitializerHandler_4(messageSupplier);
                break;
            }
            case 3: {
                eE2 = new InitializerHandler_2(messageSupplier);
                break;
            }
            default: {
                throw new LiteBansException_5();
            }
        }
        return eE2;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"initializer", "mode", "initializer", "initializer"};
    }

    static {
        InitializerHandler.BaseCoreGenericHandler();
    }
}

