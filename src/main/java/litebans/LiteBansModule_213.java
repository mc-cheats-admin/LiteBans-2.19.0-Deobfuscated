package litebans;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_213
extends MessageHandler {
    private final String AsyncBackgroundTask_5;
    private final String g;
    private final String LiteBansModule_195;
    private final String e;
        public LiteBansModule_213(@NotNull PlatformPlugin plugin, @Nullable String string, @NotNull String string2, @Nullable String string3, @Nullable String string4) {
        super(plugin);
        this.AsyncBackgroundTask_5 = string;
        this.g = string2;
        this.LiteBansModule_195 = string3;
        this.e = string4;
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        if (!((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().PunishmentTableService()) {
            return;
        }
        messageHandler = this;
        flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_213.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_213 g_2, LiteBansModule_83 ch2) {
        String string = g_2.e;
        if (string == null) {
            boolean flag;
            block8: {
                MessageHandler messageHandler = g_2;
                resultObj = g_2.g;
                flag = false;
                for (Object helperObj : (Object[])messageHandler.LiteBansModule_241().q()) {
                    CommandSenderWrapper sender = (CommandSenderWrapper)helperObj;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)sender.BaseCoreGenericHandler(), resultObj)) continue;
                    contextObj = helperObj;
                    break block8;
                }
                contextObj = null;
            }
            CommandSenderWrapper senderWrapper = (CommandSenderWrapper)contextObj;
            string = senderWrapper != null ? senderWrapper.LiteBansModule_241() : null;
            if (string == null) {
                MessageHandler fg_03 = g_2;
                resultObj = fg_03;
                flag = false;
                string = ((ConfigService)((MessageHandler)resultObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25();
            }
        }
        String string2 = LiteBansModule_243.BaseCoreGenericHandler(string, 32);
        SilentHandler dZ2 = null;
        dZ2 = AllHandler_3.BaseCoreGenericHandler(ch2, g_2.g, g_2.LiteBansModule_195, BanHandler.GnuSparseMapHandler, string2, false, false, 48, null);
        if (dZ2 == null && g_2.AsyncBackgroundTask_5 != null) {
            targetObj = g_2;
            if (((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().NullHandler()) {
                dZ2 = ch2.BaseCoreGenericHandler(g_2.AsyncBackgroundTask_5, g_2.g, string2, BanHandler.GnuSparseMapHandler);
            }
        }
        targetObj = g_2;
        targetObj = (ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
        n = 3;
        if (((ConfigService)targetObj).BaseCoreGenericHandler(n)) {
            Object tempObj = targetObj;
            ((ConfigService)tempObj).BaseCoreGenericHandler((Object)("Active mute for " + g_2.g + " on server " + string2 + ": " + dZ2));
        }
        if (dZ2 != null) {
            targetObj = g_2;
            n = 0;
            ((PunishmentTableService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(g_2.g, dZ2);
        } else {
            targetObj = g_2;
            n = 0;
            ((PunishmentTableService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler().LiteBansModule_31().remove(UUID.fromString(g_2.g));
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_241 = new String[]{"Active mute for ", " on server ", ": "};
    }

    static {
        LiteBansModule_213.BaseCoreGenericHandler();
    }
}

