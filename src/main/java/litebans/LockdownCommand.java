package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class LockdownCommand
extends AbstractCommand {
        public LockdownCommand(@NotNull PlatformPlugin plugin) {
        super("lockdown", plugin);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        ArrayList arrayList = CollectionUtilities.c(Arrays.copyOf(args, args.length));
                contextObj = GlobalHandler_2.BaseCoreGenericHandler(LiteBansModule_182.LiteBansModule_195, sender, arrayList, ((DatabaseMonitorService)((MessageHandler)contextObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService(), false, 8, null);
        Object resultObj = "local";
                helperObj = ((DatabaseMonitorService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        flag2 = false;
        CharSequence charSequence = ((LiteBansModule_182)contextObj).BaseCoreGenericHandler();
        String string = charSequence == null || charSequence.length() == 0 ? LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler((String)resultObj, (String)helperObj, sender) : ((LiteBansModule_182)contextObj).BaseCoreGenericHandler();
        String string2 = (String)CollectionUtilities.BaseCoreGenericHandler((List)arrayList, 0);
        if (string2 == null || (string2 = ((String)(targetObj = string2)).toLowerCase(Locale.ENGLISH)) == null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.cG);
            throw new CommandExitException();
        }
        contextObj = string2;
        if (arrayList.size() == 1 && LiteBansModule_5.BaseCoreGenericHandler(resultObj = new String[]{"stop", "end", "finish", "off", "disable"}).contains(contextObj)) {
            targetObj = this;
            Object tempObj = ((BroadcastService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).e();
            if (tempObj == null || (tempObj = ((LitebansLockdownBypassHandler)tempObj).c()) == null) {
                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.c);
                throw new CommandExitException();
            }
            resultObj = tempObj;
            helperObj = this;
            helperObj = (ConfigService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class);
            flag4 = false;
            if (((ConfigService)helperObj).g()) {
                ((ConfigService)helperObj).BaseCoreGenericHandler(resultObj);
            }
            helperObj = this;
            flag4 = false;
            ((BroadcastService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(string, null, true);
            return;
        }
        resultObj = MessageKey.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(arrayList, " ", null, null, 0, null, null, 62, null), true);
        helperObj = this;
        ((BroadcastService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(string, (CharSequence)resultObj, true);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"lockdown", "local", "stop", "end", "finish", "off", "disable", " "};
    }

    static {
        LockdownCommand.BaseCoreGenericHandler();
    }
}

