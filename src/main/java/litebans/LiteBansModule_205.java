package litebans;

import java.util.Iterator;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_205
extends MessageHandler {
    private final String[] AsyncBackgroundTask_5;
        public LiteBansModule_205(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.AsyncBackgroundTask_5 = args;
    }

    @Override
    public void run() {
        Object targetObj = MessageHandler.BaseCoreGenericHandler;
        boolean flag = this.AsyncBackgroundTask_5.length < 2;
        CharSequence charSequence = BlackHandler.LiteBansModule_195("$command add-login <name> <UUID> <IP>");
        ChatFormatter chatFormatter = targetObj;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            fo_03.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        targetObj = this;
        flag = false;
        ((DatabaseMonitorService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_205.BaseCoreGenericHandler(this, arg_0));
    }

    private final void LiteBansModule_31() {
        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, this.AsyncBackgroundTask_5(), BlackHandler.c("Login record(AsyncBackgroundTask_21) "), null, 4, null);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_205 fL2, LiteBansModule_83 ch2) {
        Iterator iterator = MessageHandler.BaseCoreGenericHandler;
        boolean flag = ch2.LiteBansModule_31();
        Object targetObj = MessageKey.ServerEventListener;
        ChatFormatter chatFormatter = iterator;
        if (flag) {
            ChatFormatter fo_03 = chatFormatter;
            fo_03.BaseCoreGenericHandler(targetObj);
            throw new CommandExitException();
        }
        if (fL2.AsyncBackgroundTask_5.length == 2) {
            Object contextObj = new char[]{','};
            iterator = StringUtilities.BaseCoreGenericHandler((CharSequence)fL2.AsyncBackgroundTask_5[1], contextObj, false, 0, 6, null).iterator();
            while (iterator.hasNext()) {
                contextObj = (String)iterator.next();
                Object resultObj = LiteBansModule_50.c.BaseCoreGenericHandler((String)contextObj);
                if (resultObj == null || (resultObj = ((LiteBansModule_90)resultObj).BaseCoreGenericHandler()) == null || (resultObj = ((UUID)resultObj).toString()) == null) continue;
                targetObj = resultObj;
                ch2.BaseCoreGenericHandler((String)contextObj, (String)targetObj, (String)null, false, true);
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

    static {
        LiteBansModule_205.BaseCoreGenericHandler();
    }
}

