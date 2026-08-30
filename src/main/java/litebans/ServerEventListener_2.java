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
implements LiteBansModule_171 {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private final AsyncBackgroundTask_22 LiteBansModule_194;
    private final ConfigService BaseCoreGenericHandler;
    private final BroadcastService c;
    private final DatabaseMonitorService LiteBansModule_31;
    public ServerEventListener_2(@NotNull PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
        this.LiteBansModule_194 = (AsyncBackgroundTask_22)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(AsyncBackgroundTask_22.class);
        this.plugin = (ConfigService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(ConfigService.class);
        this.c = (BroadcastService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(BroadcastService.class);
        this.LiteBansModule_31 = (DatabaseMonitorService)this.AsyncBackgroundTask_5.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public final PlatformPlugin AsyncBackgroundTask_5() {
        return this.AsyncBackgroundTask_5;
    }

    public final AsyncBackgroundTask_22 e() {
        return this.LiteBansModule_194;
    }

    public final ConfigService BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final BroadcastService g() {
        return this.c;
    }

    public final DatabaseMonitorService LiteBansModule_194() {
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
        Object object;
        String string;
        CommandSenderWrapper sender = this.AsyncBackgroundTask_5.BaseCoreGenericHandler(serverConnectedEvent.getPlayer());
        List list = this.plugin.LiteBansModule_194().aj();
        if (list.contains(string = ((String)(object = (registeredServer = serverConnectedEvent.getServer()).getServerInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        object = sender;
        new LiteBansModule_221(this.AsyncBackgroundTask_5, object.i(), object.BaseCoreGenericHandler(), object.LiteBansModule_31()).run();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object object2 = sender;
        Object object3 = "litebans.exempt.dupeip_join";
        CommandSenderWrapper jv_03 = object2;
        if (!jv_03.e((String)object3)) {
            object2 = this.LiteBansModule_194;
            ObjectUtilities.BaseCoreGenericHandler(object);
            object3 = object;
            flag2 = false;
            ((AsyncBackgroundTask_22)object2).BaseCoreGenericHandler(object3.i(), object3.BaseCoreGenericHandler(), object3.LiteBansModule_31());
}

    public ServerEventListener_2 LiteBansModule_31() {
        ServerEventListener_2 d12;
        ServerEventListener_2 d13 = d12 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{d13};
        d13.AsyncBackgroundTask_5.LiteBansModule_31(em_0Array);
        return d12;
    }

    private static final void BaseCoreGenericHandler(ServerEventListener_2 d12, ServerPreConnectEvent serverPreConnectEvent) {
        d12.c.c().LiteBansModule_31(serverPreConnectEvent);
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    private static final void c() {
        e = new String[]{"litebans.exempt.dupeip_join"};
}

