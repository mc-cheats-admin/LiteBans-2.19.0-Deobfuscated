package litebans;

import kotlin.internal.PlatformImplementationsKt;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static class bg {
    private static /* synthetic */ String[] a;

    public static final void a(@NotNull Throwable throwable, @NotNull Throwable throwable2) {
        ew.a((Object)throwable, "<this>");
        ew.a((Object)throwable2, "exception");
        if (throwable != throwable2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(throwable, throwable2);
        }
    }

    private static final void a() {
        a = new String[]{"<this>", "<this>", "writer", "<this>", "stream", "<this>", "<this>", "<this>", "exception", "<this>"};
    }

    static {
        bg.a();
    }
}

