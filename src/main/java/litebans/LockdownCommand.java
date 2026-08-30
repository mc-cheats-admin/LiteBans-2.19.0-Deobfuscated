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
        Object object;
        ArrayList arrayList = CollectionUtilities.c(Arrays.copyOf(args, args.length));
        Object object2 = this;
        object2 = GlobalHandler_2.BaseCoreGenericHandler(LiteBansModule_181.LiteBansModule_194, sender, arrayList, ((DatabaseMonitorService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService(), false, 8, null);
        Object object3 = "local";
        Object object4 = this;
        object4 = ((DatabaseMonitorService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService();
        flag2 = false;
        CharSequence charSequence = ((LiteBansModule_181)object2).BaseCoreGenericHandler();
        String string = charSequence == null || charSequence.length() == 0 ? LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler((String)object3, (String)object4, sender) : ((LiteBansModule_181)object2).BaseCoreGenericHandler();
        String string2 = (String)CollectionUtilities.BaseCoreGenericHandler((List)arrayList, 0);
        if (string2 == null || (string2 = ((String)(object = string2)).toLowerCase(Locale.ENGLISH)) == null) {
            MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.cG);
            throw new CommandExitException();
        }
        object2 = string2;
        if (arrayList.size() == 1 && LiteBansModule_5.BaseCoreGenericHandler(object3 = new String[]{"stop", "end", "finish", "off", "disable"}).contains(object2)) {
            object = this;
            Object object5 = ((BroadcastService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).e();
            if (object5 == null || (object5 = ((LitebansLockdownBypassHandler)object5).c()) == null) {
                MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.c);
                throw new CommandExitException();
            }
            object3 = object5;
            object4 = this;
            object4 = (ConfigService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            flag4 = false;
            if (((ConfigService)object4).g()) {
                ((ConfigService)object4).BaseCoreGenericHandler(object3);
            }
            object4 = this;
            flag4 = false;
            ((BroadcastService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(string, null, true);
            return;
        }
        object3 = MessageKey.BaseCoreGenericHandler(CollectionUtilities.BaseCoreGenericHandler(arrayList, " ", null, null, 0, null, null, 62, null), true);
        object4 = this;
        ((BroadcastService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(BroadcastService.class)).BaseCoreGenericHandler(string, (CharSequence)object3, true);
    }

    private static final void BaseCoreGenericHandler() {
        i = new String[]{"lockdown", "local", "stop", "end", "finish", "off", "disable", " "};
}

