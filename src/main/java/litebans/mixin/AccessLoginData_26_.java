package litebans.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.Connection;
import net.minecraft.server.network.ServerLoginPacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ServerLoginPacketListenerImpl.class})
public static interface AccessLoginData_26_ {
    @Accessor(value="authenticatedProfile")
    public GameProfile getProfile();

    @Accessor(value="connection")
    public Connection getConnection();
}

