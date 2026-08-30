package litebans;

import com.mojang.authlib.GameProfile;
import litebans.mixin.AccessLoginData_1_20;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.class_2535;
import net.minecraft.class_3248;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_302
implements LiteBansModule_51 {
    private final PlatformPlugin c;
    private final LiteBansModule_98 BaseCoreGenericHandler;
    public LiteBansModule_302(@NotNull PlatformPlugin plugin, @NotNull LiteBansModule_98 cr_02) {
        this.c = plugin;
        this.plugin = cr_02;
    }

    public final PlatformPlugin LiteBansModule_31() {
        return this.c;
    }

    public final LiteBansModule_98 BaseCoreGenericHandler() {
        return this.plugin;
    }

    public LiteBansModule_302 c() {
        LiteBansModule_302 ie2;
        LiteBansModule_302 ie3 = ie2 = this;
        ServerLoginConnectionEvents.QUERY_START.register(ie3::BaseCoreGenericHandler);
        return ie2;
    }

    public final void BaseCoreGenericHandler(@NotNull class_3248 class_32482, @NotNull MinecraftServer minecraftServer, @NotNull PacketSender packetSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        PluginModule module = this.c.LiteBansModule_31(AbstractModule.class);
        ObjectUtilities.LiteBansModule_31(module, "");
        LiteBansModule_247 h82 = (LiteBansModule_247)((Object)module);
        if (!(class_32482 instanceof AccessLoginData_1_20)) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        GameProfile gameProfile = ((AccessLoginData_1_20)class_32482).getProfile();
        class_2535 class_25352 = ((AccessLoginData_1_20)class_32482).getConnection();
        h82.BaseCoreGenericHandler(class_32482, loginSynchronizer, new LiteBansModule_95(gameProfile.getName(), gameProfile.getId().toString(), this.plugin.BaseCoreGenericHandler(class_25352)), class_25352);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.c();
}

