package litebans;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class ArrayHandler {
    public static final Iterator BaseCoreGenericHandler(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler(objectArray, "array");
        return new ArrayHandler_2(objectArray);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"array"};
}

