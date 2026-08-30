package litebans;

import litebans.cf_0;
import litebans.di_0;
import litebans.eg_0;
import litebans.g8;
import litebans.hd;
import litebans.lb_0;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.class_2540;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3222;

/*
 * Renamed from litebans.la
 */
public static class la_0
extends lb_0 {
    protected final hd e = new cf_0(this);

    public la_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public Object d(Object object) {
        if (object instanceof class_3222) {
            return ((class_3222)object).method_5671();
        }
        return object;
    }

    @Override
    public hd d() {
        return this.e;
    }

    @Override
    public void a(Object object, String string) {
        int n = this.b();
        g8 g82 = n >= 770 ? g8.a : g8.c;
        ((class_3222)object).field_13987.method_14367((class_2561)this.e.b(eg_0.a(string, g82)));
    }

    @Override
    public void a(Object object, String string, byte[] byArray) {
        class_2540 class_25402 = PacketByteBufs.create();
        class_25402.writeBytes(byArray);
        ((class_3222)object).field_13987.method_14364(ServerPlayNetworking.createS2CPacket((class_2960)class_2960.method_12829((String)string), (class_2540)class_25402));
    }
}

