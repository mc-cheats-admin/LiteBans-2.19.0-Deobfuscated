package litebans;

import java.io.Serializable;
public final class LiteBansModule_103
implements LiteBansModule_161,
Serializable {
    private final Object BaseCoreGenericHandler;

    public LiteBansModule_103(Object object) {
        this.plugin = object;
    }

    @Override
    public Object BaseCoreGenericHandler() {
        return this.plugin;
    }

    public String toString() {
        return String.valueOf(this.plugin());
}

