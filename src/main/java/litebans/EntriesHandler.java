package litebans;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public final class EntriesHandler
implements Serializable {
    private static final LiteBansModule_156 LiteBansModule_31;
    private final Class AsyncBackgroundTask_5;
    private static final long BaseCoreGenericHandler;
        public EntriesHandler(@NotNull Enum[] enumArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)enumArray, "entries");
        Class<?> clazz = enumArray.getClass().getComponentType();
        ObjectUtilities.BaseCoreGenericHandler(clazz);
        this.AsyncBackgroundTask_5 = clazz;
    }

    private final Object BaseCoreGenericHandler() {
        return EntriesHandler_3.BaseCoreGenericHandler((Enum[])this.AsyncBackgroundTask_5.getEnumConstants());
    }

    static {
        BaseCoreGenericHandler = 0L;
        EntriesHandler.LiteBansModule_31();
        LiteBansModule_31 = new LiteBansModule_156(null);
    }

    private static final void LiteBansModule_31() {
        e = new String[]{"entries"};
    }
}

