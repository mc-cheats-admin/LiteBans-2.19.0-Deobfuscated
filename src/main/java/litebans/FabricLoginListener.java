package litebans;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.server.network.ServerLoginPacketListenerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=3)
public final class FabricLoginListener
extends AbstractModule
implements LiteBansModule_247 {
    public FabricLoginListener(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        this.plugin.r();
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 3 && !StackTraceAnalyzer.BaseCoreGenericHandler("net.minecraft.class_3248");
    }

    @Override
    public void e() {
    }

    @Override
    public void BaseCoreGenericHandler() {
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.BaseCoreGenericHandler();
        FabricLoginListener s_02 = this;
        PlatformPlugin plugin = s_02.BaseCoreGenericHandler;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        LiteBansModule_98 cr_02 = ((ConfigYmlHandler)plugin).g();
        PlatformPlugin pluginWrapper = s_02.BaseCoreGenericHandler;
        ObjectUtilities.BaseCoreGenericHandler(cr_02);
        new LiteBansModule_407(pluginWrapper, cr_02).c();
        if (configService.LiteBansModule_194().PunishmentTableService()) {
            new LiteBansModule_364(this.plugin).LiteBansModule_31();
}

    public final void LiteBansModule_31(@NotNull ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @NotNull ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @NotNull LiteBansModule_95 cp_02, @NotNull Connection connection) {
        BroadcastService o2 = this.plugin.BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        DatabaseMonitorService w2 = this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        PlatformPlugin plugin = this.plugin;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        ConfigYmlHandler fabricPlugin = (ConfigYmlHandler)plugin;
        LiteBansModule_422 lr_02 = new LiteBansModule_422(cp_02, serverLoginPacketListenerImpl, null, 4, null);
        loginSynchronizer.waitFor((Future)CompletableFuture.runAsync(() -> FabricLoginListener.BaseCoreGenericHandler(configService, o2, lr_02, fabricPlugin, serverLoginPacketListenerImpl, cp_02, w2)));
    }

    public void BaseCoreGenericHandler(@Nullable ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, @Nullable ServerLoginNetworking.LoginSynchronizer loginSynchronizer, @Nullable LiteBansModule_95 cp_02, @Nullable Connection connection) {
        ServerLoginPacketListenerImpl serverLoginPacketListenerImpl2 = serverLoginPacketListenerImpl;
        ObjectUtilities.BaseCoreGenericHandler(serverLoginPacketListenerImpl2);
        ServerLoginNetworking.LoginSynchronizer loginSynchronizer2 = loginSynchronizer;
        ObjectUtilities.BaseCoreGenericHandler(loginSynchronizer2);
        LiteBansModule_95 cp_03 = cp_02;
        ObjectUtilities.BaseCoreGenericHandler(cp_03);
        Connection connection2 = connection;
        ObjectUtilities.BaseCoreGenericHandler(connection2);
        this.LiteBansModule_31(serverLoginPacketListenerImpl2, loginSynchronizer2, cp_03, connection2);
    }

    private static final void BaseCoreGenericHandler(ConfigService configService, BroadcastService o2, LiteBansModule_422 lr_02, ConfigYmlHandler fabricPlugin, ServerLoginPacketListenerImpl serverLoginPacketListenerImpl, LiteBansModule_95 cp_02, DatabaseMonitorService w2) {
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
            Object contextObj = fabricPlugin.g().AsyncBackgroundTask_5().LiteBansModule_31(LiteBansModule_164.BaseCoreGenericHandler(lr_02.c(), (V116Handler)(targetObj)));
            ObjectUtilities.LiteBansModule_31(contextObj, "");
            Component component = (Component)contextObj;
            serverLoginPacketListenerImpl.disconnect(component);
        } else {
            LitebansLockdownBypassHandler gG2;
            LitebansLockdownBypassHandler gG3 = o2.e();
            if (gG3 == null) {
                return;
            }
            LitebansLockdownBypassHandler gG4 = gG2 = gG3;
            if (gG4.c() != null && fabricPlugin.AsyncBackgroundTask_5() && !((Boolean)Permissions.check((UUID)UUID.fromString(cp_02.g()), (String)"litebans.lockdown.bypass").get()).booleanValue()) {
                String string = gG2.BaseCoreGenericHandler(w2.ServerSyncService(), false);
                Object resultObj = fabricPlugin.g().AsyncBackgroundTask_5().LiteBansModule_31(LiteBansModule_164.BaseCoreGenericHandler(string, (V116Handler)(targetObj)));
                ObjectUtilities.LiteBansModule_31(resultObj, "");
                Component component = (Component)resultObj;
                serverLoginPacketListenerImpl.disconnect(component);
}

    @Override
    public void BaseCoreGenericHandler(Object targetObj, Object contextObj, Object resultObj, Object helperObj) {
        this.plugin((ServerLoginPacketListenerImpl)targetObj, (ServerLoginNetworking.LoginSynchronizer)contextObj, (LiteBansModule_95)resultObj, (Connection)helperObj);
}

