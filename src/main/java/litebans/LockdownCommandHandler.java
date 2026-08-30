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
            var4_4 = ((GetcancelreasoncomponentsHandler)v1).LiteBansModule_31(this.c).getProxy();
            var5_5 = v3;
            var6_6 = false;
            ObjectUtilities.BaseCoreGenericHandler(v2);
            var7_7 = v2;
            var8_8 = "litebans.lockdown.bypass";
            var9_9 = false;
            var10_11 = var7_7;
            var11_14 = false;
            if (!(var10_11.e((String)var8_8) == false)) break block12;
            var7_7 = v1.getTarget().getName();
            var8_8 = var5_5;
            var9_9 = false;
            if (LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(var8_8.BaseCoreGenericHandler())) ** GOTO lbl-1000
            var10_11 = var8_8;
            var11_15 = (MessageHandler)var8_8;
            var12_16 = false;
            var11_15 = ((DatabaseMonitorService)var11_15.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
            var12_16 = false;
            if (StringUtilities.BaseCoreGenericHandler(var10_11.BaseCoreGenericHandler(), (String)var11_15, true)) lbl-1000:
            // 2 sources

            {
                v2 = true;
            } else {
                v2 = false;
            }
            if (v2) {
                ObjectUtilities.BaseCoreGenericHandler(var7_7);
                LitebansLockdownBypassHandler.BaseCoreGenericHandler(var5_5, v1, var5_5.BaseCoreGenericHandler((String)var7_7, true), false, 4, null);
            }
            var8_8 = var5_5;
            ObjectUtilities.BaseCoreGenericHandler(var7_7);
            var9_10 = var7_7;
            var10_12 = false;
            if (StringUtilities.BaseCoreGenericHandler(var8_8.BaseCoreGenericHandler(), (String)var9_10, true)) {
                var8_8 = var5_5.BaseCoreGenericHandler((String)var7_7, false);
                if (v2.LiteBansModule_240() == null) {
                    block11: {
                        var10_13 = v1.getPlayer().getPendingConnection().getListener().getServerPriority();
                        var11_14 = false;
                        var12_17 = var10_13.iterator();
                        while (var12_17.hasNext()) {
                            var13_18 = var12_17.next();
                            var14_19 = (String)var13_18;
                            var15_20 = false;
                            var16_21 = var5_5;
                            ObjectUtilities.BaseCoreGenericHandler((Object)var14_19);
                            var17_22 = var14_19;
                            var18_23 = false;
                            if (!(StringUtilities.BaseCoreGenericHandler(var16_21.BaseCoreGenericHandler(), var17_22, true) == false)) continue;
                            v3 = var13_18;
                            break block11;
                        }
                        v3 = null;
                    }
                    var9_10 = v3;
                    if (var9_10 == null) {
                        LitebansLockdownBypassHandler.BaseCoreGenericHandler(var5_5, v1, (String)var8_8, false, 4, null);
                    } else {
                        v1.setTarget(var4_4.getServerInfo((String)var9_10));
                        var10_13 = v2;
                        var11_14 = false;
                        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)var10_13, (CharSequence)var8_8, null, 4, null);
                    }
                } else {
                    LitebansLockdownBypassHandler.BaseCoreGenericHandler(var5_5, v1, null, false, 2, null);
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, v2, (CharSequence)var8_8, null, 4, null);
                }
            }
        }
    }

    public LockdownCommandHandler LiteBansModule_31() {
        LockdownCommandHandler aP2;
        LockdownCommandHandler aP3 = aP2 = this;
        boolean flag = false;
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

    }

