package litebans;

import java.util.List;
import java.util.Locale;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

public final class MetricsService
implements LiteBansModule_428 {
    private final PlatformPlugin c;
    private final AsyncBackgroundTask_22 e;
    private final ConfigService AsyncBackgroundTask_5;
    private final BroadcastService LiteBansModule_31;
        public MetricsService(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
        this.e = (AsyncBackgroundTask_22)this.c.BaseCoreGenericHandler(AsyncBackgroundTask_22.class);
        this.AsyncBackgroundTask_5 = (ConfigService)this.c.BaseCoreGenericHandler(ConfigService.class);
        this.LiteBansModule_31 = (BroadcastService)this.c.BaseCoreGenericHandler(BroadcastService.class);
        this.AsyncBackgroundTask_5.e();
    }

    public final PlatformPlugin AsyncBackgroundTask_5() {
        return this.c;
    }

    public final AsyncBackgroundTask_22 e() {
        return this.e;
    }

    public final ConfigService LiteBansModule_195() {
        return this.AsyncBackgroundTask_5;
    }

    public final BroadcastService c() {
        return this.LiteBansModule_31;
    }

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull LoginEvent loginEvent) {
        if (loginEvent.isCancelled()) {
            return;
        }
        PlatformPlugin plugin = this.c;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        loginEvent.registerIntent((Plugin)((BungeePlugin)plugin));
        ((BungeePlugin)this.c).BaseCoreGenericHandler(() -> MetricsService.BaseCoreGenericHandler(this, loginEvent));
    }

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull ServerConnectEvent serverConnectEvent) {
        if (!serverConnectEvent.isCancelled()) {
            this.LiteBansModule_31.c().LiteBansModule_31(serverConnectEvent);
        }
    }

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull ServerConnectedEvent serverConnectedEvent) {
        Server server;
        String string;
        CommandSenderWrapper sender = this.c.BaseCoreGenericHandler(serverConnectedEvent.getPlayer());
        List list = this.AsyncBackgroundTask_5.LiteBansModule_195().aj();
        if (list.contains(string = ((String)(targetObj = (server = serverConnectedEvent.getServer()).getInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        targetObj = sender;
        new LiteBansModule_222(this.c, targetObj.i(), targetObj.BaseCoreGenericHandler(), targetObj.LiteBansModule_31()).run();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object contextObj = sender;
        Object resultObj = "litebans.exempt.dupeip_join";
        CommandSenderWrapper senderWrapper = contextObj;
        if (!senderWrapper.e((String)resultObj)) {
            contextObj = this.e;
            ObjectUtilities.BaseCoreGenericHandler(targetObj);
            resultObj = targetObj;
            flag2 = false;
            ((AsyncBackgroundTask_22)contextObj).BaseCoreGenericHandler(resultObj.i(), resultObj.BaseCoreGenericHandler(), resultObj.LiteBansModule_31());
        }
    }

    @Override
    public MetricsService BaseCoreGenericHandler() {
        MetricsService gX2;
        MetricsService gX3 = gX2 = this;
        LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{gX3};
        gX3.c.LiteBansModule_31(em_0Array);
        return gX2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(MetricsService gX2, LoginEvent loginEvent) {
        try {
            long l3 = System.nanoTime();
            GeoIPLookupService_3 gu2 = gX2.LiteBansModule_31.c();
            ObjectUtilities.LiteBansModule_31(gu2, "");
            KickOtherHandler gx_02 = (KickOtherHandler)gu2;
            gx_02.BaseCoreGenericHandler(loginEvent);
            ConfigService configService = gX2.AsyncBackgroundTask_5;
            int n = 1;
            if (configService.BaseCoreGenericHandler(n)) {
                ConfigService q_03 = configService;
                q_03.BaseCoreGenericHandler((Object)("Handled login event: " + LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " "));
            }
        }
        finally {
            loginEvent.completeIntent((Plugin)gX2.c);
        }
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", "litebans.exempt.dupeip_join", "", "Handled login event: ", " ms."};
    }

    static {
        MetricsService.LiteBansModule_31();
    }
}

