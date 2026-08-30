package litebans;

import java.util.concurrent.CopyOnWriteArrayList;
import litebans.api.Events;
import litebans.api.Events$Listener;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class cb
extends Events {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private static /* synthetic */ String[] b;

    public final CopyOnWriteArrayList b() {
        return this.a;
    }

    @Override
    public void register(@NotNull Events$Listener events$Listener) {
        if (!(!this.a.contains(events$Listener))) {
            boolean bl = false;
            String string = "Listener is already registered: " + events$Listener;
            throw new IllegalArgumentException(string.toString());
        }
        this.a.add(events$Listener);
    }

    @Override
    public void unregister(@NotNull Events$Listener events$Listener) {
        this.a.remove(events$Listener);
    }

    public String toString() {
        return "Events";
    }

    private static final void a() {
        b = new String[]{"Listener is already registered: ", "Events"};
    }

    static {
        cb.a();
    }
}

