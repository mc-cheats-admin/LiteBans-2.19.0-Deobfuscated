package litebans;

import java.util.Set;
import org.jetbrains.annotations.NotNull;

static class ElementsHandler_2
extends BuilderactionHandler {
    public static final Set c() {
        return ElementHandler_2.LiteBansModule_31;
    }

    public static final Set BaseCoreGenericHandler(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "elements");
        return ArrayUtilities.BaseCoreGenericHandler(objectArray);
    }

    public static final Set BaseCoreGenericHandler(@NotNull Set set) {
        Set set2;
        ObjectUtilities.BaseCoreGenericHandler((Object)set, "<this>");
        switch (set.size()) {
            case 0: {
                set2 = LiteBansModule_5.c();
                break;
            }
            case 1: {
                set2 = LiteBansModule_5.BaseCoreGenericHandler(set.iterator().next());
                break;
            }
            default: {
                set2 = set;
}
        return set2;
}

