package litebans;

import com.mojang.authlib.GameProfile;
import litebans.mixin.AccessLoginData_26_;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.network.Connection;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerLoginPacketListenerImpl;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_407
implements LiteBansModule_51 {
    private final PlatformPlugin c;
    private final LiteBansModule_98 BaseCoreGenericHandler;
    public LiteBansModule_407(@NotNull PlatformPlugin plugin, @NotNull LiteBansModule_98 cr_02) {
        this.c = plugin;
        this.plugin = cr_02;
    }

    public final PlatformPlugin AsyncBackgroundTask_5() {
        return this.c;
    }

    public final LiteBansModule_98 LiteBansModule_31() {
        return this.plugin;
    }

    public LiteBansModule_407 c() {
        LiteBansModule_407 ld2;
        LiteBansModule_407 ld3 = ld2 = this;
        ServerLoginConnectionEvents.QUERY_START.register(ld3::BaseCoreGenericHandler);
        return ld2;
    }

    public final void BaseCoreGenericHandler(@NotNull ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @NotNull MinecraftServer minecraftServer, @NotNull PacketSender packetSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        PluginModule module = this.c.LiteBansModule_31(AbstractModule.class);
        ObjectUtilities.LiteBansModule_31(module, "");
        LiteBansModule_247 h82 = (LiteBansModule_247)((Object)module);
        if (!(serverLoginPacketListenerImpl instanceof AccessLoginData_26_)) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        GameProfile gameProfile = ((AccessLoginData_26_)serverLoginPacketListenerImpl).getProfile();
        Connection connection = ((AccessLoginData_26_)serverLoginPacketListenerImpl).getConnection();
        h82.BaseCoreGenericHandler(serverLoginPacketListenerImpl, loginSynchronizer, new LiteBansModule_95(gameProfile.name(), gameProfile.SQLiteDriverHandler_4().toString(), this.plugin.BaseCoreGenericHandler(connection)), connection);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.c();
}

