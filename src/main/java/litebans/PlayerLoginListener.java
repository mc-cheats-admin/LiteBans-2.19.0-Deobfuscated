package litebans;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.jetbrains.annotations.NotNull;

public final class PlayerLoginListener
implements LiteBansModule_89 {
    private final PlatformPlugin BaseCoreGenericHandler;
    private final BroadcastService c;
        public PlayerLoginListener(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
        this.c = (BroadcastService)this.plugin.BaseCoreGenericHandler(BroadcastService.class);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final BroadcastService c() {
        return this.c;
    }

    @EventHandler(priority=EventPriority.LOW)
    public final void BaseCoreGenericHandler(@NotNull PlayerLoginEvent playerLoginEvent) {
        LitebansLockdownBypassHandler gG2 = this.c.e();
        if (playerLoginEvent.getResult() != PlayerLoginEvent.Result.ALLOWED || gG2 == null) {
            return;
        }
        LitebansLockdownBypassHandler gG3 = gG2;
        CommandSenderWrapper sender = gG3.LiteBansModule_241().BaseCoreGenericHandler(playerLoginEvent.getPlayer());
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object targetObj = sender;
        Object contextObj = "litebans.lockdown.bypass";
        CommandSenderWrapper senderWrapper = targetObj;
        if (!senderWrapper.e((String)contextObj)) {
            contextObj = gG3;
            flag2 = false;
            targetObj = gG2.BaseCoreGenericHandler(((DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService(), false);
            KickBannedHandler.BaseCoreGenericHandler(gG3.LiteBansModule_241().i(), playerLoginEvent, (CharSequence)targetObj, null, false, "KICK_OTHER", 12, null);
        }
    }

    public PlayerLoginListener AsyncBackgroundTask_5() {
        PlayerLoginListener ad_02;
        PlayerLoginListener ad_03 = ad_02 = this;
        LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{ad_03};
        ad_03.BaseCoreGenericHandler.LiteBansModule_31(em_0Array);
        return ad_02;
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5();
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"litebans.lockdown.bypass", "KICK_OTHER"};
    }

    static {
        PlayerLoginListener.LiteBansModule_31();
    }
}

