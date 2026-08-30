package litebans;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;

public class LiteBansModule_157 {
    public static void BaseCoreGenericHandler(Object object, String string, byte[] byArray) {
        ServerPlayNetworking.send((ServerPlayer)((ServerPlayer)object), (CustomPacketPayload)new LiteBansModule_414(string, byArray));
}

