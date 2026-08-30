package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TestHandler_2
extends MessageHandler {
    public static final TestHandler e;
    private ConcurrentHashMap AsyncBackgroundTask_5 = new ConcurrentHashMap();
    public TestHandler_2(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final ConcurrentHashMap LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    public final void BaseCoreGenericHandler(@NotNull ConcurrentHashMap concurrentHashMap) {
        this.AsyncBackgroundTask_5 = concurrentHashMap;
    }

    public final void BaseCoreGenericHandler(@NotNull Object object, @NotNull String string, @NotNull CommandSenderWrapper sender, boolean flag) {
        boolean flag2;
        boolean flag3;
        UUID uUID = sender.AsyncBackgroundTask_5();
        Object object2 = this;
        String string2 = ((ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(sender, object);
        Object object3 = this;
        PunishmentTableService p2 = (PunishmentTableService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
        String string3 = sender.LiteBansModule_240();
        if (string3 == null) {
            MessageHandler messageHandler = this;
            flag3 = false;
            string3 = ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        }
        object2 = p2.BaseCoreGenericHandler(uUID, string2, string3);
        object3 = this;
        n = 0;
        object3 = (ConfigService)((MessageHandler)object3).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        n = 100;
        flag3 = false;
        if (((ConfigService)object3).BaseCoreGenericHandler(n)) {
            Object object4 = object3;
            flag2 = false;
            ((ConfigService)object4).BaseCoreGenericHandler((Object)("[+] Mute for " + sender.i() + " is " + object2));
        }
        if (object2 == null) {
            return;
        }
        if (flag || ((CharSequence)string).length() == 0 || string.charAt(0) != '/') {
            this.plugin(object, sender, string, (SilentHandler)object2);
        } else {
            boolean flag5;
            Object object5;
            Object object6;
{
                object6 = new char[]{' '};
                object3 = (String)StringUtilities.BaseCoreGenericHandler((CharSequence)string, object6, false, 0, 6, null).get(0);
                object5 = this;
                flag2 = false;
                object6 = ((ConfigService)((MessageHandler)object5).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                object5 = null;
                Object object7 = string;
                object5 = ((String)object7).toLowerCase(Locale.ROOT);
                if (LiteBansModule_242.BaseCoreGenericHandler((CharSequence)object5)) {
                    object5 = LiteBansModule_242.LiteBansModule_31((CharSequence)object5);
                }
                if (StringUtilities.c((CharSequence)object3, ':', false, 2, null) && object6.InitHandler()) {
                    object5 = this.plugin((String)object5);
                }
                object7 = object6.LiteBansModule_10();
                if (object7 instanceof Collection && ((Collection)object7).isEmpty()) {
                    flag5 = false;
                } else {
                    Iterator iterator = object7.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        String string4 = (String)t2;
                        if (!StringUtilities.LiteBansModule_31((String)object5, string4, false, 2, null)) continue;
                        flag5 = true;
                        break;
                    }
                    flag5 = false;
}
            if (flag5 || object6.LiteBansModule_9().contains(object5)) {
                this.plugin(object, sender, string, (SilentHandler)object2);
}

    public static /* synthetic */ void BaseCoreGenericHandler(TestHandler_2 f82, Object object, String string, CommandSenderWrapper sender, boolean flag, int n, Object object2) {
        if ((n & 8) != 0) {
            flag = false;
        }
        f82.BaseCoreGenericHandler(object, string, sender, flag);
    }

    private final String BaseCoreGenericHandler(String string) {
        CharSequence charSequence = string;
        NativepatternHandler hN2 = new NativepatternHandler("^/[^ ]+:");
        String string2 = "/";
        return hN2.BaseCoreGenericHandler(charSequence, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void BaseCoreGenericHandler(@NotNull Object object, @NotNull CommandSenderWrapper sender, @Nullable String string, @Nullable SilentHandler dZ2) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), object, null, null, false, null, 30, null);
        if (dZ2 != null) {
            Object object2 = this;
            object2 = (PunishmentTableService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
            flag = false;
            ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
            CommandSenderWrapper jv_03 = sender;
            try {
                chatFormatter.LiteBansModule_31().set(jv_03);
                PlatformPlugin plugin = ((PunishmentTableService)object2).BaseCoreGenericHandler;
                CharSequence charSequence = string;
                ObjectUtilities.BaseCoreGenericHandler(charSequence);
                new MutedplayerHandler(plugin, dZ2, charSequence).run();
            }
            finally {
                chatFormatter.LiteBansModule_31().remove();
}

    static {
        TestHandler_2.BaseCoreGenericHandler();
        e = new TestHandler(null);
}

