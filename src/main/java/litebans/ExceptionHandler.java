package litebans;

import kotlin.internal.PlatformImplementationsKt;
import org.jetbrains.annotations.NotNull;

static class ExceptionHandler {
    public static final void BaseCoreGenericHandler(@NotNull Throwable throwable, @NotNull Throwable throwable2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)throwable, "<this>");
        ObjectUtilities.BaseCoreGenericHandler((Object)throwable2, "exception");
        if (throwable != throwable2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(throwable, throwable2);
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "<this>", "writer", "<this>", "stream", "<this>", "<this>", "<this>", "exception", "<this>"};
    }

    }

