package litebans;

import litebans.ec_0;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.iL
 */
public static final class il_0 {
    private static /* synthetic */ String[] a;

    public static /* synthetic */ void a(ec_0 ec_02, Object object, CharSequence charSequence, String string, boolean bl, String string2, int n, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException(a[0]);
        }
        if ((n & 2) != 0) {
            charSequence = a[1];
        }
        if ((n & 4) != 0) {
            string = a[2];
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            string2 = a[3];
        }
        ec_02.a(object, charSequence, string, bl, string2);
    }

    public static boolean a(@NotNull ec_0 ec_02, @NotNull String string) {
        return ec_02.c(string) != null;
    }

    private static final void a() {
        a = new String[]{hl.a("", -1131692255), hl.a("", -396160962), hl.a("\u8f9a\u8fa4\u8fb7\u8fa4\u8faf\u8fb5\u8fe1\u8fa2\u8fa0\u8faf\u8fa2\u8fa4\u8fad\u8fad\u8fa4\u8fa5\u8f9c", 357208001), hl.a("\u896c\u896e\u8964\u896c\u8978\u8965\u8966\u8969\u8969\u8962\u8963", 1782221095)};
    }

    static {
        il_0.a();
    }
}

