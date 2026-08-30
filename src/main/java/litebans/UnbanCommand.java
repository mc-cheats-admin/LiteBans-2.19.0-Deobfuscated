package litebans;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public abstract class UnbanCommand
extends AbstractCommand {
    public UnbanCommand(@NotNull String string, @NotNull PlatformPlugin plugin) {
        super(string, plugin);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @NotNull SilentHandler dZ2, @NotNull NoneHandler_2 cz2) {
        NoneHandler_2 cz3 = cz2;
        if (!cz3.PunishmentService()) {
            return;
        }
        CommandThrottleService v2 = (CommandThrottleService)ch2.e().BaseCoreGenericHandler(CommandThrottleService.class);
        List list = CollectionUtilities.e();
        if (cz3.i() != null) {
            if (cz3.m()) {
                LiteBansModule_174 eM2 = cz3.i();
                ObjectUtilities.BaseCoreGenericHandler(eM2);
                list = eM2.BaseCoreGenericHandler(cz3.D()).AsyncBackgroundTask_5();
} else {
            list = cz3.g().BaseCoreGenericHandler(cz3.D()).AsyncBackgroundTask_5();
            if (list.isEmpty()) {
                list = cz3.g().LiteBansModule_240().AsyncBackgroundTask_5();
}
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            if (StringUtilities.LiteBansModule_31(string, "console:", false, 2, null)) {
                flag2 = true;
                string2 = StringUtilities.BaseCoreGenericHandler(string2, "console:", null, 2, null);
            }
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)string2, '/', false, 2, null)) {
                string2 = string2.substring(1);
            }
            char[] cArray = new char[]{' '};
            String string3 = (String)CollectionUtilities.LiteBansModule_31(StringUtilities.BaseCoreGenericHandler((CharSequence)string2, cArray, false, 0, 6, null));
            boolean flag3 = this.plugin(string3);
            if (flag2 && !StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)"--sender", false, 2, null) && flag3) {
                string2 = string2 + " --sender-uuid=" + cz3.BaseCoreGenericHandler().BaseCoreGenericHandler() + " --sender=" + cz3.BaseCoreGenericHandler().i();
            }
            if (flag3) {
                string2 = string2 + " --stack=" + (cz2.r() + 1);
            }
            string2 = ((Object)AllHandler_3.BaseCoreGenericHandler(ch2, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)string2, dZ2, false, 2, null), cz3.AsyncBackgroundTask_22(), false, 2, null)).toString();
            string2 = GeoIPLookupService.BaseCoreGenericHandler(ch2, (CharSequence)string2, cz2);
            UnbanCommand fV2 = this;
            LiteBansModule_82 ch3 = ch2;
            ObjectUtilities.BaseCoreGenericHandler(v2);
            CommandThrottleService v3 = v2;
            Object object = fV2;
            ((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(10, (Object)string2);
            Object object2 = object = flag2 ? ch3.e().HoverTextFormatter() : fV2.AsyncBackgroundTask_5();
            if (object.e()) {
                v3.LiteBansModule_31((byte)3, object.BaseCoreGenericHandler());
            }
            ch3.e().c(new AsyncBackgroundTask_17((CommandSenderWrapper)object, string2));
}

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean BaseCoreGenericHandler(String string) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"ban")) return true;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"kick")) return true;
        MuteHandler et2 = AbstractCommand.AsyncBackgroundTask_5;
        Object[] objectArray = new String[]{"mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
        if (!ArrayUtilities.LiteBansModule_31(objectArray, string)) return false;
        return true;
    }

    public final void BaseCoreGenericHandler(@NotNull NoneHandler_2 cz2) {
        MessageHandler messageHandler = this;
        DatabaseService gn_02 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).z().c();
        if ((gn_02 != null ? gn_02.LiteBansModule_31() : null) != null) {
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, cz2.BaseCoreGenericHandler(), MessageKey.PropertyHandler, null, 4, null);
        }
        MessageHandler fg_03 = this;
        if (((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).AsyncBackgroundTask_21().BaseCoreGenericHandler() == null) {
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, cz2.BaseCoreGenericHandler(), MessageKey.aV, null, 4, null);
}

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"console:", "console:", "--sender", " --sender-uuid=", " --sender=", " --stack=", "ban", "kick", "mute", "warn", "unban", "unmute", "unwarn", "tempban", "tempmute", "ipban", "banip", "ban-ip", "ipmute", "muteip", "tempipban", "tempbanip", "tempipmute", "tempmuteip"};
}

