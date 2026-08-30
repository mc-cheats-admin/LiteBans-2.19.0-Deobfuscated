package litebans;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_197
extends MessageHandler {
    public LiteBansModule_197(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        boolean flag = false;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_197.BaseCoreGenericHandler(this, arg_0));
    }

    private static final void BaseCoreGenericHandler(ServerSyncService u2, LiteBansModule_349 jn2, CopyOnWriteArrayList copyOnWriteArrayList, CommandSenderWrapper sender) {
        u2.LiteBansModule_31(jn2);
        int n = copyOnWriteArrayList.size();
        if (n <= 1) {
            CommandSenderWrapper jv_03 = sender;
            CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "There are no other servers connected to this ");
            boolean flag = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_03, charSequence, null, 4, null);
        } else {
            CommandSenderWrapper jv_04 = sender;
            Object object = copyOnWriteArrayList;
            boolean flag = false;
            Collection collection = object;
            object = LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13") + BlackHandler.m + n + BlackHandler.i + " servers connected to this database: " + LiteBansModule_378.BaseCoreGenericHandler.BaseCoreGenericHandler(collection.toArray(new Object[0]), ", ");
            flag = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_04, (CharSequence)object, null, 4, null);
        }
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_197 f32, LiteBansModule_82 ch2) {
        if (ch2.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            ServerSyncService u2 = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
            Object object = f32;
            boolean flag = false;
            String string = ((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().AsyncBackgroundTask_5();
            object = String.valueOf(System.nanoTime() % (long)1000);
            CopyOnWriteArrayList<LiteBansModule_15> copyOnWriteArrayList = new CopyOnWriteArrayList<LiteBansModule_15>();
            copyOnWriteArrayList.add(ch2.AsyncBackgroundTask_5().LiteBansModule_401());
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f32, (CharSequence)(LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "Table prefix of this instance: \"") + BlackHandler.m + string + BlackHandler.i + '\"'));
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f32, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "Checking for other servers connected to the database, please wait.. + "));
            LiteBansModule_349 jn2 = new LiteBansModule_349((String)object, copyOnWriteArrayList);
            u2.BaseCoreGenericHandler(jn2);
            ServerSyncService.BaseCoreGenericHandler(u2, BroadcastHandler.e, ch2, (CharSequence)object, 0, 8, null);
            CommandSenderWrapper sender = f32.AsyncBackgroundTask_5();
            MessageHandler messageHandler = f32;
            boolean flag2 = false;
            long l3 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_18();
            messageHandler = f32;
            flag2 = false;
            ch2.e().BaseCoreGenericHandler(() -> LiteBansModule_197.BaseCoreGenericHandler(u2, jn2, copyOnWriteArrayList, sender), l3 * (long)(((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_12() + 1));
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"There are no other servers connected to this ", StringDecryptor.BaseCoreGenericHandler("\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13", 0x3DD3AA33), " servers connected to this database: ", ", ", "Table prefix of this instance: \"", "Checking for other servers connected to the database, please wait..."};
    }

    }

