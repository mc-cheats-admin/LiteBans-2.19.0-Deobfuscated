package litebans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

static class BuilderactionHandler_3 {
    public static final List BaseCoreGenericHandler(Object object) {
        return Collections.singletonList(object);
    }

    public static final Object[] BaseCoreGenericHandler(@NotNull Object[] objectArray, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "<this>");
        return flag && ObjectUtilities.BaseCoreGenericHandler(objectArray.getClass(), Object[].class) ? objectArray : Arrays.copyOf(objectArray, objectArray.length, Object[].class);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"builderAction", "builderAction", "builder", "<this>", "<this>", "<this>", "random", "collection", "collection", "array", "array", "<this>"};
    }

    }

