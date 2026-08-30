package litebans;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.chat.ChatVersion;
import net.md_5.bungee.chat.VersionedComponentSerializer;

public class LiteBansModule_281 {
    public static BaseComponent[] BaseCoreGenericHandler(CharSequence charSequence, ChatVersion chatVersion) {
        return VersionedComponentSerializer.forVersion((ChatVersion)chatVersion).parse(charSequence.toString());
    }
}

