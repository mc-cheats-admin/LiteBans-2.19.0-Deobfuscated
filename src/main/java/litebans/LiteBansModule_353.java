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

public final class LiteBansModule_353
implements LiteBansModule_51 {
    private final PlatformPlugin BaseCoreGenericHandler;
    private final LiteBansModule_98 c;
    public LiteBansModule_353(@NotNull PlatformPlugin plugin, @NotNull LiteBansModule_98 cr_02) {
        this.plugin = plugin;
        this.c = cr_02;
    }

    public final PlatformPlugin LiteBansModule_31() {
        return this.plugin;
    }

    public final LiteBansModule_98 BaseCoreGenericHandler() {
        return this.c;
    }

    public LiteBansModule_353 c() {
        LiteBansModule_353 jS2;
        LiteBansModule_353 jS3 = jS2 = this;
        boolean flag = false;
        ServerLoginConnectionEvents.QUERY_START.register(jS3::BaseCoreGenericHandler);
        return jS2;
    }

    public final void BaseCoreGenericHandler(@NotNull class_3248 class_32482, @NotNull MinecraftServer minecraftServer, @NotNull LoginPacketSender loginPacketSender, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer) {
        PluginModule module = this.plugin.LiteBansModule_31(AbstractModule.class);
        ObjectUtilities.LiteBansModule_31(module, "");
        LiteBansModule_247 h82 = (LiteBansModule_247)((Object)module);
        if (!(class_32482 instanceof AccessLoginData_1_21)) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        GameProfile gameProfile = ((AccessLoginData_1_21)class_32482).getProfile();
        class_2535 class_25352 = ((AccessLoginData_1_21)class_32482).getConnection();
        h82.BaseCoreGenericHandler(class_32482, loginSynchronizer, new LiteBansModule_95(gameProfile.name(), gameProfile.SQLiteDriverHandler_4().toString(), this.c.BaseCoreGenericHandler(class_25352)), class_25352);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.c();
    }

    }

