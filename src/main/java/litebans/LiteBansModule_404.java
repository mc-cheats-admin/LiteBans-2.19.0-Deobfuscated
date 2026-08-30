package litebans;

import net.minecraft.class_3222;

public class LiteBansModule_404
extends ArgsHandler_2 {
    public LiteBansModule_404(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public Object AsyncBackgroundTask_5(Object targetObj) {
        if (targetObj instanceof class_3222) {
            return ((class_3222)targetObj).method_5671();
        }
        return targetObj;
    }
}

