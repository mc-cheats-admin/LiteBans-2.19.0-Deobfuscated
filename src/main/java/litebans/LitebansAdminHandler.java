package litebans;

import java.util.Date;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LitebansAdminHandler
extends MessageHandler {
    private final String[] e;
    private final boolean LiteBansModule_194;
    public LitebansAdminHandler(@NotNull String[] args, @NotNull PlatformPlugin plugin, boolean flag) {
        super(plugin);
        this.e = args;
        this.LiteBansModule_194 = flag;
    }

    @Override
    public void run() {
        if (this.LiteBansModule_194) {
            targetObj = new String[]{"litebans.admin", "litebans.allow"};
            CommandArgumentUtils.BaseCoreGenericHandler(this, (String[])targetObj);
        }
        targetObj = MessageHandler.BaseCoreGenericHandler;
        boolean flag = this.e.length < 2;
        CharSequence charSequence = MessageKey.flag;
        String[] args = targetObj;
        if (flag) {
            String[] filteredArgs = args;
            filteredArgs.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        targetObj = this;
        flag = false;
        ((DatabaseMonitorService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler.BaseCoreGenericHandler(this, arg_0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final KotlinUnitHandler BaseCoreGenericHandler(LitebansAdminHandler f72, LiteBansModule_82 ch2) {
        boolean flag;
{
            boolean flag2;
{
                Object tempObj = MessageHandler.BaseCoreGenericHandler;
                boolean flag3 = ch2.LiteBansModule_31();
                Object object6 = MessageKey.ServerEventListener;
                ChatFormatter chatFormatter = tempObj;
                if (flag3) {
                    ChatFormatter fo_03 = chatFormatter;
                    fo_03.BaseCoreGenericHandler(object6);
                    throw new CommandExitException();
                }
                String string = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])f72.e, 2);
                if (string == null) {
                    MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.flag);
                    throw new CommandExitException();
                }
                tempObj = string;
                Object object7 = MessageHandler.BaseCoreGenericHandler;
                object6 = tempObj;
                flag4 = false;
                byte by2 = HexEncodingHelper.BaseCoreGenericHandler.i((String)object6);
                targetObj = MessageKey.flag;
                ChatFormatter fo_04 = object7;
                if (by2 != 0) {
                    ChatFormatter fo_05 = fo_04;
                    fo_05.BaseCoreGenericHandler(targetObj);
                    throw new CommandExitException();
                }
                object7 = ch2.c((String)tempObj);
                by2 = HexEncodingHelper.BaseCoreGenericHandler.Utf8Handler_2((String)tempObj).AsyncBackgroundTask_5();
                Object object8 = object7;
                if ((object8 != null ? ((LiteBansModule_297)object8).LiteBansModule_31() : null) != null) {
                    helperObj = object7;
                } else if (by2 == 1) {
                    helperObj = new LiteBansModule_297((String)tempObj, (String)tempObj, null, null, 12, null);
                } else {
                    Object object9 = f72;
                    if (((ConfigService)((MessageHandler)object9).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af()) {
                        object9 = LiteBansModule_50.c.LiteBansModule_31((String)tempObj);
                        bl10 = false;
                        UUID uUID = ((LiteBansModule_89)object9).BaseCoreGenericHandler();
                        helperObj = AllHandler_3.BaseCoreGenericHandler(ch2, new LiteBansModule_297(((LiteBansModule_89)object9).AsyncBackgroundTask_5(), uUID != null ? uUID.toString() : null, null, new Date()), false, 2, null);
                    } else if (by2 == 0) {
                        helperObj = AllHandler_3.BaseCoreGenericHandler(ch2, new LiteBansModule_297((String)tempObj, LiteBansModule_242.BaseCoreGenericHandler((String)tempObj), null, null, 12, null), false, 2, null);
                    } else {
                        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.aN);
                        throw new CommandExitException();
}
                targetObj = helperObj;
                resultObj = MessageHandler.BaseCoreGenericHandler;
                flag = targetObj.LiteBansModule_31() == null;
                CharSequence charSequence = MessageKey.aN;
                contextObj = resultObj;
                flag2 = false;
                if (flag) {
                    ChatFormatter fo_06 = contextObj;
                    fo_06.BaseCoreGenericHandler(charSequence);
                    throw new CommandExitException();
                }
                String string2 = targetObj.LiteBansModule_31();
                ObjectUtilities.BaseCoreGenericHandler(string2);
                resultObj = UUID.fromString(string2);
                ObjectUtilities.BaseCoreGenericHandler(resultObj);
                flag = AllHandler_3.BaseCoreGenericHandler(ch2, (UUID)resultObj, null, 2, null);
                charSequence = f72.e[1];
                switch (((String)charSequence).hashCode()) {
                    case 96417: {
                        if (((String)charSequence).equals("add")) break;
                        return KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    case 94627080: {
                        if (!((String)charSequence).equals("check")) {
                            return KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        break;
                    }
                    case -934610812: {
                        if (!((String)charSequence).equals("remove")) {
                            return KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        break;
}
                ChatFormatter fo_07 = MessageHandler.BaseCoreGenericHandler;
                contextObj = AllHandler_3.BaseCoreGenericHandler(ch2, MessageKey.LiteBansModule_75, (LiteBansModule_297)targetObj, false, 2, null);
                flag2 = false;
                ChatFormatter fo_08 = fo_07;
                if (flag) {
                    ChatFormatter fo_09 = fo_08;
                    fo_09.BaseCoreGenericHandler(contextObj);
                    throw new CommandExitException();
                }
                AllHandler_3.BaseCoreGenericHandler(ch2, (UUID)resultObj, 0, 2, null);
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f72, AllHandler_3.BaseCoreGenericHandler(ch2, MessageKey.ElementHandler, (LiteBansModule_297)targetObj, false, 2, null));
                return KotlinUnitHandler.BaseCoreGenericHandler;
            }
            ChatFormatter fo_010 = MessageHandler.BaseCoreGenericHandler;
            contextObj = AllHandler_3.BaseCoreGenericHandler(ch2, MessageKey.ExceptionHandler, (LiteBansModule_297)targetObj, false, 2, null);
            flag2 = false;
            ChatFormatter fo_011 = fo_010;
            boolean bl15 = !flag;
            if (bl15) {
                ChatFormatter fo_012 = fo_011;
                fo_012.BaseCoreGenericHandler(contextObj);
                throw new CommandExitException();
            }
            ch2.BaseCoreGenericHandlerthis;
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f72, AllHandler_3.BaseCoreGenericHandler(ch2, MessageKey.LiteBansModule_73, (LiteBansModule_297)targetObj, false, 2, null));
            return KotlinUnitHandler.BaseCoreGenericHandler;
        }
        MessageKey am2 = MessageKey.c("ALLOW_CHECK_" + flag);
        MessageHandler messageHandler = f72;
        ObjectUtilities.BaseCoreGenericHandler(am2);
        CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, AllHandler_3.BaseCoreGenericHandler(ch2, am2, (LiteBansModule_297)targetObj, false, 2, null));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"litebans.admin", "litebans.allow", "add", "check", "remove", "ALLOW_CHECK_"};
}

