package litebans;

import litebans.di_0;
import litebans.lb_0;
import net.minecraft.class_3222;

public static class l2
extends lb_0 {
    public l2(di_0 di_02) {
        super(di_02);
    }

    @Override
    public Object d(Object object) {
        if (object instanceof class_3222) {
            return ((class_3222)object).method_5671();
        }
        return object;
    }
}

