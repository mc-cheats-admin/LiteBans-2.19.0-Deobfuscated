package litebans;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import net.minecraft.class_11341;
import net.minecraft.class_2561;
import net.minecraft.class_5455;
import net.minecraft.class_8824;

public class NmsClassReflector
implements LiteBansModule_252 {
    private static final boolean LiteBansModule_31;
    private LiteBansModule_319 c;
    public NmsClassReflector() {
        if (LiteBansModule_31) {
            this.c = new LiteBansModule_319();
}

    @Override
    public Object BaseCoreGenericHandler(CharSequence charSequence) {
        return class_2561.method_43470((String)charSequence.toString());
    }

    @Override
    public Object LiteBansModule_31(CharSequence charSequence) {
        if (LiteBansModule_31) {
            return this.c.LiteBansModule_31(charSequence);
        }
        return this.plugin(charSequence);
    }

    private final class_2561 BaseCoreGenericHandler(CharSequence charSequence) {
        return (class_2561)class_8824.field_46597.parse((DynamicOps)class_5455.field_40585.method_57093((DynamicOps)JsonOps.INSTANCE), class_11341.method_71360((String)charSequence.toString())).getOrThrow(IllegalArgumentException::new);
    }

    static {
        NmsClassReflector.BaseCoreGenericHandler();
        try {
            Class<?> clazz = Class.forName("net.minecraft.class_11341");
            clazz.getMethod("method_71360", String.class);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            flag = true;
        }
        LiteBansModule_31 = flag;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"net.minecraft.class_11341", "method_71360"};
}

