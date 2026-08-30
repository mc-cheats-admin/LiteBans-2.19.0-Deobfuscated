package litebans;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_3248;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=3)
public final class FabricNetworkHandler
extends AbstractModule
implements LiteBansModule_248 {
        public FabricNetworkHandler(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        this.plugin.r();
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 3 && StackTraceAnalyzer.BaseCoreGenericHandler("net.minecraft.class_3248");
    }

    @Override
    public void e() {
    }

    @Override
    public void BaseCoreGenericHandler() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.BaseCoreGenericHandler();
        FabricNetworkHandler t_02 = this;
        PlatformPlugin plugin = t_02.BaseCoreGenericHandler;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        LiteBansModule_99 cr_02 = ((ConfigYmlHandler)plugin).g();
        if (!t_02.BaseCoreGenericHandler.BaseCoreGenericHandler("net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule", new LiteBansModule_276(t_02, cr_02)) && !t_02.BaseCoreGenericHandler.BaseCoreGenericHandler("net.fabricmc.fabric.api.networking.v1.LoginPacketSender", new LiteBansModule_84(t_02, cr_02))) {
            PlatformPlugin pluginWrapper = t_02.BaseCoreGenericHandler;
            ObjectUtilities.BaseCoreGenericHandler(cr_02);
            new LiteBansModule_303(pluginWrapper, cr_02).c();
        }
        if (configService.LiteBansModule_195().PunishmentTableService()) {
            new LiteBansModule_111(this.plugin).BaseCoreGenericHandler();
        }
    }

    public final void LiteBansModule_31(@NotNull class_3248 class_32482, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @NotNull LiteBansModule_96 cp_02, @NotNull class_2535 class_25352) {
        BroadcastService o2 = (BroadcastService)this.plugin.BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        PlatformPlugin plugin = this.plugin;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        ConfigYmlHandler fabricPlugin = (ConfigYmlHandler)plugin;
        LiteBansModule_424 lr_02 = new LiteBansModule_424(cp_02, class_32482, null, 4, null);
        loginSynchronizer.waitFor((Future)CompletableFuture.runAsync(() -> FabricNetworkHandler.BaseCoreGenericHandler(configService, o2, lr_02, fabricPlugin, class_32482, cp_02, w2)));
    }

    public void BaseCoreGenericHandler(@Nullable class_3248 class_32482, @Nullable ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @Nullable LiteBansModule_96 cp_02, @Nullable class_2535 class_25352) {
        class_3248 class_32483 = class_32482;
        ObjectUtilities.BaseCoreGenericHandler(class_32483);
        ServerLoginNetworking.LoginSynchronizer loginSynchronizer2 = loginSynchronizer;
        ObjectUtilities.BaseCoreGenericHandler(loginSynchronizer2);
        LiteBansModule_96 cp_03 = cp_02;
        ObjectUtilities.BaseCoreGenericHandler(cp_03);
        class_2535 class_25353 = class_25352;
        ObjectUtilities.BaseCoreGenericHandler(class_25353);
        this.LiteBansModule_31(class_32483, loginSynchronizer2, cp_03, class_25353);
    }

    private static final void BaseCoreGenericHandler(ConfigService configService, BroadcastService o2, LiteBansModule_424 lr_02, ConfigYmlHandler fabricPlugin, class_3248 class_32482, LiteBansModule_96 cp_02, DatabaseMonitorService w2) {
        Object targetObj = configService;
        if (targetObj.g()) {
            ConfigService q_03 = targetObj;
            q_03.BaseCoreGenericHandler((Object)("Login " + cp_02));
        }
        o2.c().LiteBansModule_31(lr_02);
        targetObj = null;
        targetObj = V116Handler.BaseCoreGenericHandler;
        if (fabricPlugin.LiteBansModule_31() < 770) {
            targetObj = V116Handler.c;
        }
        if (lr_02.c() != null) {
            Object contextObj = fabricPlugin.g().AsyncBackgroundTask_5().LiteBansModule_31(LiteBansModule_165.BaseCoreGenericHandler(lr_02.c(), (V116Handler)((Object)targetObj)));
            ObjectUtilities.LiteBansModule_31(contextObj, "");
            class_2561 class_25612 = (class_2561)contextObj;
            class_32482.method_14380(class_25612);
        } else {
            LitebansLockdownBypassHandler gG2;
            LitebansLockdownBypassHandler gG3 = o2.e();
            if (gG3 == null) {
                return;
            }
            LitebansLockdownBypassHandler gG4 = gG2 = gG3;
            if (gG4.c() != null && fabricPlugin.AsyncBackgroundTask_5() && !((Boolean)Permissions.check((UUID)UUID.fromString(cp_02.g()), (String)"litebans.lockdown.bypass").get()).booleanValue()) {
                String string = gG2.BaseCoreGenericHandler(w2.ServerSyncService(), false);
                Object resultObj = fabricPlugin.g().AsyncBackgroundTask_5().LiteBansModule_31(LiteBansModule_165.BaseCoreGenericHandler(string, (V116Handler)((Object)targetObj)));
                ObjectUtilities.LiteBansModule_31(resultObj, "");
                class_2561 class_25613 = (class_2561)resultObj;
                class_32482.method_14380(class_25613);
            }
        }
    }

    @Override
    public void BaseCoreGenericHandler(Object targetObj, Object contextObj, Object resultObj, Object helperObj) {
        this.plugin((class_3248)targetObj, (ServerLoginNetworking.LoginSynchronizer)contextObj, (LiteBansModule_96)resultObj, (class_2535)helperObj);
    }

    private static final void AsyncBackgroundTask_5() {
        LiteBansModule_31 = new String[]{"net.minecraft.class_3248", "", "net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule", "net.fabricmc.fabric.api.networking.v1.LoginPacketSender", "", "net.fabricmc.fabric.impl.gamerule.rpc.FabricTypedRule", "net.fabricmc.fabric.api.networking.v1.LoginPacketSender", "", "Login ", "", "litebans.lockdown.bypass", ""};
    }

    static {
        FabricNetworkHandler.AsyncBackgroundTask_5();
    }
}

