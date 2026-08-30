package litebans;

import org.jetbrains.annotations.Nullable;

public class LiteBansException
extends RuntimeException {
    private final Object BaseCoreGenericHandler;

    public LiteBansException(@Nullable Object object) {
        super(String.valueOf(object));
        this.plugin = object;
    }

    public final Object BaseCoreGenericHandler() {
        return this.plugin;
    }
}

