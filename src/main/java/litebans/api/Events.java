package litebans.api;

import litebans.api.Events$Listener;
import litebans.api.exception.MissingImplementationException;
import lombok.Generated;

public abstract class Events {
    private static Events instance;

    public static Events get() {
        if (instance == null) {
            throw new MissingImplementationException();
        }
        return instance;
    }

    public abstract void register(Events$Listener var1);

    public abstract void unregister(Events$Listener var1);

    @Generated
    public static void setInstance(Events events) {
        instance = events;
}

