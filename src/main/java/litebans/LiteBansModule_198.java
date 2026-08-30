package litebans;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_198
extends MessageHandler {
        public LiteBansModule_198(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void run() {
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_198.BaseCoreGenericHandler(this, arg_0));
    }

    private static final void BaseCoreGenericHandler(ServerSyncService u2, LiteBansModule_351 jn2, CopyOnWriteArrayList copyOnWriteArrayList, CommandSenderWrapper sender) {
        u2.LiteBansModule_31(jn2);
        int n = copyOnWriteArrayList.size();
        if (n <= 1) {
            CommandSenderWrapper senderWrapper = sender;
            CharSequence charSequence = LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.i, "There are no other servers connected to this ");
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, senderWrapper, charSequence, null, 4, null);
        } else {
            CommandSenderWrapper senderWrapper = sender;
            Object targetObj = copyOnWriteArrayList;
            Collection collection = targetObj;
            targetObj = LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.i, "\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13") + BlackHandler.m + n + BlackHandler.i + " servers connected to this database: " + LiteBansModule_380.BaseCoreGenericHandler.BaseCoreGenericHandler(collection.toArray(new Object[0]), ", ");
            flag = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, senderWrapper, (CharSequence)targetObj, null, 4, null);
        }
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_198 f32, LiteBansModule_83 ch2) {
        if (ch2.AsyncBackgroundTask_5().AsyncBackgroundTask_21()) {
            ServerSyncService u2 = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
            Object targetObj = f32;
            String string = ((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().AsyncBackgroundTask_5();
            targetObj = String.valueOf(System.nanoTime() % (long)1000);
            CopyOnWriteArrayList<LiteBansModule_15> copyOnWriteArrayList = new CopyOnWriteArrayList<LiteBansModule_15>();
            copyOnWriteArrayList.add(ch2.AsyncBackgroundTask_5().LiteBansModule_403());
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f32, (CharSequence)(LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.i, "Table prefix of this instance: \"") + BlackHandler.m + string + BlackHandler.i + '\"'));
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f32, (CharSequence)LiteBansModule_243.BaseCoreGenericHandler(BlackHandler.i, "Checking for other servers connected to the database, please wait.. + "));
            LiteBansModule_351 jn2 = new LiteBansModule_351((String)targetObj, copyOnWriteArrayList);
            u2.BaseCoreGenericHandler(jn2);
            ServerSyncService.BaseCoreGenericHandler(u2, BroadcastHandler.e, ch2, (CharSequence)targetObj, 0, 8, null);
            CommandSenderWrapper sender = f32.AsyncBackgroundTask_5();
            MessageHandler messageHandler = f32;
            long l3 = ((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_18();
            messageHandler = f32;
            flag2 = false;
            ch2.e().BaseCoreGenericHandler(() -> LiteBansModule_198.BaseCoreGenericHandler(u2, jn2, copyOnWriteArrayList, sender), l3 * (long)(((ConfigService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_12() + 1));
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"There are no other servers connected to this ", StringDecryptor.BaseCoreGenericHandler("\uaa67\uaa5b\uaa56\uaa41\uaa56\uaa13\uaa52\uaa41\uaa56\uaa13", 0x3DD3AA33), " servers connected to this database: ", ", ", "Table prefix of this instance: \"", "Checking for other servers connected to the database, please wait..."};
    }

    static {
        LiteBansModule_198.BaseCoreGenericHandler();
    }
}

