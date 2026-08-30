package litebans;

import java.util.ArrayList;
import java.util.List;
public final class ServerscopeHandler
implements LiteBansModule_179 {
    final /* synthetic */ LitebansLockdownBypassHandler BaseCoreGenericHandler;
    final /* synthetic */ CommandSenderWrapper c;
        public ServerscopeHandler(LitebansLockdownBypassHandler gG2, CommandSenderWrapper sender) {
        this.plugin = gG2;
        this.c = sender;
    }

    public final void BaseCoreGenericHandler(LiteBansModule_83 ch2) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (this.plugin.c() != null) {
            targetObj = new CharSequence[]{"serverScope", this.plugin.BaseCoreGenericHandler(), "reason", this.plugin.c()};
            charSequence = LiteBansModule_243.BaseCoreGenericHandler((CharSequence)MessageKey.bV, (CharSequence[])targetObj);
        } else {
            charSequence = MessageKey.X;
        }
        charSequence2 = charSequence;
        targetObj = this.c;
        ObjectUtilities.BaseCoreGenericHandler(targetObj);
        charSequence2 = ch2.LiteBansModule_31(charSequence2, (CommandSenderWrapper)targetObj);
        targetObj = ch2.e().q();
        LitebansLockdownBypassHandler gG2 = this.plugin;
        CharSequence[] contextObj = targetObj;
        Object resultObj = new ArrayList();
        for (CharSequence charSequence3 : contextObj) {
            CommandSenderWrapper sender = (CommandSenderWrapper)((Object)charSequence3);
            String string = sender.LiteBansModule_241();
            if (string == null) {
                MessageHandler messageHandler = gG2;
                MessageHandler fg_03 = messageHandler;
                string = ((ConfigService)fg_03.LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25();
            }
            if (!LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(string, gG2.BaseCoreGenericHandler())) continue;
            resultObj.add(charSequence3);
        }
        targetObj = (List)resultObj;
        Object helperObj = targetObj.iterator();
        while (helperObj.hasNext()) {
            Object t2 = helperObj.next();
            resultObj = (CommandSenderWrapper)t2;
            flag2 = false;
            ObjectUtilities.BaseCoreGenericHandler(resultObj);
            Object tempObj = resultObj;
            CharSequence charSequence4 = charSequence2;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)tempObj, charSequence4, null, 4, null);
        }
        targetObj = this.plugin;
        flag6 = false;
        helperObj = targetObj;
        if (((ConfigService)((MessageHandler)helperObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_14()) {
            if (ch2.e().AsyncBackgroundTask_22() == 3) {
                ch2.e().getLogger().info(((Object)charSequence2).toString());
            } else {
                targetObj = ch2.e().HoverTextFormatter();
                CharSequence charSequence5 = charSequence2;
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)targetObj, charSequence5, null, 4, null);
            }
        }
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        this.plugin((LiteBansModule_83)targetObj);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"serverScope", "reason"};
    }

    static {
        ServerscopeHandler.BaseCoreGenericHandler();
    }
}

