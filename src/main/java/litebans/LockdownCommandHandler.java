package litebans;

import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

public final class LockdownCommandHandler
implements LiteBansModule_426 {
    private final PlatformPlugin c;
    private final BroadcastService LiteBansModule_31;
    public LockdownCommandHandler(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
        this.LiteBansModule_31 = this.c.BaseCoreGenericHandler(BroadcastService.class);
    }

    @EventHandler(priority=-64)
    public final void BaseCoreGenericHandler(@NotNull ServerConnectEvent v1) {
{
            if (v1.isCancelled()) {
                return;
            }
            v2 = this.c.BaseCoreGenericHandler(v1.getPlayer());
            v0 = this.LiteBansModule_31.e();
            if (v0 == null) {
                return;
            }
            v3 = v0;
            v1 = this.c.i();
            ObjectUtilities.LiteBansModule_31(v1, "");
            arg1 = ((GetcancelreasoncomponentsHandler)v1).LiteBansModule_31(this.c).getProxy();
            arg2 = v3;
            ObjectUtilities.BaseCoreGenericHandler(v2);
            arg3 = v2;
            arg4 = "litebans.lockdown.bypass";
            arg5 = arg3;
            if (!(arg5.e((String)arg4) == false)) break;
            arg3 = v1.getTarget().getName();
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
                        arg8 = v1.getPlayer().getPendingConnection().getListener().getServerPriority();
                        arg9 = arg8.iterator();
                        while (arg9.hasNext()) {
                            arg10 = arg9.next();
                            arg11 = (String)arg10;
                            arg12 = arg2;
                            ObjectUtilities.BaseCoreGenericHandler(arg11);
                            arg13 = arg11;
                            if (!(StringUtilities.BaseCoreGenericHandler(arg12.BaseCoreGenericHandler(), arg13, true) == false)) continue;
                            v3 = arg10;
                            break;
}
                    arg7 = v3;
                    if (arg7 == null) {
                        LitebansLockdownBypassHandler.BaseCoreGenericHandler(arg2, v1, (String)arg4, false, 4, null);
                    } else {
                        v1.setTarget(arg1.getServerInfo((String)arg7));
                        arg8 = v2;
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)arg8, arg4, null, 4, null);
} else {
                    LitebansLockdownBypassHandler.BaseCoreGenericHandler(arg2, v1, null, false, 2, null);
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v2, arg4, null, 4, null);
}

    public LockdownCommandHandler LiteBansModule_31() {
        LockdownCommandHandler aP2;
        LockdownCommandHandler aP3 = aP2 = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{aP3};
        aP3.c.LiteBansModule_31(em_0Array);
        return aP2;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "litebans.lockdown.bypass"};
}

