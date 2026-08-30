package litebans;

import net.minecraft.class_3222;

public class LiteBansModule_402
extends ArgsHandler_2 {
    public LiteBansModule_402(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public Object AsyncBackgroundTask_5(Object object) {
        if (object instanceof class_3222) {
            return ((class_3222)object).method_5671();
        }
        return object;
    }
}

