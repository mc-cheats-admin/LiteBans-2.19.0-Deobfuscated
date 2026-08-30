package litebans;

import java.util.concurrent.CopyOnWriteArrayList;
import litebans.api.Events;
import litebans.api.Events$Listener;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class cb
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
            String string = b[0] + events$Listener;
            throw new IllegalArgumentException(string.toString());
        }
        this.a.add(events$Listener);
    }

    @Override
    public void unregister(@NotNull Events$Listener events$Listener) {
        this.a.remove(events$Listener);
    }

    public String toString() {
        return b[1];
    }

    private static final void a() {
        b = new String[]{hl.a("\u9d6e\u9d4b\u9d51\u9d56\u9d47\u9d4c\u9d47\u9d50\u9d02\u9d4b\u9d51\u9d02\u9d43\u9d4e\u9d50\u9d47\u9d43\u9d46\u9d5b\u9d02\u9d50\u9d47\u9d45\u9d4b\u9d51\u9d56\u9d47\u9d50\u9d47\u9d46\u9d18\u9d02", 650288418), hl.a("\u0b3d\u0b0e\u0b1d\u0b16\u0b0c\u0b0b", -86504584)};
    }

    static {
        cb.a();
    }
}

