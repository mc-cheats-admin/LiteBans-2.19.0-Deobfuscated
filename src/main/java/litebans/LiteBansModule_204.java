package litebans;

import java.util.Iterator;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_204
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
    public LiteBansModule_204(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        Object object = MessageHandler.BaseCoreGenericHandler;
        boolean flag = this.AsyncBackgroundTask_5.length < 2;
        CharSequence charSequence = BlackHandler.LiteBansModule_194("$command add-login <name> <UUID> <IP>");
        ChatFormatter chatFormatter = object;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            fo_03.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        object = this;
        flag = false;
        ((DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_204.BaseCoreGenericHandler(this, arg_0));
    }

    private final void LiteBansModule_31() {
        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.AsyncBackgroundTask_5(), BlackHandler.c("Login record(AsyncBackgroundTask_21) "), null, 4, null);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_204 fL2, LiteBansModule_82 ch2) {
        Iterator iterator = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        Object object = MessageKey.ServerEventListener;
        ChatFormatter chatFormatter = iterator;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            fo_03.BaseCoreGenericHandler(object);
            throw new CommandExitException();
        }
        if (fL2.AsyncBackgroundTask_5.length == 2) {
            Object object2 = new char[]{','};
            iterator = StringUtilities.BaseCoreGenericHandler((CharSequence)fL2.AsyncBackgroundTask_5[1], object2, false, 0, 6, null).iterator();
            while (iterator.hasNext()) {
                object2 = (String)iterator.next();
                Object object3 = LiteBansModule_50.c.BaseCoreGenericHandler((String)object2);
                if (object3 == null || (object3 = ((LiteBansModule_89)object3).BaseCoreGenericHandler()) == null || (object3 = ((UUID)object3).toString()) == null) continue;
                object = object3;
                ch2.BaseCoreGenericHandler((String)object2, (String)object, (String)null, false, true);
            }
            fL2.LiteBansModule_31();
            return KotlinUnitHandler.BaseCoreGenericHandler;
        }
        iterator = null;
        if (fL2.AsyncBackgroundTask_5.length >= 4) {
            iterator = fL2.AsyncBackgroundTask_5[3];
        }
        ch2.BaseCoreGenericHandler(fL2.AsyncBackgroundTask_5[1], fL2.AsyncBackgroundTask_5[2], (String)((Object)iterator), false, true);
        fL2.LiteBansModule_31();
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"$command add-login <name> <UUID> <IP>", "Login record(AsyncBackgroundTask_21) added."};
}

