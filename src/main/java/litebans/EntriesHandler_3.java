package litebans;

import org.jetbrains.annotations.NotNull;

public final class EntriesHandler_3 {
        public static final LiteBansModule_374 BaseCoreGenericHandler(@NotNull Enum[] enumArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enumArray, "entries");
        return new EntriesHandler_2(enumArray);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"entriesProvider", "entries"};
    }

    static {
        EntriesHandler_3.BaseCoreGenericHandler();
    }
}

