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
implements LiteBansModule_426 {
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

    public final ConfigService LiteBansModule_194() {
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

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull ServerConnectedEvent serverConnectedEvent) {
        Server server;
        Object object;
        String string;
        CommandSenderWrapper sender = this.c.BaseCoreGenericHandler(serverConnectedEvent.getPlayer());
        List list = this.AsyncBackgroundTask_5.LiteBansModule_194().aj();
        if (list.contains(string = ((String)(object = (server = serverConnectedEvent.getServer()).getInfo().getName())).toLowerCase(Locale.ENGLISH))) {
            return;
        }
        object = sender;
        new LiteBansModule_221(this.c, object.i(), object.BaseCoreGenericHandler(), object.LiteBansModule_31()).run();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object object2 = sender;
        Object object3 = "litebans.exempt.dupeip_join";
        CommandSenderWrapper jv_03 = object2;
        if (!jv_03.e((String)object3)) {
            object2 = this.e;
            ObjectUtilities.BaseCoreGenericHandler(object);
            object3 = object;
            flag2 = false;
            ((AsyncBackgroundTask_22)object2).BaseCoreGenericHandler(object3.i(), object3.BaseCoreGenericHandler(), object3.LiteBansModule_31());
}

    @Override
    public MetricsService BaseCoreGenericHandler() {
        MetricsService gX2;
        MetricsService gX3 = gX2 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{gX3};
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
                q_03.BaseCoreGenericHandler((Object)("Handled login event: " + LiteBansModule_287.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " "));
}
        finally {
            loginEvent.completeIntent((Plugin)gX2.c);
}

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", "litebans.exempt.dupeip_join", "", "Handled login event: ", " ms."};
}

