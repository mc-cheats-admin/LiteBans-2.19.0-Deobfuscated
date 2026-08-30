package litebans;

import java.util.ArrayList;
import java.util.List;
public final class ServerscopeHandler
implements LiteBansModule_178 {
    final /* synthetic */ LitebansLockdownBypassHandler BaseCoreGenericHandler;
    final /* synthetic */ CommandSenderWrapper c;
    public ServerscopeHandler(LitebansLockdownBypassHandler gG2, CommandSenderWrapper sender) {
        this.plugin = gG2;
        this.c = sender;
    }

    public final void BaseCoreGenericHandler(LiteBansModule_82 ch2) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (this.plugin.c() != null) {
            targetObj = new CharSequence[]{"serverScope", this.plugin.BaseCoreGenericHandler(), "reason", this.plugin.c()};
            charSequence = LiteBansModule_242.BaseCoreGenericHandler(MessageKey.bV, (CharSequence[])targetObj);
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
            CommandSenderWrapper sender = (CommandSenderWrapper)(charSequence3);
            String string = sender.LiteBansModule_240();
            if (string == null) {
                MessageHandler messageHandler = gG2;
                MessageHandler fg_03 = messageHandler;
                string = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25();
            }
            if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(string, gG2.BaseCoreGenericHandler())) continue;
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
        if (((ConfigService)((MessageHandler)helperObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_14()) {
            if (ch2.e().AsyncBackgroundTask_22() == 3) {
                ch2.e().getLogger().info((charSequence2).toString());
            } else {
                targetObj = ch2.e().HoverTextFormatter();
                CharSequence charSequence5 = charSequence2;
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)targetObj, charSequence5, null, 4, null);
}

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        this.plugintargetObj;
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

