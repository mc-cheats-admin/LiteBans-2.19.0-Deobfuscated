package litebans;

import org.jetbrains.annotations.Nullable;

public class LiteBansException
extends RuntimeException {
    private final Object BaseCoreGenericHandler;

    public LiteBansException(@Nullable Object targetObj) {
        super(String.valueOf(targetObj));
        this.plugin = targetObj;
    }

    public final Object BaseCoreGenericHandler() {
        return this.plugin;
}

