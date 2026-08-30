package litebans.api;

import litebans.api.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Events$Listener {
    public void broadcastSent(@NotNull String string, @Nullable String string2) {
        if (string == null) {
            Events$Listener.$$$reportNull$$$0(0);
        }
    }

    public void entryAdded(Entry entry) {
    }

    public void entryRemoved(Entry entry) {
    }

    private static /* synthetic */ void $$$reportNull$$$0(int n) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%AsyncBackgroundTask_21' of %AsyncBackgroundTask_21.%AsyncBackgroundTask_21 must not be null", "message", "litebans/api/Events$Listener", "broadcastSent"));
    }
}

