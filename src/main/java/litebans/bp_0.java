package litebans;

import litebans.hb_0;
import litebans.hl;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;

public class bp_0 {
    private static boolean b;
    private static /* synthetic */ String[] a;

    public static boolean b() {
        return b;
    }

    public static BaseComponent[] a(CharSequence charSequence) {
        return TextComponent.fromLegacyText((String)charSequence.toString());
    }

    public static BaseComponent[] b(CharSequence charSequence) {
        return ComponentSerializer.parse((String)charSequence.toString());
    }

    static {
        bp_0.a();
        b = hb_0.a("net.md_5.bungee.chat.ChatVersion");
    }

    private static final void a() {
        a = new String[]{"net.md_5.bungee.chat.ChatVersion"};
    }
}

