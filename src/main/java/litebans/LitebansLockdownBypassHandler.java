package litebans;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LitebansLockdownBypassHandler
extends MessageHandler
implements LiteBansModule_360 {
    private final CharSequence LiteBansModule_240;
    private final String LiteBansModule_194;
    private final boolean AsyncBackgroundTask_5;
    private LiteBansModule_175 e;
    public LitebansLockdownBypassHandler(@NotNull PlatformPlugin plugin, @Nullable CharSequence charSequence, @NotNull String string, boolean flag) {
        super(plugin);
        this.LiteBansModule_240 = charSequence;
        this.LiteBansModule_194 = string;
        this.AsyncBackgroundTask_5 = flag;
    }

    public final CharSequence c() {
        return this.LiteBansModule_240;
    }

    public final String BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    @Override
    public void run() {
        block10: {
            v1 = this;
            v2 = false;
            if (v1.LiteBansModule_240 != null && v1.LiteBansModule_240().AsyncBackgroundTask_22() != 3) {
                v3 = v1;
                var4_4 = false;
                v5 = (AbstractModule)v3.LiteBansModule_240().LiteBansModule_31(AbstractModule.class);
                v0 = v1.e = v5.BaseCoreGenericHandler((LiteBansModule_360)v3);
                if (v0 != null) {
                    v0.BaseCoreGenericHandler();
                }
            }
            v1 = this;
            v2 = false;
            if (v1.LiteBansModule_240 == null) break block10;
            v3 = v1.BaseCoreGenericHandler(v1.LiteBansModule_194, false);
            v4 = v1.LiteBansModule_240().q();
            var5_8 = false;
            var6_10 = v4;
            var7_11 = new ArrayList<PunishmentService>();
            var8_12 = false;
            for (Object var11_17 : var6_10) {
                block11: {
                    var12_19 = (CommandSenderWrapper)var11_17;
                    var13_20 = false;
                    var14_21 = v1;
                    var15_22 = false;
                    v1 = var12_19.LiteBansModule_240();
                    if (v1 == null) {
                        var16_23 = var14_21;
                        var17_25 = false;
                        var18_27 = var16_23;
                        var19_29 = false;
                        v1 = ((ConfigService)var18_27.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25();
                    }
                    if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(v1, var14_21.LiteBansModule_194)) break block11;
                    if (var14_21.LiteBansModule_240().AsyncBackgroundTask_22() == 0) ** GOTO lbl-1000
                    var20_30 = var14_21;
                    var16_24 = false;
                    var17_26 = var20_30;
                    var18_28 = false;
                    if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(((ConfigService)var17_26.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25(), var14_21.LiteBansModule_194)) ** GOTO lbl-1000
                }
                var20_30 = var12_19;
                var16_23 = "litebans.lockdown.bypass";
                var17_25 = false;
                var18_27 = var20_30;
                var19_29 = false;
                if (var18_27.e((String)var16_23) == false) {
                    v2 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v2 = false;
                }
                if (!v2) continue;
                var7_11.add(var11_17);
            }
            v4 = (List)var7_11;
            var5_8 = false;
            var6_10 = v4.iterator();
            while (var6_10.hasNext()) {
                var7_11 = var6_10.next();
                var8_13 = (CommandSenderWrapper)var7_11;
                var9_14 = 0;
                var10_16 = v1;
                var11_18 = false;
                v3 = (BroadcastService)var10_16.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                ObjectUtilities.BaseCoreGenericHandler(var8_13);
                v3.BaseCoreGenericHandler(var8_13, (String)v3);
            }
        }
        v1 = this;
        v2 = false;
        if (v1.AsyncBackgroundTask_5) {
            v3 = v1;
            var4_4 = false;
            if (((DatabaseMonitorService)v3.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).m()) {
                v4 = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
                if (v4 == null) {
                    v4 = v1.LiteBansModule_240().HoverTextFormatter();
                }
                v3 = v4;
                var4_6 = v1;
                var5_9 = false;
                ((DatabaseMonitorService)var4_6.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ServerscopeHandler(v1, (CommandSenderWrapper)v3));
            }
        }
    }

    @Override
    public void i() {
        this.LiteBansModule_240().c(this);
    }

    @Override
    public void LiteBansModule_194() {
        LitebansLockdownBypassHandler gG2 = this;
        boolean flag = false;
        LiteBansModule_175 em_02 = gG2.e;
        if (em_02 != null) {
            LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{em_02};
            gG2.LiteBansModule_240().BaseCoreGenericHandler(em_0Array);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull Object object, @NotNull String string, boolean flag) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), object, string, null, flag, "KICK_OTHER", 4, null);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LitebansLockdownBypassHandler gG2, Object object, String string, boolean flag, int n, Object object2) {
        if ((n & 2) != 0) {
            string = "";
        }
        if ((n & 4) != 0) {
            flag = true;
        }
        gG2.BaseCoreGenericHandler(object, string, flag);
    }

    public final String BaseCoreGenericHandler(@NotNull String string, boolean flag) {
        CharSequence charSequence = flag ? MessageKey.LiteBansModule_141 : MessageKey.LiteBansModule_24;
        CharSequence[] charSequenceArray = new CharSequence[4];
        charSequenceArray[0] = "reason";
        CharSequence charSequence2 = this.LiteBansModule_240;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        charSequenceArray[1] = charSequence2;
        charSequenceArray[2] = "server";
        charSequenceArray[3] = string;
        return MessageKey.BaseCoreGenericHandler(LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray), true);
    }

    @Override
    public String getName() {
        return "lockdown";
    }

    private static final void LiteBansModule_31() {
        g = new String[]{"litebans.lockdown.bypass", "KICK_OTHER", "", "reason", "", "server", "litebans.lockdown.bypass", "litebans.lockdown.bypass", "lockdown"};
    }

    }

