package litebans;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.chat.ChatVersion;
import net.md_5.bungee.chat.VersionedComponentSerializer;

/*
 * Renamed from litebans.hW
 */
public static class hw_0 {
    public static BaseComponent[] a(CharSequence charSequence, ChatVersion chatVersion) {
        return VersionedComponentSerializer.forVersion((ChatVersion)chatVersion).parse(charSequence.toString());
    }
}

