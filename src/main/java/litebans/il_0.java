package litebans;

import litebans.ec_0;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class il_0 {
    private static /* synthetic */ String[] a;

    public static /* synthetic */ void a(ec_0 ec_02, Object object, CharSequence charSequence, String string, boolean bl, String string2, int n, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            charSequence = "";
        }
        if ((n & 4) != 0) {
            string = "[event cancelled]";
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            string2 = "KICK_BANNED";
        }
        ec_02.a(object, charSequence, string, bl, string2);
    }

    public static boolean a(@NotNull ec_0 ec_02, @NotNull String string) {
        return ec_02.c(string) != null;
    }

    private static final void a() {
        a = new String[]{"", "", "[event cancelled]", "KICK_BANNED"};
    }

    static {
        il_0.a();
    }
}

