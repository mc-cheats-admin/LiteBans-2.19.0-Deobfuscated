package litebans;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.jetbrains.annotations.NotNull;

public final class PlayerLoginListener
implements LiteBansModule_88 {
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
        CommandSenderWrapper sender = gG3.LiteBansModule_240().BaseCoreGenericHandler(playerLoginEvent.getPlayer());
        ObjectUtilities.BaseCoreGenericHandler(sender);
        Object object = sender;
        Object object2 = "litebans.lockdown.bypass";
        CommandSenderWrapper jv_03 = object;
        if (!jv_03.e((String)object2)) {
            object2 = gG3;
            flag2 = false;
            object = gG2.BaseCoreGenericHandler(((DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService(), false);
            KickBannedHandler.BaseCoreGenericHandler(gG3.LiteBansModule_240().i(), playerLoginEvent, (CharSequence)object, null, false, "KICK_OTHER", 12, null);
}

    public PlayerLoginListener AsyncBackgroundTask_5() {
        PlayerLoginListener ad_02;
        PlayerLoginListener ad_03 = ad_02 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{ad_03};
        ad_03.BaseCoreGenericHandler.LiteBansModule_31(em_0Array);
        return ad_02;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5();
}

