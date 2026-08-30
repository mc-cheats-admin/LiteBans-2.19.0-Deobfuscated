package litebans;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import org.jetbrains.annotations.NotNull;

public final class ServerEventListener_3
implements LiteBansModule_171 {
    private final PlatformPlugin c;
    private final BroadcastService BaseCoreGenericHandler;
    public ServerEventListener_3(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
        this.plugin = (BroadcastService)this.c.BaseCoreGenericHandler(BroadcastService.class);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.c;
    }

    @Subscribe(order=PostOrder.FIRST)
    public final void BaseCoreGenericHandler(@NotNull ServerPreConnectEvent v1) {
{
            if (!v1.getResult().isAllowed()) {
                return;
            }
            v2 = this.c.BaseCoreGenericHandler(v1.getPlayer());
            v0 = this.plugin.e();
            if (v0 == null) {
                return;
            }
            v3 = v0;
            v1 = this.c;
            ObjectUtilities.LiteBansModule_31(v1, "");
            arg1 = (VelocityPlugin)v1;
            arg2 = v3;
            ObjectUtilities.BaseCoreGenericHandler(v2);
            arg3 = v2;
            arg4 = "litebans.lockdown.bypass";
            arg5 = arg3;
            if (!(arg5.e((String)arg4) == false)) break;
            arg3 = ((RegisteredServer)v1.getResult().getServer().get()).getServerInfo().getName();
            arg4 = arg2;
            if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(arg4.BaseCoreGenericHandler())) ** GOTO lbl-1000
            arg5 = arg4;
            arg6 = (MessageHandler)arg4;
            arg6 = ((DatabaseMonitorService)arg6.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            if (StringUtilities.BaseCoreGenericHandler(arg5.BaseCoreGenericHandler(), (String)arg6, true)) lbl-1000:
                        {
            } else {
            }
            if (v2) {
                ObjectUtilities.BaseCoreGenericHandler(arg3);
                LitebansLockdownBypassHandler.BaseCoreGenericHandler(arg2, v1, arg2.BaseCoreGenericHandler((String)arg3, true), false, 4, null);
            }
            arg4 = arg2;
            ObjectUtilities.BaseCoreGenericHandler(arg3);
            arg7 = arg3;
            if (StringUtilities.BaseCoreGenericHandler(arg4.BaseCoreGenericHandler(), (String)arg7, true)) {
                arg4 = arg2.BaseCoreGenericHandler((String)arg3, false);
                if (v2.LiteBansModule_240() == null) {
{
                        arg8 = arg1.c.getConfiguration().getAttemptConnectionOrder();
                        arg9 = arg8.iterator();
                        while (arg9.hasNext()) {
                            arg10 = arg9.next();
                            arg11 = (String)arg10;
                            arg12 = arg2;
                            ObjectUtilities.BaseCoreGenericHandler((Object)arg11);
                            arg13 = arg11;
                            if (!(StringUtilities.BaseCoreGenericHandler(arg12.BaseCoreGenericHandler(), arg13, true) == false)) continue;
                            v3 = arg10;
                            break;
}
                    arg7 = v3;
                    if (arg7 == null) {
                        LitebansLockdownBypassHandler.BaseCoreGenericHandler(arg2, v1, (String)arg4, false, 4, null);
                    } else {
                        v1.setResult(ServerPreConnectEvent.ServerResult.allowed((RegisteredServer)((RegisteredServer)CollectionUtilities.LiteBansModule_240(arg1.c.matchServer((String)arg7)))));
                        arg8 = v2;
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)arg8, (CharSequence)arg4, null, 4, null);
} else {
                    LitebansLockdownBypassHandler.BaseCoreGenericHandler(arg2, v1, null, false, 2, null);
                    arg7 = v2;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)arg7, (CharSequence)arg4, null, 4, null);
}

    public ServerEventListener_3 c() {
        ServerEventListener_3 jm2;
        ServerEventListener_3 jm3 = jm2 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{jm3};
        jm3.c.LiteBansModule_31(em_0Array);
        return jm2;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.c();
}

