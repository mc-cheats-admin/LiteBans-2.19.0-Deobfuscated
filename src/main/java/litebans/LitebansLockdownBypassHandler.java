package litebans;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LitebansLockdownBypassHandler
extends MessageHandler
implements LiteBansModule_362 {
    private final CharSequence LiteBansModule_241;
    private final String LiteBansModule_195;
    private final boolean AsyncBackgroundTask_5;
    private LiteBansModule_176 e;
        public LitebansLockdownBypassHandler(@NotNull PlatformPlugin plugin, @Nullable CharSequence charSequence, @NotNull String string, boolean flag) {
        super(plugin);
        this.LiteBansModule_241 = charSequence;
        this.LiteBansModule_195 = string;
        this.AsyncBackgroundTask_5 = flag;
    }

    public final CharSequence c() {
        return this.LiteBansModule_241;
    }

    public final String BaseCoreGenericHandler() {
        return this.LiteBansModule_195;
    }

    @Override
    public void run() {
        block10: {
            v1 = this;
            if (v1.LiteBansModule_241 != null && v1.LiteBansModule_241().AsyncBackgroundTask_22() != 3) {
                v2 = v1;
                v3 = (AbstractModule)v2.LiteBansModule_241().LiteBansModule_31(AbstractModule.class);
                v0 = v1.e = v3.BaseCoreGenericHandler((LiteBansModule_362)v2);
                if (v0 != null) {
                    v0.BaseCoreGenericHandler();
                }
            }
            v1 = this;
            if (v1.LiteBansModule_241 == null) break block10;
            v2 = v1.BaseCoreGenericHandler(v1.LiteBansModule_195, false);
            v4 = v1.LiteBansModule_241().q();
            v5 = v4;
            v6 = new ArrayList<PunishmentService>();
            for (Object v7 : v5) {
                block11: {
                    v8 = (CommandSenderWrapper)v7;
                    v9 = v1;
                    v1 = v8.LiteBansModule_241();
                    if (v1 == null) {
                        v10 = v9;
                        v11 = v10;
                        v1 = ((ConfigService)v11.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25();
                    }
                    if (LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v1, v9.LiteBansModule_195)) break block11;
                    if (v9.LiteBansModule_241().AsyncBackgroundTask_22() == 0) ** GOTO lbl-1000
                    v12 = v9;
                    v13 = v12;
                    if (!LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(((ConfigService)v13.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25(), v9.LiteBansModule_195)) ** GOTO lbl-1000
                }
                v12 = v8;
                v10 = "litebans.lockdown.bypass";
                v11 = v12;
                if (v11.e((String)v10) == false) {
                    v2 = true;
                } else lbl-1000:
                                {
                    v2 = false;
                }
                if (!v2) continue;
                v6.add(v7);
            }
            v4 = (List)v6;
            v5 = v4.iterator();
            while (v5.hasNext()) {
                v6 = v5.next();
                v14 = (CommandSenderWrapper)v6;
                v15 = v1;
                v3 = (BroadcastService)v15.LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class);
                ObjectUtilities.BaseCoreGenericHandler(v14);
                v3.BaseCoreGenericHandler(v14, (String)v2);
            }
        }
        v1 = this;
        if (v1.AsyncBackgroundTask_5) {
            v2 = v1;
            if (((DatabaseMonitorService)v2.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).m()) {
                v4 = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
                if (v4 == null) {
                    v4 = v1.LiteBansModule_241().HoverTextFormatter();
                }
                v2 = v4;
                v16 = v1;
                ((DatabaseMonitorService)v16.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ServerscopeHandler(v1, (CommandSenderWrapper)v2));
            }
        }
    }

    @Override
    public void i() {
        this.LiteBansModule_241().c(this);
    }

    @Override
    public void LiteBansModule_195() {
        LitebansLockdownBypassHandler gG2 = this;
        LiteBansModule_176 em_02 = gG2.e;
        if (em_02 != null) {
            LiteBansModule_176[] em_0Array = new LiteBansModule_176[]{em_02};
            gG2.LiteBansModule_241().BaseCoreGenericHandler(em_0Array);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull String string, boolean flag) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_241().i(), targetObj, string, null, flag, "KICK_OTHER", 4, null);
    }

    public static /* synthetic */ void BaseCoreGenericHandler(LitebansLockdownBypassHandler gG2, Object targetObj, String string, boolean flag, int n, Object contextObj) {
        if ((n & 2) != 0) {
            string = "";
        }
        if ((n & 4) != 0) {
            flag = true;
        }
        gG2.BaseCoreGenericHandler(targetObj, string, flag);
    }

    public final String BaseCoreGenericHandler(@NotNull String string, boolean flag) {
        CharSequence charSequence = flag ? MessageKey.LiteBansModule_142 : MessageKey.LiteBansModule_24;
        CharSequence[] charSequenceArray = new CharSequence[4];
        charSequenceArray[0] = "reason";
        CharSequence charSequence2 = this.LiteBansModule_241;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        charSequenceArray[1] = charSequence2;
        charSequenceArray[2] = "server";
        charSequenceArray[3] = string;
        return MessageKey.BaseCoreGenericHandler(LiteBansModule_243.BaseCoreGenericHandler(charSequence, charSequenceArray), true);
    }

    @Override
    public String getName() {
        return "lockdown";
    }

    private static final void LiteBansModule_31() {
        g = new String[]{"litebans.lockdown.bypass", "KICK_OTHER", "", "reason", "", "server", "litebans.lockdown.bypass", "litebans.lockdown.bypass", "lockdown"};
    }

    static {
        LitebansLockdownBypassHandler.LiteBansModule_31();
    }
}

