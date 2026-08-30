package litebans;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;

public class LiteBansModule_57 {
    private static boolean LiteBansModule_31;
        public static boolean LiteBansModule_31() {
        return LiteBansModule_31;
    }

    public static BaseComponent[] BaseCoreGenericHandler(CharSequence charSequence) {
        return TextComponent.fromLegacyText((String)charSequence.toString());
    }

    public static BaseComponent[] LiteBansModule_31(CharSequence charSequence) {
        return ComponentSerializer.parse((String)charSequence.toString());
    }

    static {
        LiteBansModule_57.BaseCoreGenericHandler();
        LiteBansModule_31 = StackTraceAnalyzer.BaseCoreGenericHandler("net.md_5.bungee.chat.ChatVersion");
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"net.md_5.bungee.chat.ChatVersion"};
    }
}

