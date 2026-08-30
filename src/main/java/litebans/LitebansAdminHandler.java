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
        Object object;
        if (this.LiteBansModule_194) {
            object = new String[]{"litebans.admin", "litebans.allow"};
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (String[])object);
        }
        object = MessageHandler.BaseCoreGenericHandler;
        boolean flag = this.e.length < 2;
        CharSequence charSequence = MessageKey.flag;
        String[] args = object;
        if (flag) {
            String[] filteredArgs = args;
            filteredArgs.BaseCoreGenericHandler(charSequence);
            throw new CommandExitException();
        }
        object = this;
        flag = false;
        ((DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LitebansAdminHandler.BaseCoreGenericHandler(this, arg_0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final KotlinUnitHandler BaseCoreGenericHandler(LitebansAdminHandler f72, LiteBansModule_82 ch2) {
        boolean flag;
        Object object;
{
            boolean flag2;
            Object object2;
            Object object3;
{
                Object object4;
                Object object5 = MessageHandler.BaseCoreGenericHandler;
                boolean flag3 = ch2.LiteBansModule_31();
                Object object6 = MessageKey.ServerEventListener;
                ChatFormatter chatFormatter = object5;
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
                object5 = string;
                Object object7 = MessageHandler.BaseCoreGenericHandler;
                object6 = object5;
                flag4 = false;
                byte by2 = HexEncodingHelper.BaseCoreGenericHandler.i((String)object6);
                object = MessageKey.flag;
                ChatFormatter fo_04 = object7;
                if (by2 != 0) {
                    ChatFormatter fo_05 = fo_04;
                    fo_05.BaseCoreGenericHandler(object);
                    throw new CommandExitException();
                }
                object7 = ch2.c((String)object5);
                by2 = HexEncodingHelper.BaseCoreGenericHandler.Utf8Handler_2((String)object5).AsyncBackgroundTask_5();
                Object object8 = object7;
                if ((object8 != null ? ((LiteBansModule_297)object8).LiteBansModule_31() : null) != null) {
                    object4 = object7;
                } else if (by2 == 1) {
                    object4 = new LiteBansModule_297((String)object5, (String)object5, null, null, 12, null);
                } else {
                    Object object9 = f72;
                    if (((ConfigService)((MessageHandler)object9).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().af()) {
                        object9 = LiteBansModule_50.c.LiteBansModule_31((String)object5);
                        bl10 = false;
                        UUID uUID = ((LiteBansModule_89)object9).BaseCoreGenericHandler();
                        object4 = AllHandler_3.BaseCoreGenericHandler(ch2, new LiteBansModule_297(((LiteBansModule_89)object9).AsyncBackgroundTask_5(), uUID != null ? uUID.toString() : null, null, new Date()), false, 2, null);
                    } else if (by2 == 0) {
                        object4 = AllHandler_3.BaseCoreGenericHandler(ch2, new LiteBansModule_297((String)object5, LiteBansModule_242.BaseCoreGenericHandler((String)object5), null, null, 12, null), false, 2, null);
                    } else {
                        MessageHandler.BaseCoreGenericHandler.BaseCoreGenericHandler(MessageKey.aN);
                        throw new CommandExitException();
}
                object = object4;
                object3 = MessageHandler.BaseCoreGenericHandler;
                flag = ((LiteBansModule_297)object).LiteBansModule_31() == null;
                CharSequence charSequence = MessageKey.aN;
                object2 = object3;
                flag2 = false;
                if (flag) {
                    ChatFormatter fo_06 = object2;
                    fo_06.BaseCoreGenericHandler(charSequence);
                    throw new CommandExitException();
                }
                String string2 = ((LiteBansModule_297)object).LiteBansModule_31();
                ObjectUtilities.BaseCoreGenericHandler((Object)string2);
                object3 = UUID.fromString(string2);
                ObjectUtilities.BaseCoreGenericHandler(object3);
                flag = AllHandler_3.BaseCoreGenericHandler(ch2, (UUID)object3, null, 2, null);
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
                object2 = AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_75, (LiteBansModule_297)object, false, 2, null);
                flag2 = false;
                ChatFormatter fo_08 = fo_07;
                if (flag) {
                    ChatFormatter fo_09 = fo_08;
                    fo_09.BaseCoreGenericHandler(object2);
                    throw new CommandExitException();
                }
                AllHandler_3.BaseCoreGenericHandler(ch2, (UUID)object3, 0, 2, null);
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f72, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.ElementHandler, (LiteBansModule_297)object, false, 2, null));
                return KotlinUnitHandler.BaseCoreGenericHandler;
            }
            ChatFormatter fo_010 = MessageHandler.BaseCoreGenericHandler;
            object2 = AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.ExceptionHandler, (LiteBansModule_297)object, false, 2, null);
            flag2 = false;
            ChatFormatter fo_011 = fo_010;
            boolean bl15 = !flag;
            if (bl15) {
                ChatFormatter fo_012 = fo_011;
                fo_012.BaseCoreGenericHandler(object2);
                throw new CommandExitException();
            }
            ch2.BaseCoreGenericHandler((UUID)object3);
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)f72, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)MessageKey.LiteBansModule_73, (LiteBansModule_297)object, false, 2, null));
            return KotlinUnitHandler.BaseCoreGenericHandler;
        }
        MessageKey am2 = MessageKey.c("ALLOW_CHECK_" + flag);
        MessageHandler messageHandler = f72;
        ObjectUtilities.BaseCoreGenericHandler(am2);
        CommandArgumentUtils.BaseCoreGenericHandler(messageHandler, AllHandler_3.BaseCoreGenericHandler(ch2, (CharSequence)am2, (LiteBansModule_297)object, false, 2, null));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"litebans.admin", "litebans.allow", "add", "check", "remove", "ALLOW_CHECK_"};
}

