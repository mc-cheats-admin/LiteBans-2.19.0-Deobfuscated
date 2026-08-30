package litebans;

import litebans.hb_0;
import litebans.hl;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;

/*
 * Renamed from litebans.bp
 */
public static class bp_0 {
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
        b = hb_0.a(a[0]);
    }

    private static final void a() {
        a = new String[]{hl.a("\u5d2d\u5d26\u5d37\u5d6d\u5d2e\u5d27\u5d1c\u5d76\u5d6d\u5d21\u5d36\u5d2d\u5d24\u5d26\u5d26\u5d6d\u5d20\u5d2b\u5d22\u5d37\u5d6d\u5d00\u5d2b\u5d22\u5d37\u5d15\u5d26\u5d31\u5d30\u5d2a\u5d2c\u5d2d", -1345823421)};
    }
}

