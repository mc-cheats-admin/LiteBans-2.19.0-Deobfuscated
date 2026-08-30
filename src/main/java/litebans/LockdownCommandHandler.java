package litebans;

import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

public final class LockdownCommandHandler
implements LiteBansModule_428 {
    private final PlatformPlugin c;
    private final BroadcastService LiteBansModule_31;
        public LockdownCommandHandler(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
        this.LiteBansModule_31 = (BroadcastService)this.c.BaseCoreGenericHandler(BroadcastService.class);
    }

    @EventHandler(priority=-64)
    public final void BaseCoreGenericHandler(@NotNull ServerConnectEvent v1) {
        block12: {
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
            v4 = ((GetcancelreasoncomponentsHandler)v1).LiteBansModule_31(this.c).getProxy();
            v5 = v3;
            ObjectUtilities.BaseCoreGenericHandler(v2);
            v6 = v2;
            v7 = "litebans.lockdown.bypass";
            v8 = v6;
            if (!(v8.e((String)v7) == false)) break block12;
            v6 = v1.getTarget().getName();
            v7 = v5;
            if (LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(v7.BaseCoreGenericHandler())) ** GOTO lbl-1000
            v8 = v7;
            v9 = (MessageHandler)v7;
            v9 = ((DatabaseMonitorService)v9.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            if (StringUtilities.BaseCoreGenericHandler(v8.BaseCoreGenericHandler(), (String)v9, true)) lbl-1000:
                        {
                v2 = true;
            } else {
                v2 = false;
            }
            if (v2) {
                ObjectUtilities.BaseCoreGenericHandler(v6);
                LitebansLockdownBypassHandler.BaseCoreGenericHandler(v5, v1, v5.BaseCoreGenericHandler((String)v6, true), false, 4, null);
            }
            v7 = v5;
            ObjectUtilities.BaseCoreGenericHandler(v6);
            v10 = v6;
            if (StringUtilities.BaseCoreGenericHandler(v7.BaseCoreGenericHandler(), (String)v10, true)) {
                v7 = v5.BaseCoreGenericHandler((String)v6, false);
                if (v2.LiteBansModule_241() == null) {
                    block11: {
                        v11 = v1.getPlayer().getPendingConnection().getListener().getServerPriority();
                        v12 = v11.iterator();
                        while (v12.hasNext()) {
                            v13 = v12.next();
                            v14 = (String)v13;
                            v15 = v5;
                            ObjectUtilities.BaseCoreGenericHandler((Object)v14);
                            v16 = v14;
                            if (!(StringUtilities.BaseCoreGenericHandler(v15.BaseCoreGenericHandler(), v16, true) == false)) continue;
                            v3 = v13;
                            break block11;
                        }
                        v3 = null;
                    }
                    v10 = v3;
                    if (v10 == null) {
                        LitebansLockdownBypassHandler.BaseCoreGenericHandler(v5, v1, (String)v7, false, 4, null);
                    } else {
                        v1.setTarget(v4.getServerInfo((String)v10));
                        v11 = v2;
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)v11, (CharSequence)v7, null, 4, null);
                    }
                } else {
                    LitebansLockdownBypassHandler.BaseCoreGenericHandler(v5, v1, null, false, 2, null);
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v2, (CharSequence)v7, null, 4, null);
                }
            }
        }
    }

    public LockdownCommandHandler LiteBansModule_31() {
        LockdownCommandHandler aP2;
        LockdownCommandHandler aP3 = aP2 = this;
        LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{aP3};
        aP3.c.LiteBansModule_31(em_0Array);
        return aP2;
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "litebans.lockdown.bypass"};
    }

    static {
        LockdownCommandHandler.BaseCoreGenericHandler();
    }
}

