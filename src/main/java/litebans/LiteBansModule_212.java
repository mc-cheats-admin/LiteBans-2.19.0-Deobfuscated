package litebans;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_212
extends MessageHandler {
    private final String AsyncBackgroundTask_5;
    private final String g;
    private final String LiteBansModule_194;
    private final String e;
    public LiteBansModule_212(@NotNull PlatformPlugin plugin, @Nullable String string, @NotNull String string2, @Nullable String string3, @Nullable String string4) {
        super(plugin);
        this.AsyncBackgroundTask_5 = string;
        this.g = string2;
        this.LiteBansModule_194 = string3;
        this.e = string4;
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        if (!((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().PunishmentTableService()) {
            return;
        }
        messageHandler = this;
        flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_212.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_212 g_2, LiteBansModule_82 ch2) {
        Object object;
        String string = g_2.e;
        if (string == null) {
            Object object2;
            boolean flag;
            Object object3;
{
                MessageHandler messageHandler = g_2;
                object3 = g_2.g;
                flag = false;
                for (Object object4 : (Object[])messageHandler.LiteBansModule_240().q()) {
                    CommandSenderWrapper sender = (CommandSenderWrapper)object4;
                    if (!ObjectUtilities.BaseCoreGenericHandler((Object)sender.BaseCoreGenericHandler(), object3)) continue;
                    object2 = object4;
                    break;
                }
                object2 = null;
            }
            CommandSenderWrapper jv_03 = (CommandSenderWrapper)object2;
            string = jv_03 != null ? jv_03.LiteBansModule_240() : null;
            if (string == null) {
                MessageHandler fg_03 = g_2;
                object3 = fg_03;
                flag = false;
                string = ((ConfigService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25();
}
        String string2 = LiteBansModule_242.BaseCoreGenericHandler(string, 32);
        SilentHandler dZ2 = null;
        dZ2 = AllHandler_3.BaseCoreGenericHandler(ch2, g_2.g, g_2.LiteBansModule_194, BanHandler.GnuSparseMapHandler, string2, false, false, 48, null);
        if (dZ2 == null && g_2.AsyncBackgroundTask_5 != null) {
            object = g_2;
            if (((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().NullHandler()) {
                dZ2 = ch2.BaseCoreGenericHandler(g_2.AsyncBackgroundTask_5, g_2.g, string2, BanHandler.GnuSparseMapHandler);
}
        object = g_2;
        object = (ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        n = 3;
        if (((ConfigService)object).BaseCoreGenericHandler(n)) {
            Object object5 = object;
            ((ConfigService)object5).BaseCoreGenericHandler((Object)("Active mute for " + g_2.g + " on server " + string2 + ": " + dZ2));
        }
        if (dZ2 != null) {
            object = g_2;
            n = 0;
            ((PunishmentTableService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler(g_2.g, dZ2);
        } else {
            object = g_2;
            n = 0;
            ((PunishmentTableService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class)).BaseCoreGenericHandler().LiteBansModule_31().remove(UUID.fromString(g_2.g));
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

