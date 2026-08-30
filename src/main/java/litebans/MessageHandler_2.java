package litebans;

import org.jetbrains.annotations.NotNull;

public final class MessageHandler_2
extends Error {
        public MessageHandler_2(@NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "message");
        super(string);
    }

    public /* synthetic */ MessageHandler_2(String string, int n, LiteBansModule_14 aJ2) {
        if ((n & 1) != 0) {
            string = "An operation is not ";
        }
        this(string);
    }

    public MessageHandler_2() {
        this(null, 1, null);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"message", "An operation is not implemented."};
    }

    static {
        MessageHandler_2.BaseCoreGenericHandler();
    }
}

