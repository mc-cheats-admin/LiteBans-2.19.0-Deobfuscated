package litebans;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import litebans.hd;
import litebans.hl;
import litebans.is_0;
import net.minecraft.class_11341;
import net.minecraft.class_2561;
import net.minecraft.class_5455;
import net.minecraft.class_8824;

public class ac_0
implements hd {
    private static final boolean b;
    private is_0 c;
    private static /* synthetic */ String[] a;

    public ac_0() {
        if (b) {
            this.c = new is_0();
        }
    }

    @Override
    public Object a(CharSequence charSequence) {
        return class_2561.method_43470((String)charSequence.toString());
    }

    @Override
    public Object b(CharSequence charSequence) {
        if (b) {
            return this.c.b(charSequence);
        }
        return this.a(charSequence);
    }

    private final class_2561 a(CharSequence charSequence) {
        return (class_2561)class_8824.field_46597.parse((DynamicOps)class_5455.field_40585.method_57093((DynamicOps)JsonOps.INSTANCE), (Object)class_11341.method_71360((String)charSequence.toString())).getOrThrow(IllegalArgumentException::new);
    }

    static {
        ac_0.a();
        boolean bl = false;
        try {
            Class<?> clazz = Class.forName("net.minecraft.class_11341");
            clazz.getMethod("method_71360", String.class);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            bl = true;
        }
        b = bl;
    }

    private static final void a() {
        a = new String[]{"net.minecraft.class_11341", "method_71360"};
    }
}

