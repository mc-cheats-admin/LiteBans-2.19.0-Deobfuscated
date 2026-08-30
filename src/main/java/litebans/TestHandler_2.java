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

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull String string, @NotNull CommandSenderWrapper sender, boolean flag) {
        boolean flag2;
        boolean flag3;
        UUID uUID = sender.AsyncBackgroundTask_5();
                String string2 = ((ConfigService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler(sender, targetObj);
                PunishmentTableService p2 = (PunishmentTableService)this.LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
        String string3 = sender.LiteBansModule_240();
        if (string3 == null) {
            MessageHandler messageHandler = this;
            flag3 = false;
            string3 = ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        }
        contextObj = p2.BaseCoreGenericHandler(uUID, string2, string3);
        resultObj = this;
        n = 0;
        resultObj = (ConfigService)this.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        n = 100;
        flag3 = false;
        if (this.BaseCoreGenericHandler(n)) {
            Object helperObj = resultObj;
            flag2 = false;
            ((ConfigService)helperObj).BaseCoreGenericHandler((Object)("[+] Mute for " + sender.i() + " is " + contextObj));
        }
        if (contextObj == null) {
            return;
        }
        if (flag || (string).length() == 0 || string.charAt(0) != '/') {
            this.plugin(targetObj, sender, string, (SilentHandler)contextObj);
        } else {
            boolean flag5;
{
                object6 = new char[]{' '};
                resultObj = (String)StringUtilities.BaseCoreGenericHandler(string, object6, false, 0, 6, null).get(0);
                tempObj = this;
                flag2 = false;
                object6 = ((ConfigService)((MessageHandler)tempObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194();
                tempObj = null;
                Object object7 = string;
                tempObj = ((String)object7).toLowerCase(Locale.ROOT);
                if (LiteBansModule_242.BaseCoreGenericHandler(tempObj)) {
                    tempObj = LiteBansModule_242.LiteBansModule_31(tempObj);
                }
                if (StringUtilities.c(resultObj, ':', false, 2, null) && object6.InitHandler()) {
                    tempObj = this.plugin((String)tempObj);
                }
                object7 = object6.LiteBansModule_10();
                if (object7 instanceof Collection && ((Collection)object7).isEmpty()) {
                    flag5 = false;
                } else {
                    Iterator iterator = object7.iterator();
                    while (iterator.hasNext()) {
                        Object t2 = iterator.next();
                        String string4 = (String)t2;
                        if (!StringUtilities.LiteBansModule_31((String)tempObj, string4, false, 2, null)) continue;
                        flag5 = true;
                        break;
                    }
                    flag5 = false;
}
            if (flag5 || object6.LiteBansModule_9().contains(tempObj)) {
                this.plugin(targetObj, sender, string, (SilentHandler)contextObj);
}

    public static /* synthetic */ void BaseCoreGenericHandler(TestHandler_2 f82, Object targetObj, String string, CommandSenderWrapper sender, boolean flag, int n, Object contextObj) {
        if ((n & 8) != 0) {
            flag = false;
        }
        f82.BaseCoreGenericHandler(targetObj, string, sender, flag);
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
    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CommandSenderWrapper sender, @Nullable String string, @Nullable SilentHandler dZ2) {
        KickBannedHandler.BaseCoreGenericHandler(this.LiteBansModule_240().i(), targetObj, null, null, false, null, 30, null);
        if (dZ2 != null) {
                        contextObj = (PunishmentTableService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(PunishmentTableService.class);
            flag = false;
            ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
            CommandSenderWrapper senderWrapper = sender;
            try {
                chatFormatter.LiteBansModule_31().set(senderWrapper);
                PlatformPlugin plugin = ((PunishmentTableService)contextObj).BaseCoreGenericHandler;
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

