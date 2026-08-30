package litebans;

import java.io.Serializable;
public final class LiteBansModule_104
implements LiteBansModule_162,
Serializable {
    private final Object BaseCoreGenericHandler;

    public LiteBansModule_104(Object targetObj) {
        this.plugin = targetObj;
    }

    @Override
    public Object BaseCoreGenericHandler() {
        return this.plugin;
    }

    public String toString() {
        return String.valueOf(this.plugin());
    }
}

