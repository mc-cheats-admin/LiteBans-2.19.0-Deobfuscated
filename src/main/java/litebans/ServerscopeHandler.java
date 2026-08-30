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
        Object object;
        CharSequence charSequence2 = null;
        if (this.plugin.c() != null) {
            object = new CharSequence[]{"serverScope", this.plugin.BaseCoreGenericHandler(), "reason", this.plugin.c()};
            charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)MessageKey.bV, (CharSequence[])object);
        } else {
            charSequence = MessageKey.X;
        }
        charSequence2 = charSequence;
        object = this.c;
        ObjectUtilities.BaseCoreGenericHandler(object);
        charSequence2 = ch2.LiteBansModule_31(charSequence2, (CommandSenderWrapper)object);
        object = ch2.e().q();
        LitebansLockdownBypassHandler gG2 = this.plugin;
        boolean flag = false;
        CharSequence[] object2 = object;
        Object object3 = new ArrayList();
        boolean flag2 = false;
        for (CharSequence charSequence3 : object2) {
            CommandSenderWrapper sender = (CommandSenderWrapper)((Object)charSequence3);
            boolean flag3 = false;
            String string = sender.LiteBansModule_240();
            if (string == null) {
                MessageHandler messageHandler = gG2;
                boolean flag4 = false;
                MessageHandler fg_03 = messageHandler;
                boolean flag5 = false;
                string = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_25();
            }
            if (!LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(string, gG2.BaseCoreGenericHandler())) continue;
            object3.add(charSequence3);
        }
        object = (List)object3;
        boolean flag6 = false;
        Object object4 = object.iterator();
        while (object4.hasNext()) {
            Object t2 = object4.next();
            object3 = (CommandSenderWrapper)t2;
            flag2 = false;
            ObjectUtilities.BaseCoreGenericHandler(object3);
            Object object5 = object3;
            CharSequence charSequence4 = charSequence2;
            boolean flag7 = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)object5, charSequence4, null, 4, null);
        }
        object = this.plugin;
        flag6 = false;
        object4 = object;
        boolean flag8 = false;
        if (((ConfigService)((MessageHandler)object4).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().LiteBansModule_14()) {
            if (ch2.e().AsyncBackgroundTask_22() == 3) {
                ch2.e().getLogger().info(((Object)charSequence2).toString());
            } else {
                object = ch2.e().HoverTextFormatter();
                CharSequence charSequence5 = charSequence2;
                boolean bl9 = false;
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)object, charSequence5, null, 4, null);
            }
        }
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        this.plugin((LiteBansModule_82)object);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    }

