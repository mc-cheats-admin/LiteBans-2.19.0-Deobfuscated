package litebans;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.class_2540;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3222;

public class LiteBansModule_405
extends ArgsHandler_2 {
    protected final LiteBansModule_252 e = new LiteBansModule_79(this);

    public LiteBansModule_405(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public Object AsyncBackgroundTask_5(Object object) {
        if (object instanceof class_3222) {
            return ((class_3222)object).method_5671();
        }
        return object;
    }

    @Override
    public LiteBansModule_252 AsyncBackgroundTask_5() {
        return this.e;
    }

    @Override
    public void BaseCoreGenericHandler(Object object, String string) {
        int n = this.LiteBansModule_31();
        V116Handler g82 = n >= 770 ? V116Handler.BaseCoreGenericHandler : V116Handler.c;
        ((class_3222)object).field_13987.method_14367((class_2561)this.e.LiteBansModule_31(LiteBansModule_164.BaseCoreGenericHandler(string, g82)));
    }

    @Override
    public void BaseCoreGenericHandler(Object object, String string, byte[] byArray) {
        class_2540 class_25402 = PacketByteBufs.create();
        class_25402.writeBytes(byArray);
        ((class_3222)object).field_13987.method_14364(ServerPlayNetworking.createS2CPacket((class_2960)class_2960.method_12829((String)string), (class_2540)class_25402));
    }
}

