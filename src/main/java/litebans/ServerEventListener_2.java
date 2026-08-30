package litebans;

import com.velocitypowered.api.event.EventTask;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.ServerConnectedEvent;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class ServerEventListener_2
implements LiteBansModule_172 {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private final AsyncBackgroundTask_22 LiteBansModule_195;
    private final ConfigService BaseCoreGenericHandler;
    private final BroadcastService c;
    private final DatabaseMonitorService LiteBansModule_31;
        public ServerEventListener_2(@NotNull PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
        this.LiteBansModule_195 = (AsyncBackgroundTask_22)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(AsyncBackgroundTask_22.class);
        this.plugin = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        this.c = (BroadcastService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(BroadcastService.class);
        this.LiteBansModule_31 = (DatabaseMonitorService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public final PlatformPlugin AsyncBackgroundTask_5() {
        return this.AsyncBackgroundTask_5;
    }

    public final AsyncBackgroundTask_22 e() {
        return this.LiteBansModule_195;
    }

    public final ConfigService BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final BroadcastService g() {
        return this.c;
    }

    public final DatabaseMonitorService LiteBansModule_195() {
        return this.LiteBansModule_31;
    }

    @Subscribe
    public final EventTask BaseCoreGenericHandler(@NotNull ServerPreConnectEvent serverPreConnectEvent) {
        if (!serverPreConnectEvent.getResult().isAllowed()) {
            return null;
        }
        return EventTask.async(() -> ServerEventListener_2.BaseCoreGenericHandler(this, serverPreConnectEvent));
    }

    @Subscribe
    public final void BaseCoreGenericHandler(@NotNull ServerConnectedEvent serverConnectedEvent) {
        RegisteredServer registeredServer;
        String string;
        CommandSenderWrapper sender = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(serverConnectedEvent.getPlayer());
        List list = this.plugin.LiteBansModule_195().aj();
        if (list.contains(string = ((String)(targetObj = (registeredServer = serverConnectedEvent.getServer()).getServerInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        targetObj = sender;
        new LiteBansModule_222(this.AsyncBackgroundTask_5, targetObj.i(), targetObj.BaseCoreGenericHandler(), targetObj.LiteBansModule_31()).run();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object contextObj = sender;
        Object resultObj = "litebans.exempt.dupeip_join";
        CommandSenderWrapper senderWrapper = contextObj;
        if (!senderWrapper.e((String)resultObj)) {
            contextObj = this.LiteBansModule_195;
            ObjectUtilities.BaseCoreGenericHandler(targetObj);
            resultObj = targetObj;
            flag2 = false;
            ((AsyncBackgroundTask_22)contextObj).BaseCoreGenericHandler(resultObj.i(), resultObj.BaseCoreGenericHandler(), resultObj.LiteBansModule_31());
        }
    }

    public ServerEventListener_2 LiteBansModule_31() {
        ServerEventListener_2 d12;
        ServerEventListener_2 d13 = d12 = this;
        LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{d13};
        d13.AsyncBackgroundTask_5.LiteBansModule_31(em_0Array);
        return d12;
    }

    private static final void BaseCoreGenericHandler(ServerEventListener_2 d12, ServerPreConnectEvent serverPreConnectEvent) {
        d12.c.c().LiteBansModule_31(serverPreConnectEvent);
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    private static final void c() {
        e = new String[]{"litebans.exempt.dupeip_join"};
    }

    static {
        ServerEventListener_2.c();
    }
}

