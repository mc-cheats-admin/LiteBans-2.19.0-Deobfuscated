package litebans;

import java.util.concurrent.CopyOnWriteArrayList;
import litebans.api.Events;
import litebans.api.Events$Listener;
import org.jetbrains.annotations.NotNull;

public final class EventsHandler
extends Events {
    private final CopyOnWriteArrayList BaseCoreGenericHandler = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList LiteBansModule_31() {
        return this.plugin;
    }

    @Override
    public void register(@NotNull Events$Listener events$Listener) {
        if (!(!this.plugin.contains(events$Listener))) {
            String string = "Listener is already registered: " + events$Listener;
            throw new IllegalArgumentException(string.toString());
        }
        this.plugin.add(events$Listener);
    }

    @Override
    public void unregister(@NotNull Events$Listener events$Listener) {
        this.plugin.remove(events$Listener);
    }

    public String toString() {
        return "Events";
}

