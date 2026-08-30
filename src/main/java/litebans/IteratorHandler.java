package litebans;

import org.jetbrains.annotations.NotNull;

static class IteratorHandler
extends LiteBansModule_225 {
        public static final LiteBansModule_296 BaseCoreGenericHandler(@NotNull LiteBansModule_296 i_2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)i_2, "<this>");
        return i_2 instanceof SequenceHandler ? i_2 : (LiteBansModule_296)new SequenceHandler(i_2);
    }

    private static final void c() {
        i = new String[]{"iterator", "<this>", "elements", "<this>", "defaultValue", "<this>", "<this>", "<this>", "<this>", "<this>", "random", "source", "transform", "iterator", "<this>", "nextFunction", "nextFunction", "seedFunction", "nextFunction", "UpdateCheckTask", "UpdateCheckTask", "UpdateCheckTask"};
    }

    static {
        IteratorHandler.c();
    }
}

