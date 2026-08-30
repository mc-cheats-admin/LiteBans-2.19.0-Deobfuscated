package litebans;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public final class PlayerJoinListener
implements LiteBansModule_88 {
    private final PlatformPlugin LiteBansModule_31;
    public PlayerJoinListener(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
    }

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        DatabaseMonitorService w2 = (DatabaseMonitorService)this.LiteBansModule_31.BaseCoreGenericHandler(DatabaseMonitorService.class);
        BroadcastService o2 = (BroadcastService)this.LiteBansModule_31.BaseCoreGenericHandler(BroadcastService.class);
        ConfigService configService = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
        LiteBansModule_158 ec_02 = this.LiteBansModule_31.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        String string = ((BungeecordHandler_2)ec_02).LiteBansModule_31(player);
        Serializable serializable = player.getAddress();
        String string2 = serializable != null && (serializable = ((InetSocketAddress)serializable).getAddress()) != null ? ((InetAddress)serializable).getHostAddress() : null;
        String string3 = player.getUniqueId().toString();
        LiteBansModule_278 hv_02 = new LiteBansModule_278();
        w2.BaseCoreGenericHandler(arg_0 -> PlayerJoinListener.BaseCoreGenericHandler(player, string3, string2, configService, o2, string, this, hv_02, w2, arg_0));
        o2.BaseCoreGenericHandler(string, string2, string3, w2.ServerSyncService(), hv_02.BaseCoreGenericHandler);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(LiteBansModule_82 ch2, CommandSenderWrapper sender, String string, String string2, String string3, SilentHandler dZ2, BroadcastService o2, ConfigService configService, LiteBansModule_82 ch3) {
        try {
            if (configService.LiteBansModule_194().aM()) {
                CharSequence charSequence = ch2.BaseCoreGenericHandler(AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_240, dZ2, false, 2, null), sender);
                o2.LiteBansModule_31(string, charSequence, true);
            }
        }
        finally {
            SilentHandler dZ3 = dZ2;
            ObjectUtilities.BaseCoreGenericHandler(dZ3);
            o2.BaseCoreGenericHandler(sender, GeoIPLookupService.BaseCoreGenericHandler(ch2, dZ3, string2, string, string3, null, -1));
        }
    }

    @Override
    public PlayerJoinListener BaseCoreGenericHandler() {
        PlayerJoinListener dy2;
        PlayerJoinListener dy3 = dy2 = this;
        boolean flag = false;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{dy3};
        dy3.LiteBansModule_31.LiteBansModule_31(em_0Array);
        return dy2;
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(Player player, String string, String string2, ConfigService configService, BroadcastService o2, String string3, PlayerJoinListener dy2, LiteBansModule_278 hv_02, DatabaseMonitorService w2, LiteBansModule_82 ch2) {
        SilentHandler dZ2;
        LiteBansModule_82 ch3 = ch2;
        CommandSenderWrapper sender = ch2.e().BaseCoreGenericHandler(player);
        SilentHandler dZ3 = AllHandler_3.BaseCoreGenericHandler(ch2, string, string2, BanHandler.LiteBansModule_240, false, false, 24, null);
        if (configService.BaseCoreGenericHandler(4)) {
            configService.BaseCoreGenericHandler((Object)("Ban: " + dZ3 + " (valid: " + (dZ3 != null) + ')'));
        }
        if (dZ3 != null) {
            if (o2.BaseCoreGenericHandler(dZ3, string3)) {
                return KotlinUnitHandler.BaseCoreGenericHandler;
            }
            ObjectUtilities.BaseCoreGenericHandler(sender);
            ObjectUtilities.BaseCoreGenericHandler(o2);
            ObjectUtilities.BaseCoreGenericHandler(configService);
            dy2.BaseCoreGenericHandler(ch2, sender, string, string3, string2, dZ3, o2, configService, ch3);
            hv_02.BaseCoreGenericHandler = true;
        }
        if (!hv_02.BaseCoreGenericHandler && configService.LiteBansModule_194().NullHandler() && (dZ2 = AllHandler_3.BaseCoreGenericHandler(ch2, string3, string, w2.ServerSyncService(), null, 8, null)) != null) {
            ObjectUtilities.BaseCoreGenericHandler(sender);
            ObjectUtilities.BaseCoreGenericHandler(o2);
            ObjectUtilities.BaseCoreGenericHandler(configService);
            dy2.BaseCoreGenericHandler(ch2, sender, string, string3, string2, dZ2, o2, configService, ch3);
            hv_02.BaseCoreGenericHandler = true;
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", "Ban: ", " (valid: "};
    }

    }

