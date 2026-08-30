package litebans;

import com.mojang.authlib.GameProfile;
import litebans.mixin.AccessLoginData_1_21;
import net.fabricmc.fabric.api.networking.v1.LoginPacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.class_2535;
import net.minecraft.class_3248;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_260
implements LiteBansModule_51 {
    private final PlatformPlugin LiteBansModule_31;
    private final LiteBansModule_98 c;
    public LiteBansModule_260(@NotNull PlatformPlugin plugin, @NotNull LiteBansModule_98 cr_02) {
        this.LiteBansModule_31 = plugin;
        this.c = cr_02;
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final LiteBansModule_98 LiteBansModule_31() {
        return this.c;
    }

    public LiteBansModule_260 AsyncBackgroundTask_5() {
        LiteBansModule_260 hj2;
        LiteBansModule_260 hj3 = hj2 = this;
        boolean flag = false;
        ServerLoginConnectionEvents.QUERY_START.register(hj3::BaseCoreGenericHandler);
        return hj2;
    }

    public final void BaseCoreGenericHandler(@NotNull class_3248 class_32482, @NotNull MinecraftServer minecraftServer, @NotNull LoginPacketSender loginPacketSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        PluginModule module = this.LiteBansModule_31.LiteBansModule_31(AbstractModule.class);
        ObjectUtilities.LiteBansModule_31(module, "");
        LiteBansModule_247 h82 = (LiteBansModule_247)((Object)module);
        if (!(class_32482 instanceof AccessLoginData_1_21)) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        GameProfile gameProfile = ((AccessLoginData_1_21)class_32482).getProfile();
        class_2535 class_25352 = ((AccessLoginData_1_21)class_32482).getConnection();
        h82.BaseCoreGenericHandler(class_32482, loginSynchronizer, new LiteBansModule_95(gameProfile.getName(), gameProfile.getId().toString(), this.c.BaseCoreGenericHandler(class_25352)), class_25352);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5();
    }

    private static final void c() {
        BaseCoreGenericHandler = new String[]{""};
    }

    }

