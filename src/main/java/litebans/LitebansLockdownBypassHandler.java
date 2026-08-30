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
{
                        if (v1.LiteBansModule_240 != null && v1.LiteBansModule_240().AsyncBackgroundTask_22() != 3) {
                v3 = v1;
                v5 = (AbstractModule)v3.LiteBansModule_240().LiteBansModule_31(AbstractModule.class);
                v0 = v1.e = v5.BaseCoreGenericHandler((LiteBansModule_360)v3);
                if (v0 != null) {
                    v0.BaseCoreGenericHandler();
}
                        if (v1.LiteBansModule_240 == null) break;
            v3 = v1.BaseCoreGenericHandler(v1.LiteBansModule_194, false);
            v4 = v1.LiteBansModule_240().q();
            arg1 = v4;
            arg2 = new ArrayList<PunishmentService>();
            for (Object arg3 : arg1) {
{
                    arg4 = (CommandSenderWrapper)arg3;
                    arg5 = v1;
                    v1 = arg4.LiteBansModule_240();
                    if (v1 == null) {
                        arg6 = arg5;
                        arg7 = arg6;
                        v1 = ((ConfigService)arg7.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25();
                    }
                    if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(v1, arg5.LiteBansModule_194)) break;
                    if (arg5.LiteBansModule_240().AsyncBackgroundTask_22() == 0) ** GOTO lbl-1000
                    arg8 = arg5;
                    arg9 = arg8;
                    if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(((ConfigService)arg9.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25(), arg5.LiteBansModule_194)) ** GOTO lbl-1000
                }
                arg8 = arg4;
                arg6 = "litebans.lockdown.bypass";
                arg7 = arg8;
                if (arg7.e((String)arg6) == false) {
                } else lbl-1000:
                                {
                }
                if (!v2) continue;
                arg2.add(arg3);
            }
            v4 = (List)arg2;
            arg1 = v4.iterator();
            while (arg1.hasNext()) {
                arg2 = arg1.next();
                arg10 = (CommandSenderWrapper)arg2;
                arg11 = v1;
                v3 = (BroadcastService)arg11.LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class);
                ObjectUtilities.BaseCoreGenericHandler(arg10);
                v3.BaseCoreGenericHandler(arg10, (String)v3);
}
                if (v1.AsyncBackgroundTask_5) {
            v3 = v1;
            if (((DatabaseMonitorService)v3.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).m()) {
                v4 = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
                if (v4 == null) {
                    v4 = v1.LiteBansModule_240().HoverTextFormatter();
                }
                v3 = v4;
                arg12 = v1;
                ((DatabaseMonitorService)arg12.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(new ServerscopeHandler(v1, (CommandSenderWrapper)v3));
}

    @Override
    public void i() {
        this.LiteBansModule_240().c(this);
    }

    @Override
    public void LiteBansModule_194() {
        LitebansLockdownBypassHandler gG2 = this;
        LiteBansModule_175 em_02 = gG2.e;
        if (em_02 != null) {
            LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{em_02};
            gG2.LiteBansModule_240().BaseCoreGenericHandler(em_0Array);
}

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull String string, boolean flag) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), targetObj, string, null, flag, "KICK_OTHER", 4, null);
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

