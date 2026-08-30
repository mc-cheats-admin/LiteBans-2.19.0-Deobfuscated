package litebans;

import litebans.li_0;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;

public class ec {
    public static void a(Object object, String string, byte[] byArray) {
        ServerPlayNetworking.send((ServerPlayer)((ServerPlayer)object), (CustomPacketPayload)new li_0(string, byArray));
    }
}

